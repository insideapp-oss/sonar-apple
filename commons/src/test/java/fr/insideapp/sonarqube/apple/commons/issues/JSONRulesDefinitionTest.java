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

import org.junit.Before;
import org.junit.Test;
import org.sonar.api.resources.AbstractLanguage;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public final class JSONRulesDefinitionTest {

    private JSONRulesDefinition rulesDefinition;
    private RulesDefinition.Context context;

    @Before
    public void prepare() {
        rulesDefinition = new JSONRulesDefinition(
                "rep_key",
                "rep_name",
                new AbstractLanguage("lang") {
                    @Override
                    public String[] getFileSuffixes() {
                        return new String[]{};
                    }
                },
                "/rules/rules.json"
        ) {};
        context = new RulesDefinition.Context();
    }

    @Test
    public void define() {
        // test
        rulesDefinition.define(context);
        // assert
        RulesDefinition.Repository repository = context.repository("rep_key");
        assertThat(repository).isNotNull();
        assertThat(repository.key()).isEqualTo("rep_key");
        assertThat(repository.name()).isEqualTo("rep_name");
        assertThat(repository.language()).isEqualTo("lang");
        assertThat(repository.rules()).hasSize(2);


    }
}
