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
package fr.insideapp.sonarqube.objc.issues.oclint;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class OCLintExtensionProviderTest {

    private Configuration configuration;
    private OCLintExtensionProvider provider;
    private FileSystem fileSystem;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        fileSystem = mock(FileSystem.class);
        provider = new OCLintExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(9);
    }

    @Test
    public void jsonCompilationDatabaseFolderPath_default() {
        // prepare
        when(configuration.get("sonar.apple.jsonCompilationDatabasePath")).thenReturn(Optional.empty());
        // test
        String jsonCompilationDatabasePath = provider.jsonCompilationDatabaseFolderPath(configuration);
        // assert
        assertThat(jsonCompilationDatabasePath).isEqualTo("build/json_compilation_database");
    }

    @Test
    public void jsonCompilationDatabaseFolderPath_specified() {
        // prepare
        when(configuration.get("sonar.apple.jsonCompilationDatabasePath")).thenReturn(Optional.of("this/is/a/path"));
        // test
        String jsonCompilationDatabasePath = provider.jsonCompilationDatabaseFolderPath(configuration);
        // assert
        assertThat(jsonCompilationDatabasePath).contains("this/is/a/path");
    }

    @Test
    public void jsonCompilationDatabasePath() {
        // prepare
        when(fileSystem.baseDir()).thenReturn(new File("/this/is/a/path"));
        // test
        File jsonCompilationDatabase = provider.jsonCompilationDatabasePath(fileSystem);
        // assert
        assertThat(jsonCompilationDatabase.getAbsolutePath()).contains("this/is/a/path/compile_commands.json");
    }

}

