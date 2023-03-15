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
package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportMapper;
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

    private MobSFScanReportMapper mapper;

    @Before
    public void prepare() {
        mapper = new MobSFScanReportMapper();
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
