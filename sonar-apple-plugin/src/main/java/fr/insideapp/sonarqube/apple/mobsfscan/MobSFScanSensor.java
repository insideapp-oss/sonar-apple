package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanRulesDefinition;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportIssueMappable;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParsable;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunnable;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplittable;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplitter;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MobSFScanSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(MobSFScanSensor.class);

    private final MobSFScanRunnable runner;
    private final MobSFScanReportParsable parser;
    private final MobSFScanReportIssueMappable mapper;
    private final MobSFScanReportIssueSplittable splitter;

    public MobSFScanSensor(
            final MobSFScanRunnable runner,
            final MobSFScanReportParsable parser,
            final MobSFScanReportIssueMappable mapper,
            final MobSFScanReportIssueSplittable splitter
    ) {
        this.runner = runner;
        this.parser = parser;
        this.mapper = mapper;
        this.splitter = splitter;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {

        sensorDescriptor
                .onlyOnLanguages(Swift.KEY, ObjectiveC.KEY)
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
        splitReportIssues.forEach((rulesDefinition, splitIssues) -> issueRecorder.recordIssues(splitIssues, rulesDefinition.repositoryKey, sensorContext));
    }

}
