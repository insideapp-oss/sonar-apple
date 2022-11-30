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
import fr.insideapp.sonarqube.objc.issues.oclint.interfaces.OCLintExtractable;
import fr.insideapp.sonarqube.objc.issues.oclint.interfaces.OCLintJSONDatabaseBuildable;
import fr.insideapp.sonarqube.objc.issues.oclint.interfaces.OCLintReportParsable;
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.*;
import java.util.List;

public final class OCLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(OCLintSensor.class);

    private static final String COMPILE_COMMANDS_PATH = "build/compile_commands.json";

    private final ObjectiveC objectiveC;
    private final OCLintExtensionProvider ocLintExtensionProvider;
    private final Configuration configuration;
    private final FileSystem fileSystem;
    private final OCLintJSONDatabaseBuildable builder;
    private final OCLintExtractable extractor;
    private final ReportIssueRecorder issueRecorder;

    private final OCLintReportParsable parser;
    OCLintSensor(
            final ObjectiveC objectiveC,
            final OCLintExtensionProvider ocLintExtensionProvider,
            final Configuration configuration,
            final FileSystem fileSystem,
            final OCLintJSONDatabaseBuildable builder,
            final OCLintExtractable extractor,
            final OCLintReportParsable parser,
            final ReportIssueRecorder issueRecorder
    ) {
        this.objectiveC = objectiveC;
        this.ocLintExtensionProvider = ocLintExtensionProvider;
        this.configuration = configuration;
        this.fileSystem = fileSystem;
        this.builder = builder;
        this.extractor = extractor;
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
        File jsonCompilationDatabase = retrieveJsonCompilationDatabase();
        if (jsonCompilationDatabase == null) { return; }
        File jsonCompilationCommandsFile = buildCompileCommands(jsonCompilationDatabase);
        OCLintReport report = extractReport(jsonCompilationCommandsFile);
        if (report == null) { return; }
        parseReport(report, sensorContext);
    }

    private File retrieveJsonCompilationDatabase() {
        File jsonCompilationDatabaseFolder = jsonCompilationDatabase();

        // Look for the JSON Compilation Database folder
        if (!jsonCompilationDatabaseFolder.exists()) {
            LOGGER.error("Failed to locate JSON Compilation Database folder.");
            LOGGER.error("Expected location according to the configuration is {}", jsonCompilationDatabaseFolder.getAbsolutePath());
            return null;
        }

        // Make sure the JSON Compilation Database is a folder
        if (!jsonCompilationDatabaseFolder.isDirectory()) {
            LOGGER.error("The JSON Compilation Database is not a folder. Expecting one.");
            LOGGER.error("JSON Compilation Database path according to the configuration is {}", jsonCompilationDatabaseFolder.getAbsolutePath());
            return null;
        }
        return jsonCompilationDatabaseFolder;
    }

    private File buildCompileCommands(File jsonCompilationDatabaseFolder) {
        // Building the JSON Database
        String compileCommands = builder.build(jsonCompilationDatabaseFolder);
        // Write to the final file
        File jsonCompilationCommandsFile = jsonCompilationCommands();
        jsonCompilationCommandsFile.getParentFile().mkdirs();
        try (FileWriter jsonCompilationCommandsFileWriter = new FileWriter(jsonCompilationCommandsFile)) {
            jsonCompilationCommandsFileWriter.write(compileCommands);
        } catch (IOException e) {
            LOGGER.error("Failed to write the JSON Compilation Database to the file. Exception: {}", e);
            LOGGER.debug("{}", e);
        }
        return jsonCompilationCommandsFile;
    }

    private OCLintReport extractReport(File jsonCompilationCommandsFile) {
        // Extract
        try {
            return extractor.extract(jsonCompilationCommandsFile.getParentFile());
        } catch (Exception e) {
            LOGGER.error("Extracting the JSON Database (OCLint) failed.");
            LOGGER.debug("{}", e);
            return null;
        }
    }

    private void parseReport(OCLintReport report, SensorContext context) {
        // Parse issues
        List<ReportIssue> issues = parser.collect(report);
        issueRecorder.recordIssues(issues, OCLintRulesDefinition.REPOSITORY_KEY, context);
    }

    private File jsonCompilationDatabase() {
        return new File(fileSystem.baseDir(), ocLintExtensionProvider.jsonCompilationDatabasePath(configuration));
    }

    private File jsonCompilationCommands() {
        return new File(fileSystem.baseDir(), COMPILE_COMMANDS_PATH);
    }

}
