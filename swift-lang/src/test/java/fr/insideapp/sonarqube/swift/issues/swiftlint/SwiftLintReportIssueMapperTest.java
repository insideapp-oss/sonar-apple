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
package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.swiftlint.mapper.SwiftLintReportMapper;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public final class SwiftLintReportIssueMapperTest {

    private SwiftLintReportMapper mapper;

    @Before
    public void prepare() {
        mapper = new SwiftLintReportMapper();
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
