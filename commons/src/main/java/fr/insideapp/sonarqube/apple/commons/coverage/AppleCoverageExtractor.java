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

import org.buildobjects.process.ProcBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

public class AppleCoverageExtractor {

    private static final Logger LOGGER = Loggers.get(AppleCoverageExtractor.class);
    private static final String COMMAND = "xcrun";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;
    private static final int COMMAND_EXIT_CODE = 0;

    private final String tmpFolderPath;

    public AppleCoverageExtractor(SensorContext context) {
        this.tmpFolderPath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(UUID.randomUUID().toString());
    }

    public JSONObject extract(File resultBundle) {
        // get the raw data of the build result
        String xcresultData = new ProcBuilder("xcrun")
                .withArgs("xcresulttool", "get")
                .withArgs( "--format", "json")
                .withArgs("--path", resultBundle.getAbsolutePath())
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        // this a JSON object
        JSONObject xcresultJSON = new JSONObject(xcresultData);
        // now we extract the archive references from the raw report
        // this is possible to have several archive, from a merged .xcresult bundle of multiple test plans
        ArrayList<String> archiveRefIDs = extractArchiveReferences(xcresultJSON);
        // we need somewhere to put the temporary archive
        createTemporaryDirectory();
        // exporting the archive reference we retrieve into a real archive we can read
        File coverageArchive = exportCoverageArchive(archiveRefIDs, resultBundle);
        // retrieve the detailed coverage data
        JSONObject coverageData = extractCoverageData(coverageArchive);
        // cleaning
        deleteDirectory(new File(tmpFolderPath));
        return  coverageData;
    }

    private ArrayList<String> extractArchiveReferences(JSONObject xcresult) {
        JSONArray actionValues = xcresult.getJSONObject("actions").getJSONArray("_values");
        ArrayList<String> archiveRefIDs = new ArrayList<String>();

        for (int i = 0; i < actionValues.length(); i++) {
            JSONObject actionResult = actionValues.getJSONObject(i).getJSONObject("actionResult");
            if (actionResult.has("coverage")) {
                JSONObject coverage = actionResult.getJSONObject("coverage");
                if (coverage.has("archiveRef")) {
                    String archiveRefID = coverage
                            .getJSONObject("archiveRef")
                            .getJSONObject("id")
                            .getString("_value");
                    archiveRefIDs.add(archiveRefID);

                }
            }
        }
        LOGGER.info("Found {} coverage archive reference(s)", archiveRefIDs.size());
        return archiveRefIDs;
    }

    private File exportCoverageArchive(ArrayList<String> archiveReferences, File resultBundle) {

        // we use a new random UUID for the name
        // as writing to an existing .xccovarchive append the data
        String coverageArchivePath = tmpFolderPath
                .concat(File.separator)
                .concat(UUID.randomUUID().toString())
                .concat(".xccovarchive");

        // for each archive, we include it in a common coverage archive
        for (String archiveReference : archiveReferences) {
            try {
                new ProcBuilder(COMMAND)
                        .withArgs("xcresulttool", "export")
                        .withArgs("--type", "directory")
                        .withArgs("--path", resultBundle.getAbsolutePath())
                        .withArgs("--id", archiveReference)
                        .withArgs("--output-path", coverageArchivePath)
                        .withTimeoutMillis(COMMAND_TIMEOUT)
                        .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                        .run();
            } catch (Exception e) {
                LOGGER.error("The export for the coverage archive '{}' produced the following exception. This exception will be ignored. Exception:", archiveReference, e);
            }
        }

        return new File(coverageArchivePath);

    }

    private JSONObject extractCoverageData(File coverageArchive) {
        // get the detail coverage data from the report archive
        String coverageData = new ProcBuilder(COMMAND)
                .withArgs("xccov", "view")
                .withArgs("--archive", "--json")
                .withArgs(coverageArchive.getAbsolutePath())
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        return new JSONObject(coverageData);
    }

    private void createTemporaryDirectory() {
        // create the temporary directory if needed
        File tmpFolder = new File(tmpFolderPath);
        if (tmpFolder.exists()) {
            deleteDirectory(tmpFolder);
        }
        tmpFolder.mkdir();
    }

    public void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for(File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        directory.delete();
    }

}