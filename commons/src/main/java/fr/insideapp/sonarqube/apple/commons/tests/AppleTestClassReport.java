package fr.insideapp.sonarqube.apple.commons.tests;

import java.util.HashMap;
import java.util.List;

public class AppleTestClassReport {

    public enum Status {
        ALL,
        FAILED,
        SKIPPED,
    }

    public String path;

    public double duration;
    public HashMap<Status, Integer> tests;

    public AppleTestClassReport(AppleTestGroup group) {
        this.path = group.path;
        this.duration = group.duration;
        this.tests = buildMap(group.testCases);
    }

    public Integer getCount(Status status) {
        return tests.get(status);
    }

    public Double getDuration() {
        return duration;
    }

    private static HashMap<Status, Integer> buildMap(List<AppleTestCase> testCases) {
        HashMap<Status, Integer> tests = new HashMap();
        // init
        for (Status status : Status.values()) { tests.put(status, 0); }
        // compute
        testCases.forEach(testCase -> {
            // anyway we increment the test count
            increment(tests, Status.ALL);
            // then according to status
            switch (testCase.status) {
                case FAILURE:
                    increment(tests, Status.FAILED);
                    break;
                case SKIPPED:
                    increment(tests, Status.SKIPPED);
                    break;
            }
        });
        return tests;
    }

    private static void increment(HashMap<Status, Integer> map, Status status) {
        map.put(status, map.get(status) + 1);
    }

}
