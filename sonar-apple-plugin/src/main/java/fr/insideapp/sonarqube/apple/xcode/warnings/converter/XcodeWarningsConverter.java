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
package fr.insideapp.sonarqube.apple.xcode.warnings.converter;

import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.apple.commons.utils.QueryParameterUtils;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarning;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningLocation;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarningType;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.models.DocumentLocation;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.models.WarningSummary;
import org.sonar.api.scanner.ScannerSide;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

@ScannerSide
public final class XcodeWarningsConverter extends AbstractReportMapper<List<WarningSummary>, XcodeWarning> implements XcodeWarningConvertible {

    private static final Logger LOGGER = Loggers.get(XcodeWarningsConverter.class);

    @Override
    protected Set<XcodeWarning> perform(List<WarningSummary> input) throws Exception {
        return input.stream()
            .map(XcodeWarningsConverter::mapping)
            .collect(Collectors.toSet());
    }

    private static XcodeWarning mapping(WarningSummary summary) {
        XcodeWarningType type = XcodeWarningType.builder(summary.type);
        XcodeWarningLocation location = mapLocation(summary.location);
        return new XcodeWarning(type, summary.message, location);
    }

    private static XcodeWarningLocation mapLocation(DocumentLocation location) {
        if (location == null) { return null; }
        URI uri = location.uri;
        try {
            String filePath = uri.getPath();
            String rawQueryParameters = uri.getFragment();
            if (rawQueryParameters == null) {
                return new XcodeWarningLocation(filePath, null);
            } else {
                Map<String, String> warningLocationData = QueryParameterUtils.parse(rawQueryParameters);
                String rawLineNumber = warningLocationData.get("StartingLineNumber");
                Integer lineNumber = Integer.valueOf(rawLineNumber);
                return new XcodeWarningLocation(filePath, lineNumber + 1); // I don't know why, there is an offset of one
            }
        } catch (Exception e) {
            LOGGER.info("An exception occurred while mapping Xcode warning data. Please run in debug mode for more information.");
            LOGGER.debug("{}", e);
            return null;
        }
    }

}