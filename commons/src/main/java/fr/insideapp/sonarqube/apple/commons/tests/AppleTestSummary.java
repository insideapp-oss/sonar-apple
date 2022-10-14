package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.*;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppleTestSummary {

    public List<AppleTestGroup> groups;

    public AppleTestSummary(ActionTestableSummary summary) {
        this.groups = new ArrayList<>();

        // this is the current stack to process
        Stack<ImmutablePair<ActionTestSummary, ActionTestGroup>> highLevelGroups = new Stack<>();
        highLevelGroups.push(new ImmutablePair(summary, summary.tests));

        while (!highLevelGroups.empty()) {
            ImmutablePair<ActionTestSummary, ActionTestGroup> highLevelGroup = highLevelGroups.pop();
            ActionTestSummary parent = highLevelGroup.getKey();
            ActionTestGroup child = highLevelGroup.getValue();
            List<ActionTestSummaryGroup> summaryGroups = child.groups;
            summaryGroups.forEach(summaryGroup -> {
                ActionTest summarySubtests = summaryGroup.tests;
                switch (summarySubtests.getType()) {
                    case GROUP:
                        ActionTestGroup summarySubtestsGroup = (ActionTestGroup)summarySubtests;
                        highLevelGroups.push(new ImmutablePair(parent, summarySubtestsGroup));
                        break;
                    case METADATA:
                        ActionTestCase summaryTestCase = (ActionTestCase)summarySubtests;
                        AppleTestGroup appleTestGroup = new AppleTestGroup(parent, summaryGroup, summaryTestCase.metadata);
                        groups.add(appleTestGroup);
                        break;
                }
            });
        }

    }

}