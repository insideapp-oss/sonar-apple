package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.swift.issues.periphery.runner.PeripheryRunner;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class PeripheryRunnerTest {

    private PeripheryRunner runner;
    private Configuration configuration;
    private Class<? extends PeripheryRunner> clazz;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        runner = new PeripheryRunner(
                configuration
        );
        clazz = runner.getClass();
    }

    @Test
    public void no_option() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(new String[]{});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_with_workspace() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.of("MyProject.xcworkspace"));
        mockSchemes(new String[]{});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--workspace", "MyProject.xcworkspace",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_with_project() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.of("MyProject.xcodeproj"));
        mockSchemes(new String[]{});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--project", "MyProject.xcodeproj",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_with_workspace_and_project() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.of("MyProject.xcworkspace"));
        mockProject(Optional.of("MyProject.xcodeproj"));
        mockSchemes(new String[]{});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--workspace", "MyProject.xcworkspace",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_schemes() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(new String[]{"MyScheme"});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--schemes", "MyScheme",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_targets() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(new String[]{});
        mockTargets(new String[]{"MyTarget"});
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--targets", "MyTarget",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_index_store_path() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(new String[]{});
        mockTargets(new String[]{});
        mockIndexStorePath(Optional.of("/path/to/index/store"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--skip-build",
                "--index-store-path", "/path/to/index/store",
                "--format", "json", "--quiet"
        });
    }

    // Private

    private void mockWorkspace(Optional<String> value) {
        when(configuration.get("sonar.apple.workspace")).thenReturn(value);
    }

    private void mockProject(Optional<String> value) {
        when(configuration.get("sonar.apple.project")).thenReturn(value);
    }

    private void mockSchemes(String[] values) {
        when(configuration.getStringArray("sonar.apple.periphery.schemes")).thenReturn(values);
    }

    private void mockTargets(String[] values) {
        when(configuration.getStringArray("sonar.apple.periphery.targets")).thenReturn(values);
    }

    private void mockIndexStorePath(Optional<String> value) {
        when(configuration.get("sonar.apple.periphery.indexStorePath")).thenReturn(value);
    }


}
