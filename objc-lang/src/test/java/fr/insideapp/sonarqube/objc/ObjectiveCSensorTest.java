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
package fr.insideapp.sonarqube.objc;

import fr.insideapp.sonarqube.objc.antlr.ObjectiveCAntlrContext;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCCyclomaticComplexityVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCHighlighterVisitor;
import fr.insideapp.sonarqube.objc.antlr.ObjectiveCSourceLinesVisitor;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public final class ObjectiveCSensorTest {

    private ObjectiveCSensor sensor;
    private SensorContextTester context;
    private ObjectiveC objectiveC;

    @Before
    public void prepare() {
        objectiveC = new ObjectiveC();
        context = SensorContextTester.create(new File("."));
        sensor = new ObjectiveCSensor(
                objectiveC,
                new ObjectiveCAntlrContext(),
                new ObjectiveCSourceLinesVisitor(),
                new ObjectiveCHighlighterVisitor(),
                new ObjectiveCCyclomaticComplexityVisitor()
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(descriptor);
        // assert
        assertThat(descriptor.name()).isEqualTo("Objective-C Sensor");
        assertThat(descriptor.languages()).hasSize(1).containsOnly(objectiveC.getKey());
        assertThat(descriptor.type()).isNotNull().isEqualTo(InputFile.Type.MAIN);
    }

    @Test
    public void execute() {
        // test
        sensor.execute(context);
        // assert
        // nothing to test
    }
}
