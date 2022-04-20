package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonaqube.apple.commons.TestFileFinders;
import fr.insideapp.sonaqube.apple.commons.tests.JUnitReportParser;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class JUnitReportParserTest {

    @Test
    public void collect() {

        TestFileFinders.getInstance().reset();
        TestFileFinders.getInstance().addFinder((fileSystem, classname) ->
                new TestInputFileBuilder("", "SQAppTests/SQAppTests.swift").setLanguage("swift").build());

        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        JUnitReportParser parser = new JUnitReportParser(context);
        parser.collect(new File("src/test/resources/tests"));

        assertThat(context.measure(":SQAppTests/SQAppTests.swift", CoreMetrics.TESTS).value()).isEqualTo(4);
    }
}
