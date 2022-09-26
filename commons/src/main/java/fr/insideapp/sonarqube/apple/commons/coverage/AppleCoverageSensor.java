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

import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.HashMap;
import java.util.Map;

public class AppleCoverageSensor implements Sensor {
    private static final Logger LOGGER = Loggers.get(AppleCoverageSensor.class);

    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;
    private static final int COMMAND_EXIT_CODE = 0;

    private static final String COMMAND = "xcrun";
    private static final String[] ARGS = new String[]{"xccov", "view", "--archive"};
    private static final String RESULT_BUNDLE_PATH_KEY = "sonar.apple.coverage.resultBundlePath";
    private static final String DEFAULT_RESULT_BUNDLE_PATH = "build/result.xcresult";
    private final SensorContext context;

    public AppleCoverageSensor(final SensorContext context) {
        this.context = context;
    }

    private String resultBundlePath() {
        return context.config()
                .get(RESULT_BUNDLE_PATH_KEY)
                .orElse(DEFAULT_RESULT_BUNDLE_PATH);
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

        String resultBundleLocation = resultBundlePath();

        try {

            // get the list of file with coverage data
            String coverageFileList = new ProcBuilder(COMMAND)
                    .withArgs(ARGS)
                    .withArgs("--file-list")
                    .withArgs(resultBundleLocation)
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                    .run()
                    .getOutputString();

                computeCoverageDataForFiles(coverageFileList);

        } catch (Exception e) {
            LOGGER.error("The coverage file listing produced the following exception. This exception will be ignored. Exception:", e);
        }
    }

    private void computeCoverageDataForFiles(String coverageFileList) {
        String resultBundleLocation = resultBundlePath();
        String[] coverageFiles = coverageFileList.split(System.getProperty("line.separator"));
        Map<String, String> coverageDataPerFile = new HashMap<>();

        // for each file with coverage data, we extract the coverage data
        for (String coverageFile : coverageFiles) {

            try {
                String coverageFileData = new ProcBuilder(COMMAND)
                        .withArgs(ARGS)
                        .withArgs("--file", coverageFile)
                        .withArgs(resultBundleLocation)
                        .withTimeoutMillis(COMMAND_TIMEOUT)
                        .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                        .run()
                        .getOutputString();
                coverageDataPerFile.put(coverageFile, coverageFileData);

            } catch (Exception e) {
                LOGGER.error("The coverage file '{}' produced the following exception. This exception will be ignored. Exception:", coverageFile, e);
            }
        }

        // parsing & reporting the coverage data
        XCCovReportParser parser = new XCCovReportParser(context);
        parser.collect(coverageDataPerFile);
    }
}
