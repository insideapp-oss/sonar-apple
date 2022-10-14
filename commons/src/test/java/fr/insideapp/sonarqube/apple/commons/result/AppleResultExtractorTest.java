package fr.insideapp.sonarqube.apple.commons.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestPlanRunSummaries;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import fr.insideapp.sonarqube.apple.commons.result.models.TestsReference;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleResultExtractorTest {

    private static final String BASE_DIR = "src/test/resources/result";
    private static final String XCRESULT = "build_result.xcresult";

    private static final String RECORD = "record.json";
    private static final String TEST_PLAN_RUN_SUMMARIES = "testPlanRunSummaries.json";

    private AppleResultExtractor extractor;
    private File xcResultFile;
    private File recordFile;
    private File testPlanRunSummariesFile;

    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        extractor = new AppleResultExtractor();
        xcResultFile = new File(BASE_DIR + "/" + XCRESULT);
        recordFile = new File(BASE_DIR + "/" + RECORD);
        testPlanRunSummariesFile = new File(BASE_DIR + "/" + TEST_PLAN_RUN_SUMMARIES);
        objectMapper = new ObjectMapper();
    }

    @Test
    public void getInvocationRecord() throws Exception {
        // testing
        Record record = extractor.getInvocationRecord(xcResultFile);
        // asserting
        assertThat(record.actions).hasSize(1);
        String recordJSON = objectMapper.writeValueAsString(record);
        String expectedRecordJSON = FileUtils.readFileToString(recordFile, Charset.defaultCharset());
        assertThat(recordJSON).isEqualTo(expectedRecordJSON);
    }

    @Test
    public void getTestPlanRunSummaries() throws Exception {
        // testing
        TestsReference testsReference = new TestsReference("0~m9DIsSMOze2hPaUjj05tADpExiLKX76uGKA8oO8pp61yQVf9PI8YVbMmPmM17yweqkmrgRVbDkjyPqnTCSbxsA==");
        ActionTestPlanRunSummaries testPlanRunSummaries = extractor.getTestPlanRunSummaries(xcResultFile, testsReference);
        // asserting
        assertThat(testPlanRunSummaries.summaries).hasSize(1);
        String testPlanRunSummariesJSON = objectMapper.writeValueAsString(testPlanRunSummaries);
        String expectedTestPlanRunSummaries = FileUtils.readFileToString(testPlanRunSummariesFile, Charset.defaultCharset());
        assertThat(testPlanRunSummariesJSON).isEqualTo(expectedTestPlanRunSummaries);
    }

}
