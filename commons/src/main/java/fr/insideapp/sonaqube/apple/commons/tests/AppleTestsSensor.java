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
package fr.insideapp.sonaqube.apple.commons.tests;

import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;

public class AppleTestsSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(AppleTestsSensor.class);
    private static final String DEFAULT_REPORT_PATH = "build/reports/";

    public static final String REPORT_PATH_KEY = "sonar.junit.reportPaths";

    private final SensorContext context;

    public AppleTestsSensor(SensorContext context) {
        this.context = context;
    }

    protected String reportPath() {
        return context.config()
                .get(REPORT_PATH_KEY)
                .orElse(DEFAULT_REPORT_PATH);
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor.name("Apple Surefire").onlyOnLanguages("swift", "objc");
    }

    @Override
    public void execute(SensorContext sensorContext) {
        JUnitReportParser surefireParser = new JUnitReportParser(context);
        String reportFileName = sensorContext.fileSystem().baseDir().getAbsolutePath() + File.separator + reportPath();
        File reportsDir = new File(reportFileName);

        if (!reportsDir.isDirectory()) {
            LOGGER.warn("JUnit report directory not found at {}", reportsDir);
        } else {
            surefireParser.collect(reportsDir);
        }
    }
}
