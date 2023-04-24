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
package fr.insideapp.sonarqube.apple.xcode.warnings;
;
import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssue;
import fr.insideapp.sonarqube.apple.commons.issues.ReportIssueRecorder;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunnable;
import fr.insideapp.sonarqube.apple.xcode.warnings.converter.XcodeWarningConvertible;
import fr.insideapp.sonarqube.apple.xcode.warnings.mapper.XcodeWarningsMappable;
import fr.insideapp.sonarqube.apple.xcode.warnings.models.XcodeWarning;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.XcodeWarningParsable;
import fr.insideapp.sonarqube.apple.xcode.warnings.parser.models.WarningSummary;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class XcodeWarningsSensor implements Sensor {

    private final Swift swift;
    private final ObjectiveC objectiveC;
    private final XcodeResultExtensionProvider extensionProvider;
    private final XcodeResultReadRunnable runner;
    private final XcodeWarningParsable parser;
    private final XcodeWarningConvertible converter;
    private final XcodeWarningsMappable mapper;

    public XcodeWarningsSensor(
        final Swift swift,
        final ObjectiveC objectiveC,
        final XcodeResultExtensionProvider extensionProvider,
        final XcodeResultReadRunnable runner,
        final XcodeWarningParsable parser,
        final XcodeWarningConvertible converter,
        final XcodeWarningsMappable mapper
    ) {
        this.swift = swift;
        this.objectiveC = objectiveC;
        this.extensionProvider = extensionProvider;
        this.runner = runner;
        this.parser = parser;
        this.converter = converter;
        this.mapper = mapper;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
            .name("Xcode Warnings")
            .onlyOnLanguages(swift.getKey(), objectiveC.getKey());
    }

    @Override
    public void execute(SensorContext sensorContext) {
        final File resultBundle = extensionProvider.resultBundle(sensorContext.fileSystem(), sensorContext.config());
        final String xcodeResultReadOutput = runner.run(resultBundle);
        final List<WarningSummary> warningSummaries = parser.parse(xcodeResultReadOutput);
        List<XcodeWarning> xcodeWarnings = converter.map(warningSummaries).stream().collect(Collectors.toList());
        List<ReportIssue> reportIssues = mapper.map(xcodeWarnings).stream().collect(Collectors.toList());
        // TODO: split
        ReportIssueRecorder issueRecorder = new ReportIssueRecorder();
        // TODO
    }
}
