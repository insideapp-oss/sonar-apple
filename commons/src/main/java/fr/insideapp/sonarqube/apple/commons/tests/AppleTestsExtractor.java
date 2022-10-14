package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppleTestsExtractor {

    private static final Logger LOGGER = Loggers.get(fr.insideapp.sonarqube.apple.commons.coverage.AppleCoverageExtractor.class);

    public AppleTestsExtractor() {}

    public List<AppleTestGroup> extract(ActionTestableSummary summary) {
        List<AppleTestGroup> testGroups = new ArrayList<>();

        // this is the current stack to process
        Stack<ImmutablePair<ActionTestSummary, ActionTestGroup>> actionTestGroups = new Stack<>();
        // initial state
        actionTestGroups.push(new ImmutablePair(summary, summary.tests));
        // while we got groups to process
        while (!actionTestGroups.empty()) {
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
                        actionTestGroups.push(new ImmutablePair(parent, summarySubtestsGroup));
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