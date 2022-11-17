package fr.insideapp.sonarqube.swift.issues.swiftlint.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ScannerSide
public class SwiftLintReportIssueMapper implements SwiftLintReportIssueMappable {

    @Override
    public Set<ReportIssue> map(List<SwiftLintIssue> input) {
        return input.stream()
                .map(issue ->
                        new ReportIssue(
                                issue.ruleIdentifier,
                                issue.message,
                                issue.filePath,
                                issue.lineNumber
                        )
                )
                .collect(Collectors.toSet());
    }
}
