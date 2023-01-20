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
package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanRulesDefinition;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportIssueMappable;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParsable;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunnable;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplittable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MobSFScanSensor implements Sensor {

    public final ObjectiveC objectiveC;

    private final MobSFScanRunnable runner;
    private final MobSFScanReportParsable parser;
    private final MobSFScanReportIssueMappable mapper;
    private final MobSFScanReportIssueSplittable splitter;

    public MobSFScanSensor(
            final ObjectiveC objectiveC,
            final MobSFScanRunnable runner,
            final MobSFScanReportParsable parser,
            final MobSFScanReportIssueMappable mapper,
            final MobSFScanReportIssueSplittable splitter
    ) {
        this.objectiveC = objectiveC;
        this.runner = runner;
        this.parser = parser;
        this.mapper = mapper;
        this.splitter = splitter;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguages(Swift.KEY, objectiveC.getKey())
                .name("MobSFScan Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        String output = runner.run();
        List<MobSFScanIssue> issues = parser.parse(output);
        List<ReportIssue> reportIssues = mapper.map(issues).stream().collect(Collectors.toList());
        Map<MobSFScanRulesDefinition, List<ReportIssue>> splitReportIssues = splitter.split(reportIssues, sensorContext.activeRules());
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
        splitReportIssues.forEach((rulesDefinition, splitIssues) -> issueRecorder.recordIssues(splitIssues, rulesDefinition.getRepositoryKey(), sensorContext));
    }

}
