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
package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import fr.insideapp.sonarqube.swift.issues.swiftlint.parser.SwiftLintReportParser;
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

public final class SwiftLintReportParserTest {

    private static class Container {
        final String reportFileName;
        final List<Violation> violations;
        public Container(String reportFileName, List<Violation> violations) {
            this.reportFileName = reportFileName;
            this.violations = violations;
        }
    }

    private static class Violation {
        final String rule;
        final String message;

        final String path;

        final int line;

        final int character;
        public Violation(String path, String rule, String message, int line, int character) {
            this.path = path;
            this.rule = rule;
            this.message = message;
            this.line = line;
            this.character = character;
        }
    }

    private static final String BASE_DIR = "/swift/swiftlint";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private SwiftLintReportParser parser;

    @Before
    public void prepare() {
        parser = new SwiftLintReportParser();
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
                        "trailing_whitespace",
                        "Lines should not have trailing whitespace",
                        15,
                        17
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
        List<SwiftLintIssue> swiftLintIssues = parser.parse(jsonFileContent);

        // Asserting
        Assertions.assertThat(swiftLintIssues).hasSize(container.violations.size());

        for (int i = 0; i < swiftLintIssues.size(); i++) {
            SwiftLintIssue issue = swiftLintIssues.get(i);
            Violation violation = container.violations.get(i);
            assertThat(issue.filePath).isEqualTo(violation.path);
            assertThat(issue.ruleIdentifier).isEqualTo(violation.rule);
            assertThat(issue.message).isEqualTo(violation.message);
            assertThat(issue.lineNumber).isEqualTo(violation.line);
            assertThat(issue.characterNumber).isEqualTo(violation.character);
        }
    }

}
