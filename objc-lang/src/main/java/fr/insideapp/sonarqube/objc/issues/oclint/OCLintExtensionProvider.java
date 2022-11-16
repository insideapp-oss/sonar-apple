package fr.insideapp.sonarqube.objc.issues.oclint;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintExtractor;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintJSONDatabaseBuilder;
import fr.insideapp.sonarqube.objc.issues.oclint.implementations.OCLintReportParser;
import org.sonar.api.config.Configuration;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.Arrays;
import java.util.List;

public final class OCLintExtensionProvider implements ExtensionProvider {

    private static final String JSON_COMPILATION_DATABASE_KEY = "sonar.apple.jsonCompilationDatabasePath";
    private static final String DEFAULT_JSON_COMPILATION_DATABASE_PATH = "build/json_compilation_database";
    private static final PropertyDefinition JSON_COMPILATION_DATABASE_PROPERTY = PropertyDefinition
            .builder(JSON_COMPILATION_DATABASE_KEY)
            .name("JSON Compilation Database path")
            .description("Path to JSON Compilation Database folder. The path may be either absolute or relative to the project base directory.")
            .defaultValue(DEFAULT_JSON_COMPILATION_DATABASE_PATH)
            .onQualifiers(Qualifiers.PROJECT)
            .category(APPLE_CATEGORY)
            .subCategory("OCLint")
            .build();

    public List<Object> extensions() {
        return Arrays.asList(
                JSON_COMPILATION_DATABASE_PROPERTY,
                OCLintRulesDefinition.class,
                OCLintJSONDatabaseBuilder.class,
                OCLintExtractor.class,
                OCLintReportParser.class,
                OCLintSensor.class
        );
    }

    public static String jsonCompilationDatabasePath(Configuration configuration) {
        return configuration
                .get(JSON_COMPILATION_DATABASE_KEY)
                .orElse(DEFAULT_JSON_COMPILATION_DATABASE_PATH);
    }

}
