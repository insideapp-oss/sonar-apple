package fr.insideapp.sonarqube.apple.commons.coverage;

import fr.insideapp.sonaqube.apple.commons.coverage.CoberturaReportParser;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CoberturaReportParserTest {

    @Test
    public void collect() {


        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "SQApp/ContentView.swift").setLanguage("swift").setLines(500).build();
        context.fileSystem().add(testFile);

        CoberturaReportParser parser = new CoberturaReportParser(context);
        parser.collect(new File("src/test/resources/coverage"));


        assertThat(context.lineHits(testFile.key(), 14)).isEqualTo(1);
        assertThat(context.lineHits(testFile.key(), 18)).isEqualTo(0);

        assertThat(context.coveredConditions(testFile.key(), 11)).isEqualTo(1);
        assertThat(context.coveredConditions(testFile.key(), 18)).isEqualTo(0);

    }
}
