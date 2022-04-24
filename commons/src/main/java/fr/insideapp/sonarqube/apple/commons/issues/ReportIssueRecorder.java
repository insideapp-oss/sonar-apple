package fr.insideapp.sonarqube.apple.commons.issues;

import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.batch.sensor.issue.internal.DefaultIssueLocation;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.util.List;

public class ReportIssueRecorder {

    private static final Logger LOGGER = Loggers.get(ReportIssueRecorder.class);
    private final SensorContext sensorContext;

    public ReportIssueRecorder(SensorContext sensorContext) {
        this.sensorContext = sensorContext;
    }

    public void recordIssues(List<ReportIssue> issues, String repository) {
        // Record issues
        for (ReportIssue i : issues) {
            File file = new File(i.getFilePath());
            FilePredicate fp = sensorContext.fileSystem().predicates().hasAbsolutePath(file.getAbsolutePath());
            if (!sensorContext.fileSystem().hasFiles(fp)) {
                LOGGER.warn("File not included in SonarQube {}", file.getAbsolutePath());
            } else {
                InputFile inputFile = sensorContext.fileSystem().inputFile(fp);
                if (inputFile != null) {
                    NewIssueLocation nil = new DefaultIssueLocation().on(inputFile)
                            .at(inputFile.selectLine(i.getLineNumber())).message(i.getMessage());
                    sensorContext.newIssue().forRule(RuleKey.of(repository, i.getRuleId()))
                            .at(nil).save();
                }

            }
        }
    }
}
