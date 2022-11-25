package fr.insideapp.sonarqube.apple.mobsfscan.runner;

import fr.insideapp.sonarqube.apple.commons.interfaces.CommandLineToolRunnable;
import org.sonar.api.scanner.ScannerSide;

@ScannerSide
public interface MobSFScanRunnable extends CommandLineToolRunnable<String> {}
