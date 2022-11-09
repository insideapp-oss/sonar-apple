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
import fr.insideapp.sonarqube.objc.issues.oclint.models.OCLintReport;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.*;
import java.util.List;

public final class OCLintSensor implements Sensor {

    private static final Logger LOGGER = Loggers.get(OCLintSensor.class);

    public static final String JSON_COMPILATION_DATABASE_KEY = "sonar.apple.jsonCompilationDatabasePath";
    public static final String DEFAULT_JSON_COMPILATION_DATABASE_PATH = "build/json_compilation_database";

    private static final String COMPILE_COMMANDS_PATH = "build/compile_commands.json";
    private final SensorContext context;

    protected OCLintSensor(final SensorContext context) { this.context = context; }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .onlyOnLanguage(ObjectiveC.KEY)
                .name("OCLint Sensor")
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        checkPrerequisites();
    }

    private void checkPrerequisites() {
        File jsonCompilationDatabaseFolder = jsonCompilationDatabase();

        // Look for the JSON Compilation Database folder
        if (!jsonCompilationDatabaseFolder.exists()) {
            LOGGER.error("Failed to locate JSON Compilation Database folder.");
            LOGGER.error("Expected location according to the configuration is {}", jsonCompilationDatabaseFolder.getAbsolutePath());
            return;
        }

        // Make sure the JSON Compilation Database is a folder
        if (!jsonCompilationDatabaseFolder.isDirectory()) {
            LOGGER.error("The JSON Compilation Database is not a folder. Expecting one.");
            LOGGER.error("JSON Compilation Database path according to the configuration is {}", jsonCompilationDatabaseFolder.getAbsolutePath());
            return;
        }

        buildCompileCommands(jsonCompilationDatabaseFolder);
    }

    private void buildCompileCommands(File jsonCompilationDatabaseFolder) {
        // Building the JSON Database
        OCLintJSONDatabaseBuilder builder = new OCLintJSONDatabaseBuilder();
        String compileCommands = builder.build(jsonCompilationDatabaseFolder);
        writeCompileCommands(compileCommands);
    }

    private void writeCompileCommands(String compileCommands) {
        // Write to the final file
        File jsonCompilationCommandsFile = jsonCompilationCommands();
        jsonCompilationCommandsFile.getParentFile().mkdirs();
        try (FileWriter jsonCompilationCommandsFileWriter = new FileWriter(jsonCompilationCommandsFile)) {
            jsonCompilationCommandsFileWriter.write(compileCommands);
            extractReport(jsonCompilationCommandsFile);
        } catch (IOException e) {
            LOGGER.error("Failed to write the JSON Compilation Database to the file. Exception: {}", e);
            LOGGER.debug("{}", e);
        }
    }

    private void extractReport(File jsonCompilationCommandsFile) {
        // Extract
        OCLintExtractor extractor = new OCLintExtractor(context);
        try {
            OCLintReport report = extractor.extract(jsonCompilationCommandsFile.getParentFile());
            parseReport(report);
        } catch (Exception e) {
            LOGGER.error("Extracting the JSON Database (OCLint) failed.");
            LOGGER.debug("{}", e);
        }
    }

    private void parseReport(OCLintReport report) {
        // Parse issues
        List<ReportIssue> issues = new OCLintReportParser().collect(report);
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder(context);
        issueRecorder.recordIssues(issues, OCLintRulesDefinition.REPOSITORY_KEY);
    }

    private String jsonCompilationDatabasePath() {
        return context.config()
                .get(JSON_COMPILATION_DATABASE_KEY)
                .orElse(DEFAULT_JSON_COMPILATION_DATABASE_PATH);
    }

    private File jsonCompilationDatabase() {
        String jsonCompilationDatabaseAbsolutePath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(jsonCompilationDatabasePath());
        return new File(jsonCompilationDatabaseAbsolutePath);
    }

    private File jsonCompilationCommands() {
        String jsonCompilationCommandsAbsolutePath = context
                .fileSystem()
                .baseDir()
                .getAbsolutePath()
                .concat(File.separator)
                .concat(COMPILE_COMMANDS_PATH);
        return new File(jsonCompilationCommandsAbsolutePath);
    }

}
