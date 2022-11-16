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

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SwiftLintSensorTest {

    private static final String BASE_DIR = "/swift";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private SwiftLintSensor sensor;
    private Configuration configuration;
    private SensorContextTester context;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        context = SensorContextTester.create(baseDir);
        sensor = new SwiftLintSensor(
                new SwiftLintRunner(configuration)
        );
    }

    /*@Test
    public void language() {
        assertThat(sensor.language()).isEqualTo("swift");
    }

    @Test
    public void name() {
        assertThat(sensor.name()).isEqualTo("SwiftLint Sensor");
    }

    @Test
    public void repository() {
        assertThat(sensor.repository()).isEqualTo("SwiftLint");
    }

    @Test
    public void reportParser() {
        assertThat(sensor.reportParser()).isInstanceOf(SwiftLintReportParser.class);
    }

    @Test
    public void command() {
        assertThat(sensor.command()).isEqualTo("swiftlint");
    }

    @Test
    public void commandOptions() {
        assertThat(sensor.commandOptions("FOLDER")).isEqualTo(new String[]{"--path", "FOLDER"});
    }*/

    @Test
    public void describe() {
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("SwiftLint Sensor");
        // TODO: complete the asserts
    }

    @Test
    public void execute() {
        // prepare
        when(configuration.get(anyString())).thenReturn(Optional.of(new File(baseDir, "source_lines_visitor").getAbsolutePath()));
        // test
        sensor.execute(context);
        // assert
        // TODO: assert
    }

}
