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
package fr.insideapp.sonarqube.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.swift.lang.Swift;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SwiftLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(SwiftLintSensor.class);

    private static final String COMMAND = "swiftlint";
    private static final String SOURCES_PATH = "--path";

    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.onlyOnLanguage(Swift.KEY).name("SwiftLint sensor").onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis(sensorContext);
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, SwiftLintRulesDefinition.REPOSITORY_KEY);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private List<ReportIssue> runAnalysis(SensorContext sensorContext) throws IOException {

        // the list of issues
        List<ReportIssue> issues = new ArrayList<>();
        final SwiftLintReportParser reportParser = new SwiftLintReportParser();
        // get sources folder or else default to current folder
        final String sourcesInput = sensorContext.config().get("sonar.sources").orElse(".");
        String[] sources = sourcesInput.split(",");
        LOGGER.info("Running '{} analyze'...", COMMAND);

        for (String source : sources) {
            try {
                // run SwiftLint
                String output = new ProcBuilder(COMMAND,  SOURCES_PATH, source)
                        .withTimeoutMillis(COMMAND_TIMEOUT)
                        .ignoreExitStatus()
                        .run()
                        .getOutputString();

                // Parse issues & save them
                issues.addAll(reportParser.parse(output));
            } catch (Exception e) {
                throw new IOException(e);
            }
        }

        LOGGER.info("Found issues: {}", issues.size());
        return issues;
    }

}
