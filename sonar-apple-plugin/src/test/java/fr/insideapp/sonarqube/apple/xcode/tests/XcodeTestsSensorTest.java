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

import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.tests.AbstractLanguageTestFileFinder;
import fr.insideapp.sonarqube.apple.xcode.parser.XcodeActionRecordParser;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadObjectRunnable;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunnable;
import fr.insideapp.sonarqube.apple.xcode.tests.mapper.XcodeTestsMapper;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.XcodeTestsParser;
import fr.insideapp.sonarqube.apple.xcode.tests.recorder.XcodeTestsRecorder;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class XcodeTestsSensorTest {

    private static class Container {

        final String jsonFileName;
        final List<FileTest> files;

        public Container(
                String jsonFileName,
                List<FileTest> files
        ) {
            this.jsonFileName = jsonFileName;
            this.files = files;
        }
    }

    private static class FileTest {
        final String name;
        final Integer numberOfTests;

        public FileTest(String name, Integer numberOfTests) {
            this.name = name;
            this.numberOfTests = numberOfTests;
        }
    }

    private static final String BASE_DIR = "/xcode/tests/sensor";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private static final String EXTENSION = "ext";

    private XcodeTestsSensor sensor;
    private Swift swift;
    private ObjectiveC objectiveC;
    private SensorContextTester context;

    private XcodeResultReadRunnable resultRunner;
    private XcodeResultReadObjectRunnable resultObjectRunner;

    @Before
    public void prepare() {
        AbstractLanguageTestFileFinder[] fileFinders = {
                new AbstractLanguageTestFileFinder(EXTENSION) {
                }
        };
        XcodeTestFileFinder testFileFinder = new XcodeTestFileFinder(fileFinders);
        context = SensorContextTester.create(baseDir);
        swift = new Swift();
        objectiveC = new ObjectiveC();
        resultRunner = mock(XcodeResultReadRunnable.class);
        resultObjectRunner = mock(XcodeResultReadObjectRunnable.class);
        sensor = new XcodeTestsSensor(
                swift,
                objectiveC,
                new XcodeResultExtensionProvider(),
                context.fileSystem(),
                resultRunner,
                new XcodeActionRecordParser(),
                resultObjectRunner,
                new XcodeTestsParser(),
                new XcodeTestsMapper(),
                new XcodeTestsRecorder(testFileFinder)
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("Xcode Tests");
        assertThat(defaultSensorDescriptor.languages()).hasSize(2).containsOnly(swift.getKey(), objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isEqualTo(InputFile.Type.TEST);
    }

    @Test
    public void executeNothingReported() throws IOException {
        List<FileTest> files = new ArrayList<>() {
            {
                add(new FileTest("path/not/found", null));
            }
        };
        assertContainer(new Container(
                "success",
                files
        ));
    }

    @Test
    public void executeSuccess() throws IOException {
        List<FileTest> files = new ArrayList<>() {
            {
                add(new FileTest("TestProjectTests/TestProjectTests", 1));
            }
        };
        assertContainer(new Container(
                "success",
                files
        ));
    }

    private void assertContainer(Container container) throws IOException  {

        // Mock files for test purpose
        container.files.forEach(file -> {
            String fullFileNamePath = file.name + "." + EXTENSION;
            DefaultInputFile inputFile = new TestInputFileBuilder("", fullFileNamePath).build();
            // Mock sensor
            context.fileSystem().add(inputFile);
        });

        // Mock
        File xcResultJSONFile = new File(baseDir, "xcresult.json");
        String xcResultJSONFileContent = FileUtils.readFileToString(xcResultJSONFile, Charset.defaultCharset());
        when(resultRunner.run(any())).thenReturn(xcResultJSONFileContent);

        File jsonFile = new File(baseDir, container.jsonFileName + ".json");
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        when(resultObjectRunner.run(any(), any())).thenReturn(jsonFileContent);

        // Running our code
        sensor.execute(context);

        container.files.forEach(file -> {
            String fullFileNamePath = file.name + "." + EXTENSION;
            // Asserting
            if (file.numberOfTests == null) {
                assertThatNullPointerException().isThrownBy(() -> context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value());
            } else {
                assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value()).isEqualTo(file.numberOfTests);
            }
        });

    }

}