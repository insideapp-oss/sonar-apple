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

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.commons.tests.*;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class OCLintReportParserTest {

    private static final String REPORT_PATH = "src/test/resources/oclint/parser/oclint-report.json";

    private OCLintReportParser parser;
    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        parser = new OCLintReportParser();
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Test
    public void collect() throws IOException {


        // Data setup
        File jsonFile = new File(REPORT_PATH);
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        OCLintReport report = objectMapper.readValue(jsonFileContent, OCLintReport.class);

        // Running our code
        List<ReportIssue> issues = parser.collect(report);

        // Asserting
        assertThat(issues).hasSize(1);

        ReportIssue issue = issues.get(0);
        assertThat(issue.getFilePath()).isEqualTo("/SQApp/SQApp/Greeting.m");
        assertThat(issue.getRuleId()).isEqualTo("short-variable-name");
        assertThat(issue.getMessage()).isEqualTo("Length of variable name `s` is 1, which is shorter than the threshold of 3");
        assertThat(issue.getLineNumber()).isEqualTo(18);

    }

}
