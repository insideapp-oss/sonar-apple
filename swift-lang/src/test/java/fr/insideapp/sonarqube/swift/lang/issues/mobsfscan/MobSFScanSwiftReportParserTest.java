package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.lang.issues.ReportParserTest;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintReportParser;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanSwiftReportParserTest extends ReportParserTest {

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

        MobSFScanSwiftReportParser parser = new MobSFScanSwiftReportParser();

        List<ReportIssue> issues = parser.parse(input);
        assertThat(issues).hasSize(1);

        assertFilePath(issues.get(0), FILE_PATH);
        assertLineNumber(issues.get(0), 28);
        assertRuleId(issues.get(0), "ios_hardcoded_secret");
        assertMessage(issues.get(0), "Files may contain hardcoded sensitive information like usernames, passwords, keys etc.");
    }

}
