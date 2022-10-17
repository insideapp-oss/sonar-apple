package fr.insideapp.sonarqube.apple.commons.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public class AppleTestsExtractorTest {

    private static final String BASE_DIR = "src/test/resources/tests";

    private static final String ACTION_TESTABLE_SUMMARY = "actionTestableSummary.json";
    private static final String APPLE_TEST_GROUPS = "appleTestGroups.json";

    private AppleTestsExtractor extractor;
    private File actionTestableSummaryFile;
    private File appleTestGroupsFile;

    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        extractor = new AppleTestsExtractor();
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
        actionTestableSummaryFile = new File(BASE_DIR + "/" + ACTION_TESTABLE_SUMMARY);
        appleTestGroupsFile = new File(BASE_DIR + "/" + APPLE_TEST_GROUPS);
    }

    @Test
    public void extract() throws IOException {
        // preparation
        String actionTestableSummaryJSON = FileUtils.readFileToString(actionTestableSummaryFile, Charset.defaultCharset());
        ActionTestableSummary actionTestableSummary = objectMapper.readValue(actionTestableSummaryJSON, ActionTestableSummary.class);
        // testing
        List<AppleTestGroup> testGroups = extractor.extract(actionTestableSummary);
        // asserting
        assertThat(testGroups).hasSize(2);
        String testGroupsJSON = objectMapper.writeValueAsString(testGroups);
        String expectedTestGroupsJSON = FileUtils.readFileToString(appleTestGroupsFile, Charset.defaultCharset());
        assertThat(testGroupsJSON).isEqualTo(expectedTestGroupsJSON);
    }
}