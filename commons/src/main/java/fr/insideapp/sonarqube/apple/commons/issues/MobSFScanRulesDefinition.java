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
package fr.insideapp.sonarqube.apple.commons.issues;

import org.apache.commons.lang3.StringUtils;
import org.sonar.api.resources.Language;

import java.io.File;

public abstract class MobSFScanRulesDefinition extends JSONRulesDefinition {

    private static String REPOSITORY_KEY = "MobSFScan";

    protected static String RULES_PATH = "/mobsfscan/rules.json";

    protected MobSFScanRulesDefinition(Language language) {
        super(repository(language), repository(language), language, RULES_PATH);
    }

    private static String repository(Language language) {
        return REPOSITORY_KEY + StringUtils.capitalize(language.getKey());
    }

}
