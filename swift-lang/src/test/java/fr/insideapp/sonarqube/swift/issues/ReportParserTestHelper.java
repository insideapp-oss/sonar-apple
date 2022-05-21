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
package fr.insideapp.sonarqube.swift.issues;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;

import javax.annotation.Nullable;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReportParserTestHelper {

    public static void assertFilePath(ReportIssue issue, @Nullable String expectedPath) {
        assertThat(issue.getFilePath()).isEqualTo(expectedPath);
    }

    public static void assertLineNumber(ReportIssue issue, @Nullable Integer expectedLine) {
        assertThat(issue.getLineNumber()).isEqualTo(expectedLine);
    }

    public static void assertRuleId(ReportIssue issue, String expectedRuleId) {
        assertThat(issue.getRuleId()).isEqualTo(expectedRuleId);
    }

    public static void assertMessage(ReportIssue issue, String expectedMessage) {
        assertThat(issue.getMessage()).isEqualTo(expectedMessage);
    }

}