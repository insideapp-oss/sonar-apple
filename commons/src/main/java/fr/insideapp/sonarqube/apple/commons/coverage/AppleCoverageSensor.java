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

import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import org.json.JSONObject;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

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
        try {
            // extracting the coverage data
            AppleCoverageExtractor extractor = new AppleCoverageExtractor(context);
            JSONObject coverageJSON = extractor.extract(resultBundle());

            // parsing & reporting the coverage data
            AppleCoverageParser parser = new AppleCoverageParser(context);
            parser.collect(coverageJSON);

        } catch (Exception e) {
            LOGGER.error("Extracting & parsing the coverage data produced the following exception. This exception will be ignored. Exception:", e);
        }
    }

}
