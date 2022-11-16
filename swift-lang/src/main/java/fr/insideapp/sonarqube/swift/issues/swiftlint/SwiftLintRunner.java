package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.MultiCommandLineToolBuilder;
import org.sonar.api.config.Configuration;
import org.sonar.api.scanner.ScannerSide;

@ScannerSide
public final class SwiftLintRunner extends MultiCommandLineToolBuilder implements SwiftLintRunnable {

    public SwiftLintRunner(Configuration configuration) {
        super(configuration, "swiftlint");
    }

    @Override
    protected String[] options(String source) {
        // TODO: "--reporter", "json"
        return new String[]{"lint", "--quiet", source};
    }

    @Override
    protected Integer[] exitCodes() {
        return new Integer[]{0, 2};
    }

}
