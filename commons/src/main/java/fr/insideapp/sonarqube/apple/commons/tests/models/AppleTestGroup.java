package fr.insideapp.sonarqube.apple.commons.tests.models;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestMetadata;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummary;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;

import java.util.List;
import java.util.stream.Collectors;


public class AppleTestGroup {

    public String bundle;

    public String name;

    public Double duration;
    public List<AppleTestCase> testCases;

    public AppleTestGroup(ActionTestSummary parent, ActionTestSummaryGroup group, List<ActionTestMetadata> metadata) {
        this.bundle = parent.name;
        this.name = group.name;
        this.duration = group.duration;
        this.testCases = metadata
                .stream()
                .map(test -> new AppleTestCase(test))
                .collect(Collectors.toList());
    }

}
