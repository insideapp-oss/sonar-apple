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
package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMappable;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParsable;
import org.apache.commons.io.FileUtils;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PeripherySensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(PeripherySensor.class);

    private final Configuration configuration;
    private final FileSystem fileSystem;

    private final PeripheryReportParsable parser;

    private final PeripheryReportIssueMappable mapper;

    public PeripherySensor(
            final Configuration configuration,
            final FileSystem fileSystem,
            final PeripheryReportParsable parser,
            final PeripheryReportIssueMappable mapper
    ) {
        this.configuration = configuration;
        this.fileSystem = fileSystem;
        this.parser = parser;
        this.mapper = mapper;
    }



    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(Swift.KEY)
                .name("Periphery Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        File peripheryLogFile = retrievePeripheryLog();
        if (peripheryLogFile == null) { return; }
        String peripheryLog = readPeripheryLog(peripheryLogFile);
        if (peripheryLog == null) { return; }
        List<PeripheryIssue> issues = parser
                .parse(peripheryLog)
                .stream()
                .filter(issue -> Objects.nonNull(issue.location)) // remove null values
                .collect(Collectors.toList());
        List<ReportIssue> reportIssues = mapper.map(issues).stream().collect(Collectors.toList());
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
        issueRecorder.recordIssues(reportIssues, PeripheryRulesDefinition.REPOSITORY_KEY, sensorContext);
    }

    private File retrievePeripheryLog() {
        File peripheryLogFile = peripheryLog();

        // Look for the Periphery log file
        if (!peripheryLogFile.exists()) {
            LOGGER.error("Failed to locate Periphery log file.");
            LOGGER.error("Expected location according to the configuration is {}", peripheryLogFile.getAbsolutePath());
            return null;
        }

        return peripheryLogFile;
    }

    private File peripheryLog() {
        return new File(fileSystem.baseDir(), PeripheryExtensionProvider.peripheryLogPath(configuration));
    }

    private String readPeripheryLog(File peripheryLogFile) {
        String peripheryLog = null;
        try {
            peripheryLog = FileUtils.readFileToString(peripheryLogFile, StandardCharsets.UTF_8);
        } catch (Exception e) {
            LOGGER.error("Failed to read Periphery log file.");
            LOGGER.error("{}", e);
        }
        return peripheryLog;
    }

}
