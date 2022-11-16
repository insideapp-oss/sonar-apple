package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.objc.helper.ExtensionProviderTestHelper;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.internal.MapSettings;

import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintExtensionProviderTest extends ExtensionProviderTestHelper<OCLintExtensionProvider> {

    private MapSettings settings;

    @Before
    public void prepare() {
        setup(new OCLintExtensionProvider(), 6);
        settings = new MapSettings();
    }

    @Test
    public void jsonCompilationDatabasePath_default() {
        String jsonCompilationDatabasePath = OCLintExtensionProvider.jsonCompilationDatabasePath(settings.asConfig());
        assertThat(jsonCompilationDatabasePath).isEqualTo("build/json_compilation_database");
    }

    @Test
    public void jsonCompilationDatabasePath_specified() {
        String expectedCustomPath = "this/is/a/path";
        settings.setProperty("sonar.apple.jsonCompilationDatabasePath", expectedCustomPath);
        String jsonCompilationDatabasePath = OCLintExtensionProvider.jsonCompilationDatabasePath(settings.asConfig());
        assertThat(jsonCompilationDatabasePath).isEqualTo(expectedCustomPath);
    }

}

