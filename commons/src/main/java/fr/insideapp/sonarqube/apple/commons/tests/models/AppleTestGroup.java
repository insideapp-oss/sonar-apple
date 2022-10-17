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
