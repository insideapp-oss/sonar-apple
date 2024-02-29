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
import fr.insideapp.sonarqube.apple.xcode.coverage.mapper.XcodeCoverageMapper;
import fr.insideapp.sonarqube.apple.xcode.coverage.parser.XcodeCodeCoverageParser;
import fr.insideapp.sonarqube.apple.xcode.coverage.recorder.XcodeCoverageRecorder;
import fr.insideapp.sonarqube.apple.xcode.coverage.runner.XcodeCoverageReadRunnable;
import fr.insideapp.sonarqube.objc.ObjectiveC;
import fr.insideapp.sonarqube.swift.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.DefaultSensorDescriptor;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.config.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class XcodeCoverageSensorTest {

    private static class Container {

        final String jsonFileName;
        final List<FileCoverage> files;

        public Container(
                String jsonFileName,
                List<FileCoverage> files
        ) {
            this.jsonFileName = jsonFileName;
            this.files = files;
        }
    }

    private static class FileCoverage {
        final String name;
        final List<Coverage> coverages;

        public FileCoverage(
                String name,
                List<Coverage> coverages
        ) {
            this.name = name;
            this.coverages = coverages;
        }
    }

    private static class Coverage {
        final Integer lineNumber;
        final Integer numberOfHits;

        public Coverage(
                Integer lineNumber,
                Integer numberOfHits
        ) {
            this.lineNumber = lineNumber;
            this.numberOfHits = numberOfHits;
        }
    }

    private static final String BASE_DIR = "/xcode/coverage/sensor";
    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeCoverageSensor sensor;
    private Configuration configuration;

    private Swift swift;
    private ObjectiveC objectiveC;
    private XcodeCoverageReadRunnable runner;
    private SensorContextTester context;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        configuration = mock(Configuration.class);
        swift = new Swift(configuration);
        objectiveC = new ObjectiveC();
        runner = mock(XcodeCoverageReadRunnable.class);
        sensor = new XcodeCoverageSensor(
                swift,
                objectiveC,
                new XcodeResultExtensionProvider(),
                context.fileSystem(),
                runner,
                new XcodeCodeCoverageParser(),
                new XcodeCoverageMapper(),
                new XcodeCoverageRecorder(context)
        );
    }

    @Test
    public void describe() {
        // prepare
        DefaultSensorDescriptor defaultSensorDescriptor = new DefaultSensorDescriptor();
        // test
        sensor.describe(defaultSensorDescriptor);
        // assert
        assertThat(defaultSensorDescriptor.name()).isEqualTo("Xcode Coverage");
        assertThat(defaultSensorDescriptor.languages()).hasSize(2).containsOnly(swift.getKey(), objectiveC.getKey());
        assertThat(defaultSensorDescriptor.type()).isEqualTo(InputFile.Type.MAIN);
    }

    @Test
    public void executeSuccess() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, null));
                add(new Coverage(2, 0));
                add(new Coverage(3, 1));
                add(new Coverage(4, Integer.MAX_VALUE));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", coverages));
            }
        };
        // assert
        assertContainer(new Container(
                "success",
                files
        ));
    }

    @Test
    public void executeFailure() throws IOException {
        // assert
        assertContainer(new Container(
                "failure",
                List.of()
        ));
    }

    private void assertContainer(Container container) throws IOException {
        // Mock files for test purpose
        container.files.forEach(file -> {
            DefaultInputFile inputFile = new TestInputFileBuilder("", file.name)
                    .setLines(Integer.MAX_VALUE)
                    .build();
            // Mock sensor
            context.fileSystem().add(inputFile);
        });

        // Mock
        File jsonFile = new File(baseDir, container.jsonFileName + ".json");
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        when(runner.run(any())).thenReturn(jsonFileContent);

        // Running our code
        sensor.execute(context);

        container.files.forEach(file -> {
            final String fileName = ":" + file.name;
            // Asserting
            file.coverages.forEach(coverage -> {
                assertThat(context.lineHits(fileName, coverage.lineNumber)).isEqualTo(coverage.numberOfHits);
            });
        });
    }

}