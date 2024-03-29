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
package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.rules.JSONRulesDefinition;
import fr.insideapp.sonarqube.swift.Swift;
import org.sonar.api.scanner.ScannerSide;


@ScannerSide
public class SwiftLintRulesDefinition extends JSONRulesDefinition {

    private static final String REPOSITORY_KEY = "SwiftLint";
    private static final String REPOSITORY_NAME = REPOSITORY_KEY;

    private static final String RULES_PATH = "/swiftlint/rules.json";

    public SwiftLintRulesDefinition(
            Swift swift
    ) {
        super(REPOSITORY_KEY, REPOSITORY_NAME, swift, RULES_PATH);
    }

}
