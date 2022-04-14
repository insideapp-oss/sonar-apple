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
package fr.insideapp.sonaqube.apple;

import fr.insideapp.sonarqube.swift.lang.Swift;
import fr.insideapp.sonarqube.swift.lang.SwiftSensor;
import fr.insideapp.sonarqube.swift.lang.issues.SwiftProfile;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintSensor;
import org.sonar.api.Plugin;

public class ApplePlugin implements Plugin {

    @Override
    public void define(Context context) {

        // Language support
        context.addExtensions(Swift.class, SwiftSensor.class , SwiftProfile.class);

        // SwiftLint
        context.addExtensions(SwiftLintSensor.class, SwiftLintRulesDefinition.class);
    }
}
