package fr.insideapp.sonarqube.apple.commons;

import fr.insideapp.sonaqube.apple.commons.TestFileFinder;
import fr.insideapp.sonaqube.apple.commons.TestFileFinders;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestFileFindersTest {

    private static final String TEST_FILENAME = "test.swift";

    @Test
    public void getUnitTestResource() {

        DefaultFileSystem fs = new DefaultFileSystem(new File("."));
        DefaultInputFile testFile = new TestInputFileBuilder("", TEST_FILENAME).setLanguage("swift").build();
        fs.add(testFile);

        TestFileFinders.getInstance().reset();
        TestFileFinders.getInstance().addFinder((fileSystem, classname) -> testFile);

        InputFile found = TestFileFinders.getInstance().getUnitTestResource(fs, "test");
        assertThat(found).isNotNull();
        assertThat(found.language()).isEqualTo("swift");
        assertThat(found.filename()).isEqualTo(TEST_FILENAME);

    }

}
