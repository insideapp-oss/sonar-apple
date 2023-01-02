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
package fr.insideapp.sonarqube.apple.xcode.tests.mapper;

import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestSummaryGroup;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.wrap.ActionTestGroup;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestGroup;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.sonar.api.scanner.ScannerSide;

import java.util.*;
import java.util.stream.Collectors;

@ScannerSide
public final class XcodeTestsMapper extends AbstractReportMapper<List<ActionTestableSummary>, XcodeTestSummary> implements XcodeTestsMappable {

    @Override
    protected Set<XcodeTestSummary> perform(List<ActionTestableSummary> input) throws Exception {
        return input.stream()
                .map(XcodeTestsMapper::mapping)
                .map(XcodeTestSummary::new)
                .collect(Collectors.toSet());
    }

    private static List<XcodeTestGroup> mapping(ActionTestableSummary summary) {
        List<XcodeTestGroup> testGroups = new ArrayList<>();

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
                        XcodeTestGroup xcodeTestGroup = new XcodeTestGroup(parent, summaryGroup, summaryTestCase.metadata);
                        testGroups.add(xcodeTestGroup);
                        break;
                }
            });
        }

        return testGroups;
    }

}
