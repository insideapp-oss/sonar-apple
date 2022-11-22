package fr.insideapp.sonarqube.swift.issues.periphery.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ScannerSide
public class PeripheryReportIssueMapper implements PeripheryReportIssueMappable {

    @Override
    public Set<ReportIssue> map(List<PeripheryIssue> input) {
        return input.stream()
                .map(issue ->
                        new ReportIssue(
                                issue.ruleIdentifier,
                                null,
                                issue.location.path,
                                issue.location.line
                        )
                )
                .collect(Collectors.toSet());
    }
}
