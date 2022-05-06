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
package fr.insideapp.sonarqube.objc.lang.antlr;

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.objc.lang.antlr.generated.ObjectiveCParser;
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

    private static final Set<Integer> ObjectiveCCommentTypes = Set.of(
            ObjectiveCParser.MULTI_COMMENT,
            ObjectiveCParser.SINGLE_COMMENT,
            ObjectiveCParser.DIRECTIVE_MULTI_COMMENT,
            ObjectiveCParser.DIRECTIVE_SINGLE_COMMENT
    );

    private static final Set<Integer> ObjectiveCStringTypes = Set.of(
            ObjectiveCParser.STRING_VALUE
    );

    private static final Set<Integer> ObjectiveCPreProcessTypes = Set.of(
            ObjectiveCParser.DIRECTIVE_IMPORT, ObjectiveCParser.DIRECTIVE_INCLUDE, ObjectiveCParser.DIRECTIVE_PRAGMA,
            ObjectiveCParser.DIRECTIVE_DEFINE, ObjectiveCParser.DIRECTIVE_DEFINED, ObjectiveCParser.DIRECTIVE_IF,
            ObjectiveCParser.DIRECTIVE_ELIF, ObjectiveCParser.DIRECTIVE_ELSE, ObjectiveCParser.DIRECTIVE_UNDEF,
            ObjectiveCParser.DIRECTIVE_IFDEF, ObjectiveCParser.DIRECTIVE_IFNDEF, ObjectiveCParser.DIRECTIVE_ENDIF,
            ObjectiveCParser.DIRECTIVE_TRUE, ObjectiveCParser.DIRECTIVE_FALSE, ObjectiveCParser.DIRECTIVE_ERROR,
            ObjectiveCParser.DIRECTIVE_WARNING, ObjectiveCParser.DIRECTIVE_BANG, ObjectiveCParser.DIRECTIVE_LP,
            ObjectiveCParser.DIRECTIVE_RP, ObjectiveCParser.DIRECTIVE_EQUAL, ObjectiveCParser.DIRECTIVE_NOTEQUAL,
            ObjectiveCParser.DIRECTIVE_AND, ObjectiveCParser.DIRECTIVE_OR, ObjectiveCParser.DIRECTIVE_LT,
            ObjectiveCParser.DIRECTIVE_GT, ObjectiveCParser.DIRECTIVE_LE, ObjectiveCParser.DIRECTIVE_GE,
            ObjectiveCParser.DIRECTIVE_STRING, ObjectiveCParser.DIRECTIVE_ID,
            ObjectiveCParser.DIRECTIVE_DECIMAL_LITERAL, ObjectiveCParser.DIRECTIVE_FLOAT,
            ObjectiveCParser.DIRECTIVE_NEWLINE, ObjectiveCParser.DIRECTIVE_MULTI_COMMENT,
            ObjectiveCParser.DIRECTIVE_SINGLE_COMMENT, ObjectiveCParser.DIRECTIVE_BACKSLASH_NEWLINE,
            ObjectiveCParser.DIRECTIVE_TEXT_NEWLINE, ObjectiveCParser.DIRECTIVE_TEXT
    );

    private static final Set<Integer> ObjectiveCKeywordLightTypes = Set.of(
            ObjectiveCParser.IDENTIFIER
    );

    private static final Set<Integer> ObjectiveCKeywordTypes = Set.of(
            ObjectiveCParser.AUTO, ObjectiveCParser.BREAK, ObjectiveCParser.CASE, ObjectiveCParser.CHAR,
            ObjectiveCParser.CONST, ObjectiveCParser.CONTINUE, ObjectiveCParser.DEFAULT, ObjectiveCParser.DO,
            ObjectiveCParser.DOUBLE, ObjectiveCParser.ELSE, ObjectiveCParser.ENUM, ObjectiveCParser.EXTERN,
            ObjectiveCParser.FLOAT, ObjectiveCParser.FOR, ObjectiveCParser.GOTO, ObjectiveCParser.IF,
            ObjectiveCParser.INLINE, ObjectiveCParser.INT, ObjectiveCParser.LONG, ObjectiveCParser.REGISTER,
            ObjectiveCParser.RESTRICT, ObjectiveCParser.RETURN, ObjectiveCParser.SHORT, ObjectiveCParser.SIGNED,
            ObjectiveCParser.SIZEOF, ObjectiveCParser.STATIC, ObjectiveCParser.STRUCT, ObjectiveCParser.SWITCH,
            ObjectiveCParser.TYPEDEF, ObjectiveCParser.UNION, ObjectiveCParser.UNSIGNED, ObjectiveCParser.VOID,
            ObjectiveCParser.VOLATILE, ObjectiveCParser.WHILE, ObjectiveCParser.BOOL_, ObjectiveCParser.COMPLEX,
            ObjectiveCParser.IMAGINERY, ObjectiveCParser.TRUE, ObjectiveCParser.FALSE, ObjectiveCParser.BOOL,
            ObjectiveCParser.Class, ObjectiveCParser.BYCOPY, ObjectiveCParser.BYREF, ObjectiveCParser.ID,
            ObjectiveCParser.IMP, ObjectiveCParser.IN, ObjectiveCParser.INOUT, ObjectiveCParser.NIL,
            ObjectiveCParser.NO, ObjectiveCParser.NULL_, ObjectiveCParser.ONEWAY, ObjectiveCParser.OUT,
            ObjectiveCParser.PROTOCOL_, ObjectiveCParser.SEL, ObjectiveCParser.SELF, ObjectiveCParser.SUPER,
            ObjectiveCParser.YES, ObjectiveCParser.AUTORELEASEPOOL, ObjectiveCParser.CATCH, ObjectiveCParser.CLASS,
            ObjectiveCParser.DYNAMIC, ObjectiveCParser.ENCODE, ObjectiveCParser.END, ObjectiveCParser.FINALLY,
            ObjectiveCParser.IMPLEMENTATION, ObjectiveCParser.INTERFACE, ObjectiveCParser.IMPORT,
            ObjectiveCParser.PACKAGE, ObjectiveCParser.PROTOCOL, ObjectiveCParser.OPTIONAL, ObjectiveCParser.PRIVATE,
            ObjectiveCParser.PROPERTY, ObjectiveCParser.PROTECTED, ObjectiveCParser.PUBLIC, ObjectiveCParser.REQUIRED,
            ObjectiveCParser.SELECTOR, ObjectiveCParser.SYNCHRONIZED, ObjectiveCParser.SYNTHESIZE,
            ObjectiveCParser.THROW, ObjectiveCParser.TRY, ObjectiveCParser.ATOMIC, ObjectiveCParser.NONATOMIC,
            ObjectiveCParser.RETAIN, ObjectiveCParser.ATTRIBUTE, ObjectiveCParser.AUTORELEASING_QUALIFIER,
            ObjectiveCParser.BLOCK, ObjectiveCParser.BRIDGE, ObjectiveCParser.BRIDGE_RETAINED,
            ObjectiveCParser.BRIDGE_TRANSFER, ObjectiveCParser.COVARIANT, ObjectiveCParser.CONTRAVARIANT,
            ObjectiveCParser.DEPRECATED, ObjectiveCParser.KINDOF, ObjectiveCParser.STRONG_QUALIFIER,
            ObjectiveCParser.TYPEOF, ObjectiveCParser.UNSAFE_UNRETAINED_QUALIFIER, ObjectiveCParser.UNUSED,
            ObjectiveCParser.WEAK_QUALIFIER, ObjectiveCParser.NULL_UNSPECIFIED, ObjectiveCParser.NULLABLE,
            ObjectiveCParser.NONNULL, ObjectiveCParser.NULL_RESETTABLE, ObjectiveCParser.NS_INLINE,
            ObjectiveCParser.NS_ENUM, ObjectiveCParser.NS_OPTIONS, ObjectiveCParser.ASSIGN, ObjectiveCParser.COPY,
            ObjectiveCParser.GETTER, ObjectiveCParser.SETTER, ObjectiveCParser.STRONG, ObjectiveCParser.READONLY,
            ObjectiveCParser.READWRITE, ObjectiveCParser.WEAK, ObjectiveCParser.UNSAFE_UNRETAINED,
            ObjectiveCParser.IB_OUTLET, ObjectiveCParser.IB_OUTLET_COLLECTION, ObjectiveCParser.IB_INSPECTABLE,
            ObjectiveCParser.IB_DESIGNABLE, ObjectiveCParser.EXTERN_SUFFIX, ObjectiveCParser.IOS_SUFFIX,
            ObjectiveCParser.MAC_SUFFIX, ObjectiveCParser.TVOS_PROHIBITED,
            ObjectiveCParser.LP, ObjectiveCParser.RP, ObjectiveCParser.LBRACE, ObjectiveCParser.RBRACE,
            ObjectiveCParser.LBRACK, ObjectiveCParser.RBRACK, ObjectiveCParser.SEMI, ObjectiveCParser.COMMA,
            ObjectiveCParser.DOT, ObjectiveCParser.STRUCTACCESS, ObjectiveCParser.AT, ObjectiveCParser.ASSIGNMENT,
            ObjectiveCParser.GT, ObjectiveCParser.LT, ObjectiveCParser.BANG, ObjectiveCParser.TILDE,
            ObjectiveCParser.QUESTION, ObjectiveCParser.COLON, ObjectiveCParser.EQUAL, ObjectiveCParser.LE,
            ObjectiveCParser.GE, ObjectiveCParser.NOTEQUAL, ObjectiveCParser.AND, ObjectiveCParser.OR,
            ObjectiveCParser.INC, ObjectiveCParser.DEC, ObjectiveCParser.ADD, ObjectiveCParser.SUB,
            ObjectiveCParser.MUL, ObjectiveCParser.DIV, ObjectiveCParser.BITAND, ObjectiveCParser.BITOR,
            ObjectiveCParser.BITXOR, ObjectiveCParser.MOD, ObjectiveCParser.ADD_ASSIGN, ObjectiveCParser.SUB_ASSIGN,
            ObjectiveCParser.MUL_ASSIGN, ObjectiveCParser.DIV_ASSIGN, ObjectiveCParser.AND_ASSIGN,
            ObjectiveCParser.OR_ASSIGN, ObjectiveCParser.XOR_ASSIGN, ObjectiveCParser.MOD_ASSIGN,
            ObjectiveCParser.LSHIFT_ASSIGN, ObjectiveCParser.RSHIFT_ASSIGN, ObjectiveCParser.ELIPSIS,
            ObjectiveCParser.CHARACTER_LITERAL, ObjectiveCParser.STRING_START, ObjectiveCParser.HEX_LITERAL,
            ObjectiveCParser.OCTAL_LITERAL, ObjectiveCParser.BINARY_LITERAL, ObjectiveCParser.DECIMAL_LITERAL,
            ObjectiveCParser.FLOATING_POINT_LITERAL, ObjectiveCParser.WS
    );

    @Override
    public void apply(ParseTree tree) { // no default implementation
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
                    || token.getType() == ObjectiveCParser.WS
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
            if (HighlighterVisitor.ObjectiveCCommentTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.COMMENT);
                return;
            }

            // String
            if (HighlighterVisitor.ObjectiveCStringTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.STRING);
                return;
            }

            // Preprocessor
            if (HighlighterVisitor.ObjectiveCPreProcessTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.PREPROCESS_DIRECTIVE);
                return;
            }

            // Constant
            if (HighlighterVisitor.ObjectiveCKeywordLightTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.KEYWORD_LIGHT);
                return;
            }

            // Keyword
            if (HighlighterVisitor.ObjectiveCKeywordTypes.contains(token.getType())) {
                newHighlighting.highlight(range, TypeOfText.KEYWORD);
            }
        } catch (Exception e) {
            LOGGER.warn(format("Unexpected error adding highlighting on file %s", file.key()), e);
        }
    }
}
