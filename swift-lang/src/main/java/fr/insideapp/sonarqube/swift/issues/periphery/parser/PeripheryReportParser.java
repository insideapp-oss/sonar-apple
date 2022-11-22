package fr.insideapp.sonarqube.swift.issues.periphery.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.parser.AbstractReportParser;
import fr.insideapp.sonarqube.swift.issues.periphery.models.PeripheryIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@ScannerSide
public final class PeripheryReportParser extends AbstractReportParser<PeripheryIssue> implements PeripheryReportParsable {

    private final ObjectMapper objectMapper;

    public PeripheryReportParser() {
        this.objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    protected List<PeripheryIssue> perform(String input) throws Exception {
        return Arrays.asList(objectMapper.readValue(input, PeripheryIssue[].class));
    }

}