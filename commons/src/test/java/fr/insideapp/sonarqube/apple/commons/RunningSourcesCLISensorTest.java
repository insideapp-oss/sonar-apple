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
package fr.insideapp.sonarqube.apple.commons;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportParser;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RunningSourcesCLISensorTest {

    private RunningSourcesCLISensor sensor;
    private SensorContextTester sensorContext;
    private ReportParser reportParser;

    private final String NAME = "NAME";
    private final String LANG = "LANG";
    private final String REPO = "REPO";
    private static final String BASE_DIR = "src/test/resources";

    @Before
    public void prepare() {
        sensor = new RunningSourcesCLISensor() {
            @Override
            public String name() {
                return NAME;
            }

            @Override
            public String language() {
                return LANG;
            }

            @Override
            public String repository() {
                return REPO;
            }

            @Override
            public ReportParser reportParser() {
                return reportParser;
            }

            @Override
            public String command() {
                return "DUMMY";
            }

            @Override
            public String[] commandOptions(String source) {
                return new String[]{};
            }
        };
        sensorContext = SensorContextTester.create(new File(BASE_DIR));
        reportParser = new ReportParser() {
            @Override
            public List<ReportIssue> parse(String input) {
                return new ArrayList<>();
            }
        };
    }

    @Test
    public void describe() {
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo(NAME);
        assertThat(descriptor.languages()).hasSize(1);
        assertThat(descriptor.languages()).element(0).isEqualTo(LANG);
    }

    @Test
    public void execute() {
        sensor.execute(sensorContext);
        assertThat(sensorContext.allIssues()).isEmpty();
    }

}
