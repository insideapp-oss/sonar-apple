package fr.insideapp.sonarqube.apple.commons.issues;

import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.batch.sensor.issue.internal.DefaultIssueLocation;
import org.sonar.api.rule.RuleKey;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportIssueRecorder {
    private final SensorContext sensorContext;

    public ReportIssueRecorder(SensorContext sensorContext) {
        this.sensorContext = sensorContext;
    }

    public void record(List<ReportIssue> issues) throws IOException {
        // Record issues
        for (ReportIssue i : issues) {
            File file = new File(i.getFilePath());
            FilePredicate fp = sensorContext.fileSystem().predicates().hasAbsolutePath(file.getAbsolutePath());
            if (!sensorContext.fileSystem().hasFiles(fp)) {
                throw new IOException(String.format("File not included in SonarQube %s", file.getAbsolutePath()));
            } else {
                InputFile inputFile = sensorContext.fileSystem().inputFile(fp);
                if (inputFile != null) {
                    NewIssueLocation nil = new DefaultIssueLocation().on(inputFile)
                            .at(inputFile.selectLine(i.getLineNumber())).message(i.getMessage());
                    sensorContext.newIssue().forRule(RuleKey.of("SwiftLint", i.getRuleId()))
                            .at(nil).save();
                }

            }
        }
    }
}
