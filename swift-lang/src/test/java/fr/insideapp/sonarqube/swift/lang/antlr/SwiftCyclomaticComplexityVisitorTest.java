package fr.insideapp.sonarqube.swift.lang.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.CustomTreeVisitor;
import fr.insideapp.sonarqube.swift.lang.Swift;
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

public class SwiftCyclomaticComplexityVisitorTest {

    private static class Container {
        final String fileName;
        final int complexity;

        public Container(String fileName, int complexity) {
            this.fileName = fileName;
            this.complexity = complexity;
        }
    }

    private static final String BASE_DIR = "src/test/resources/swift/cyclomatic_complexity";
    private SensorContextTester sensorContext;
    private SwiftAntlrContext antlrContext;
    private SwiftCyclomaticComplexityVisitor visitor;
    private CustomTreeVisitor customTreeVisitor;

    @Before
    public void prepare() {
        sensorContext = SensorContextTester.create(new File(BASE_DIR));
        antlrContext = new SwiftAntlrContext();
        visitor = new SwiftCyclomaticComplexityVisitor();
        customTreeVisitor = new CustomTreeVisitor(visitor);
    }

    @Test
    public void testCase1() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase1", 4));
    }

    @Test
    public void testCase2() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase2", 10));
    }

    @Test
    public void testCase3() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase3", 13));
    }

    @Test
    public void testCase4() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase4", 11));
    }

    @Test
    public void testCase5() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase5", 8));
    }

    @Test
    public void testCase6() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase6", 3));
    }

    private void assertContainer(SwiftCyclomaticComplexityVisitorTest.Container container) throws IOException {

        final String completeFileName = container.fileName + "." + Swift.KEY;

        // Real file
        File file = new File(BASE_DIR, completeFileName);

        // Mock file for test purpose
        // Setting it up with the real file properties
        InputFile inputFile = new TestInputFileBuilder("", completeFileName)
                .setLanguage(Swift.KEY)
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();

        // Mock sensor
        sensorContext.fileSystem().add(inputFile);
        antlrContext.loadFromFile(inputFile, inputFile.charset());

        // Running our code
        customTreeVisitor.fillContext(sensorContext, antlrContext);

        // Asserting
        Measure<Integer> measureComplexity = sensorContext.measure(inputFile.key(), CoreMetrics.COMPLEXITY.key());
        assertThat(measureComplexity.value()).isEqualTo(container.complexity);
    }
}
