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
package fr.insideapp.sonarqube.objc.lang.issues;

import fr.insideapp.sonaqube.apple.commons.issues.RepositoryRule;
import fr.insideapp.sonaqube.apple.commons.issues.RepositoryRuleParser;
import fr.insideapp.sonarqube.objc.lang.ObjectiveC;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public class ObjectiveCProfile implements BuiltInQualityProfilesDefinition {

    private static final Logger LOGGER = Loggers.get(ObjectiveCProfile.class);

    public static final String OCLINT_RULES_PATH = "/oclint-rules.json";


    @Override
    public void define(Context context) {

        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("Objective-C", ObjectiveC.KEY);

        // SwiftLint rules
        try {
            RepositoryRuleParser repositoryRuleParser = new RepositoryRuleParser();
            List<RepositoryRule> rules = repositoryRuleParser.parse(OCLINT_RULES_PATH);
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule1 = profile.activateRule("OCLint",r.getKey());
                rule1.overrideSeverity(r.getSeverity());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load OCLint rules", e);
        }

        profile.setDefault(true);
        profile.done();
    }
}
