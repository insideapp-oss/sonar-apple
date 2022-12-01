package fr.insideapp.sonarqube.objc.issues.oclint.mapper;

import fr.insideapp.sonarqube.apple.commons.interfaces.ReportIssueMappable;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintViolation;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface OCLintReportIssueMappable extends ReportIssueMappable<List<OCLintViolation>> {
}
