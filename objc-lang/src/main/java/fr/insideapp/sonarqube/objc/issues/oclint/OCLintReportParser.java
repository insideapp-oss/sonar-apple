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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OCLintReportParser {

    private static final Logger LOGGER = Loggers.get(OCLintReportParser.class);

    public List<ReportIssue> collect(OCLintReport report) {
        if (report.violations == null) {
            LOGGER.info("No OCLint violations to handle");
            return new ArrayList<>();
        }

        LOGGER.info("{} OCLint violation(s) to handle", report.violations.length);

        return Arrays.asList(report.violations)
                .stream()
                .map(violation -> {
                    return new ReportIssue(
                            violation.rule,
                            violation.message,
                            violation.path,
                            violation.line
                    );
                })
                .collect(Collectors.toList());
    }

}
