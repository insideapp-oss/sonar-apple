package fr.insideapp.sonarqube.apple.mobsfscan.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanReportResultLocation;
import org.sonar.api.scanner.ScannerSide;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ScannerSide
public class MobSFScanReportIssueMapper extends AbstractReportMapper<List<MobSFScanIssue>> implements MobSFScanReportIssueMappable {

    @Override
    protected Set<ReportIssue> perform(List<MobSFScanIssue> input) throws Exception {
        Set<ReportIssue> issues = new HashSet<>();
        for(MobSFScanIssue issue: input) {
            // issue is not file specific
            if (issue.locations.isEmpty()) {
                issues.add(
                        new ReportIssue(
                                issue.rule,
                                issue.description,
                                null,
                                null
                        )
                );
            } else {
                // for each file that has this issue, we create one
                for(MobSFScanReportResultLocation location: issue.locations) {
                    issues.add(
                            new ReportIssue(
                                    issue.rule,
                                    issue.description,
                                    location.path,
                                    location.lines.get(0)
                            )
                    );
                }
            }
        }
        return issues;
    }

}
