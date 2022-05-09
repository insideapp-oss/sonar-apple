package fr.insideapp.sonarqube.apple.commons.antlr;

import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.cpd.NewCpdTokens;
import org.sonar.api.batch.sensor.highlighting.NewHighlighting;
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

import java.util.Set;

import static java.lang.String.format;

public class HighlighterVisitor implements ParseTreeItemVisitor {
    private static final Logger LOGGER = Loggers.get(HighlighterVisitor.class);

    private final Set<Integer> commentTypes;
    private final Set<Integer> stringTypes;
    private final Set<Integer> preprocessTypes;
    private final Set<Integer> keywordLightTypes;
    private final Set<Integer> keywordTypes;
    private final int whitespaceType;

    public static class Builder {
        private Set<Integer> commentTypes = Set.of();
        private Set<Integer> stringTypes = Set.of();
        private Set<Integer> preprocessTypes = Set.of();
        private Set<Integer> keywordLightTypes = Set.of();
        private Set<Integer> keywordTypes = Set.of();
        private int whitespaceType = -1;

        public Builder commentTypes(Set<Integer> commentTypes) {
            this.commentTypes = commentTypes;
            return this;
        }

        public Builder stringTypes(Set<Integer> stringTypes) {
            this.stringTypes = stringTypes;
            return this;
        }

        public Builder preprocessTypes(Set<Integer> preprocessTypes) {
            this.preprocessTypes = preprocessTypes;
            return this;
        }

        public Builder keywordLightTypes(Set<Integer> keywordLightTypes) {
            this.keywordLightTypes = keywordLightTypes;
            return this;
        }

        public Builder keywordTypes(Set<Integer> keywordTypes) {
            this.keywordTypes = keywordTypes;
            return this;
        }

        public Builder whitespaceType(int whitespaceType) {
            this.whitespaceType = whitespaceType;
            return this;
        }

        public HighlighterVisitor build() { return new HighlighterVisitor(this); }
    }

    private HighlighterVisitor(Builder builder) {
        this.commentTypes = builder.commentTypes;
        this.stringTypes = builder.stringTypes;
        this.preprocessTypes = builder.preprocessTypes;
        this.keywordLightTypes = builder.keywordLightTypes;
        this.keywordTypes = builder.keywordTypes;
        this.whitespaceType = builder.whitespaceType;
    }

    @Override
    public void apply(ParseTree tree) {
        // no implementation needed
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        final InputFile file = antlrContext.getFile();
        if (file == null) {
            return;
        }
        final NewCpdTokens cpdTokens = context.newCpdTokens().onFile(file);
        final NewHighlighting newHighlighting = context.newHighlighting().onFile(file);

        for (final Token token : antlrContext.getTokens()) {
            final int startLine = token.getLine();
            final int startLineOffset = token.getCharPositionInLine();
            final int[] endDetails = antlrContext.getLineAndColumn(token.getStopIndex());

            if (endDetails == null
                    || endDetails.length != 2
                    || token.getType() == Recognizer.EOF
                    || token.getType() == whitespaceType
                    || token.getStartIndex() >= token.getStopIndex()) {
                continue;
            }

            final int endLine = endDetails[0];
            final int endLineOffset = endDetails[1] + (token.getText().contains("\n") ? 0 : 1);

            try {
                final TextRange range = file.newRange(startLine, startLineOffset, endLine, endLineOffset);
                addHighlighting(newHighlighting, token, file, range);
                addCpdToken(cpdTokens, file, token, range);
            } catch (final Exception e) {
                LOGGER.warn(format(
                                "Unexpected error creating text range on file %s for token %s on (%s, %s) -  (%s, %s)",
                                file.key(), token.getText(), startLine, startLineOffset, endLine, endLineOffset),
                        e);
            }
        }
        synchronized (HighlighterVisitor.class) {
            try {
                newHighlighting.save();
            } catch (Exception e) {
                LOGGER.warn(format("Unexpected error saving highlightings on file %s", file.key()), e);
            }

            try {
                cpdTokens.save();
            } catch (Exception e) {
                LOGGER.warn(format("Unexpected error saving cpd tokens on file %s", file.key()), e);
            }
        }
    }

    private void addCpdToken(NewCpdTokens cpdTokens, InputFile file, Token token, TextRange range) {
        try {
            cpdTokens.addToken(range, token.getText());
        } catch (Exception e) {
            LOGGER.debug(format("Unexpected error adding cpd tokens on file %s", file.key()), e);
        }
    }

    private void addHighlighting(NewHighlighting newHighlighting, Token token, InputFile file, TextRange range) {
        // Tokens on a single char are ignored
        if (range.start().lineOffset() == range.end().lineOffset()) {
            return;
        }

        try {
            // Comment
            if (commentTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.COMMENT);
                return;
            }

            // String
            if (stringTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.STRING);
                return;
            }

            // Preprocessor
            if (preprocessTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.PREPROCESS_DIRECTIVE);
                return;
            }

            // Constant
            if (keywordLightTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.KEYWORD_LIGHT);
                return;
            }

            // Keyword
            if (keywordTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.KEYWORD);
            }
        } catch (Exception e) {
            LOGGER.warn(format("Unexpected error adding highlighting on file %s", file.key()), e);
        }
    }
}
