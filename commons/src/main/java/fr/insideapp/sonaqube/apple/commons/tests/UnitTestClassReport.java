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
package fr.insideapp.sonaqube.apple.commons.tests;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public final class UnitTestClassReport {
    private int errors = 0;
    private int failures = 0;
    private int skipped = 0;
    private int tests = 0;
    private long durationMilliseconds = 0L;


    private long negativeTimeTestNumber = 0L;
    private List<UnitTestResult> results = null;

    public UnitTestClassReport add(UnitTestClassReport other) {
        for (UnitTestResult otherResult : other.getResults()) {
            add(otherResult);
        }
        return this;
    }

    public UnitTestClassReport add(UnitTestResult result) {
        initResults();
        boolean hasName = results.stream().map(UnitTestResult::getName).anyMatch(result.getName()::equals);
        if (hasName && StringUtils.contains(result.getName(), "$")) {
            return this;
        }
        results.add(result);
        switch (result.getStatus()) {
            case UnitTestResult.STATUS_SKIPPED:
                skipped += 1;
                break;
            case UnitTestResult.STATUS_FAILURE:
                failures += 1;
                break;
            case UnitTestResult.STATUS_ERROR:
                errors += 1;
                break;
            default:
                break;
        }
        tests += 1;
        if (result.getDurationMilliseconds() < 0) {
            negativeTimeTestNumber += 1;
        } else {
            durationMilliseconds += result.getDurationMilliseconds();
        }
        return this;
    }

    private void initResults() {
        if (results == null) {
            results = new ArrayList<>();
        }
    }

    public int getErrors() {
        return errors;
    }

    public int getFailures() {
        return failures;
    }

    public int getSkipped() {
        return skipped;
    }

    public int getTests() {
        return tests;
    }

    public long getDurationMilliseconds() {
        return durationMilliseconds;
    }

    public long getNegativeTimeTestNumber() {
        return negativeTimeTestNumber;
    }

    public List<UnitTestResult> getResults() {
        if (results == null) {
            return Collections.emptyList();
        }
        return results;
    }
}
