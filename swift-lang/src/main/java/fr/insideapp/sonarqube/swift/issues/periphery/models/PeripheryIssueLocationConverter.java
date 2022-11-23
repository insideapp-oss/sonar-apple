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
package fr.insideapp.sonarqube.swift.issues.periphery.models;

import com.fasterxml.jackson.databind.util.StdConverter;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripherySensor;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeripheryIssueLocationConverter extends StdConverter<String, PeripheryIssueLocation> {

    private static final Logger LOGGER = Loggers.get(PeripheryIssueLocationConverter.class);

    private final static String SEPARATOR = ":";

    @Override
    public PeripheryIssueLocation convert(String value) {
        try {
            String[] components = StringUtils.splitByWholeSeparator(value, SEPARATOR);
            String filePath = components[0];
            Integer lineNum = Integer.valueOf(components[1]);
            return new PeripheryIssueLocation(filePath, lineNum);
        } catch (Exception e) {
            LOGGER.error("An exception occurred when parsing Periphery issue location.");
            LOGGER.debug("{}", e);
            return null;
        }
    }
}