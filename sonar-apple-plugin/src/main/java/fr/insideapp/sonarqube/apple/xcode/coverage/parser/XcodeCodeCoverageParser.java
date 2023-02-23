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
package fr.insideapp.sonarqube.apple.xcode.coverage.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.parser.ReportMapParser;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverageMetadata;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@ScannerSide
public final class XcodeCodeCoverageParser extends ReportMapParser<String, List<XcodeCodeCoverageMetadata>> implements XcodeCodeCoverageParsable {

    private final ObjectMapper objectMapper;

    public XcodeCodeCoverageParser() {
        this.objectMapper = new ObjectMapper()
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    protected String objectName() {
        return "file(s) with coverage data";
    }

    @Override
    protected Map<String, List<XcodeCodeCoverageMetadata>> perform(String input) throws Exception {
        return objectMapper.readValue(input, new TypeReference<>() {});
    }

}