package fr.insideapp.sonarqube.objc.issues.oclint.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintViolation;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ScannerSide
public final class OCLintReportIssueMapper extends AbstractReportMapper<List<OCLintViolation>> implements OCLintReportIssueMappable {

    @Override
    protected Set<ReportIssue> perform(List<OCLintViolation> input) throws Exception {
        return input.stream()
                .map(violation ->
                        new ReportIssue(
                                violation.rule,
                                violation.message,
                                violation.path,
                                violation.line
                        )
                )
                .collect(Collectors.toSet());
    }

}
