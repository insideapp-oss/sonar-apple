package fr.insideapp.sonarqube.apple.commons.tests.models;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

public class AppleTestClassReport {

    public enum Status {
        ALL,
        FAILED,
        SKIPPED,
    }

    private static Double milliSeconds = 1000.0;


    private long duration;
    private EnumMap<Status, Integer> tests;

    public AppleTestClassReport(AppleTestGroup group) {
        Double durationInMs = group.duration * milliSeconds;
        this.duration = durationInMs.longValue();
        this.tests = buildMap(group.testCases);
    }

    public Integer getCount(Status status) {
        return tests.get(status);
    }

    public long getDuration() {
        return duration;
    }

    private static EnumMap<Status, Integer> buildMap(List<AppleTestCase> testCases) {
        EnumMap<Status, Integer> tests = new EnumMap<>(Status.class);
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
                default:
                    break;
            }
        });
        return tests;
    }

    private static void increment(EnumMap<Status, Integer> map, Status status) {
        map.put(status, map.get(status) + 1);
    }

}
