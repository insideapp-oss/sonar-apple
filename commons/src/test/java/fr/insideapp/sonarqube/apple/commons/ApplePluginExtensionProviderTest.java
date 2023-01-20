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
import org.sonar.api.config.Configuration;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class ApplePluginExtensionProviderTest {

    private Configuration configuration;
    private ApplePluginExtensionProvider provider;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        provider = new ApplePluginExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(2);
    }

    @Test
    public void workspace_default() {
        // prepare
        when(configuration.get("sonar.apple.workspace")).thenReturn(Optional.empty());
        // test
        Optional<String> workspace = provider.workspace(configuration);
        // assert
        assertThat(workspace).isNotPresent();
    }

    @Test
    public void workspace_specified() {
        // prepare
        when(configuration.get("sonar.apple.workspace")).thenReturn(Optional.of("MyProject.xcworkspace"));
        // test
        Optional<String> workspace = provider.workspace(configuration);
        // assert
        assertThat(workspace).isPresent();
        assertThat(workspace).contains("MyProject.xcworkspace");
    }

    @Test
    public void project_default() {
        // prepare
        when(configuration.get("sonar.apple.project")).thenReturn(Optional.empty());
        // test
        Optional<String> project = provider.project(configuration);
        // assert
        assertThat(project).isNotPresent();
    }

    @Test
    public void project_specified() {
        // prepare
        when(configuration.get("sonar.apple.project")).thenReturn(Optional.of("MyProject.xcodeproj"));
        // test
        Optional<String> project = provider.project(configuration);
        // assert
        assertThat(project).isPresent();
        assertThat(project).contains("MyProject.xcodeproj");
    }

}
