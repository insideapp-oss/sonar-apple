package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.swift.lang.Swift;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintReportParser;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public class MobSFScanSwiftSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(MobSFScanSwiftSensor.class);

    private static final String COMMAND = "mobsfscan --sonarqube";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(Swift.KEY)
                .name("MobSFScan Swift sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis();
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, MobSFScanSwiftRulesDefinition.REPOSITORY_KEY);
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
            List<ReportIssue> issues = new MobSFScanSwiftReportParser().parse(output);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

}
