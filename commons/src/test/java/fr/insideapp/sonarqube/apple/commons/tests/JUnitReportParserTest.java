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

import fr.insideapp.sonaqube.apple.commons.TestFileFinders;
import fr.insideapp.sonaqube.apple.commons.tests.JUnitReportParser;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class JUnitReportParserTest {

    @Test
    public void collect() {

        TestFileFinders.getInstance().reset();
        TestFileFinders.getInstance().addFinder((fileSystem, classname) ->
                new TestInputFileBuilder("", "SQAppTests/SQAppTests.swift").setLanguage("swift").build());

        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        JUnitReportParser parser = new JUnitReportParser(context);
        parser.collect(new File("src/test/resources/tests"));

        assertThat(context.measure(":SQAppTests/SQAppTests.swift", CoreMetrics.TESTS).value()).isEqualTo(4);
    }
}
