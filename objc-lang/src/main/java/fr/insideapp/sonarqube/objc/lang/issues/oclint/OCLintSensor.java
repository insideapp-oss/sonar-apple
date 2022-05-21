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
package fr.insideapp.sonarqube.objc.lang.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.objc.lang.ObjectiveC;
import org.apache.commons.io.IOUtils;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class OCLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(OCLintSensor.class);

    private static final String XCPRETTY_COMMAND = "xcpretty";

    private static final String OCLINT_COMMAND = "oclint-json-compilation-database";

    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    private static final String DEFAULT_LOG_PATH = "build";

    public static final String LOG_PATH_KEY = "sonar.apple.xcodebuild.logPath";

    public static final String LOG_FILENAME = "xcodebuild.log";

    private final SensorContext context;

    public OCLintSensor(SensorContext context) {
        this.context = context;
    }

    protected String logPath() {
        return context.config()
                .get(LOG_PATH_KEY)
                .orElse(DEFAULT_LOG_PATH);
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.onlyOnLanguage(ObjectiveC.KEY).name("OCLint sensor").onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis();
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, OCLintRulesDefinition.REPOSITORY_KEY);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private List<ReportIssue> runAnalysis() throws IOException {

        // Look for xcodebuild.log file
        File xcodebuildLogFile = new File(logPath(), LOG_FILENAME);
        if (!xcodebuildLogFile.exists()) {
            LOGGER.error("Failed to locate xcodebuild.log file at {}", xcodebuildLogFile.getAbsolutePath());
            return new ArrayList<>();
        }

        File compileCommandsFile = null;
        try (InputStream is = new FileInputStream((xcodebuildLogFile))) {

            // Generate compile_commands.json
            compileCommandsFile = new File("compile_commands.json");
            String xcodebuildContent = IOUtils.toString(is, StandardCharsets.UTF_8);
            LOGGER.info("Running '{} -r json-compilation-database {}'...", XCPRETTY_COMMAND, compileCommandsFile.getAbsolutePath());
            ProcBuilder.filter(xcodebuildContent, XCPRETTY_COMMAND, "-r", "json-compilation-database", "-o", compileCommandsFile.getAbsolutePath());

            // Run OCLint
            LOGGER.info("Running '{} ./* -- -report-type json'...", OCLINT_COMMAND);
            String output = new ProcBuilder(OCLINT_COMMAND, "./*", "--", "-report-type", "json")
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .ignoreExitStatus()
                    .run()
                    .getOutputString();

            // Parse issues
            List<ReportIssue> issues = new OCLintReportParser().parse(output);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        } finally {
            if (compileCommandsFile != null && !compileCommandsFile.delete()) {
                LOGGER.error("Failed to delete {}", compileCommandsFile.getAbsolutePath());
            }
        }
    }
}
