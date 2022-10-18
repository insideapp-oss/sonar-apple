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
package fr.insideapp.sonarqube.apple.commons.tests.models;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestMetadata;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;

import java.util.List;
import java.util.stream.Collectors;


public final class AppleTestGroup {

    public final String bundle;

    public final String name;

    public final Double duration;
    public final List<AppleTestCase> testCases;

    public AppleTestGroup(final ActionTestSummary parent, final ActionTestSummaryGroup group, final List<ActionTestMetadata> metadata) {
        this.bundle = parent.name;
        this.name = group.name;
        this.duration = group.duration;
        this.testCases = metadata
                .stream()
                .map(AppleTestCase::new)
                .collect(Collectors.toList());
    }

}
