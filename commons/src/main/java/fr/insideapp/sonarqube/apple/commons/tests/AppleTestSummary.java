package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.*;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppleTestSummary {

    public List<AppleTestGroup> groups;

    public AppleTestSummary(ActionTestableSummary summary) {
        this.groups = new ArrayList<>();

        // this is the current stack to process
        Stack<ActionTestGroup> highLevelGroups = new Stack<>();
        highLevelGroups.push(summary.tests);

        while (!highLevelGroups.empty()) {
            ActionTestGroup testGroup = highLevelGroups.pop();
            List<ActionTestSummaryGroup> summaryGroups = testGroup.groups;
            summaryGroups.forEach(summaryGroup -> {
                ActionTest summarySubtests = summaryGroup.tests;
                switch (summarySubtests.getType()) {
                    case GROUP:
                        ActionTestGroup summarySubtestsGroup = (ActionTestGroup)summarySubtests;
                        highLevelGroups.push(summarySubtestsGroup);
                        break;
                    case METADATA:
                        ActionTestCase summaryTestCase = (ActionTestCase)summarySubtests;
                        AppleTestGroup appleTestGroup = new AppleTestGroup(summaryGroup, summaryTestCase.metadata);
                        groups.add(appleTestGroup);
                        break;
                }
            });
        }

    }

}
