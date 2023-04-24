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
package fr.insideapp.sonarqube.apple.xcode.warnings;

import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunnable;
import fr.insideapp.sonarqube.apple.xcode.warnings.converter.XcodeWarningConvertible;
import fr.insideapp.sonarqube.apple.xcode.warnings.mapper.XcodeWarningsMapper;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.XcodeWarningParsable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public final class XcodeWarningsSensorTest {

    private static final String BASE_DIR = "/xcode/warnings/sensor";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeWarningsSensor sensor;
    private Swift swift;
    private ObjectiveC objectiveC;
    private SensorContextTester context;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        swift = new Swift();
        objectiveC = new ObjectiveC();
        sensor = new XcodeWarningsSensor(
            swift,
            objectiveC,
            new XcodeResultExtensionProvider(),
            mock(XcodeResultReadRunnable.class),
            mock(XcodeWarningParsable.class),
            mock(XcodeWarningConvertible.class),
            mock(XcodeWarningsMapper.class)
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("Xcode Warnings");
        assertThat(defaultSensorDescriptor.languages()).hasSize(2).containsOnly(swift.getKey(), objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isNull();
    }

}
