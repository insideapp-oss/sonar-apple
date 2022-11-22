package fr.insideapp.sonarqube.swift.issues.periphery.mapper;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface PeripheryReportIssueMappable extends ReportIssueMappable<List<PeripheryIssue>> {
}