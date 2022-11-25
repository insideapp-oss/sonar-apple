package fr.insideapp.sonarqube.apple.mobsfscan.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.parser.AbstractReportParser;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanReport;
import fr.insideapp.sonarqube.apple.mobsfscan.models.MobSFScanIssue;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@ScannerSide
public final class MobSFScanReportParser extends AbstractReportParser<MobSFScanIssue> implements MobSFScanReportParsable {

    private final ObjectMapper objectMapper;

    public MobSFScanReportParser() {
        this.objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    protected List<MobSFScanIssue> perform(String input) throws Exception {
        return objectMapper.readValue(input, MobSFScanReport.class)
                .results
                .entrySet()
                .stream()
                .map(MobSFScanIssue::new)
                .collect(Collectors.toList());
    }

}