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
package fr.insideapp.sonarqube.objc;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCAntlrContext;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCHighlighterVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCSourceLinesVisitor;
import fr.insideapp.sonarqube.objc.issues.ObjectiveCProfile;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ScannerSide
public class ObjectiveCExtensionProvider implements ExtensionProvider {

    public static final String FILE_SUFFIXES_KEY = "sonar.objc.file.suffixes";

    private static final PropertyDefinition FILE_SUFFIXES = PropertyDefinition
        .builder(FILE_SUFFIXES_KEY)
        .name("File Suffixes")
        .description("List of suffixes of Objective-C files to analyze.")
        .multiValues(true)
        .category(APPLE_CATEGORY)
        .subCategory("Objective-C")
        .onQualifiers(Qualifiers.PROJECT)
        .defaultValue(ObjectiveC.FILE_SUFFIXES.stream().collect(Collectors.joining(",")))
        .build();

    public List<Object> extensions() {
        return Arrays.asList(
                ObjectiveC.class,
            FILE_SUFFIXES,
                ObjectiveCAntlrContext.class,
                ObjectiveCSourceLinesVisitor.class,
                ObjectiveCHighlighterVisitor.class,
                ObjectiveCCyclomaticComplexityVisitor.class,
                ObjectiveCSensor.class,
                ObjectiveCProfile.class
        );
    }

}