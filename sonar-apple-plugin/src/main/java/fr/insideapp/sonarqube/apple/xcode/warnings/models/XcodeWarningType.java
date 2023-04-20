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
package fr.insideapp.sonarqube.apple.xcode.warnings.models;

public enum XcodeWarningType {

    // Notes
    NOTE("note"),
    // A warning thrown by the Swift compiler.
    SWIFT_WARNING("swift-compiler-warning");

    public final String identifier;

    private XcodeWarningType(final String identifier) {
        this.identifier = identifier;
    }

    public static XcodeWarningType builder(String type) {
        switch (type) {
            case "Swift Compiler Warning":
                return SWIFT_WARNING;
            default:
                return NOTE;
        }
    }
}