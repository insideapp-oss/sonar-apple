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

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.config.Configuration;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class PeripheryExtensionProviderTest {

    private PeripheryExtensionProvider provider;
    private Configuration configuration;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        provider = new PeripheryExtensionProvider();
    }

    @Test
    public void extensions() {
        assertThat(provider.extensions()).hasSize(6);
    }

    @Test
    public void indexStorePath_notSpecified() {
        // prepare
        when(configuration.get("sonar.apple.periphery.indexStorePath")).thenReturn(Optional.empty());
        // test
        Optional<String> indexStorePath = provider.indexStorePath(configuration);
        // assert
        assertThat(indexStorePath).isNotPresent();
    }

    @Test
    public void indexStorePath_specified() {
        // prepare
        when(configuration.get("sonar.apple.periphery.indexStorePath")).thenReturn(Optional.of("/path/to/indexStore"));
        // test
        Optional<String> indexStorePath = provider.indexStorePath(configuration);
        // assert
        assertThat(indexStorePath).isPresent().contains("/path/to/indexStore");
    }

}

