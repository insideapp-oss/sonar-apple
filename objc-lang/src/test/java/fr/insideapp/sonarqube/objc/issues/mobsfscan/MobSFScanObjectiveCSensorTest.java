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
package fr.insideapp.sonarqube.objc.issues.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.issues.MobSFScanReportParser;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;

import static org.assertj.core.api.Assertions.assertThat;

public class MobSFScanObjectiveCSensorTest {

    private MobSFScanObjectiveCSensor sensor;

    @Before
    public void prepare() {
        sensor = new MobSFScanObjectiveCSensor();
    }

    @Test
    public void language() {
        assertThat(sensor.language()).isEqualTo("objc");
    }

    @Test
    public void name() {
        assertThat(sensor.name()).isEqualTo("MobSFScan Sensor for Objc");
    }

    @Test
    public void repository() {
        assertThat(sensor.repository()).isEqualTo("MobSFScanObjc");
    }

    @Test
    public void reportParser() {
        assertThat(sensor.reportParser()).isInstanceOf(MobSFScanReportParser.class);
    }

    @Test
    public void command() {
        assertThat(sensor.command()).isEqualTo("mobsfscan");
    }

    @Test
    public void commandOptions() {
        assertThat(sensor.commandOptions("FOLDER")).isEqualTo(new String[]{"--json", "FOLDER"});
    }

    @Test
    public void describe() {
        DefaultSensorDescriptor descriptor = new DefaultSensorDescriptor();
        sensor.describe(descriptor);
        assertThat(descriptor.name()).isEqualTo("MobSFScan Sensor for Objc");
    }

}
