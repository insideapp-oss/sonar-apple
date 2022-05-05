package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.lang.issues.ReportParserTestHelper;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintReportParser;
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
