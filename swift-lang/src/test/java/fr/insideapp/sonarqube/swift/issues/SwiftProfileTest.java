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

import fr.insideapp.sonarqube.apple.commons.rules.RepositoryRuleParser;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.issues.mobsfscan.MobSFScanSwiftRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.periphery.PeripheryRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.swiftlint.SwiftLintRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.warnings.XcodeWarningSwiftRulesDefinition;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public final class SwiftProfileTest {

    private Swift swift;

    private SwiftProfile profile;

    private BuiltInQualityProfilesDefinition.Context context;

    @Before
    public void prepare() {
        swift = new Swift();
        context = new BuiltInQualityProfilesDefinition.Context();
        profile = new SwiftProfile(
                swift,
                new RepositoryRuleParser(),
                new SwiftLintRulesDefinition(swift),
                new MobSFScanSwiftRulesDefinition(swift),
                new PeripheryRulesDefinition(swift),
                new XcodeWarningSwiftRulesDefinition(swift)
        );
    }


    @Test
    public void define() {
        // test
        profile.define(context);
        // assert
        final BuiltInQualityProfilesDefinition.BuiltInQualityProfile builtProfile = context.profile(swift.getKey(), swift.getName());
        assertThat(builtProfile).isNotNull();
        assertThat(builtProfile.language()).isEqualTo(swift.getKey());
        assertThat(builtProfile.name()).isEqualTo(swift.getName());
        assertThat(builtProfile.rules()).hasSize(245);
    }

}