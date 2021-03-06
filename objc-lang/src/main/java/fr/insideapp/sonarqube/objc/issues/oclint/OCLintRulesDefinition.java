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

import fr.insideapp.sonarqube.apple.commons.issues.JSONRulesDefinition;
import fr.insideapp.sonarqube.objc.ObjectiveC;

public class OCLintRulesDefinition extends JSONRulesDefinition {
    public static final String REPOSITORY_KEY = "OCLint";
    public static final String REPOSITORY_NAME = REPOSITORY_KEY;

    public static final String RULES_PATH = "/oclint-rules.json";

    public OCLintRulesDefinition() {
        super(REPOSITORY_KEY, REPOSITORY_NAME, ObjectiveC.KEY, RULES_PATH);
    }
}
