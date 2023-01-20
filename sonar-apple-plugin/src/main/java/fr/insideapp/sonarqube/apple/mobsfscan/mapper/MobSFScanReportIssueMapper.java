/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
