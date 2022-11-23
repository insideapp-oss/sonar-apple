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

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParser;
import fr.insideapp.sonarqube.swift.issues.periphery.runner.PeripheryRunner;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class PeripheryExtensionProvider implements ExtensionProvider {

    private static final String CATEGORY = "Periphery";

    private static final String SCHEMES_KEY = "sonar.apple.periphery.schemes";
    private static final PropertyDefinition SCHEMES_PROPERTY = PropertyDefinition
            .builder(SCHEMES_KEY)
            .name("Xcode Schemes")
            .description("Comma-separated list of Xcode Schemes used.")
            .multiValues(true)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    private static final String TARGETS_KEY = "sonar.apple.periphery.targets";
    private static final PropertyDefinition TARGETS_PROPERTY = PropertyDefinition
            .builder(TARGETS_KEY)
            .name("Xcode Targets")
            .description("Comma-separated list of Xcode Targets.")
            .multiValues(true)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    private static final String INDEX_STORE_PATH_KEY = "sonar.apple.periphery.indexStorePath";
    private static final PropertyDefinition INDEX_STORE_PATH_PROPERTY = PropertyDefinition
            .builder(INDEX_STORE_PATH_KEY)
            .name("Index Store folder path")
            .description("Path to Index Store folder.")
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                SCHEMES_PROPERTY,
                TARGETS_PROPERTY,
                INDEX_STORE_PATH_PROPERTY,
                PeripheryRulesDefinition.class,
                PeripheryRunner.class,
                PeripheryReportParser.class,
                PeripheryReportIssueMapper.class,
                PeripherySensor.class
        );
    }

    public static List<String> schemes(Configuration configuration) {
        return Arrays.asList(configuration.getStringArray(SCHEMES_KEY));
    }

    public static List<String> targets(Configuration configuration) {
        return Arrays.asList(configuration.getStringArray(TARGETS_KEY));
    }

    public static Optional<String> indexStorePath(Configuration configuration) {
        return configuration
                .get(INDEX_STORE_PATH_KEY);
    }

}