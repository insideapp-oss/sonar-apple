package fr.insideapp.sonarqube.apple.commons.issues;

import javax.annotation.Nullable;

import static org.assertj.core.api.Assertions.assertThat;

public class ReportParserTest {

    protected void assertFilePath(ReportIssue issue, @Nullable String expectedPath) {
        assertThat(issue.getFilePath()).isEqualTo(expectedPath);
    }

    protected void assertLineNumber(ReportIssue issue, @Nullable Integer expectedLine) {
        assertThat(issue.getLineNumber()).isEqualTo(expectedLine);
    }

    protected void assertRuleId(ReportIssue issue, String expectedRuleId) {
        assertThat(issue.getRuleId()).isEqualTo(expectedRuleId);
    }

    protected void assertMessage(ReportIssue issue, String expectedMessage) {
        assertThat(issue.getMessage()).isEqualTo(expectedMessage);
    }

}

