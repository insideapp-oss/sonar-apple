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
package fr.insideapp.sonarqube.apple.xcode.coverage;

import fr.insideapp.sonarqube.apple.XcodeResultExtensionProvider;
import fr.insideapp.sonarqube.apple.xcode.coverage.mapper.XcodeCoverageMappable;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverage;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverageMetadata;
import fr.insideapp.sonarqube.apple.xcode.coverage.parser.XcodeCodeCoverageParsable;
import fr.insideapp.sonarqube.apple.xcode.coverage.recorder.XcodeCoverageRecordable;
import fr.insideapp.sonarqube.apple.xcode.coverage.runner.XcodeCoverageReadRunnable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;

import java.io.File;
import java.util.*;

public class XcodeCoverageSensor implements Sensor {

    private final Swift swift;
    private final ObjectiveC objectiveC;
    private final XcodeResultExtensionProvider extensionProvider;
    private final FileSystem fileSystem;
    private final XcodeCoverageReadRunnable runner;
    private final XcodeCodeCoverageParsable parser;
    private final XcodeCoverageMappable mapper;
    private final XcodeCoverageRecordable recorder;

    public XcodeCoverageSensor(
            final Swift swift,
            final ObjectiveC objectiveC,
            final XcodeResultExtensionProvider extensionProvider,
            final FileSystem fileSystem,
            final XcodeCoverageReadRunnable runner,
            final XcodeCodeCoverageParsable parser,
            final XcodeCoverageMappable mapper,
            final XcodeCoverageRecordable recorder
    ) {
        this.swift = swift;
        this.objectiveC = objectiveC;
        this.extensionProvider = extensionProvider;
        this.fileSystem = fileSystem;
        this.runner = runner;
        this.parser = parser;
        this.mapper = mapper;
        this.recorder = recorder;
    }

    @Override
    public void describe(SensorDescriptor sensorDescriptor) {
        sensorDescriptor
                .name("Xcode Coverage")
                .onlyOnLanguages(swift.getKey(), objectiveC.getKey())
                .onlyWhenConfiguration(configuration -> extensionProvider.resultBundle(fileSystem, configuration).exists())
                .onlyOnFileType(InputFile.Type.MAIN);
    }

    @Override
    public void execute(SensorContext sensorContext) {
        final File resultBundle = extensionProvider.resultBundle(sensorContext.fileSystem(), sensorContext.config());
        final String xcodeCoverageReadOutput = runner.run(resultBundle);
        final Map<String, List<XcodeCodeCoverageMetadata>> coverageData = parser.parse(xcodeCoverageReadOutput);
        final List<XcodeCodeCoverage> codeCoverageData = new ArrayList<>(mapper.map(coverageData));
        recorder.record(codeCoverageData);
    }

}
