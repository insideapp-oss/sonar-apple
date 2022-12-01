package fr.insideapp.sonarqube.objc.issues.oclint.writer;

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

    private static final String COMPILE_COMMANDS_PATH = "build/compile_commands.json";

    private final FileSystem fileSystem;

    public OCLintJSONCompilationDatabaseWriter(
            final FileSystem fileSystem
    ) {
        this.fileSystem = fileSystem;
    }

    @Override
    public File write(@Nonnull String jsonCompileCommands) {
        // Retrieve the file where to write
        File jsonCompilationCommandsFile = jsonCompilationCommands();
        // Create the necessary but nonexistent parent directories
        jsonCompilationCommandsFile.getParentFile().mkdirs();
        // Write to the final file
        try (FileWriter jsonCompilationCommandsFileWriter = new FileWriter(jsonCompilationCommandsFile)) {
            jsonCompilationCommandsFileWriter.write(jsonCompileCommands);
        } catch (IOException e) {
            LOGGER.error("Failed to write the JSON Compilation Database to the file: {}", jsonCompilationCommandsFile.getAbsolutePath());
            LOGGER.debug("{}", e);
        }
        return jsonCompilationCommandsFile;
    }

    private File jsonCompilationCommands() {
        return new File(fileSystem.baseDir(), COMPILE_COMMANDS_PATH);
    }

}
