package fr.insideapp.sonarqube.apple.commons.tests;

import fr.insideapp.sonarqube.apple.commons.result.models.tests.*;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTest;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestCase;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.wrap.ActionTestGroup;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AppleTestSummary {

    public List<AppleTestGroup> groups;

    public AppleTestSummary(List<AppleTestGroup> groups) {
        this.groups = groups;

    }

}