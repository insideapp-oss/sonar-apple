package fr.insideapp.sonarqube.objc.issues.oclint.interfaces;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface OCLintReportParsable {

    List<ReportIssue> collect(OCLintReport report);

}
