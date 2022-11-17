package fr.insideapp.sonarqube.swift.issues.swiftlint.mapper;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface SwiftLintReportIssueMappable extends ReportIssueMappable<List<SwiftLintIssue>> {
}
