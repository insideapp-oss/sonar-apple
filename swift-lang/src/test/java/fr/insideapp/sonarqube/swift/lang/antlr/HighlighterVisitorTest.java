package fr.insideapp.sonarqube.swift.lang.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.CustomTreeVisitor;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class HighlighterVisitorTest {

    private static final String TEST_ROOT = "src/test/resources/swift";
    private static final String TEST_FILENAME = "main.swift";

    @Test
    public void fillContext() throws IOException {
        SensorContextTester context = SensorContextTester.create(new File(TEST_ROOT));

        File file = new File(TEST_ROOT, TEST_FILENAME);

        InputFile testFile = new TestInputFileBuilder("foo", TEST_FILENAME)
                .setLanguage("swift")
                .setModuleBaseDir(Paths.get(TEST_ROOT))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();
        context.fileSystem().add(testFile);
        SwiftAntlrContext antlrContext = new SwiftAntlrContext();
        antlrContext.loadFromStreams(
                testFile,
                testFile.inputStream(),
                testFile.inputStream(),
                testFile.charset()
        );

        HighlighterVisitor highlighterVisitor = new HighlighterVisitor();
        CustomTreeVisitor customTreeVisitor = new CustomTreeVisitor(highlighterVisitor);
        customTreeVisitor.fillContext(context, antlrContext);
        assertThat(context.highlightingTypeAt(testFile.key(), 2, 0)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
        assertThat(context.highlightingTypeAt(testFile.key(), 2, 10)).isEmpty();
        assertThat(context.highlightingTypeAt(testFile.key(), 3, 8)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
        assertThat(context.highlightingTypeAt(testFile.key(), 3, 13)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
        assertThat(context.highlightingTypeAt(testFile.key(), 3, 19)).isEmpty();
        assertThat(context.highlightingTypeAt(testFile.key(), 4, 20)).containsExactlyInAnyOrder(TypeOfText.STRING);
    }
}
