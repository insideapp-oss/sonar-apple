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

import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintViolation;
import fr.insideapp.sonarqube.objc.issues.oclint.parser.OCLintReportParser;
import fr.insideapp.sonarqube.objc.issues.oclint.parser.OCLintReportParsable;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class OCLintReportParserTest {

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

    private static final String BASE_DIR = "/oclint/parser";

    private OCLintReportParsable parser;

    private File baseFolder;

    @Before
    public void prepare() {
        parser = new OCLintReportParser();
        baseFolder = FileUtils.toFile(getClass().getResource(BASE_DIR));
    }

    @Test
    public void parser_noViolation() throws IOException {
        assertContainer(new Container(
                "noViolation.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parse_emptyViolation() throws IOException {
        assertContainer(new Container(
                "emptyViolation.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parser_oneViolation() throws IOException {
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

        // Running our code
        List<OCLintViolation> issues = parser.parse(jsonFileContent);

        // Asserting
        assertThat(issues).hasSize(container.violations.size());

        for (int i = 0; i < issues.size(); i++) {
            OCLintViolation issue = issues.get(i);
            Violation violation = container.violations.get(i);
            assertThat(issue.rule).isEqualTo(violation.rule);
            assertThat(issue.path).isEqualTo(violation.path);
            assertThat(issue.message).isEqualTo(violation.message);
            assertThat(issue.line).isEqualTo(violation.line);
        }
    }

}
