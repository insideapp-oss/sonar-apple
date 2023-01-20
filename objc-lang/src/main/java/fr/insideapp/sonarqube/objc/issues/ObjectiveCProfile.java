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
package fr.insideapp.sonarqube.objc.issues;

import fr.insideapp.sonarqube.apple.commons.issues.RepositoryRule;
import fr.insideapp.sonarqube.apple.commons.issues.RepositoryRuleParser;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import fr.insideapp.sonarqube.objc.issues.oclint.OCLintRulesDefinition;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public class ObjectiveCProfile implements BuiltInQualityProfilesDefinition {

    private static final Logger LOGGER = Loggers.get(ObjectiveCProfile.class);

    private final MobSFScanObjectiveCRulesDefinition mobSFScanObjectiveCRulesDefinition;

    public ObjectiveCProfile(
            final MobSFScanObjectiveCRulesDefinition mobSFScanObjectiveCRulesDefinition
    ) {
        this.mobSFScanObjectiveCRulesDefinition = mobSFScanObjectiveCRulesDefinition;
    }


    @Override
    public void define(Context context) {

        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("Objective-C", ObjectiveC.KEY);
        RepositoryRuleParser repositoryRuleParser = new RepositoryRuleParser();

        // OCLint rules
        try {
            List<RepositoryRule> rules = repositoryRuleParser.parse(OCLintRulesDefinition.RULES_PATH);
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule1 = profile.activateRule("OCLint", r.key);
                rule1.overrideSeverity(r.severity.name());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load OCLint rules", e);
        }

        // MobSFScan rules (for Objective-C)
        try {
            List<RepositoryRule> rules = repositoryRuleParser.parse(mobSFScanObjectiveCRulesDefinition.getJsonResourcePath());
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule = profile.activateRule(mobSFScanObjectiveCRulesDefinition.getRepositoryName(), r.key);
                rule.overrideSeverity(r.severity.name());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load MobSFScan rules (for Swift)", e);
        }

        profile.setDefault(true);
        profile.done();
    }
}
