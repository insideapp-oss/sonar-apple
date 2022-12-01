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

import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetriever;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetrieverException;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.config.Configuration;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.mockito.Mockito.*;

public final class OCLintJSONCompilationDatabaseFolderRetrieverTest {

    private static final String BASE_DIR = "/oclint/retriever";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private OCLintJSONCompilationDatabaseFolderRetriever retriever;
    private OCLintExtensionProvider provider;

    private Configuration configuration;

    @Before
    public void prepare() {
        provider = mock(OCLintExtensionProvider.class);
        configuration = mock(Configuration.class);
        retriever = new OCLintJSONCompilationDatabaseFolderRetriever(
                provider,
                SensorContextTester.create(baseDir).fileSystem(),
                configuration
        );
    }

    @Test
    public void jsonCompilationDatabaseFolder_does_not_exist() {
        // prepare
        when(provider.jsonCompilationDatabaseFolderPath(configuration)).thenReturn("nonExistingPath");
        // test & assert
        assertThatExceptionOfType(OCLintJSONCompilationDatabaseFolderRetrieverException.class)
                .isThrownBy(() -> { retriever.retrieve(); })
                .withMessage("The JSON Compilation Database folder does not exist.");
    }

    @Test
    public void jsonCompilationDatabaseFolder_not_a_directory() {
        // prepare
        when(provider.jsonCompilationDatabaseFolderPath(configuration)).thenReturn("notAFolder");
        // test & assert
        assertThatExceptionOfType(OCLintJSONCompilationDatabaseFolderRetrieverException.class)
                .isThrownBy(() -> { retriever.retrieve();})
                .withMessage("The JSON Compilation Database is not a folder.");
    }

    @Test
    public void jsonCompilationDatabaseFolder_absolute_path() {
        // prepare
        when(provider.jsonCompilationDatabaseFolderPath(configuration)).thenReturn("/absoluteNonExistingPath");
        // test & assert
        assertThatExceptionOfType(OCLintJSONCompilationDatabaseFolderRetrieverException.class)
                .isThrownBy(() -> { retriever.retrieve(); });
    }

    @Test
    public void jsonCompilationDatabaseFolder_success() {
        // prepare
        when(provider.jsonCompilationDatabaseFolderPath(configuration)).thenReturn("");
        // test & assert
        assertThatCode(() -> { retriever.retrieve(); }).doesNotThrowAnyException();
    }

}
