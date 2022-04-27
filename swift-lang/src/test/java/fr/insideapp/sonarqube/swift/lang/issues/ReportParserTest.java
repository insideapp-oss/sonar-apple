package fr.insideapp.sonarqube.swift.lang.issues;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintReportParser;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportParserTest {

    protected void assertFilePath(ReportIssue issue, String expectedPath) {
        assertThat(issue.getFilePath()).isEqualTo(expectedPath);
    }

    protected void assertLineNumber(ReportIssue issue, Integer expectedLine) {
        assertThat(issue.getLineNumber()).isEqualTo(expectedLine);
    }

    protected void assertRuleId(ReportIssue issue, String expectedRuleId) {
        assertThat(issue.getRuleId()).isEqualTo(expectedRuleId);
    }

    protected void assertMessage(ReportIssue issue, String expectedMessage) {
        assertThat(issue.getMessage()).isEqualTo(expectedMessage);
    }

}

