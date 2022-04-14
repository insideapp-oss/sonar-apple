// Generated from Swift5Parser.g4 by ANTLR 4.10
package fr.insideapp.sonarqube.swift.lang.antlr.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Swift5Parser}.
 */
public interface Swift5ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(Swift5Parser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(Swift5Parser.Top_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Swift5Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Swift5Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Swift5Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Swift5Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(Swift5Parser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(Swift5Parser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(Swift5Parser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(Swift5Parser.For_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(Swift5Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(Swift5Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void enterCondition_list(Swift5Parser.Condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#condition_list}.
	 * @param ctx the parse tree
	 */
	void exitCondition_list(Swift5Parser.Condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Swift5Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Swift5Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void enterCase_condition(Swift5Parser.Case_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#case_condition}.
	 * @param ctx the parse tree
	 */
	void exitCase_condition(Swift5Parser.Case_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void enterOptional_binding_condition(Swift5Parser.Optional_binding_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#optional_binding_condition}.
	 * @param ctx the parse tree
	 */
	void exitOptional_binding_condition(Swift5Parser.Optional_binding_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_while_statement(Swift5Parser.Repeat_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#repeat_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_while_statement(Swift5Parser.Repeat_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBranch_statement(Swift5Parser.Branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBranch_statement(Swift5Parser.Branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Swift5Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Swift5Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(Swift5Parser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(Swift5Parser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void enterGuard_statement(Swift5Parser.Guard_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#guard_statement}.
	 * @param ctx the parse tree
	 */
	void exitGuard_statement(Swift5Parser.Guard_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(Swift5Parser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(Swift5Parser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_cases(Swift5Parser.Switch_casesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_cases}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_cases(Swift5Parser.Switch_casesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(Swift5Parser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(Swift5Parser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(Swift5Parser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(Swift5Parser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_item_list(Swift5Parser.Case_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#case_item_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_item_list(Swift5Parser.Case_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void enterDefault_label(Swift5Parser.Default_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#default_label}.
	 * @param ctx the parse tree
	 */
	void exitDefault_label(Swift5Parser.Default_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(Swift5Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(Swift5Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expression(Swift5Parser.Where_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#where_expression}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expression(Swift5Parser.Where_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#conditional_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterConditional_switch_case(Swift5Parser.Conditional_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#conditional_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitConditional_switch_case(Swift5Parser.Conditional_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_if_directive_clause(Swift5Parser.Switch_if_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_if_directive_clause(Swift5Parser.Switch_if_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_elseif_directive_clauses(Swift5Parser.Switch_elseif_directive_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_elseif_directive_clauses(Swift5Parser.Switch_elseif_directive_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_elseif_directive_clause(Swift5Parser.Switch_elseif_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_elseif_directive_clause(Swift5Parser.Switch_elseif_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#switch_else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_else_directive_clause(Swift5Parser.Switch_else_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#switch_else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_else_directive_clause(Swift5Parser.Switch_else_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(Swift5Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(Swift5Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void enterStatement_label(Swift5Parser.Statement_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#statement_label}.
	 * @param ctx the parse tree
	 */
	void exitStatement_label(Swift5Parser.Statement_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(Swift5Parser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(Swift5Parser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_transfer_statement(Swift5Parser.Control_transfer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#control_transfer_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_transfer_statement(Swift5Parser.Control_transfer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(Swift5Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(Swift5Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(Swift5Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(Swift5Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void enterFallthrough_statement(Swift5Parser.Fallthrough_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#fallthrough_statement}.
	 * @param ctx the parse tree
	 */
	void exitFallthrough_statement(Swift5Parser.Fallthrough_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(Swift5Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(Swift5Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(Swift5Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(Swift5Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefer_statement(Swift5Parser.Defer_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#defer_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefer_statement(Swift5Parser.Defer_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(Swift5Parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(Swift5Parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(Swift5Parser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(Swift5Parser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clause(Swift5Parser.Catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clause(Swift5Parser.Catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#catch_pattern_list}.
	 * @param ctx the parse tree
	 */
	void enterCatch_pattern_list(Swift5Parser.Catch_pattern_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#catch_pattern_list}.
	 * @param ctx the parse tree
	 */
	void exitCatch_pattern_list(Swift5Parser.Catch_pattern_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#catch_pattern}.
	 * @param ctx the parse tree
	 */
	void enterCatch_pattern(Swift5Parser.Catch_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#catch_pattern}.
	 * @param ctx the parse tree
	 */
	void exitCatch_pattern(Swift5Parser.Catch_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_control_statement(Swift5Parser.Compiler_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compiler_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_control_statement(Swift5Parser.Compiler_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 */
	void enterConditional_compilation_block(Swift5Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#conditional_compilation_block}.
	 * @param ctx the parse tree
	 */
	void exitConditional_compilation_block(Swift5Parser.Conditional_compilation_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterIf_directive_clause(Swift5Parser.If_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#if_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitIf_directive_clause(Swift5Parser.If_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void enterElseif_directive_clauses(Swift5Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#elseif_directive_clauses}.
	 * @param ctx the parse tree
	 */
	void exitElseif_directive_clauses(Swift5Parser.Elseif_directive_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterElseif_directive_clause(Swift5Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#elseif_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitElseif_directive_clause(Swift5Parser.Elseif_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_directive_clause(Swift5Parser.Else_directive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#else_directive_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_directive_clause(Swift5Parser.Else_directive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compilation_condition}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition(Swift5Parser.Compilation_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compilation_condition}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition(Swift5Parser.Compilation_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#platform_condition}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_condition(Swift5Parser.Platform_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#platform_condition}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_condition(Swift5Parser.Platform_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#swift_version}.
	 * @param ctx the parse tree
	 */
	void enterSwift_version(Swift5Parser.Swift_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#swift_version}.
	 * @param ctx the parse tree
	 */
	void exitSwift_version(Swift5Parser.Swift_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#swift_version_continuation}.
	 * @param ctx the parse tree
	 */
	void enterSwift_version_continuation(Swift5Parser.Swift_version_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#swift_version_continuation}.
	 * @param ctx the parse tree
	 */
	void exitSwift_version_continuation(Swift5Parser.Swift_version_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void enterOperating_system(Swift5Parser.Operating_systemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operating_system}.
	 * @param ctx the parse tree
	 */
	void exitOperating_system(Swift5Parser.Operating_systemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(Swift5Parser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(Swift5Parser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(Swift5Parser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(Swift5Parser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#environment}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment(Swift5Parser.EnvironmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#environment}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment(Swift5Parser.EnvironmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterLine_control_statement(Swift5Parser.Line_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#line_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitLine_control_statement(Swift5Parser.Line_control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void enterLine_number(Swift5Parser.Line_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#line_number}.
	 * @param ctx the parse tree
	 */
	void exitLine_number(Swift5Parser.Line_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(Swift5Parser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(Swift5Parser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#diagnostic_statement}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostic_statement(Swift5Parser.Diagnostic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#diagnostic_statement}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostic_statement(Swift5Parser.Diagnostic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#diagnostic_message}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostic_message(Swift5Parser.Diagnostic_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#diagnostic_message}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostic_message(Swift5Parser.Diagnostic_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_condition(Swift5Parser.Availability_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#availability_condition}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_condition(Swift5Parser.Availability_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_arguments(Swift5Parser.Availability_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#availability_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_arguments(Swift5Parser.Availability_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void enterAvailability_argument(Swift5Parser.Availability_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#availability_argument}.
	 * @param ctx the parse tree
	 */
	void exitAvailability_argument(Swift5Parser.Availability_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#platform_name}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_name(Swift5Parser.Platform_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#platform_name}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_name(Swift5Parser.Platform_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#platform_version}.
	 * @param ctx the parse tree
	 */
	void enterPlatform_version(Swift5Parser.Platform_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#platform_version}.
	 * @param ctx the parse tree
	 */
	void exitPlatform_version(Swift5Parser.Platform_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_clause(Swift5Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_clause(Swift5Parser.Generic_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter_list(Swift5Parser.Generic_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter_list(Swift5Parser.Generic_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(Swift5Parser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(Swift5Parser.Generic_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_where_clause(Swift5Parser.Generic_where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_where_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_where_clause(Swift5Parser.Generic_where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_list(Swift5Parser.Requirement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#requirement_list}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_list(Swift5Parser.Requirement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(Swift5Parser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(Swift5Parser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void enterConformance_requirement(Swift5Parser.Conformance_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#conformance_requirement}.
	 * @param ctx the parse tree
	 */
	void exitConformance_requirement(Swift5Parser.Conformance_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_requirement(Swift5Parser.Same_type_requirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#same_type_requirement}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_requirement(Swift5Parser.Same_type_requirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_clause(Swift5Parser.Generic_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_clause(Swift5Parser.Generic_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(Swift5Parser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(Swift5Parser.Generic_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument(Swift5Parser.Generic_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#generic_argument}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument(Swift5Parser.Generic_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Swift5Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Swift5Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(Swift5Parser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(Swift5Parser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_declaration(Swift5Parser.Top_level_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_declaration(Swift5Parser.Top_level_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(Swift5Parser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(Swift5Parser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(Swift5Parser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(Swift5Parser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void enterImport_kind(Swift5Parser.Import_kindContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#import_kind}.
	 * @param ctx the parse tree
	 */
	void exitImport_kind(Swift5Parser.Import_kindContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void enterImport_path(Swift5Parser.Import_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#import_path}.
	 * @param ctx the parse tree
	 */
	void exitImport_path(Swift5Parser.Import_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void enterImport_path_identifier(Swift5Parser.Import_path_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#import_path_identifier}.
	 * @param ctx the parse tree
	 */
	void exitImport_path_identifier(Swift5Parser.Import_path_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(Swift5Parser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(Swift5Parser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer_list(Swift5Parser.Pattern_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer_list(Swift5Parser.Pattern_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void enterPattern_initializer(Swift5Parser.Pattern_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#pattern_initializer}.
	 * @param ctx the parse tree
	 */
	void exitPattern_initializer(Swift5Parser.Pattern_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(Swift5Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(Swift5Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(Swift5Parser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(Swift5Parser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_head(Swift5Parser.Variable_declaration_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#variable_declaration_head}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_head(Swift5Parser.Variable_declaration_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(Swift5Parser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(Swift5Parser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_block(Swift5Parser.Getter_setter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#getter_setter_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_block(Swift5Parser.Getter_setter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_clause(Swift5Parser.Getter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#getter_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_clause(Swift5Parser.Getter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_clause(Swift5Parser.Setter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#setter_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_clause(Swift5Parser.Setter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void enterSetter_name(Swift5Parser.Setter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#setter_name}.
	 * @param ctx the parse tree
	 */
	void exitSetter_name(Swift5Parser.Setter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void enterGetter_setter_keyword_block(Swift5Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 */
	void exitGetter_setter_keyword_block(Swift5Parser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterGetter_keyword_clause(Swift5Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitGetter_keyword_clause(Swift5Parser.Getter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void enterSetter_keyword_clause(Swift5Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 */
	void exitSetter_keyword_clause(Swift5Parser.Setter_keyword_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_didSet_block(Swift5Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_didSet_block(Swift5Parser.WillSet_didSet_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterWillSet_clause(Swift5Parser.WillSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#willSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitWillSet_clause(Swift5Parser.WillSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void enterDidSet_clause(Swift5Parser.DidSet_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#didSet_clause}.
	 * @param ctx the parse tree
	 */
	void exitDidSet_clause(Swift5Parser.DidSet_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_declaration(Swift5Parser.Typealias_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#typealias_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_declaration(Swift5Parser.Typealias_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_name(Swift5Parser.Typealias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#typealias_name}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_name(Swift5Parser.Typealias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealias_assignment(Swift5Parser.Typealias_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#typealias_assignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealias_assignment(Swift5Parser.Typealias_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(Swift5Parser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(Swift5Parser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void enterFunction_head(Swift5Parser.Function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_head}.
	 * @param ctx the parse tree
	 */
	void exitFunction_head(Swift5Parser.Function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(Swift5Parser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(Swift5Parser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(Swift5Parser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(Swift5Parser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void enterFunction_result(Swift5Parser.Function_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_result}.
	 * @param ctx the parse tree
	 */
	void exitFunction_result(Swift5Parser.Function_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(Swift5Parser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(Swift5Parser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_clause(Swift5Parser.Parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_clause(Swift5Parser.Parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(Swift5Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(Swift5Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Swift5Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Swift5Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterExternal_parameter_name(Swift5Parser.External_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#external_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitExternal_parameter_name(Swift5Parser.External_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_name(Swift5Parser.Local_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#local_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_name(Swift5Parser.Local_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument_clause(Swift5Parser.Default_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#default_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument_clause(Swift5Parser.Default_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(Swift5Parser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(Swift5Parser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum(Swift5Parser.Union_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum(Swift5Parser.Union_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_members(Swift5Parser.Union_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_members(Swift5Parser.Union_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_member(Swift5Parser.Union_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_member(Swift5Parser.Union_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_clause(Swift5Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_clause(Swift5Parser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case_list(Swift5Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case_list(Swift5Parser.Union_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterUnion_style_enum_case(Swift5Parser.Union_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#union_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitUnion_style_enum_case(Swift5Parser.Union_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_name(Swift5Parser.Enum_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#enum_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_name(Swift5Parser.Enum_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_name(Swift5Parser.Enum_case_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#enum_case_name}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_name(Swift5Parser.Enum_case_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum(Swift5Parser.Raw_value_style_enumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum(Swift5Parser.Raw_value_style_enumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_members(Swift5Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_members(Swift5Parser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_member(Swift5Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_member(Swift5Parser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_clause(Swift5Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_clause(Swift5Parser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case_list(Swift5Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case_list(Swift5Parser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_style_enum_case(Swift5Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_style_enum_case(Swift5Parser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_assignment(Swift5Parser.Raw_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_assignment(Swift5Parser.Raw_value_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value_literal(Swift5Parser.Raw_value_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#raw_value_literal}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value_literal(Swift5Parser.Raw_value_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(Swift5Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(Swift5Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(Swift5Parser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(Swift5Parser.Struct_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(Swift5Parser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(Swift5Parser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#struct_members}.
	 * @param ctx the parse tree
	 */
	void enterStruct_members(Swift5Parser.Struct_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#struct_members}.
	 * @param ctx the parse tree
	 */
	void exitStruct_members(Swift5Parser.Struct_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#struct_member}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member(Swift5Parser.Struct_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#struct_member}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member(Swift5Parser.Struct_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(Swift5Parser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(Swift5Parser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(Swift5Parser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(Swift5Parser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(Swift5Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(Swift5Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#class_members}.
	 * @param ctx the parse tree
	 */
	void enterClass_members(Swift5Parser.Class_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#class_members}.
	 * @param ctx the parse tree
	 */
	void exitClass_members(Swift5Parser.Class_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(Swift5Parser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(Swift5Parser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(Swift5Parser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(Swift5Parser.Protocol_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(Swift5Parser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(Swift5Parser.Protocol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_body(Swift5Parser.Protocol_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_body}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_body(Swift5Parser.Protocol_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_members}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_members(Swift5Parser.Protocol_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_members}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_members(Swift5Parser.Protocol_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_member}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member(Swift5Parser.Protocol_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_member}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member(Swift5Parser.Protocol_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_member_declaration(Swift5Parser.Protocol_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_member_declaration(Swift5Parser.Protocol_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_property_declaration(Swift5Parser.Protocol_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_property_declaration(Swift5Parser.Protocol_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_method_declaration(Swift5Parser.Protocol_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_method_declaration(Swift5Parser.Protocol_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_initializer_declaration(Swift5Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_initializer_declaration(Swift5Parser.Protocol_initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_subscript_declaration(Swift5Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_subscript_declaration(Swift5Parser.Protocol_subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_associated_type_declaration(Swift5Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_associated_type_declaration(Swift5Parser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_declaration(Swift5Parser.Initializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#initializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_declaration(Swift5Parser.Initializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_head(Swift5Parser.Initializer_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#initializer_head}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_head(Swift5Parser.Initializer_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_body(Swift5Parser.Initializer_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#initializer_body}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_body(Swift5Parser.Initializer_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializer_declaration(Swift5Parser.Deinitializer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializer_declaration(Swift5Parser.Deinitializer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtension_declaration(Swift5Parser.Extension_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#extension_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtension_declaration(Swift5Parser.Extension_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void enterExtension_body(Swift5Parser.Extension_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#extension_body}.
	 * @param ctx the parse tree
	 */
	void exitExtension_body(Swift5Parser.Extension_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#extension_members}.
	 * @param ctx the parse tree
	 */
	void enterExtension_members(Swift5Parser.Extension_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#extension_members}.
	 * @param ctx the parse tree
	 */
	void exitExtension_members(Swift5Parser.Extension_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#extension_member}.
	 * @param ctx the parse tree
	 */
	void enterExtension_member(Swift5Parser.Extension_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#extension_member}.
	 * @param ctx the parse tree
	 */
	void exitExtension_member(Swift5Parser.Extension_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_declaration(Swift5Parser.Subscript_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#subscript_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_declaration(Swift5Parser.Subscript_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_head(Swift5Parser.Subscript_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#subscript_head}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_head(Swift5Parser.Subscript_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_result(Swift5Parser.Subscript_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#subscript_result}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_result(Swift5Parser.Subscript_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(Swift5Parser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(Swift5Parser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator_declaration(Swift5Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator_declaration(Swift5Parser.Prefix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator_declaration(Swift5Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator_declaration(Swift5Parser.Postfix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_declaration(Swift5Parser.Infix_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_declaration(Swift5Parser.Infix_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 */
	void enterInfix_operator_group(Swift5Parser.Infix_operator_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#infix_operator_group}.
	 * @param ctx the parse tree
	 */
	void exitInfix_operator_group(Swift5Parser.Infix_operator_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_declaration(Swift5Parser.Precedence_group_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_declaration(Swift5Parser.Precedence_group_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_attributes}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_attributes(Swift5Parser.Precedence_group_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_attributes}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_attributes(Swift5Parser.Precedence_group_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_attribute(Swift5Parser.Precedence_group_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_attribute(Swift5Parser.Precedence_group_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_relation(Swift5Parser.Precedence_group_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_relation}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_relation(Swift5Parser.Precedence_group_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_assignment(Swift5Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_assignment}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_assignment(Swift5Parser.Precedence_group_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_associativity(Swift5Parser.Precedence_group_associativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_associativity}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_associativity(Swift5Parser.Precedence_group_associativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_names(Swift5Parser.Precedence_group_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_names}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_names(Swift5Parser.Precedence_group_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence_group_name(Swift5Parser.Precedence_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#precedence_group_name}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence_group_name(Swift5Parser.Precedence_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifier(Swift5Parser.Declaration_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#declaration_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifier(Swift5Parser.Declaration_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_modifiers(Swift5Parser.Declaration_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#declaration_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_modifiers(Swift5Parser.Declaration_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_level_modifier(Swift5Parser.Access_level_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#access_level_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_level_modifier(Swift5Parser.Access_level_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 */
	void enterMutation_modifier(Swift5Parser.Mutation_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#mutation_modifier}.
	 * @param ctx the parse tree
	 */
	void exitMutation_modifier(Swift5Parser.Mutation_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Swift5Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Swift5Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(Swift5Parser.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(Swift5Parser.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(Swift5Parser.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(Swift5Parser.Identifier_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterValue_binding_pattern(Swift5Parser.Value_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#value_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitValue_binding_pattern(Swift5Parser.Value_binding_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern(Swift5Parser.Tuple_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern(Swift5Parser.Tuple_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element_list(Swift5Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element_list(Swift5Parser.Tuple_pattern_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_element(Swift5Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_element(Swift5Parser.Tuple_pattern_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void enterEnum_case_pattern(Swift5Parser.Enum_case_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#enum_case_pattern}.
	 * @param ctx the parse tree
	 */
	void exitEnum_case_pattern(Swift5Parser.Enum_case_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void enterOptional_pattern(Swift5Parser.Optional_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#optional_pattern}.
	 * @param ctx the parse tree
	 */
	void exitOptional_pattern(Swift5Parser.Optional_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pattern(Swift5Parser.Expression_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#expression_pattern}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pattern(Swift5Parser.Expression_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(Swift5Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(Swift5Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(Swift5Parser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(Swift5Parser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_clause(Swift5Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_clause(Swift5Parser.Attribute_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(Swift5Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(Swift5Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_tokens(Swift5Parser.Balanced_tokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#balanced_tokens}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_tokens(Swift5Parser.Balanced_tokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token(Swift5Parser.Balanced_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#balanced_token}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token(Swift5Parser.Balanced_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#balanced_token_punctuation}.
	 * @param ctx the parse tree
	 */
	void enterBalanced_token_punctuation(Swift5Parser.Balanced_token_punctuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#balanced_token_punctuation}.
	 * @param ctx the parse tree
	 */
	void exitBalanced_token_punctuation(Swift5Parser.Balanced_token_punctuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Swift5Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Swift5Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(Swift5Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(Swift5Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expression(Swift5Parser.Prefix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#prefix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expression(Swift5Parser.Prefix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_out_expression(Swift5Parser.In_out_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#in_out_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_out_expression(Swift5Parser.In_out_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void enterTry_operator(Swift5Parser.Try_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#try_operator}.
	 * @param ctx the parse tree
	 */
	void exitTry_operator(Swift5Parser.Try_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(Swift5Parser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(Swift5Parser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expressions(Swift5Parser.Binary_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#binary_expressions}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expressions(Swift5Parser.Binary_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(Swift5Parser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(Swift5Parser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void enterType_casting_operator(Swift5Parser.Type_casting_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_casting_operator}.
	 * @param ctx the parse tree
	 */
	void exitType_casting_operator(Swift5Parser.Type_casting_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(Swift5Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(Swift5Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#unqualified_name}.
	 * @param ctx the parse tree
	 */
	void enterUnqualified_name(Swift5Parser.Unqualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#unqualified_name}.
	 * @param ctx the parse tree
	 */
	void exitUnqualified_name(Swift5Parser.Unqualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(Swift5Parser.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(Swift5Parser.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(Swift5Parser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(Swift5Parser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_items(Swift5Parser.Array_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#array_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_items(Swift5Parser.Array_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal_item(Swift5Parser.Array_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#array_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal_item(Swift5Parser.Array_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal(Swift5Parser.Dictionary_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dictionary_literal}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal(Swift5Parser.Dictionary_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_items(Swift5Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_items(Swift5Parser.Dictionary_literal_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_literal_item(Swift5Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_literal_item(Swift5Parser.Dictionary_literal_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#playground_literal}.
	 * @param ctx the parse tree
	 */
	void enterPlayground_literal(Swift5Parser.Playground_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#playground_literal}.
	 * @param ctx the parse tree
	 */
	void exitPlayground_literal(Swift5Parser.Playground_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_pure_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_pure_expression(Swift5Parser.Self_pure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_pure_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_pure_expression(Swift5Parser.Self_pure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_method_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_method_expression(Swift5Parser.Self_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_method_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_method_expression(Swift5Parser.Self_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_subscript_expression(Swift5Parser.Self_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_subscript_expression(Swift5Parser.Self_subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelf_initializer_expression(Swift5Parser.Self_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#self_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelf_initializer_expression(Swift5Parser.Self_initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superclass_method_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_method_expression(Swift5Parser.Superclass_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superclass_method_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_method_expression(Swift5Parser.Superclass_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superclass_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_subscript_expression(Swift5Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superclass_subscript_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_subscript_expression(Swift5Parser.Superclass_subscript_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superclass_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_initializer_expression(Swift5Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superclass_initializer_expression}
	 * labeled alternative in {@link Swift5Parser#superclass_expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_initializer_expression(Swift5Parser.Superclass_initializer_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void enterClosure_expression(Swift5Parser.Closure_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#closure_expression}.
	 * @param ctx the parse tree
	 */
	void exitClosure_expression(Swift5Parser.Closure_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void enterClosure_signature(Swift5Parser.Closure_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#closure_signature}.
	 * @param ctx the parse tree
	 */
	void exitClosure_signature(Swift5Parser.Closure_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_clause(Swift5Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#closure_parameter_clause}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_clause(Swift5Parser.Closure_parameter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter_list(Swift5Parser.Closure_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#closure_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter_list(Swift5Parser.Closure_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#closure_parameter}.
	 * @param ctx the parse tree
	 */
	void enterClosure_parameter(Swift5Parser.Closure_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#closure_parameter}.
	 * @param ctx the parse tree
	 */
	void exitClosure_parameter(Swift5Parser.Closure_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list(Swift5Parser.Capture_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#capture_list}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list(Swift5Parser.Capture_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_items(Swift5Parser.Capture_list_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#capture_list_items}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_items(Swift5Parser.Capture_list_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void enterCapture_list_item(Swift5Parser.Capture_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#capture_list_item}.
	 * @param ctx the parse tree
	 */
	void exitCapture_list_item(Swift5Parser.Capture_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void enterCapture_specifier(Swift5Parser.Capture_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#capture_specifier}.
	 * @param ctx the parse tree
	 */
	void exitCapture_specifier(Swift5Parser.Capture_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_member_expression(Swift5Parser.Implicit_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#implicit_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_member_expression(Swift5Parser.Implicit_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#parenthesized_operator}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_operator(Swift5Parser.Parenthesized_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#parenthesized_operator}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_operator(Swift5Parser.Parenthesized_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(Swift5Parser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(Swift5Parser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple_expression(Swift5Parser.Tuple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple_expression(Swift5Parser.Tuple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element_list(Swift5Parser.Tuple_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element_list(Swift5Parser.Tuple_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element(Swift5Parser.Tuple_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element(Swift5Parser.Tuple_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_expression(Swift5Parser.Wildcard_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#wildcard_expression}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_expression(Swift5Parser.Wildcard_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_expression(Swift5Parser.Key_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_expression(Swift5Parser.Key_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_components}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_components(Swift5Parser.Key_path_componentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_components}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_components(Swift5Parser.Key_path_componentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_component}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_component(Swift5Parser.Key_path_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_component}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_component(Swift5Parser.Key_path_componentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_postfixes}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_postfixes(Swift5Parser.Key_path_postfixesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_postfixes}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_postfixes(Swift5Parser.Key_path_postfixesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_postfix}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_postfix(Swift5Parser.Key_path_postfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_postfix}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_postfix(Swift5Parser.Key_path_postfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(Swift5Parser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(Swift5Parser.Selector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#key_path_string_expression}.
	 * @param ctx the parse tree
	 */
	void enterKey_path_string_expression(Swift5Parser.Key_path_string_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#key_path_string_expression}.
	 * @param ctx the parse tree
	 */
	void exitKey_path_string_expression(Swift5Parser.Key_path_string_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(Swift5Parser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(Swift5Parser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_call_suffix}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_suffix(Swift5Parser.Function_call_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_call_suffix}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_suffix(Swift5Parser.Function_call_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#initializer_suffix}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_suffix(Swift5Parser.Initializer_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#initializer_suffix}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_suffix(Swift5Parser.Initializer_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#explicit_member_suffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_member_suffix(Swift5Parser.Explicit_member_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#explicit_member_suffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_member_suffix(Swift5Parser.Explicit_member_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#postfix_self_suffix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_self_suffix(Swift5Parser.Postfix_self_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#postfix_self_suffix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_self_suffix(Swift5Parser.Postfix_self_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#subscript_suffix}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_suffix(Swift5Parser.Subscript_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#subscript_suffix}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_suffix(Swift5Parser.Subscript_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#forced_value_suffix}.
	 * @param ctx the parse tree
	 */
	void enterForced_value_suffix(Swift5Parser.Forced_value_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#forced_value_suffix}.
	 * @param ctx the parse tree
	 */
	void exitForced_value_suffix(Swift5Parser.Forced_value_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#optional_chaining_suffix}.
	 * @param ctx the parse tree
	 */
	void enterOptional_chaining_suffix(Swift5Parser.Optional_chaining_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#optional_chaining_suffix}.
	 * @param ctx the parse tree
	 */
	void exitOptional_chaining_suffix(Swift5Parser.Optional_chaining_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument_clause(Swift5Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_call_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument_clause(Swift5Parser.Function_call_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument_list(Swift5Parser.Function_call_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_call_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument_list(Swift5Parser.Function_call_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_call_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_argument(Swift5Parser.Function_call_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_call_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_argument(Swift5Parser.Function_call_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#trailing_closures}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_closures(Swift5Parser.Trailing_closuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#trailing_closures}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_closures(Swift5Parser.Trailing_closuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#labeled_trailing_closures}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_trailing_closures(Swift5Parser.Labeled_trailing_closuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#labeled_trailing_closures}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_trailing_closures(Swift5Parser.Labeled_trailing_closuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#labeled_trailing_closure}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_trailing_closure(Swift5Parser.Labeled_trailing_closureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#labeled_trailing_closure}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_trailing_closure(Swift5Parser.Labeled_trailing_closureContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void enterArgument_names(Swift5Parser.Argument_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#argument_names}.
	 * @param ctx the parse tree
	 */
	void exitArgument_names(Swift5Parser.Argument_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(Swift5Parser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(Swift5Parser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Swift5Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Swift5Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(Swift5Parser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(Swift5Parser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(Swift5Parser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(Swift5Parser.Type_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(Swift5Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(Swift5Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(Swift5Parser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(Swift5Parser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element_list(Swift5Parser.Tuple_type_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element_list(Swift5Parser.Tuple_type_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(Swift5Parser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(Swift5Parser.Tuple_type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void enterElement_name(Swift5Parser.Element_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#element_name}.
	 * @param ctx the parse tree
	 */
	void exitElement_name(Swift5Parser.Element_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type(Swift5Parser.Function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type(Swift5Parser.Function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument_clause(Swift5Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_type_argument_clause}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument_clause(Swift5Parser.Function_type_argument_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument_list(Swift5Parser.Function_type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument_list(Swift5Parser.Function_type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#function_type_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_type_argument(Swift5Parser.Function_type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#function_type_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_type_argument(Swift5Parser.Function_type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#argument_label}.
	 * @param ctx the parse tree
	 */
	void enterArgument_label(Swift5Parser.Argument_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#argument_label}.
	 * @param ctx the parse tree
	 */
	void exitArgument_label(Swift5Parser.Argument_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(Swift5Parser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(Swift5Parser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dictionary_type}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_type(Swift5Parser.Dictionary_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dictionary_type}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_type(Swift5Parser.Dictionary_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_composition_type(Swift5Parser.Protocol_composition_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#protocol_composition_type}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_composition_type(Swift5Parser.Protocol_composition_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#trailing_composition_and}.
	 * @param ctx the parse tree
	 */
	void enterTrailing_composition_and(Swift5Parser.Trailing_composition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#trailing_composition_and}.
	 * @param ctx the parse tree
	 */
	void exitTrailing_composition_and(Swift5Parser.Trailing_composition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void enterOpaque_type(Swift5Parser.Opaque_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#opaque_type}.
	 * @param ctx the parse tree
	 */
	void exitOpaque_type(Swift5Parser.Opaque_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(Swift5Parser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(Swift5Parser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#self_type}.
	 * @param ctx the parse tree
	 */
	void enterSelf_type(Swift5Parser.Self_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#self_type}.
	 * @param ctx the parse tree
	 */
	void exitSelf_type(Swift5Parser.Self_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_clause(Swift5Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_clause(Swift5Parser.Type_inheritance_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void enterType_inheritance_list(Swift5Parser.Type_inheritance_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#type_inheritance_list}.
	 * @param ctx the parse tree
	 */
	void exitType_inheritance_list(Swift5Parser.Type_inheritance_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Swift5Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Swift5Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(Swift5Parser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(Swift5Parser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(Swift5Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(Swift5Parser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(Swift5Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(Swift5Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterNegate_prefix_operator(Swift5Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#negate_prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitNegate_prefix_operator(Swift5Parser.Negate_prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_AND(Swift5Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compilation_condition_AND}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_AND(Swift5Parser.Compilation_condition_ANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_OR(Swift5Parser.Compilation_condition_ORContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compilation_condition_OR}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_OR(Swift5Parser.Compilation_condition_ORContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_GE(Swift5Parser.Compilation_condition_GEContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compilation_condition_GE}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_GE(Swift5Parser.Compilation_condition_GEContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#compilation_condition_L}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_condition_L(Swift5Parser.Compilation_condition_LContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#compilation_condition_L}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_condition_L(Swift5Parser.Compilation_condition_LContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void enterArrow_operator(Swift5Parser.Arrow_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#arrow_operator}.
	 * @param ctx the parse tree
	 */
	void exitArrow_operator(Swift5Parser.Arrow_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(Swift5Parser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(Swift5Parser.Range_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void enterSame_type_equals(Swift5Parser.Same_type_equalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#same_type_equals}.
	 * @param ctx the parse tree
	 */
	void exitSame_type_equals(Swift5Parser.Same_type_equalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(Swift5Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(Swift5Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(Swift5Parser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(Swift5Parser.Prefix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(Swift5Parser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(Swift5Parser.Postfix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(Swift5Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(Swift5Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void enterOperator_head(Swift5Parser.Operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operator_head}.
	 * @param ctx the parse tree
	 */
	void exitOperator_head(Swift5Parser.Operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void enterOperator_character(Swift5Parser.Operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operator_character}.
	 * @param ctx the parse tree
	 */
	void exitOperator_character(Swift5Parser.Operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#operator_characters}.
	 * @param ctx the parse tree
	 */
	void enterOperator_characters(Swift5Parser.Operator_charactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#operator_characters}.
	 * @param ctx the parse tree
	 */
	void exitOperator_characters(Swift5Parser.Operator_charactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_head(Swift5Parser.Dot_operator_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dot_operator_head}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_head(Swift5Parser.Dot_operator_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_character(Swift5Parser.Dot_operator_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dot_operator_character}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_character(Swift5Parser.Dot_operator_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#dot_operator_characters}.
	 * @param ctx the parse tree
	 */
	void enterDot_operator_characters(Swift5Parser.Dot_operator_charactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#dot_operator_characters}.
	 * @param ctx the parse tree
	 */
	void exitDot_operator_characters(Swift5Parser.Dot_operator_charactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Swift5Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Swift5Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(Swift5Parser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(Swift5Parser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(Swift5Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(Swift5Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void enterNil_literal(Swift5Parser.Nil_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#nil_literal}.
	 * @param ctx the parse tree
	 */
	void exitNil_literal(Swift5Parser.Nil_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(Swift5Parser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(Swift5Parser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(Swift5Parser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(Swift5Parser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#extended_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterExtended_string_literal(Swift5Parser.Extended_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#extended_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitExtended_string_literal(Swift5Parser.Extended_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#static_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterStatic_string_literal(Swift5Parser.Static_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#static_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitStatic_string_literal(Swift5Parser.Static_string_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Swift5Parser#interpolated_string_literal}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string_literal(Swift5Parser.Interpolated_string_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Swift5Parser#interpolated_string_literal}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string_literal(Swift5Parser.Interpolated_string_literalContext ctx);
}