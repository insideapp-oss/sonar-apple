package fr.insideapp.sonarqube.apple.commons.tests;

import java.util.HashMap;
import java.util.List;

public class AppleTestClassReport {

    public enum Status {
        ALL,
        FAILED,
        SKIPPED,
    }


    private long duration;
    private HashMap<Status, Integer> tests;

    public AppleTestClassReport(AppleTestGroup group) {
        this.duration = Double.valueOf(group.duration * 1000).longValue();
        this.tests = buildMap(group.testCases);
    }

    public Integer getCount(Status status) {
        return tests.get(status);
    }

    public long getDuration() {
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
