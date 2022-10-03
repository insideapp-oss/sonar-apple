package fr.insideapp.sonarqube.apple.commons.coverage;

import org.json.JSONObject;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleCoverageExtractorTest {

    @Test
    public void extract() {

        // setting up
        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        File buildResult = new File("src/test/resources/coverage/build_result.xcresult");

        // testing
        AppleCoverageExtractor extractor = new AppleCoverageExtractor(context);
        JSONObject xccovJSON = extractor.extract(buildResult);

        // asserting
        assertThat(xccovJSON.keySet().size()).isEqualTo(4);
    }

}
