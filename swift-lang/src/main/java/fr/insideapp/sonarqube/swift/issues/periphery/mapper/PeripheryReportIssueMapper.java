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
package fr.insideapp.sonarqube.swift.issues.periphery.mapper;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ScannerSide
public class PeripheryReportIssueMapper implements PeripheryReportIssueMappable {

    @Override
    public Set<ReportIssue> map(List<PeripheryIssue> input) {
        return input.stream()
                .map(issue ->
                        new ReportIssue(
                                issue.ruleIdentifier,
                                null,
                                issue.location.path,
                                issue.location.line
                        )
                )
                .collect(Collectors.toSet());
    }
}
