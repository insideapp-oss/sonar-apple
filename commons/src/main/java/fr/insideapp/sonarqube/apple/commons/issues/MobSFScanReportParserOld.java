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
package fr.insideapp.sonarqube.apple.commons.issues;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.*;

public final class MobSFScanReportParserOld implements ReportParser {
    private static final Logger LOGGER = Loggers.get(MobSFScanReportParserOld.class);

    private String[] extensions = {};

    public MobSFScanReportParserOld(String[] extensions) {
        this.extensions = extensions;
    }

    @Override
    public List<ReportIssue> parse(String input) {

        final Set<ReportIssue> issues = new HashSet<>();

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
                        // Only files with matching extensions are reported
                        if (Arrays.stream(this.extensions).anyMatch(e -> e.equalsIgnoreCase(FilenameUtils.getExtension(filePath)))) {
                            int lineNum = file.getJSONArray("match_lines").getInt(0);
                            issues.add(new ReportIssue(resultKey, message, filePath, lineNum));
                        }
                    }
                } else {
                    issues.add(new ReportIssue(resultKey, message));
                }
            }

        } catch (Exception e) {
            LOGGER.error("Error while parsing MobSFScan report", e);
        }

        return new ArrayList<>(issues);
    }

}