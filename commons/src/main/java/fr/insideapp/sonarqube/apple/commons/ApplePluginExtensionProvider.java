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
package fr.insideapp.sonarqube.apple.commons;

import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class ApplePluginExtensionProvider implements ExtensionProvider {

    private static final String WORKSPACE_PATH_KEY = "sonar.apple.workspace";
    private static final PropertyDefinition WORKSPACE_PATH_PROPERTY = PropertyDefinition
            .builder(WORKSPACE_PATH_KEY)
            .name("Xcode Workspace path")
            .description("Path to the project's .xcworkspace file.")
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .build();
    private static final String PROJECT_PATH_KEY = "sonar.apple.project";
    private static final PropertyDefinition PROJECT_PATH_PROPERTY = PropertyDefinition
            .builder(PROJECT_PATH_KEY)
            .name("Xcode Project path")
            .description("Path to the project's .xcodeproj file.")
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                WORKSPACE_PATH_PROPERTY,
                PROJECT_PATH_PROPERTY
        );
    }

    public static Optional<String> workspace(Configuration configuration) {
        return configuration
                .get(WORKSPACE_PATH_KEY);
    }

    public static Optional<String> project(Configuration configuration) {
        return configuration
                .get(PROJECT_PATH_KEY);
    }

}