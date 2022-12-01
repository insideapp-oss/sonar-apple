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

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.objc.issues.oclint.builder.OCLintJSONCompilationDatabaseBuilder;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintExtractor;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintReportParser;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetriever;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public class OCLintExtensionProvider implements ExtensionProvider {

    private static final String JSON_COMPILATION_DATABASE_KEY = "sonar.apple.jsonCompilationDatabasePath";
    private static final String DEFAULT_JSON_COMPILATION_DATABASE_PATH = "build/json_compilation_database";
    private static final PropertyDefinition JSON_COMPILATION_DATABASE_PROPERTY = PropertyDefinition
            .builder(JSON_COMPILATION_DATABASE_KEY)
            .name("JSON Compilation Database path")
            .description("Path to JSON Compilation Database folder. The path may be either absolute or relative to the project base directory.")
            .defaultValue(DEFAULT_JSON_COMPILATION_DATABASE_PATH)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory("OCLint")
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                JSON_COMPILATION_DATABASE_PROPERTY,
                OCLintRulesDefinition.class,
                OCLintJSONCompilationDatabaseFolderRetriever.class,
                OCLintJSONCompilationDatabaseBuilder.class,
                OCLintExtractor.class,
                OCLintReportParser.class,
                OCLintSensor.class
        );
    }

    public String jsonCompilationDatabasePath(Configuration configuration) {
        return configuration
                .get(JSON_COMPILATION_DATABASE_KEY)
                .orElse(DEFAULT_JSON_COMPILATION_DATABASE_PATH);
    }

}
