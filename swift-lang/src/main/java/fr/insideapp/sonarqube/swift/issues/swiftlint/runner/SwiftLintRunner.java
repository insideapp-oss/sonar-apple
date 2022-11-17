package fr.insideapp.sonarqube.swift.issues.swiftlint.runner;

import fr.insideapp.sonarqube.apple.commons.cli.MultiCommandLineToolBuilder;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

@ScannerSide
public final class SwiftLintRunner extends MultiCommandLineToolBuilder implements SwiftLintRunnable {

    public SwiftLintRunner(Configuration configuration) {
        super(configuration, "swiftlint");
    }

    @Override
    protected String[] options(String source) {
        return new String[]{"lint", "--quiet", "--reporter", "json", source};
    }

    @Override
    protected Integer[] exitCodes() {
        return new Integer[]{0, 2};
    }

}
