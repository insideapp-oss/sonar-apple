/*
 * SonarQube Apple Plugin - Enables analysis of Swift and Objective-C projects into SonarQube.
 * Copyright © 2022 inside|app (contact@insideapp.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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

    @Override
    protected String objectName() {
        return "MobSF issue(s)";
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