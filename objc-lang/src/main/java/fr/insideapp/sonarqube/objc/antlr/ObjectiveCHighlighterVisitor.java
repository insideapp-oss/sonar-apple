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

import fr.insideapp.sonarqube.apple.commons.antlr.AntlrContext;
import fr.insideapp.sonarqube.apple.commons.antlr.HighlighterVisitor;
import fr.insideapp.sonarqube.apple.commons.antlr.ParseTreeItemVisitor;
import fr.insideapp.sonarqube.objc.antlr.generated.ObjectiveCParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.scanner.ScannerSide;

import java.util.Set;

@ScannerSide
public class ObjectiveCHighlighterVisitor implements ParseTreeItemVisitor {

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

    private final HighlighterVisitor highlighterVisitor;

    public ObjectiveCHighlighterVisitor() {
        highlighterVisitor = new HighlighterVisitor.Builder()
                .commentTypes(ObjectiveCHighlighterVisitor.ObjectiveCCommentTypes)
                .stringTypes(ObjectiveCHighlighterVisitor.ObjectiveCStringTypes)
                .preprocessTypes(ObjectiveCHighlighterVisitor.ObjectiveCPreProcessTypes)
                .keywordLightTypes(ObjectiveCHighlighterVisitor.ObjectiveCKeywordLightTypes)
                .keywordTypes(ObjectiveCHighlighterVisitor.ObjectiveCKeywordTypes)
                .whitespaceType(ObjectiveCParser.WS)
                .build();
    }

    @Override
    public void apply(ParseTree tree) {
        highlighterVisitor.apply(tree);
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        highlighterVisitor.fillContext(context, antlrContext);
    }
}
