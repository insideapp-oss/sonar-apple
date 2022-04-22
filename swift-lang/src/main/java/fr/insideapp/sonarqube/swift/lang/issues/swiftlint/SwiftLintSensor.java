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

import fr.insideapp.sonaqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.lang.Swift;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.batch.sensor.issue.internal.DefaultIssueLocation;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SwiftLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(SwiftLintSensor.class);

    private static final String COMMAND = "swiftlint";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.onlyOnLanguage(Swift.KEY).name("SwiftLint sensor").onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis();
            recordIssues(sensorContext, issues);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private List<ReportIssue> runAnalysis() throws IOException {

        try {
            // Run SwiftLint
            LOGGER.info("Running '{} analyze'...", COMMAND);
            String output = new ProcBuilder(COMMAND)
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .ignoreExitStatus()
                    .run()
                    .getOutputString();

            // Parse issues
            List<ReportIssue> issues = new SwiftLintReportParser().parse(output);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private void recordIssues(SensorContext sensorContext, List<ReportIssue> issues) {
        // Record issues
        issues.forEach(i -> {
            File file = new File(i.getFilePath());
            FilePredicate fp = sensorContext.fileSystem().predicates().hasAbsolutePath(file.getAbsolutePath());
            if (!sensorContext.fileSystem().hasFiles(fp)) {
                LOGGER.warn("File not included in SonarQube {}", file.getAbsoluteFile());
            } else {
                InputFile inputFile = sensorContext.fileSystem().inputFile(fp);
                if (inputFile != null) {
                    NewIssueLocation nil = new DefaultIssueLocation().on(inputFile)
                            .at(inputFile.selectLine(i.getLineNumber())).message(i.getMessage());
                    sensorContext.newIssue().forRule(RuleKey.of("SwiftLint", i.getRuleId()))
                            .at(nil).save();
                }

            }
        });
    }
}
