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
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadObjectRunner;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunner;
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
import org.sonar.api.config.internal.MapSettings;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.Assertions.assertThat;

public class XcodeTestsSensorTest {

    private static class Container {
        final String resultBundlePath;
        final String fileNamePath;
        final Integer numberOfTests;

        public Container(String resultBundlePath, String fileNamePath, Integer numberOfTests) {
            this.resultBundlePath = resultBundlePath;
            this.fileNamePath = fileNamePath;
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
        sensor = new XcodeTestsSensor(
                swift,
                objectiveC,
                new XcodeResultExtensionProvider(),
                context.fileSystem(),
                new XcodeResultReadRunner(),
                new XcodeActionRecordParser(),
                new XcodeResultReadObjectRunner(),
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
    public void executeNothingReported() {
        assertContainer(new Container(
                "output.xcresult",
                "path/notFound",
                null
        ));
    }

    @Test
    public void executeSuccess() {
        assertContainer(new Container(
                "output.xcresult",
                "TestProjectTests/TestProjectTests",
                1
        ));
    }

    private void assertContainer(Container container) {
        // update setting to get a custom location for Xcode result bundle path
        MapSettings settings = new MapSettings();
        settings.setProperty("sonar.apple.resultBundlePath", container.resultBundlePath);
        context.setSettings(settings);

        String fullFileNamePath = container.fileNamePath + "." + EXTENSION;

        // Mock file for test purpose
        DefaultInputFile inputFile = new TestInputFileBuilder("", fullFileNamePath).build();
        // Mock sensor
        context.fileSystem().add(inputFile);

        // Running our code
        sensor.execute(context);

        // Asserting
        if (container.numberOfTests == null) {
            assertThatNullPointerException().isThrownBy(() -> context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value());
        } else {
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value()).isEqualTo(container.numberOfTests);
        }
    }

}