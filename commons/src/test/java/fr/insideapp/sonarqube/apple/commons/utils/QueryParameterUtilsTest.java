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
package fr.insideapp.sonarqube.apple.commons.utils;

import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public final class QueryParameterUtilsTest {

    @Test
    public void parse_empty_failure() {
        parse_failure("");
    }

    @Test
    public void parse_only_ampersand_failure() {
        parse_failure("&");
    }

    @Test
    public void parse_only_missing_key_failure() {
        parse_failure("=value");
    }

    @Test
    public void parse_only_missing_value_failure() {
        parse_failure("key=");
    }

    public void parse_failure(String rawQuery) {
        // test
        final Map<String, String> parameters = QueryParameterUtils.parse(rawQuery);
        // assert
        assertThat(parameters).isEmpty();
    }

    @Test
    public void parse_only_oneValue_success() {
        // test
        final Map<String, String> parameters = QueryParameterUtils.parse("key=value");
        // assert
        assertThat(parameters).hasSize(1);
        assertThat(parameters).containsEntry("key", "value");
    }

    @Test
    public void parse_only_twoValues_success() {
        // test
        final Map<String, String> parameters = QueryParameterUtils.parse("key1=value1&key2=value2");
        // assert
        assertThat(parameters).hasSize(2);
        assertThat(parameters).containsEntry("key1", "value1");
        assertThat(parameters).containsEntry("key2", "value2");
    }

}
