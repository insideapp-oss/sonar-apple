package fr.insideapp.sonarqube.objc.issues.oclint.retriever;

import org.sonar.api.scanner.ScannerSide;

import java.io.File;

@ScannerSide
public interface OCLintJSONCompilationDatabaseFolderRetrievable {

    File retrieve() throws OCLintJSONCompilationDatabaseFolderRetrieverException;

}
