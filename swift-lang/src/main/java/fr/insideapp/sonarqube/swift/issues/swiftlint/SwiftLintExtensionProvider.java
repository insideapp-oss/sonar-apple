package fr.insideapp.sonarqube.swift.issues.swiftlint;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.swiftlint.mapper.SwiftLintReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.swiftlint.parser.SwiftLintReportParser;
import fr.insideapp.sonarqube.swift.issues.swiftlint.runner.SwiftLintRunner;

import java.util.Arrays;
import java.util.List;

public final class SwiftLintExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
                SwiftLintRulesDefinition.class,
                SwiftLintRunner.class,
                SwiftLintReportParser.class,
                SwiftLintReportIssueMapper.class,
                SwiftLintSensor.class
        );
    }


}
