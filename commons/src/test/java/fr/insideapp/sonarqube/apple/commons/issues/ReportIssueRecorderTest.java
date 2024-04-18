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
package fr.insideapp.sonarqube.apple.commons.issues;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.issue.Issue;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportIssueRecorderTest {

    private static final String TEST_ROOT = "src/test/resources";
    private static final String TEST_FILENAME = "swift/main.swift";

    private SensorContextTester context;

    private ReportIssueRecorder recorder;
    @Before
    public void prepare() {
        context = SensorContextTester.create(new File(TEST_ROOT));
        recorder = new ReportIssueRecorder();
    }

    @Test
    public void record_issue_on_file_success() {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", TEST_FILENAME)
                .setLanguage("swift")
                .setLines(10)
                .setOriginalLineEndOffsets(new int[10])
                .setOriginalLineStartOffsets(new int[10])
                .setModuleBaseDir(Paths.get(TEST_ROOT))
                .build();
        context.fileSystem().add(testFile);
        ReportIssue reportIssue = new ReportIssue(
            "ruleId",
            "message",
            testFile.path().toString(),
            3
        );
        // test
        recorder.recordIssues(List.of(reportIssue), "TestRepo", context);
        // assert
        final List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        final Issue issue = issues.get(0);
        assertThat(issue.ruleKey().rule()).isEqualTo("ruleId");
        assertThat(issue.primaryLocation().message()).isEqualTo("message");
        assertThat(issue.primaryLocation().inputComponent().key()).isEqualTo(testFile.key());
        assertThat(Objects.requireNonNull(issue.primaryLocation().textRange()).start().line()).isEqualTo(3);
    }

    @Test
    public void record_issue_on_file_without_message() {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", TEST_FILENAME)
            .setLanguage("swift")
            .setLines(10)
            .setOriginalLineEndOffsets(new int[10])
            .setOriginalLineStartOffsets(new int[10])
            .setModuleBaseDir(Paths.get(TEST_ROOT))
            .build();
        context.fileSystem().add(testFile);
        ReportIssue reportIssue = new ReportIssue(
            "ruleId",
            null,
            testFile.path().toString(),
            3
        );
        // test
        recorder.recordIssues(List.of(reportIssue), "TestRepo", context);
        // assert
        final List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        final Issue issue = issues.get(0);
        assertThat(issue.ruleKey().rule()).isEqualTo("ruleId");
        assertThat(issue.primaryLocation().message()).isNull();
        assertThat(issue.primaryLocation().inputComponent().key()).isEqualTo(testFile.key());
        assertThat(issue.primaryLocation().textRange().start().line()).isEqualTo(3);
    }

    @Test
    public void record_issue_on_file_not_included() {
        // prepare
        DefaultInputFile testFile = new TestInputFileBuilder("", TEST_FILENAME)
            .setLanguage("swift")
            .setLines(10)
            .setOriginalLineEndOffsets(new int[10])
            .setOriginalLineStartOffsets(new int[10])
            .setModuleBaseDir(Paths.get(TEST_ROOT))
            .build();
        // we do not add it to the context's filesystem
        ReportIssue reportIssue = new ReportIssue(
            "ruleId",
            "message",
            testFile.path().toString(),
            3
        );
        // test
        recorder.recordIssues(List.of(reportIssue), "TestRepo", context);
        // assert
        final List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).isEmpty();
    }

    @Test
    public void record_issue_without_filepath() {
        // prepare
        ReportIssue reportIssue = new ReportIssue(
            "ruleId",
            "message",
            null,
            null
        );
        // test
        recorder.recordIssues(List.of(reportIssue), "TestRepo", context);
        // assert
        final List<Issue> issues = new ArrayList<>(context.allIssues());
        assertThat(issues).hasSize(1);
        final Issue issue = issues.get(0);
        assertThat(issue.ruleKey().rule()).isEqualTo("ruleId");
        assertThat(issue.primaryLocation().message()).isEqualTo("message");
        assertThat(issue.primaryLocation().inputComponent().key()).isEqualTo(context.project().key());
        assertThat(issue.primaryLocation().textRange()).isNull();
    }
}
