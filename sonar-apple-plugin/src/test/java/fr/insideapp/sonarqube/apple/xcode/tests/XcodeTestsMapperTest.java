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

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.mapper.XcodeTestsMapper;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeTestsMapperTest {

    private static final String BASE_DIR = "/xcode/tests/mapper";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeTestsMapper mapper;
    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        mapper = new XcodeTestsMapper();
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Test
    public void map_one_testSummary() throws IOException {
        // prepare
        File actionTestableSummaryFile = new File(baseDir, "testSummary.json");
        String actionTestableSummaryJSON = FileUtils.readFileToString(actionTestableSummaryFile, Charset.defaultCharset());
        ActionTestableSummary actionTestableSummary = objectMapper.readValue(actionTestableSummaryJSON, ActionTestableSummary.class);
        // test
        final List<XcodeTestSummary> appleTestSummaries = new ArrayList<>(mapper.map(List.of(actionTestableSummary)));
        // assert
        assertThat(appleTestSummaries).hasSize(1);
        assertThat(appleTestSummaries.get(0).groups).hasSize(2);
        assertThat(appleTestSummaries.get(0).groups.get(0).testCases).hasSize(2);
    }

}
