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
package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParser;
import org.apache.commons.io.FileUtils;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class PeripheryReportParserTest {

    private static class Container {
        final String reportFileName;
        final List<PeripheryReportParserTest.Violation> violations;
        public Container(String reportFileName, List<PeripheryReportParserTest.Violation> violations) {
            this.reportFileName = reportFileName;
            this.violations = violations;
        }
    }

    private static class Violation {
        final String rule;

        final String path;

        final int line;

        public Violation(String path, String rule, int line) {
            this.path = path;
            this.rule = rule;
            this.line = line;
        }
    }

    private static final String BASE_DIR = "/swift/periphery";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private PeripheryReportParser parser;

    @Before
    public void prepare() {
        parser = new PeripheryReportParser();
    }

    @Test
    public void parse_empty() throws IOException {
        assertContainer(new Container(
                "empty.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parse_invalid_empty() throws IOException {
        assertContainer(new Container(
                "invalid.json",
                new ArrayList<>()
        ));
    }

    @Test
    public void parse_one() throws IOException {
        List<Violation> violations = new ArrayList<>() {
            {
                add(new Violation(
                        "path/to/file.swift",
                        "unused",
                        12
                ));
            }
        };
        assertContainer(new Container(
                "oneIssue.json",
                violations
        ));
    }

    private void assertContainer(Container container) throws IOException {
        // Data setup
        File jsonFile = new File(baseDir, container.reportFileName);
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());

        // Running our code
        List<PeripheryIssue> peripheryIssues = parser.parse(jsonFileContent);

        // Asserting
        Assertions.assertThat(peripheryIssues).hasSize(container.violations.size());

        for (int i = 0; i < peripheryIssues.size(); i++) {
            PeripheryIssue issue = peripheryIssues.get(i);
            Violation violation = container.violations.get(i);
            assertThat(issue.ruleIdentifier).isEqualTo(violation.rule);
            assertThat(issue.location.path).isEqualTo(violation.path);
            assertThat(issue.location.line).isEqualTo(violation.line);
        }
    }

}
