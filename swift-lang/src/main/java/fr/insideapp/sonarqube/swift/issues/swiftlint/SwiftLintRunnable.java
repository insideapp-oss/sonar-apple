package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.CommandLineToolRunnable;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface SwiftLintRunnable extends CommandLineToolRunnable<List<String>> {}
