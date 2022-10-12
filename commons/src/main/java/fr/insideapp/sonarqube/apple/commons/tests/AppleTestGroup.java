package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestMetadata;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestSummaryGroup;

import java.util.List;
import java.util.stream.Collectors;


public class AppleTestGroup {

    public String name;

    public String path;
    public Double duration;
    public List<AppleTestCase> testCases;

    public AppleTestGroup(ActionTestSummaryGroup group, List<ActionTestMetadata> metadata) {
        this.name = group.name;
        this.path = group.path;
        this.duration = group.duration;
        this.testCases = metadata
                .stream()
                .map(test -> new AppleTestCase(test))
                .collect(Collectors.toList());
    }

}
