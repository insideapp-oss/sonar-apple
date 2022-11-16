package fr.insideapp.sonarqube.objc.issues.oclint.interfaces;

import org.sonar.api.scanner.ScannerSide;

import java.io.File;

@ScannerSide
public
interface OCLintJSONDatabaseBuildable {
    String build(File jsonCompilationDatabaseFolder);
}
