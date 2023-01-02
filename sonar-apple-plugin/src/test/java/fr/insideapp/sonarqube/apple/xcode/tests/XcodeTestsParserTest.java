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
package fr.insideapp.sonarqube.apple.xcode.tests;

import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.XcodeTestsParser;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeTestsParserTest {

    private static final String BASE_DIR = "/xcode/tests/parser";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeTestsParser parser;

    @Before
    public void prepare() {
        parser = new XcodeTestsParser();
    }

    @Test
    public void parse_oneSummary() throws IOException {
        // prepare
        File testSummariesFile = new File(baseDir, "testSummaries.json");
        String testSummariesJSON = FileUtils.readFileToString(testSummariesFile, Charset.defaultCharset());
        // test
        final List<ActionTestableSummary> actionTestableSummary = parser.parse(testSummariesJSON);
        // assert
        assertThat(actionTestableSummary).hasSize(1);
    }

}