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
package fr.insideapp.sonarqube.apple.commons.coverage;

import org.json.JSONArray;
import org.json.JSONObject;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.coverage.NewCoverage;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Set;

public class AppleCoverageParser {

    private static final Logger LOGGER = Loggers.get(AppleCoverageParser.class);

    private final SensorContext context;

    public AppleCoverageParser(SensorContext context) {
        this.context = context;
    }

    public void collect(JSONObject coverageData) {

        // keys are file path
        Set<String> filesPath = coverageData.keySet();
        LOGGER.info("{} files have coverage data, parsing it", filesPath.size());

        for (String filePath : filesPath) {
            JSONArray linesCoverage = coverageData.getJSONArray(filePath);

            InputFile resource = getFile(filePath);
            if (resource == null) {
                // skipping coverage for this file, since it's unknown
                continue;
            }

            // building the new coverage object
            NewCoverage newCoverage = context.newCoverage();
            newCoverage.onFile(resource);

            for (int i = 0; i < linesCoverage.length(); i++) {
                JSONObject lineCoverage = linesCoverage.getJSONObject(i);
                int lineNumber = lineCoverage.getInt("line");
                boolean isExecutable = lineCoverage.getBoolean("isExecutable");
                if (isExecutable) {
                    // it is possible the execution count overflows the int limit
                    // if this is the case, we fall back to the maximum value available
                    int hitsCount = lineCoverage.getInt("executionCount");
                    if (hitsCount < 0) {
                        hitsCount = Integer.MAX_VALUE;
                    }
                    // recording the line hit
                    newCoverage.lineHits(lineNumber, hitsCount);
                }
            }

            // saving!
            newCoverage.save();
        }
    }

    private InputFile getFile(String filePath) {
        FilePredicate fp = context.fileSystem().predicates().hasPath(filePath);
        if(context.fileSystem().hasFiles(fp)) {
            return context.fileSystem().inputFile(fp);
        } else {
            LOGGER.warn("Can't find file {}", filePath);
            return null;
        }
    }
}