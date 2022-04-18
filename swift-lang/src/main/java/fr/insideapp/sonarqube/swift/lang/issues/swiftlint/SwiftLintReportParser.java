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
package fr.insideapp.sonarqube.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.swift.lang.issues.ReportIssue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwiftLintReportParser {

    public List<ReportIssue> parse(String input) {

        List<ReportIssue> issues = new ArrayList<>();

        String[] lines = input.split(System.getProperty("line.separator"));
        Pattern pattern = Pattern.compile("(.*.swift):(\\w+):?(\\w+)?: (warning|error): (.*) \\((\\w+)");
        for (int i = 0; i < lines.length; i++) {
            Matcher matcher = pattern.matcher(lines[i]);
            while (matcher.find()) {
                String filePath = matcher.group(1);
                int lineNum = Integer.parseInt(matcher.group(2));
                String message = matcher.group(5);
                String ruleId = matcher.group(6);
                issues.add(new ReportIssue(ruleId, message, filePath, lineNum));
            }
        }

        return issues;
    }
}
