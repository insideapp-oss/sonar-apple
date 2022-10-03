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

import org.json.JSONObject;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleCoverageExtractorTest {

    @Test
    public void extract() {

        // setting up
        SensorContextTester context = SensorContextTester.create(new File("src/test/resources"));
        File buildResult = new File("src/test/resources/coverage/build_result.xcresult");

        // testing
        AppleCoverageExtractor extractor = new AppleCoverageExtractor(context);
        JSONObject xccovJSON = extractor.extract(buildResult);

        // asserting
        assertThat(xccovJSON.keySet().size()).isEqualTo(4);
    }

}
