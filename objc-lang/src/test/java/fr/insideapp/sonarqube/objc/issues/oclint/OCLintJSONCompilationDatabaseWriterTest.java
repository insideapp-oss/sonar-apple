package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.objc.issues.oclint.writer.OCLintJSONCompilationDatabaseWriter;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class OCLintJSONCompilationDatabaseWriterTest {

    private static final String BASE_DIR = "/oclint/writer";

    private OCLintJSONCompilationDatabaseWriter writer;
    private OCLintExtensionProvider ocLintExtensionProvider;
    private FileSystem fileSystem;
    private File baseFolder;

    @Before
    public void prepare() {
        baseFolder = FileUtils.toFile(getClass().getResource(BASE_DIR));
        fileSystem = new DefaultFileSystem(baseFolder);
        ocLintExtensionProvider = mock(OCLintExtensionProvider.class);
        writer = new OCLintJSONCompilationDatabaseWriter(ocLintExtensionProvider, fileSystem);
    }

    @Test
    public void write_success() throws IOException {
        // prepare
        File jsonCompilationDatabase = new File(baseFolder, "json_compilation_test.json");
        when(ocLintExtensionProvider.jsonCompilationDatabasePath(fileSystem)).thenReturn(jsonCompilationDatabase);
        // test
        boolean success = writer.write("test");
        // assert
        assertThat(success).isTrue();
        assertThat(jsonCompilationDatabase.exists()).isTrue();
        assertThat(baseFolder.toPath().relativize(jsonCompilationDatabase.toPath()).toString()).isEqualTo("json_compilation_test.json");
        assertThat(FileUtils.readFileToString(jsonCompilationDatabase, StandardCharsets.UTF_8)).isEqualTo("test");
    }

    @Test
    public void write_fail() {
        // prepare
        File jsonCompilationDatabase = new File("/non_existing_folder/file.json");
        when(ocLintExtensionProvider.jsonCompilationDatabasePath(fileSystem)).thenReturn(jsonCompilationDatabase);
        // test
        boolean success = writer.write("test");
        // assert
        assertThat(success).isFalse();
        assertThat(jsonCompilationDatabase.exists()).isFalse();
    }

}
