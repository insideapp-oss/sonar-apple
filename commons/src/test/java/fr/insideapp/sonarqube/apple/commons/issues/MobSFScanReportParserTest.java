package fr.insideapp.sonarqube.apple.commons.issues;

import org.junit.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanReportParserTest extends ReportParserTest {

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

        MobSFScanReportParser parser = new MobSFScanReportParser();

        List<ReportIssue> issues = parser.parse(input);
        assertThat(issues).hasSize(2);

        final ReportIssue keyboardRule = issues.get(0);
        assertFilePath(keyboardRule, null);
        assertLineNumber(keyboardRule, null);
        assertRuleId(keyboardRule, "ios_custom_keyboard_disabled");
        assertMessage(keyboardRule, "This app does not have custom keyboards disabled.");

        final ReportIssue hardcodedRule = issues.get(1);
        assertFilePath(hardcodedRule, FILE_PATH);
        assertLineNumber(hardcodedRule, 28);
        assertRuleId(hardcodedRule, "ios_hardcoded_secret");
        assertMessage(hardcodedRule, "Files may contain hardcoded sensitive information like usernames, passwords, keys etc.");
    }

}
