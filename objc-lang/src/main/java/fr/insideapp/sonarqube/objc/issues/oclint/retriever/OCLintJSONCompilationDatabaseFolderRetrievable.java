package fr.insideapp.sonarqube.objc.issues.oclint.retriever;

import org.sonar.api.scanner.ScannerSide;

import javax.annotation.Nonnull;
import java.io.File;

@ScannerSide
public interface OCLintJSONCompilationDatabaseFolderRetrievable {

    @Nonnull
    File retrieve() throws OCLintJSONCompilationDatabaseFolderRetrieverException;

}
