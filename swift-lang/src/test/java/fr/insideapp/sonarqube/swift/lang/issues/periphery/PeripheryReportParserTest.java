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
package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.lang.issues.ReportParserTestHelper;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PeripheryReportParserTest {

    private static final String FILE_PATH = "/SQApp/SQApp/SQAppApp.swift";

    @Test
    public void parse() {

        String input = "/SQApp/SQApp/SQAppApp.swift:23:1: warning: Property 'myProperty' is assigned, but never used\n" +
                "/SQApp/SQApp/SQAppApp.swift:17:9: warning: Function 'myFunction(param1:param2:)' is unused";

        PeripheryReportParser parser = new PeripheryReportParser();

        List<ReportIssue> issues = parser.parse(input);
        assertThat(issues).hasSize(2);

        ReportParserTestHelper.assertFilePath(issues.get(0), FILE_PATH);
        ReportParserTestHelper.assertLineNumber(issues.get(0), 23);
        ReportParserTestHelper.assertRuleId(issues.get(0), "unused");
        ReportParserTestHelper.assertMessage(issues.get(0), "Property 'myProperty' is assigned, but never used");

        ReportParserTestHelper.assertFilePath(issues.get(1), FILE_PATH);
        ReportParserTestHelper.assertLineNumber(issues.get(1), 17);
        ReportParserTestHelper.assertRuleId(issues.get(1), "unused");
        ReportParserTestHelper.assertMessage(issues.get(1), "Function 'myFunction(param1:param2:)' is unused");
    }
}
