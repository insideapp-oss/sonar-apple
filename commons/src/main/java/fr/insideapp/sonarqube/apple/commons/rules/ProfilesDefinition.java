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
package fr.insideapp.sonarqube.apple.commons.rules;

import org.sonar.api.resources.Language;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public abstract class ProfilesDefinition implements BuiltInQualityProfilesDefinition {

    private static final Logger LOGGER = Loggers.get(ProfilesDefinition.class);

    private final Language language;
    private final RepositoryRuleParsable parser;
    private final List<? extends JSONRulesDefinition> rulesDefinitions;

    protected ProfilesDefinition(
            final Language language,
            final RepositoryRuleParsable parser,
            final List<? extends JSONRulesDefinition> rulesDefinitions
    ) {
        this.language = language;
        this.parser = parser;
        this.rulesDefinitions = rulesDefinitions;
    }

    @Override
    public void define(Context context) {
        NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile(language.getName(), language.getKey());

        for (JSONRulesDefinition rulesDefinition : rulesDefinitions) {
            try {
                List<RepositoryRule> rules = parser.parse(rulesDefinition.getJsonResourcePath());
                LOGGER.info("Registering {} rules for {}", rules.size(), rulesDefinition.getRepositoryName());
                for (RepositoryRule rule : rules) {
                    BuiltInQualityProfilesDefinition.NewBuiltInActiveRule newRule = profile.activateRule(rulesDefinition.getRepositoryName(), rule.key);
                    newRule.overrideSeverity(rule.severity.name());
                }
                LOGGER.info("Registration completed");
            } catch (IOException e) {
                LOGGER.error("Failed to load rules from {} ({})", rulesDefinition.getJsonResourcePath(), e);
            }
        }

        profile.setDefault(true);
        profile.done();
    }

}