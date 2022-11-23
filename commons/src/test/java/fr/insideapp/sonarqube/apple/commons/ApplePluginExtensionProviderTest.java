package fr.insideapp.sonarqube.apple.commons;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.internal.MapSettings;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public final class ApplePluginExtensionProviderTest {

    private MapSettings settings;
    private ExtensionProvider provider;

    @Before
    public void prepare() {
        provider = new ApplePluginExtensionProvider();
        settings = new MapSettings();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(2);
    }

    @Test
    public void workspace_default() {
        Optional<String> workspace = ApplePluginExtensionProvider.workspace(settings.asConfig());
        assertThat(workspace).isEqualTo(Optional.empty());
    }

    @Test
    public void workspace_specified() {
        String expectedCustomWorkspace = "MyProject.xcworkspace";
        settings.setProperty("sonar.apple.workspace", expectedCustomWorkspace);
        Optional<String> workspace = ApplePluginExtensionProvider.workspace(settings.asConfig());
        assertThat(workspace.isPresent()).isTrue();
        assertThat(workspace.get()).isEqualTo(expectedCustomWorkspace);
    }

    @Test
    public void project_default() {
        Optional<String> project = ApplePluginExtensionProvider.project(settings.asConfig());
        assertThat(project).isEqualTo(Optional.empty());
    }

    @Test
    public void project_specified() {
        String expectedCustomProject = "MyProject.xcodeproj";
        settings.setProperty("sonar.apple.project", expectedCustomProject);
        Optional<String> project = ApplePluginExtensionProvider.project(settings.asConfig());
        assertThat(project.isPresent()).isTrue();
        assertThat(project.get()).isEqualTo(expectedCustomProject);
    }

}
