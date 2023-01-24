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
package fr.insideapp.sonarqube.objc.issues.oclint.writer;

import fr.insideapp.sonarqube.objc.issues.oclint.OCLintExtensionProvider;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@ScannerSide
public final class OCLintJSONCompilationDatabaseWriter implements OCLintJSONCompilationDatabaseWritable {

    private static final Logger LOGGER = Loggers.get(OCLintJSONCompilationDatabaseWriter.class);

    private final OCLintExtensionProvider ocLintExtensionProvider;
    private final FileSystem fileSystem;

    public OCLintJSONCompilationDatabaseWriter(
            final OCLintExtensionProvider ocLintExtensionProvider,
            final FileSystem fileSystem
    ) {
        this.ocLintExtensionProvider = ocLintExtensionProvider;
        this.fileSystem = fileSystem;
    }

    @Override
    public boolean write(@Nonnull String jsonCompileCommands) {
        boolean success = false;
        // Retrieve the file where to write
        File jsonCompilationCommandsFile = ocLintExtensionProvider.jsonCompilationDatabasePath(fileSystem);
        // Write to the final file
        try (FileWriter jsonCompilationCommandsFileWriter = new FileWriter(jsonCompilationCommandsFile)) {
            jsonCompilationCommandsFileWriter.write(jsonCompileCommands);
            success = true;
        } catch (IOException e) {
            LOGGER.error("Failed to write the JSON Compilation Database to the file: {}", jsonCompilationCommandsFile.getAbsolutePath());
            LOGGER.debug("{}", e);
        }
        return success;
    }

}
