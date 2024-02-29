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
package fr.insideapp.sonarqube.swift;

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class SwiftTest {

    private Swift swift;
    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        swift = new Swift(configuration);
    }

    @Test
    public void fileSuffixes_default() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsAll(Swift.FILE_SUFFIXES);
    }

    @Test
    public void fileSuffixes_custom() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"foo", "bar"});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsExactlyInAnyOrder("foo", "bar");
    }

    @Test
    public void fileSuffixes_custom_but_not_good() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"", "  "});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsAll(Swift.FILE_SUFFIXES);
    }

    @Test
    public void fileSuffixes_custom_with_spaces() {
        // prepare
        when(configuration.getStringArray(SwiftExtensionProvider.FILE_SUFFIXES_KEY))
            .thenReturn(new String[]{"foo  ", "  bar", "", "  "});
        // test
        final String[] fileSuffixes = swift.getFileSuffixes();
        // prepare
        assertThat(fileSuffixes).containsExactlyInAnyOrder("foo", "bar");
    }

}