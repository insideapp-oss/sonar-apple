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

import fr.insideapp.sonarqube.apple.commons.SonarProjectConfiguration;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.oclint.runner.OCLintRunner;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.internal.DefaultFileSystem;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class OCLintRunnerTest {

    private static final String BASE_DIR = "/oclint/runner";

    private OCLintRunner runner;
    private SonarProjectConfiguration sonarProjectConfiguration;
    private OCLintExtensionProvider ocLintExtensionProvider;
    private FileSystem fileSystem;

    private Class<? extends OCLintRunner> clazz;

    @Before
    public void prepare() {
        sonarProjectConfiguration = mock(SonarProjectConfiguration.class);
        ocLintExtensionProvider = mock(OCLintExtensionProvider.class);
        fileSystem = new DefaultFileSystem(new File(BASE_DIR));
        runner = new OCLintRunner(sonarProjectConfiguration, ocLintExtensionProvider, new ObjectiveC(), fileSystem);
        clazz = runner.getClass();
    }

    @Test
    public void option_no_sources() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockSources(List.of());
        mockJSONCompilationDatabase(new File("/a/path/to","database.json"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "-p", "/a/path/to",
                "--",
                "-report-type", "json"
        });
    }

    @Test
    public void option_one_source() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockSources(List.of("source"));
        mockJSONCompilationDatabase(new File("/a/path/to","database.json"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "--include", "/oclint/runner/source/.*\\.(h|m|mm)",
                "-p", "/a/path/to",
                "--",
                "-report-type", "json"
        });
    }

    @Test
    public void option_two_sources() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method options = clazz.getDeclaredMethod("options");
        options.setAccessible(true);
        mockSources(List.of("source1", "source2"));
        mockJSONCompilationDatabase(new File("/a/path/to","database.json"));
        String[] optionsBuilt = (String[]) options.invoke(runner);
        assertThat(optionsBuilt).isEqualTo(new String[]{
                "--include", "/oclint/runner/source1/.*\\.(h|m|mm)",
                "--include", "/oclint/runner/source2/.*\\.(h|m|mm)",
                "-p", "/a/path/to",
                "--",
                "-report-type", "json"
        });
    }

    // Private

    private void mockSources(List<String> values) {
        when(sonarProjectConfiguration.sources()).thenReturn(values);
    }

    private void mockJSONCompilationDatabase(File file) {
        when(ocLintExtensionProvider.jsonCompilationDatabasePath(fileSystem)).thenReturn(file);
    }

}
