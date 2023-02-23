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
package fr.insideapp.sonarqube.apple.xcode.tests.recorder;

import fr.insideapp.sonarqube.apple.xcode.tests.XcodeTestFileFindable;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestClassReport;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestGroup;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.CheckForNull;
import java.io.Serializable;
import java.util.List;

@ScannerSide
public final class XcodeTestsRecorder implements XcodeTestsRecordable {

    private final XcodeTestFileFindable finder;

    public XcodeTestsRecorder(final XcodeTestFileFindable finder) {
        this.finder = finder;
    }

    private static final Logger LOGGER = Loggers.get(XcodeTestsRecorder.class);

    @Override
    public void record(List<XcodeTestSummary> testSummaries, SensorContext context) {
        LOGGER.info("{} test report(s) to handle", testSummaries.size());
        testSummaries.forEach(testSummary -> {
            LOGGER.info("{} test group(s) to report", testSummary.groups.size());
            testSummary.groups.forEach(group -> {
                LOGGER.debug("Collecting data for {} ({})", group.name, group.bundle);
                InputFile resource = getUnitTestResource(group, context);
                if (resource != null) {
                    XcodeTestClassReport classReport = new XcodeTestClassReport(group);
                    save(classReport, resource, context);
                } else {
                    LOGGER.warn("Resource not found for bundle {} and class {}", group.bundle, group.name);
                    LOGGER.warn("Make sure the class {} is located inside {} folder (nesting allowed)", group.name, group.bundle);
                    LOGGER.warn("Make sure the bundle {} matches its folder name", group.bundle);
                    LOGGER.warn("Make sure the class {} matches its file name", group.name);
                }
            });
        });
    }

    @CheckForNull
    private InputFile getUnitTestResource(XcodeTestGroup group, SensorContext context) {
        return finder.getUnitTestResource(context.fileSystem(), group.bundle, group.name);
    }

    private void save(XcodeTestClassReport report, InputFile inputFile, SensorContext context) {
        int allTests = report.getCount(XcodeTestClassReport.Status.ALL);
        int skippedTests = report.getCount(XcodeTestClassReport.Status.SKIPPED);
        saveMeasure(context, inputFile, CoreMetrics.TESTS, allTests - skippedTests);
        saveMeasure(context, inputFile, CoreMetrics.SKIPPED_TESTS, skippedTests);
        saveMeasure(context, inputFile, CoreMetrics.TEST_FAILURES, report.getCount(XcodeTestClassReport.Status.FAILED));
        saveMeasure(context, inputFile, CoreMetrics.TEST_EXECUTION_TIME, report.getDuration());
    }

    private <T extends Serializable> void saveMeasure(SensorContext context, InputFile inputFile, Metric<T> metric, T value) {
        context.<T>newMeasure().forMetric(metric).on(inputFile).withValue(value).save();
    }

}
