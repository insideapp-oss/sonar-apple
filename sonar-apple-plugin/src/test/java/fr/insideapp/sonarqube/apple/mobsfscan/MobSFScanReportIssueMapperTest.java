package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportIssueMapper;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanReportResultLocation;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public final class MobSFScanReportIssueMapperTest {

    private MobSFScanReportIssueMapper mapper;

    @Before
    public void prepare() {
        mapper = new MobSFScanReportIssueMapper();
    }

    @Test
    public void map_issue_without_file() {
        // prepare
        MobSFScanIssue issue = new MobSFScanIssue(
                "rule-id",
                "a message",
                List.of()
        );
        // test
        Set<ReportIssue> reportIssues = mapper.map(Arrays.asList(issue));
        // assert
        List<ReportIssue> reportIssuesList = reportIssues.stream().collect(Collectors.toList());
        assertThat(reportIssuesList).hasSize(1);
        ReportIssue reportIssue = reportIssuesList.get(0);
        assertThat(reportIssue.getRuleId()).isEqualTo("rule-id");
        assertThat(reportIssue.getMessage()).isEqualTo("a message");
        assertThat(reportIssue.getFilePath()).isNull();
        assertThat(reportIssue.getLineNumber()).isNull();
    }

    @Test
    public void map_issue_with_files() {
        // prepare
        MobSFScanReportResultLocation location1 = new MobSFScanReportResultLocation();
        location1.path = "path/to/the/file";
        location1.lines = List.of(18);
        MobSFScanIssue issue = new MobSFScanIssue(
                "rule-id",
                "a message",
                List.of(location1)
        );
        // test
        Set<ReportIssue> reportIssues = mapper.map(Arrays.asList(issue));
        // assert
        List<ReportIssue> reportIssuesList = reportIssues.stream().collect(Collectors.toList());
        assertThat(reportIssuesList).hasSize(1);
        ReportIssue reportIssue1 = reportIssuesList.get(0);
        assertThat(reportIssue1.getRuleId()).isEqualTo("rule-id");
        assertThat(reportIssue1.getMessage()).isEqualTo("a message");
        assertThat(reportIssue1.getFilePath()).isEqualTo("path/to/the/file");
        assertThat(reportIssue1.getLineNumber()).isEqualTo(18);
    }

}
