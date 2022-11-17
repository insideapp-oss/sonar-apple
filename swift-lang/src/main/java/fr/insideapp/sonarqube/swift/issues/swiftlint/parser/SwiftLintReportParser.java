package fr.insideapp.sonarqube.swift.issues.swiftlint.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import fr.insideapp.sonarqube.apple.commons.parser.AbstractReportParser;
import fr.insideapp.sonarqube.swift.issues.swiftlint.models.SwiftLintIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@ScannerSide
public final class SwiftLintReportParser extends AbstractReportParser<SwiftLintIssue> implements SwiftLintReportParsable {

    private final ObjectMapper objectMapper;

    public SwiftLintReportParser() {
        this.objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    protected List<SwiftLintIssue> perform(String input) throws Exception {
        return Arrays.asList(objectMapper.readValue(input, SwiftLintIssue[].class));
    }

}