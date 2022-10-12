package fr.insideapp.sonarqube.apple.commons.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.result.models.Record;
import fr.insideapp.sonarqube.apple.commons.result.models.TestsReference;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestPlanRunSummaries;
import fr.insideapp.sonarqube.apple.commons.tests.AppleTestSummary;
import fr.insideapp.sonarqube.apple.commons.tests.AppleTestsParser;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AppleResultExtractorTest {

    @Test
    public void extract() throws Exception {

        // setting up
        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        File buildResult = new File("src/test/resources/tests/result.xcresult");

        DefaultInputFile testFile = new TestInputFileBuilder("", "TestProject/TestProjectUITests/TestProjectUITests.swift").build();
        context.fileSystem().add(testFile);

        // testing
        AppleResultExtractor extractor = new AppleResultExtractor();
        Record record = extractor.getInvocationRecord(buildResult);

        List<AppleTestSummary> summaries = record
                .actions
                .stream()
                .filter(action -> action.result.testsRef != null)
                .map(action -> {
                    TestsReference ref = action.result.testsRef;
                    // TODO: do a function with this try catch
                    try {
                        return extractor.getTestPlanRunSummaries(buildResult, ref);
                    } catch (Exception e) {
                        return null;
                    }
                })
                .filter(testPlanRunSummaries -> testPlanRunSummaries != null)
                .flatMap(testPlanRunSummaries -> testPlanRunSummaries.summaries.stream())
                .flatMap(testPlanRunSummary -> testPlanRunSummary.testableSummaries.stream())
                .map(testableSummary -> { return new AppleTestSummary(testableSummary); })
                .collect(Collectors.toList());

        ObjectMapper objectMapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println("summaries : " + objectMapper.writeValueAsString(summaries));

        AppleTestsParser parser = new AppleTestsParser(context);
        parser.collect(summaries);

    }


}
