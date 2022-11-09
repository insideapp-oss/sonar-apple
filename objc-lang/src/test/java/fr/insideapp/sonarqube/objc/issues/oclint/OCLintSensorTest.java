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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.result.AppleResultSensor;
import fr.insideapp.sonarqube.apple.commons.tests.AppleTestsSensor;
import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinder;
import fr.insideapp.sonarqube.apple.commons.tests.TestFileFinders;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.config.internal.MapSettings;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

public class OCLintSensorTest {

    private static class Container {
        final String jsonCompilationDatabasePath;

        public Container(String jsonCompilationDatabasePath) {
            this.jsonCompilationDatabasePath = jsonCompilationDatabasePath;
        }
    }

    private static final String BASE_DIR = "src/test/resources/oclint";

    private SensorContextTester context;
    private OCLintSensor sensor;

    @Before
    public void prepare() {
        context = SensorContextTester.create(new File(BASE_DIR));
        sensor = new OCLintSensor(context);
    }

    @Test
    public void describe() {
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        sensor.describe(defaultSensorDescriptor);
        assertThat(defaultSensorDescriptor.name()).isEqualTo("OCLint Sensor");
        assertThat(defaultSensorDescriptor.languages()).hasSize(1);
        assertThat(defaultSensorDescriptor.languages()).element(0).isEqualTo(ObjectiveC.KEY);
    }

    @Test
    public void executeSuccess() {
        // TODO
        assertContainer(new Container(
                "compilation_database/twoFiles"
        ));
    }

    private void assertContainer(Container container) {
        // update setting to get a custom location for JSON Compilation Database path
        MapSettings settings = new MapSettings();
        settings.setProperty(OCLintSensor.JSON_COMPILATION_DATABASE_KEY, container.jsonCompilationDatabasePath);
        context.setSettings(settings);

        // Running our code
        sensor.execute(context);

        // TODO: add assertions

    }

}
