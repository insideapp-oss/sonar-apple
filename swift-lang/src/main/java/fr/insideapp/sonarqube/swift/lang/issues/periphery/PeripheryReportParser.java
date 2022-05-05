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
package fr.insideapp.sonarqube.swift.lang.issues.periphery;

import fr.insideapp.sonarqube.swift.lang.issues.RegexReportParser;

import java.util.regex.Matcher;

public class PeripheryReportParser extends RegexReportParser {

    public PeripheryReportParser() {
        super("(.*.swift):(\\w+):(\\w+): (warning): (.*)");
    }

    @Override
    public String ruleId(Matcher matcher) {
        // periphery doesn't provide the ruleId at the moment
        return "unused";
    }
}