package fr.insideapp.sonarqube.apple.mobsfscan.splitter;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanRulesDefinition;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import org.sonar.api.batch.rule.ActiveRules;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Map;

@ScannerSide
public interface MobSFScanReportIssueSplittable {

    Map<MobSFScanRulesDefinition, List<ReportIssue>> split(List<ReportIssue> issues, ActiveRules rules);

}