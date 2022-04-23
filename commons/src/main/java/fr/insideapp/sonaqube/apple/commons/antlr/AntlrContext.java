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
package fr.insideapp.sonaqube.apple.commons.antlr;

import fr.insideapp.sonaqube.apple.commons.SourceLine;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public abstract class AntlrContext {

    private InputFile file;
    private CommonTokenStream stream;
    private ParseTree root;
    private SourceLine[] lines;

    public abstract void loadFromStreams(InputFile inputFile, InputStream file, InputStream linesStream,
                                         Charset charset) throws IOException;

    public SourceLine[] getLines() {
        return lines;
    }

    public Token[] getTokens() {
        return this.stream.getTokens().toArray(new Token[0]);
    }

    public int[] getLineAndColumn(final int global) {

        for (final SourceLine line : this.lines) {
            if (line.getEnd() > global) {
                return new int[]{line.getLine(), global - line.getStart()};
            }
        }
        return null;
    }

    public InputFile getFile() {
        return file;
    }

    protected void setFile(InputFile file) {
        this.file = file;
    }

    public CommonTokenStream getStream() {
        return stream;
    }

    public ParseTree getRoot() {
        return root;
    }

    protected void setStream(CommonTokenStream stream) {
        this.stream = stream;
    }

    protected void setRoot(ParseTree root) {
        this.root = root;
    }

    protected void setLines(SourceLine[] lines) {
        this.lines = lines;
    }
}
