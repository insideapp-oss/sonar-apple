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

import fr.insideapp.sonarqube.apple.xcode.coverage.mapper.XcodeCoverageMapper;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverage;
import fr.insideapp.sonarqube.apple.xcode.coverage.models.XcodeCodeCoverageMetadata;
import fr.insideapp.sonarqube.apple.xcode.coverage.parser.XcodeCodeCoverageParser;
import fr.insideapp.sonarqube.apple.xcode.coverage.recorder.XcodeCoverageRecorder;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public final class XcodeCoverageRecorderTest {

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
        final Boolean shouldRegister;
        final List<Coverage> coverages;

        public FileCoverage(
                String name,
                Boolean shouldRegister,
                List<Coverage> coverages
        ) {
            this.name = name;
            this.shouldRegister = shouldRegister;
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

    private static final String BASE_DIR = "/xcode/coverage/recorder";

    private final File baseDir = FileUtils.toFile(getClass().getResource(BASE_DIR));

    private XcodeCoverageRecorder recorder;
    private SensorContextTester context;

    @Before
    public void prepare() {
        context = SensorContextTester.create(baseDir);
        recorder = new XcodeCoverageRecorder(context);
    }

    @Test
    public void testLineOneHit() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, 1));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", true, coverages));
            }
        };
        assertContainer(new Container(
                "lineOneHit",
                files
        ));
    }

    @Test
    public void testLineOneHitOverflow() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, Integer.MAX_VALUE));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", true, coverages));
            }
        };
        assertContainer(new Container(
                "lineOneHitOverflow",
                files
        ));
    }

    @Test
    public void testManyLineHit() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, 1));
                add(new Coverage(2, 2));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", true, coverages));
            }
        };
        assertContainer(new Container(
                "manyLineHit",
                files
        ));
    }

    @Test
    public void testFileNotFound() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, 1));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", false, coverages));
            }
        };
        assertContainer(new Container(
                "fileNotFound",
                files
        ));
    }

    @Test
    public void testLineNotExecutable() throws IOException {
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file.swift", true, List.of()));
            }
        };
        assertContainer(new Container(
                "lineNotExecutable",
                files
        ));
    }

    @Test
    public void testManyFiles() throws IOException {
        List<Coverage> coverages = new ArrayList<>() {
            {
                add(new Coverage(1, 1));
            }
        };
        List<FileCoverage> files = new ArrayList<>() {
            {
                add(new FileCoverage("file_1.swift", true, coverages));
                add(new FileCoverage("file_2.swift", true, coverages));
            }
        };
        assertContainer(new Container(
                "manyFiles",
                files
        ));
    }

    private void assertContainer(Container container) throws IOException {

        // Mock files for test purpose
        container.files.forEach(file -> {
            DefaultInputFile inputFile = new TestInputFileBuilder("", file.name)
                    .setLines(Integer.MAX_VALUE)
                    .build();
            // Mock sensor
            if (file.shouldRegister) {
                context.fileSystem().add(inputFile);
            }
        });

        // Data setup
        File jsonFile = new File(baseDir, container.jsonFileName + ".json");
        String jsonFileContent = FileUtils.readFileToString(jsonFile, Charset.defaultCharset());
        final Map<String, List<XcodeCodeCoverageMetadata>> parsed = new XcodeCodeCoverageParser().parse(jsonFileContent);
        final Set<XcodeCodeCoverage> mapped = new XcodeCoverageMapper().map(parsed);

        // Running our code
        recorder.record(new ArrayList<>(mapped));

        container.files.forEach(file -> {
            final String fileName = ":" + file.name;
            // Asserting
            file.coverages.forEach(coverage -> {
                Integer numberOfHits = file.shouldRegister ? coverage.numberOfHits : null;
                assertThat(context.lineHits(fileName, coverage.lineNumber)).isEqualTo(numberOfHits);
            });
        });

    }

}

