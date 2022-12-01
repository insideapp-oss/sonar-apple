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
package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.oclint.builder.OCLintJSONCompilationDatabaseBuildable;
import fr.insideapp.sonarqube.objc.issues.oclint.runner.OCLintRunnable;
import fr.insideapp.sonarqube.objc.issues.oclint.interfaces.OCLintReportParsable;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetrievable;
import fr.insideapp.sonarqube.objc.issues.oclint.retriever.OCLintJSONCompilationDatabaseFolderRetrieverException;
import fr.insideapp.sonarqube.objc.issues.oclint.writer.OCLintJSONCompilationDatabaseWritable;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.Nullable;
import java.io.*;
import java.util.List;

public final class OCLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(OCLintSensor.class);

    private final ObjectiveC objectiveC;
    private final OCLintJSONCompilationDatabaseFolderRetrievable retriever;
    private final OCLintJSONCompilationDatabaseBuildable builder;
    private final OCLintJSONCompilationDatabaseWritable writer;
    private final OCLintRunnable runner;
    private final ReportIssueRecorder issueRecorder;
    private final OCLintReportParsable parser;

    OCLintSensor(
            final ObjectiveC objectiveC,
            final OCLintJSONCompilationDatabaseFolderRetrievable retriever,
            final OCLintJSONCompilationDatabaseBuildable builder,
            final OCLintJSONCompilationDatabaseWritable writer,
            final OCLintRunnable runner,
            final OCLintReportParsable parser,
            final ReportIssueRecorder issueRecorder
    ) {
        this.objectiveC = objectiveC;
        this.retriever = retriever;
        this.builder = builder;
        this.writer = writer;
        this.runner = runner;
        this.parser = parser;
        this.issueRecorder = issueRecorder;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(objectiveC.getKey())
                .name("OCLint Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        // Retrieve the JSON Compilation Database folder
        File jsonCompilationDatabase = retrieveJsonCompilationDatabaseFolder();
        if (jsonCompilationDatabase == null) { return; }
        // Building the JSON Compilation Database
        String jsonCompileCommands = builder.build(jsonCompilationDatabase);
        // Write the JSON Compilation Database to a file
        if (!writer.write(jsonCompileCommands)) { return; }
        String output = runner.run();
        // TODO
        /*
        OCLintReport oclintReport = objectMapper.readValue(output, OCLintReport.class);
        LOGGER.info("OCLint found {} violation(s)", oclintReport.violations.length);
        if (report == null) { return; }
        parseReport(report, sensorContext);*/
    }

    @Nullable
    private File retrieveJsonCompilationDatabaseFolder() {
        File jsonCompilationDatabase = null;
        try {
            jsonCompilationDatabase = retriever.retrieve();
        } catch (OCLintJSONCompilationDatabaseFolderRetrieverException e) {
            LOGGER.error("Failed to retrieve the JSON Compilation Database folder");
            LOGGER.debug("Exception: {}", e.getMessage());
        }
        return null;
    }

    private void parseReport(OCLintReport report, SensorContext context) {
        // Parse issues
        List<ReportIssue> issues = parser.collect(report);
        issueRecorder.recordIssues(issues, OCLintRulesDefinition.REPOSITORY_KEY, context);
    }

}
