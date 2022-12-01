package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.objc.issues.oclint.mapper.OCLintReportIssueMapper;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintViolation;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintReportIssueMapperTest {

    private OCLintReportIssueMapper mapper;

    @Before
    public void prepare() {
        mapper = new OCLintReportIssueMapper();
    }

    @Test
    public void map() {
        // prepare
        OCLintViolation issue = new OCLintViolation();
        issue.rule = "rule-id";
        issue.message = "a message";
        issue.path = "path/to/the/file";
        issue.line = 18;
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
