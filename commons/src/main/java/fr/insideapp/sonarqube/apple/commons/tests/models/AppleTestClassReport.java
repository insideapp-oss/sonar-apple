/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.insideapp.sonarqube.apple.commons.tests.models;

import java.util.EnumMap;
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
