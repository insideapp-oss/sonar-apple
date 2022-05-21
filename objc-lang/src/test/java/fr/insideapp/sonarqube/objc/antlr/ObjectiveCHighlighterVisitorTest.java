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
package fr.insideapp.sonarqube.objc.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.CustomTreeVisitor;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.internal.TestInputFileBuilder;
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.batch.sensor.internal.SensorContextTester;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ObjectiveCHighlighterVisitorTest {

    private static final String TEST_ROOT = "src/test/resources/objc";
    private static final String TEST_FILENAME = "main.m";

    @Test
    public void fillContext() throws IOException {
        SensorContextTester context = SensorContextTester.create(new File(TEST_ROOT));

        File file = new File(TEST_ROOT, TEST_FILENAME);

        InputFile testFile = new TestInputFileBuilder("foo", TEST_FILENAME)
                .setLanguage("objc")
                .setModuleBaseDir(Paths.get(TEST_ROOT))
                .setContents(FileUtils.readFileToString(file, Charset.defaultCharset()))
                .setCharset(Charset.defaultCharset())
                .build();
        context.fileSystem().add(testFile);
        ObjectiveCAntlrContext antlrContext = new ObjectiveCAntlrContext();
        antlrContext.loadFromStreams(
                testFile,
                testFile.inputStream(),
                testFile.inputStream(),
                testFile.charset()
        );

        ObjectiveCHighlighterVisitor highlighterVisitor = new ObjectiveCHighlighterVisitor();
        CustomTreeVisitor customTreeVisitor = new CustomTreeVisitor(highlighterVisitor);
        customTreeVisitor.fillContext(context, antlrContext);
        assertThat(context.highlightingTypeAt(testFile.key(), 1, 0)).containsExactlyInAnyOrder(TypeOfText.COMMENT);
        assertThat(context.highlightingTypeAt(testFile.key(), 5, 0)).containsExactlyInAnyOrder(TypeOfText.COMMENT);
        assertThat(context.highlightingTypeAt(testFile.key(), 7, 6)).containsExactlyInAnyOrder(TypeOfText.PREPROCESS_DIRECTIVE);
        assertThat(context.highlightingTypeAt(testFile.key(), 8, 13)).containsExactlyInAnyOrder(TypeOfText.PREPROCESS_DIRECTIVE);
        assertThat(context.highlightingTypeAt(testFile.key(), 9, 0)).isEmpty();
        assertThat(context.highlightingTypeAt(testFile.key(), 10, 1)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
        assertThat(context.highlightingTypeAt(testFile.key(), 10, 7)).containsExactlyInAnyOrder(TypeOfText.KEYWORD_LIGHT);
        assertThat(context.highlightingTypeAt(testFile.key(), 10, 22)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
        assertThat(context.highlightingTypeAt(testFile.key(), 12, 11)).containsExactlyInAnyOrder(TypeOfText.KEYWORD);
    }
}
