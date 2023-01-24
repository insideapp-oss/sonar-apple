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
package fr.insideapp.sonarqube.objc.issues.oclint.retriever;

import fr.insideapp.sonarqube.objc.issues.oclint.OCLintExtensionProvider;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.Nonnull;
import java.io.File;

@ScannerSide
public final class OCLintJSONCompilationDatabaseFolderRetriever implements OCLintJSONCompilationDatabaseFolderRetrievable {

    private static final Logger LOGGER = Loggers.get(OCLintJSONCompilationDatabaseFolderRetriever.class);

    private final OCLintExtensionProvider ocLintExtensionProvider;

    private final FileSystem fileSystem;
    private final Configuration configuration;

    public OCLintJSONCompilationDatabaseFolderRetriever(
            final OCLintExtensionProvider ocLintExtensionProvider,
            final FileSystem fileSystem,
            final Configuration configuration
    ) {
        this.ocLintExtensionProvider = ocLintExtensionProvider;
        this.fileSystem = fileSystem;
        this.configuration = configuration;
    }

    @Override
    @Nonnull
    public File retrieve() throws OCLintJSONCompilationDatabaseFolderRetrieverException {
        File jsonCompilationDatabaseFolder = jsonCompilationDatabase();
        LOGGER.debug("JSON Compilation Database folder path according to the configuration is {}", jsonCompilationDatabaseFolder.getAbsolutePath());

        // Look for the JSON Compilation Database folder
        if (!jsonCompilationDatabaseFolder.exists()) {
            throw new OCLintJSONCompilationDatabaseFolderRetrieverException("The JSON Compilation Database folder does not exist.");
        }

        // Make sure the JSON Compilation Database is a folder
        if (!jsonCompilationDatabaseFolder.isDirectory()) {
            throw new OCLintJSONCompilationDatabaseFolderRetrieverException("The JSON Compilation Database is not a folder.");
        }
        return jsonCompilationDatabaseFolder;
    }

    /**
     * Returns a java.io.File for the given path.
     * If path is not absolute, returns a File with module base directory as parent path.
     */
    private File jsonCompilationDatabase() {
        final String jsonCompilationDatabasePath = ocLintExtensionProvider.jsonCompilationDatabaseFolderPath(configuration);
        File jsonCompilationDatabaseFile = new File(jsonCompilationDatabasePath);
        if (!jsonCompilationDatabaseFile.isAbsolute()) {
            jsonCompilationDatabaseFile = new File(fileSystem.baseDir(), jsonCompilationDatabasePath);
        }
        return jsonCompilationDatabaseFile;
    }

}
