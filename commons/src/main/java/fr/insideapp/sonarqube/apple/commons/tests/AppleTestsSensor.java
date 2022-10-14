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
package fr.insideapp.sonarqube.apple.commons.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageExtractor;
import fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageParser;
import fr.insideapp.sonarqube.apple.commons.result.AppleResultExtractor;
import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import fr.insideapp.sonarqube.apple.commons.result.models.TestsReference;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestPlanRunSummaries;
import fr.insideapp.sonarqube.apple.commons.tests.old.JUnitReportParser;
import org.json.JSONObject;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class AppleTestsSensor extends AppleResultSensor {

    private static final Logger LOGGER = Loggers.get(AppleTestsSensor.class);

    public AppleTestsSensor(final SensorContext context) {
        super(context);
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .name("Apple Tests")
                .onlyOnLanguages("swift", "objc")
                .onlyOnFileType(InputFile.Type.TEST);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        // Look for the Xcode result bundle file
        if (!resultBundle().exists()) {
            LOGGER.error("Failed to locate Xcode result bundle file.");
            LOGGER.error("Expected location according to the configuration is {}", resultBundle().getAbsolutePath());
            return;
        }

        try {
            // extracting the result record
            AppleResultExtractor extractor = new AppleResultExtractor();
            Record record = extractor.getInvocationRecord(resultBundle());

            // extracting the test summaries
            List<AppleTestSummary> testSummaries = record
                    .actions
                    .stream()
                    .filter(action -> action.result.testsRef != null) // remove null values
                    .map(action -> getTestPlanRunSummaries(extractor, action.result.testsRef))
                    .filter(testPlanRunSummaries -> testPlanRunSummaries != null) // remove null values
                    .flatMap(testPlanRunSummaries -> testPlanRunSummaries.summaries.stream())
                    .flatMap(testPlanRunSummary -> testPlanRunSummary.testableSummaries.stream())
                    .map(testableSummary -> new AppleTestSummary(testableSummary))
                    .collect(Collectors.toList());

            AppleTestsParser parser = new AppleTestsParser(context);
            parser.collect(testSummaries);

        } catch (Exception e) {
            LOGGER.error("Extracting & parsing the test data failed.");
            LOGGER.debug("{}", e);
        }
    }

    private ActionTestPlanRunSummaries getTestPlanRunSummaries(AppleResultExtractor extractor, TestsReference reference) {
        try {
            return extractor.getTestPlanRunSummaries(resultBundle(), reference);
        } catch (Exception e) {
            LOGGER.error("Could not retrieve the test plan summaries for ID: {}.", reference.id);
            LOGGER.debug("{}", e);
            return null;
        }
    }
}
