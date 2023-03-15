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

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.swift.antlr.SwiftAntlrContext;
import fr.insideapp.sonarqube.swift.antlr.SwiftCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.swift.antlr.SwiftHighlighterVisitor;
import fr.insideapp.sonarqube.swift.antlr.SwiftSourceLinesVisitor;
import fr.insideapp.sonarqube.swift.issues.SwiftProfile;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public class SwiftExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
                Swift.class,
                SwiftAntlrContext.class,
                SwiftSourceLinesVisitor.class,
                SwiftHighlighterVisitor.class,
                SwiftCyclomaticComplexityVisitor.class,
                SwiftSensor.class,
                SwiftProfile.class
        );
    }

}