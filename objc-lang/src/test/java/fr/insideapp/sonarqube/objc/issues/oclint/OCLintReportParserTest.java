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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class OCLintReportParserTest {

    private static final String REPORT_PATH = "/oclint-report.json";

    @Test
    public void parse() throws IOException {

        OCLintReportParser parser = new OCLintReportParser();
        String text = IOUtils.toString(Objects.requireNonNull(this.getClass().getResourceAsStream(REPORT_PATH)), StandardCharsets.UTF_8);
        List<ReportIssue> issues = parser.parse(text);

        assertThat(issues).hasSize(1);

        ReportIssue issue1 = issues.get(0);
        assertThat(issue1.getFilePath()).isEqualTo("/SQApp/SQApp/Greeting.m");
        assertThat(issue1.getRuleId()).isEqualTo("short-variable-name");
        assertThat(issue1.getMessage()).isEqualTo("Length of variable name `s` is 1, which is shorter than the threshold of 3");
        assertThat(issue1.getLineNumber()).isEqualTo(18);
    }
}
