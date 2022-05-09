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
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HighlighterVisitorTest {
    private static final Set<Integer> commentTypes = Set.of(1,2,3);
    private static final Set<Integer> stringTypes = Set.of(4,5);
    private static final Set<Integer> preprocessTypes = Set.of(6,7);
    private static final Set<Integer> keywordLightTypes = Set.of(8);
    private static final Set<Integer> keywordTypes = Set.of(8,9,10,11);
    private static final int whitespaceType = 100;

    @Test
    public void fillContext() {
        SensorContextTester sensorContext = SensorContextTester.create(new File(""));
        DefaultInputFile testFile = new TestInputFileBuilder("foo", "test.extension")
                .setLines(5)
                .setOriginalLineEndOffsets(new int[5])
                .setOriginalLineStartOffsets(new int[5])
                .setModuleBaseDir(Paths.get("/"))
                .setContents("a\nb\nc\nd\ne")
                .build();
        sensorContext.fileSystem().add(testFile);

        SourceLine[] lines = {
                new SourceLine(0,1,0,1),
                new SourceLine(1,1,0,1),
                new SourceLine(2,1,0,1),
                new SourceLine(3,1,0,1),
                new SourceLine(4,1,0,1)
        };

        Token commentToken = mock(Token.class);
        when(commentToken.getText()).thenReturn("a");
        when(commentToken.getType()).thenReturn(2);
        when(commentToken.getLine()).thenReturn(1);
        when(commentToken.getCharPositionInLine()).thenReturn(0);
        when(commentToken.getStopIndex()).thenReturn(1);

        Token stringToken = mock(Token.class);
        when(stringToken.getText()).thenReturn("b");
        when(stringToken.getType()).thenReturn(4);
        when(stringToken.getLine()).thenReturn(2);
        when(stringToken.getCharPositionInLine()).thenReturn(0);
        when(stringToken.getStopIndex()).thenReturn(2);

        Token preprocessToken = mock(Token.class);
        when(preprocessToken.getText()).thenReturn("c");
        when(preprocessToken.getType()).thenReturn(6);
        when(preprocessToken.getLine()).thenReturn(3);
        when(preprocessToken.getCharPositionInLine()).thenReturn(0);
        when(preprocessToken.getStopIndex()).thenReturn(3);

        Token keywordLightToken = mock(Token.class);
        when(keywordLightToken.getText()).thenReturn("d");
        when(keywordLightToken.getType()).thenReturn(8);
        when(keywordLightToken.getLine()).thenReturn(4);
        when(keywordLightToken.getCharPositionInLine()).thenReturn(0);
        when(keywordLightToken.getStopIndex()).thenReturn(4);

        Token keywordToken = mock(Token.class);
        when(keywordToken.getText()).thenReturn("e");
        when(keywordToken.getType()).thenReturn(10);
        when(keywordToken.getLine()).thenReturn(5);
        when(keywordToken.getCharPositionInLine()).thenReturn(0);
        when(keywordToken.getStopIndex()).thenReturn(5);

        Token[] tokens = {commentToken, stringToken, preprocessToken, keywordLightToken, keywordToken};

        AntlrContext antlrContext = mock(AntlrContext.class);
        when(antlrContext.getLines()).thenReturn(lines);
        when(antlrContext.getTokens()).thenReturn(tokens);
        when(antlrContext.getFile()).thenReturn(testFile);
        when(antlrContext.getLineAndColumn(1)).thenReturn(new int[]{1, 0});
        when(antlrContext.getLineAndColumn(2)).thenReturn(new int[]{2, 0});
        when(antlrContext.getLineAndColumn(3)).thenReturn(new int[]{3, 0});
        when(antlrContext.getLineAndColumn(4)).thenReturn(new int[]{4, 0});
        when(antlrContext.getLineAndColumn(5)).thenReturn(new int[]{5, 0});

        HighlighterVisitor visitor = new HighlighterVisitor.Builder()
                .commentTypes(commentTypes)
                .stringTypes(stringTypes)
                .preprocessTypes(preprocessTypes)
                .keywordLightTypes(keywordLightTypes)
                .keywordTypes(keywordTypes)
                .whitespaceType(whitespaceType)
                .build();
        visitor.fillContext(sensorContext, antlrContext);

        // Asserting
        assertThat(sensorContext.highlightingTypeAt(testFile.key(), 1, 0))
                .containsExactlyInAnyOrder(TypeOfText.COMMENT);
        assertThat(sensorContext.highlightingTypeAt(testFile.key(), 2, 0))
                .containsExactlyInAnyOrder(TypeOfText.STRING);
        assertThat(sensorContext.highlightingTypeAt(testFile.key(), 3, 0))
                .containsExactlyInAnyOrder(TypeOfText.PREPROCESS_DIRECTIVE);
        assertThat(sensorContext.highlightingTypeAt(testFile.key(), 4, 0))
                .containsExactlyInAnyOrder(TypeOfText.KEYWORD_LIGHT);
        assertThat(sensorContext.highlightingTypeAt(testFile.key(), 5, 0))
                .containsExactlyInAnyOrder(TypeOfText.KEYWORD);
    }
}
