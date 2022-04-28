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

import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.List;

public abstract class MobSFScanSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(MobSFScanSensor.class);

    private static final String COMMAND = "mobsfscan";
    private static final String OUTPUT_FORMAT = "--json";
    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    public abstract String language();

    public abstract String nameSuffix();

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(language())
                .name(String.join(" ", "MobSFScan sensor", nameSuffix()))
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {

        try {
            List<ReportIssue> issues = runAnalysis(sensorContext);
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder(sensorContext);
            issueRecorder.recordIssues(issues, MobSFScanRulesDefinition.builder(language()));
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private List<ReportIssue> runAnalysis(SensorContext sensorContext) throws IOException {

        try {
            // Run MobSFScan
            LOGGER.info("Running '{} analyze'...", COMMAND);
            final String sources = sensorContext.config().get("sonar.sources").get();
            String output = new ProcBuilder(COMMAND,  OUTPUT_FORMAT, sources)
                    .withTimeoutMillis(COMMAND_TIMEOUT)
                    .ignoreExitStatus()
                    .run()
                    .getOutputString();

            // Parse issues
            List<ReportIssue> issues = new MobSFScanReportParser().parse(output);
            LOGGER.info("Found issues: {}", issues.size());
            return issues;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

}