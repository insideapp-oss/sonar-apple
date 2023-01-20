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
package fr.insideapp.sonarqube.swift.issues;

import fr.insideapp.sonarqube.apple.commons.issues.*;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.issues.mobsfscan.MobSFScanSwiftRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintRulesDefinition;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public class SwiftProfile implements BuiltInQualityProfilesDefinition {

    private static final Logger LOGGER = Loggers.get(SwiftProfile.class);

    @Override
    public void define(Context context) {

        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("Swift", Swift.KEY);
        RepositoryRuleParser repositoryRuleParser = new RepositoryRuleParser();

        // SwiftLint rules
        try {
            List<RepositoryRule> rules = repositoryRuleParser.parse(SwiftLintRulesDefinition.RULES_PATH);
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule1 = profile.activateRule("SwiftLint", r.key);
                rule1.overrideSeverity(r.severity.name());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load SwiftLint rules", e);
        }

        // MobSFScan rules (for Swift)
        try {
            MobSFScanRulesDefinition rulesDefinition = new MobSFScanSwiftRulesDefinition();
            List<RepositoryRule> rules = repositoryRuleParser.parse(rulesDefinition.rulesPath());
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule = profile.activateRule(rulesDefinition.repository(), r.key);
                rule.overrideSeverity(r.severity.name());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load MobSFScan rules (for Swift)", e);
        }

        // Periphery rules
        try {
            List<RepositoryRule> rules = repositoryRuleParser.parse(PeripheryRulesDefinition.RULES_PATH);
            for (RepositoryRule r: rules) {
                NewBuiltInActiveRule rule = profile.activateRule("Periphery", r.key);
                rule.overrideSeverity(r.severity.name());
            }
        } catch (IOException e) {
            LOGGER.error("Failed to load Periphery rules", e);
        }

        profile.setDefault(true);
        profile.done();
    }
}
