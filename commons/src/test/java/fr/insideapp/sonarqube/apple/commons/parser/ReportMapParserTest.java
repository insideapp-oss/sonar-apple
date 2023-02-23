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
package fr.insideapp.sonarqube.apple.commons.parser;

import fr.insideapp.sonarqube.apple.commons.ExceptionHelper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class ReportMapParserTest {

    private ReportMapParser parser;

    @Before
    public void prepare() {
        parser = mock(ReportMapParser.class, Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void parse_failed() throws Exception {
        // prepare
        when(parser.perform(anyString())).thenThrow(ExceptionHelper.build());
        // test
        Map<?, ?> outputs = parser.parse(anyString());
        // assert
        assertThat(outputs).isEmpty();
    }

    @Test
    public void parse_succeed() throws Exception {
        // prepare
        when(parser.perform(anyString())).thenReturn(Map.of("key_parsed", "value_parsed"));
        // test
        Map<?, ?> outputs = parser.parse(anyString());
        // assert
        assertThat(outputs).hasSize(1);
        assertThat(outputs).isEqualTo(Map.of("key_parsed", "value_parsed"));
    }

}
