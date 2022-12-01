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

public final class OCLintJSONCompilationDatabaseWriterTest {

    private static final String BASE_DIR = "/oclint/writer";

    private OCLintJSONCompilationDatabaseWriter writer;
    private FileSystem fileSystem;
    private File baseFolder;

    @Before
    public void prepare() {
        baseFolder = FileUtils.toFile(getClass().getResource(BASE_DIR));
        fileSystem = new DefaultFileSystem(baseFolder);
        writer = new OCLintJSONCompilationDatabaseWriter(fileSystem);
    }

    @Test
    public void write_success() throws IOException {
        // test
        File compileCommands = writer.write("test");
        // assert
        assertThat(compileCommands.exists()).isTrue();
        assertThat(baseFolder.toPath().relativize(compileCommands.toPath()).toString()).isEqualTo("build/compile_commands.json");
        assertThat(FileUtils.readFileToString(compileCommands, StandardCharsets.UTF_8)).isEqualTo("test");
    }

}
