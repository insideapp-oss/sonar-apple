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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestPlanRunSummaries;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import fr.insideapp.sonarqube.apple.commons.result.models.TestsReference;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;

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

    public ActionTestPlanRunSummaries getTestPlanRunSummaries(File resultBundle, TestsReference testsReference) throws JsonProcessingException {
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

    // Private

    private ProcBuilder xcrun() {
        return new ProcBuilder("xcrun");
    }

}
