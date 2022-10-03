package fr.insideapp.sonarqube.apple.commons.coverage;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleCoverageParserTest {

    @Test
    public void collect() throws IOException {

        // setting up
        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "SQApp/ContentView.swift").setLanguage("swift").setLines(500).build();
        context.fileSystem().add(testFile);
        File xccov = new File("src/test/resources/coverage/xccov.json");
        String data = FileUtils.readFileToString(xccov, StandardCharsets.UTF_8);
        JSONObject xccovJSON = new JSONObject(data);

        // testing
        AppleCoverageParser parser = new AppleCoverageParser(context);
        parser.collect(xccovJSON);

        // asserting
        assertThat(context.lineHits(testFile.key(), 1)).isNull();
        assertThat(context.lineHits(testFile.key(), 2)).isEqualTo(0);
        assertThat(context.lineHits(testFile.key(), 3)).isEqualTo(1);
        assertThat(context.lineHits(testFile.key(), 4)).isEqualTo(Integer.MAX_VALUE);
    }

}
