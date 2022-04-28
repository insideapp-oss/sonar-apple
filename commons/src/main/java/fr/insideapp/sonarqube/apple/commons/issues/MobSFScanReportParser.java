package fr.insideapp.sonarqube.apple.commons.issues;

import fr.insideapp.sonarqube.apple.commons.SourceLine;
import org.json.JSONArray;
import org.json.JSONObject;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.*;

public final class MobSFScanReportParser implements ReportParser {
    private static final Logger LOGGER = Loggers.get(MobSFScanReportParser.class);
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
                        int lineNum = file.getJSONArray("match_lines").getInt(0);
                        issues.add(new ReportIssue(resultKey, message, filePath, lineNum));
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