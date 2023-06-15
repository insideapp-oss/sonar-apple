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

import org.apache.commons.lang3.StringUtils;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public final class QueryParameterUtils {

    private static final Logger LOGGER = Loggers.get(QueryParameterUtils.class);

    private QueryParameterUtils() {}
    public static Map<String, String> parse(String rawQuery) {
        Map<String, String> parameters = new HashMap<>();
        // splitting the query using the separator "&"
        final String[] components = Stream.of(rawQuery.split("&"))
            .filter(StringUtils::isNotEmpty) // remove empty values
            .toArray(String[]::new);
        for(String component: components) {
            // splitting the parameter using the separator "="
            final String[] parameter = Stream.of(component.split("="))
                .filter(StringUtils::isNotEmpty) // remove empty values
                .toArray(String[]::new);
            // get the key and the value
            if (parameter.length == 2) {
                parameters.put(parameter[0], parameter[1]);
            } else {
                LOGGER.debug("Could not retrieve the query parameter data, in component: {}", component);
            }
        }
        return parameters;
    }

}
