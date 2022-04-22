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
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.HashSet;
import java.util.Set;

public class SourceLinesVisitor implements ParseTreeItemVisitor {

    private static final Logger LOGGER = Loggers.get(SourceLinesVisitor.class);
    @Override
    public void apply(ParseTree tree) {}

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {

        final SourceLine[] allLines = antlrContext.getLines();
        // set containing the lines considered as comment
        final Set<Integer> linesOfComment = new HashSet<>();
        // all the tokens of the file
        final Token[] tokens = antlrContext.getTokens();

        // phase 1: computing the lines with comments
        for (final Token token : tokens) {
            int startLine = token.getLine();
            switch(token.getType()) {
                // only keeping the comments
                case Swift5Parser.Line_comment:
                case Swift5Parser.Block_comment:
                    // computing the end line of the token
                    // since the comment might be spread on several lines
                    final Integer endLine = findEndLine(allLines, token.getStopIndex());
                    // making sure we found it
                    if (endLine != null) {
                        // adding each line to our set
                        for (int line = startLine; line <= endLine; line++) {
                            linesOfComment.add(line);
                        }
                    }
                    break;
                // do nothing for the other token
                default:
                    break;
            }
        }

        // phase 2: overriding the lines containing comments if needed
        // some line might be a mix of comment and code
        // we consider them as code
        for (final Token token : tokens) {
            int startLine = token.getLine();
            // only overriding if this line has a comment
            if (linesOfComment.contains(startLine)) {
                switch(token.getType()) {
                    // ignoring comments, whitespace and end-of-file
                    case Swift5Parser.Line_comment:
                    case Swift5Parser.Block_comment:
                    case Swift5Parser.WS:
                    case Swift5Parser.EOF:
                        break;
                        // logic for any other token
                    default:
                        // computing the end line of the token
                        // since the token might be spread on several lines
                        final Integer endLine = findEndLine(allLines, token.getStopIndex());
                        // making sure we found it
                        if (endLine != null) {
                            // removing each line from our set
                            // since we consider it as LOC and not comment
                            for (int line = startLine; line <= endLine; line++) {
                                linesOfComment.remove(line);
                            }
                        }
                        break;
                }
            }

        }

        // phase 3 : compute
        final long allLinesCount = allLines.length;
        final long linesOfCommentCount = linesOfComment.size();
        // we consider that all lines without comment is a line of code
        final long linesOfCodeCount = allLinesCount - linesOfCommentCount;

        synchronized (SourceLinesVisitor.class) {

            final InputFile file = antlrContext.getFile();

            try {
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.NCLOC).withValue(Math.toIntExact(linesOfCodeCount)).save();
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.COMMENT_LINES).withValue(Math.toIntExact(linesOfCommentCount)).save();
            } catch (Exception e) {
                LOGGER.warn("Unexpected source lines measures", e);
            }

        }
    }

    private Integer findEndLine(final SourceLine[] lines, final int global) {
        for (final SourceLine line : lines) {
            if (line.getEnd() > global) {
                return line.getLine();
            }
        }
        return null;
    }
}
