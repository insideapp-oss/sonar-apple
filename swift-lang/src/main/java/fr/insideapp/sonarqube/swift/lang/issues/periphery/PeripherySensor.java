package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.swift.lang.Swift;
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

public class PeripherySensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(PeripherySensor.class);
    private static final String DEFAULT_LOG_PATH = "build";

    public static final String LOG_PATH_KEY = "sonar.apple.periphery.logPath";

    public static final String LOG_FILENAME = "periphery.log";

    private final SensorContext context;

    public PeripherySensor(SensorContext context) {
        this.context = context;
    }

    protected String logPath() {
        return context.config()
                .get(LOG_PATH_KEY)
                .orElse(DEFAULT_LOG_PATH);
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.onlyOnLanguage(Swift.KEY).name("Periphery Sensor").onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis();
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, PeripheryRulesDefinition.REPOSITORY_KEY);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private List<ReportIssue> runAnalysis() throws IOException {

        // Look for periphery.log file
        File peripheryLogFile = new File(logPath(), LOG_FILENAME);
        if (!peripheryLogFile.exists()) {
            LOGGER.error("Failed to locate periphery.log file at {}", peripheryLogFile.getAbsolutePath());
            return new ArrayList<>();
        }

        try (InputStream is = new FileInputStream((peripheryLogFile))) {
            // Parse issues
            String peripheryLogContent = IOUtils.toString(is, StandardCharsets.UTF_8);
            List<ReportIssue> issues = new PeripheryReportParser().parse(peripheryLogContent);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
