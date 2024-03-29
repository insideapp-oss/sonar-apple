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
package fr.insideapp.sonarqube.apple.mobsfscan;

import fr.insideapp.sonarqube.apple.commons.ExtensionProvider;
import fr.insideapp.sonarqube.apple.mobsfscan.mapper.MobSFScanReportMapper;
import fr.insideapp.sonarqube.apple.mobsfscan.parser.MobSFScanReportParser;
import fr.insideapp.sonarqube.apple.mobsfscan.runner.MobSFScanRunner;
import fr.insideapp.sonarqube.apple.mobsfscan.splitter.MobSFScanReportIssueSplitter;
import fr.insideapp.sonarqube.objc.issues.mobsfscan.MobSFScanObjectiveCRulesDefinition;
import fr.insideapp.sonarqube.swift.issues.mobsfscan.MobSFScanSwiftRulesDefinition;
import org.sonar.api.scanner.ScannerSide;

import java.util.Arrays;
import java.util.List;

@ScannerSide
public final class MobSFScanExtensionProvider implements ExtensionProvider {

    public List<Object> extensions() {
        return Arrays.asList(
                MobSFScanSwiftRulesDefinition.class,
                MobSFScanObjectiveCRulesDefinition.class,
                MobSFScanRunner.class,
                MobSFScanReportParser.class,
                MobSFScanReportMapper.class,
                MobSFScanReportIssueSplitter.class,
                MobSFScanSensor.class
        );
    }


}