package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;

import java.util.Arrays;
import java.util.List;

public final class SwiftLintExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
                SwiftLintRulesDefinition.class,
                SwiftLintRunner.class,
                SwiftLintSensor.class
        );
    }


}
