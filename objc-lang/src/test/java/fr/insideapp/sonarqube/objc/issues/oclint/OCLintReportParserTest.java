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
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class OCLintReportParserTest {

    private static class Container {
        final String reportFileName;
        final List<Violation> violations;
        public Container(String reportFileName, List<Violation> violations) {
            this.reportFileName = reportFileName;
            this.violations = violations;
        }
    }

    private static class Violation {
        final String path;
        final String rule;
        final String message;
        final int line;
        public Violation(String path, String rule, String message, int line) {
            this.path = path;
            this.rule = rule;
            this.message = message;
            this.line = line;
        }
    }

    private static final String BASE_DIR = "src/test/resources/oclint/parser";

    private OCLintReportParser parser;
    private ObjectMapper objectMapper;

    private File baseFolder;

    @Before
    public void prepare() {
        parser = new OCLintReportParser();
        baseFolder = new File(BASE_DIR);
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Test
    public void collectNoViolation() throws IOException {
        assertContainer(new Container(
                "noViolation.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void collectEmptyViolation() throws IOException {
        assertContainer(new Container(
                "emptyViolation.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void collectOneViolation() throws IOException {
        List<Violation> violations = new ArrayList<>() {
            {
                add(new Violation(
                        "/SQApp/SQApp/Greeting.m",
                        "short-variable-name",
                        "Length of variable name `s` is 1, which is shorter than the threshold of 3",
                        18
                ));
            }
        };
        assertContainer(new Container(
                "oneViolation.json",
                violations
        ));
    }

    private void assertContainer(Container container) throws IOException {
        // Data setup
        File jsonFile = new File(baseFolder, container.reportFileName);
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        OCLintReport report = objectMapper.readValue(jsonFileContent, OCLintReport.class);

        // Running our code
        List<ReportIssue> issues = parser.collect(report);

        // Asserting
        assertThat(issues).hasSize(container.violations.size());

        for (int i = 0; i < issues.size(); i++) {
            ReportIssue issue = issues.get(i);
            Violation violation = container.violations.get(i);
            assertThat(issue.getFilePath()).isEqualTo(violation.path);
            assertThat(issue.getRuleId()).isEqualTo(violation.rule);
            assertThat(issue.getMessage()).isEqualTo(violation.message);
            assertThat(issue.getLineNumber()).isEqualTo(violation.line);
        }
    }

}
