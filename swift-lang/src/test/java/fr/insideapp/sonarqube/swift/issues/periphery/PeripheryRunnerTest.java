/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.ApplePluginExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.periphery.runner.PeripheryRunner;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class PeripheryRunnerTest {

    private PeripheryRunner runner;

    private Configuration configuration;

    private ApplePluginExtensionProvider applePluginExtensionProvider;
    private PeripheryExtensionProvider peripheryExtensionProvider;
    private Class<? extends PeripheryRunner> clazz;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        applePluginExtensionProvider = mock(ApplePluginExtensionProvider.class);
        peripheryExtensionProvider = mock(PeripheryExtensionProvider.class);
        runner = new PeripheryRunner(configuration, applePluginExtensionProvider, peripheryExtensionProvider);
        clazz = runner.getClass();
    }

    @Test
    public void no_option() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(List.of());
        mockTargets(List.of());
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
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.of("MyProject.xcworkspace"));
        mockSchemes(List.of());
        mockTargets(List.of());
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
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.of("MyProject.xcodeproj"));
        mockSchemes(List.of());
        mockTargets(List.of());
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
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.of("MyProject.xcworkspace"));
        mockProject(Optional.of("MyProject.xcodeproj"));
        mockSchemes(List.of());
        mockTargets(List.of());
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
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(List.of("MyScheme", "MyOtherScheme"));
        mockTargets(List.of());
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--schemes", "MyScheme,MyOtherScheme",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_targets() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(List.of());
        mockTargets(List.of("MyTarget", "MyOtherTarget"));
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--targets", "MyTarget,MyOtherTarget",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_index_store_path() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockWorkspace(Optional.empty());
        mockProject(Optional.empty());
        mockSchemes(List.of());
        mockTargets(List.of());
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
        when(applePluginExtensionProvider.workspace(configuration)).thenReturn(value);
    }

    private void mockProject(Optional<String> value) {
        when(applePluginExtensionProvider.project(configuration)).thenReturn(value);
    }

    private void mockSchemes(List<String> values) {
        when(peripheryExtensionProvider.schemes(configuration)).thenReturn(values);
    }

    private void mockTargets(List<String> values) {
        when(peripheryExtensionProvider.targets(configuration)).thenReturn(values);
    }

    private void mockIndexStorePath(Optional<String> value) {
        when(peripheryExtensionProvider.indexStorePath(configuration)).thenReturn(value);
    }


}
