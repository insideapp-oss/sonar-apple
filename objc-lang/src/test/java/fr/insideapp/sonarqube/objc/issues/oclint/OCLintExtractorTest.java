package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintExtractor;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;
import org.sonar.api.config.internal.MapSettings;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintExtractorTest {

    private OCLintExtractor extractor;

    @Before
    public void prepare() {
        MapSettings settings = new MapSettings();
        settings.setProperty("sonar.sources", "folder");
        DefaultFileSystem fileSystem = new DefaultFileSystem(new File("/oclint/extractor"));
        extractor = new OCLintExtractor(settings.asConfig(), fileSystem);
    }

    @Test
    public void buildSourceArguments() {
        List<String> arguments = Arrays.asList(extractor.buildSourceArguments());
        assertThat(arguments).hasSize(2);
        assertThat(arguments).element(0).isEqualTo("--include");
        assertThat(arguments).element(1).isEqualTo("/oclint/extractor/folder/.*\\.(h|m|mm)");
    }

}
