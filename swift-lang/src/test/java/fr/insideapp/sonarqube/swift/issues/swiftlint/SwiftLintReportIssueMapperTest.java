package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.swiftlint.mapper.SwiftLintReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public final class SwiftLintReportIssueMapperTest {

    private SwiftLintReportIssueMapper mapper;

    @Before
    public void prepare() {
        mapper = new SwiftLintReportIssueMapper();
    }

    @Test
    public void map() {
        // prepare
        SwiftLintIssue issue = new SwiftLintIssue();
        issue.ruleIdentifier = "rule-id";
        issue.message = "a message";
        issue.filePath = "path/to/the/file";
        issue.lineNumber = 18;
        issue.characterNumber = 12;
        // test
        Set<ReportIssue> reportIssues = mapper.map(Arrays.asList(issue));
        // assert
        List<ReportIssue> reportIssuesList = reportIssues.stream().collect(Collectors.toList());
        assertThat(reportIssuesList).hasSize(1);
        ReportIssue reportIssue = reportIssuesList.get(0);
        assertThat(reportIssue.getRuleId()).isEqualTo("rule-id");
        assertThat(reportIssue.getMessage()).isEqualTo("a message");
        assertThat(reportIssue.getFilePath()).isEqualTo("path/to/the/file");
        assertThat(reportIssue.getLineNumber()).isEqualTo(18);
    }

}
