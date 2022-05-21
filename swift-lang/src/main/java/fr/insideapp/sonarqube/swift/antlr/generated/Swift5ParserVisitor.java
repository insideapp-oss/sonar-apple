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
// Generated from Swift5Parser.g4 by ANTLR 4.10
package fr.insideapp.sonarqube.swift.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Swift5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Swift5ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(Swift5Parser.Top_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Swift5Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Swift5Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(Swift5Parser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(Swift5Parser.For_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Swift5Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_list(Swift5Parser.Condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Swift5Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#case_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_condition(Swift5Parser.Case_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_binding_condition(Swift5Parser.Optional_binding_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_while_statement(Swift5Parser.Repeat_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(Swift5Parser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Swift5Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(Swift5Parser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#guard_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_statement(Swift5Parser.Guard_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(Swift5Parser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(Swift5Parser.Switch_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(Swift5Parser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(Swift5Parser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(Swift5Parser.Case_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(Swift5Parser.Default_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(Swift5Parser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#where_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_expression(Swift5Parser.Where_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#conditional_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_switch_case(Swift5Parser.Conditional_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_if_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_if_directive_clause(Swift5Parser.Switch_if_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_elseif_directive_clauses(Swift5Parser.Switch_elseif_directive_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_elseif_directive_clause(Swift5Parser.Switch_elseif_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#switch_else_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_else_directive_clause(Swift5Parser.Switch_else_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(Swift5Parser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(Swift5Parser.Statement_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(Swift5Parser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(Swift5Parser.Control_transfer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(Swift5Parser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(Swift5Parser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(Swift5Parser.Fallthrough_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(Swift5Parser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(Swift5Parser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#defer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefer_statement(Swift5Parser.Defer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(Swift5Parser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#catch_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(Swift5Parser.Catch_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#catch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clause(Swift5Parser.Catch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#catch_pattern_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_pattern_list(Swift5Parser.Catch_pattern_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#catch_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_pattern(Swift5Parser.Catch_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_control_statement(Swift5Parser.Compiler_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_compilation_block(Swift5Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_directive_clause(Swift5Parser.If_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_directive_clauses(Swift5Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_directive_clause(Swift5Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_directive_clause(Swift5Parser.Else_directive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compilation_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition(Swift5Parser.Compilation_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#platform_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_condition(Swift5Parser.Platform_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#swift_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwift_version(Swift5Parser.Swift_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#swift_version_continuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwift_version_continuation(Swift5Parser.Swift_version_continuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operating_system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperating_system(Swift5Parser.Operating_systemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#architecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture(Swift5Parser.ArchitectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(Swift5Parser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#environment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironment(Swift5Parser.EnvironmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#line_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_control_statement(Swift5Parser.Line_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#line_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_number(Swift5Parser.Line_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(Swift5Parser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#diagnostic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnostic_statement(Swift5Parser.Diagnostic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#diagnostic_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnostic_message(Swift5Parser.Diagnostic_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#availability_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_condition(Swift5Parser.Availability_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#availability_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_arguments(Swift5Parser.Availability_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#availability_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability_argument(Swift5Parser.Availability_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#platform_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_name(Swift5Parser.Platform_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#platform_version}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlatform_version(Swift5Parser.Platform_versionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(Swift5Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(Swift5Parser.Generic_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(Swift5Parser.Generic_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_where_clause(Swift5Parser.Generic_where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(Swift5Parser.Requirement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(Swift5Parser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(Swift5Parser.Conformance_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(Swift5Parser.Same_type_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(Swift5Parser.Generic_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(Swift5Parser.Generic_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(Swift5Parser.Generic_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Swift5Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(Swift5Parser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_declaration(Swift5Parser.Top_level_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Swift5Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(Swift5Parser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(Swift5Parser.Import_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(Swift5Parser.Import_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(Swift5Parser.Import_path_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(Swift5Parser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(Swift5Parser.Pattern_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(Swift5Parser.Pattern_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(Swift5Parser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(Swift5Parser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(Swift5Parser.Variable_declaration_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(Swift5Parser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(Swift5Parser.Getter_setter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(Swift5Parser.Getter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(Swift5Parser.Setter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(Swift5Parser.Setter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(Swift5Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(Swift5Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(Swift5Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(Swift5Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(Swift5Parser.WillSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(Swift5Parser.DidSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(Swift5Parser.Typealias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(Swift5Parser.Typealias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(Swift5Parser.Typealias_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(Swift5Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(Swift5Parser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(Swift5Parser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(Swift5Parser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(Swift5Parser.Function_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Swift5Parser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(Swift5Parser.Parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(Swift5Parser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(Swift5Parser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_parameter_name(Swift5Parser.External_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(Swift5Parser.Local_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(Swift5Parser.Default_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(Swift5Parser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(Swift5Parser.Union_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(Swift5Parser.Union_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(Swift5Parser.Union_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(Swift5Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(Swift5Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(Swift5Parser.Union_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(Swift5Parser.Enum_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(Swift5Parser.Enum_case_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(Swift5Parser.Raw_value_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(Swift5Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(Swift5Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(Swift5Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(Swift5Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(Swift5Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(Swift5Parser.Raw_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_literal(Swift5Parser.Raw_value_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(Swift5Parser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(Swift5Parser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(Swift5Parser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#struct_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_members(Swift5Parser.Struct_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#struct_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member(Swift5Parser.Struct_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(Swift5Parser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(Swift5Parser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(Swift5Parser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#class_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_members(Swift5Parser.Class_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_member(Swift5Parser.Class_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(Swift5Parser.Protocol_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(Swift5Parser.Protocol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(Swift5Parser.Protocol_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_members(Swift5Parser.Protocol_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member(Swift5Parser.Protocol_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(Swift5Parser.Protocol_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(Swift5Parser.Protocol_property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(Swift5Parser.Protocol_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(Swift5Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(Swift5Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(Swift5Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(Swift5Parser.Initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(Swift5Parser.Initializer_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(Swift5Parser.Initializer_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(Swift5Parser.Deinitializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(Swift5Parser.Extension_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(Swift5Parser.Extension_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#extension_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_members(Swift5Parser.Extension_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#extension_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_member(Swift5Parser.Extension_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(Swift5Parser.Subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(Swift5Parser.Subscript_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(Swift5Parser.Subscript_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(Swift5Parser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(Swift5Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(Swift5Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(Swift5Parser.Infix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_group(Swift5Parser.Infix_operator_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_declaration(Swift5Parser.Precedence_group_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_attributes(Swift5Parser.Precedence_group_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_attribute(Swift5Parser.Precedence_group_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_relation(Swift5Parser.Precedence_group_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_assignment(Swift5Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_associativity(Swift5Parser.Precedence_group_associativityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_names(Swift5Parser.Precedence_group_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_group_name(Swift5Parser.Precedence_group_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifier(Swift5Parser.Declaration_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_modifiers(Swift5Parser.Declaration_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_level_modifier(Swift5Parser.Access_level_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutation_modifier(Swift5Parser.Mutation_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(Swift5Parser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(Swift5Parser.Wildcard_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(Swift5Parser.Identifier_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(Swift5Parser.Value_binding_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(Swift5Parser.Tuple_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(Swift5Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(Swift5Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(Swift5Parser.Enum_case_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#optional_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_pattern(Swift5Parser.Optional_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(Swift5Parser.Expression_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(Swift5Parser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(Swift5Parser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(Swift5Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(Swift5Parser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(Swift5Parser.Balanced_tokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(Swift5Parser.Balanced_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#balanced_token_punctuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token_punctuation(Swift5Parser.Balanced_token_punctuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Swift5Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(Swift5Parser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#prefix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expression(Swift5Parser.Prefix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(Swift5Parser.In_out_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#try_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_operator(Swift5Parser.Try_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(Swift5Parser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#binary_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expressions(Swift5Parser.Binary_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(Swift5Parser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(Swift5Parser.Type_casting_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(Swift5Parser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#unqualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualified_name(Swift5Parser.Unqualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(Swift5Parser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(Swift5Parser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(Swift5Parser.Array_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(Swift5Parser.Array_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(Swift5Parser.Dictionary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(Swift5Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(Swift5Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#playground_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayground_literal(Swift5Parser.Playground_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_pure_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_pure_expression(Swift5Parser.Self_pure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_method_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_method_expression(Swift5Parser.Self_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_subscript_expression(Swift5Parser.Self_subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code self_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_initializer_expression(Swift5Parser.Self_initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superclass_method_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(Swift5Parser.Superclass_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superclass_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(Swift5Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superclass_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(Swift5Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(Swift5Parser.Closure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(Swift5Parser.Closure_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_clause(Swift5Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter_list(Swift5Parser.Closure_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#closure_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_parameter(Swift5Parser.Closure_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(Swift5Parser.Capture_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#capture_list_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_items(Swift5Parser.Capture_list_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#capture_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list_item(Swift5Parser.Capture_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(Swift5Parser.Capture_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(Swift5Parser.Implicit_member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#parenthesized_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_operator(Swift5Parser.Parenthesized_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(Swift5Parser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_expression(Swift5Parser.Tuple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_element_list(Swift5Parser.Tuple_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_element(Swift5Parser.Tuple_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(Swift5Parser.Wildcard_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_expression(Swift5Parser.Key_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_components}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_components(Swift5Parser.Key_path_componentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_component(Swift5Parser.Key_path_componentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_postfixes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_postfixes(Swift5Parser.Key_path_postfixesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_postfix(Swift5Parser.Key_path_postfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(Swift5Parser.Selector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#key_path_string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_path_string_expression(Swift5Parser.Key_path_string_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(Swift5Parser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_call_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_suffix(Swift5Parser.Function_call_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#initializer_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_suffix(Swift5Parser.Initializer_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#explicit_member_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_member_suffix(Swift5Parser.Explicit_member_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#postfix_self_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_self_suffix(Swift5Parser.Postfix_self_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#subscript_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_suffix(Swift5Parser.Subscript_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#forced_value_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForced_value_suffix(Swift5Parser.Forced_value_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#optional_chaining_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional_chaining_suffix(Swift5Parser.Optional_chaining_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument_clause(Swift5Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument_list(Swift5Parser.Function_call_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_call_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_argument(Swift5Parser.Function_call_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#trailing_closures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closures(Swift5Parser.Trailing_closuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#labeled_trailing_closures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_trailing_closures(Swift5Parser.Labeled_trailing_closuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#labeled_trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_trailing_closure(Swift5Parser.Labeled_trailing_closureContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#argument_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_names(Swift5Parser.Argument_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#argument_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(Swift5Parser.Argument_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Swift5Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(Swift5Parser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(Swift5Parser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(Swift5Parser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(Swift5Parser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(Swift5Parser.Tuple_type_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(Swift5Parser.Tuple_type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(Swift5Parser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type(Swift5Parser.Function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument_clause(Swift5Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument_list(Swift5Parser.Function_type_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#function_type_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_type_argument(Swift5Parser.Function_type_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#argument_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_label(Swift5Parser.Argument_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(Swift5Parser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dictionary_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_type(Swift5Parser.Dictionary_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(Swift5Parser.Protocol_composition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#trailing_composition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_composition_and(Swift5Parser.Trailing_composition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#opaque_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaque_type(Swift5Parser.Opaque_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#any_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_type(Swift5Parser.Any_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#self_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_type(Swift5Parser.Self_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(Swift5Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(Swift5Parser.Type_inheritance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Swift5Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(Swift5Parser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(Swift5Parser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(Swift5Parser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate_prefix_operator(Swift5Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_AND(Swift5Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_OR(Swift5Parser.Compilation_condition_ORContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_GE(Swift5Parser.Compilation_condition_GEContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#compilation_condition_L}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_condition_L(Swift5Parser.Compilation_condition_LContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#arrow_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_operator(Swift5Parser.Arrow_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#range_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_operator(Swift5Parser.Range_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#same_type_equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_equals(Swift5Parser.Same_type_equalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(Swift5Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(Swift5Parser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(Swift5Parser.Postfix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(Swift5Parser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_head(Swift5Parser.Operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_character(Swift5Parser.Operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#operator_characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_characters(Swift5Parser.Operator_charactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_head(Swift5Parser.Dot_operator_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_character(Swift5Parser.Dot_operator_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#dot_operator_characters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_operator_characters(Swift5Parser.Dot_operator_charactersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Swift5Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(Swift5Parser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(Swift5Parser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#nil_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_literal(Swift5Parser.Nil_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(Swift5Parser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(Swift5Parser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#extended_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtended_string_literal(Swift5Parser.Extended_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#static_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_string_literal(Swift5Parser.Static_string_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Swift5Parser#interpolated_string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_string_literal(Swift5Parser.Interpolated_string_literalContext ctx);
}