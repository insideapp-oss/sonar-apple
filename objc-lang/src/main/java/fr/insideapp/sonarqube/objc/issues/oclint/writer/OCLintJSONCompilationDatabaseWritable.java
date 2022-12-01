package fr.insideapp.sonarqube.objc.issues.oclint.writer;

import org.sonar.api.scanner.ScannerSide;

import javax.annotation.Nonnull;
import java.io.File;

@ScannerSide
public interface OCLintJSONCompilationDatabaseWritable {
    File write(@Nonnull String jsonCompileCommands);
}
