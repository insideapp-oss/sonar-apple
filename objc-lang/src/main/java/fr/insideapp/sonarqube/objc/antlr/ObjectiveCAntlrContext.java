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

import fr.insideapp.sonarqube.apple.commons.SourceLine;
import fr.insideapp.sonarqube.apple.commons.SourceLinesProvider;
import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.objc.antlr.generated.ObjectiveCLexer;
import fr.insideapp.sonarqube.objc.antlr.generated.ObjectiveCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ObjectiveCAntlrContext extends AntlrContext {

    @Override
    public void loadFromStreams(InputFile inputFile, InputStream file, InputStream linesStream, Charset charset) throws IOException {
        final SourceLinesProvider linesProvider = new SourceLinesProvider();
        final CharStream charStream = CharStreams.fromStream(file, charset);
        final ObjectiveCLexer lexer = new ObjectiveCLexer(charStream);
        lexer.removeErrorListeners();
        final CommonTokenStream stream = new CommonTokenStream(lexer);
        stream.fill();
        final ObjectiveCParser parser = new ObjectiveCParser(stream);
        parser.removeErrorListeners();
        final ParseTree root =  parser.topLevelDeclaration();
        final SourceLine[] lines = linesProvider.getLines(linesStream, charset);

        this.setFile(inputFile);
        this.setStream(stream);
        this.setLines(lines);
        this.setRoot(root);
    }
}
