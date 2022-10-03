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

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleCoverageParserTest {

    @Test
    public void collect() throws IOException {

        // setting up
        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        DefaultInputFile testFile = new TestInputFileBuilder("", "SQApp/ContentView.swift").setLanguage("swift").setLines(500).build();
        context.fileSystem().add(testFile);
        File xccov = new File("src/test/resources/coverage/xccov.json");
        String data = FileUtils.readFileToString(xccov, StandardCharsets.UTF_8);
        JSONObject xccovJSON = new JSONObject(data);

        // testing
        AppleCoverageParser parser = new AppleCoverageParser(context);
        parser.collect(xccovJSON);

        // asserting
        assertThat(context.lineHits(testFile.key(), 1)).isNull();
        assertThat(context.lineHits(testFile.key(), 2)).isEqualTo(0);
        assertThat(context.lineHits(testFile.key(), 3)).isEqualTo(1);
        assertThat(context.lineHits(testFile.key(), 4)).isEqualTo(Integer.MAX_VALUE);
    }

}
