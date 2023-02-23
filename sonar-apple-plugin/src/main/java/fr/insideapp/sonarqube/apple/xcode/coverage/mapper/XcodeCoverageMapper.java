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
package fr.insideapp.sonarqube.apple.xcode.coverage.mapper;

import fr.insideapp.sonarqube.apple.commons.mapper.AbstractReportMapper;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverage;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverageMetadata;
import org.sonar.api.scanner.ScannerSide;

import java.util.*;
import java.util.stream.Collectors;

@ScannerSide
public final class XcodeCoverageMapper extends AbstractReportMapper<Map<String, List<XcodeCodeCoverageMetadata>>, XcodeCodeCoverage> implements XcodeCoverageMappable {

    @Override
    protected Set<XcodeCodeCoverage> perform(Map<String, List<XcodeCodeCoverageMetadata>> input) throws Exception {
        return input
                .entrySet()
                .stream()
                .map(XcodeCodeCoverage::new)
                .collect(Collectors.toSet());
    }

}