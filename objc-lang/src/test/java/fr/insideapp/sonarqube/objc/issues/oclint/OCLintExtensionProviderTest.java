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

