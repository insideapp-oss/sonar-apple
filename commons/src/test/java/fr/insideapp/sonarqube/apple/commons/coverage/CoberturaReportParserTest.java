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

import fr.insideapp.sonaqube.apple.commons.coverage.CoberturaReportParser;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CoberturaReportParserTest {

    @Test
    public void collect() {


        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "SQApp/ContentView.swift").setLanguage("swift").setLines(500).build();
        context.fileSystem().add(testFile);

        CoberturaReportParser parser = new CoberturaReportParser(context);
        parser.collect(new File("src/test/resources/coverage"));


        assertThat(context.lineHits(testFile.key(), 14)).isEqualTo(1);
        assertThat(context.lineHits(testFile.key(), 18)).isEqualTo(0);

        assertThat(context.coveredConditions(testFile.key(), 11)).isEqualTo(1);
        assertThat(context.coveredConditions(testFile.key(), 18)).isEqualTo(0);

    }
}
