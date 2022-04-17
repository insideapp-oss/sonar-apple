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

import fr.insideapp.sonarqube.swift.lang.SourceLine;
import fr.insideapp.sonarqube.swift.lang.SourceLinesProvider;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Lexer;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class AntlrContext {

    private final InputFile file;
    private final CommonTokenStream stream;
    private final ParseTree root;
    private final SourceLine[] lines;

    public AntlrContext(InputFile file, CommonTokenStream stream, ParseTree root, SourceLine[] lines) {
        this.file = file;
        this.stream = stream;
        this.root = root;
        this.lines = lines;
    }

    public static AntlrContext fromInputFile(InputFile file, Charset charset) throws IOException {
        return fromStreams(file, file.inputStream(), file.inputStream(), charset);
    }

    public static AntlrContext fromStreams(InputFile inputFile, InputStream file, InputStream linesStream,
                                           Charset charset) throws IOException {
        final SourceLinesProvider linesProvider = new SourceLinesProvider();
        final CharStream charStream = CharStreams.fromStream(file, charset);
        final Swift5Lexer lexer = new Swift5Lexer(charStream);
        lexer.removeErrorListeners();
        final CommonTokenStream stream = new CommonTokenStream(lexer);
        stream.fill();
        final Swift5Parser parser = new Swift5Parser(stream);
        parser.removeErrorListeners();
        final Swift5Parser.Top_levelContext root =  parser.top_level();
        final SourceLine[] lines = linesProvider.getLines(linesStream, charset);
        return new AntlrContext(inputFile, stream, root, lines);
    }

    public SourceLine[] getLines() {
        return lines;
    }

    public Token[] getTokens() {
        return this.stream.getTokens().toArray(new Token[0]);
    }

    public int[] getLineAndColumn(final int global) {

        for (final SourceLine line : this.lines) {
            if (line.getEnd() > global) {
                return new int[] { line.getLine(), global - line.getStart() };
            }
        }
        return null;
    }

    public InputFile getFile() {
        return file;
    }

    public CommonTokenStream getStream() {
        return stream;
    }

    public ParseTree getRoot() {
        return root;
    }
}
