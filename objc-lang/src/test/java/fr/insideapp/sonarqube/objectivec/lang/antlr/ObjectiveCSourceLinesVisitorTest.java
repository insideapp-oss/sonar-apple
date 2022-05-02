package fr.insideapp.sonarqube.objectivec.lang.antlr;

import fr.insideapp.sonarqube.objc.lang.ObjectiveC;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCAntlrContext;
import fr.insideapp.sonarqube.objc.lang.antlr.ObjectiveCSourceLinesVisitor;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ObjectiveCSourceLinesVisitorTest {


    private static class Container {
        final String fileName;
        final int linesOfCode;
        final int linesOfComment;

        public Container(String fileName, int linesOfCode, int linesOfComment) {
            this.fileName = fileName;
            this.linesOfCode = linesOfCode;
            this.linesOfComment = linesOfComment;
        }
    }

    private static final String BASE_DIR = "src/test/resources/objc/source_lines_visitor";
    private SensorContextTester sensorContext;
    private ObjectiveCAntlrContext antlrContext;
    private ObjectiveCSourceLinesVisitor visitor;

    @Before
    public void prepare() {
        sensorContext = SensorContextTester.create(new File(BASE_DIR));
        antlrContext = new ObjectiveCAntlrContext();
        visitor = new ObjectiveCSourceLinesVisitor();
    }

    @Test
    public void testNoComment() throws IOException {
        assertContainer(new Container("NoComment", 7, 0));
    }

    @Test
    public void testNoCode() throws IOException {
        assertContainer(new Container("NoCode", 0, 1));
    }

    @Test
    public void testEmpty() throws IOException {
        assertContainer(new Container("Empty", 0, 0));
    }

    @Test
    public void testLineWithMixedCodeComment() throws IOException {
        assertContainer(new Container("LineWithMixedCodeComment", 3, 0));
    }

    @Test
    public void testWhiteLineIgnored() throws IOException {
        assertContainer(new Container("WhiteLineIgnored", 7, 1));
    }

    private void assertContainer(Container container) throws IOException {

        final String completeFileName = container.fileName + ".m";

        // Real file
        File file = new File(BASE_DIR, completeFileName);

        // Mock file for test purpose
        // Setting it up with the real file properties
        InputFile inputFile = new TestInputFileBuilder("", completeFileName)
                .setLanguage(ObjectiveC.KEY)
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();

        // Mock sensor
        sensorContext.fileSystem().add(inputFile);
        antlrContext.loadFromFile(inputFile, inputFile.charset());

        // Running our code
        visitor.fillContext(sensorContext, antlrContext);

        // Asserting
        Measure<Integer> measureNLOC = sensorContext.measure(inputFile.key(), CoreMetrics.NCLOC.key());
        assertThat(measureNLOC.value()).isEqualTo(container.linesOfCode);
        Measure<Integer> measureNCOMMENTS = sensorContext.measure(inputFile.key(), CoreMetrics.COMMENT_LINES.key());
        assertThat(measureNCOMMENTS.value()).isEqualTo(container.linesOfComment);
    }
}
