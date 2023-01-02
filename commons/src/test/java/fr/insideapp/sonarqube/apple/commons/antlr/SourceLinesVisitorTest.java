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
package fr.insideapp.sonarqube.apple.commons.antlr;

import fr.insideapp.sonarqube.apple.commons.SourceLine;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.internal.SensorContextTester;
import org.sonar.api.batch.sensor.measure.Measure;
import org.sonar.api.measures.CoreMetrics;

import java.io.File;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SourceLinesVisitorTest {

    @Test
    public void fillContext() {

        SensorContextTester sensorContext = SensorContextTester.create(new File(""));
        DefaultInputFile testFile = new TestInputFileBuilder("", "test.ext")
                .setLines(7)
                .setOriginalLineEndOffsets(new int[7])
                .setOriginalLineStartOffsets(new int[7])
                .setModuleBaseDir(Paths.get("/"))
                .build();
        sensorContext.fileSystem().add(testFile);

        SourceLine[] lines = {
                new SourceLine(0,1,0,10),
                new SourceLine(1,2,0,20),
                new SourceLine(2,3,0,30),
                new SourceLine(3,4,0,40),
                new SourceLine(4,5,0,50),
                new SourceLine(5,6,0,60),
                new SourceLine(6,7,0,70),
        };

        // Line 1
        Token commentToken = mock(Token.class);
        when(commentToken.getType()).thenReturn(1);
        when(commentToken.getLine()).thenReturn(1);

        // Line 2
        Token codeToken = mock(Token.class);
        when(codeToken.getType()).thenReturn(2);
        when(codeToken.getLine()).thenReturn(2);
        Token classToken = mock(Token.class);
        when(classToken.getType()).thenReturn(3);
        when(classToken.getLine()).thenReturn(2); // same line as code
        Token functionToken = mock(Token.class);
        when(functionToken.getType()).thenReturn(4);
        when(functionToken.getLine()).thenReturn(2); // same line as code

        // Line 3
        Token multilineCommentToken = mock(Token.class);
        when(multilineCommentToken.getType()).thenReturn(5);
        when(multilineCommentToken.getLine()).thenReturn(3);
        when(multilineCommentToken.getStopIndex()).thenReturn(41);

        // Line 5
        Token multilineCodeToken = mock(Token.class);
        when(multilineCodeToken.getType()).thenReturn(6);
        when(multilineCodeToken.getLine()).thenReturn(5);
        when(multilineCodeToken.getStopIndex()).thenReturn(61);

        Token[] tokens = {commentToken, multilineCommentToken, multilineCodeToken, codeToken, classToken, functionToken};

        AntlrContext antlrContext = mock(AntlrContext.class);
        when(antlrContext.getLines()).thenReturn(lines);
        when(antlrContext.getTokens()).thenReturn(tokens);
        when(antlrContext.getFile()).thenReturn(testFile);

        SourceLinesVisitor sourceLinesVisitor = new SourceLinesVisitor.Builder()
                .singleLineCommentToken(1)
                .multiLineCommentToken(5)
                .quotedMultiLineTextToken(6)
                .classToken(3)
                .functionToken(4)
                .build();
        sourceLinesVisitor.fillContext(sensorContext, antlrContext);

        // Asserting
        Measure<Integer> measureNLOC = sensorContext.measure(testFile.key(), CoreMetrics.NCLOC.key());
        assertThat(measureNLOC.value()).isEqualTo(3);
        Measure<Integer> measureNCOMMENTS = sensorContext.measure(testFile.key(), CoreMetrics.COMMENT_LINES.key());
        assertThat(measureNCOMMENTS.value()).isEqualTo(3);
        Measure<Integer> measureNCLASSES = sensorContext.measure(testFile.key(), CoreMetrics.CLASSES.key());
        assertThat(measureNCLASSES.value()).isEqualTo(1);
        Measure<Integer> measureNFUNCTION = sensorContext.measure(testFile.key(), CoreMetrics.FUNCTIONS.key());
        assertThat(measureNFUNCTION.value()).isEqualTo(1);
    }
}
