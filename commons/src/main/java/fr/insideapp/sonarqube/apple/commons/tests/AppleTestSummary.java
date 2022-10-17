package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;

import java.util.List;

public final class AppleTestSummary {

    public final List<AppleTestGroup> groups;

    public AppleTestSummary(List<AppleTestGroup> groups) {
        this.groups = groups;

    }

}