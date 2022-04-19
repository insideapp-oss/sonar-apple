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
package fr.insideapp.swift.lang.issues.swiftlint;

import fr.insideapp.sonarqube.swift.lang.issues.swiftlint.SwiftLintRulesDefinition;
import org.junit.Test;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.utils.Version;

import static org.assertj.core.api.Assertions.assertThat;

public class SwiftLintRulesDefinitionTest {

    @Test
    public void define() {

        SonarRuntime sonarRuntime = SonarRuntimeImpl.forSonarQube(Version.create(7, 9),SonarQubeSide.SERVER, SonarEdition.COMMUNITY);
        SwiftLintRulesDefinition rulesDefinition = new SwiftLintRulesDefinition(sonarRuntime);
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository dartAnalyzerRepository = context.repository("SwiftLint");
        assertThat(dartAnalyzerRepository).isNotNull();
        assertThat(dartAnalyzerRepository.name()).isEqualTo("SwiftLint");
        assertThat(dartAnalyzerRepository.language()).isEqualTo("swift");
        assertThat(dartAnalyzerRepository.rules()).isNotEmpty();


    }
}
