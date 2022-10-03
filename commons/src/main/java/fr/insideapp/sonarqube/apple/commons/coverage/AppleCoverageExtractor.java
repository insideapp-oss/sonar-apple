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

    private static final String TMP = "tmp";

    private final SensorContext context;

    public AppleCoverageExtractor(SensorContext context) {
        this.context = context;
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
        // exporting the archive reference we retrieve into a real archive we can read
        File coverageArchive = exportCoverageArchive(archiveRefIDs, resultBundle);
        // retrieve the detailed coverage data
        return extractCoverageData(coverageArchive);
    }

    private ArrayList<String> extractArchiveReferences(JSONObject xcresult) {
        JSONArray actionValues = xcresult.getJSONObject("actions").getJSONArray("_values");
        ArrayList archiveRefIDs = new ArrayList<String>();

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

        String tmpFolderPath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(TMP);

        // create the temporary directory if needed
        File tmpFolder = new File(tmpFolderPath);
        tmpFolder.mkdirs();

        // we use a new random UUID for the name
        // as writing to an existing .xccovarchive append the data
        String coverageArchivePath = tmpFolderPath
                .concat(File.separator)
                .concat(UUID.randomUUID().toString())
                .concat(".xccovarchive");

        LOGGER.info("Will export the coverage archive to '{}'", coverageArchivePath);

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

}