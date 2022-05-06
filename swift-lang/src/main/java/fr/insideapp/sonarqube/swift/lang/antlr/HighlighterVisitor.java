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
import fr.insideapp.sonarqube.swift.lang.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
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
import java.util.stream.Collectors;

import static java.lang.String.format;

public class HighlighterVisitor implements ParseTreeItemVisitor {

    private static final Logger LOGGER = Loggers.get(HighlighterVisitor.class);

    private static final Set<Integer> Swift5CommentTypes = Set.of(
            Swift5Parser.Block_comment,
            Swift5Parser.Line_comment
    );
    private static final Set<Integer> Swift5StringTypes = Set.of(
            Swift5Parser.Single_line_extended_string_open,
            Swift5Parser.Multi_line_extended_string_open,
            Swift5Parser.Multi_line_string_open,
            Swift5Parser.Single_line_string_open,
            Swift5Parser.Interpolataion_single_line,
            Swift5Parser.Single_line_string_close,
            Swift5Parser.Quoted_single_line_text,
            Swift5Parser.Interpolataion_multi_line,
            Swift5Parser.Multi_line_string_close,
            Swift5Parser.Quoted_multi_line_text,
            Swift5Parser.Single_line_extended_string_close,
            Swift5Parser.Quoted_single_line_extended_text,
            Swift5Parser.Multi_line_extended_string_close,
            Swift5Parser.Quoted_multi_line_extended_text
    );
    private static final Set<Integer> Swift5KeywordTypes = Set.of(
            Swift5Parser.AS, Swift5Parser.ALPHA, Swift5Parser.BREAK, Swift5Parser.CASE, Swift5Parser.CATCH,
            Swift5Parser.CLASS, Swift5Parser.CONTINUE, Swift5Parser.DEFAULT, Swift5Parser.DEFER, Swift5Parser.DO,
            Swift5Parser.GUARD, Swift5Parser.ELSE, Swift5Parser.ENUM, Swift5Parser.FOR, Swift5Parser.FALLTHROUGH,
            Swift5Parser.FUNC, Swift5Parser.IN, Swift5Parser.IF, Swift5Parser.IMPORT, Swift5Parser.INTERNAL,
            Swift5Parser.FINAL, Swift5Parser.OPEN, Swift5Parser.PRIVATE, Swift5Parser.PUBLIC, Swift5Parser.WHERE,
            Swift5Parser.WHILE, Swift5Parser.LET, Swift5Parser.VAR, Swift5Parser.PROTOCOL, Swift5Parser.GET,
            Swift5Parser.SET, Swift5Parser.WILL_SET, Swift5Parser.DID_SET, Swift5Parser.REPEAT, Swift5Parser.SWITCH,
            Swift5Parser.STRUCT, Swift5Parser.RETURN, Swift5Parser.THROW, Swift5Parser.THROWS, Swift5Parser.RETHROWS,
            Swift5Parser.INDIRECT, Swift5Parser.INIT, Swift5Parser.DEINIT, Swift5Parser.ASSOCIATED_TYPE,
            Swift5Parser.EXTENSION, Swift5Parser.SUBSCRIPT, Swift5Parser.PREFIX, Swift5Parser.INFIX, Swift5Parser.LEFT,
            Swift5Parser.RIGHT, Swift5Parser.NONE, Swift5Parser.PRECEDENCE_GROUP, Swift5Parser.HIGHER_THAN,
            Swift5Parser.LOWER_THAN, Swift5Parser.ASSIGNMENT, Swift5Parser.ASSOCIATIVITY, Swift5Parser.POSTFIX,
            Swift5Parser.OPERATOR, Swift5Parser.TYPEALIAS, Swift5Parser.OS, Swift5Parser.ARCH, Swift5Parser.SWIFT,
            Swift5Parser.COMPILER, Swift5Parser.CAN_IMPORT, Swift5Parser.TARGET_ENVIRONMENT, Swift5Parser.CONVENIENCE,
            Swift5Parser.DYNAMIC, Swift5Parser.LAZY, Swift5Parser.OPTIONAL, Swift5Parser.OVERRIDE, Swift5Parser.REQUIRED,
            Swift5Parser.STATIC, Swift5Parser.WEAK, Swift5Parser.UNOWNED, Swift5Parser.SAFE, Swift5Parser.UNSAFE,
            Swift5Parser.MUTATING, Swift5Parser.NONMUTATING, Swift5Parser.FILE_PRIVATE, Swift5Parser.IS,
            Swift5Parser.TRY, Swift5Parser.SUPER, Swift5Parser.ANY, Swift5Parser.FALSE, Swift5Parser.RED,
            Swift5Parser.BLUE, Swift5Parser.GREEN, Swift5Parser.RESOURCE_NAME, Swift5Parser.TRUE, Swift5Parser.NIL,
            Swift5Parser.INOUT, Swift5Parser.SOME, Swift5Parser.TYPE, Swift5Parser.PRECEDENCE, Swift5Parser.SELF,
            Swift5Parser.SELF_BIG, Swift5Parser.MAC_OS, Swift5Parser.I_OS, Swift5Parser.OSX, Swift5Parser.WATCH_OS,
            Swift5Parser.TV_OS, Swift5Parser.LINUX, Swift5Parser.WINDOWS, Swift5Parser.I386, Swift5Parser.X86_64,
            Swift5Parser.ARM, Swift5Parser.ARM64, Swift5Parser.SIMULATOR, Swift5Parser.MAC_CATALYST,
            Swift5Parser.I_OS_APPLICATION_EXTENSION, Swift5Parser.MAC_CATALYST_APPLICATION_EXTENSION,
            Swift5Parser.MAC_OS_APPLICATION_EXTENSION, Swift5Parser.SOURCE_LOCATION, Swift5Parser.FILE,
            Swift5Parser.LINE, Swift5Parser.ERROR, Swift5Parser.WARNING, Swift5Parser.AVAILABLE, Swift5Parser.HASH_IF,
            Swift5Parser.HASH_ELSEIF, Swift5Parser.HASH_ELSE, Swift5Parser.HASH_ENDIF, Swift5Parser.HASH_FILE,
            Swift5Parser.HASH_FILE_ID, Swift5Parser.HASH_FILE_PATH, Swift5Parser.HASH_LINE, Swift5Parser.HASH_COLUMN,
            Swift5Parser.HASH_FUNCTION, Swift5Parser.HASH_DSO_HANDLE, Swift5Parser.HASH_SELECTOR,
            Swift5Parser.HASH_KEYPATH, Swift5Parser.HASH_COLOR_LITERAL, Swift5Parser.HASH_FILE_LITERAL,
            Swift5Parser.HASH_IMAGE_LITERAL, Swift5Parser.GETTER, Swift5Parser.SETTER, Swift5Parser.Identifier,
            Swift5Parser.DOT, Swift5Parser.LCURLY, Swift5Parser.LPAREN, Swift5Parser.LBRACK, Swift5Parser.RCURLY,
            Swift5Parser.RPAREN, Swift5Parser.RBRACK, Swift5Parser.COMMA, Swift5Parser.COLON, Swift5Parser.SEMI,
            Swift5Parser.LT, Swift5Parser.GT, Swift5Parser.UNDERSCORE, Swift5Parser.BANG, Swift5Parser.QUESTION,
            Swift5Parser.AT, Swift5Parser.AND, Swift5Parser.SUB, Swift5Parser.EQUAL, Swift5Parser.OR, Swift5Parser.DIV,
            Swift5Parser.ADD, Swift5Parser.MUL, Swift5Parser.MOD, Swift5Parser.CARET, Swift5Parser.TILDE,
            Swift5Parser.HASH, Swift5Parser.BACKTICK, Swift5Parser.DOLLAR, Swift5Parser.BACKSLASH,
            Swift5Parser.Operator_head_other, Swift5Parser.Operator_following_character, Swift5Parser.Binary_literal,
            Swift5Parser.Octal_literal, Swift5Parser.Decimal_digits, Swift5Parser.Decimal_literal,
            Swift5Parser.Hexadecimal_literal, Swift5Parser.Floating_point_literal, Swift5Parser.WS,
            Swift5Parser.HASHBANG
    );

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
                addHighlighting(newHighlighting, token, file, range, antlrContext.getVocabulary());
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

    private void addHighlighting(NewHighlighting newHighlighting, Token token, InputFile file, TextRange range, Vocabulary vocabulary) {
        // Tokens on a single char are ignored
        if (range.start().lineOffset() == range.end().lineOffset()) {
            return;
        }

        try {
            // Comment
            if (HighlighterVisitor.Swift5CommentTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.COMMENT);
                return;
            }

            // String
            if (HighlighterVisitor.Swift5StringTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.STRING);
                return;
            }

            // Keyword
            Set<String> keywords = Swift5KeywordTypes.stream()
                    .map(type -> vocabulary.getLiteralName(type))
                    .collect(Collectors.toSet());
            keywords.remove(null);
            if (keywords.contains("'" + token.getText() + "'")) {
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