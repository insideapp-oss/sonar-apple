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
import fr.insideapp.sonarqube.swift.issues.swiftlint.mapper.SwiftLintReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import fr.insideapp.sonarqube.swift.issues.swiftlint.parser.SwiftLintReportParsable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.runner.SwiftLintRunnable;

import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.util.List;
import java.util.stream.Collectors;

public class SwiftLintSensor implements Sensor {

    private final SwiftLintRunnable runner;
    private final SwiftLintReportParsable parser;

    private final SwiftLintReportIssueMappable mapper;

    public SwiftLintSensor(
            SwiftLintRunnable runner,
            SwiftLintReportParsable parser,
            SwiftLintReportIssueMappable mapper
    ) {
        this.runner = runner;
        this.parser = parser;
        this.mapper = mapper;
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
        List<String> outputs = runner.run();
        List<SwiftLintIssue> issues = outputs.stream()
                .map(parser::parse)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        List<ReportIssue> reportIssues = mapper.map(issues).stream().collect(Collectors.toList());
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
        issueRecorder.recordIssues(reportIssues, SwiftLintRulesDefinition.REPOSITORY_KEY, sensorContext);
    }

}
