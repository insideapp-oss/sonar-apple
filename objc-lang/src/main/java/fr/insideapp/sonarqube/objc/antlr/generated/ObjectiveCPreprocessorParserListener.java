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
package fr.insideapp.sonarqube.objc.antlr.generated;
// Generated from ObjectiveCPreprocessorParser.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjectiveCPreprocessorParser}.
 */
public interface ObjectiveCPreprocessorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code preprocessorImport}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorImport}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorConditional}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorConditional(ObjectiveCPreprocessorParser.PreprocessorConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorConditional}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorConditional(ObjectiveCPreprocessorParser.PreprocessorConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorDef}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorDef(ObjectiveCPreprocessorParser.PreprocessorDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorDef}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorDef(ObjectiveCPreprocessorParser.PreprocessorDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorPragma}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorPragma(ObjectiveCPreprocessorParser.PreprocessorPragmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorPragma}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorPragma(ObjectiveCPreprocessorParser.PreprocessorPragmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorError}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorError(ObjectiveCPreprocessorParser.PreprocessorErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorError}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorError(ObjectiveCPreprocessorParser.PreprocessorErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorWarning}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorWarning(ObjectiveCPreprocessorParser.PreprocessorWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorWarning}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorWarning(ObjectiveCPreprocessorParser.PreprocessorWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorDefine}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorDefine(ObjectiveCPreprocessorParser.PreprocessorDefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorDefine}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorDefine(ObjectiveCPreprocessorParser.PreprocessorDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjectiveCPreprocessorParser#directiveText}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveText(ObjectiveCPreprocessorParser.DirectiveTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjectiveCPreprocessorParser#directiveText}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveText(ObjectiveCPreprocessorParser.DirectiveTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorParenthesis}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorParenthesis(ObjectiveCPreprocessorParser.PreprocessorParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorParenthesis}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorParenthesis(ObjectiveCPreprocessorParser.PreprocessorParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorNot}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorNot(ObjectiveCPreprocessorParser.PreprocessorNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorNot}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorNot(ObjectiveCPreprocessorParser.PreprocessorNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorBinary}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorBinary(ObjectiveCPreprocessorParser.PreprocessorBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorBinary}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorBinary(ObjectiveCPreprocessorParser.PreprocessorBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorConstant}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorConstant(ObjectiveCPreprocessorParser.PreprocessorConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorConstant}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorConstant(ObjectiveCPreprocessorParser.PreprocessorConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorConditionalSymbol}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorConditionalSymbol(ObjectiveCPreprocessorParser.PreprocessorConditionalSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorConditionalSymbol}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorConditionalSymbol(ObjectiveCPreprocessorParser.PreprocessorConditionalSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preprocessorDefined}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorDefined(ObjectiveCPreprocessorParser.PreprocessorDefinedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preprocessorDefined}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessorExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorDefined(ObjectiveCPreprocessorParser.PreprocessorDefinedContext ctx);
}