package fr.insideapp.sonarqube.swift.issues.periphery.runner;

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.scanner.ScannerSide;

@ScannerSide
public interface PeripheryRunnable extends CommandLineToolRunnable<String> {}
