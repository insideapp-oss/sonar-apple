package fr.insideapp.sonarqube.apple.commons.surefire;

import fr.insideapp.sonaqube.apple.commons.TestFileFinder;
import fr.insideapp.sonaqube.apple.commons.TestFileFinders;
import fr.insideapp.sonaqube.apple.commons.surefire.SurefireReportParser;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SurefireReportParserTest {

    @Test
    public void collect() {

        TestFileFinders.getInstance().reset();
        TestFileFinders.getInstance().addFinder((fileSystem, classname) ->
                new TestInputFileBuilder("", "SQAppTests/SQAppTests.swift").setLanguage("swift").build());

        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        SurefireReportParser parser = new SurefireReportParser(context);
        parser.collect(new File("src/test/resources/tests"));

        assertThat(context.measure(":SQAppTests/SQAppTests.swift", CoreMetrics.TESTS).value()).isEqualTo(4);
    }
}
