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

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.swift.lang.KeywordsProvider;
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
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

import static java.lang.String.format;

public class HighlighterVisitor implements ParseTreeItemVisitor {

    private static final Logger LOGGER = Loggers.get(HighlighterVisitor.class);
    private final KeywordsProvider keywordsProvider = new KeywordsProvider();

    @Override
    public void apply(ParseTree tree) {

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
                    || token.getType() == Swift5Parser.EOF
                    || token.getType() == Swift5Parser.WS
                    || token.getStartIndex() >= token.getStopIndex()
            ) {
                continue;
            }

            final int endLine = endDetails[0];
            final int endLineOffset = endDetails[1] + (token.getText().contains("\n") ? 0 : 1);

            try {
                final TextRange range = file.newRange(startLine, startLineOffset, endLine, endLineOffset);
                addHighlighting(newHighlighting, token, file, range);
                addCpdToken(cpdTokens, file, token, range);
            } catch (final Throwable e) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug(format(
                                    "Unexpected error creating text range on file %s for token %s on (%s, %s) -  (%s, %s)",
                                    file.absolutePath(), token.getText(), startLine, startLineOffset, endLine, endLineOffset),
                            e);
                }
            }
        }
        synchronized (HighlighterVisitor.class) {
            try {
                newHighlighting.save();
            } catch (final Throwable e) {
                LOGGER.warn(format("Unexpected error saving highlightings on file %s", file.absolutePath()), e);
            }

            try {
                cpdTokens.save();
            } catch (final Throwable e) {
                LOGGER.warn(format("Unexpected error saving cpd tokens on file %s", file.absolutePath()), e);
            }
        }
    }

    private void addCpdToken(NewCpdTokens cpdTokens, InputFile file, Token token, TextRange range) {
        try {
            cpdTokens.addToken(range, token.getText());
        } catch (Throwable e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(format("Unexpected error adding cpd tokens on file %s", file.absolutePath()), e);
            }
        }
    }

    private void addHighlighting(NewHighlighting newHighlighting, Token token, InputFile file, TextRange range) {
        // Tokens on a single char are ignored
        if (range.start().lineOffset() == range.end().lineOffset()) {
            return;
        }

        try {
            // Comment
            if (token.getType() == Swift5Parser.Block_comment || token.getType() == Swift5Parser.Line_comment) {
                newHighlighting.highlight(range, TypeOfText.COMMENT);
                return;
            }

            // String
            if (token.getType() == Swift5Parser.Single_line_extended_string_open
                    || token.getType() == Swift5Parser.Multi_line_extended_string_open
                    || token.getType() == Swift5Parser.Multi_line_string_open
                    || token.getType() == Swift5Parser.Single_line_string_open
                    || token.getType() == Swift5Parser.Interpolataion_single_line
                    || token.getType() == Swift5Parser.Single_line_string_close
                    || token.getType() == Swift5Parser.Quoted_single_line_text
                    || token.getType() == Swift5Parser.Interpolataion_multi_line
                    || token.getType() == Swift5Parser.Multi_line_string_close
                    || token.getType() == Swift5Parser.Quoted_multi_line_text
                    || token.getType() == Swift5Parser.Single_line_extended_string_close
                    || token.getType() == Swift5Parser.Quoted_single_line_extended_text
                    || token.getType() == Swift5Parser.Multi_line_extended_string_close
                    || token.getType() == Swift5Parser.Quoted_multi_line_extended_text)
            {
                newHighlighting.highlight(range, TypeOfText.STRING);
                return;
            }

            // Keyword
            if (this.keywordsProvider.isKeyword(token.getText())) {
                newHighlighting.highlight(range, TypeOfText.KEYWORD);
                return;
            }

        } catch (final Throwable e) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(format("Unexpected error adding highlighting on file %s", file.absolutePath()), e);
            }
        }
    }
}