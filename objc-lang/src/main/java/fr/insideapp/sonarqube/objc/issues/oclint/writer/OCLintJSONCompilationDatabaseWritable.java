package fr.insideapp.sonarqube.objc.issues.oclint.writer;

import org.sonar.api.scanner.ScannerSide;

import javax.annotation.Nonnull;

@ScannerSide
public interface OCLintJSONCompilationDatabaseWritable {
    boolean write(@Nonnull String jsonCompileCommands);
}
