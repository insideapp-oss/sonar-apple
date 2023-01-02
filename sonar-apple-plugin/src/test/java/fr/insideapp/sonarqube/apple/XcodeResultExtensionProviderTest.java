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
package fr.insideapp.sonarqube.apple;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class XcodeResultExtensionProviderTest {

    private Configuration configuration;
    private XcodeResultExtensionProvider provider;
    private FileSystem fileSystem;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        fileSystem = mock(FileSystem.class);
        provider = new XcodeResultExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(4);
    }

    @Test
    public void resultBundlePath_default() {
        // prepare
        when(configuration.get("sonar.apple.resultBundlePath")).thenReturn(Optional.empty());
        // test
        String resultBundlePath = provider.resultBundlePath(configuration);
        // assert
        assertThat(resultBundlePath).isEqualTo("build/result.xcresult");
    }

    @Test
    public void resultBundlePath_specified() {
        // prepare
        when(configuration.get("sonar.apple.resultBundlePath")).thenReturn(Optional.of("path/to/file.xcresult"));
        // test
        String resultBundlePath = provider.resultBundlePath(configuration);
        // assert
        assertThat(resultBundlePath).contains("path/to/file.xcresult");
    }

    @Test
    public void resultBundle() {
        // prepare
        when(configuration.get("sonar.apple.resultBundlePath")).thenReturn(Optional.of("path/to/file.xcresult"));
        when(fileSystem.baseDir()).thenReturn(new File("/this/is/a/"));
        // test
        File resultBundle = provider.resultBundle(fileSystem, configuration);
        // assert
        assertThat(resultBundle.getAbsolutePath()).contains("this/is/a/path/to/file.xcresult");
    }

}

