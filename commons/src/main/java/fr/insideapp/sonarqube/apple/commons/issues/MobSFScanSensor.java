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
package fr.insideapp.sonarqube.apple.commons.issues;

import fr.insideapp.sonarqube.apple.commons.RunningSourcesCLISensor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;


public abstract class MobSFScanSensor extends RunningSourcesCLISensor {

    private static final Logger LOGGER = Loggers.get(MobSFScanSensor.class);

    private static final String COMMAND = "mobsfscan";
    private static final String OUTPUT_FORMAT = "--json";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    public String name() {
        return String.join(" ", "MobSFScan Sensor", nameSuffix());
    }

    public abstract String nameSuffix();

    @Override
    public String repository() {
        return MobSFScanRulesDefinition.builder(language());
    }

    @Override
    public ReportParser reportParser() {
        return new MobSFScanReportParser();
    }

    @Override
    public String command() {
        return "mobsfscan";
    }

    @Override
    public String[] commandOptions(String source) {
        return new String[]{"--json", source};
    }

}