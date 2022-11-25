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

import org.sonar.api.resources.Language;
import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public abstract class JSONRulesDefinition implements RulesDefinition {

    private static final Logger LOGGER = Loggers.get(JSONRulesDefinition.class);

    public final String repositoryKey;
    public final String repositoryName;
    public final Language language;
    public final String jsonResourcePath;

    protected JSONRulesDefinition(
            final String repositoryKey,
            final String repositoryName,
            final Language language,
            final String jsonResourcePath
    ) {
        this.repositoryKey = repositoryKey;
        this.repositoryName = repositoryName;
        this.language = language;
        this.jsonResourcePath = jsonResourcePath;
    }

    @Override
    public void define(RulesDefinition.Context context) {
        RulesDefinition.NewRepository repository = context.createRepository(this.repositoryKey, this.language.getKey()).setName(this.repositoryName);
        RepositoryRuleParser repositoryRuleParser = new RepositoryRuleParser();
        try {
            List<RepositoryRule> rules = repositoryRuleParser.parse(jsonResourcePath);
            for (RepositoryRule rule : rules) {

                RulesDefinition.NewRule newRule = repository.createRule(rule.key)
                        .setName(rule.name)
                        .setSeverity(rule.severity.name())
                        .setType(RuleType.valueOf(rule.type.name()))
                        .setHtmlDescription(rule.description);
                newRule.setDebtRemediationFunction(newRule.debtRemediationFunctions().constantPerIssue(rule.debt));
            }
        } catch (IOException e) {
            LOGGER.error(String.format("Failed to load %s rules", this.repositoryName), e);
        }
        repository.done();
    }
}
