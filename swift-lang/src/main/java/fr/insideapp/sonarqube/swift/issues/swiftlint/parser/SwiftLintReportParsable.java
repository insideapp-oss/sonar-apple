package fr.insideapp.sonarqube.swift.issues.swiftlint.parser;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportParsable;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface SwiftLintReportParsable extends ReportParsable<List<SwiftLintIssue>> {
}
