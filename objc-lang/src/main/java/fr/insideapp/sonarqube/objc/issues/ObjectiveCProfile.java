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
package fr.insideapp.sonarqube.objc.issues;

import fr.insideapp.sonarqube.apple.commons.rules.*;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import fr.insideapp.sonarqube.objc.issues.oclint.OCLintRulesDefinition;

import java.util.List;

public class ObjectiveCProfile extends ProfilesDefinition {

    public ObjectiveCProfile(
            final ObjectiveC objectiveC,
            final RepositoryRuleParsable parser,
            final OCLintRulesDefinition ocLintRulesDefinition,
            final MobSFScanObjectiveCRulesDefinition mobSFScanObjectiveCRulesDefinition
    ) {
        super(objectiveC, parser, List.of(ocLintRulesDefinition, mobSFScanObjectiveCRulesDefinition));
    }

}
