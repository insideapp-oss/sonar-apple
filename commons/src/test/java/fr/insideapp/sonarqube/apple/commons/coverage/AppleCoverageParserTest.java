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
package fr.insideapp.sonarqube.apple.commons.coverage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverage;
import fr.insideapp.sonarqube.apple.commons.result.models.coverage.ActionCodeCoverageMetadata;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleCoverageParserTest {

    private static final String BASE_DIR = "src/test/resources/coverage";
    private SensorContextTester context;
    private AppleCoverageParser parser;

    private ObjectMapper objectMapper;
    @Before
    public void prepare() {
        context = SensorContextTester.create(new File(BASE_DIR));
        parser = new AppleCoverageParser(context);
        objectMapper = new ObjectMapper();
    }

    @Test
    public void collect() throws IOException {

        // setting up
        DefaultInputFile testFile = new TestInputFileBuilder("", "SQApp/ContentView.swift").setLanguage("swift").setLines(500).build();
        context.fileSystem().add(testFile);
        File xccov = new File(BASE_DIR, "xccov.json");
        String xccovData = FileUtils.readFileToString(xccov, StandardCharsets.UTF_8);
        Map<String, List<ActionCodeCoverageMetadata>> mappedCoverageData = objectMapper.readValue(xccovData, new TypeReference<>() {});
        List<ActionCodeCoverage> codeCoverages = mappedCoverageData
                .entrySet()
                .stream()
                .map(ActionCodeCoverage::new)
                .collect(Collectors.toList());

        // testing
        parser.collect(codeCoverages);

        // asserting
        assertThat(context.lineHits(testFile.key(), 1)).isNull();
        assertThat(context.lineHits(testFile.key(), 2)).isZero();
        assertThat(context.lineHits(testFile.key(), 3)).isEqualTo(1);
        assertThat(context.lineHits(testFile.key(), 4)).isEqualTo(Integer.MAX_VALUE);
    }

}
