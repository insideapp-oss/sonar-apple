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
package fr.insideapp.sonarqube.objectivec.lang.issues.mobsfscan;

import fr.insideapp.sonarqube.objc.lang.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanObjectiveCRulesDefinitionTest {

    @Test
    public void define() {

        MobSFScanObjectiveCRulesDefinition rulesDefinition = new MobSFScanObjectiveCRulesDefinition();
        RulesDefinition.Context context = new RulesDefinition.Context();
        rulesDefinition.define(context);

        RulesDefinition.Repository repository = context.repository("MobSFScanObjc");
        assertThat(repository).isNotNull();
        assertThat(repository.name()).isEqualTo("MobSFScanObjc");
        assertThat(repository.language()).isEqualTo("objc");
        assertThat(repository.rules()).isNotEmpty();

    }

}
