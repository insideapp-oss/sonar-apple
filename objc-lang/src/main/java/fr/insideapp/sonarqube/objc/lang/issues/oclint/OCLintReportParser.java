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
package fr.insideapp.sonarqube.objc.lang.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportParser;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONArray;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONObject;
import org.sonarsource.analyzer.commons.internal.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class OCLintReportParser implements ReportParser {
    @Override
    public List<ReportIssue> parse(String input) {
        List<ReportIssue> issues = new ArrayList<>();

        JSONObject jsonReport = (JSONObject) JSONValue.parse(input);
        JSONArray jsonViolations = (JSONArray) jsonReport.get("violation");
        for (Object obj : jsonViolations) {
            JSONObject jsonViolation = (JSONObject) obj;

            String filePath = (String) jsonViolation.get("path");
            int lineNum = ((Long) jsonViolation.get("startLine")).intValue();
            String message = (String) jsonViolation.get("message");
            String ruleId = ((String) jsonViolation.get("rule")).replace(" ", "-");
            issues.add(new ReportIssue(ruleId, message, filePath, lineNum));
        }


        return issues;
    }
}
