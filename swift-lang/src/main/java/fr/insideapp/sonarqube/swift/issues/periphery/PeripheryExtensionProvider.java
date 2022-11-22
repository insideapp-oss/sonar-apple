package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParser;
import fr.insideapp.sonarqube.swift.issues.periphery.runner.PeripheryRunner;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public final class PeripheryExtensionProvider implements ExtensionProvider {

    private static final String CATEGORY = "Periphery";

    private static final String SCHEMES_KEY = "sonar.apple.periphery.schemes";
    private static final PropertyDefinition SCHEMES_PROPERTY = PropertyDefinition
            .builder(SCHEMES_KEY)
            .name("Xcode Schemes")
            .description("Comma-separated list of Xcode Schemes used.")
            .multiValues(true)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    private static final String TARGETS_KEY = "sonar.apple.periphery.targets";
    private static final PropertyDefinition TARGETS_PROPERTY = PropertyDefinition
            .builder(TARGETS_KEY)
            .name("Xcode Targets")
            .description("Comma-separated list of Xcode Targets.")
            .multiValues(true)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    private static final String INDEX_STORE_PATH_KEY = "sonar.apple.periphery.indexStorePath";
    private static final PropertyDefinition INDEX_STORE_PATH_PROPERTY = PropertyDefinition
            .builder(INDEX_STORE_PATH_KEY)
            .name("Index Store folder path")
            .description("Path to Index Store folder.")
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory(CATEGORY)
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                SCHEMES_PROPERTY,
                TARGETS_PROPERTY,
                INDEX_STORE_PATH_PROPERTY,
                PeripheryRulesDefinition.class,
                PeripheryRunner.class,
                PeripheryReportParser.class,
                PeripheryReportIssueMapper.class,
                PeripherySensor.class
        );
    }

    public static Optional<String> schemes(Configuration configuration) {
        return configuration
                .get(SCHEMES_KEY);
    }

    public static Optional<String> targets(Configuration configuration) {
        return configuration
                .get(TARGETS_KEY);
    }

    public static Optional<String> indexStorePath(Configuration configuration) {
        return configuration
                .get(INDEX_STORE_PATH_KEY);
    }

}