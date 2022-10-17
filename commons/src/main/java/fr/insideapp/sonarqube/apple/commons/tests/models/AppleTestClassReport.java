package fr.insideapp.sonarqube.apple.commons.tests.models;

import java.util.HashMap;
import java.util.List;

public class AppleTestClassReport {

    public enum Status {
        ALL,
        FAILED,
        SKIPPED,
    }

    private static Double MILLISECONDS = 1000.0;


    private long duration;
    private HashMap<Status, Integer> tests;

    public AppleTestClassReport(AppleTestGroup group) {
        Double durationInMs = group.duration * MILLISECONDS;
        this.duration = durationInMs.longValue();
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
