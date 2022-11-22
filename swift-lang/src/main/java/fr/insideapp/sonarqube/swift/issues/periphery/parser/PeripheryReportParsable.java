package fr.insideapp.sonarqube.swift.issues.periphery.parser;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportParsable;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface PeripheryReportParsable extends ReportParsable<List<PeripheryIssue>> {
}