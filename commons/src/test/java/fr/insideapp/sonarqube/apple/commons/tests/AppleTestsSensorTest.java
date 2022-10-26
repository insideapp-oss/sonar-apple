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

import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.config.internal.MapSettings;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.Assertions.assertThat;

public class AppleTestsSensorTest {

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

    private static final String BASE_DIR = "src/test/resources/tests";

    private static final String EXTENSION = "swift";

    private SensorContextTester context;
    private AppleTestsSensor sensor;

    @Before
    public void prepare() {
        context = SensorContextTester.create(new File(BASE_DIR));
        sensor = new AppleTestsSensor(context);
        TestFileFinders.getInstance().reset();
        TestFileFinder fileFinder = new TestFileFinder(EXTENSION) {};
        TestFileFinders.getInstance().addFinder(fileFinder);
    }

    @After
    public void cleanup() {
        TestFileFinders.getInstance().reset();
    }

    @Test
    public void describe() {
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        sensor.describe(defaultSensorDescriptor);
        assertThat(defaultSensorDescriptor.languages()).containsOnly("swift", "objc");
    }

    @Test
    public void executeXCResultNotFound() {
        assertContainer(new Container(
                "pathNotFound.xcresult",
                null,
                null
        ));
    }

    @Test
    public void executeNothingReported() {
        assertContainer(new Container(
                "sensor.xcresult",
                "path/notFound",
                null
        ));
    }

    @Test
    public void executeSuccess() {
        assertContainer(new Container(
                "sensor.xcresult",
                "TestProjectTests/TestProjectTests",
                1
        ));
    }

    private void assertContainer(Container container) {
        // update setting to get a custom location for Xcode result bundle path
        MapSettings settings = new MapSettings();
        settings.setProperty(AppleResultSensor.RESULT_BUNDLE_PATH_KEY, "sensor.xcresult");
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
            assertThatNullPointerException().isThrownBy(() -> {
                context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value();
            });
        } else {
            assertThat(context.measure(":" + fullFileNamePath, CoreMetrics.TESTS).value()).isEqualTo(container.numberOfTests);
        }
    }

}
