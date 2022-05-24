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

import org.junit.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanReportParserTest {

    private static final String FILE_PATH = "SQApp/SQApp/SQAppApp.swift";

    @Test
    public void parse() {

        String input = "{\n" +
                "  \"results\": {\n" +
                "    \"ios_hardcoded_secret\": {\n" +
                "      \"files\": [\n" +
                "        {\n" +
                "          \"file_path\": \"SQApp/SQApp/SQAppApp.swift\",\n" +
                "          \"match_lines\": [\n" +
                "            28,\n" +
                "            30\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"metadata\": {\n" +
                "        \"description\": \"Files may contain hardcoded sensitive information like usernames, passwords, keys etc.\",\n" +
                "        \"severity\": \"WARNING\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"ios_custom_keyboard_disabled\": {\n" +
                "      \"metadata\": {\n" +
                "        \"cwe\": \"CWE-919 - Weaknesses in Mobile Applications\",\n" +
                "        \"description\": \"This app does not have custom keyboards disabled.\",\n" +
                "        \"masvs\": \"MSTG-PLATFORM-11\",\n" +
                "        \"owasp-mobile\": \"M1: Improper Platform Usage\",\n" +
                "        \"reference\": \"https://github.com/MobSF/owasp-mstg/blob/master/Document/0x06h-Testing-Platform-Interaction.md#app-extensions\",\n" +
                "        \"severity\": \"INFO\"\n" +
                "      }\n" +
                "    },\n" +
                "  }\n" +
                "}";

        MobSFScanReportParser parser = new MobSFScanReportParser(new String[]{"swift"});

        List<ReportIssue> issues = parser.parse(input);
        assertThat(issues).hasSize(2);

        final ReportIssue keyboardRule = issues.get(0);
        ReportParserTestHelper.assertFilePath(keyboardRule, null);
        ReportParserTestHelper.assertLineNumber(keyboardRule, null);
        ReportParserTestHelper.assertRuleId(keyboardRule, "ios_custom_keyboard_disabled");
        ReportParserTestHelper.assertMessage(keyboardRule, "This app does not have custom keyboards disabled.");

        final ReportIssue hardcodedRule = issues.get(1);
        ReportParserTestHelper.assertFilePath(hardcodedRule, FILE_PATH);
        ReportParserTestHelper.assertLineNumber(hardcodedRule, 28);
        ReportParserTestHelper.assertRuleId(hardcodedRule, "ios_hardcoded_secret");
        ReportParserTestHelper.assertMessage(hardcodedRule, "Files may contain hardcoded sensitive information like usernames, passwords, keys etc.");
    }

}
