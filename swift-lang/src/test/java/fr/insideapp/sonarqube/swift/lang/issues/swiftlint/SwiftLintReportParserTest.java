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
package fr.insideapp.sonarqube.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SwiftLintReportParserTest extends ReportParserTest {

    private static final String FILE_PATH = "/SQApp/SQApp/SQAppApp.swift";

    @Test
    public void parse() {

        String input = "/SQApp/SQApp/SQAppApp.swift:23:1: warning: Trailing Whitespace Violation: Lines should not have trailing whitespace. (trailing_whitespace)\n" +
                "/SQApp/SQApp/SQAppApp.swift:17:9: warning: Unused Setter Value Violation: Setter value is not used. (unused_setter_value)";

        SwiftLintReportParser parser = new SwiftLintReportParser();

        List<ReportIssue> issues = parser.parse(input);
        assertThat(issues).hasSize(2);

        assertFilePath(issues.get(0), FILE_PATH);
        assertLineNumber(issues.get(0), 23);
        assertRuleId(issues.get(0), "trailing_whitespace");
        assertMessage(issues.get(0), "Trailing Whitespace Violation: Lines should not have trailing whitespace.");

        assertFilePath(issues.get(1), FILE_PATH);
        assertLineNumber(issues.get(1), 17);
        assertRuleId(issues.get(1), "unused_setter_value");
        assertMessage(issues.get(1), "Unused Setter Value Violation: Setter value is not used.");
    }
}
