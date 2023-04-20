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
package fr.insideapp.sonarqube.objc.issues.warnings;

import fr.insideapp.sonarqube.apple.commons.rules.JSONRulesDefinition;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class XcodeWarningObjectiveCRulesDefinitionTest {

    private JSONRulesDefinition rulesDefinition;
    private ObjectiveC language;
    private RulesDefinition.Context context;

    @Before
    public void prepare() {
        language = new ObjectiveC();
        rulesDefinition = new XcodeWarningObjectiveCRulesDefinition(language);
        context = new RulesDefinition.Context();
    }

    @Test
    public void define() {
        // test
        rulesDefinition.define(context);
        // assert
        RulesDefinition.Repository repository = context.repository("XcodeWarningObjc");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("XcodeWarningObjc");
        assertThat(repository.language()).isEqualTo(language.getKey());
        assertThat(repository.rules()).hasSize(1);
    }
}
