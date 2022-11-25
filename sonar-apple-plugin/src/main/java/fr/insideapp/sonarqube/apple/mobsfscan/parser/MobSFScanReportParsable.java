package fr.insideapp.sonarqube.apple.mobsfscan.parser;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportParsable;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface MobSFScanReportParsable extends ReportParsable<List<MobSFScanIssue>> {
}