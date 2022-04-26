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
package fr.insideapp.sonarqube.swift.lang.antlr;

import fr.insideapp.sonarqube.swift.lang.Swift;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class SourceLinesVisitorTest {

    private static class Container {
        final String fileName;
        final int linesOfCode;
        final int linesOfComment;

        public Container(String fileName, int linesOfCode, int linesOfComment) {
            this.fileName = fileName;
            this.linesOfCode = linesOfCode;
            this.linesOfComment = linesOfComment;
        }
    }

    private static final String BASE_DIR = "src/test/resources/swift/source_lines_visitor";
    private SensorContextTester sensorContext;
    private SwiftAntlrContext antlrContext;
    private SourceLinesVisitor visitor;

    @Before
    public void prepare() {
        sensorContext = SensorContextTester.create(new File(BASE_DIR));
        antlrContext = new SwiftAntlrContext();
        visitor = new SourceLinesVisitor();
    }

    @Test
    public void testNoComment() throws IOException {
        assertContainer(new Container("NoComment", 1, 0));
    }

    @Test
    public void testNoCode() throws IOException {
        assertContainer(new Container("NoCode", 0, 1));
    }

    @Test
    public void testEmpty() throws IOException {
        assertContainer(new Container("Empty", 0, 0));
    }

    @Test
    public void testLineWithMixedCodeComment() throws IOException {
        assertContainer(new Container("LineWithMixedCodeComment", 3, 0));
    }

    @Test
    public void testQuotedMultilineText() throws IOException {
        assertContainer(new Container("QuotedMultilineText", 12, 0));
    }

    @Test
    public void testWhiteLineIgnored() throws IOException {
        assertContainer(new Container("WhiteLineIgnored", 3, 1));
    }

    private void assertContainer(Container container) throws IOException {

        final String completeFileName = container.fileName + "." + Swift.KEY;

        // real file
        File file = new File(BASE_DIR, completeFileName);

        // mock file for test purpose
        // setting it up with the real file properties
        InputFile inputFile = new TestInputFileBuilder("", completeFileName)
                .setLanguage(Swift.KEY)
                .setModuleBaseDir(Paths.get(BASE_DIR))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();

        // mock sensor
        sensorContext.fileSystem().add(inputFile);
        antlrContext.loadFromFile(inputFile, inputFile.charset());

        // running our code
        visitor.fillContext(sensorContext, antlrContext);

        // asserting
        Measure<Integer> measureNLOC = sensorContext.measure(inputFile.key(), CoreMetrics.NCLOC.key());
        assertThat(measureNLOC.value()).isEqualTo(container.linesOfCode);
        Measure<Integer> measureNCOMMENTS = sensorContext.measure(inputFile.key(), CoreMetrics.COMMENT_LINES.key());
        assertThat(measureNCOMMENTS.value()).isEqualTo(container.linesOfComment);
    }

}