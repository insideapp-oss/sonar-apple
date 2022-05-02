package fr.insideapp.sonarqube.objc.lang.antlr;


import fr.insideapp.sonarqube.apple.commons.SourceLine;
import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.objc.lang.antlr.generated.ObjectiveCParser;
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
    @Override
    public void apply(ParseTree tree) {
        // no implementation needed
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {

        final SourceLine[] allLines = antlrContext.getLines();
        // Set containing the lines number considered as a comment
        final Set<Integer> linesOfComment = new HashSet<>();
        // Set containing the lines number considered as code
        final Set<Integer> linesOfCode = new HashSet<>();

        // Computing the lines according to token type
        for (final Token token : antlrContext.getTokens()) {
            Integer currentLineNumber = token.getLine();
            switch(token.getType()) {
                // Ignoring white-space and end-of-file
                case ObjectiveCParser.WS:
                case Recognizer.EOF:
                    break;
                // Single line comment
                case ObjectiveCParser.SINGLE_COMMENT:
                    linesOfComment.add(currentLineNumber);
                    break;
                case ObjectiveCParser.MULTI_COMMENT:
                    // Computing the end line of the token
                    // Since the comment might be spread over several lines
                    final Integer endLineOfComment = findEndLine(allLines, token.getStopIndex());
                    // Making sure we found it
                    if (endLineOfComment != null) {
                        // Adding each line to our set
                        for (int line = currentLineNumber; line <= endLineOfComment; line++) {
                            linesOfComment.add(line);
                        }
                    }
                    break;
                // Tokens that can be spread over several lines
                /*case Swift5Parser.Interpolataion_multi_line:
                case Swift5Parser.Quoted_multi_line_text:
                case Swift5Parser.Quoted_multi_line_extended_text:
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
                    break;*/
                // Any other token should be considered "code" token
                default:
                    linesOfCode.add(currentLineNumber);
                    break;
            }
        }

        // Only keeping the comments that are "pure" comments
        // Meaning not mixed with a LOC
        // We considered a LOC with a comment, as a LOC
        linesOfComment.removeAll(linesOfCode);

        final long linesOfCommentCount = linesOfComment.size();
        final long linesOfCodeCount = linesOfCode.size();

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