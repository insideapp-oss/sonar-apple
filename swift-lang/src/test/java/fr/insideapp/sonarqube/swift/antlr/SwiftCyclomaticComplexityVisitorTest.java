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
package fr.insideapp.sonarqube.swift.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.CustomTreeVisitor;
import fr.insideapp.sonarqube.swift.Swift;
import fr.insideapp.sonarqube.swift.SwiftExtensionProvider;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.config.Configuration;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SwiftCyclomaticComplexityVisitorTest {

    private static class Container {
        final String fileName;
        final int complexity;

        public Container(String fileName, int complexity) {
            this.fileName = fileName;
            this.complexity = complexity;
        }
    }

    private static final String BASE_DIR = "src/test/resources/swift/cyclomatic_complexity";
    private SensorContextTester sensorContext;
    private Configuration configuration;

    private Swift swift;
    private SwiftAntlrContext antlrContext;
    private SwiftCyclomaticComplexityVisitor visitor;
    private CustomTreeVisitor customTreeVisitor;

    @Before
    public void prepare() {
        configuration = mock(Configuration.class);
        swift = new Swift(configuration);
        sensorContext = SensorContextTester.create(new File(BASE_DIR));
        antlrContext = new SwiftAntlrContext();
        visitor = new SwiftCyclomaticComplexityVisitor();
        customTreeVisitor = new CustomTreeVisitor(visitor);
    }

    @Test
    public void testCase1() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase1.swift", 4));
    }

    @Test
    public void testCase2() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase2.swift", 10));
    }

    @Test
    public void testCase3() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase3.swift", 13));
    }

    @Test
    public void testCase4() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase4.swift", 11));
    }

    @Test
    public void testCase5() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase5.swift", 8));
    }

    @Test
    public void testCase6() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase6.swift", 3));
    }

    @Test
    public void testCase7() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase7.swift", 2));
    }

    @Test
    public void testCase8() throws IOException {
        assertContainer(new SwiftCyclomaticComplexityVisitorTest.Container("ComplexityCase8.swift", 2));
    }

    private void assertContainer(SwiftCyclomaticComplexityVisitorTest.Container container) throws IOException {
        // Real file
        File file = new File(BASE_DIR, container.fileName);

        // Mock file for test purpose
        // Setting it up with the real file properties
        InputFile inputFile = new TestInputFileBuilder("", container.fileName)
                .setLanguage(swift.getKey())
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();

        // Mock sensor
        sensorContext.fileSystem().add(inputFile);
        antlrContext.loadFromFile(inputFile, inputFile.charset());

        // Running our code
        customTreeVisitor.fillContext(sensorContext, antlrContext);

        // Asserting
        Measure<Integer> measureComplexity = sensorContext.measure(inputFile.key(), CoreMetrics.COMPLEXITY.key());
        assertThat(measureComplexity.value()).isEqualTo(container.complexity);
    }
}
