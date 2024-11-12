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
package fr.insideapp.sonarqube.apple.xcode.runner;

import fr.insideapp.sonarqube.apple.commons.result.models.Reference;
import fr.insideapp.sonarqube.apple.xcode.legacy.XcodeResultLegacyRunnable;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class XcodeResultReadObjectRunnerTest {

    private static final String BASE_DIR = "/xcode";

    private XcodeResultLegacyRunnable legacy;
    private XcodeResultReadObjectRunner runner;

    @Before
    public void prepare() {
        legacy = mock(XcodeResultLegacyRunnable.class);
        runner = new XcodeResultReadObjectRunner(legacy);
    }

    @Test
    public void arguments_no_legacy() {
        // When
        when(legacy.check()).thenReturn(false);
        // Then
        String[] options = runner.arguments(new File(BASE_DIR), new Reference("test"));
        // Assert
        assertThat(options).isEqualTo(new String[]{
                "xcresulttool",
                "get",
                "--format", "json",
                "--path", "/xcode",
                "--id", "test"
        });
    }

    @Test
    public void arguments_legacy() {
        // When
        when(legacy.check()).thenReturn(true);
        // Then
        String[] options = runner.arguments(new File(BASE_DIR), new Reference("test"));
        // Assert
        assertThat(options).isEqualTo(new String[]{
                "xcresulttool",
                "get",
                "--format", "json",
                "--path", "/xcode",
                "--id", "test",
                "--legacy"
        });
    }

}
