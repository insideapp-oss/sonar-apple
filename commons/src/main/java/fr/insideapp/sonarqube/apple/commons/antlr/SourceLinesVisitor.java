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
import org.antlr.v4.runtime.Recognizer;
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

    private final int whiteSpaceToken;
    private final int singleLineCommentToken;
    private final int multiLineCommentToken;
    private final int interpolationMultiLineToken;
    private final int quotedMultiLineTextToken;
    private final int quotedMultiLineExtendedTextToken;
    private final int classToken;
    private final int functionToken;

    public static class Builder
    {
        private int whiteSpaceToken = -1;
        private int singleLineCommentToken = -2;
        private int multiLineCommentToken = -3;
        private int interpolationMultiLineToken = -4;
        private int quotedMultiLineTextToken = -5;
        private int quotedMultiLineExtendedTextToken = -6;
        private int classToken = -7;
        private int functionToken = -8;

        public Builder whiteSpaceToken(int whitespaceToken) {
            this.whiteSpaceToken = whitespaceToken;
            return this;
        }

        public Builder singleLineCommentToken(int singleLineCommentToken) {
            this.singleLineCommentToken = singleLineCommentToken;
            return this;
        }

        public Builder multiLineCommentToken(int multiLineCommentToken) {
            this.multiLineCommentToken = multiLineCommentToken;
            return this;
        }

        public Builder interpolationMultiLineToken(int interpolationMultiLineToken) {
            this.interpolationMultiLineToken = interpolationMultiLineToken;
            return this;
        }

        public Builder quotedMultiLineTextToken(int quotedMultiLineTextToken) {
            this.quotedMultiLineTextToken = quotedMultiLineTextToken;
            return this;
        }

        public Builder quotedMultiLineExtendedTextToken(int quotedMultiLineExtendedTextToken) {
            this.quotedMultiLineExtendedTextToken = quotedMultiLineExtendedTextToken;
            return this;
        }

        public Builder classToken(int classToken) {
            this.classToken = classToken;
            return this;
        }

        public Builder functionToken(int functionToken) {
            this.functionToken = functionToken;
            return this;
        }

        public SourceLinesVisitor build() {
            return new SourceLinesVisitor(this);
        }
    }


    @Override
    public void apply(ParseTree tree) {
        // No implementation needed
    }

    private SourceLinesVisitor(Builder builder) {
        this.interpolationMultiLineToken = builder.interpolationMultiLineToken;
        this.multiLineCommentToken = builder.multiLineCommentToken;
        this.quotedMultiLineExtendedTextToken = builder.quotedMultiLineExtendedTextToken;
        this.quotedMultiLineTextToken = builder.quotedMultiLineTextToken;
        this.singleLineCommentToken = builder.singleLineCommentToken;
        this.whiteSpaceToken = builder.whiteSpaceToken;
        this.classToken = builder.classToken;
        this.functionToken = builder.functionToken;
    }


    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {

        final SourceLine[] allLines = antlrContext.getLines();
        // Set containing the lines number considered as a comment
        final Set<Integer> linesOfComment = new HashSet<>();
        // Set containing the lines number considered as code
        final Set<Integer> linesOfCode = new HashSet<>();
        int numberOfClasses = 0;
        int numberOfFunctions = 0;

        // Computing the metrics according to token type
        for (final Token token : antlrContext.getTokens()) {
            Integer currentLineNumber = token.getLine();

            int tokenType = token.getType();

            // Single line comment
            if (tokenType == singleLineCommentToken) {
                linesOfComment.add(currentLineNumber);
            // Multiline comments
            } else if (tokenType == multiLineCommentToken) {
                linesOfComment.addAll(handleMultilineComment(token, allLines, currentLineNumber));
            // Tokens that can be spread over several lines
            } else if (
                    tokenType == interpolationMultiLineToken ||
                    tokenType == quotedMultiLineExtendedTextToken ||
                    tokenType == quotedMultiLineTextToken) {
                linesOfCode.addAll(handleMultilineTokens(token, allLines, currentLineNumber));

            // Ignoring white-space and end-of-file
            } else if (tokenType != whiteSpaceToken && tokenType != Recognizer.EOF){
                linesOfCode.add(currentLineNumber);
            }

            if (tokenType == classToken) {
                numberOfClasses++;
            } else if (tokenType == functionToken) {
                numberOfFunctions++;
            }

        }

        // Only keeping the comments that are "pure" comments
        // Meaning not mixed with a LOC
        // We considered a LOC with a comment, as a LOC
        linesOfComment.removeAll(linesOfCode);

        final long linesOfCommentCount = linesOfComment.size();
        final long linesOfCodeCount = linesOfCode.size();


        recordMeasures(context, antlrContext, linesOfCodeCount, linesOfCommentCount, numberOfClasses, numberOfFunctions);
    }

    private Set<Integer> handleMultilineComment(Token token, SourceLine[] allLines, Integer currentLineNumber) {

        final Set<Integer> linesOfComment = new HashSet<>();

        final Integer endLineOfComment = findEndLine(allLines, token.getStopIndex());
        // Making sure we found it
        if (endLineOfComment != null) {
            // Adding each line to our set
            for (int line = currentLineNumber; line <= endLineOfComment; line++) {
                linesOfComment.add(line);
            }
        }

        return linesOfComment;
    }

    private Set<Integer> handleMultilineTokens(Token token, SourceLine[] allLines, Integer currentLineNumber) {

        final Set<Integer> linesOfCode = new HashSet<>();

        // Computing the end line of the token
        // Since the token might be spread on several lines
        final Integer endLineOfCode = findEndLine(allLines, token.getStopIndex());
        // Making sure we found it
        if (endLineOfCode != null) {
            // Adding each line to our set
            for (int line = currentLineNumber; line <= endLineOfCode; line++) {
                linesOfCode.add(line);
            }
        }

        return linesOfCode;
    }

    private void recordMeasures(SensorContext context, AntlrContext antlrContext , long linesOfCodeCount, long linesOfCommentCount, int numberOfClasses, int numberOfFunctions) {

        synchronized (SourceLinesVisitor.class) {

            final InputFile file = antlrContext.getFile();

            try {
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.NCLOC).withValue(Math.toIntExact(linesOfCodeCount)).save();
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.COMMENT_LINES).withValue(Math.toIntExact(linesOfCommentCount)).save();
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.CLASSES).withValue(numberOfClasses).save();
                context.<Integer>newMeasure().on(file).forMetric(CoreMetrics.FUNCTIONS).withValue(numberOfFunctions).save();
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
