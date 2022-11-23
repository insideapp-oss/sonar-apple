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
