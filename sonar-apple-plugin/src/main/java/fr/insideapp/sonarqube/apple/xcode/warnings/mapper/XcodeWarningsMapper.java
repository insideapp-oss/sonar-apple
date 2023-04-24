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
package fr.insideapp.sonarqube.apple.xcode.warnings.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarning;
import org.sonar.api.scanner.ScannerSide;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@ScannerSide
public class XcodeWarningsMapper extends AbstractReportMapper<List<XcodeWarning>, ReportIssue> implements XcodeWarningsMappable {

    @Override
    protected Set<ReportIssue> perform(List<XcodeWarning> input) throws Exception {
        Set<ReportIssue> issues = new HashSet<>();
        for(XcodeWarning warning: input) {
            // issue is file specific
            if (warning.location != null) {
                issues.add(
                    new ReportIssue(
                        warning.type.identifier,
                        warning.message,
                        warning.location.filePath,
                        warning.location.lineNumber
                    )
                );
            } else {
                // no-op
            }
        }
        return issues;
    }

}