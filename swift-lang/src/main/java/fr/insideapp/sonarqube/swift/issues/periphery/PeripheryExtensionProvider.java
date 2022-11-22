package fr.insideapp.sonarqube.swift.issues.periphery;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.swift.issues.periphery.mapper.PeripheryReportIssueMapper;
import fr.insideapp.sonarqube.swift.issues.periphery.parser.PeripheryReportParser;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.Arrays;
import java.util.List;

public final class PeripheryExtensionProvider implements ExtensionProvider {

    private static final String PERIPHERY_LOG_KEY = "sonar.apple.periphery.logPath";
    private static final String DEFAULT_PERIPHERY_LOG_PATH = "build/periphery.json";
    private static final PropertyDefinition PERIPHERY_LOG_PROPERTY = PropertyDefinition
            .builder(PERIPHERY_LOG_KEY)
            .name("Periphery log file path")
            .description("Path to Periphery log file. The path may be either absolute or relative to the project base directory.")
            .defaultValue(DEFAULT_PERIPHERY_LOG_PATH)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory("Periphery")
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                PERIPHERY_LOG_PROPERTY,
                PeripheryRulesDefinition.class,
                PeripheryReportParser.class,
                PeripheryReportIssueMapper.class,
                PeripherySensor.class
        );
    }

    public static String peripheryLogPath(Configuration configuration) {
        return configuration
                .get(PERIPHERY_LOG_KEY)
                .orElse(DEFAULT_PERIPHERY_LOG_PATH);
    }

}