/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonarqube.apple.commons.tests.old;

import fr.insideapp.sonarqube.apple.commons.FileCollector;
import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinders;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.CheckForNull;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JUnitReportParser {

    private static final Logger LOGGER = Loggers.get(JUnitReportParser.class);

    private final SensorContext context;

    public JUnitReportParser(SensorContext context) {
        this.context = context;
    }

    public void collect(File reportsDir) {

        List<File> xmlFiles = new ArrayList<>();
        try {
            xmlFiles = FileCollector.collect(reportsDir, "*{junit}*.{xml}");
        } catch (IOException e) {
            LOGGER.error( "Error while finding test files.", e);
        }

        if (!xmlFiles.isEmpty()) {
            try {
                parseFiles(xmlFiles);
            } catch (IOException e) {
                LOGGER.error( "Error while parsing test files.", e);
            }
        }
    }

    private void parseFiles(List<File> reports) throws IOException {
        UnitTestIndex index = new UnitTestIndex();
        parseFiles(reports, index);
        save(index, context);
    }

    private static void parseFiles(List<File> reports, UnitTestIndex index) throws IOException {
        StaxParser parser = new StaxParser(index);
        for (File report : reports) {
            try {
                parser.parse(report);
            } catch (XMLStreamException e) {
                throw new IOException("Fail to parse Surefire report: " + report, e);
            }
        }
    }

    private Map<InputFile, UnitTestClassReport> mapToInputFile(Map<String, UnitTestClassReport> indexByClassname) {
        Map<InputFile, UnitTestClassReport> result = new HashMap<>();
        indexByClassname.forEach((className, index) -> {
            InputFile resource = getUnitTestResource(className);
            if (resource != null) {
                UnitTestClassReport report = result.computeIfAbsent(resource, r -> new UnitTestClassReport());
                // In case of repeated/parameterized tests (JUnit 5.x) we may end up with tests having the same name
                index.getResults().forEach(report::add);
            } else {
                LOGGER.debug("Resource not found: {}", className);
            }
        });
        return result;
    }

    private static void save(UnitTestClassReport report, InputFile inputFile, SensorContext context) {
        int testsCount = report.getTests() - report.getSkipped();
        saveMeasure(context, inputFile, CoreMetrics.SKIPPED_TESTS, report.getSkipped());
        saveMeasure(context, inputFile, CoreMetrics.TESTS, testsCount);
        saveMeasure(context, inputFile, CoreMetrics.TEST_ERRORS, report.getErrors());
        saveMeasure(context, inputFile, CoreMetrics.TEST_FAILURES, report.getFailures());
        saveMeasure(context, inputFile, CoreMetrics.TEST_EXECUTION_TIME, report.getDurationMilliseconds());
    }

    private void save(UnitTestIndex index, SensorContext context) {
        long negativeTimeTestNumber = 0;
        Map<InputFile, UnitTestClassReport> indexByInputFile = mapToInputFile(index.getIndexByClassname());
        for (Map.Entry<InputFile, UnitTestClassReport> entry : indexByInputFile.entrySet()) {
            UnitTestClassReport report = entry.getValue();
            if (report.getTests() > 0) {
                negativeTimeTestNumber += report.getNegativeTimeTestNumber();
                save(report, entry.getKey(), context);
            }
        }
        if (negativeTimeTestNumber > 0) {
            LOGGER.warn("There is {} test(s) reported with negative time by surefire, total duration may not be accurate.", negativeTimeTestNumber);
        }
    }

    @CheckForNull
    private InputFile getUnitTestResource(String className) {
        return TestFileFinders.getInstance().getUnitTestResource(context.fileSystem(), className);
    }

    private static <T extends Serializable> void saveMeasure(SensorContext context, InputFile inputFile, Metric<T> metric, T value) {
        context.<T>newMeasure().forMetric(metric).on(inputFile).withValue(value).save();
    }
}
