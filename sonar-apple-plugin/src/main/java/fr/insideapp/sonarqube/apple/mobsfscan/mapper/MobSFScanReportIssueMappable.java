package fr.insideapp.sonarqube.apple.mobsfscan.mapper;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportIssueMappable;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface MobSFScanReportIssueMappable extends ReportIssueMappable<List<MobSFScanIssue>> {
}