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
package fr.insideapp.sonarqube.objc.issues.oclint.runner;

import fr.insideapp.sonarqube.apple.commons.SonarProjectConfiguration;
import fr.insideapp.sonarqube.apple.commons.cli.SingleCommandLineToolRunner;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.objc.issues.oclint.OCLintExtensionProvider;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ScannerSide
public final class OCLintRunner extends SingleCommandLineToolRunner implements OCLintRunnable {

    private static final Logger LOGGER = Loggers.get(OCLintRunner.class);

    private final SonarProjectConfiguration sonarProjectConfiguration;
    private final OCLintExtensionProvider ocLintExtensionProvider;
    private final ObjectiveC objectiveC;
    private final FileSystem fileSystem;

    public OCLintRunner(
            final SonarProjectConfiguration sonarProjectConfiguration,
            final OCLintExtensionProvider ocLintExtensionProvider,
            final ObjectiveC objectiveC,
            final FileSystem fileSystem
    ) {
        super("oclint-json-compilation-database");
        this.sonarProjectConfiguration = sonarProjectConfiguration;
        this.ocLintExtensionProvider = ocLintExtensionProvider;
        this.objectiveC = objectiveC;
        this.fileSystem = fileSystem;
    }

    @Override
    protected String[] options() {
        List<String> options = new ArrayList<>();
        options.addAll(sources());
        options.addAll(jsonCompilationDatabase());
        options.add("--");
        options.addAll(Arrays.asList("-report-type", "json"));
        return options.stream().toArray(String[]::new);
    }

    private List<String> sources() {
        List<String> options = new ArrayList<>();
        // Retrieve all the sources specified
        final List<String> sources = sonarProjectConfiguration.sources();
        // Retrieve all the file extensions for Objective-C
        String fileExtensions = String.join("|", objectiveC.getFileSuffixes());
        final File baseDirectory = fileSystem.baseDir();
        // Build parameters for each source
        for (String source : sources) {
            options.add("--include");
            String regexPath = String.format("%s/.*\\.(%s)", source, fileExtensions);
            File absoluteRegexPath = new File(baseDirectory, regexPath);
            LOGGER.debug("For source '{}', following regex is used: {}", source, absoluteRegexPath.getAbsolutePath());
            // We use the absolute path since (same as JSON Compilation Database)
            options.add(absoluteRegexPath.getAbsolutePath());
        }
        return options;
    }

    private List<String> jsonCompilationDatabase() {
        List<String> options = new ArrayList<>();
        options.add("-p");
        File jsonCompilationDatabasePath = ocLintExtensionProvider.jsonCompilationDatabasePath(fileSystem);
        // We get the parent since OCLint wants the parent folder
        options.add(jsonCompilationDatabasePath.getParentFile().getAbsolutePath());
        return options;
    }

}
