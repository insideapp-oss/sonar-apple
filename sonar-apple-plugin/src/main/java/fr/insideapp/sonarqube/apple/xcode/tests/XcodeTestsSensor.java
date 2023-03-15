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
package fr.insideapp.sonarqube.apple.xcode.tests;

import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.xcode.tests.models.XcodeTestSummary;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadObjectRunnable;
import fr.insideapp.sonarqube.apple.xcode.parser.XcodeActionRecordParsable;
import fr.insideapp.sonarqube.apple.xcode.runner.XcodeResultReadRunnable;
import fr.insideapp.sonarqube.apple.xcode.tests.mapper.XcodeTestsMappable;
import fr.insideapp.sonarqube.apple.xcode.tests.parser.XcodeTestsParsable;
import fr.insideapp.sonarqube.apple.xcode.tests.recorder.XcodeTestsRecordable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class XcodeTestsSensor implements Sensor {

    private final Swift swift;
    private final ObjectiveC objectiveC;
    private final XcodeResultExtensionProvider extensionProvider;
    private final FileSystem fileSystem;
    private final XcodeResultReadRunnable readRunner;
    private final XcodeActionRecordParsable actionRecordParser;
    private final XcodeResultReadObjectRunnable readObjectRunner;
    private final XcodeTestsParsable parser;
    private final XcodeTestsMappable mapper;
    private final XcodeTestsRecordable recorder;
    public XcodeTestsSensor(
            final Swift swift,
            final ObjectiveC objectiveC,
            final XcodeResultExtensionProvider extensionProvider,
            final FileSystem fileSystem,
            final XcodeResultReadRunnable readRunner,
            final XcodeActionRecordParsable actionRecordParser,
            final XcodeResultReadObjectRunnable readObjectRunner,
            final XcodeTestsParsable parser,
            final XcodeTestsMappable mapper,
            final XcodeTestsRecordable recorder
    ) {
        this.swift = swift;
        this.objectiveC = objectiveC;
        this.extensionProvider = extensionProvider;
        this.fileSystem = fileSystem;
        this.readRunner = readRunner;
        this.actionRecordParser = actionRecordParser;
        this.readObjectRunner = readObjectRunner;
        this.parser = parser;
        this.mapper = mapper;
        this.recorder = recorder;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .name("Xcode Tests")
                .onlyOnLanguages(swift.getKey(), objectiveC.getKey())
                .onlyWhenConfiguration(configuration -> extensionProvider.resultBundle(fileSystem, configuration).exists())
                .onlyOnFileType(InputFile.Type.TEST);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        final File resultBundle = extensionProvider.resultBundle(sensorContext.fileSystem(), sensorContext.config());
        final String xcodeResultReadOutput = readRunner.run(resultBundle);
        final List<XcodeTestSummary> testSummaries = actionRecordParser.parse(xcodeResultReadOutput)
                .stream()
                .filter(action -> Objects.nonNull(action.result.testsRef)) // remove null values
                .map(action -> readObjectRunner.run(resultBundle, action.result.testsRef))
                .filter(StringUtils::isNotEmpty) // remove empty values
                .map(parser::parse)
                .map(mapper::map)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        recorder.record(testSummaries, sensorContext);
    }

}
