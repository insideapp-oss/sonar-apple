package fr.insideapp.sonarqube.objc.issues.oclint.retriever;

import fr.insideapp.sonarqube.objc.issues.oclint.OCLintExtensionProvider;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

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
        final String jsonCompilationDatabasePath = ocLintExtensionProvider.jsonCompilationDatabasePath(configuration);
        File jsonCompilationDatabaseFile = new File(jsonCompilationDatabasePath);
        if (!jsonCompilationDatabaseFile.isAbsolute()) {
            jsonCompilationDatabaseFile = new File(fileSystem.baseDir(), jsonCompilationDatabasePath);
        }
        return jsonCompilationDatabaseFile;
    }

}
