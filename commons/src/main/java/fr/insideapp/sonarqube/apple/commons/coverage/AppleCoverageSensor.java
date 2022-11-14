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
package fr.insideapp.sonarqube.apple.commons.coverage;

import fr.insideapp.sonarqube.apple.commons.result.AppleResultExtractor;
import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverage;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AppleCoverageSensor extends AppleResultSensor {
    private static final Logger LOGGER = Loggers.get(AppleCoverageSensor.class);

    public AppleCoverageSensor(final SensorContext context) {
        super(context);
    }

    @Override
    public void describe(SensorDescriptor descriptor) {
        descriptor
                .name("Apple Coverage")
                .onlyOnLanguages("swift", "objc")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext context) {

        // Look for the Xcode result bundle file
        if (!resultBundle().exists()) {
            LOGGER.error("Failed to locate Xcode result bundle file.");
            LOGGER.error("Expected location according to the configuration is {}", resultBundle().getAbsolutePath());
            return;
        }

        try {

            // extracting the result record
            AppleResultExtractor resultExtractor = new AppleResultExtractor();
            Record invocationRecord = resultExtractor.getInvocationRecord(resultBundle());

            // getting the coverage archive references
            // it is possible to have several archive, from a merged .xcresult bundle of multiple test plans
            List<Reference> archiveReferences = invocationRecord
                    .actions
                    .stream()
                    .map(action -> action.result.coverage)
                    .filter(Objects::nonNull) // remove null values
                    .map(coverage -> coverage.archiveReference)
                    .filter(Objects::nonNull) // remove null values
                    .collect(Collectors.toList());

            LOGGER.info("Found {} coverage archive reference(s)", archiveReferences.size());

            // retrieve the coverage from the result bundle for each references
            List<ActionCodeCoverage> codeCoverages = resultExtractor.getCoverage(resultBundle(), archiveReferences);

            // parsing & reporting the coverage data
            AppleCoverageParser parser = new AppleCoverageParser(context);
            parser.collect(codeCoverages);

        } catch (Exception e) {
            LOGGER.error("Extracting & parsing the coverage data produced the following exception. This exception will be ignored. Exception:", e);
        }
    }

}
