package fr.insideapp.sonarqube.swift.lang.antlr;

import fr.insideapp.sonarqube.swift.lang.SwiftSensor;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SourceLinesVisitorTest {

    private final String baseDir = "src/test/resources/swift";
    private static final Logger LOGGER = Loggers.get(SourceLinesVisitorTest.class);

    @Test
    public void visit() throws IOException {

        // the real file
        File file = new File(baseDir, "/test.swift");
        // the "mock" file for test
        InputFile inputFile = new TestInputFileBuilder("", "test.swift")
                .setLanguage("swift")
                .setModuleBaseDir(Paths.get(baseDir))
                .setContents(FileUtils.readFileToString(file, Charset.)
                .build();

        // TODO: remove this log, lines count is good
        LOGGER.warn(String.format("File lines %s", inputFile.lines()));

        SensorContextTester context = SensorContextTester.create(new File(baseDir));
        context.fileSystem().add(inputFile);

        SwiftAntlrContext antlrContext = new SwiftAntlrContext();
        // crashing here
        antlrContext.loadFromFile(inputFile, inputFile.charset());

        /*final SourceLinesVisitor visitor = new SourceLinesVisitor();
        visitor.fillContext(context, antlrContext);

        Measure<Integer> measureNLOC = context.measure(inputFile.key(), CoreMetrics.NCLOC.key());
        assertThat(measureNLOC).isEqualTo(3);*/
    }

}
