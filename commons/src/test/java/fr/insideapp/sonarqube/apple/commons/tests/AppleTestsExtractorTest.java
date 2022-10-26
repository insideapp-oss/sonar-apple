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
package fr.insideapp.sonarqube.apple.commons.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.result.models.tests.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.commons.tests.models.AppleTestGroup;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public class AppleTestsExtractorTest {

    private static final String BASE_DIR = "src/test/resources/tests";

    private static final String ACTION_TESTABLE_SUMMARY = "actionTestableSummary.json";
    private static final String APPLE_TEST_GROUPS = "appleTestGroups.json";

    private AppleTestsExtractor extractor;
    private File actionTestableSummaryFile;
    private File appleTestGroupsFile;

    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        extractor = new AppleTestsExtractor();
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
        actionTestableSummaryFile = new File(BASE_DIR + "/" + ACTION_TESTABLE_SUMMARY);
        appleTestGroupsFile = new File(BASE_DIR + "/" + APPLE_TEST_GROUPS);
    }

    @Test
    public void extract() throws IOException {
        // preparation
        String actionTestableSummaryJSON = FileUtils.readFileToString(actionTestableSummaryFile, Charset.defaultCharset());
        ActionTestableSummary actionTestableSummary = objectMapper.readValue(actionTestableSummaryJSON, ActionTestableSummary.class);
        // testing
        List<AppleTestGroup> testGroups = extractor.extract(actionTestableSummary);
        // asserting
        assertThat(testGroups).hasSize(2);
        String testGroupsJSON = objectMapper.writeValueAsString(testGroups);
        String expectedTestGroupsJSON = FileUtils.readFileToString(appleTestGroupsFile, Charset.defaultCharset());
        assertThat(testGroupsJSON).isEqualTo(expectedTestGroupsJSON);
    }
}