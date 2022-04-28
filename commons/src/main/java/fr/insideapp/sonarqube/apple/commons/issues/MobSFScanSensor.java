package fr.insideapp.sonarqube.apple.commons.issues;

import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public abstract class MobSFScanSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(MobSFScanSensor.class);

    private static final String COMMAND = "mobsfscan";
    private static final String OUTPUT_FORMAT = "--json";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    public abstract String language();

    public String nameSuffix() { return ""; }

    //public abstract <T extends MobSFScanRulesDefinition> Class<T> ruleDefinition();

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(language())
                .name(String.join(" ", "MobSFScan sensor", nameSuffix()))
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis(sensorContext);
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, MobSFScanRulesDefinition.builder(language()));
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private List<ReportIssue> runAnalysis(SensorContext sensorContext) throws IOException {

        try {
            // Run MobSFScan
            LOGGER.info("Running '{} analyze'...", COMMAND);
            final String sources = sensorContext.config().get("sonar.sources").get();
            String output = new ProcBuilder(COMMAND,  OUTPUT_FORMAT, sources)
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .ignoreExitStatus()
                    .run()
                    .getOutputString();

            // Parse issues
            List<ReportIssue> issues = new MobSFScanReportParser().parse(output);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

}