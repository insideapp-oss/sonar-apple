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

import fr.insideapp.sonarqube.apple.commons.issues.*;
import org.buildobjects.process.ProcBuilder;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class RunningSourcesCLISensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(RunningSourcesCLISensor.class);

    private static final int COMMAND_TIMEOUT = 10 * 60 * 1000;

    public abstract String name();

    public abstract String language();

    public abstract String repository();

    public abstract ReportParser reportParser();

    public abstract String command();

    public abstract String[] commandOptions(String source);

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(language())
                .name(name())
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        try {
            List<ReportIssue> issues = runAnalysis(sensorContext);
            ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
            issueRecorder.recordIssues(issues, repository(), sensorContext);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    private List<ReportIssue> runAnalysis(SensorContext sensorContext) throws IOException {

        // the list of issues
        List<ReportIssue> issues = new ArrayList<>();
        final ReportParser reportParser = reportParser();
        // get sources folder or else default to current folder
        final String sourcesInput = sensorContext.config().get("sonar.sources").orElse(".");
        String[] sources = sourcesInput.split(",");
        LOGGER.info("Running '{} analyze'...", command());

        for (String source : sources) {
            try {
                // run MobSFScan
                String output = new ProcBuilder(command(), commandOptions(source))
                        .withTimeoutMillis(COMMAND_TIMEOUT)
                        .ignoreExitStatus()
                        .run()
                        .getOutputString();

                // Parse issues & save them
                issues.addAll(reportParser.parse(output));
            } catch (Exception e) {
                throw new IOException(e);
            }
        }

        LOGGER.info("Found issues: {}", issues.size());
        return issues;
    }

}

