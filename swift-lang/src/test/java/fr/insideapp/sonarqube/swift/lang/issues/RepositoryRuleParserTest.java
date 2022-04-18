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
package fr.insideapp.sonarqube.swift.lang.issues;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositoryRuleParserTest {

    @Test
    public void parse() throws Throwable {

        RepositoryRuleParser parser = new RepositoryRuleParser();
        ArrayList<RepositoryRule> repositoryRules = parser.parse("/rules/rules.json");
        assertThat(repositoryRules.size()).isEqualTo(2);

        RepositoryRule repositoryRule1 = repositoryRules.get(0);
        assertThat(repositoryRule1.getKey()).isEqualTo("rule1");
        assertThat(repositoryRule1.getName()).isEqualTo("Rule 1");
        assertThat(repositoryRule1.getDescription()).isEqualTo("This is rule 1.");
        assertThat(repositoryRule1.getSeverity()).isEqualTo("MINOR");
        assertThat(repositoryRule1.getDebt()).isNotNull();
        assertThat(repositoryRule1.getDebt().getFunction()).isEqualTo("CONSTANT_ISSUE");
        assertThat(repositoryRule1.getDebt().getOffset()).isEqualTo("5min");

        RepositoryRule repositoryRule2 = repositoryRules.get(1);
        assertThat(repositoryRule2.getKey()).isEqualTo("rule2");
        assertThat(repositoryRule2.getName()).isEqualTo("Rule 2");
        assertThat(repositoryRule2.getDescription()).isEqualTo("This is rule 2.");
        assertThat(repositoryRule2.getSeverity()).isEqualTo("MAJOR");
        assertThat(repositoryRule2.getDebt()).isNotNull();
        assertThat(repositoryRule2.getDebt().getFunction()).isEqualTo("CONSTANT_ISSUE");
        assertThat(repositoryRule2.getDebt().getOffset()).isEqualTo("15min");
    }
}
