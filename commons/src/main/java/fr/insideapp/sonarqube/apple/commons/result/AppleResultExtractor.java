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
package fr.insideapp.sonarqube.apple.commons.result;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverage;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverageMetadata;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestPlanRunSummaries;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import org.apache.commons.io.FileUtils;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AppleResultExtractor {

    private static final Logger LOGGER = Loggers.get(AppleResultExtractor.class);
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;
    private static final int COMMAND_EXIT_CODE = 0;

    private ObjectMapper objectMapper;

    public AppleResultExtractor() {
        objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    public Record getInvocationRecord(File resultBundle) throws JsonProcessingException {
        // get the raw data of the build result as JSON
        String xcresultData = xcrun()
                .withArgs("xcresulttool", "get", "--format", "json")
                .withArgs("--path", resultBundle.getAbsolutePath())
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        Record xcResultRecord = objectMapper.readValue(xcresultData, Record.class);
        LOGGER.debug("Record actions : {}", xcResultRecord.actions.size());
        return xcResultRecord;
    }

    public ActionTestPlanRunSummaries getTestPlanRunSummaries(File resultBundle, Reference testsReference) throws JsonProcessingException {
        // get the test plan data of the build result as JSON
        String xcresultData = xcrun()
                .withArgs("xcresulttool", "get", "--format", "json")
                .withArgs("--path", resultBundle.getAbsolutePath())
                .withArgs("--id", testsReference.id)
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        ActionTestPlanRunSummaries actionTestPlanRunSummaries = objectMapper.readValue(xcresultData, ActionTestPlanRunSummaries.class);
        LOGGER.debug("Test plan summaries : {}", actionTestPlanRunSummaries.summaries.size());
        return actionTestPlanRunSummaries;
    }

    public List<ActionCodeCoverage> getCoverage(File resultBundle, List<Reference> archiveReferences) throws IOException {
        File resultBundlerParentFolder = resultBundle.getParentFile();
        File coverageArchive = new File(resultBundlerParentFolder, "coverage.xccovarchive");
        // we delete (to be sure) as writing to an existing .xccovarchive append the data
        FileUtils.deleteDirectory(coverageArchive);
        // exporting the archive references into a real archive we can read
        exportCoverageArchive(archiveReferences, resultBundle, coverageArchive);
        // get the raw data of the build result as JSON
        try {
            String coverageData = xcrun()
                    .withArgs("xccov", "view")
                    .withArgs("--archive", "--json")
                    .withArgs(coverageArchive.getAbsolutePath())
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                    .run()
                    .getOutputString();

            Map<String, List<ActionCodeCoverageMetadata>> mappedCoverageData = objectMapper.readValue(coverageData, new TypeReference<>() {});
            LOGGER.debug("Coverage data : {}", mappedCoverageData.size());

            return mappedCoverageData
                    .entrySet()
                    .stream()
                    .map(ActionCodeCoverage::new)
                    .collect(Collectors.toList());

        } finally {
            // cleanup anyway
            FileUtils.deleteDirectory(coverageArchive);
        }
    }

    // Private

    private void exportCoverageArchive(List<Reference> archiveReferences, File resultBundle, File coverageArchive) {
        // for each archive, we include it in a common coverage archive
        for (Reference archiveReference : archiveReferences) {
            try {
                xcrun()
                        .withArgs("xcresulttool", "export")
                        .withArgs("--type", "directory")
                        .withArgs("--path", resultBundle.getAbsolutePath())
                        .withArgs("--id", archiveReference.id)
                        .withArgs("--output-path", coverageArchive.getAbsolutePath())
                        .withTimeoutMillis(COMMAND_TIMEOUT)
                        .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                        .run();
            } catch (Exception e) {
                LOGGER.error("The export for the coverage archive '{}' produced an exception. This exception will be ignored.", archiveReference);
                LOGGER.debug("Exception: {}", e);
            }
        }
    }

    private ProcBuilder xcrun() {
        return new ProcBuilder("xcrun");
    }

}
