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
import fr.insideapp.sonarqube.apple.commons.tests.AbstractLanguageTestFileFinder;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.models.ActionTestableSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestSummary;
import fr.insideapp.sonarqube.apple.xcode.tests.mapper.XcodeTestsMapper;
import fr.insideapp.sonarqube.apple.xcode.tests.recorder.XcodeTestsRecorder;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeTestsRecorderTest {

    private static class Container {
        final String jsonFileName;
        final String fileNamePath;
        final boolean nothingReported;
        final Integer numberOfTests;
        final Integer numberOfSkippedTests;
        final Integer numberOfFailedTests;
        final Long duration;

        public Container(String jsonFileName, String fileNamePath, boolean nothingReported, Integer numberOfTests, Integer numberOfSkippedTests, Integer numberOfFailedTests, Long duration) {
            this.jsonFileName = jsonFileName;
            this.fileNamePath = fileNamePath;
            this.nothingReported = nothingReported;
            this.numberOfTests = numberOfTests;
            this.numberOfSkippedTests = numberOfSkippedTests;
            this.numberOfFailedTests = numberOfFailedTests;
            this.duration = duration;
        }
    }

    private static final String BASE_DIR = "/xcode/tests/recorder";

    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private static final String EXTENSION = "apple";

    private XcodeTestsMapper mapper;
    private XcodeTestsRecorder recorder;
    private SensorContextTester context;
    private ObjectMapper objectMapper;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        mapper = new XcodeTestsMapper();
        AbstractLanguageTestFileFinder[] fileFinders = {
                new AbstractLanguageTestFileFinder(EXTENSION) {}
        };
        XcodeTestFileFinder finder = new XcodeTestFileFinder(fileFinders);
        recorder = new XcodeTestsRecorder(finder);
        objectMapper = new ObjectMapper().disable(FAIL_ON_UNKNOWN_PROPERTIES);
    }

    @Test
    public void testSuccess() throws IOException {
        assertContainer(new Container(
                "oneTestSuccess",
                "TestProjectTests/TestProjectTests",
                false,
                1,
                0,
                0,
                262L
        ));
    }

    @Test
    public void testSkipped() throws IOException {
        assertContainer(new Container(
                "oneSkippedTest",
                "TestProjectTests/TestProjectTests",
                false,
                0,
                1,
                0,
                262L
        ));
    }

    @Test
    public void testFailure() throws IOException {
        assertContainer(new Container(
                "oneFailedTest",
                "TestProjectTests/TestProjectTests",
                false,
                1,
                0,
                1,
                262L
        ));
    }

    @Test
    public void testAll() throws IOException {
        assertContainer(new Container(
                "allOfThem",
                "TestProjectTests/TestProjectTests",
                false,
                2,
                1,
                1,
                262L
        ));
    }

    @Test
    public void testNotExisting() throws IOException {
        assertContainer(new Container(
                "allOfThem",
                "TestProjectTests/TestProjectTests2",
                true,
                null,
                null,
                null,
                null
        ));
    }

    private void assertContainer(Container container) throws IOException {
        String fullFileNamePath = container.fileNamePath + "." + EXTENSION;

        // Mock file for test purpose
        DefaultInputFile inputFile = new TestInputFileBuilder("", fullFileNamePath).build();
        // Mock sensor
        context.fileSystem().add(inputFile);
        // Data setup
        File jsonFile = new File(baseDir, container.jsonFileName + ".json");
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        ActionTestableSummary actionTestableSummary = objectMapper.readValue(jsonFileContent, ActionTestableSummary.class);
        Set<XcodeTestSummary> testSummaries = mapper.map(List.of(actionTestableSummary));

        // Running our code
        recorder.record(new ArrayList<>(testSummaries), context);

        // Asserting
        if (container.nothingReported) {
            assertThat(context.measures(":" + fullFileNamePath)).isEmpty();
        } else {
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value()).isEqualTo(container.numberOfTests);
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.SKIPPED_TESTS).value()).isEqualTo(container.numberOfSkippedTests);
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TEST_FAILURES).value()).isEqualTo(container.numberOfFailedTests);
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TEST_EXECUTION_TIME).value()).isEqualTo(container.duration);
        }

    }

}

