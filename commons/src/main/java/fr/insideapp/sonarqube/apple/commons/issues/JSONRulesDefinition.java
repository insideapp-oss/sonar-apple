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

import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public abstract class JSONRulesDefinition implements RulesDefinition {


    private static final Logger LOGGER = Loggers.get(JSONRulesDefinition.class);

    private final String repositoryKey;
    private final String repositoryName;
    private final String language;

    private final String jsonResourcePath;

    protected JSONRulesDefinition(String repositoryKey, String repositoryName, String language, String jsonResourcePath) {
        this.repositoryKey = repositoryKey;
        this.repositoryName = repositoryName;
        this.language = language;
        this.jsonResourcePath = jsonResourcePath;
    }

    @Override
    public void define(RulesDefinition.Context context) {
        RulesDefinition.NewRepository repository = context.createRepository(this.repositoryKey, this.language).setName(this.repositoryName);
        RepositoryRuleParser repositoryRuleParser = new RepositoryRuleParser();
        try {
            List<RepositoryRule> repositoryRules = repositoryRuleParser.parse(jsonResourcePath);
            for (RepositoryRule r : repositoryRules) {

                String type = r.getType();
                if (type == null) {
                    type = "CODE_SMELL";
                    LOGGER.warn(String.format("Rule %s has no type, using CODE_SMELL as default", r.getKey()));
                }

                String severity = r.getSeverity();
                if (severity == null) {
                    severity = "MAJOR";
                    LOGGER.warn(String.format("Rule %s has no severity, using MAJOR as default", r.getKey()));
                }

                RulesDefinition.NewRule nr = repository.createRule(r.getKey())
                        .setName(r.getName())
                        .setSeverity(severity)
                        .setType(RuleType.valueOf(type))
                        .setHtmlDescription(r.getDescription());

                if (r.getDebt() != null) {
                    nr.setDebtRemediationFunction(nr.debtRemediationFunctions().constantPerIssue(r.getDebt().getOffset()));
                } else {
                    LOGGER.warn(String.format("Rule %s has no debt information", r.getKey()));
                }

            }
        } catch (IOException e) {
            LOGGER.error(String.format("Failed to load %s rules", this.repositoryName), e);
        }

        repository.done();
    }
}
