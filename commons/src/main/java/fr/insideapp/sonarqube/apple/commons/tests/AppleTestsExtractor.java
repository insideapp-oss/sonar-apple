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
package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.*;

public class AppleTestsExtractor {

    public AppleTestsExtractor() {
        // no parameter
    }

    public List<AppleTestGroup> extract(ActionTestableSummary summary) {
        List<AppleTestGroup> testGroups = new ArrayList<>();

        // this is the current stack to process
        Deque<ImmutablePair<ActionTestSummary, ActionTestGroup>> actionTestGroups = new LinkedList<>();
        // initial state
        actionTestGroups.push(new ImmutablePair<>(summary, summary.tests));
        // while we got groups to process
        while (!actionTestGroups.isEmpty()) {
            ImmutablePair<ActionTestSummary, ActionTestGroup> pair = actionTestGroups.pop();
            // keeping a reference to the parent
            ActionTestSummary parent = pair.getKey();
            // we'll loop over each groups of the current group
            // to determine if this is the last "group" level
            // kind of flattening operation, since we can have an infinite level of nesting
            List<ActionTestSummaryGroup> summaryGroups = pair.getValue().groups;
            summaryGroups.forEach(summaryGroup -> {
                ActionTest summaryTests = summaryGroup.tests;
                switch (summaryTests.getType()) {
                    // not the last "group" level
                    // going further then, in future iteration
                    case GROUP:
                        ActionTestGroup summarySubtestsGroup = (ActionTestGroup)summaryTests;
                        actionTestGroups.push(new ImmutablePair<>(parent, summarySubtestsGroup));
                        break;
                    // this is the last level
                    // we can keep references
                    case METADATA:
                        ActionTestCase summaryTestCase = (ActionTestCase)summaryTests;
                        AppleTestGroup appleTestGroup = new AppleTestGroup(parent, summaryGroup, summaryTestCase.metadata);
                        testGroups.add(appleTestGroup);
                        break;
                }
            });
        }

        return testGroups;
    }

}