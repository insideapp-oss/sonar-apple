package fr.insideapp.sonarqube.swift.lang.tests;

import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SwiftTestFileFinderTest {


    @Test
    public void getUnitTestResource() {

        DefaultFileSystem fs = new DefaultFileSystem(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "swift/main.swift").setLanguage("swift").build();
        fs.add(testFile);

        SwiftTestFileFinder finder = new SwiftTestFileFinder();
        InputFile found = finder.getUnitTestResource(fs, "swift.main");
        assertThat(found).isNotNull();
        assertThat(found.filename()).isEqualTo("main.swift");

    }

    @Test
    public void getUnitTestResourceNotFound() {

        DefaultFileSystem fs = new DefaultFileSystem(new File("src/test/resources"));

        SwiftTestFileFinder finder = new SwiftTestFileFinder();
        InputFile found = finder.getUnitTestResource(fs, "swift.main");
        assertThat(found).isNull();

    }
}
