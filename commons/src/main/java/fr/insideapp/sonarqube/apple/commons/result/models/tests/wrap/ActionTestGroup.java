package fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;

import java.util.List;

public class ActionTestGroup implements ActionTest {

    public List<ActionTestSummaryGroup> groups;

    public ActionTestGroup(List<ActionTestSummaryGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Type getType() {
        return Type.GROUP;
    }
}
