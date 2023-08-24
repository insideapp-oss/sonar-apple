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

    private PeripheryExtensionProvider peripheryExtensionProvider;
    private Class<? extends PeripheryRunner> clazz;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        peripheryExtensionProvider = mock(PeripheryExtensionProvider.class);
        runner = new PeripheryRunner(configuration, peripheryExtensionProvider);
        clazz = runner.getClass();
    }

    @Test
    public void no_option() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
        mockIndexStorePath(Optional.empty());
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "scan",
                "--skip-build",
                "--format", "json", "--quiet"
        });
    }

    @Test
    public void options_index_store_path() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("arguments");
        options.setAccessible(true);
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

    private void mockIndexStorePath(Optional<String> value) {
        when(peripheryExtensionProvider.indexStorePath(configuration)).thenReturn(value);
    }


}
