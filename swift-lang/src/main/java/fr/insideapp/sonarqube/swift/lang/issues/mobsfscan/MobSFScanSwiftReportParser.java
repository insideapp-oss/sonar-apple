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
package fr.insideapp.sonarqube.swift.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportParser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class MobSFScanSwiftReportParser implements ReportParser {

    private static final Logger LOGGER = Loggers.get(MobSFScanSwiftReportParser.class);

    @Override
    public List<ReportIssue> parse(String input) {

        List<ReportIssue> issues = new ArrayList<>();

        try {
            JSONObject results = new JSONObject(input).getJSONObject("results");
            Iterator<String> resultsKeys = results.keys();
            while (resultsKeys.hasNext()) {
                String resultKey = resultsKeys.next();
                JSONObject result = results.getJSONObject(resultKey);
                String message = result.getJSONObject("metadata").getString("description");
                JSONArray files = result.optJSONArray("files");
                // Checking if the result is for a specific file
                if (files != null) {
                    for (int i = 0; i < files.length(); i++) {
                        JSONObject file = files.getJSONObject(i);
                        String filePath = file.getString("file_path");
                        int lineNum = file.getJSONArray("match_lines").getInt(0);
                        issues.add(new ReportIssue(resultKey, message, filePath, lineNum));
                    }
                } else {
                    // Ignoring global issue for now
                }
            }

        } catch (Exception e) {
            LOGGER.error("Error while parsing MobSFScan report", e);
        }

        return issues;
    }

}
