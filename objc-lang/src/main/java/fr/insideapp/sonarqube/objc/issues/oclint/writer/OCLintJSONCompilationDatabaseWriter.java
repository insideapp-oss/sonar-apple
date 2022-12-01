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
