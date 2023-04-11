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
package fr.insideapp.sonarqube.apple.xcode.warnings.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fr.insideapp.sonarqube.apple.commons.parser.ReportListParser;
import fr.insideapp.sonarqube.apple.commons.result.models.Issue;
import fr.insideapp.sonarqube.apple.commons.result.models.WarningSummary;
import org.sonar.api.scanner.ScannerSide;

import java.util.List;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@ScannerSide
public final class XcodeWarningParser extends ReportListParser<WarningSummary> implements XcodeWarningParsable {

    private final ObjectMapper objectMapper;

    public XcodeWarningParser() {
        this.objectMapper = new ObjectMapper()
            .disable(FAIL_ON_UNKNOWN_PROPERTIES)
            .enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    protected String objectName() {
        return "warning(s)";
    }

    @Override
    protected List<WarningSummary> perform(String input) throws Exception {
        final JsonNode issueNode = objectMapper.readTree(input).get("issues");
        final Issue issue = objectMapper.readValue(objectMapper.treeAsTokens(issueNode), Issue.class);
        return issue.warnings;
    }

}