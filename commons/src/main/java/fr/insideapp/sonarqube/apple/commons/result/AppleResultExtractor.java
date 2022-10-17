package fr.insideapp.sonarqube.apple.commons.result;

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

    public Record getInvocationRecord(File resultBundle) throws Exception {
        // get the raw data of the build result as JSON
        String xcresultData = xcrun()
                .withArgs("xcresulttool", "get", "--format", "json")
                .withArgs("--path", resultBundle.getAbsolutePath())
                .withTimeoutMillis(COMMAND_TIMEOUT)
                .withExpectedExitStatuses(COMMAND_EXIT_CODE)
                .run()
                .getOutputString();

        Record record = objectMapper.readValue(xcresultData, Record.class);
        LOGGER.debug("Record actions : {}", record.actions.size());
        return record;
    }

    public ActionTestPlanRunSummaries getTestPlanRunSummaries(File resultBundle, TestsReference testsReference) throws Exception {
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
