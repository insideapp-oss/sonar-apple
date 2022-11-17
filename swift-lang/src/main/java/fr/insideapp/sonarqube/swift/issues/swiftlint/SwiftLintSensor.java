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
package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.swift.Swift;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;

public class SwiftLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(SwiftLintSensor.class);

    private final SwiftLintRunnable runner;

    public SwiftLintSensor(
            SwiftLintRunnable runner
    ) {
        this.runner = runner;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(Swift.KEY)
                .name("SwiftLint Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        List<String> outputs = executeRunner();
        if (outputs == null) { return; }
        // TODO: migrate this parser to a JSON with Jackson ones
        SwiftLintReportParser parser = new SwiftLintReportParser();
        List<ReportIssue> issues = outputs.stream().map(parser::parse).flatMap(List::stream).collect(Collectors.toList());
        LOGGER.info("Found {} SwiftLint issue(s)", issues.size());
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
        issueRecorder.recordIssues(issues, SwiftLintRulesDefinition.REPOSITORY_KEY, sensorContext);
    }

    @Nullable
    private List<String> executeRunner() {
        try {
            return runner.run();
        } catch (Exception e) {
            LOGGER.error("Running SwiftLint failed.");
            LOGGER.debug("{}", e);
            return null;
        }
    }

}
