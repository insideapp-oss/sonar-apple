package fr.insideapp.sonarqube.swift.issues.swiftlint.runner;

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

@ScannerSide
public interface SwiftLintRunnable extends CommandLineToolRunnable<List<String>> {}
