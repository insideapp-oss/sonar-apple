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
package fr.insideapp.sonarqube.swift.lang.antlr.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Swift5Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, ALPHA=2, BREAK=3, CASE=4, CATCH=5, CLASS=6, CONTINUE=7, DEFAULT=8, 
		DEFER=9, DO=10, GUARD=11, ELSE=12, ENUM=13, FOR=14, FALLTHROUGH=15, FUNC=16, 
		IN=17, IF=18, IMPORT=19, INTERNAL=20, FINAL=21, OPEN=22, PRIVATE=23, PUBLIC=24, 
		WHERE=25, WHILE=26, LET=27, VAR=28, PROTOCOL=29, GET=30, SET=31, WILL_SET=32, 
		DID_SET=33, REPEAT=34, SWITCH=35, STRUCT=36, RETURN=37, THROW=38, THROWS=39, 
		RETHROWS=40, INDIRECT=41, INIT=42, DEINIT=43, ASSOCIATED_TYPE=44, EXTENSION=45, 
		SUBSCRIPT=46, PREFIX=47, INFIX=48, LEFT=49, RIGHT=50, NONE=51, PRECEDENCE_GROUP=52, 
		HIGHER_THAN=53, LOWER_THAN=54, ASSIGNMENT=55, ASSOCIATIVITY=56, POSTFIX=57, 
		OPERATOR=58, TYPEALIAS=59, OS=60, ARCH=61, SWIFT=62, COMPILER=63, CAN_IMPORT=64, 
		TARGET_ENVIRONMENT=65, CONVENIENCE=66, DYNAMIC=67, LAZY=68, OPTIONAL=69, 
		OVERRIDE=70, REQUIRED=71, STATIC=72, WEAK=73, UNOWNED=74, SAFE=75, UNSAFE=76, 
		MUTATING=77, NONMUTATING=78, FILE_PRIVATE=79, IS=80, TRY=81, SUPER=82, 
		ANY=83, FALSE=84, RED=85, BLUE=86, GREEN=87, RESOURCE_NAME=88, TRUE=89, 
		NIL=90, INOUT=91, SOME=92, TYPE=93, PRECEDENCE=94, SELF=95, SELF_BIG=96, 
		MAC_OS=97, I_OS=98, OSX=99, WATCH_OS=100, TV_OS=101, LINUX=102, WINDOWS=103, 
		I386=104, X86_64=105, ARM=106, ARM64=107, SIMULATOR=108, MAC_CATALYST=109, 
		I_OS_APPLICATION_EXTENSION=110, MAC_CATALYST_APPLICATION_EXTENSION=111, 
		MAC_OS_APPLICATION_EXTENSION=112, SOURCE_LOCATION=113, FILE=114, LINE=115, 
		ERROR=116, WARNING=117, AVAILABLE=118, HASH_IF=119, HASH_ELSEIF=120, HASH_ELSE=121, 
		HASH_ENDIF=122, HASH_FILE=123, HASH_FILE_ID=124, HASH_FILE_PATH=125, HASH_LINE=126, 
		HASH_COLUMN=127, HASH_FUNCTION=128, HASH_DSO_HANDLE=129, HASH_SELECTOR=130, 
		HASH_KEYPATH=131, HASH_COLOR_LITERAL=132, HASH_FILE_LITERAL=133, HASH_IMAGE_LITERAL=134, 
		GETTER=135, SETTER=136, Identifier=137, DOT=138, LCURLY=139, LPAREN=140, 
		LBRACK=141, RCURLY=142, RPAREN=143, RBRACK=144, COMMA=145, COLON=146, 
		SEMI=147, LT=148, GT=149, UNDERSCORE=150, BANG=151, QUESTION=152, AT=153, 
		AND=154, SUB=155, EQUAL=156, OR=157, DIV=158, ADD=159, MUL=160, MOD=161, 
		CARET=162, TILDE=163, HASH=164, BACKTICK=165, DOLLAR=166, BACKSLASH=167, 
		Operator_head_other=168, Operator_following_character=169, Binary_literal=170, 
		Octal_literal=171, Decimal_digits=172, Decimal_literal=173, Hexadecimal_literal=174, 
		Floating_point_literal=175, WS=176, HASHBANG=177, Block_comment=178, Line_comment=179, 
		Multi_line_extended_string_open=180, Single_line_extended_string_open=181, 
		Multi_line_string_open=182, Single_line_string_open=183, Interpolataion_single_line=184, 
		Single_line_string_close=185, Quoted_single_line_text=186, Interpolataion_multi_line=187, 
		Multi_line_string_close=188, Quoted_multi_line_text=189, Single_line_extended_string_close=190, 
		Quoted_single_line_extended_text=191, Multi_line_extended_string_close=192, 
		Quoted_multi_line_extended_text=193;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_loop_statement = 3, 
		RULE_for_in_statement = 4, RULE_while_statement = 5, RULE_condition_list = 6, 
		RULE_condition = 7, RULE_case_condition = 8, RULE_optional_binding_condition = 9, 
		RULE_repeat_while_statement = 10, RULE_branch_statement = 11, RULE_if_statement = 12, 
		RULE_else_clause = 13, RULE_guard_statement = 14, RULE_switch_statement = 15, 
		RULE_switch_cases = 16, RULE_switch_case = 17, RULE_case_label = 18, RULE_case_item_list = 19, 
		RULE_default_label = 20, RULE_where_clause = 21, RULE_where_expression = 22, 
		RULE_conditional_switch_case = 23, RULE_switch_if_directive_clause = 24, 
		RULE_switch_elseif_directive_clauses = 25, RULE_switch_elseif_directive_clause = 26, 
		RULE_switch_else_directive_clause = 27, RULE_labeled_statement = 28, RULE_statement_label = 29, 
		RULE_label_name = 30, RULE_control_transfer_statement = 31, RULE_break_statement = 32, 
		RULE_continue_statement = 33, RULE_fallthrough_statement = 34, RULE_return_statement = 35, 
		RULE_throw_statement = 36, RULE_defer_statement = 37, RULE_do_statement = 38, 
		RULE_catch_clauses = 39, RULE_catch_clause = 40, RULE_catch_pattern_list = 41, 
		RULE_catch_pattern = 42, RULE_compiler_control_statement = 43, RULE_conditional_compilation_block = 44, 
		RULE_if_directive_clause = 45, RULE_elseif_directive_clauses = 46, RULE_elseif_directive_clause = 47, 
		RULE_else_directive_clause = 48, RULE_compilation_condition = 49, RULE_platform_condition = 50, 
		RULE_swift_version = 51, RULE_swift_version_continuation = 52, RULE_operating_system = 53, 
		RULE_architecture = 54, RULE_module_name = 55, RULE_environment = 56, 
		RULE_line_control_statement = 57, RULE_line_number = 58, RULE_file_name = 59, 
		RULE_diagnostic_statement = 60, RULE_diagnostic_message = 61, RULE_availability_condition = 62, 
		RULE_availability_arguments = 63, RULE_availability_argument = 64, RULE_platform_name = 65, 
		RULE_platform_version = 66, RULE_generic_parameter_clause = 67, RULE_generic_parameter_list = 68, 
		RULE_generic_parameter = 69, RULE_generic_where_clause = 70, RULE_requirement_list = 71, 
		RULE_requirement = 72, RULE_conformance_requirement = 73, RULE_same_type_requirement = 74, 
		RULE_generic_argument_clause = 75, RULE_generic_argument_list = 76, RULE_generic_argument = 77, 
		RULE_declaration = 78, RULE_declarations = 79, RULE_top_level_declaration = 80, 
		RULE_code_block = 81, RULE_import_declaration = 82, RULE_import_kind = 83, 
		RULE_import_path = 84, RULE_import_path_identifier = 85, RULE_constant_declaration = 86, 
		RULE_pattern_initializer_list = 87, RULE_pattern_initializer = 88, RULE_initializer = 89, 
		RULE_variable_declaration = 90, RULE_variable_declaration_head = 91, RULE_variable_name = 92, 
		RULE_getter_setter_block = 93, RULE_getter_clause = 94, RULE_setter_clause = 95, 
		RULE_setter_name = 96, RULE_getter_setter_keyword_block = 97, RULE_getter_keyword_clause = 98, 
		RULE_setter_keyword_clause = 99, RULE_willSet_didSet_block = 100, RULE_willSet_clause = 101, 
		RULE_didSet_clause = 102, RULE_typealias_declaration = 103, RULE_typealias_name = 104, 
		RULE_typealias_assignment = 105, RULE_function_declaration = 106, RULE_function_head = 107, 
		RULE_function_name = 108, RULE_function_signature = 109, RULE_function_result = 110, 
		RULE_function_body = 111, RULE_parameter_clause = 112, RULE_parameter_list = 113, 
		RULE_parameter = 114, RULE_external_parameter_name = 115, RULE_local_parameter_name = 116, 
		RULE_default_argument_clause = 117, RULE_enum_declaration = 118, RULE_union_style_enum = 119, 
		RULE_union_style_enum_members = 120, RULE_union_style_enum_member = 121, 
		RULE_union_style_enum_case_clause = 122, RULE_union_style_enum_case_list = 123, 
		RULE_union_style_enum_case = 124, RULE_enum_name = 125, RULE_enum_case_name = 126, 
		RULE_raw_value_style_enum = 127, RULE_raw_value_style_enum_members = 128, 
		RULE_raw_value_style_enum_member = 129, RULE_raw_value_style_enum_case_clause = 130, 
		RULE_raw_value_style_enum_case_list = 131, RULE_raw_value_style_enum_case = 132, 
		RULE_raw_value_assignment = 133, RULE_raw_value_literal = 134, RULE_struct_declaration = 135, 
		RULE_struct_name = 136, RULE_struct_body = 137, RULE_struct_members = 138, 
		RULE_struct_member = 139, RULE_class_declaration = 140, RULE_class_name = 141, 
		RULE_class_body = 142, RULE_class_members = 143, RULE_class_member = 144, 
		RULE_protocol_declaration = 145, RULE_protocol_name = 146, RULE_protocol_body = 147, 
		RULE_protocol_members = 148, RULE_protocol_member = 149, RULE_protocol_member_declaration = 150, 
		RULE_protocol_property_declaration = 151, RULE_protocol_method_declaration = 152, 
		RULE_protocol_initializer_declaration = 153, RULE_protocol_subscript_declaration = 154, 
		RULE_protocol_associated_type_declaration = 155, RULE_initializer_declaration = 156, 
		RULE_initializer_head = 157, RULE_initializer_body = 158, RULE_deinitializer_declaration = 159, 
		RULE_extension_declaration = 160, RULE_extension_body = 161, RULE_extension_members = 162, 
		RULE_extension_member = 163, RULE_subscript_declaration = 164, RULE_subscript_head = 165, 
		RULE_subscript_result = 166, RULE_operator_declaration = 167, RULE_prefix_operator_declaration = 168, 
		RULE_postfix_operator_declaration = 169, RULE_infix_operator_declaration = 170, 
		RULE_infix_operator_group = 171, RULE_precedence_group_declaration = 172, 
		RULE_precedence_group_attributes = 173, RULE_precedence_group_attribute = 174, 
		RULE_precedence_group_relation = 175, RULE_precedence_group_assignment = 176, 
		RULE_precedence_group_associativity = 177, RULE_precedence_group_names = 178, 
		RULE_precedence_group_name = 179, RULE_declaration_modifier = 180, RULE_declaration_modifiers = 181, 
		RULE_access_level_modifier = 182, RULE_mutation_modifier = 183, RULE_pattern = 184, 
		RULE_wildcard_pattern = 185, RULE_identifier_pattern = 186, RULE_value_binding_pattern = 187, 
		RULE_tuple_pattern = 188, RULE_tuple_pattern_element_list = 189, RULE_tuple_pattern_element = 190, 
		RULE_enum_case_pattern = 191, RULE_optional_pattern = 192, RULE_expression_pattern = 193, 
		RULE_attribute = 194, RULE_attribute_name = 195, RULE_attribute_argument_clause = 196, 
		RULE_attributes = 197, RULE_balanced_tokens = 198, RULE_balanced_token = 199, 
		RULE_balanced_token_punctuation = 200, RULE_expression = 201, RULE_expression_list = 202, 
		RULE_prefix_expression = 203, RULE_in_out_expression = 204, RULE_try_operator = 205, 
		RULE_binary_expression = 206, RULE_binary_expressions = 207, RULE_conditional_operator = 208, 
		RULE_type_casting_operator = 209, RULE_primary_expression = 210, RULE_unqualified_name = 211, 
		RULE_literal_expression = 212, RULE_array_literal = 213, RULE_array_literal_items = 214, 
		RULE_array_literal_item = 215, RULE_dictionary_literal = 216, RULE_dictionary_literal_items = 217, 
		RULE_dictionary_literal_item = 218, RULE_playground_literal = 219, RULE_self_expression = 220, 
		RULE_superclass_expression = 221, RULE_closure_expression = 222, RULE_closure_signature = 223, 
		RULE_closure_parameter_clause = 224, RULE_closure_parameter_list = 225, 
		RULE_closure_parameter = 226, RULE_capture_list = 227, RULE_capture_list_items = 228, 
		RULE_capture_list_item = 229, RULE_capture_specifier = 230, RULE_implicit_member_expression = 231, 
		RULE_parenthesized_operator = 232, RULE_parenthesized_expression = 233, 
		RULE_tuple_expression = 234, RULE_tuple_element_list = 235, RULE_tuple_element = 236, 
		RULE_wildcard_expression = 237, RULE_key_path_expression = 238, RULE_key_path_components = 239, 
		RULE_key_path_component = 240, RULE_key_path_postfixes = 241, RULE_key_path_postfix = 242, 
		RULE_selector_expression = 243, RULE_key_path_string_expression = 244, 
		RULE_postfix_expression = 245, RULE_function_call_suffix = 246, RULE_initializer_suffix = 247, 
		RULE_explicit_member_suffix = 248, RULE_postfix_self_suffix = 249, RULE_subscript_suffix = 250, 
		RULE_forced_value_suffix = 251, RULE_optional_chaining_suffix = 252, RULE_function_call_argument_clause = 253, 
		RULE_function_call_argument_list = 254, RULE_function_call_argument = 255, 
		RULE_trailing_closures = 256, RULE_labeled_trailing_closures = 257, RULE_labeled_trailing_closure = 258, 
		RULE_argument_names = 259, RULE_argument_name = 260, RULE_type = 261, 
		RULE_type_annotation = 262, RULE_type_identifier = 263, RULE_type_name = 264, 
		RULE_tuple_type = 265, RULE_tuple_type_element_list = 266, RULE_tuple_type_element = 267, 
		RULE_element_name = 268, RULE_function_type = 269, RULE_function_type_argument_clause = 270, 
		RULE_function_type_argument_list = 271, RULE_function_type_argument = 272, 
		RULE_argument_label = 273, RULE_array_type = 274, RULE_dictionary_type = 275, 
		RULE_protocol_composition_type = 276, RULE_trailing_composition_and = 277, 
		RULE_opaque_type = 278, RULE_any_type = 279, RULE_self_type = 280, RULE_type_inheritance_clause = 281, 
		RULE_type_inheritance_list = 282, RULE_identifier = 283, RULE_identifier_list = 284, 
		RULE_keyword = 285, RULE_assignment_operator = 286, RULE_negate_prefix_operator = 287, 
		RULE_compilation_condition_AND = 288, RULE_compilation_condition_OR = 289, 
		RULE_compilation_condition_GE = 290, RULE_compilation_condition_L = 291, 
		RULE_arrow_operator = 292, RULE_range_operator = 293, RULE_same_type_equals = 294, 
		RULE_binary_operator = 295, RULE_prefix_operator = 296, RULE_postfix_operator = 297, 
		RULE_operator = 298, RULE_operator_head = 299, RULE_operator_character = 300, 
		RULE_operator_characters = 301, RULE_dot_operator_head = 302, RULE_dot_operator_character = 303, 
		RULE_dot_operator_characters = 304, RULE_literal = 305, RULE_numeric_literal = 306, 
		RULE_boolean_literal = 307, RULE_nil_literal = 308, RULE_integer_literal = 309, 
		RULE_string_literal = 310, RULE_extended_string_literal = 311, RULE_static_string_literal = 312, 
		RULE_interpolated_string_literal = 313;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level", "statement", "statements", "loop_statement", "for_in_statement", 
			"while_statement", "condition_list", "condition", "case_condition", "optional_binding_condition", 
			"repeat_while_statement", "branch_statement", "if_statement", "else_clause", 
			"guard_statement", "switch_statement", "switch_cases", "switch_case", 
			"case_label", "case_item_list", "default_label", "where_clause", "where_expression", 
			"conditional_switch_case", "switch_if_directive_clause", "switch_elseif_directive_clauses", 
			"switch_elseif_directive_clause", "switch_else_directive_clause", "labeled_statement", 
			"statement_label", "label_name", "control_transfer_statement", "break_statement", 
			"continue_statement", "fallthrough_statement", "return_statement", "throw_statement", 
			"defer_statement", "do_statement", "catch_clauses", "catch_clause", "catch_pattern_list", 
			"catch_pattern", "compiler_control_statement", "conditional_compilation_block", 
			"if_directive_clause", "elseif_directive_clauses", "elseif_directive_clause", 
			"else_directive_clause", "compilation_condition", "platform_condition", 
			"swift_version", "swift_version_continuation", "operating_system", "architecture", 
			"module_name", "environment", "line_control_statement", "line_number", 
			"file_name", "diagnostic_statement", "diagnostic_message", "availability_condition", 
			"availability_arguments", "availability_argument", "platform_name", "platform_version", 
			"generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
			"generic_where_clause", "requirement_list", "requirement", "conformance_requirement", 
			"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
			"generic_argument", "declaration", "declarations", "top_level_declaration", 
			"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
			"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
			"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
			"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
			"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
			"willSet_didSet_block", "willSet_clause", "didSet_clause", "typealias_declaration", 
			"typealias_name", "typealias_assignment", "function_declaration", "function_head", 
			"function_name", "function_signature", "function_result", "function_body", 
			"parameter_clause", "parameter_list", "parameter", "external_parameter_name", 
			"local_parameter_name", "default_argument_clause", "enum_declaration", 
			"union_style_enum", "union_style_enum_members", "union_style_enum_member", 
			"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
			"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
			"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
			"raw_value_style_enum_case", "raw_value_assignment", "raw_value_literal", 
			"struct_declaration", "struct_name", "struct_body", "struct_members", 
			"struct_member", "class_declaration", "class_name", "class_body", "class_members", 
			"class_member", "protocol_declaration", "protocol_name", "protocol_body", 
			"protocol_members", "protocol_member", "protocol_member_declaration", 
			"protocol_property_declaration", "protocol_method_declaration", "protocol_initializer_declaration", 
			"protocol_subscript_declaration", "protocol_associated_type_declaration", 
			"initializer_declaration", "initializer_head", "initializer_body", "deinitializer_declaration", 
			"extension_declaration", "extension_body", "extension_members", "extension_member", 
			"subscript_declaration", "subscript_head", "subscript_result", "operator_declaration", 
			"prefix_operator_declaration", "postfix_operator_declaration", "infix_operator_declaration", 
			"infix_operator_group", "precedence_group_declaration", "precedence_group_attributes", 
			"precedence_group_attribute", "precedence_group_relation", "precedence_group_assignment", 
			"precedence_group_associativity", "precedence_group_names", "precedence_group_name", 
			"declaration_modifier", "declaration_modifiers", "access_level_modifier", 
			"mutation_modifier", "pattern", "wildcard_pattern", "identifier_pattern", 
			"value_binding_pattern", "tuple_pattern", "tuple_pattern_element_list", 
			"tuple_pattern_element", "enum_case_pattern", "optional_pattern", "expression_pattern", 
			"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
			"balanced_tokens", "balanced_token", "balanced_token_punctuation", "expression", 
			"expression_list", "prefix_expression", "in_out_expression", "try_operator", 
			"binary_expression", "binary_expressions", "conditional_operator", "type_casting_operator", 
			"primary_expression", "unqualified_name", "literal_expression", "array_literal", 
			"array_literal_items", "array_literal_item", "dictionary_literal", "dictionary_literal_items", 
			"dictionary_literal_item", "playground_literal", "self_expression", "superclass_expression", 
			"closure_expression", "closure_signature", "closure_parameter_clause", 
			"closure_parameter_list", "closure_parameter", "capture_list", "capture_list_items", 
			"capture_list_item", "capture_specifier", "implicit_member_expression", 
			"parenthesized_operator", "parenthesized_expression", "tuple_expression", 
			"tuple_element_list", "tuple_element", "wildcard_expression", "key_path_expression", 
			"key_path_components", "key_path_component", "key_path_postfixes", "key_path_postfix", 
			"selector_expression", "key_path_string_expression", "postfix_expression", 
			"function_call_suffix", "initializer_suffix", "explicit_member_suffix", 
			"postfix_self_suffix", "subscript_suffix", "forced_value_suffix", "optional_chaining_suffix", 
			"function_call_argument_clause", "function_call_argument_list", "function_call_argument", 
			"trailing_closures", "labeled_trailing_closures", "labeled_trailing_closure", 
			"argument_names", "argument_name", "type", "type_annotation", "type_identifier", 
			"type_name", "tuple_type", "tuple_type_element_list", "tuple_type_element", 
			"element_name", "function_type", "function_type_argument_clause", "function_type_argument_list", 
			"function_type_argument", "argument_label", "array_type", "dictionary_type", 
			"protocol_composition_type", "trailing_composition_and", "opaque_type", 
			"any_type", "self_type", "type_inheritance_clause", "type_inheritance_list", 
			"identifier", "identifier_list", "keyword", "assignment_operator", "negate_prefix_operator", 
			"compilation_condition_AND", "compilation_condition_OR", "compilation_condition_GE", 
			"compilation_condition_L", "arrow_operator", "range_operator", "same_type_equals", 
			"binary_operator", "prefix_operator", "postfix_operator", "operator", 
			"operator_head", "operator_character", "operator_characters", "dot_operator_head", 
			"dot_operator_character", "dot_operator_characters", "literal", "numeric_literal", 
			"boolean_literal", "nil_literal", "integer_literal", "string_literal", 
			"extended_string_literal", "static_string_literal", "interpolated_string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'alpha'", "'break'", "'case'", "'catch'", "'class'", "'continue'", 
			"'default'", "'defer'", "'do'", "'guard'", "'else'", "'enum'", "'for'", 
			"'fallthrough'", "'func'", "'in'", "'if'", "'import'", "'internal'", 
			"'final'", "'open'", "'private'", "'public'", "'where'", "'while'", "'let'", 
			"'var'", "'protocol'", "'get'", "'set'", "'willSet'", "'didSet'", "'repeat'", 
			"'switch'", "'struct'", "'return'", "'throw'", "'throws'", "'rethrows'", 
			"'indirect'", "'init'", "'deinit'", "'associatedtype'", "'extension'", 
			"'subscript'", "'prefix'", "'infix'", "'left'", "'right'", "'none'", 
			"'precedencegroup'", "'higherThan'", "'lowerThan'", "'assignment'", "'associativity'", 
			"'postfix'", "'operator'", "'typealias'", "'os'", "'arch'", "'swift'", 
			"'compiler'", "'canImport'", "'targetEnvironment'", "'convenience'", 
			"'dynamic'", "'lazy'", "'optional'", "'override'", "'required'", "'static'", 
			"'weak'", "'unowned'", "'safe'", "'unsafe'", "'mutating'", "'nonmutating'", 
			"'fileprivate'", "'is'", "'try'", "'super'", "'Any'", "'false'", "'red'", 
			"'blue'", "'green'", "'resourceName'", "'true'", "'nil'", "'inout'", 
			"'some'", "'Type'", "'precedence'", "'self'", "'Self'", "'macOS'", "'iOS'", 
			"'OSX'", "'watchOS'", "'tvOS'", "'Linux'", "'Windows'", "'i386'", "'x86_64'", 
			"'arm'", "'arm64'", "'simulator'", "'macCatalyst'", "'iOSApplicationExtension'", 
			"'macCatalystApplicationExtension'", "'macOSApplicationExtension'", "'#sourceLocation'", 
			"'file'", "'line'", "'#error'", "'#warning'", "'#available'", "'#if'", 
			"'#elseif'", "'#else'", "'#endif'", "'#file'", "'#fileID'", "'#filePath'", 
			"'#line'", "'#column'", "'#function'", "'#dsohandle'", "'#selector'", 
			"'#keyPath'", "'#colorLiteral'", "'#fileLiteral'", "'#imageLiteral'", 
			"'getter'", "'setter'", null, "'.'", "'{'", "'('", "'['", "'}'", "')'", 
			"']'", "','", "':'", "';'", "'<'", "'>'", "'_'", "'!'", "'?'", "'@'", 
			"'&'", "'-'", "'='", "'|'", "'/'", "'+'", "'*'", "'%'", "'^'", "'~'", 
			"'#'", "'`'", "'$'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AS", "ALPHA", "BREAK", "CASE", "CATCH", "CLASS", "CONTINUE", "DEFAULT", 
			"DEFER", "DO", "GUARD", "ELSE", "ENUM", "FOR", "FALLTHROUGH", "FUNC", 
			"IN", "IF", "IMPORT", "INTERNAL", "FINAL", "OPEN", "PRIVATE", "PUBLIC", 
			"WHERE", "WHILE", "LET", "VAR", "PROTOCOL", "GET", "SET", "WILL_SET", 
			"DID_SET", "REPEAT", "SWITCH", "STRUCT", "RETURN", "THROW", "THROWS", 
			"RETHROWS", "INDIRECT", "INIT", "DEINIT", "ASSOCIATED_TYPE", "EXTENSION", 
			"SUBSCRIPT", "PREFIX", "INFIX", "LEFT", "RIGHT", "NONE", "PRECEDENCE_GROUP", 
			"HIGHER_THAN", "LOWER_THAN", "ASSIGNMENT", "ASSOCIATIVITY", "POSTFIX", 
			"OPERATOR", "TYPEALIAS", "OS", "ARCH", "SWIFT", "COMPILER", "CAN_IMPORT", 
			"TARGET_ENVIRONMENT", "CONVENIENCE", "DYNAMIC", "LAZY", "OPTIONAL", "OVERRIDE", 
			"REQUIRED", "STATIC", "WEAK", "UNOWNED", "SAFE", "UNSAFE", "MUTATING", 
			"NONMUTATING", "FILE_PRIVATE", "IS", "TRY", "SUPER", "ANY", "FALSE", 
			"RED", "BLUE", "GREEN", "RESOURCE_NAME", "TRUE", "NIL", "INOUT", "SOME", 
			"TYPE", "PRECEDENCE", "SELF", "SELF_BIG", "MAC_OS", "I_OS", "OSX", "WATCH_OS", 
			"TV_OS", "LINUX", "WINDOWS", "I386", "X86_64", "ARM", "ARM64", "SIMULATOR", 
			"MAC_CATALYST", "I_OS_APPLICATION_EXTENSION", "MAC_CATALYST_APPLICATION_EXTENSION", 
			"MAC_OS_APPLICATION_EXTENSION", "SOURCE_LOCATION", "FILE", "LINE", "ERROR", 
			"WARNING", "AVAILABLE", "HASH_IF", "HASH_ELSEIF", "HASH_ELSE", "HASH_ENDIF", 
			"HASH_FILE", "HASH_FILE_ID", "HASH_FILE_PATH", "HASH_LINE", "HASH_COLUMN", 
			"HASH_FUNCTION", "HASH_DSO_HANDLE", "HASH_SELECTOR", "HASH_KEYPATH", 
			"HASH_COLOR_LITERAL", "HASH_FILE_LITERAL", "HASH_IMAGE_LITERAL", "GETTER", 
			"SETTER", "Identifier", "DOT", "LCURLY", "LPAREN", "LBRACK", "RCURLY", 
			"RPAREN", "RBRACK", "COMMA", "COLON", "SEMI", "LT", "GT", "UNDERSCORE", 
			"BANG", "QUESTION", "AT", "AND", "SUB", "EQUAL", "OR", "DIV", "ADD", 
			"MUL", "MOD", "CARET", "TILDE", "HASH", "BACKTICK", "DOLLAR", "BACKSLASH", 
			"Operator_head_other", "Operator_following_character", "Binary_literal", 
			"Octal_literal", "Decimal_digits", "Decimal_literal", "Hexadecimal_literal", 
			"Floating_point_literal", "WS", "HASHBANG", "Block_comment", "Line_comment", 
			"Multi_line_extended_string_open", "Single_line_extended_string_open", 
			"Multi_line_string_open", "Single_line_string_open", "Interpolataion_single_line", 
			"Single_line_string_close", "Quoted_single_line_text", "Interpolataion_multi_line", 
			"Multi_line_string_close", "Quoted_multi_line_text", "Single_line_extended_string_close", 
			"Quoted_single_line_extended_text", "Multi_line_extended_string_close", 
			"Quoted_multi_line_extended_text"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift5Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Swift5Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Swift5Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTop_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(628);
				statements();
				}
				break;
			}
			setState(631);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Defer_statementContext defer_statement() {
			return getRuleContext(Defer_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Swift5Parser.SEMI, 0); }
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(633);
					loop_statement();
					}
					break;
				case 2:
					{
					setState(634);
					declaration();
					}
					break;
				case 3:
					{
					setState(635);
					branch_statement();
					}
					break;
				case 4:
					{
					setState(636);
					labeled_statement();
					}
					break;
				case 5:
					{
					setState(637);
					control_transfer_statement();
					}
					break;
				case 6:
					{
					setState(638);
					defer_statement();
					}
					break;
				case 7:
					{
					setState(639);
					do_statement();
					}
					break;
				case 8:
					{
					setState(640);
					expression();
					}
					break;
				}
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(643);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public int indexBefore = -1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(649);
					if (!(SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore))) throw new FailedPredicateException(this, "SwiftSupport.isSeparatedStatement(_input, $indexBefore)");
					setState(650);
					statement();
					((StatementsContext)_localctx).indexBefore =  _input.index();
								
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(655); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Repeat_while_statementContext repeat_while_statement() {
			return getRuleContext(Repeat_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_statement);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				for_in_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				while_statement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				repeat_while_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Swift5Parser.FOR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode IN() { return getToken(Swift5Parser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(FOR);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(663);
				match(CASE);
				}
				break;
			}
			setState(666);
			pattern(0);
			setState(667);
			match(IN);
			setState(668);
			expression();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(669);
				where_clause();
				}
			}

			setState(672);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Swift5Parser.WHILE, 0); }
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(WHILE);
			setState(675);
			condition_list();
			setState(676);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_listContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Condition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCondition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCondition_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCondition_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_listContext condition_list() throws RecognitionException {
		Condition_listContext _localctx = new Condition_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			condition();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				condition();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Availability_conditionContext availability_condition() {
			return getRuleContext(Availability_conditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_conditionContext case_condition() {
			return getRuleContext(Case_conditionContext.class,0);
		}
		public Optional_binding_conditionContext optional_binding_condition() {
			return getRuleContext(Optional_binding_conditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				availability_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				case_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				optional_binding_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_conditionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Case_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCase_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCase_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCase_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_conditionContext case_condition() throws RecognitionException {
		Case_conditionContext _localctx = new Case_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_case_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(CASE);
			setState(693);
			pattern(0);
			setState(694);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_binding_conditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode LET() { return getToken(Swift5Parser.LET, 0); }
		public TerminalNode VAR() { return getToken(Swift5Parser.VAR, 0); }
		public Optional_binding_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_binding_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOptional_binding_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOptional_binding_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOptional_binding_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_binding_conditionContext optional_binding_condition() throws RecognitionException {
		Optional_binding_conditionContext _localctx = new Optional_binding_conditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optional_binding_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(697);
			pattern(0);
			setState(698);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_while_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(Swift5Parser.REPEAT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Swift5Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repeat_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRepeat_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRepeat_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRepeat_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_while_statementContext repeat_while_statement() throws RecognitionException {
		Repeat_while_statementContext _localctx = new Repeat_while_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(REPEAT);
			setState(701);
			code_block();
			setState(702);
			match(WHILE);
			setState(703);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Guard_statementContext guard_statement() {
			return getRuleContext(Guard_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_branch_statement);
		try {
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				if_statement();
				}
				break;
			case GUARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				guard_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Swift5Parser.IF, 0); }
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(IF);
			setState(711);
			condition_list();
			setState(712);
			code_block();
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(713);
				else_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Swift5Parser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_clause);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(ELSE);
				setState(717);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				match(ELSE);
				setState(719);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_statementContext extends ParserRuleContext {
		public TerminalNode GUARD() { return getToken(Swift5Parser.GUARD, 0); }
		public Condition_listContext condition_list() {
			return getRuleContext(Condition_listContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Swift5Parser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGuard_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGuard_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGuard_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_guard_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(GUARD);
			setState(723);
			condition_list();
			setState(724);
			match(ELSE);
			setState(725);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(Swift5Parser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(SWITCH);
			setState(728);
			expression();
			setState(729);
			match(LCURLY);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT || _la==HASH_IF || _la==AT) {
				{
				setState(730);
				switch_cases();
				}
			}

			setState(733);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_cases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			switch_case();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT || _la==HASH_IF || _la==AT) {
				{
				setState(736);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Conditional_switch_caseContext conditional_switch_case() {
			return getRuleContext(Conditional_switch_caseContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_switch_case);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case DEFAULT:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(739);
					case_label();
					}
					break;
				case 2:
					{
					setState(740);
					default_label();
					}
					break;
				}
				setState(743);
				statements();
				}
				break;
			case HASH_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				conditional_switch_case();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(748);
				attributes();
				}
			}

			setState(751);
			match(CASE);
			setState(752);
			case_item_list();
			setState(753);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_item_listContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<Where_clauseContext> where_clause() {
			return getRuleContexts(Where_clauseContext.class);
		}
		public Where_clauseContext where_clause(int i) {
			return getRuleContext(Where_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCase_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			pattern(0);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(756);
				where_clause();
				}
			}

			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(759);
				match(COMMA);
				setState(760);
				pattern(0);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(761);
					where_clause();
					}
				}

				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_labelContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(Swift5Parser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDefault_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_default_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(769);
				attributes();
				}
			}

			setState(772);
			match(DEFAULT);
			setState(773);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Swift5Parser.WHERE, 0); }
		public Where_expressionContext where_expression() {
			return getRuleContext(Where_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(WHERE);
			setState(776);
			where_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWhere_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWhere_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWhere_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expressionContext where_expression() throws RecognitionException {
		Where_expressionContext _localctx = new Where_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_where_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_switch_caseContext extends ParserRuleContext {
		public Switch_if_directive_clauseContext switch_if_directive_clause() {
			return getRuleContext(Switch_if_directive_clauseContext.class,0);
		}
		public TerminalNode HASH_ENDIF() { return getToken(Swift5Parser.HASH_ENDIF, 0); }
		public Switch_elseif_directive_clausesContext switch_elseif_directive_clauses() {
			return getRuleContext(Switch_elseif_directive_clausesContext.class,0);
		}
		public Switch_else_directive_clauseContext switch_else_directive_clause() {
			return getRuleContext(Switch_else_directive_clauseContext.class,0);
		}
		public Conditional_switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterConditional_switch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitConditional_switch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitConditional_switch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_switch_caseContext conditional_switch_case() throws RecognitionException {
		Conditional_switch_caseContext _localctx = new Conditional_switch_caseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditional_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			switch_if_directive_clause();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH_ELSEIF) {
				{
				setState(781);
				switch_elseif_directive_clauses();
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH_ELSE) {
				{
				setState(784);
				switch_else_directive_clause();
				}
			}

			setState(787);
			match(HASH_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_if_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_IF() { return getToken(Swift5Parser.HASH_IF, 0); }
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_if_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_if_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_if_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_if_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_if_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_if_directive_clauseContext switch_if_directive_clause() throws RecognitionException {
		Switch_if_directive_clauseContext _localctx = new Switch_if_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_switch_if_directive_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(HASH_IF);
			setState(790);
			compilation_condition(0);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT || _la==HASH_IF || _la==AT) {
				{
				setState(791);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_elseif_directive_clausesContext extends ParserRuleContext {
		public Elseif_directive_clauseContext elseif_directive_clause() {
			return getRuleContext(Elseif_directive_clauseContext.class,0);
		}
		public Switch_elseif_directive_clausesContext switch_elseif_directive_clauses() {
			return getRuleContext(Switch_elseif_directive_clausesContext.class,0);
		}
		public Switch_elseif_directive_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_elseif_directive_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_elseif_directive_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_elseif_directive_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_elseif_directive_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_elseif_directive_clausesContext switch_elseif_directive_clauses() throws RecognitionException {
		Switch_elseif_directive_clausesContext _localctx = new Switch_elseif_directive_clausesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_switch_elseif_directive_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			elseif_directive_clause();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH_ELSEIF) {
				{
				setState(795);
				switch_elseif_directive_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_elseif_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_ELSEIF() { return getToken(Swift5Parser.HASH_ELSEIF, 0); }
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_elseif_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_elseif_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_elseif_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_elseif_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_elseif_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_elseif_directive_clauseContext switch_elseif_directive_clause() throws RecognitionException {
		Switch_elseif_directive_clauseContext _localctx = new Switch_elseif_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_elseif_directive_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(HASH_ELSEIF);
			setState(799);
			compilation_condition(0);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT || _la==HASH_IF || _la==AT) {
				{
				setState(800);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_else_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_ELSE() { return getToken(Swift5Parser.HASH_ELSE, 0); }
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_else_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_else_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwitch_else_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwitch_else_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwitch_else_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_else_directive_clauseContext switch_else_directive_clause() throws RecognitionException {
		Switch_else_directive_clauseContext _localctx = new Switch_else_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switch_else_directive_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(HASH_ELSE);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT || _la==HASH_IF || _la==AT) {
				{
				setState(804);
				switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labeled_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			statement_label();
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case WHILE:
			case REPEAT:
				{
				setState(808);
				loop_statement();
				}
				break;
			case IF:
				{
				setState(809);
				if_statement();
				}
				break;
			case SWITCH:
				{
				setState(810);
				switch_statement();
				}
				break;
			case DO:
				{
				setState(811);
				do_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStatement_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			label_name();
			setState(815);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Throw_statementContext throw_statement() {
			return getRuleContext(Throw_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitControl_transfer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_control_transfer_statement);
		try {
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				continue_statement();
				}
				break;
			case FALLTHROUGH:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				fallthrough_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				return_statement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				throw_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Swift5Parser.BREAK, 0); }
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(BREAK);
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(827);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Swift5Parser.CONTINUE, 0); }
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(CONTINUE);
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(831);
				label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(Swift5Parser.FALLTHROUGH, 0); }
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFallthrough_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(FALLTHROUGH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Swift5Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(RETURN);
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(837);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(Swift5Parser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitThrow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitThrow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(THROW);
			setState(841);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defer_statementContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(Swift5Parser.DEFER, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Defer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDefer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDefer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDefer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defer_statementContext defer_statement() throws RecognitionException {
		Defer_statementContext _localctx = new Defer_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_defer_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(DEFER);
			setState(844);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(Swift5Parser.DO, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(DO);
			setState(847);
			code_block();
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(848);
				catch_clauses();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Catch_clauseContext> catch_clause() {
			return getRuleContexts(Catch_clauseContext.class);
		}
		public Catch_clauseContext catch_clause(int i) {
			return getRuleContext(Catch_clauseContext.class,i);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_catch_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(852); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(851);
					catch_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(854); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(Swift5Parser.CATCH, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Catch_pattern_listContext catch_pattern_list() {
			return getRuleContext(Catch_pattern_listContext.class,0);
		}
		public Catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCatch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCatch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCatch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clauseContext catch_clause() throws RecognitionException {
		Catch_clauseContext _localctx = new Catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_catch_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(CATCH);
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(857);
				catch_pattern_list();
				}
				break;
			}
			setState(860);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_pattern_listContext extends ParserRuleContext {
		public List<Catch_patternContext> catch_pattern() {
			return getRuleContexts(Catch_patternContext.class);
		}
		public Catch_patternContext catch_pattern(int i) {
			return getRuleContext(Catch_patternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Catch_pattern_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_pattern_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCatch_pattern_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCatch_pattern_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCatch_pattern_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_pattern_listContext catch_pattern_list() throws RecognitionException {
		Catch_pattern_listContext _localctx = new Catch_pattern_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_catch_pattern_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			catch_pattern();
			setState(869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(863);
					catch_pattern();
					setState(864);
					match(COMMA);
					setState(865);
					catch_pattern();
					}
					} 
				}
				setState(871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Catch_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCatch_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCatch_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCatch_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_patternContext catch_pattern() throws RecognitionException {
		Catch_patternContext _localctx = new Catch_patternContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_catch_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			pattern(0);
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(873);
				where_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compiler_control_statementContext extends ParserRuleContext {
		public Conditional_compilation_blockContext conditional_compilation_block() {
			return getRuleContext(Conditional_compilation_blockContext.class,0);
		}
		public Line_control_statementContext line_control_statement() {
			return getRuleContext(Line_control_statementContext.class,0);
		}
		public Diagnostic_statementContext diagnostic_statement() {
			return getRuleContext(Diagnostic_statementContext.class,0);
		}
		public Compiler_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompiler_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompiler_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompiler_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_control_statementContext compiler_control_statement() throws RecognitionException {
		Compiler_control_statementContext _localctx = new Compiler_control_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_compiler_control_statement);
		try {
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				conditional_compilation_block();
				}
				break;
			case SOURCE_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				line_control_statement();
				}
				break;
			case ERROR:
			case WARNING:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				diagnostic_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_compilation_blockContext extends ParserRuleContext {
		public If_directive_clauseContext if_directive_clause() {
			return getRuleContext(If_directive_clauseContext.class,0);
		}
		public TerminalNode HASH_ENDIF() { return getToken(Swift5Parser.HASH_ENDIF, 0); }
		public Elseif_directive_clausesContext elseif_directive_clauses() {
			return getRuleContext(Elseif_directive_clausesContext.class,0);
		}
		public Else_directive_clauseContext else_directive_clause() {
			return getRuleContext(Else_directive_clauseContext.class,0);
		}
		public Conditional_compilation_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_compilation_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterConditional_compilation_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitConditional_compilation_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitConditional_compilation_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_compilation_blockContext conditional_compilation_block() throws RecognitionException {
		Conditional_compilation_blockContext _localctx = new Conditional_compilation_blockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditional_compilation_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			if_directive_clause();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH_ELSEIF) {
				{
				setState(882);
				elseif_directive_clauses();
				}
			}

			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH_ELSE) {
				{
				setState(885);
				else_directive_clause();
				}
			}

			setState(888);
			match(HASH_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_IF() { return getToken(Swift5Parser.HASH_IF, 0); }
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIf_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIf_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIf_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_directive_clauseContext if_directive_clause() throws RecognitionException {
		If_directive_clauseContext _localctx = new If_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(HASH_IF);
			setState(891);
			compilation_condition(0);
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(892);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_directive_clausesContext extends ParserRuleContext {
		public List<Elseif_directive_clauseContext> elseif_directive_clause() {
			return getRuleContexts(Elseif_directive_clauseContext.class);
		}
		public Elseif_directive_clauseContext elseif_directive_clause(int i) {
			return getRuleContext(Elseif_directive_clauseContext.class,i);
		}
		public Elseif_directive_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterElseif_directive_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitElseif_directive_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitElseif_directive_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_directive_clausesContext elseif_directive_clauses() throws RecognitionException {
		Elseif_directive_clausesContext _localctx = new Elseif_directive_clausesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elseif_directive_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(895);
				elseif_directive_clause();
				}
				}
				setState(898); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASH_ELSEIF );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_ELSEIF() { return getToken(Swift5Parser.HASH_ELSEIF, 0); }
		public Compilation_conditionContext compilation_condition() {
			return getRuleContext(Compilation_conditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Elseif_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterElseif_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitElseif_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitElseif_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_directive_clauseContext elseif_directive_clause() throws RecognitionException {
		Elseif_directive_clauseContext _localctx = new Elseif_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_elseif_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(HASH_ELSEIF);
			setState(901);
			compilation_condition(0);
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(902);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_directive_clauseContext extends ParserRuleContext {
		public TerminalNode HASH_ELSE() { return getToken(Swift5Parser.HASH_ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_directive_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterElse_directive_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitElse_directive_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitElse_directive_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directive_clauseContext else_directive_clause() throws RecognitionException {
		Else_directive_clauseContext _localctx = new Else_directive_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_else_directive_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(HASH_ELSE);
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(906);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_conditionContext extends ParserRuleContext {
		public Platform_conditionContext platform_condition() {
			return getRuleContext(Platform_conditionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public List<Compilation_conditionContext> compilation_condition() {
			return getRuleContexts(Compilation_conditionContext.class);
		}
		public Compilation_conditionContext compilation_condition(int i) {
			return getRuleContext(Compilation_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Compilation_condition_ANDContext compilation_condition_AND() {
			return getRuleContext(Compilation_condition_ANDContext.class,0);
		}
		public Compilation_condition_ORContext compilation_condition_OR() {
			return getRuleContext(Compilation_condition_ORContext.class,0);
		}
		public Compilation_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompilation_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompilation_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompilation_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_conditionContext compilation_condition() throws RecognitionException {
		return compilation_condition(0);
	}

	private Compilation_conditionContext compilation_condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Compilation_conditionContext _localctx = new Compilation_conditionContext(_ctx, _parentState);
		Compilation_conditionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_compilation_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(910);
				platform_condition();
				}
				break;
			case 2:
				{
				setState(911);
				identifier();
				}
				break;
			case 3:
				{
				setState(912);
				boolean_literal();
				}
				break;
			case 4:
				{
				setState(913);
				match(LPAREN);
				setState(914);
				compilation_condition(0);
				setState(915);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(917);
				match(BANG);
				setState(918);
				compilation_condition(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Compilation_conditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compilation_condition);
					setState(921);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(924);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(922);
						compilation_condition_AND();
						}
						break;
					case 2:
						{
						setState(923);
						compilation_condition_OR();
						}
						break;
					}
					setState(926);
					compilation_condition(2);
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Platform_conditionContext extends ParserRuleContext {
		public TerminalNode OS() { return getToken(Swift5Parser.OS, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Operating_systemContext operating_system() {
			return getRuleContext(Operating_systemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode ARCH() { return getToken(Swift5Parser.ARCH, 0); }
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public Swift_versionContext swift_version() {
			return getRuleContext(Swift_versionContext.class,0);
		}
		public TerminalNode SWIFT() { return getToken(Swift5Parser.SWIFT, 0); }
		public TerminalNode COMPILER() { return getToken(Swift5Parser.COMPILER, 0); }
		public Compilation_condition_GEContext compilation_condition_GE() {
			return getRuleContext(Compilation_condition_GEContext.class,0);
		}
		public Compilation_condition_LContext compilation_condition_L() {
			return getRuleContext(Compilation_condition_LContext.class,0);
		}
		public TerminalNode CAN_IMPORT() { return getToken(Swift5Parser.CAN_IMPORT, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode TARGET_ENVIRONMENT() { return getToken(Swift5Parser.TARGET_ENVIRONMENT, 0); }
		public EnvironmentContext environment() {
			return getRuleContext(EnvironmentContext.class,0);
		}
		public Platform_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPlatform_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPlatform_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPlatform_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_conditionContext platform_condition() throws RecognitionException {
		Platform_conditionContext _localctx = new Platform_conditionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_platform_condition);
		int _la;
		try {
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OS:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				match(OS);
				setState(934);
				match(LPAREN);
				setState(935);
				operating_system();
				setState(936);
				match(RPAREN);
				}
				break;
			case ARCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(ARCH);
				setState(939);
				match(LPAREN);
				setState(940);
				architecture();
				setState(941);
				match(RPAREN);
				}
				break;
			case SWIFT:
			case COMPILER:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				_la = _input.LA(1);
				if ( !(_la==SWIFT || _la==COMPILER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(944);
				match(LPAREN);
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(945);
					compilation_condition_GE();
					}
					break;
				case 2:
					{
					setState(946);
					compilation_condition_L();
					}
					break;
				}
				setState(949);
				swift_version();
				setState(950);
				match(RPAREN);
				}
				break;
			case CAN_IMPORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				match(CAN_IMPORT);
				setState(953);
				match(LPAREN);
				setState(954);
				module_name();
				setState(955);
				match(RPAREN);
				}
				break;
			case TARGET_ENVIRONMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(957);
				match(TARGET_ENVIRONMENT);
				setState(958);
				match(LPAREN);
				setState(959);
				environment();
				setState(960);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Swift_versionContext extends ParserRuleContext {
		public TerminalNode Decimal_digits() { return getToken(Swift5Parser.Decimal_digits, 0); }
		public Swift_version_continuationContext swift_version_continuation() {
			return getRuleContext(Swift_version_continuationContext.class,0);
		}
		public Swift_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swift_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwift_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwift_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwift_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Swift_versionContext swift_version() throws RecognitionException {
		Swift_versionContext _localctx = new Swift_versionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_swift_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(Decimal_digits);
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(965);
				swift_version_continuation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Swift_version_continuationContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode Decimal_digits() { return getToken(Swift5Parser.Decimal_digits, 0); }
		public Swift_version_continuationContext swift_version_continuation() {
			return getRuleContext(Swift_version_continuationContext.class,0);
		}
		public Swift_version_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swift_version_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSwift_version_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSwift_version_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSwift_version_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Swift_version_continuationContext swift_version_continuation() throws RecognitionException {
		Swift_version_continuationContext _localctx = new Swift_version_continuationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_swift_version_continuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(DOT);
			setState(969);
			match(Decimal_digits);
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(970);
				swift_version_continuation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operating_systemContext extends ParserRuleContext {
		public TerminalNode MAC_OS() { return getToken(Swift5Parser.MAC_OS, 0); }
		public TerminalNode I_OS() { return getToken(Swift5Parser.I_OS, 0); }
		public TerminalNode OSX() { return getToken(Swift5Parser.OSX, 0); }
		public TerminalNode WATCH_OS() { return getToken(Swift5Parser.WATCH_OS, 0); }
		public TerminalNode TV_OS() { return getToken(Swift5Parser.TV_OS, 0); }
		public TerminalNode LINUX() { return getToken(Swift5Parser.LINUX, 0); }
		public TerminalNode WINDOWS() { return getToken(Swift5Parser.WINDOWS, 0); }
		public Operating_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operating_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperating_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperating_system(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperating_system(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operating_systemContext operating_system() throws RecognitionException {
		Operating_systemContext _localctx = new Operating_systemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operating_system);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (MAC_OS - 97)) | (1L << (I_OS - 97)) | (1L << (OSX - 97)) | (1L << (WATCH_OS - 97)) | (1L << (TV_OS - 97)) | (1L << (LINUX - 97)) | (1L << (WINDOWS - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public TerminalNode I386() { return getToken(Swift5Parser.I386, 0); }
		public TerminalNode X86_64() { return getToken(Swift5Parser.X86_64, 0); }
		public TerminalNode ARM() { return getToken(Swift5Parser.ARM, 0); }
		public TerminalNode ARM64() { return getToken(Swift5Parser.ARM64, 0); }
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArchitecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (I386 - 104)) | (1L << (X86_64 - 104)) | (1L << (ARM - 104)) | (1L << (ARM64 - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_module_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			identifier();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(978);
				match(DOT);
				setState(979);
				identifier();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnvironmentContext extends ParserRuleContext {
		public TerminalNode SIMULATOR() { return getToken(Swift5Parser.SIMULATOR, 0); }
		public TerminalNode MAC_CATALYST() { return getToken(Swift5Parser.MAC_CATALYST, 0); }
		public EnvironmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterEnvironment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitEnvironment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitEnvironment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvironmentContext environment() throws RecognitionException {
		EnvironmentContext _localctx = new EnvironmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_environment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(_la==SIMULATOR || _la==MAC_CATALYST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_control_statementContext extends ParserRuleContext {
		public TerminalNode SOURCE_LOCATION() { return getToken(Swift5Parser.SOURCE_LOCATION, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode FILE() { return getToken(Swift5Parser.FILE, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift5Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift5Parser.COLON, i);
		}
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift5Parser.COMMA, 0); }
		public TerminalNode LINE() { return getToken(Swift5Parser.LINE, 0); }
		public Line_numberContext line_number() {
			return getRuleContext(Line_numberContext.class,0);
		}
		public Line_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLine_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLine_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLine_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_control_statementContext line_control_statement() throws RecognitionException {
		Line_control_statementContext _localctx = new Line_control_statementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_line_control_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(SOURCE_LOCATION);
			setState(988);
			match(LPAREN);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(989);
				match(FILE);
				setState(990);
				match(COLON);
				setState(991);
				file_name();
				setState(992);
				match(COMMA);
				setState(993);
				match(LINE);
				setState(994);
				match(COLON);
				setState(995);
				line_number();
				}
			}

			setState(999);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_numberContext extends ParserRuleContext {
		public TerminalNode Decimal_literal() { return getToken(Swift5Parser.Decimal_literal, 0); }
		public Line_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLine_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLine_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLine_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_numberContext line_number() throws RecognitionException {
		Line_numberContext _localctx = new Line_numberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_line_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(Decimal_literal);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public Static_string_literalContext static_string_literal() {
			return getRuleContext(Static_string_literalContext.class,0);
		}
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFile_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFile_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_file_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			static_string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Diagnostic_statementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Diagnostic_messageContext diagnostic_message() {
			return getRuleContext(Diagnostic_messageContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode ERROR() { return getToken(Swift5Parser.ERROR, 0); }
		public TerminalNode WARNING() { return getToken(Swift5Parser.WARNING, 0); }
		public Diagnostic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnostic_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDiagnostic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDiagnostic_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDiagnostic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diagnostic_statementContext diagnostic_statement() throws RecognitionException {
		Diagnostic_statementContext _localctx = new Diagnostic_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_diagnostic_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_la = _input.LA(1);
			if ( !(_la==ERROR || _la==WARNING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1006);
			match(LPAREN);
			setState(1007);
			diagnostic_message();
			setState(1008);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Diagnostic_messageContext extends ParserRuleContext {
		public Static_string_literalContext static_string_literal() {
			return getRuleContext(Static_string_literalContext.class,0);
		}
		public Diagnostic_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnostic_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDiagnostic_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDiagnostic_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDiagnostic_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diagnostic_messageContext diagnostic_message() throws RecognitionException {
		Diagnostic_messageContext _localctx = new Diagnostic_messageContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_diagnostic_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			static_string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_conditionContext extends ParserRuleContext {
		public TerminalNode AVAILABLE() { return getToken(Swift5Parser.AVAILABLE, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Availability_argumentsContext availability_arguments() {
			return getRuleContext(Availability_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Availability_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAvailability_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAvailability_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAvailability_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_conditionContext availability_condition() throws RecognitionException {
		Availability_conditionContext _localctx = new Availability_conditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_availability_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(AVAILABLE);
			setState(1013);
			match(LPAREN);
			setState(1014);
			availability_arguments();
			setState(1015);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentsContext extends ParserRuleContext {
		public List<Availability_argumentContext> availability_argument() {
			return getRuleContexts(Availability_argumentContext.class);
		}
		public Availability_argumentContext availability_argument(int i) {
			return getRuleContext(Availability_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Availability_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAvailability_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAvailability_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAvailability_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentsContext availability_arguments() throws RecognitionException {
		Availability_argumentsContext _localctx = new Availability_argumentsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_availability_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			availability_argument();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1018);
				match(COMMA);
				setState(1019);
				availability_argument();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_argumentContext extends ParserRuleContext {
		public Platform_nameContext platform_name() {
			return getRuleContext(Platform_nameContext.class,0);
		}
		public Platform_versionContext platform_version() {
			return getRuleContext(Platform_versionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Swift5Parser.MUL, 0); }
		public Availability_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAvailability_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAvailability_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAvailability_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Availability_argumentContext availability_argument() throws RecognitionException {
		Availability_argumentContext _localctx = new Availability_argumentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_availability_argument);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				platform_name();
				setState(1026);
				platform_version();
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(MUL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Platform_nameContext extends ParserRuleContext {
		public TerminalNode I_OS() { return getToken(Swift5Parser.I_OS, 0); }
		public TerminalNode OSX() { return getToken(Swift5Parser.OSX, 0); }
		public TerminalNode I_OS_APPLICATION_EXTENSION() { return getToken(Swift5Parser.I_OS_APPLICATION_EXTENSION, 0); }
		public TerminalNode MAC_OS() { return getToken(Swift5Parser.MAC_OS, 0); }
		public TerminalNode MAC_OS_APPLICATION_EXTENSION() { return getToken(Swift5Parser.MAC_OS_APPLICATION_EXTENSION, 0); }
		public TerminalNode MAC_CATALYST() { return getToken(Swift5Parser.MAC_CATALYST, 0); }
		public TerminalNode MAC_CATALYST_APPLICATION_EXTENSION() { return getToken(Swift5Parser.MAC_CATALYST_APPLICATION_EXTENSION, 0); }
		public TerminalNode WATCH_OS() { return getToken(Swift5Parser.WATCH_OS, 0); }
		public TerminalNode TV_OS() { return getToken(Swift5Parser.TV_OS, 0); }
		public Platform_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPlatform_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPlatform_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPlatform_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_nameContext platform_name() throws RecognitionException {
		Platform_nameContext _localctx = new Platform_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_platform_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (MAC_OS - 97)) | (1L << (I_OS - 97)) | (1L << (OSX - 97)) | (1L << (WATCH_OS - 97)) | (1L << (TV_OS - 97)) | (1L << (MAC_CATALYST - 97)) | (1L << (I_OS_APPLICATION_EXTENSION - 97)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 97)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Platform_versionContext extends ParserRuleContext {
		public TerminalNode Decimal_literal() { return getToken(Swift5Parser.Decimal_literal, 0); }
		public TerminalNode Decimal_digits() { return getToken(Swift5Parser.Decimal_digits, 0); }
		public TerminalNode Floating_point_literal() { return getToken(Swift5Parser.Floating_point_literal, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Platform_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platform_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPlatform_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPlatform_version(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPlatform_version(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Platform_versionContext platform_version() throws RecognitionException {
		Platform_versionContext _localctx = new Platform_versionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_platform_version);
		int _la;
		try {
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				match(Decimal_literal);
				}
				break;
			case Decimal_digits:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				match(Decimal_digits);
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035);
				match(Floating_point_literal);
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(1036);
					match(DOT);
					setState(1037);
					match(Decimal_digits);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift5Parser.LT, 0); }
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift5Parser.GT, 0); }
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_generic_parameter_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(LT);
			setState(1043);
			generic_parameter_list();
			setState(1044);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_generic_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			generic_parameter();
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1047);
				match(COMMA);
				setState(1048);
				generic_parameter();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_generic_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			type_name();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1055);
				match(COLON);
				setState(1058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(1056);
					type_identifier();
					}
					break;
				case 2:
					{
					setState(1057);
					protocol_composition_type();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Swift5Parser.WHERE, 0); }
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Generic_where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_where_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_where_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_where_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_where_clauseContext generic_where_clause() throws RecognitionException {
		Generic_where_clauseContext _localctx = new Generic_where_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_generic_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(WHERE);
			setState(1063);
			requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_listContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRequirement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_requirement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			requirement();
			setState(1070);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1066);
					match(COMMA);
					setState(1067);
					requirement();
					}
					} 
				}
				setState(1072);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_requirement);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				same_type_requirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitConformance_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_conformance_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			type_identifier();
			setState(1078);
			match(COLON);
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(1079);
				type_identifier();
				}
				break;
			case 2:
				{
				setState(1080);
				protocol_composition_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Same_type_equalsContext same_type_equals() {
			return getRuleContext(Same_type_equalsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSame_type_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			type_identifier();
			setState(1084);
			same_type_equals();
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(1085);
				type_identifier();
				}
				break;
			case 2:
				{
				setState(1086);
				type(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift5Parser.LT, 0); }
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(Swift5Parser.GT, 0); }
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(LT);
			setState(1090);
			generic_argument_list();
			setState(1091);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			generic_argument();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1094);
				match(COMMA);
				setState(1095);
				generic_argument();
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGeneric_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Precedence_group_declarationContext precedence_group_declaration() {
			return getRuleContext(Precedence_group_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Swift5Parser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1103);
				import_declaration();
				}
				break;
			case 2:
				{
				setState(1104);
				constant_declaration();
				}
				break;
			case 3:
				{
				setState(1105);
				variable_declaration();
				}
				break;
			case 4:
				{
				setState(1106);
				typealias_declaration();
				}
				break;
			case 5:
				{
				setState(1107);
				function_declaration();
				}
				break;
			case 6:
				{
				setState(1108);
				enum_declaration();
				}
				break;
			case 7:
				{
				setState(1109);
				struct_declaration();
				}
				break;
			case 8:
				{
				setState(1110);
				class_declaration();
				}
				break;
			case 9:
				{
				setState(1111);
				protocol_declaration();
				}
				break;
			case 10:
				{
				setState(1112);
				initializer_declaration();
				}
				break;
			case 11:
				{
				setState(1113);
				deinitializer_declaration();
				}
				break;
			case 12:
				{
				setState(1114);
				extension_declaration();
				}
				break;
			case 13:
				{
				setState(1115);
				subscript_declaration();
				}
				break;
			case 14:
				{
				setState(1116);
				operator_declaration();
				}
				break;
			case 15:
				{
				setState(1117);
				precedence_group_declaration();
				}
				break;
			}
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1120);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1123);
				declaration();
				}
				}
				setState(1126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0) || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTop_level_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_top_level_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(1128);
				statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(LCURLY);
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(1132);
				statements();
				}
				break;
			}
			setState(1135);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Swift5Parser.IMPORT, 0); }
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitImport_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1137);
				attributes();
				}
			}

			setState(1140);
			match(IMPORT);
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(1141);
				import_kind();
				}
				break;
			}
			setState(1144);
			import_path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_kindContext extends ParserRuleContext {
		public TerminalNode TYPEALIAS() { return getToken(Swift5Parser.TYPEALIAS, 0); }
		public TerminalNode STRUCT() { return getToken(Swift5Parser.STRUCT, 0); }
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public TerminalNode ENUM() { return getToken(Swift5Parser.ENUM, 0); }
		public TerminalNode PROTOCOL() { return getToken(Swift5Parser.PROTOCOL, 0); }
		public TerminalNode LET() { return getToken(Swift5Parser.LET, 0); }
		public TerminalNode VAR() { return getToken(Swift5Parser.VAR, 0); }
		public TerminalNode FUNC() { return getToken(Swift5Parser.FUNC, 0); }
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitImport_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << TYPEALIAS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_pathContext extends ParserRuleContext {
		public List<Import_path_identifierContext> import_path_identifier() {
			return getRuleContexts(Import_path_identifierContext.class);
		}
		public Import_path_identifierContext import_path_identifier(int i) {
			return getRuleContext(Import_path_identifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitImport_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_import_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			import_path_identifier();
			setState(1153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1149);
					match(DOT);
					setState(1150);
					import_path_identifier();
					}
					} 
				}
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitImport_path_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_import_path_identifier);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ALPHA:
			case CATCH:
			case CLASS:
			case DEFAULT:
			case DO:
			case GUARD:
			case FOR:
			case IN:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case WHILE:
			case PROTOCOL:
			case GET:
			case SET:
			case WILL_SET:
			case DID_SET:
			case INDIRECT:
			case PREFIX:
			case INFIX:
			case LEFT:
			case RIGHT:
			case NONE:
			case PRECEDENCE_GROUP:
			case HIGHER_THAN:
			case LOWER_THAN:
			case ASSIGNMENT:
			case ASSOCIATIVITY:
			case POSTFIX:
			case OPERATOR:
			case OS:
			case ARCH:
			case SWIFT:
			case COMPILER:
			case CAN_IMPORT:
			case TARGET_ENVIRONMENT:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case WEAK:
			case UNOWNED:
			case SAFE:
			case UNSAFE:
			case MUTATING:
			case NONMUTATING:
			case RED:
			case BLUE:
			case GREEN:
			case RESOURCE_NAME:
			case SOME:
			case TYPE:
			case PRECEDENCE:
			case SELF:
			case SELF_BIG:
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case LINUX:
			case WINDOWS:
			case I386:
			case X86_64:
			case ARM:
			case ARM64:
			case SIMULATOR:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
			case FILE:
			case LINE:
			case GETTER:
			case SETTER:
			case Identifier:
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Swift5Parser.LET, 0); }
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1160);
				attributes();
				}
			}

			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0)) {
				{
				setState(1163);
				declaration_modifiers();
				}
			}

			setState(1166);
			match(LET);
			setState(1167);
			pattern_initializer_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPattern_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_pattern_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			pattern_initializer();
			setState(1174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1170);
					match(COMMA);
					setState(1171);
					pattern_initializer();
					}
					} 
				}
				setState(1176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPattern_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			pattern(0);
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1178);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(EQUAL);
			setState(1182);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			variable_declaration_head();
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(1185);
				variable_name();
				setState(1198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(1186);
					initializer();
					setState(1187);
					willSet_didSet_block();
					}
					break;
				case COLON:
					{
					setState(1189);
					type_annotation();
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(1190);
						getter_setter_block();
						}
						break;
					case 2:
						{
						setState(1191);
						getter_setter_keyword_block();
						}
						break;
					case 3:
						{
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EQUAL) {
							{
							setState(1192);
							initializer();
							}
						}

						setState(1195);
						willSet_didSet_block();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(1200);
				pattern_initializer_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Swift5Parser.VAR, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitVariable_declaration_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1203);
				attributes();
				}
			}

			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0)) {
				{
				setState(1206);
				declaration_modifiers();
				}
			}

			setState(1209);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGetter_setter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_getter_setter_block);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(LCURLY);
				setState(1221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(1214);
					getter_clause();
					setState(1216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SET - 31)) | (1L << (MUTATING - 31)) | (1L << (NONMUTATING - 31)))) != 0) || _la==AT) {
						{
						setState(1215);
						setter_clause();
						}
					}

					}
					break;
				case 2:
					{
					setState(1218);
					setter_clause();
					setState(1219);
					getter_clause();
					}
					break;
				}
				setState(1223);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_clauseContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(Swift5Parser.GET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1228);
				attributes();
				}
			}

			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTATING || _la==NONMUTATING) {
				{
				setState(1231);
				mutation_modifier();
				}
			}

			setState(1234);
			match(GET);
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(1235);
				code_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_clauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Swift5Parser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1238);
				attributes();
				}
			}

			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTATING || _la==NONMUTATING) {
				{
				setState(1241);
				mutation_modifier();
				}
			}

			setState(1244);
			match(SET);
			setState(1246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1245);
				setter_name();
				}
			}

			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(1248);
				code_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_nameContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSetter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(LPAREN);
			setState(1252);
			identifier();
			setState(1253);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGetter_setter_keyword_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_getter_setter_keyword_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(LCURLY);
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(1256);
				getter_keyword_clause();
				setState(1258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (SET - 31)) | (1L << (MUTATING - 31)) | (1L << (NONMUTATING - 31)))) != 0) || _la==AT) {
					{
					setState(1257);
					setter_keyword_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(1260);
				setter_keyword_clause();
				setState(1261);
				getter_keyword_clause();
				}
				break;
			}
			setState(1265);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(Swift5Parser.GET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitGetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1267);
				attributes();
				}
			}

			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTATING || _la==NONMUTATING) {
				{
				setState(1270);
				mutation_modifier();
				}
			}

			setState(1273);
			match(GET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(Swift5Parser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1275);
				attributes();
				}
			}

			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUTATING || _la==NONMUTATING) {
				{
				setState(1278);
				mutation_modifier();
				}
			}

			setState(1281);
			match(SET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWillSet_didSet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_willSet_didSet_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(LCURLY);
			setState(1292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(1284);
				willSet_clause();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DID_SET || _la==AT) {
					{
					setState(1285);
					didSet_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(1288);
				didSet_clause();
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILL_SET || _la==AT) {
					{
					setState(1289);
					willSet_clause();
					}
				}

				}
				break;
			}
			setState(1294);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_clauseContext extends ParserRuleContext {
		public TerminalNode WILL_SET() { return getToken(Swift5Parser.WILL_SET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWillSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1296);
				attributes();
				}
			}

			setState(1299);
			match(WILL_SET);
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1300);
				setter_name();
				}
			}

			setState(1303);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSet_clauseContext extends ParserRuleContext {
		public TerminalNode DID_SET() { return getToken(Swift5Parser.DID_SET, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDidSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1305);
				attributes();
				}
			}

			setState(1308);
			match(DID_SET);
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1309);
				setter_name();
				}
			}

			setState(1312);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_declarationContext extends ParserRuleContext {
		public TerminalNode TYPEALIAS() { return getToken(Swift5Parser.TYPEALIAS, 0); }
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTypealias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typealias_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1314);
				attributes();
				}
			}

			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1317);
				access_level_modifier();
				}
			}

			setState(1320);
			match(TYPEALIAS);
			setState(1321);
			typealias_name();
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1322);
				generic_parameter_clause();
				}
			}

			setState(1325);
			typealias_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTypealias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTypealias_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(EQUAL);
			setState(1330);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			function_head();
			setState(1333);
			function_name();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1334);
				generic_parameter_clause();
				}
			}

			setState(1337);
			function_signature();
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1338);
				generic_where_clause();
				}
				break;
			}
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1341);
				function_body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(Swift5Parser.FUNC, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1344);
				attributes();
				}
			}

			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0)) {
				{
				setState(1347);
				declaration_modifiers();
				}
			}

			setState(1350);
			match(FUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_function_name);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ALPHA:
			case CATCH:
			case CLASS:
			case DEFAULT:
			case DO:
			case GUARD:
			case FOR:
			case IN:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case WHILE:
			case PROTOCOL:
			case GET:
			case SET:
			case WILL_SET:
			case DID_SET:
			case INDIRECT:
			case PREFIX:
			case INFIX:
			case LEFT:
			case RIGHT:
			case NONE:
			case PRECEDENCE_GROUP:
			case HIGHER_THAN:
			case LOWER_THAN:
			case ASSIGNMENT:
			case ASSOCIATIVITY:
			case POSTFIX:
			case OPERATOR:
			case OS:
			case ARCH:
			case SWIFT:
			case COMPILER:
			case CAN_IMPORT:
			case TARGET_ENVIRONMENT:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case WEAK:
			case UNOWNED:
			case SAFE:
			case UNSAFE:
			case MUTATING:
			case NONMUTATING:
			case RED:
			case BLUE:
			case GREEN:
			case RESOURCE_NAME:
			case SOME:
			case TYPE:
			case PRECEDENCE:
			case SELF:
			case SELF_BIG:
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case LINUX:
			case WINDOWS:
			case I386:
			case X86_64:
			case ARM:
			case ARM64:
			case SIMULATOR:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
			case FILE:
			case LINE:
			case GETTER:
			case SETTER:
			case Identifier:
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				identifier();
				}
				break;
			case DOT:
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public TerminalNode RETHROWS() { return getToken(Swift5Parser.RETHROWS, 0); }
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_function_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			parameter_clause();
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1357);
					match(THROWS);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1360);
				match(RETHROWS);
				}
				break;
			}
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1363);
				function_result();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_function_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			arrow_operator();
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1367);
				attributes();
				}
				break;
			}
			setState(1370);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitParameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(LPAREN);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (AT - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
				{
				setState(1375);
				parameter_list();
				}
			}

			setState(1378);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			parameter();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1381);
				match(COMMA);
				setState(1382);
				parameter();
				}
				}
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1388);
				attributes();
				}
			}

			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1391);
				external_parameter_name();
				}
				break;
			}
			setState(1394);
			local_parameter_name();
			setState(1395);
			type_annotation();
			setState(1400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1396);
					default_argument_clause();
					}
				}

				}
				break;
			case 2:
				{
				setState(1399);
				range_operator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExternal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExternal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExternal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_external_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLocal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_local_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDefault_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(EQUAL);
			setState(1407);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1409);
				attributes();
				}
			}

			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1412);
				access_level_modifier();
				}
			}

			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1415);
				union_style_enum();
				}
				break;
			case 2:
				{
				setState(1416);
				raw_value_style_enum();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Swift5Parser.ENUM, 0); }
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public TerminalNode INDIRECT() { return getToken(Swift5Parser.INDIRECT, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(1419);
				match(INDIRECT);
				}
			}

			setState(1422);
			match(ENUM);
			setState(1423);
			enum_name();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1424);
				generic_parameter_clause();
				}
			}

			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1427);
				type_inheritance_clause();
				}
			}

			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1430);
				generic_where_clause();
				}
			}

			setState(1433);
			match(LCURLY);
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT) {
				{
				setState(1434);
				union_style_enum_members();
				}
			}

			setState(1437);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public List<Union_style_enum_memberContext> union_style_enum_member() {
			return getRuleContexts(Union_style_enum_memberContext.class);
		}
		public Union_style_enum_memberContext union_style_enum_member(int i) {
			return getRuleContext(Union_style_enum_memberContext.class,i);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1439);
				union_style_enum_member();
				}
				}
				setState(1442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_union_style_enum_member);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				union_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode INDIRECT() { return getToken(Swift5Parser.INDIRECT, 0); }
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1449);
				attributes();
				}
			}

			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDIRECT) {
				{
				setState(1452);
				match(INDIRECT);
				}
			}

			setState(1455);
			match(CASE);
			setState(1456);
			union_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public List<Union_style_enum_caseContext> union_style_enum_case() {
			return getRuleContexts(Union_style_enum_caseContext.class);
		}
		public Union_style_enum_caseContext union_style_enum_case(int i) {
			return getRuleContext(Union_style_enum_caseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_union_style_enum_case_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			union_style_enum_case();
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1459);
				match(COMMA);
				setState(1460);
				union_style_enum_case();
				}
				}
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Opaque_typeContext opaque_type() {
			return getRuleContext(Opaque_typeContext.class,0);
		}
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnion_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_union_style_enum_case);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				opaque_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				enum_case_name();
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1468);
					tuple_type();
					}
					break;
				case 2:
					{
					setState(1469);
					match(LPAREN);
					setState(1470);
					type(0);
					setState(1471);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitEnum_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Swift5Parser.ENUM, 0); }
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(ENUM);
			setState(1482);
			enum_name();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1483);
				generic_parameter_clause();
				}
			}

			setState(1486);
			type_inheritance_clause();
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1487);
				generic_where_clause();
				}
			}

			setState(1490);
			match(LCURLY);
			setState(1491);
			raw_value_style_enum_members();
			setState(1492);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public List<Raw_value_style_enum_memberContext> raw_value_style_enum_member() {
			return getRuleContexts(Raw_value_style_enum_memberContext.class);
		}
		public Raw_value_style_enum_memberContext raw_value_style_enum_member(int i) {
			return getRuleContext(Raw_value_style_enum_memberContext.class,i);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1494);
				raw_value_style_enum_member();
				}
				}
				setState(1497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASE) | (1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_raw_value_style_enum_member);
		try {
			setState(1502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				raw_value_style_enum_case_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				compiler_control_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1504);
				attributes();
				}
			}

			setState(1507);
			match(CASE);
			setState(1508);
			raw_value_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public List<Raw_value_style_enum_caseContext> raw_value_style_enum_case() {
			return getRuleContexts(Raw_value_style_enum_caseContext.class);
		}
		public Raw_value_style_enum_caseContext raw_value_style_enum_case(int i) {
			return getRuleContext(Raw_value_style_enum_caseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_raw_value_style_enum_case_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			raw_value_style_enum_case();
			setState(1515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1511);
				match(COMMA);
				setState(1512);
				raw_value_style_enum_case();
				}
				}
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_raw_value_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			enum_case_name();
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1519);
				raw_value_assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public Raw_value_literalContext raw_value_literal() {
			return getRuleContext(Raw_value_literalContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(EQUAL);
			setState(1523);
			raw_value_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_literalContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Static_string_literalContext static_string_literal() {
			return getRuleContext(Static_string_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Raw_value_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRaw_value_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRaw_value_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRaw_value_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_literalContext raw_value_literal() throws RecognitionException {
		Raw_value_literalContext _localctx = new Raw_value_literalContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_raw_value_literal);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				static_string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1527);
				boolean_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(Swift5Parser.STRUCT, 0); }
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1530);
				attributes();
				}
			}

			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1533);
				access_level_modifier();
				}
			}

			setState(1536);
			match(STRUCT);
			setState(1537);
			struct_name();
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1538);
				generic_parameter_clause();
				}
			}

			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1541);
				type_inheritance_clause();
				}
			}

			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1544);
				generic_where_clause();
				}
			}

			setState(1547);
			struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public Struct_membersContext struct_members() {
			return getRuleContext(Struct_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_struct_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(LCURLY);
			setState(1552);
			struct_members();
			setState(1553);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_membersContext extends ParserRuleContext {
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStruct_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStruct_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStruct_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_membersContext struct_members() throws RecognitionException {
		Struct_membersContext _localctx = new Struct_membersContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_struct_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT) {
				{
				{
				setState(1555);
				struct_member();
				}
				}
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStruct_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStruct_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStruct_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_struct_member);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
			case FUNC:
			case IMPORT:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case LET:
			case VAR:
			case PROTOCOL:
			case STRUCT:
			case INDIRECT:
			case INIT:
			case DEINIT:
			case EXTENSION:
			case SUBSCRIPT:
			case PREFIX:
			case INFIX:
			case PRECEDENCE_GROUP:
			case POSTFIX:
			case TYPEALIAS:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case STATIC:
			case WEAK:
			case UNOWNED:
			case MUTATING:
			case NONMUTATING:
			case FILE_PRIVATE:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				declaration();
				}
				break;
			case SOURCE_LOCATION:
			case ERROR:
			case WARNING:
			case HASH_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(Swift5Parser.FINAL, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1565);
				attributes();
				}
			}

			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
					{
					setState(1568);
					access_level_modifier();
					}
				}

				setState(1572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINAL) {
					{
					setState(1571);
					match(FINAL);
					}
				}

				}
				break;
			case 2:
				{
				setState(1574);
				match(FINAL);
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
					{
					setState(1575);
					access_level_modifier();
					}
				}

				}
				break;
			}
			setState(1580);
			match(CLASS);
			setState(1581);
			class_name();
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1582);
				generic_parameter_clause();
				}
			}

			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1585);
				type_inheritance_clause();
				}
			}

			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1588);
				generic_where_clause();
				}
			}

			setState(1591);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public Class_membersContext class_members() {
			return getRuleContext(Class_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(LCURLY);
			setState(1596);
			class_members();
			setState(1597);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_membersContext extends ParserRuleContext {
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClass_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClass_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClass_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_membersContext class_members() throws RecognitionException {
		Class_membersContext _localctx = new Class_membersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_class_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT) {
				{
				{
				setState(1599);
				class_member();
				}
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_class_member);
		try {
			setState(1607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
			case FUNC:
			case IMPORT:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case LET:
			case VAR:
			case PROTOCOL:
			case STRUCT:
			case INDIRECT:
			case INIT:
			case DEINIT:
			case EXTENSION:
			case SUBSCRIPT:
			case PREFIX:
			case INFIX:
			case PRECEDENCE_GROUP:
			case POSTFIX:
			case TYPEALIAS:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case STATIC:
			case WEAK:
			case UNOWNED:
			case MUTATING:
			case NONMUTATING:
			case FILE_PRIVATE:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				declaration();
				}
				break;
			case SOURCE_LOCATION:
			case ERROR:
			case WARNING:
			case HASH_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public TerminalNode PROTOCOL() { return getToken(Swift5Parser.PROTOCOL, 0); }
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1609);
				attributes();
				}
			}

			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1612);
				access_level_modifier();
				}
			}

			setState(1615);
			match(PROTOCOL);
			setState(1616);
			protocol_name();
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1617);
				match(COLON);
				setState(1618);
				match(CLASS);
				}
				break;
			case 2:
				{
				setState(1619);
				type_inheritance_clause();
				}
				break;
			}
			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1622);
				generic_where_clause();
				}
			}

			setState(1625);
			protocol_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public Protocol_membersContext protocol_members() {
			return getRuleContext(Protocol_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_protocol_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(LCURLY);
			setState(1630);
			protocol_members();
			setState(1631);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_membersContext extends ParserRuleContext {
		public List<Protocol_memberContext> protocol_member() {
			return getRuleContexts(Protocol_memberContext.class);
		}
		public Protocol_memberContext protocol_member(int i) {
			return getRuleContext(Protocol_memberContext.class,i);
		}
		public Protocol_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_membersContext protocol_members() throws RecognitionException {
		Protocol_membersContext _localctx = new Protocol_membersContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_protocol_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FUNC) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << VAR) | (1L << INIT) | (1L << ASSOCIATED_TYPE) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT) {
				{
				{
				setState(1633);
				protocol_member();
				}
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_memberContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Protocol_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_memberContext protocol_member() throws RecognitionException {
		Protocol_memberContext _localctx = new Protocol_memberContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_protocol_member);
		try {
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case FUNC:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case VAR:
			case INIT:
			case ASSOCIATED_TYPE:
			case SUBSCRIPT:
			case PREFIX:
			case INFIX:
			case POSTFIX:
			case TYPEALIAS:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case STATIC:
			case WEAK:
			case UNOWNED:
			case MUTATING:
			case NONMUTATING:
			case FILE_PRIVATE:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				protocol_member_declaration();
				}
				break;
			case SOURCE_LOCATION:
			case ERROR:
			case WARNING:
			case HASH_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_protocol_member_declaration);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1647);
				protocol_associated_type_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1648);
				typealias_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_property_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			variable_declaration_head();
			setState(1652);
			variable_name();
			setState(1653);
			type_annotation();
			setState(1654);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			function_head();
			setState(1657);
			function_name();
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1658);
				generic_parameter_clause();
				}
			}

			setState(1661);
			function_signature();
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1662);
				generic_where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public TerminalNode RETHROWS() { return getToken(Swift5Parser.RETHROWS, 0); }
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_initializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_protocol_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			initializer_head();
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1666);
				generic_parameter_clause();
				}
			}

			setState(1669);
			parameter_clause();
			setState(1674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case FUNC:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case VAR:
			case THROWS:
			case INIT:
			case ASSOCIATED_TYPE:
			case SUBSCRIPT:
			case PREFIX:
			case INFIX:
			case POSTFIX:
			case TYPEALIAS:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case STATIC:
			case WEAK:
			case UNOWNED:
			case MUTATING:
			case NONMUTATING:
			case FILE_PRIVATE:
			case SOURCE_LOCATION:
			case ERROR:
			case WARNING:
			case HASH_IF:
			case RCURLY:
			case AT:
				{
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1670);
					match(THROWS);
					}
				}

				}
				break;
			case RETHROWS:
				{
				setState(1673);
				match(RETHROWS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1676);
				generic_where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_subscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_protocol_subscript_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			subscript_head();
			setState(1680);
			subscript_result();
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1681);
				generic_where_clause();
				}
			}

			setState(1684);
			getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public TerminalNode ASSOCIATED_TYPE() { return getToken(Swift5Parser.ASSOCIATED_TYPE, 0); }
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_associated_type_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1686);
				attributes();
				}
			}

			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1689);
				access_level_modifier();
				}
			}

			setState(1692);
			match(ASSOCIATED_TYPE);
			setState(1693);
			typealias_name();
			setState(1695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1694);
				type_inheritance_clause();
				}
			}

			setState(1698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1697);
				typealias_assignment();
				}
			}

			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1700);
				generic_where_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public TerminalNode RETHROWS() { return getToken(Swift5Parser.RETHROWS, 0); }
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			initializer_head();
			setState(1705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1704);
				generic_parameter_clause();
				}
			}

			setState(1707);
			parameter_clause();
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS || _la==RETHROWS) {
				{
				setState(1708);
				_la = _input.LA(1);
				if ( !(_la==THROWS || _la==RETHROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1711);
				generic_where_clause();
				}
			}

			setState(1714);
			initializer_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_headContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(Swift5Parser.INIT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInitializer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_initializer_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1716);
				attributes();
				}
			}

			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0)) {
				{
				setState(1719);
				declaration_modifiers();
				}
			}

			setState(1722);
			match(INIT);
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BANG || _la==QUESTION) {
				{
				setState(1723);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==QUESTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInitializer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public TerminalNode DEINIT() { return getToken(Swift5Parser.DEINIT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDeinitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1728);
				attributes();
				}
			}

			setState(1731);
			match(DEINIT);
			setState(1732);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_declarationContext extends ParserRuleContext {
		public TerminalNode EXTENSION() { return getToken(Swift5Parser.EXTENSION, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExtension_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1734);
				attributes();
				}
			}

			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) {
				{
				setState(1737);
				access_level_modifier();
				}
			}

			setState(1740);
			match(EXTENSION);
			setState(1741);
			type_identifier();
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1742);
				type_inheritance_clause();
				}
			}

			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1745);
				generic_where_clause();
				}
			}

			setState(1748);
			extension_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_bodyContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public Extension_membersContext extension_members() {
			return getRuleContext(Extension_membersContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExtension_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_extension_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(LCURLY);
			setState(1751);
			extension_members();
			setState(1752);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_membersContext extends ParserRuleContext {
		public List<Extension_memberContext> extension_member() {
			return getRuleContexts(Extension_memberContext.class);
		}
		public Extension_memberContext extension_member(int i) {
			return getRuleContext(Extension_memberContext.class,i);
		}
		public Extension_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExtension_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExtension_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExtension_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_membersContext extension_members() throws RecognitionException {
		Extension_membersContext _localctx = new Extension_membersContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_extension_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << FUNC) | (1L << IMPORT) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << STRUCT) | (1L << INDIRECT) | (1L << INIT) | (1L << DEINIT) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << PREFIX) | (1L << INFIX) | (1L << PRECEDENCE_GROUP) | (1L << POSTFIX) | (1L << TYPEALIAS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)) | (1L << (SOURCE_LOCATION - 66)) | (1L << (ERROR - 66)) | (1L << (WARNING - 66)) | (1L << (HASH_IF - 66)))) != 0) || _la==AT) {
				{
				{
				setState(1754);
				extension_member();
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Compiler_control_statementContext compiler_control_statement() {
			return getRuleContext(Compiler_control_statementContext.class,0);
		}
		public Extension_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExtension_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExtension_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExtension_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_memberContext extension_member() throws RecognitionException {
		Extension_memberContext _localctx = new Extension_memberContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_extension_member);
		try {
			setState(1762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
			case FUNC:
			case IMPORT:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case LET:
			case VAR:
			case PROTOCOL:
			case STRUCT:
			case INDIRECT:
			case INIT:
			case DEINIT:
			case EXTENSION:
			case SUBSCRIPT:
			case PREFIX:
			case INFIX:
			case PRECEDENCE_GROUP:
			case POSTFIX:
			case TYPEALIAS:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case STATIC:
			case WEAK:
			case UNOWNED:
			case MUTATING:
			case NONMUTATING:
			case FILE_PRIVATE:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760);
				declaration();
				}
				break;
			case SOURCE_LOCATION:
			case ERROR:
			case WARNING:
			case HASH_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761);
				compiler_control_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Generic_where_clauseContext generic_where_clause() {
			return getRuleContext(Generic_where_clauseContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSubscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_subscript_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			subscript_head();
			setState(1765);
			subscript_result();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1766);
				generic_where_clause();
				}
			}

			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1769);
				code_block();
				}
				break;
			case 2:
				{
				setState(1770);
				getter_setter_block();
				}
				break;
			case 3:
				{
				setState(1771);
				getter_setter_keyword_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_headContext extends ParserRuleContext {
		public TerminalNode SUBSCRIPT() { return getToken(Swift5Parser.SUBSCRIPT, 0); }
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSubscript_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1774);
				attributes();
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0)) {
				{
				setState(1777);
				declaration_modifiers();
				}
			}

			setState(1780);
			match(SUBSCRIPT);
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1781);
				generic_parameter_clause();
				}
			}

			setState(1784);
			parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_resultContext extends ParserRuleContext {
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSubscript_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_subscript_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			arrow_operator();
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1787);
				attributes();
				}
				break;
			}
			setState(1790);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_operator_declaration);
		try {
			setState(1795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1792);
				prefix_operator_declaration();
				}
				break;
			case POSTFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
				postfix_operator_declaration();
				}
				break;
			case INFIX:
				enterOuterAlt(_localctx, 3);
				{
				setState(1794);
				infix_operator_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public TerminalNode PREFIX() { return getToken(Swift5Parser.PREFIX, 0); }
		public TerminalNode OPERATOR() { return getToken(Swift5Parser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrefix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			match(PREFIX);
			setState(1798);
			match(OPERATOR);
			setState(1799);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public TerminalNode POSTFIX() { return getToken(Swift5Parser.POSTFIX, 0); }
		public TerminalNode OPERATOR() { return getToken(Swift5Parser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPostfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(POSTFIX);
			setState(1802);
			match(OPERATOR);
			setState(1803);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public TerminalNode INFIX() { return getToken(Swift5Parser.INFIX, 0); }
		public TerminalNode OPERATOR() { return getToken(Swift5Parser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Infix_operator_groupContext infix_operator_group() {
			return getRuleContext(Infix_operator_groupContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(INFIX);
			setState(1806);
			match(OPERATOR);
			setState(1807);
			operator();
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1808);
				infix_operator_group();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_groupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public Infix_operator_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInfix_operator_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInfix_operator_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInfix_operator_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_groupContext infix_operator_group() throws RecognitionException {
		Infix_operator_groupContext _localctx = new Infix_operator_groupContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_infix_operator_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(COLON);
			setState(1812);
			precedence_group_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_declarationContext extends ParserRuleContext {
		public TerminalNode PRECEDENCE_GROUP() { return getToken(Swift5Parser.PRECEDENCE_GROUP, 0); }
		public Precedence_group_nameContext precedence_group_name() {
			return getRuleContext(Precedence_group_nameContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Precedence_group_attributesContext precedence_group_attributes() {
			return getRuleContext(Precedence_group_attributesContext.class,0);
		}
		public Precedence_group_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_declarationContext precedence_group_declaration() throws RecognitionException {
		Precedence_group_declarationContext _localctx = new Precedence_group_declarationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_precedence_group_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(PRECEDENCE_GROUP);
			setState(1815);
			precedence_group_name();
			setState(1816);
			match(LCURLY);
			setState(1818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY))) != 0)) {
				{
				setState(1817);
				precedence_group_attributes();
				}
			}

			setState(1820);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_attributesContext extends ParserRuleContext {
		public List<Precedence_group_attributeContext> precedence_group_attribute() {
			return getRuleContexts(Precedence_group_attributeContext.class);
		}
		public Precedence_group_attributeContext precedence_group_attribute(int i) {
			return getRuleContext(Precedence_group_attributeContext.class,i);
		}
		public Precedence_group_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_attributesContext precedence_group_attributes() throws RecognitionException {
		Precedence_group_attributesContext _localctx = new Precedence_group_attributesContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_precedence_group_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1822);
				precedence_group_attribute();
				}
				}
				setState(1825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_attributeContext extends ParserRuleContext {
		public Precedence_group_relationContext precedence_group_relation() {
			return getRuleContext(Precedence_group_relationContext.class,0);
		}
		public Precedence_group_assignmentContext precedence_group_assignment() {
			return getRuleContext(Precedence_group_assignmentContext.class,0);
		}
		public Precedence_group_associativityContext precedence_group_associativity() {
			return getRuleContext(Precedence_group_associativityContext.class,0);
		}
		public Precedence_group_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_attributeContext precedence_group_attribute() throws RecognitionException {
		Precedence_group_attributeContext _localctx = new Precedence_group_attributeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_precedence_group_attribute);
		try {
			setState(1830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIGHER_THAN:
			case LOWER_THAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				precedence_group_relation();
				}
				break;
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1828);
				precedence_group_assignment();
				}
				break;
			case ASSOCIATIVITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1829);
				precedence_group_associativity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_relationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Precedence_group_namesContext precedence_group_names() {
			return getRuleContext(Precedence_group_namesContext.class,0);
		}
		public TerminalNode HIGHER_THAN() { return getToken(Swift5Parser.HIGHER_THAN, 0); }
		public TerminalNode LOWER_THAN() { return getToken(Swift5Parser.LOWER_THAN, 0); }
		public Precedence_group_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_relationContext precedence_group_relation() throws RecognitionException {
		Precedence_group_relationContext _localctx = new Precedence_group_relationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_precedence_group_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			_la = _input.LA(1);
			if ( !(_la==HIGHER_THAN || _la==LOWER_THAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1833);
			match(COLON);
			setState(1834);
			precedence_group_names();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(Swift5Parser.ASSIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Precedence_group_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_assignmentContext precedence_group_assignment() throws RecognitionException {
		Precedence_group_assignmentContext _localctx = new Precedence_group_assignmentContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_precedence_group_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(ASSIGNMENT);
			setState(1837);
			match(COLON);
			setState(1838);
			boolean_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_associativityContext extends ParserRuleContext {
		public TerminalNode ASSOCIATIVITY() { return getToken(Swift5Parser.ASSOCIATIVITY, 0); }
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TerminalNode LEFT() { return getToken(Swift5Parser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(Swift5Parser.RIGHT, 0); }
		public TerminalNode NONE() { return getToken(Swift5Parser.NONE, 0); }
		public Precedence_group_associativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_associativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_associativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_associativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_associativityContext precedence_group_associativity() throws RecognitionException {
		Precedence_group_associativityContext _localctx = new Precedence_group_associativityContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_precedence_group_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(ASSOCIATIVITY);
			setState(1841);
			match(COLON);
			setState(1842);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << NONE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_namesContext extends ParserRuleContext {
		public List<Precedence_group_nameContext> precedence_group_name() {
			return getRuleContexts(Precedence_group_nameContext.class);
		}
		public Precedence_group_nameContext precedence_group_name(int i) {
			return getRuleContext(Precedence_group_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Precedence_group_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_namesContext precedence_group_names() throws RecognitionException {
		Precedence_group_namesContext _localctx = new Precedence_group_namesContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_precedence_group_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			precedence_group_name();
			setState(1849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1845);
				match(COMMA);
				setState(1846);
				precedence_group_name();
				}
				}
				setState(1851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_group_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Precedence_group_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_group_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrecedence_group_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrecedence_group_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrecedence_group_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_group_nameContext precedence_group_name() throws RecognitionException {
		Precedence_group_nameContext _localctx = new Precedence_group_nameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_precedence_group_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			identifier();
			setState(1857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1853);
					match(DOT);
					setState(1854);
					identifier();
					}
					} 
				}
				setState(1859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifierContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public TerminalNode CONVENIENCE() { return getToken(Swift5Parser.CONVENIENCE, 0); }
		public TerminalNode DYNAMIC() { return getToken(Swift5Parser.DYNAMIC, 0); }
		public TerminalNode FINAL() { return getToken(Swift5Parser.FINAL, 0); }
		public TerminalNode INFIX() { return getToken(Swift5Parser.INFIX, 0); }
		public TerminalNode LAZY() { return getToken(Swift5Parser.LAZY, 0); }
		public TerminalNode OPTIONAL() { return getToken(Swift5Parser.OPTIONAL, 0); }
		public TerminalNode OVERRIDE() { return getToken(Swift5Parser.OVERRIDE, 0); }
		public TerminalNode POSTFIX() { return getToken(Swift5Parser.POSTFIX, 0); }
		public TerminalNode PREFIX() { return getToken(Swift5Parser.PREFIX, 0); }
		public TerminalNode REQUIRED() { return getToken(Swift5Parser.REQUIRED, 0); }
		public TerminalNode STATIC() { return getToken(Swift5Parser.STATIC, 0); }
		public TerminalNode UNOWNED() { return getToken(Swift5Parser.UNOWNED, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode SAFE() { return getToken(Swift5Parser.SAFE, 0); }
		public TerminalNode UNSAFE() { return getToken(Swift5Parser.UNSAFE, 0); }
		public TerminalNode WEAK() { return getToken(Swift5Parser.WEAK, 0); }
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Mutation_modifierContext mutation_modifier() {
			return getRuleContext(Mutation_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDeclaration_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDeclaration_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDeclaration_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_declaration_modifier);
		int _la;
		try {
			setState(1881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1860);
				match(CLASS);
				}
				break;
			case CONVENIENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				match(CONVENIENCE);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1862);
				match(DYNAMIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1863);
				match(FINAL);
				}
				break;
			case INFIX:
				enterOuterAlt(_localctx, 5);
				{
				setState(1864);
				match(INFIX);
				}
				break;
			case LAZY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1865);
				match(LAZY);
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1866);
				match(OPTIONAL);
				}
				break;
			case OVERRIDE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1867);
				match(OVERRIDE);
				}
				break;
			case POSTFIX:
				enterOuterAlt(_localctx, 9);
				{
				setState(1868);
				match(POSTFIX);
				}
				break;
			case PREFIX:
				enterOuterAlt(_localctx, 10);
				{
				setState(1869);
				match(PREFIX);
				}
				break;
			case REQUIRED:
				enterOuterAlt(_localctx, 11);
				{
				setState(1870);
				match(REQUIRED);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(1871);
				match(STATIC);
				}
				break;
			case UNOWNED:
				enterOuterAlt(_localctx, 13);
				{
				setState(1872);
				match(UNOWNED);
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1873);
					match(LPAREN);
					setState(1874);
					_la = _input.LA(1);
					if ( !(_la==SAFE || _la==UNSAFE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1875);
					match(RPAREN);
					}
				}

				}
				break;
			case WEAK:
				enterOuterAlt(_localctx, 14);
				{
				setState(1878);
				match(WEAK);
				}
				break;
			case INTERNAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case FILE_PRIVATE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1879);
				access_level_modifier();
				}
				break;
			case MUTATING:
			case NONMUTATING:
				enterOuterAlt(_localctx, 16);
				{
				setState(1880);
				mutation_modifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public List<Declaration_modifierContext> declaration_modifier() {
			return getRuleContexts(Declaration_modifierContext.class);
		}
		public Declaration_modifierContext declaration_modifier(int i) {
			return getRuleContext(Declaration_modifierContext.class,i);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDeclaration_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDeclaration_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDeclaration_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1883);
				declaration_modifier();
				}
				}
				setState(1886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << PREFIX) | (1L << INFIX) | (1L << POSTFIX))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CONVENIENCE - 66)) | (1L << (DYNAMIC - 66)) | (1L << (LAZY - 66)) | (1L << (OPTIONAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (REQUIRED - 66)) | (1L << (STATIC - 66)) | (1L << (WEAK - 66)) | (1L << (UNOWNED - 66)) | (1L << (MUTATING - 66)) | (1L << (NONMUTATING - 66)) | (1L << (FILE_PRIVATE - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_level_modifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(Swift5Parser.PRIVATE, 0); }
		public TerminalNode FILE_PRIVATE() { return getToken(Swift5Parser.FILE_PRIVATE, 0); }
		public TerminalNode INTERNAL() { return getToken(Swift5Parser.INTERNAL, 0); }
		public TerminalNode PUBLIC() { return getToken(Swift5Parser.PUBLIC, 0); }
		public TerminalNode OPEN() { return getToken(Swift5Parser.OPEN, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode SET() { return getToken(Swift5Parser.SET, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAccess_level_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAccess_level_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAccess_level_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_access_level_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (INTERNAL - 20)) | (1L << (OPEN - 20)) | (1L << (PRIVATE - 20)) | (1L << (PUBLIC - 20)) | (1L << (FILE_PRIVATE - 20)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1889);
				match(LPAREN);
				setState(1890);
				match(SET);
				setState(1891);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mutation_modifierContext extends ParserRuleContext {
		public TerminalNode MUTATING() { return getToken(Swift5Parser.MUTATING, 0); }
		public TerminalNode NONMUTATING() { return getToken(Swift5Parser.NONMUTATING, 0); }
		public Mutation_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutation_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterMutation_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitMutation_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitMutation_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mutation_modifierContext mutation_modifier() throws RecognitionException {
		Mutation_modifierContext _localctx = new Mutation_modifierContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_mutation_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			_la = _input.LA(1);
			if ( !(_la==MUTATING || _la==NONMUTATING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Optional_patternContext optional_pattern() {
			return getRuleContext(Optional_patternContext.class,0);
		}
		public TerminalNode IS() { return getToken(Swift5Parser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode AS() { return getToken(Swift5Parser.AS, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 368;
		enterRecursionRule(_localctx, 368, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1900);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(1897);
					wildcard_pattern();
					}
					break;
				case AS:
				case ALPHA:
				case CATCH:
				case CLASS:
				case DEFAULT:
				case DO:
				case GUARD:
				case FOR:
				case IN:
				case INTERNAL:
				case FINAL:
				case OPEN:
				case PRIVATE:
				case PUBLIC:
				case WHERE:
				case WHILE:
				case PROTOCOL:
				case GET:
				case SET:
				case WILL_SET:
				case DID_SET:
				case INDIRECT:
				case PREFIX:
				case INFIX:
				case LEFT:
				case RIGHT:
				case NONE:
				case PRECEDENCE_GROUP:
				case HIGHER_THAN:
				case LOWER_THAN:
				case ASSIGNMENT:
				case ASSOCIATIVITY:
				case POSTFIX:
				case OPERATOR:
				case OS:
				case ARCH:
				case SWIFT:
				case COMPILER:
				case CAN_IMPORT:
				case TARGET_ENVIRONMENT:
				case CONVENIENCE:
				case DYNAMIC:
				case LAZY:
				case OPTIONAL:
				case OVERRIDE:
				case REQUIRED:
				case WEAK:
				case UNOWNED:
				case SAFE:
				case UNSAFE:
				case MUTATING:
				case NONMUTATING:
				case RED:
				case BLUE:
				case GREEN:
				case RESOURCE_NAME:
				case SOME:
				case TYPE:
				case PRECEDENCE:
				case SELF:
				case SELF_BIG:
				case MAC_OS:
				case I_OS:
				case OSX:
				case WATCH_OS:
				case TV_OS:
				case LINUX:
				case WINDOWS:
				case I386:
				case X86_64:
				case ARM:
				case ARM64:
				case SIMULATOR:
				case MAC_CATALYST:
				case I_OS_APPLICATION_EXTENSION:
				case MAC_CATALYST_APPLICATION_EXTENSION:
				case MAC_OS_APPLICATION_EXTENSION:
				case FILE:
				case LINE:
				case GETTER:
				case SETTER:
				case Identifier:
				case BACKTICK:
					{
					setState(1898);
					identifier_pattern();
					}
					break;
				case LPAREN:
					{
					setState(1899);
					tuple_pattern();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1902);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1905);
				value_binding_pattern();
				}
				break;
			case 3:
				{
				setState(1906);
				enum_case_pattern();
				}
				break;
			case 4:
				{
				setState(1907);
				optional_pattern();
				}
				break;
			case 5:
				{
				setState(1908);
				match(IS);
				setState(1909);
				type(0);
				}
				break;
			case 6:
				{
				setState(1910);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1913);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1914);
					match(AS);
					setState(1915);
					type(0);
					}
					} 
				}
				setState(1920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift5Parser.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIdentifier_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_binding_patternContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Swift5Parser.VAR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode LET() { return getToken(Swift5Parser.LET, 0); }
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitValue_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_value_binding_pattern);
		try {
			setState(1929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1925);
				match(VAR);
				setState(1926);
				pattern(0);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				match(LET);
				setState(1928);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_tuple_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(LPAREN);
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1932);
				tuple_pattern_element_list();
				}
				break;
			}
			setState(1935);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_pattern_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			tuple_pattern_element();
			setState(1942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1938);
				match(COMMA);
				setState(1939);
				tuple_pattern_element();
				}
				}
				setState(1944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_pattern_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1945);
				identifier();
				setState(1946);
				match(COLON);
				}
				break;
			}
			setState(1950);
			pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_patternContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitEnum_case_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
				{
				setState(1952);
				type_identifier();
				}
			}

			setState(1955);
			match(DOT);
			setState(1956);
			enum_case_name();
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1957);
				tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_patternContext extends ParserRuleContext {
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public Optional_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOptional_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOptional_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOptional_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_patternContext optional_pattern() throws RecognitionException {
		Optional_patternContext _localctx = new Optional_patternContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_optional_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			identifier_pattern();
			setState(1961);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExpression_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Swift5Parser.AT, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(AT);
			setState(1966);
			attribute_name();
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1967);
				attribute_argument_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_attribute_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			identifier();
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1971);
				match(DOT);
				setState(1972);
				identifier();
				}
				}
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAttribute_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_attribute_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			match(LPAREN);
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1979);
				balanced_tokens();
				}
				break;
			}
			setState(1982);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1985); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1984);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1987); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBalanced_tokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_balanced_tokens);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1990); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1989);
					balanced_token();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1992); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Balanced_token_punctuationContext balanced_token_punctuation() {
			return getRuleContext(Balanced_token_punctuationContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBalanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_balanced_token);
		try {
			setState(2014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				match(LPAREN);
				setState(1996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1995);
					balanced_tokens();
					}
					break;
				}
				setState(1998);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				match(LBRACK);
				setState(2001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2000);
					balanced_tokens();
					}
					break;
				}
				setState(2003);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2004);
				match(LCURLY);
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(2005);
					balanced_tokens();
					}
					break;
				}
				setState(2008);
				match(RCURLY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2009);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2010);
				keyword();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2011);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2012);
				operator();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2013);
				balanced_token_punctuation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_token_punctuationContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(Swift5Parser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(Swift5Parser.SEMI, 0); }
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public TerminalNode AT() { return getToken(Swift5Parser.AT, 0); }
		public TerminalNode HASH() { return getToken(Swift5Parser.HASH, 0); }
		public TerminalNode BACKTICK() { return getToken(Swift5Parser.BACKTICK, 0); }
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TerminalNode AND() { return getToken(Swift5Parser.AND, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Balanced_token_punctuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token_punctuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBalanced_token_punctuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBalanced_token_punctuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBalanced_token_punctuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_token_punctuationContext balanced_token_punctuation() throws RecognitionException {
		Balanced_token_punctuationContext _localctx = new Balanced_token_punctuationContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_balanced_token_punctuation);
		int _la;
		try {
			setState(2022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2016);
				_la = _input.LA(1);
				if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (DOT - 138)) | (1L << (COMMA - 138)) | (1L << (COLON - 138)) | (1L << (SEMI - 138)) | (1L << (QUESTION - 138)) | (1L << (AT - 138)) | (1L << (EQUAL - 138)) | (1L << (HASH - 138)) | (1L << (BACKTICK - 138)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
				arrow_operator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2018);
				if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
				setState(2019);
				match(AND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2020);
				if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
				setState(2021);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2024);
				try_operator();
				}
				break;
			}
			setState(2027);
			prefix_expression();
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(2028);
				binary_expressions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			expression();
			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2032);
				match(COMMA);
				setState(2033);
				expression();
				}
				}
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrefix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrefix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_prefix_expression);
		try {
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2039);
					prefix_operator();
					}
					break;
				}
				setState(2042);
				postfix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				in_out_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class In_out_expressionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Swift5Parser.AND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIn_out_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			match(AND);
			setState(2047);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_operatorContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(Swift5Parser.TRY, 0); }
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Try_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTry_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTry_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTry_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_operatorContext try_operator() throws RecognitionException {
		Try_operatorContext _localctx = new Try_operatorContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_try_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(TRY);
			setState(2051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2050);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==QUESTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionContext extends ParserRuleContext {
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Try_operatorContext try_operator() {
			return getRuleContext(Try_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_binary_expression);
		try {
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				binary_operator();
				setState(2054);
				prefix_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2056);
					assignment_operator();
					}
					break;
				case 2:
					{
					setState(2057);
					conditional_operator();
					}
					break;
				}
				setState(2061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2060);
					try_operator();
					}
					break;
				}
				setState(2063);
				prefix_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2065);
				type_casting_operator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_expressionsContext extends ParserRuleContext {
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBinary_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBinary_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBinary_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2069); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2068);
					binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2071); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_operatorContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(QUESTION);
			setState(2074);
			expression();
			setState(2075);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IS() { return getToken(Swift5Parser.IS, 0); }
		public TerminalNode AS() { return getToken(Swift5Parser.AS, 0); }
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_casting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_type_casting_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
				{
				setState(2077);
				match(IS);
				}
				break;
			case AS:
				{
				setState(2078);
				match(AS);
				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BANG || _la==QUESTION) {
					{
					setState(2079);
					_la = _input.LA(1);
					if ( !(_la==BANG || _la==QUESTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2084);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Unqualified_nameContext unqualified_name() {
			return getRuleContext(Unqualified_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Dictionary_typeContext dictionary_type() {
			return getRuleContext(Dictionary_typeContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_operatorContext parenthesized_operator() {
			return getRuleContext(Parenthesized_operatorContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Tuple_expressionContext tuple_expression() {
			return getRuleContext(Tuple_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Key_path_expressionContext key_path_expression() {
			return getRuleContext(Key_path_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Key_path_string_expressionContext key_path_string_expression() {
			return getRuleContext(Key_path_string_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_primary_expression);
		try {
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				unqualified_name();
				setState(2088);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2087);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2090);
				array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2091);
				dictionary_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2092);
				literal_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2093);
				self_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2094);
				superclass_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2095);
				closure_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2096);
				parenthesized_operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2097);
				parenthesized_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2098);
				tuple_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2099);
				implicit_member_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2100);
				wildcard_expression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2101);
				key_path_expression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2102);
				selector_expression();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2103);
				key_path_string_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unqualified_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Unqualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualified_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterUnqualified_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitUnqualified_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitUnqualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unqualified_nameContext unqualified_name() throws RecognitionException {
		Unqualified_nameContext _localctx = new Unqualified_nameContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_unqualified_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			identifier();
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2107);
				match(LPAREN);
				setState(2108);
				argument_names();
				setState(2109);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Playground_literalContext playground_literal() {
			return getRuleContext(Playground_literalContext.class,0);
		}
		public TerminalNode HASH_FILE() { return getToken(Swift5Parser.HASH_FILE, 0); }
		public TerminalNode HASH_FILE_ID() { return getToken(Swift5Parser.HASH_FILE_ID, 0); }
		public TerminalNode HASH_FILE_PATH() { return getToken(Swift5Parser.HASH_FILE_PATH, 0); }
		public TerminalNode HASH_LINE() { return getToken(Swift5Parser.HASH_LINE, 0); }
		public TerminalNode HASH_COLUMN() { return getToken(Swift5Parser.HASH_COLUMN, 0); }
		public TerminalNode HASH_FUNCTION() { return getToken(Swift5Parser.HASH_FUNCTION, 0); }
		public TerminalNode HASH_DSO_HANDLE() { return getToken(Swift5Parser.HASH_DSO_HANDLE, 0); }
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_literal_expression);
		try {
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2113);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2115);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2116);
				playground_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2117);
				match(HASH_FILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2118);
				match(HASH_FILE_ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2119);
				match(HASH_FILE_PATH);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2120);
				match(HASH_LINE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2121);
				match(HASH_COLUMN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2122);
				match(HASH_FUNCTION);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2123);
				match(HASH_DSO_HANDLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(LBRACK);
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2127);
				array_literal_items();
				}
				break;
			}
			setState(2130);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public List<Array_literal_itemContext> array_literal_item() {
			return getRuleContexts(Array_literal_itemContext.class);
		}
		public Array_literal_itemContext array_literal_item(int i) {
			return getRuleContext(Array_literal_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArray_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_array_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			array_literal_item();
			setState(2137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2133);
					match(COMMA);
					setState(2134);
					array_literal_item();
					}
					} 
				}
				setState(2139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			setState(2141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2140);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArray_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literalContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_dictionary_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			match(LBRACK);
			setState(2148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2146);
				dictionary_literal_items();
				}
				break;
			case 2:
				{
				setState(2147);
				match(COLON);
				}
				break;
			}
			setState(2150);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDictionary_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_dictionary_literal_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			dictionary_literal_item();
			setState(2157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2153);
					match(COMMA);
					setState(2154);
					dictionary_literal_item();
					}
					} 
				}
				setState(2159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			setState(2161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2160);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDictionary_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			expression();
			setState(2164);
			match(COLON);
			setState(2165);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Playground_literalContext extends ParserRuleContext {
		public TerminalNode HASH_COLOR_LITERAL() { return getToken(Swift5Parser.HASH_COLOR_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RED() { return getToken(Swift5Parser.RED, 0); }
		public List<TerminalNode> COLON() { return getTokens(Swift5Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Swift5Parser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public TerminalNode GREEN() { return getToken(Swift5Parser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(Swift5Parser.BLUE, 0); }
		public TerminalNode ALPHA() { return getToken(Swift5Parser.ALPHA, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode HASH_FILE_LITERAL() { return getToken(Swift5Parser.HASH_FILE_LITERAL, 0); }
		public TerminalNode RESOURCE_NAME() { return getToken(Swift5Parser.RESOURCE_NAME, 0); }
		public TerminalNode HASH_IMAGE_LITERAL() { return getToken(Swift5Parser.HASH_IMAGE_LITERAL, 0); }
		public Playground_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playground_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPlayground_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPlayground_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPlayground_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Playground_literalContext playground_literal() throws RecognitionException {
		Playground_literalContext _localctx = new Playground_literalContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_playground_literal);
		try {
			setState(2200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH_COLOR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				match(HASH_COLOR_LITERAL);
				setState(2168);
				match(LPAREN);
				setState(2169);
				match(RED);
				setState(2170);
				match(COLON);
				setState(2171);
				expression();
				setState(2172);
				match(COMMA);
				setState(2173);
				match(GREEN);
				setState(2174);
				match(COLON);
				setState(2175);
				expression();
				setState(2176);
				match(COMMA);
				setState(2177);
				match(BLUE);
				setState(2178);
				match(COLON);
				setState(2179);
				expression();
				setState(2180);
				match(COMMA);
				setState(2181);
				match(ALPHA);
				setState(2182);
				match(COLON);
				setState(2183);
				expression();
				setState(2184);
				match(RPAREN);
				}
				break;
			case HASH_FILE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(HASH_FILE_LITERAL);
				setState(2187);
				match(LPAREN);
				setState(2188);
				match(RESOURCE_NAME);
				setState(2189);
				match(COLON);
				setState(2190);
				expression();
				setState(2191);
				match(RPAREN);
				}
				break;
			case HASH_IMAGE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2193);
				match(HASH_IMAGE_LITERAL);
				setState(2194);
				match(LPAREN);
				setState(2195);
				match(RESOURCE_NAME);
				setState(2196);
				match(COLON);
				setState(2197);
				expression();
				setState(2198);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_expressionContext extends ParserRuleContext {
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
	 
		public Self_expressionContext() { }
		public void copyFrom(Self_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Self_initializer_expressionContext extends Self_expressionContext {
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode INIT() { return getToken(Swift5Parser.INIT, 0); }
		public Self_initializer_expressionContext(Self_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelf_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelf_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelf_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_pure_expressionContext extends Self_expressionContext {
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public Self_pure_expressionContext(Self_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelf_pure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelf_pure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelf_pure_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_subscript_expressionContext extends Self_expressionContext {
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Self_subscript_expressionContext(Self_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelf_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelf_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelf_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Self_method_expressionContext extends Self_expressionContext {
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Self_method_expressionContext(Self_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelf_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelf_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelf_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_self_expression);
		try {
			setState(2214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				_localctx = new Self_pure_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				match(SELF);
				}
				break;
			case 2:
				_localctx = new Self_method_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				match(SELF);
				setState(2204);
				match(DOT);
				setState(2205);
				identifier();
				}
				break;
			case 3:
				_localctx = new Self_subscript_expressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2206);
				match(SELF);
				setState(2207);
				match(LBRACK);
				setState(2208);
				function_call_argument_list();
				setState(2209);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new Self_initializer_expressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2211);
				match(SELF);
				setState(2212);
				match(DOT);
				setState(2213);
				match(INIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
	 
		public Superclass_expressionContext() { }
		public void copyFrom(Superclass_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Superclass_subscript_expressionContext extends Superclass_expressionContext {
		public TerminalNode SUPER() { return getToken(Swift5Parser.SUPER, 0); }
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Superclass_subscript_expressionContext(Superclass_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSuperclass_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Superclass_initializer_expressionContext extends Superclass_expressionContext {
		public TerminalNode SUPER() { return getToken(Swift5Parser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode INIT() { return getToken(Swift5Parser.INIT, 0); }
		public Superclass_initializer_expressionContext(Superclass_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSuperclass_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Superclass_method_expressionContext extends Superclass_expressionContext {
		public TerminalNode SUPER() { return getToken(Swift5Parser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(Superclass_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSuperclass_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_superclass_expression);
		try {
			setState(2227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new Superclass_method_expressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				match(SUPER);
				setState(2217);
				match(DOT);
				setState(2218);
				identifier();
				}
				break;
			case 2:
				_localctx = new Superclass_subscript_expressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2219);
				match(SUPER);
				setState(2220);
				match(LBRACK);
				setState(2221);
				function_call_argument_list();
				setState(2222);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new Superclass_initializer_expressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				match(SUPER);
				setState(2225);
				match(DOT);
				setState(2226);
				match(INIT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Swift5Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Swift5Parser.RCURLY, 0); }
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClosure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(LCURLY);
			setState(2231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2230);
				closure_signature();
				}
				break;
			}
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2233);
				statements();
				}
				break;
			}
			setState(2236);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_signatureContext extends ParserRuleContext {
		public Closure_parameter_clauseContext closure_parameter_clause() {
			return getRuleContext(Closure_parameter_clauseContext.class,0);
		}
		public TerminalNode IN() { return getToken(Swift5Parser.IN, 0); }
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClosure_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_closure_signature);
		int _la;
		try {
			setState(2253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2238);
					capture_list();
					}
				}

				setState(2241);
				closure_parameter_clause();
				setState(2243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2242);
					match(THROWS);
					}
					break;
				}
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2245);
					function_result();
					}
					break;
				}
				setState(2248);
				match(IN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2250);
				capture_list();
				setState(2251);
				match(IN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_parameter_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Closure_parameter_listContext closure_parameter_list() {
			return getRuleContext(Closure_parameter_listContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Closure_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClosure_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClosure_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClosure_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_clauseContext closure_parameter_clause() throws RecognitionException {
		Closure_parameter_clauseContext _localctx = new Closure_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_closure_parameter_clause);
		int _la;
		try {
			setState(2261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2255);
				match(LPAREN);
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
					{
					setState(2256);
					closure_parameter_list();
					}
				}

				setState(2259);
				match(RPAREN);
				}
				break;
			case AS:
			case ALPHA:
			case CATCH:
			case CLASS:
			case DEFAULT:
			case DO:
			case GUARD:
			case FOR:
			case IN:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case WHILE:
			case PROTOCOL:
			case GET:
			case SET:
			case WILL_SET:
			case DID_SET:
			case INDIRECT:
			case PREFIX:
			case INFIX:
			case LEFT:
			case RIGHT:
			case NONE:
			case PRECEDENCE_GROUP:
			case HIGHER_THAN:
			case LOWER_THAN:
			case ASSIGNMENT:
			case ASSOCIATIVITY:
			case POSTFIX:
			case OPERATOR:
			case OS:
			case ARCH:
			case SWIFT:
			case COMPILER:
			case CAN_IMPORT:
			case TARGET_ENVIRONMENT:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case WEAK:
			case UNOWNED:
			case SAFE:
			case UNSAFE:
			case MUTATING:
			case NONMUTATING:
			case RED:
			case BLUE:
			case GREEN:
			case RESOURCE_NAME:
			case SOME:
			case TYPE:
			case PRECEDENCE:
			case SELF:
			case SELF_BIG:
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case LINUX:
			case WINDOWS:
			case I386:
			case X86_64:
			case ARM:
			case ARM64:
			case SIMULATOR:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
			case FILE:
			case LINE:
			case GETTER:
			case SETTER:
			case Identifier:
			case BACKTICK:
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				identifier_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_parameter_listContext extends ParserRuleContext {
		public List<Closure_parameterContext> closure_parameter() {
			return getRuleContexts(Closure_parameterContext.class);
		}
		public Closure_parameterContext closure_parameter(int i) {
			return getRuleContext(Closure_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Closure_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClosure_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClosure_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClosure_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameter_listContext closure_parameter_list() throws RecognitionException {
		Closure_parameter_listContext _localctx = new Closure_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_closure_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2263);
			closure_parameter();
			setState(2268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2264);
				match(COMMA);
				setState(2265);
				closure_parameter();
				}
				}
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_parameterContext extends ParserRuleContext {
		public IdentifierContext closure_parameter_name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Closure_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterClosure_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitClosure_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitClosure_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_parameterContext closure_parameter() throws RecognitionException {
		Closure_parameterContext _localctx = new Closure_parameterContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_closure_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			((Closure_parameterContext)_localctx).closure_parameter_name = identifier();
			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2272);
				type_annotation();
				setState(2274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2273);
					range_operator();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_listContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public Capture_list_itemsContext capture_list_items() {
			return getRuleContext(Capture_list_itemsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCapture_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			match(LBRACK);
			setState(2279);
			capture_list_items();
			setState(2280);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemsContext extends ParserRuleContext {
		public List<Capture_list_itemContext> capture_list_item() {
			return getRuleContexts(Capture_list_itemContext.class);
		}
		public Capture_list_itemContext capture_list_item(int i) {
			return getRuleContext(Capture_list_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Capture_list_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCapture_list_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCapture_list_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCapture_list_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemsContext capture_list_items() throws RecognitionException {
		Capture_list_itemsContext _localctx = new Capture_list_itemsContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_capture_list_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2282);
			capture_list_item();
			setState(2287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2283);
				match(COMMA);
				setState(2284);
				capture_list_item();
				}
				}
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_list_itemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public Capture_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCapture_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCapture_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCapture_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_list_itemContext capture_list_item() throws RecognitionException {
		Capture_list_itemContext _localctx = new Capture_list_itemContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_capture_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2290);
				capture_specifier();
				}
				break;
			}
			setState(2300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2293);
				identifier();
				setState(2295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2294);
					match(EQUAL);
					}
					break;
				}
				setState(2297);
				expression();
				}
				break;
			case 2:
				{
				setState(2299);
				self_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_specifierContext extends ParserRuleContext {
		public TerminalNode WEAK() { return getToken(Swift5Parser.WEAK, 0); }
		public TerminalNode UNOWNED() { return getToken(Swift5Parser.UNOWNED, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode SAFE() { return getToken(Swift5Parser.SAFE, 0); }
		public TerminalNode UNSAFE() { return getToken(Swift5Parser.UNSAFE, 0); }
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCapture_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_capture_specifier);
		int _la;
		try {
			setState(2309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WEAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(2302);
				match(WEAK);
				}
				break;
			case UNOWNED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				match(UNOWNED);
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2304);
					match(LPAREN);
					setState(2305);
					_la = _input.LA(1);
					if ( !(_la==SAFE || _la==UNSAFE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2306);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitImplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2311);
			match(DOT);
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2312);
				identifier();
				}
				break;
			case 2:
				{
				setState(2313);
				keyword();
				}
				break;
			}
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2316);
				match(DOT);
				setState(2317);
				postfix_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_operatorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Parenthesized_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterParenthesized_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitParenthesized_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitParenthesized_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_operatorContext parenthesized_operator() throws RecognitionException {
		Parenthesized_operatorContext _localctx = new Parenthesized_operatorContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_parenthesized_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			match(LPAREN);
			setState(2321);
			operator();
			setState(2322);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			match(LPAREN);
			setState(2325);
			expression();
			setState(2326);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Tuple_elementContext tuple_element() {
			return getRuleContext(Tuple_elementContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Swift5Parser.COMMA, 0); }
		public Tuple_element_listContext tuple_element_list() {
			return getRuleContext(Tuple_element_listContext.class,0);
		}
		public Tuple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_expressionContext tuple_expression() throws RecognitionException {
		Tuple_expressionContext _localctx = new Tuple_expressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_tuple_expression);
		try {
			setState(2336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2328);
				match(LPAREN);
				setState(2329);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2330);
				match(LPAREN);
				setState(2331);
				tuple_element();
				setState(2332);
				match(COMMA);
				setState(2333);
				tuple_element_list();
				setState(2334);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_element_listContext extends ParserRuleContext {
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Tuple_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_element_listContext tuple_element_list() throws RecognitionException {
		Tuple_element_listContext _localctx = new Tuple_element_listContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_tuple_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			tuple_element();
			setState(2343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2339);
				match(COMMA);
				setState(2340);
				tuple_element();
				}
				}
				setState(2345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_tuple_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2346);
				identifier();
				setState(2347);
				match(COLON);
				}
				break;
			}
			setState(2351);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Swift5Parser.UNDERSCORE, 0); }
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitWildcard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(UNDERSCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_expressionContext extends ParserRuleContext {
		public TerminalNode BACKSLASH() { return getToken(Swift5Parser.BACKSLASH, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Key_path_componentsContext key_path_components() {
			return getRuleContext(Key_path_componentsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Key_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_expressionContext key_path_expression() throws RecognitionException {
		Key_path_expressionContext _localctx = new Key_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_key_path_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			match(BACKSLASH);
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (ANY - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (LPAREN - 135)) | (1L << (LBRACK - 135)) | (1L << (AT - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
				{
				setState(2356);
				type(0);
				}
			}

			setState(2359);
			match(DOT);
			setState(2360);
			key_path_components();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_componentsContext extends ParserRuleContext {
		public List<Key_path_componentContext> key_path_component() {
			return getRuleContexts(Key_path_componentContext.class);
		}
		public Key_path_componentContext key_path_component(int i) {
			return getRuleContext(Key_path_componentContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Key_path_componentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_components(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_components(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_components(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_componentsContext key_path_components() throws RecognitionException {
		Key_path_componentsContext _localctx = new Key_path_componentsContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_key_path_components);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			key_path_component();
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2363);
					match(DOT);
					setState(2364);
					key_path_component();
					}
					} 
				}
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_componentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Key_path_postfixesContext key_path_postfixes() {
			return getRuleContext(Key_path_postfixesContext.class,0);
		}
		public Key_path_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_componentContext key_path_component() throws RecognitionException {
		Key_path_componentContext _localctx = new Key_path_componentContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_key_path_component);
		try {
			setState(2375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				identifier();
				setState(2372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2371);
					key_path_postfixes();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				key_path_postfixes();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_postfixesContext extends ParserRuleContext {
		public List<Key_path_postfixContext> key_path_postfix() {
			return getRuleContexts(Key_path_postfixContext.class);
		}
		public Key_path_postfixContext key_path_postfix(int i) {
			return getRuleContext(Key_path_postfixContext.class,i);
		}
		public Key_path_postfixesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_postfixes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_postfixes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_postfixes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_postfixes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_postfixesContext key_path_postfixes() throws RecognitionException {
		Key_path_postfixesContext _localctx = new Key_path_postfixesContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_key_path_postfixes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2378); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2377);
					key_path_postfix();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2380); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_postfixContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Key_path_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_postfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_postfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_postfixContext key_path_postfix() throws RecognitionException {
		Key_path_postfixContext _localctx = new Key_path_postfixContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_key_path_postfix);
		try {
			setState(2389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2382);
				match(QUESTION);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2383);
				match(BANG);
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 3);
				{
				setState(2384);
				match(SELF);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2385);
				match(LBRACK);
				setState(2386);
				function_call_argument_list();
				setState(2387);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public TerminalNode HASH_SELECTOR() { return getToken(Swift5Parser.HASH_SELECTOR, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TerminalNode GETTER() { return getToken(Swift5Parser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(Swift5Parser.SETTER, 0); }
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelector_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelector_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_selector_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(HASH_SELECTOR);
			setState(2392);
			match(LPAREN);
			setState(2395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2393);
				_la = _input.LA(1);
				if ( !(_la==GETTER || _la==SETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2394);
				match(COLON);
				}
				break;
			}
			setState(2397);
			expression();
			setState(2398);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_path_string_expressionContext extends ParserRuleContext {
		public TerminalNode HASH_KEYPATH() { return getToken(Swift5Parser.HASH_KEYPATH, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Key_path_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_path_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKey_path_string_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKey_path_string_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKey_path_string_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_path_string_expressionContext key_path_string_expression() throws RecognitionException {
		Key_path_string_expressionContext _localctx = new Key_path_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_key_path_string_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			match(HASH_KEYPATH);
			setState(2401);
			match(LPAREN);
			setState(2402);
			expression();
			setState(2403);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<Function_call_suffixContext> function_call_suffix() {
			return getRuleContexts(Function_call_suffixContext.class);
		}
		public Function_call_suffixContext function_call_suffix(int i) {
			return getRuleContext(Function_call_suffixContext.class,i);
		}
		public List<Initializer_suffixContext> initializer_suffix() {
			return getRuleContexts(Initializer_suffixContext.class);
		}
		public Initializer_suffixContext initializer_suffix(int i) {
			return getRuleContext(Initializer_suffixContext.class,i);
		}
		public List<Explicit_member_suffixContext> explicit_member_suffix() {
			return getRuleContexts(Explicit_member_suffixContext.class);
		}
		public Explicit_member_suffixContext explicit_member_suffix(int i) {
			return getRuleContext(Explicit_member_suffixContext.class,i);
		}
		public List<Postfix_self_suffixContext> postfix_self_suffix() {
			return getRuleContexts(Postfix_self_suffixContext.class);
		}
		public Postfix_self_suffixContext postfix_self_suffix(int i) {
			return getRuleContext(Postfix_self_suffixContext.class,i);
		}
		public List<Subscript_suffixContext> subscript_suffix() {
			return getRuleContexts(Subscript_suffixContext.class);
		}
		public Subscript_suffixContext subscript_suffix(int i) {
			return getRuleContext(Subscript_suffixContext.class,i);
		}
		public List<Forced_value_suffixContext> forced_value_suffix() {
			return getRuleContexts(Forced_value_suffixContext.class);
		}
		public Forced_value_suffixContext forced_value_suffix(int i) {
			return getRuleContext(Forced_value_suffixContext.class,i);
		}
		public List<Optional_chaining_suffixContext> optional_chaining_suffix() {
			return getRuleContexts(Optional_chaining_suffixContext.class);
		}
		public Optional_chaining_suffixContext optional_chaining_suffix(int i) {
			return getRuleContext(Optional_chaining_suffixContext.class,i);
		}
		public List<Postfix_operatorContext> postfix_operator() {
			return getRuleContexts(Postfix_operatorContext.class);
		}
		public Postfix_operatorContext postfix_operator(int i) {
			return getRuleContext(Postfix_operatorContext.class,i);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
			primary_expression();
			setState(2415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
					case 1:
						{
						setState(2406);
						function_call_suffix();
						}
						break;
					case 2:
						{
						setState(2407);
						initializer_suffix();
						}
						break;
					case 3:
						{
						setState(2408);
						explicit_member_suffix();
						}
						break;
					case 4:
						{
						setState(2409);
						postfix_self_suffix();
						}
						break;
					case 5:
						{
						setState(2410);
						subscript_suffix();
						}
						break;
					case 6:
						{
						setState(2411);
						forced_value_suffix();
						}
						break;
					case 7:
						{
						setState(2412);
						optional_chaining_suffix();
						}
						break;
					}
					} 
				}
				setState(2417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			setState(2421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2418);
					postfix_operator();
					}
					} 
				}
				setState(2423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_suffixContext extends ParserRuleContext {
		public Trailing_closuresContext trailing_closures() {
			return getRuleContext(Trailing_closuresContext.class,0);
		}
		public Function_call_argument_clauseContext function_call_argument_clause() {
			return getRuleContext(Function_call_argument_clauseContext.class,0);
		}
		public Function_call_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_call_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_call_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_call_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_suffixContext function_call_suffix() throws RecognitionException {
		Function_call_suffixContext _localctx = new Function_call_suffixContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_function_call_suffix);
		int _la;
		try {
			setState(2429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2424);
					function_call_argument_clause();
					}
				}

				setState(2427);
				trailing_closures();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2428);
				function_call_argument_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_suffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode INIT() { return getToken(Swift5Parser.INIT, 0); }
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Initializer_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInitializer_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInitializer_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInitializer_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_suffixContext initializer_suffix() throws RecognitionException {
		Initializer_suffixContext _localctx = new Initializer_suffixContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_initializer_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2431);
			match(DOT);
			setState(2432);
			match(INIT);
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2433);
				match(LPAREN);
				setState(2434);
				argument_names();
				setState(2435);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_member_suffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode Decimal_digits() { return getToken(Swift5Parser.Decimal_digits, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public Argument_namesContext argument_names() {
			return getRuleContext(Argument_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Explicit_member_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_member_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExplicit_member_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExplicit_member_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExplicit_member_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_member_suffixContext explicit_member_suffix() throws RecognitionException {
		Explicit_member_suffixContext _localctx = new Explicit_member_suffixContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_explicit_member_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			match(DOT);
			setState(2449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_digits:
				{
				setState(2440);
				match(Decimal_digits);
				}
				break;
			case AS:
			case ALPHA:
			case CATCH:
			case CLASS:
			case DEFAULT:
			case DO:
			case GUARD:
			case FOR:
			case IN:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case WHILE:
			case PROTOCOL:
			case GET:
			case SET:
			case WILL_SET:
			case DID_SET:
			case INDIRECT:
			case PREFIX:
			case INFIX:
			case LEFT:
			case RIGHT:
			case NONE:
			case PRECEDENCE_GROUP:
			case HIGHER_THAN:
			case LOWER_THAN:
			case ASSIGNMENT:
			case ASSOCIATIVITY:
			case POSTFIX:
			case OPERATOR:
			case OS:
			case ARCH:
			case SWIFT:
			case COMPILER:
			case CAN_IMPORT:
			case TARGET_ENVIRONMENT:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case WEAK:
			case UNOWNED:
			case SAFE:
			case UNSAFE:
			case MUTATING:
			case NONMUTATING:
			case RED:
			case BLUE:
			case GREEN:
			case RESOURCE_NAME:
			case SOME:
			case TYPE:
			case PRECEDENCE:
			case SELF:
			case SELF_BIG:
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case LINUX:
			case WINDOWS:
			case I386:
			case X86_64:
			case ARM:
			case ARM64:
			case SIMULATOR:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
			case FILE:
			case LINE:
			case GETTER:
			case SETTER:
			case Identifier:
			case BACKTICK:
				{
				setState(2441);
				identifier();
				setState(2447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2442);
					generic_argument_clause();
					}
					break;
				case 2:
					{
					setState(2443);
					match(LPAREN);
					setState(2444);
					argument_names();
					setState(2445);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_self_suffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public Postfix_self_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_self_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPostfix_self_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPostfix_self_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPostfix_self_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_self_suffixContext postfix_self_suffix() throws RecognitionException {
		Postfix_self_suffixContext _localctx = new Postfix_self_suffixContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_postfix_self_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			match(DOT);
			setState(2452);
			match(SELF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_suffixContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Subscript_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSubscript_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSubscript_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSubscript_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_suffixContext subscript_suffix() throws RecognitionException {
		Subscript_suffixContext _localctx = new Subscript_suffixContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_subscript_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			match(LBRACK);
			setState(2455);
			function_call_argument_list();
			setState(2456);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Forced_value_suffixContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public Forced_value_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forced_value_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterForced_value_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitForced_value_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitForced_value_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forced_value_suffixContext forced_value_suffix() throws RecognitionException {
		Forced_value_suffixContext _localctx = new Forced_value_suffixContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_forced_value_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2458);
			if (!(!SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "!SwiftSupport.isBinaryOp(_input)");
			setState(2459);
			match(BANG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_chaining_suffixContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public Optional_chaining_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_chaining_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOptional_chaining_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOptional_chaining_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOptional_chaining_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optional_chaining_suffixContext optional_chaining_suffix() throws RecognitionException {
		Optional_chaining_suffixContext _localctx = new Optional_chaining_suffixContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_optional_chaining_suffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			if (!(!SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "!SwiftSupport.isBinaryOp(_input)");
			setState(2462);
			match(QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Function_call_argument_listContext function_call_argument_list() {
			return getRuleContext(Function_call_argument_listContext.class,0);
		}
		public Function_call_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_call_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_call_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_call_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argument_clauseContext function_call_argument_clause() throws RecognitionException {
		Function_call_argument_clauseContext _localctx = new Function_call_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_function_call_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			match(LPAREN);
			setState(2466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2465);
				function_call_argument_list();
				}
				break;
			}
			setState(2468);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argument_listContext extends ParserRuleContext {
		public List<Function_call_argumentContext> function_call_argument() {
			return getRuleContexts(Function_call_argumentContext.class);
		}
		public Function_call_argumentContext function_call_argument(int i) {
			return getRuleContext(Function_call_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Function_call_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_call_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_call_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_call_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argument_listContext function_call_argument_list() throws RecognitionException {
		Function_call_argument_listContext _localctx = new Function_call_argument_listContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_function_call_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			function_call_argument();
			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2471);
				match(COMMA);
				setState(2472);
				function_call_argument();
				}
				}
				setState(2477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_call_argumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Argument_nameContext argument_name() {
			return getRuleContext(Argument_nameContext.class,0);
		}
		public Function_call_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_call_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_call_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_call_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_argumentContext function_call_argument() throws RecognitionException {
		Function_call_argumentContext _localctx = new Function_call_argumentContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_function_call_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				{
				setState(2478);
				argument_name();
				}
				break;
			}
			setState(2484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2481);
				identifier();
				}
				break;
			case 2:
				{
				setState(2482);
				expression();
				}
				break;
			case 3:
				{
				setState(2483);
				operator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_closuresContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Labeled_trailing_closuresContext labeled_trailing_closures() {
			return getRuleContext(Labeled_trailing_closuresContext.class,0);
		}
		public Trailing_closuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTrailing_closures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTrailing_closures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTrailing_closures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closuresContext trailing_closures() throws RecognitionException {
		Trailing_closuresContext _localctx = new Trailing_closuresContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_trailing_closures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			closure_expression();
			setState(2488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2487);
				labeled_trailing_closures();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_trailing_closuresContext extends ParserRuleContext {
		public List<Labeled_trailing_closureContext> labeled_trailing_closure() {
			return getRuleContexts(Labeled_trailing_closureContext.class);
		}
		public Labeled_trailing_closureContext labeled_trailing_closure(int i) {
			return getRuleContext(Labeled_trailing_closureContext.class,i);
		}
		public Labeled_trailing_closuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_trailing_closures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLabeled_trailing_closures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLabeled_trailing_closures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLabeled_trailing_closures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_trailing_closuresContext labeled_trailing_closures() throws RecognitionException {
		Labeled_trailing_closuresContext _localctx = new Labeled_trailing_closuresContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_labeled_trailing_closures);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2491); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2490);
					labeled_trailing_closure();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2493); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_trailing_closureContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Labeled_trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_trailing_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLabeled_trailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLabeled_trailing_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLabeled_trailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_trailing_closureContext labeled_trailing_closure() throws RecognitionException {
		Labeled_trailing_closureContext _localctx = new Labeled_trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_labeled_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2495);
			identifier();
			setState(2496);
			match(COLON);
			setState(2497);
			closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_namesContext extends ParserRuleContext {
		public List<Argument_nameContext> argument_name() {
			return getRuleContexts(Argument_nameContext.class);
		}
		public Argument_nameContext argument_name(int i) {
			return getRuleContext(Argument_nameContext.class,i);
		}
		public Argument_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArgument_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArgument_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArgument_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_namesContext argument_names() throws RecognitionException {
		Argument_namesContext _localctx = new Argument_namesContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_argument_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2499);
				argument_name();
				}
				}
				setState(2502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (BACKTICK - 135)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Argument_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArgument_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArgument_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArgument_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_nameContext argument_name() throws RecognitionException {
		Argument_nameContext _localctx = new Argument_nameContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_argument_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			identifier();
			setState(2505);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Dictionary_typeContext dictionary_type() {
			return getRuleContext(Dictionary_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Opaque_typeContext opaque_type() {
			return getRuleContext(Opaque_typeContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Self_typeContext self_type() {
			return getRuleContext(Self_typeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public TerminalNode TYPE() { return getToken(Swift5Parser.TYPE, 0); }
		public TerminalNode PROTOCOL() { return getToken(Swift5Parser.PROTOCOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 522;
		enterRecursionRule(_localctx, 522, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2508);
				function_type();
				}
				break;
			case 2:
				{
				setState(2509);
				array_type();
				}
				break;
			case 3:
				{
				setState(2510);
				dictionary_type();
				}
				break;
			case 4:
				{
				setState(2511);
				protocol_composition_type();
				}
				break;
			case 5:
				{
				setState(2512);
				type_identifier();
				}
				break;
			case 6:
				{
				setState(2513);
				tuple_type();
				}
				break;
			case 7:
				{
				setState(2514);
				opaque_type();
				}
				break;
			case 8:
				{
				setState(2515);
				any_type();
				}
				break;
			case 9:
				{
				setState(2516);
				self_type();
				}
				break;
			case 10:
				{
				setState(2517);
				match(LPAREN);
				setState(2518);
				type(0);
				setState(2519);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(2523);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(2532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
					case 1:
						{
						setState(2524);
						if (!(!SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "!SwiftSupport.isBinaryOp(_input)");
						setState(2525);
						match(QUESTION);
						}
						break;
					case 2:
						{
						setState(2526);
						if (!(!SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "!SwiftSupport.isBinaryOp(_input)");
						setState(2527);
						match(BANG);
						}
						break;
					case 3:
						{
						setState(2528);
						match(DOT);
						setState(2529);
						match(TYPE);
						}
						break;
					case 4:
						{
						setState(2530);
						match(DOT);
						setState(2531);
						match(PROTOCOL);
						}
						break;
					}
					}
					} 
				}
				setState(2538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_annotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(Swift5Parser.INOUT, 0); }
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2539);
			match(COLON);
			setState(2541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2540);
				attributes();
				}
				break;
			}
			setState(2544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INOUT) {
				{
				setState(2543);
				match(INOUT);
				}
			}

			setState(2546);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_type_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			type_name();
			setState(2550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2549);
				generic_argument_clause();
				}
				break;
			}
			setState(2554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2552);
				match(DOT);
				setState(2553);
				type_identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			match(LPAREN);
			setState(2560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (ANY - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (LPAREN - 135)) | (1L << (LBRACK - 135)) | (1L << (AT - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
				{
				setState(2559);
				tuple_type_element_list();
				}
			}

			setState(2562);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public List<Tuple_type_elementContext> tuple_type_element() {
			return getRuleContexts(Tuple_type_elementContext.class);
		}
		public Tuple_type_elementContext tuple_type_element(int i) {
			return getRuleContext(Tuple_type_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_tuple_type_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			tuple_type_element();
			setState(2569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2565);
				match(COMMA);
				setState(2566);
				tuple_type_element();
				}
				}
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_tuple_type_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2572);
				element_name();
				setState(2573);
				type_annotation();
				}
				break;
			case 2:
				{
				setState(2575);
				type(0);
				}
				break;
			}
			setState(2580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(2578);
				match(EQUAL);
				setState(2579);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_element_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2583); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2582);
				identifier();
				}
				}
				setState(2585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (BACKTICK - 135)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_typeContext extends ParserRuleContext {
		public Function_type_argument_clauseContext function_type_argument_clause() {
			return getRuleContext(Function_type_argument_clauseContext.class,0);
		}
		public Arrow_operatorContext arrow_operator() {
			return getRuleContext(Arrow_operatorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(2587);
				attributes();
				}
			}

			setState(2590);
			function_type_argument_clause();
			setState(2592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2591);
				match(THROWS);
				}
				break;
			}
			setState(2594);
			arrow_operator();
			setState(2595);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_type_argument_clauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Swift5Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Swift5Parser.RPAREN, 0); }
		public Function_type_argument_listContext function_type_argument_list() {
			return getRuleContext(Function_type_argument_listContext.class,0);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Function_type_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_type_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_type_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_type_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argument_clauseContext function_type_argument_clause() throws RecognitionException {
		Function_type_argument_clauseContext _localctx = new Function_type_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_function_type_argument_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2597);
			match(LPAREN);
			setState(2602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (ANY - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (INOUT - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (LPAREN - 135)) | (1L << (LBRACK - 135)) | (1L << (AT - 135)) | (1L << (BACKTICK - 135)))) != 0)) {
				{
				setState(2598);
				function_type_argument_list();
				setState(2600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2599);
					range_operator();
					}
					break;
				}
				}
			}

			setState(2604);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_type_argument_listContext extends ParserRuleContext {
		public List<Function_type_argumentContext> function_type_argument() {
			return getRuleContexts(Function_type_argumentContext.class);
		}
		public Function_type_argumentContext function_type_argument(int i) {
			return getRuleContext(Function_type_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Function_type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_type_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_type_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_type_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argument_listContext function_type_argument_list() throws RecognitionException {
		Function_type_argument_listContext _localctx = new Function_type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_function_type_argument_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			function_type_argument();
			setState(2611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2607);
					match(COMMA);
					setState(2608);
					function_type_argument();
					}
					} 
				}
				setState(2613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_type_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(Swift5Parser.INOUT, 0); }
		public Argument_labelContext argument_label() {
			return getRuleContext(Argument_labelContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Function_type_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterFunction_type_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitFunction_type_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitFunction_type_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_type_argumentContext function_type_argument() throws RecognitionException {
		Function_type_argumentContext _localctx = new Function_type_argumentContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_function_type_argument);
		int _la;
		try {
			setState(2624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2614);
					attributes();
					}
					break;
				}
				setState(2618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INOUT) {
					{
					setState(2617);
					match(INOUT);
					}
				}

				setState(2620);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621);
				argument_label();
				setState(2622);
				type_annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_labelContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Argument_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArgument_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArgument_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArgument_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_labelContext argument_label() throws RecognitionException {
		Argument_labelContext _localctx = new Argument_labelContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_argument_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2626);
				identifier();
				}
				}
				setState(2629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (GETTER - 135)) | (1L << (SETTER - 135)) | (1L << (Identifier - 135)) | (1L << (BACKTICK - 135)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
			match(LBRACK);
			setState(2632);
			type(0);
			setState(2633);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_typeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(Swift5Parser.LBRACK, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public TerminalNode RBRACK() { return getToken(Swift5Parser.RBRACK, 0); }
		public Dictionary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDictionary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDictionary_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDictionary_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_typeContext dictionary_type() throws RecognitionException {
		Dictionary_typeContext _localctx = new Dictionary_typeContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_dictionary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			match(LBRACK);
			setState(2636);
			type(0);
			setState(2637);
			match(COLON);
			setState(2638);
			type(0);
			setState(2639);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(Swift5Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift5Parser.AND, i);
		}
		public Trailing_composition_andContext trailing_composition_and() {
			return getRuleContext(Trailing_composition_andContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitProtocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_protocol_composition_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
			type_identifier();
			setState(2646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2642);
					match(AND);
					setState(2643);
					type_identifier();
					}
					} 
				}
				setState(2648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			}
			setState(2650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2649);
				trailing_composition_and();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_composition_andContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Swift5Parser.AND, 0); }
		public Trailing_composition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_composition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterTrailing_composition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitTrailing_composition_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitTrailing_composition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_composition_andContext trailing_composition_and() throws RecognitionException {
		Trailing_composition_andContext _localctx = new Trailing_composition_andContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_trailing_composition_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			if (!(!SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "!SwiftSupport.isBinaryOp(_input)");
			setState(2653);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opaque_typeContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(Swift5Parser.SOME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Opaque_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaque_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOpaque_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOpaque_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOpaque_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opaque_typeContext opaque_type() throws RecognitionException {
		Opaque_typeContext _localctx = new Opaque_typeContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_opaque_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			match(SOME);
			setState(2656);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(Swift5Parser.ANY, 0); }
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAny_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAny_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_any_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			match(ANY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_typeContext extends ParserRuleContext {
		public TerminalNode SELF_BIG() { return getToken(Swift5Parser.SELF_BIG, 0); }
		public Self_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSelf_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSelf_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSelf_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_typeContext self_type() throws RecognitionException {
		Self_typeContext _localctx = new Self_typeContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_self_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			match(SELF_BIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Swift5Parser.COLON, 0); }
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_inheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_type_inheritance_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			match(COLON);
			setState(2663);
			type_inheritance_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitType_inheritance_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_type_inheritance_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			type_identifier();
			setState(2670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2666);
				match(COMMA);
				setState(2667);
				type_identifier();
				}
				}
				setState(2672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LINUX() { return getToken(Swift5Parser.LINUX, 0); }
		public TerminalNode WINDOWS() { return getToken(Swift5Parser.WINDOWS, 0); }
		public TerminalNode ALPHA() { return getToken(Swift5Parser.ALPHA, 0); }
		public TerminalNode ARCH() { return getToken(Swift5Parser.ARCH, 0); }
		public TerminalNode ARM() { return getToken(Swift5Parser.ARM, 0); }
		public TerminalNode ARM64() { return getToken(Swift5Parser.ARM64, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Swift5Parser.ASSIGNMENT, 0); }
		public TerminalNode BLUE() { return getToken(Swift5Parser.BLUE, 0); }
		public TerminalNode CAN_IMPORT() { return getToken(Swift5Parser.CAN_IMPORT, 0); }
		public TerminalNode COMPILER() { return getToken(Swift5Parser.COMPILER, 0); }
		public TerminalNode FILE() { return getToken(Swift5Parser.FILE, 0); }
		public TerminalNode GREEN() { return getToken(Swift5Parser.GREEN, 0); }
		public TerminalNode HIGHER_THAN() { return getToken(Swift5Parser.HIGHER_THAN, 0); }
		public TerminalNode I386() { return getToken(Swift5Parser.I386, 0); }
		public TerminalNode I_OS() { return getToken(Swift5Parser.I_OS, 0); }
		public TerminalNode OSX() { return getToken(Swift5Parser.OSX, 0); }
		public TerminalNode I_OS_APPLICATION_EXTENSION() { return getToken(Swift5Parser.I_OS_APPLICATION_EXTENSION, 0); }
		public TerminalNode LINE() { return getToken(Swift5Parser.LINE, 0); }
		public TerminalNode LOWER_THAN() { return getToken(Swift5Parser.LOWER_THAN, 0); }
		public TerminalNode MAC_CATALYST() { return getToken(Swift5Parser.MAC_CATALYST, 0); }
		public TerminalNode MAC_CATALYST_APPLICATION_EXTENSION() { return getToken(Swift5Parser.MAC_CATALYST_APPLICATION_EXTENSION, 0); }
		public TerminalNode MAC_OS() { return getToken(Swift5Parser.MAC_OS, 0); }
		public TerminalNode MAC_OS_APPLICATION_EXTENSION() { return getToken(Swift5Parser.MAC_OS_APPLICATION_EXTENSION, 0); }
		public TerminalNode OS() { return getToken(Swift5Parser.OS, 0); }
		public TerminalNode PRECEDENCE_GROUP() { return getToken(Swift5Parser.PRECEDENCE_GROUP, 0); }
		public TerminalNode RED() { return getToken(Swift5Parser.RED, 0); }
		public TerminalNode RESOURCE_NAME() { return getToken(Swift5Parser.RESOURCE_NAME, 0); }
		public TerminalNode SAFE() { return getToken(Swift5Parser.SAFE, 0); }
		public TerminalNode SIMULATOR() { return getToken(Swift5Parser.SIMULATOR, 0); }
		public TerminalNode SOME() { return getToken(Swift5Parser.SOME, 0); }
		public TerminalNode SWIFT() { return getToken(Swift5Parser.SWIFT, 0); }
		public TerminalNode TARGET_ENVIRONMENT() { return getToken(Swift5Parser.TARGET_ENVIRONMENT, 0); }
		public TerminalNode TV_OS() { return getToken(Swift5Parser.TV_OS, 0); }
		public TerminalNode UNSAFE() { return getToken(Swift5Parser.UNSAFE, 0); }
		public TerminalNode WATCH_OS() { return getToken(Swift5Parser.WATCH_OS, 0); }
		public TerminalNode X86_64() { return getToken(Swift5Parser.X86_64, 0); }
		public TerminalNode ASSOCIATIVITY() { return getToken(Swift5Parser.ASSOCIATIVITY, 0); }
		public TerminalNode CONVENIENCE() { return getToken(Swift5Parser.CONVENIENCE, 0); }
		public TerminalNode DYNAMIC() { return getToken(Swift5Parser.DYNAMIC, 0); }
		public TerminalNode DID_SET() { return getToken(Swift5Parser.DID_SET, 0); }
		public TerminalNode FINAL() { return getToken(Swift5Parser.FINAL, 0); }
		public TerminalNode GET() { return getToken(Swift5Parser.GET, 0); }
		public TerminalNode INFIX() { return getToken(Swift5Parser.INFIX, 0); }
		public TerminalNode INDIRECT() { return getToken(Swift5Parser.INDIRECT, 0); }
		public TerminalNode LAZY() { return getToken(Swift5Parser.LAZY, 0); }
		public TerminalNode LEFT() { return getToken(Swift5Parser.LEFT, 0); }
		public TerminalNode MUTATING() { return getToken(Swift5Parser.MUTATING, 0); }
		public TerminalNode NONE() { return getToken(Swift5Parser.NONE, 0); }
		public TerminalNode NONMUTATING() { return getToken(Swift5Parser.NONMUTATING, 0); }
		public TerminalNode OPTIONAL() { return getToken(Swift5Parser.OPTIONAL, 0); }
		public TerminalNode OVERRIDE() { return getToken(Swift5Parser.OVERRIDE, 0); }
		public TerminalNode POSTFIX() { return getToken(Swift5Parser.POSTFIX, 0); }
		public TerminalNode PRECEDENCE() { return getToken(Swift5Parser.PRECEDENCE, 0); }
		public TerminalNode PREFIX() { return getToken(Swift5Parser.PREFIX, 0); }
		public TerminalNode PROTOCOL() { return getToken(Swift5Parser.PROTOCOL, 0); }
		public TerminalNode REQUIRED() { return getToken(Swift5Parser.REQUIRED, 0); }
		public TerminalNode RIGHT() { return getToken(Swift5Parser.RIGHT, 0); }
		public TerminalNode SET() { return getToken(Swift5Parser.SET, 0); }
		public TerminalNode TYPE() { return getToken(Swift5Parser.TYPE, 0); }
		public TerminalNode UNOWNED() { return getToken(Swift5Parser.UNOWNED, 0); }
		public TerminalNode WEAK() { return getToken(Swift5Parser.WEAK, 0); }
		public TerminalNode WILL_SET() { return getToken(Swift5Parser.WILL_SET, 0); }
		public TerminalNode IN() { return getToken(Swift5Parser.IN, 0); }
		public TerminalNode FOR() { return getToken(Swift5Parser.FOR, 0); }
		public TerminalNode GUARD() { return getToken(Swift5Parser.GUARD, 0); }
		public TerminalNode WHERE() { return getToken(Swift5Parser.WHERE, 0); }
		public TerminalNode DEFAULT() { return getToken(Swift5Parser.DEFAULT, 0); }
		public TerminalNode INTERNAL() { return getToken(Swift5Parser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(Swift5Parser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(Swift5Parser.PUBLIC, 0); }
		public TerminalNode OPEN() { return getToken(Swift5Parser.OPEN, 0); }
		public TerminalNode AS() { return getToken(Swift5Parser.AS, 0); }
		public TerminalNode WHILE() { return getToken(Swift5Parser.WHILE, 0); }
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode SELF_BIG() { return getToken(Swift5Parser.SELF_BIG, 0); }
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public TerminalNode GETTER() { return getToken(Swift5Parser.GETTER, 0); }
		public TerminalNode SETTER() { return getToken(Swift5Parser.SETTER, 0); }
		public TerminalNode OPERATOR() { return getToken(Swift5Parser.OPERATOR, 0); }
		public TerminalNode DO() { return getToken(Swift5Parser.DO, 0); }
		public TerminalNode CATCH() { return getToken(Swift5Parser.CATCH, 0); }
		public TerminalNode Identifier() { return getToken(Swift5Parser.Identifier, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(Swift5Parser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(Swift5Parser.BACKTICK, i);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(Swift5Parser.DOLLAR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_identifier);
		int _la;
		try {
			setState(2682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
			case ALPHA:
			case CATCH:
			case CLASS:
			case DEFAULT:
			case DO:
			case GUARD:
			case FOR:
			case IN:
			case INTERNAL:
			case FINAL:
			case OPEN:
			case PRIVATE:
			case PUBLIC:
			case WHERE:
			case WHILE:
			case PROTOCOL:
			case GET:
			case SET:
			case WILL_SET:
			case DID_SET:
			case INDIRECT:
			case PREFIX:
			case INFIX:
			case LEFT:
			case RIGHT:
			case NONE:
			case PRECEDENCE_GROUP:
			case HIGHER_THAN:
			case LOWER_THAN:
			case ASSIGNMENT:
			case ASSOCIATIVITY:
			case POSTFIX:
			case OPERATOR:
			case OS:
			case ARCH:
			case SWIFT:
			case COMPILER:
			case CAN_IMPORT:
			case TARGET_ENVIRONMENT:
			case CONVENIENCE:
			case DYNAMIC:
			case LAZY:
			case OPTIONAL:
			case OVERRIDE:
			case REQUIRED:
			case WEAK:
			case UNOWNED:
			case SAFE:
			case UNSAFE:
			case MUTATING:
			case NONMUTATING:
			case RED:
			case BLUE:
			case GREEN:
			case RESOURCE_NAME:
			case SOME:
			case TYPE:
			case PRECEDENCE:
			case SELF:
			case SELF_BIG:
			case MAC_OS:
			case I_OS:
			case OSX:
			case WATCH_OS:
			case TV_OS:
			case LINUX:
			case WINDOWS:
			case I386:
			case X86_64:
			case ARM:
			case ARM64:
			case SIMULATOR:
			case MAC_CATALYST:
			case I_OS_APPLICATION_EXTENSION:
			case MAC_CATALYST_APPLICATION_EXTENSION:
			case MAC_OS_APPLICATION_EXTENSION:
			case FILE:
			case LINE:
			case GETTER:
			case SETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2673);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << ALPHA) | (1L << CATCH) | (1L << CLASS) | (1L << DEFAULT) | (1L << DO) | (1L << GUARD) | (1L << FOR) | (1L << IN) | (1L << INTERNAL) | (1L << FINAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << PROTOCOL) | (1L << GET) | (1L << SET) | (1L << WILL_SET) | (1L << DID_SET) | (1L << INDIRECT) | (1L << PREFIX) | (1L << INFIX) | (1L << LEFT) | (1L << RIGHT) | (1L << NONE) | (1L << PRECEDENCE_GROUP) | (1L << HIGHER_THAN) | (1L << LOWER_THAN) | (1L << ASSIGNMENT) | (1L << ASSOCIATIVITY) | (1L << POSTFIX) | (1L << OPERATOR) | (1L << OS) | (1L << ARCH) | (1L << SWIFT) | (1L << COMPILER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CAN_IMPORT - 64)) | (1L << (TARGET_ENVIRONMENT - 64)) | (1L << (CONVENIENCE - 64)) | (1L << (DYNAMIC - 64)) | (1L << (LAZY - 64)) | (1L << (OPTIONAL - 64)) | (1L << (OVERRIDE - 64)) | (1L << (REQUIRED - 64)) | (1L << (WEAK - 64)) | (1L << (UNOWNED - 64)) | (1L << (SAFE - 64)) | (1L << (UNSAFE - 64)) | (1L << (MUTATING - 64)) | (1L << (NONMUTATING - 64)) | (1L << (RED - 64)) | (1L << (BLUE - 64)) | (1L << (GREEN - 64)) | (1L << (RESOURCE_NAME - 64)) | (1L << (SOME - 64)) | (1L << (TYPE - 64)) | (1L << (PRECEDENCE - 64)) | (1L << (SELF - 64)) | (1L << (SELF_BIG - 64)) | (1L << (MAC_OS - 64)) | (1L << (I_OS - 64)) | (1L << (OSX - 64)) | (1L << (WATCH_OS - 64)) | (1L << (TV_OS - 64)) | (1L << (LINUX - 64)) | (1L << (WINDOWS - 64)) | (1L << (I386 - 64)) | (1L << (X86_64 - 64)) | (1L << (ARM - 64)) | (1L << (ARM64 - 64)) | (1L << (SIMULATOR - 64)) | (1L << (MAC_CATALYST - 64)) | (1L << (I_OS_APPLICATION_EXTENSION - 64)) | (1L << (MAC_CATALYST_APPLICATION_EXTENSION - 64)) | (1L << (MAC_OS_APPLICATION_EXTENSION - 64)) | (1L << (FILE - 64)) | (1L << (LINE - 64)))) != 0) || _la==GETTER || _la==SETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2674);
				match(Identifier);
				}
				break;
			case BACKTICK:
				enterOuterAlt(_localctx, 3);
				{
				setState(2675);
				match(BACKTICK);
				setState(2679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AS:
				case BREAK:
				case CASE:
				case CATCH:
				case CLASS:
				case CONTINUE:
				case DEFAULT:
				case DEFER:
				case DO:
				case GUARD:
				case ELSE:
				case ENUM:
				case FOR:
				case FALLTHROUGH:
				case FUNC:
				case IN:
				case IF:
				case IMPORT:
				case INTERNAL:
				case OPEN:
				case PRIVATE:
				case PUBLIC:
				case WHERE:
				case WHILE:
				case LET:
				case VAR:
				case PROTOCOL:
				case REPEAT:
				case SWITCH:
				case STRUCT:
				case RETURN:
				case THROW:
				case THROWS:
				case RETHROWS:
				case INIT:
				case DEINIT:
				case ASSOCIATED_TYPE:
				case EXTENSION:
				case SUBSCRIPT:
				case OPERATOR:
				case TYPEALIAS:
				case STATIC:
				case FILE_PRIVATE:
				case IS:
				case TRY:
				case SUPER:
				case ANY:
				case FALSE:
				case TRUE:
				case NIL:
				case INOUT:
				case SELF:
				case SELF_BIG:
				case SOURCE_LOCATION:
				case ERROR:
				case WARNING:
				case AVAILABLE:
				case HASH_IF:
				case HASH_ELSEIF:
				case HASH_ELSE:
				case HASH_ENDIF:
				case HASH_FILE:
				case HASH_FILE_ID:
				case HASH_FILE_PATH:
				case HASH_LINE:
				case HASH_COLUMN:
				case HASH_FUNCTION:
				case HASH_SELECTOR:
				case HASH_COLOR_LITERAL:
				case HASH_FILE_LITERAL:
				case HASH_IMAGE_LITERAL:
				case UNDERSCORE:
					{
					setState(2676);
					keyword();
					}
					break;
				case Identifier:
					{
					setState(2677);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(2678);
					match(DOLLAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2681);
				match(BACKTICK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_identifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2684);
			identifier();
			setState(2689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2685);
					match(COMMA);
					setState(2686);
					identifier();
					}
					} 
				}
				setState(2691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ASSOCIATED_TYPE() { return getToken(Swift5Parser.ASSOCIATED_TYPE, 0); }
		public TerminalNode CLASS() { return getToken(Swift5Parser.CLASS, 0); }
		public TerminalNode DEINIT() { return getToken(Swift5Parser.DEINIT, 0); }
		public TerminalNode ENUM() { return getToken(Swift5Parser.ENUM, 0); }
		public TerminalNode EXTENSION() { return getToken(Swift5Parser.EXTENSION, 0); }
		public TerminalNode FILE_PRIVATE() { return getToken(Swift5Parser.FILE_PRIVATE, 0); }
		public TerminalNode FUNC() { return getToken(Swift5Parser.FUNC, 0); }
		public TerminalNode IMPORT() { return getToken(Swift5Parser.IMPORT, 0); }
		public TerminalNode INIT() { return getToken(Swift5Parser.INIT, 0); }
		public TerminalNode INOUT() { return getToken(Swift5Parser.INOUT, 0); }
		public TerminalNode INTERNAL() { return getToken(Swift5Parser.INTERNAL, 0); }
		public TerminalNode LET() { return getToken(Swift5Parser.LET, 0); }
		public TerminalNode OPEN() { return getToken(Swift5Parser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(Swift5Parser.OPERATOR, 0); }
		public TerminalNode PRIVATE() { return getToken(Swift5Parser.PRIVATE, 0); }
		public TerminalNode PROTOCOL() { return getToken(Swift5Parser.PROTOCOL, 0); }
		public TerminalNode PUBLIC() { return getToken(Swift5Parser.PUBLIC, 0); }
		public TerminalNode RETHROWS() { return getToken(Swift5Parser.RETHROWS, 0); }
		public TerminalNode STATIC() { return getToken(Swift5Parser.STATIC, 0); }
		public TerminalNode STRUCT() { return getToken(Swift5Parser.STRUCT, 0); }
		public TerminalNode SUBSCRIPT() { return getToken(Swift5Parser.SUBSCRIPT, 0); }
		public TerminalNode TYPEALIAS() { return getToken(Swift5Parser.TYPEALIAS, 0); }
		public TerminalNode VAR() { return getToken(Swift5Parser.VAR, 0); }
		public TerminalNode BREAK() { return getToken(Swift5Parser.BREAK, 0); }
		public TerminalNode CASE() { return getToken(Swift5Parser.CASE, 0); }
		public TerminalNode CONTINUE() { return getToken(Swift5Parser.CONTINUE, 0); }
		public TerminalNode DEFAULT() { return getToken(Swift5Parser.DEFAULT, 0); }
		public TerminalNode DEFER() { return getToken(Swift5Parser.DEFER, 0); }
		public TerminalNode DO() { return getToken(Swift5Parser.DO, 0); }
		public TerminalNode ELSE() { return getToken(Swift5Parser.ELSE, 0); }
		public TerminalNode FALLTHROUGH() { return getToken(Swift5Parser.FALLTHROUGH, 0); }
		public TerminalNode FOR() { return getToken(Swift5Parser.FOR, 0); }
		public TerminalNode GUARD() { return getToken(Swift5Parser.GUARD, 0); }
		public TerminalNode IF() { return getToken(Swift5Parser.IF, 0); }
		public TerminalNode IN() { return getToken(Swift5Parser.IN, 0); }
		public TerminalNode REPEAT() { return getToken(Swift5Parser.REPEAT, 0); }
		public TerminalNode RETURN() { return getToken(Swift5Parser.RETURN, 0); }
		public TerminalNode SWITCH() { return getToken(Swift5Parser.SWITCH, 0); }
		public TerminalNode WHERE() { return getToken(Swift5Parser.WHERE, 0); }
		public TerminalNode WHILE() { return getToken(Swift5Parser.WHILE, 0); }
		public TerminalNode AS() { return getToken(Swift5Parser.AS, 0); }
		public TerminalNode ANY() { return getToken(Swift5Parser.ANY, 0); }
		public TerminalNode CATCH() { return getToken(Swift5Parser.CATCH, 0); }
		public TerminalNode FALSE() { return getToken(Swift5Parser.FALSE, 0); }
		public TerminalNode IS() { return getToken(Swift5Parser.IS, 0); }
		public TerminalNode NIL() { return getToken(Swift5Parser.NIL, 0); }
		public TerminalNode SUPER() { return getToken(Swift5Parser.SUPER, 0); }
		public TerminalNode SELF() { return getToken(Swift5Parser.SELF, 0); }
		public TerminalNode SELF_BIG() { return getToken(Swift5Parser.SELF_BIG, 0); }
		public TerminalNode THROW() { return getToken(Swift5Parser.THROW, 0); }
		public TerminalNode THROWS() { return getToken(Swift5Parser.THROWS, 0); }
		public TerminalNode TRUE() { return getToken(Swift5Parser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(Swift5Parser.TRY, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Swift5Parser.UNDERSCORE, 0); }
		public TerminalNode AVAILABLE() { return getToken(Swift5Parser.AVAILABLE, 0); }
		public TerminalNode HASH_COLOR_LITERAL() { return getToken(Swift5Parser.HASH_COLOR_LITERAL, 0); }
		public TerminalNode HASH_COLUMN() { return getToken(Swift5Parser.HASH_COLUMN, 0); }
		public TerminalNode HASH_ELSE() { return getToken(Swift5Parser.HASH_ELSE, 0); }
		public TerminalNode HASH_ELSEIF() { return getToken(Swift5Parser.HASH_ELSEIF, 0); }
		public TerminalNode HASH_ENDIF() { return getToken(Swift5Parser.HASH_ENDIF, 0); }
		public TerminalNode ERROR() { return getToken(Swift5Parser.ERROR, 0); }
		public TerminalNode HASH_FILE() { return getToken(Swift5Parser.HASH_FILE, 0); }
		public TerminalNode HASH_FILE_ID() { return getToken(Swift5Parser.HASH_FILE_ID, 0); }
		public TerminalNode HASH_FILE_LITERAL() { return getToken(Swift5Parser.HASH_FILE_LITERAL, 0); }
		public TerminalNode HASH_FILE_PATH() { return getToken(Swift5Parser.HASH_FILE_PATH, 0); }
		public TerminalNode HASH_FUNCTION() { return getToken(Swift5Parser.HASH_FUNCTION, 0); }
		public TerminalNode HASH_IF() { return getToken(Swift5Parser.HASH_IF, 0); }
		public TerminalNode HASH_IMAGE_LITERAL() { return getToken(Swift5Parser.HASH_IMAGE_LITERAL, 0); }
		public TerminalNode HASH_LINE() { return getToken(Swift5Parser.HASH_LINE, 0); }
		public TerminalNode HASH_SELECTOR() { return getToken(Swift5Parser.HASH_SELECTOR, 0); }
		public TerminalNode SOURCE_LOCATION() { return getToken(Swift5Parser.SOURCE_LOCATION, 0); }
		public TerminalNode WARNING() { return getToken(Swift5Parser.WARNING, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 570, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2692);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AS) | (1L << BREAK) | (1L << CASE) | (1L << CATCH) | (1L << CLASS) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DEFER) | (1L << DO) | (1L << GUARD) | (1L << ELSE) | (1L << ENUM) | (1L << FOR) | (1L << FALLTHROUGH) | (1L << FUNC) | (1L << IN) | (1L << IF) | (1L << IMPORT) | (1L << INTERNAL) | (1L << OPEN) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << WHERE) | (1L << WHILE) | (1L << LET) | (1L << VAR) | (1L << PROTOCOL) | (1L << REPEAT) | (1L << SWITCH) | (1L << STRUCT) | (1L << RETURN) | (1L << THROW) | (1L << THROWS) | (1L << RETHROWS) | (1L << INIT) | (1L << DEINIT) | (1L << ASSOCIATED_TYPE) | (1L << EXTENSION) | (1L << SUBSCRIPT) | (1L << OPERATOR) | (1L << TYPEALIAS))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (STATIC - 72)) | (1L << (FILE_PRIVATE - 72)) | (1L << (IS - 72)) | (1L << (TRY - 72)) | (1L << (SUPER - 72)) | (1L << (ANY - 72)) | (1L << (FALSE - 72)) | (1L << (TRUE - 72)) | (1L << (NIL - 72)) | (1L << (INOUT - 72)) | (1L << (SELF - 72)) | (1L << (SELF_BIG - 72)) | (1L << (SOURCE_LOCATION - 72)) | (1L << (ERROR - 72)) | (1L << (WARNING - 72)) | (1L << (AVAILABLE - 72)) | (1L << (HASH_IF - 72)) | (1L << (HASH_ELSEIF - 72)) | (1L << (HASH_ELSE - 72)) | (1L << (HASH_ENDIF - 72)) | (1L << (HASH_FILE - 72)) | (1L << (HASH_FILE_ID - 72)) | (1L << (HASH_FILE_PATH - 72)) | (1L << (HASH_LINE - 72)) | (1L << (HASH_COLUMN - 72)) | (1L << (HASH_FUNCTION - 72)) | (1L << (HASH_SELECTOR - 72)) | (1L << (HASH_COLOR_LITERAL - 72)) | (1L << (HASH_FILE_LITERAL - 72)) | (1L << (HASH_IMAGE_LITERAL - 72)))) != 0) || _la==UNDERSCORE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 572, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2694);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2695);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negate_prefix_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift5Parser.SUB, 0); }
		public Negate_prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterNegate_prefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitNegate_prefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitNegate_prefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_prefix_operatorContext negate_prefix_operator() throws RecognitionException {
		Negate_prefix_operatorContext _localctx = new Negate_prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 574, RULE_negate_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2698);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_condition_ANDContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(Swift5Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Swift5Parser.AND, i);
		}
		public Compilation_condition_ANDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_AND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompilation_condition_AND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompilation_condition_AND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompilation_condition_AND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_ANDContext compilation_condition_AND() throws RecognitionException {
		Compilation_condition_ANDContext _localctx = new Compilation_condition_ANDContext(_ctx, getState());
		enterRule(_localctx, 576, RULE_compilation_condition_AND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2700);
			if (!(SwiftSupport.isOperator(_input,"&&"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"&&\")");
			setState(2701);
			match(AND);
			setState(2702);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_condition_ORContext extends ParserRuleContext {
		public List<TerminalNode> OR() { return getTokens(Swift5Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Swift5Parser.OR, i);
		}
		public Compilation_condition_ORContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_OR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompilation_condition_OR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompilation_condition_OR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompilation_condition_OR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_ORContext compilation_condition_OR() throws RecognitionException {
		Compilation_condition_ORContext _localctx = new Compilation_condition_ORContext(_ctx, getState());
		enterRule(_localctx, 578, RULE_compilation_condition_OR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
			if (!(SwiftSupport.isOperator(_input,"||"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"||\")");
			setState(2705);
			match(OR);
			setState(2706);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_condition_GEContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(Swift5Parser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public Compilation_condition_GEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_GE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompilation_condition_GE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompilation_condition_GE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompilation_condition_GE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_GEContext compilation_condition_GE() throws RecognitionException {
		Compilation_condition_GEContext _localctx = new Compilation_condition_GEContext(_ctx, getState());
		enterRule(_localctx, 580, RULE_compilation_condition_GE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2708);
			if (!(SwiftSupport.isOperator(_input,">="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\">=\")");
			setState(2709);
			match(GT);
			setState(2710);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compilation_condition_LContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Swift5Parser.LT, 0); }
		public Compilation_condition_LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_condition_L; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterCompilation_condition_L(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitCompilation_condition_L(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitCompilation_condition_L(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_condition_LContext compilation_condition_L() throws RecognitionException {
		Compilation_condition_LContext _localctx = new Compilation_condition_LContext(_ctx, getState());
		enterRule(_localctx, 582, RULE_compilation_condition_L);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2712);
			if (!(SwiftSupport.isOperator(_input,"<"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"<\")");
			setState(2713);
			match(LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arrow_operatorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(Swift5Parser.SUB, 0); }
		public TerminalNode GT() { return getToken(Swift5Parser.GT, 0); }
		public Arrow_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterArrow_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitArrow_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitArrow_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_operatorContext arrow_operator() throws RecognitionException {
		Arrow_operatorContext _localctx = new Arrow_operatorContext(_ctx, getState());
		enterRule(_localctx, 584, RULE_arrow_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2715);
			if (!(SwiftSupport.isOperator(_input,"->"))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"->\")");
			setState(2716);
			match(SUB);
			setState(2717);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_operatorContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Swift5Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Swift5Parser.DOT, i);
		}
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 586, RULE_range_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2719);
			if (!(SwiftSupport.isOperator(_input,"..."))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"...\")");
			setState(2720);
			match(DOT);
			setState(2721);
			match(DOT);
			setState(2722);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_equalsContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(Swift5Parser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(Swift5Parser.EQUAL, i);
		}
		public Same_type_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterSame_type_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitSame_type_equals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitSame_type_equals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_equalsContext same_type_equals() throws RecognitionException {
		Same_type_equalsContext _localctx = new Same_type_equalsContext(_ctx, getState());
		enterRule(_localctx, 588, RULE_same_type_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			if (!(SwiftSupport.isOperator(_input,"=="))) throw new FailedPredicateException(this, "SwiftSupport.isOperator(_input,\"==\")");
			setState(2725);
			match(EQUAL);
			setState(2726);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 590, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2728);
			if (!(SwiftSupport.isBinaryOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isBinaryOp(_input)");
			setState(2729);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 592, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731);
			if (!(SwiftSupport.isPrefixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPrefixOp(_input)");
			setState(2732);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 594, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2734);
			if (!(SwiftSupport.isPostfixOp(_input))) throw new FailedPredicateException(this, "SwiftSupport.isPostfixOp(_input)");
			setState(2735);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public Operator_charactersContext operator_characters() {
			return getRuleContext(Operator_charactersContext.class,0);
		}
		public Dot_operator_headContext dot_operator_head() {
			return getRuleContext(Dot_operator_headContext.class,0);
		}
		public Dot_operator_charactersContext dot_operator_characters() {
			return getRuleContext(Dot_operator_charactersContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 596, RULE_operator);
		try {
			setState(2744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2737);
				operator_head();
				setState(2739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2738);
					operator_characters();
					}
					break;
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2741);
				dot_operator_head();
				setState(2742);
				dot_operator_characters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_headContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(Swift5Parser.DIV, 0); }
		public TerminalNode EQUAL() { return getToken(Swift5Parser.EQUAL, 0); }
		public TerminalNode SUB() { return getToken(Swift5Parser.SUB, 0); }
		public TerminalNode ADD() { return getToken(Swift5Parser.ADD, 0); }
		public TerminalNode BANG() { return getToken(Swift5Parser.BANG, 0); }
		public TerminalNode MUL() { return getToken(Swift5Parser.MUL, 0); }
		public TerminalNode MOD() { return getToken(Swift5Parser.MOD, 0); }
		public TerminalNode AND() { return getToken(Swift5Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Swift5Parser.OR, 0); }
		public TerminalNode LT() { return getToken(Swift5Parser.LT, 0); }
		public TerminalNode GT() { return getToken(Swift5Parser.GT, 0); }
		public TerminalNode CARET() { return getToken(Swift5Parser.CARET, 0); }
		public TerminalNode TILDE() { return getToken(Swift5Parser.TILDE, 0); }
		public TerminalNode QUESTION() { return getToken(Swift5Parser.QUESTION, 0); }
		public TerminalNode Operator_head_other() { return getToken(Swift5Parser.Operator_head_other, 0); }
		public Operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_headContext operator_head() throws RecognitionException {
		Operator_headContext _localctx = new Operator_headContext(_ctx, getState());
		enterRule(_localctx, 598, RULE_operator_head);
		int _la;
		try {
			setState(2748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2746);
				_la = _input.LA(1);
				if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (LT - 148)) | (1L << (GT - 148)) | (1L << (BANG - 148)) | (1L << (QUESTION - 148)) | (1L << (AND - 148)) | (1L << (SUB - 148)) | (1L << (EQUAL - 148)) | (1L << (OR - 148)) | (1L << (DIV - 148)) | (1L << (ADD - 148)) | (1L << (MUL - 148)) | (1L << (MOD - 148)) | (1L << (CARET - 148)) | (1L << (TILDE - 148)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Operator_head_other:
				enterOuterAlt(_localctx, 2);
				{
				setState(2747);
				match(Operator_head_other);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_characterContext extends ParserRuleContext {
		public Operator_headContext operator_head() {
			return getRuleContext(Operator_headContext.class,0);
		}
		public TerminalNode Operator_following_character() { return getToken(Swift5Parser.Operator_following_character, 0); }
		public Operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_characterContext operator_character() throws RecognitionException {
		Operator_characterContext _localctx = new Operator_characterContext(_ctx, getState());
		enterRule(_localctx, 600, RULE_operator_character);
		try {
			setState(2752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
				enterOuterAlt(_localctx, 1);
				{
				setState(2750);
				operator_head();
				}
				break;
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2751);
				match(Operator_following_character);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_charactersContext extends ParserRuleContext {
		public List<Operator_characterContext> operator_character() {
			return getRuleContexts(Operator_characterContext.class);
		}
		public Operator_characterContext operator_character(int i) {
			return getRuleContext(Operator_characterContext.class,i);
		}
		public Operator_charactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterOperator_characters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitOperator_characters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitOperator_characters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_charactersContext operator_characters() throws RecognitionException {
		Operator_charactersContext _localctx = new Operator_charactersContext(_ctx, getState());
		enterRule(_localctx, 602, RULE_operator_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2756); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2754);
					if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
					setState(2755);
					operator_character();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2758); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_headContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Dot_operator_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDot_operator_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDot_operator_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDot_operator_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_headContext dot_operator_head() throws RecognitionException {
		Dot_operator_headContext _localctx = new Dot_operator_headContext(_ctx, getState());
		enterRule(_localctx, 604, RULE_dot_operator_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2760);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_characterContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Swift5Parser.DOT, 0); }
		public Operator_characterContext operator_character() {
			return getRuleContext(Operator_characterContext.class,0);
		}
		public Dot_operator_characterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDot_operator_character(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDot_operator_character(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDot_operator_character(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_characterContext dot_operator_character() throws RecognitionException {
		Dot_operator_characterContext _localctx = new Dot_operator_characterContext(_ctx, getState());
		enterRule(_localctx, 606, RULE_dot_operator_character);
		try {
			setState(2764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2762);
				match(DOT);
				}
				break;
			case LT:
			case GT:
			case BANG:
			case QUESTION:
			case AND:
			case SUB:
			case EQUAL:
			case OR:
			case DIV:
			case ADD:
			case MUL:
			case MOD:
			case CARET:
			case TILDE:
			case Operator_head_other:
			case Operator_following_character:
				enterOuterAlt(_localctx, 2);
				{
				setState(2763);
				operator_character();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_operator_charactersContext extends ParserRuleContext {
		public List<Dot_operator_characterContext> dot_operator_character() {
			return getRuleContexts(Dot_operator_characterContext.class);
		}
		public Dot_operator_characterContext dot_operator_character(int i) {
			return getRuleContext(Dot_operator_characterContext.class,i);
		}
		public Dot_operator_charactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_operator_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterDot_operator_characters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitDot_operator_characters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitDot_operator_characters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_operator_charactersContext dot_operator_characters() throws RecognitionException {
		Dot_operator_charactersContext _localctx = new Dot_operator_charactersContext(_ctx, getState());
		enterRule(_localctx, 608, RULE_dot_operator_characters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2768); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2766);
					if (!(_input.get(_input.index()-1).getType()!=WS)) throw new FailedPredicateException(this, "_input.get(_input.index()-1).getType()!=WS");
					setState(2767);
					dot_operator_character();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2770); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,338,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Nil_literalContext nil_literal() {
			return getRuleContext(Nil_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 610, RULE_literal);
		try {
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2772);
				numeric_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2773);
				string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2774);
				boolean_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2775);
				nil_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Negate_prefix_operatorContext negate_prefix_operator() {
			return getRuleContext(Negate_prefix_operatorContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(Swift5Parser.Floating_point_literal, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 612, RULE_numeric_literal);
		try {
			setState(2786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2778);
					negate_prefix_operator();
					}
					break;
				}
				setState(2781);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2782);
					negate_prefix_operator();
					}
					break;
				}
				setState(2785);
				match(Floating_point_literal);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Swift5Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Swift5Parser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 614, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nil_literalContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(Swift5Parser.NIL, 0); }
		public Nil_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterNil_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitNil_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitNil_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nil_literalContext nil_literal() throws RecognitionException {
		Nil_literalContext _localctx = new Nil_literalContext(_ctx, getState());
		enterRule(_localctx, 616, RULE_nil_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			match(NIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Decimal_digits() { return getToken(Swift5Parser.Decimal_digits, 0); }
		public TerminalNode Decimal_literal() { return getToken(Swift5Parser.Decimal_literal, 0); }
		public TerminalNode Binary_literal() { return getToken(Swift5Parser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(Swift5Parser.Octal_literal, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(Swift5Parser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 618, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			_la = _input.LA(1);
			if ( !(((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (Binary_literal - 170)) | (1L << (Octal_literal - 170)) | (1L << (Decimal_digits - 170)) | (1L << (Decimal_literal - 170)) | (1L << (Hexadecimal_literal - 170)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public Extended_string_literalContext extended_string_literal() {
			return getRuleContext(Extended_string_literalContext.class,0);
		}
		public Interpolated_string_literalContext interpolated_string_literal() {
			return getRuleContext(Interpolated_string_literalContext.class,0);
		}
		public Static_string_literalContext static_string_literal() {
			return getRuleContext(Static_string_literalContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 620, RULE_string_literal);
		try {
			setState(2797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2794);
				extended_string_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2795);
				interpolated_string_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2796);
				static_string_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extended_string_literalContext extends ParserRuleContext {
		public TerminalNode Multi_line_extended_string_open() { return getToken(Swift5Parser.Multi_line_extended_string_open, 0); }
		public TerminalNode Multi_line_extended_string_close() { return getToken(Swift5Parser.Multi_line_extended_string_close, 0); }
		public List<TerminalNode> Quoted_multi_line_extended_text() { return getTokens(Swift5Parser.Quoted_multi_line_extended_text); }
		public TerminalNode Quoted_multi_line_extended_text(int i) {
			return getToken(Swift5Parser.Quoted_multi_line_extended_text, i);
		}
		public TerminalNode Single_line_extended_string_open() { return getToken(Swift5Parser.Single_line_extended_string_open, 0); }
		public TerminalNode Single_line_extended_string_close() { return getToken(Swift5Parser.Single_line_extended_string_close, 0); }
		public List<TerminalNode> Quoted_single_line_extended_text() { return getTokens(Swift5Parser.Quoted_single_line_extended_text); }
		public TerminalNode Quoted_single_line_extended_text(int i) {
			return getToken(Swift5Parser.Quoted_single_line_extended_text, i);
		}
		public Extended_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extended_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterExtended_string_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitExtended_string_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitExtended_string_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extended_string_literalContext extended_string_literal() throws RecognitionException {
		Extended_string_literalContext _localctx = new Extended_string_literalContext(_ctx, getState());
		enterRule(_localctx, 622, RULE_extended_string_literal);
		int _la;
		try {
			setState(2813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multi_line_extended_string_open:
				enterOuterAlt(_localctx, 1);
				{
				setState(2799);
				match(Multi_line_extended_string_open);
				setState(2801); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2800);
					match(Quoted_multi_line_extended_text);
					}
					}
					setState(2803); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Quoted_multi_line_extended_text );
				setState(2805);
				match(Multi_line_extended_string_close);
				}
				break;
			case Single_line_extended_string_open:
				enterOuterAlt(_localctx, 2);
				{
				setState(2806);
				match(Single_line_extended_string_open);
				setState(2808); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2807);
					match(Quoted_single_line_extended_text);
					}
					}
					setState(2810); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Quoted_single_line_extended_text );
				setState(2812);
				match(Single_line_extended_string_close);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_string_literalContext extends ParserRuleContext {
		public TerminalNode Single_line_string_open() { return getToken(Swift5Parser.Single_line_string_open, 0); }
		public TerminalNode Single_line_string_close() { return getToken(Swift5Parser.Single_line_string_close, 0); }
		public List<TerminalNode> Quoted_single_line_text() { return getTokens(Swift5Parser.Quoted_single_line_text); }
		public TerminalNode Quoted_single_line_text(int i) {
			return getToken(Swift5Parser.Quoted_single_line_text, i);
		}
		public TerminalNode Multi_line_string_open() { return getToken(Swift5Parser.Multi_line_string_open, 0); }
		public TerminalNode Multi_line_string_close() { return getToken(Swift5Parser.Multi_line_string_close, 0); }
		public List<TerminalNode> Quoted_multi_line_text() { return getTokens(Swift5Parser.Quoted_multi_line_text); }
		public TerminalNode Quoted_multi_line_text(int i) {
			return getToken(Swift5Parser.Quoted_multi_line_text, i);
		}
		public Static_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterStatic_string_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitStatic_string_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitStatic_string_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Static_string_literalContext static_string_literal() throws RecognitionException {
		Static_string_literalContext _localctx = new Static_string_literalContext(_ctx, getState());
		enterRule(_localctx, 624, RULE_static_string_literal);
		int _la;
		try {
			setState(2831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_line_string_open:
				enterOuterAlt(_localctx, 1);
				{
				setState(2815);
				match(Single_line_string_open);
				setState(2819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Quoted_single_line_text) {
					{
					{
					setState(2816);
					match(Quoted_single_line_text);
					}
					}
					setState(2821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2822);
				match(Single_line_string_close);
				}
				break;
			case Multi_line_string_open:
				enterOuterAlt(_localctx, 2);
				{
				setState(2823);
				match(Multi_line_string_open);
				setState(2827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Quoted_multi_line_text) {
					{
					{
					setState(2824);
					match(Quoted_multi_line_text);
					}
					}
					setState(2829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2830);
				match(Multi_line_string_close);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_string_literalContext extends ParserRuleContext {
		public TerminalNode Single_line_string_open() { return getToken(Swift5Parser.Single_line_string_open, 0); }
		public TerminalNode Single_line_string_close() { return getToken(Swift5Parser.Single_line_string_close, 0); }
		public List<TerminalNode> Quoted_single_line_text() { return getTokens(Swift5Parser.Quoted_single_line_text); }
		public TerminalNode Quoted_single_line_text(int i) {
			return getToken(Swift5Parser.Quoted_single_line_text, i);
		}
		public List<TerminalNode> Interpolataion_single_line() { return getTokens(Swift5Parser.Interpolataion_single_line); }
		public TerminalNode Interpolataion_single_line(int i) {
			return getToken(Swift5Parser.Interpolataion_single_line, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Swift5Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Swift5Parser.RPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Swift5Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Swift5Parser.COMMA, i);
		}
		public List<Tuple_element_listContext> tuple_element_list() {
			return getRuleContexts(Tuple_element_listContext.class);
		}
		public Tuple_element_listContext tuple_element_list(int i) {
			return getRuleContext(Tuple_element_listContext.class,i);
		}
		public TerminalNode Multi_line_string_open() { return getToken(Swift5Parser.Multi_line_string_open, 0); }
		public TerminalNode Multi_line_string_close() { return getToken(Swift5Parser.Multi_line_string_close, 0); }
		public List<TerminalNode> Quoted_multi_line_text() { return getTokens(Swift5Parser.Quoted_multi_line_text); }
		public TerminalNode Quoted_multi_line_text(int i) {
			return getToken(Swift5Parser.Quoted_multi_line_text, i);
		}
		public List<TerminalNode> Interpolataion_multi_line() { return getTokens(Swift5Parser.Interpolataion_multi_line); }
		public TerminalNode Interpolataion_multi_line(int i) {
			return getToken(Swift5Parser.Interpolataion_multi_line, i);
		}
		public Interpolated_string_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).enterInterpolated_string_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Swift5ParserListener ) ((Swift5ParserListener)listener).exitInterpolated_string_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Swift5ParserVisitor ) return ((Swift5ParserVisitor<? extends T>)visitor).visitInterpolated_string_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_string_literalContext interpolated_string_literal() throws RecognitionException {
		Interpolated_string_literalContext _localctx = new Interpolated_string_literalContext(_ctx, getState());
		enterRule(_localctx, 626, RULE_interpolated_string_literal);
		int _la;
		try {
			setState(2869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Single_line_string_open:
				enterOuterAlt(_localctx, 1);
				{
				setState(2833);
				match(Single_line_string_open);
				setState(2847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Interpolataion_single_line || _la==Quoted_single_line_text) {
					{
					setState(2845);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Quoted_single_line_text:
						{
						setState(2834);
						match(Quoted_single_line_text);
						}
						break;
					case Interpolataion_single_line:
						{
						setState(2835);
						match(Interpolataion_single_line);
						setState(2841);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
						case 1:
							{
							setState(2836);
							expression();
							}
							break;
						case 2:
							{
							setState(2837);
							tuple_element();
							setState(2838);
							match(COMMA);
							setState(2839);
							tuple_element_list();
							}
							break;
						}
						setState(2843);
						match(RPAREN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2850);
				match(Single_line_string_close);
				}
				break;
			case Multi_line_string_open:
				enterOuterAlt(_localctx, 2);
				{
				setState(2851);
				match(Multi_line_string_open);
				setState(2865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Interpolataion_multi_line || _la==Quoted_multi_line_text) {
					{
					setState(2863);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Quoted_multi_line_text:
						{
						setState(2852);
						match(Quoted_multi_line_text);
						}
						break;
					case Interpolataion_multi_line:
						{
						setState(2853);
						match(Interpolataion_multi_line);
						setState(2859);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
						case 1:
							{
							setState(2854);
							expression();
							}
							break;
						case 2:
							{
							setState(2855);
							tuple_element();
							setState(2856);
							match(COMMA);
							setState(2857);
							tuple_element_list();
							}
							break;
						}
						setState(2861);
						match(RPAREN);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2868);
				match(Multi_line_string_close);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 49:
			return compilation_condition_sempred((Compilation_conditionContext)_localctx, predIndex);
		case 184:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 200:
			return balanced_token_punctuation_sempred((Balanced_token_punctuationContext)_localctx, predIndex);
		case 251:
			return forced_value_suffix_sempred((Forced_value_suffixContext)_localctx, predIndex);
		case 252:
			return optional_chaining_suffix_sempred((Optional_chaining_suffixContext)_localctx, predIndex);
		case 261:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 277:
			return trailing_composition_and_sempred((Trailing_composition_andContext)_localctx, predIndex);
		case 286:
			return assignment_operator_sempred((Assignment_operatorContext)_localctx, predIndex);
		case 287:
			return negate_prefix_operator_sempred((Negate_prefix_operatorContext)_localctx, predIndex);
		case 288:
			return compilation_condition_AND_sempred((Compilation_condition_ANDContext)_localctx, predIndex);
		case 289:
			return compilation_condition_OR_sempred((Compilation_condition_ORContext)_localctx, predIndex);
		case 290:
			return compilation_condition_GE_sempred((Compilation_condition_GEContext)_localctx, predIndex);
		case 291:
			return compilation_condition_L_sempred((Compilation_condition_LContext)_localctx, predIndex);
		case 292:
			return arrow_operator_sempred((Arrow_operatorContext)_localctx, predIndex);
		case 293:
			return range_operator_sempred((Range_operatorContext)_localctx, predIndex);
		case 294:
			return same_type_equals_sempred((Same_type_equalsContext)_localctx, predIndex);
		case 295:
			return binary_operator_sempred((Binary_operatorContext)_localctx, predIndex);
		case 296:
			return prefix_operator_sempred((Prefix_operatorContext)_localctx, predIndex);
		case 297:
			return postfix_operator_sempred((Postfix_operatorContext)_localctx, predIndex);
		case 301:
			return operator_characters_sempred((Operator_charactersContext)_localctx, predIndex);
		case 304:
			return dot_operator_characters_sempred((Dot_operator_charactersContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return SwiftSupport.isSeparatedStatement(_input, _localctx.indexBefore);
		}
		return true;
	}
	private boolean compilation_condition_sempred(Compilation_conditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean balanced_token_punctuation_sempred(Balanced_token_punctuationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return SwiftSupport.isPrefixOp(_input);
		case 4:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean forced_value_suffix_sempred(Forced_value_suffixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean optional_chaining_suffix_sempred(Optional_chaining_suffixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return !SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return !SwiftSupport.isBinaryOp(_input);
		case 9:
			return !SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean trailing_composition_and_sempred(Trailing_composition_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean assignment_operator_sempred(Assignment_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean negate_prefix_operator_sempred(Negate_prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean compilation_condition_AND_sempred(Compilation_condition_ANDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return SwiftSupport.isOperator(_input,"&&");
		}
		return true;
	}
	private boolean compilation_condition_OR_sempred(Compilation_condition_ORContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return SwiftSupport.isOperator(_input,"||");
		}
		return true;
	}
	private boolean compilation_condition_GE_sempred(Compilation_condition_GEContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return SwiftSupport.isOperator(_input,">=");
		}
		return true;
	}
	private boolean compilation_condition_L_sempred(Compilation_condition_LContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return SwiftSupport.isOperator(_input,"<");
		}
		return true;
	}
	private boolean arrow_operator_sempred(Arrow_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SwiftSupport.isOperator(_input,"->");
		}
		return true;
	}
	private boolean range_operator_sempred(Range_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return SwiftSupport.isOperator(_input,"...");
		}
		return true;
	}
	private boolean same_type_equals_sempred(Same_type_equalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SwiftSupport.isOperator(_input,"==");
		}
		return true;
	}
	private boolean binary_operator_sempred(Binary_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return SwiftSupport.isBinaryOp(_input);
		}
		return true;
	}
	private boolean prefix_operator_sempred(Prefix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return SwiftSupport.isPrefixOp(_input);
		}
		return true;
	}
	private boolean postfix_operator_sempred(Postfix_operatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return SwiftSupport.isPostfixOp(_input);
		}
		return true;
	}
	private boolean operator_characters_sempred(Operator_charactersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}
	private boolean dot_operator_characters_sempred(Dot_operator_charactersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return _input.get(_input.index()-1).getType()!=WS;
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00c1\u0b38\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007"+
		"\u00e3\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007"+
		"\u00e6\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007"+
		"\u00e9\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007"+
		"\u00ec\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007"+
		"\u00ef\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007"+
		"\u00f2\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007"+
		"\u00f5\u0002\u00f6\u0007\u00f6\u0002\u00f7\u0007\u00f7\u0002\u00f8\u0007"+
		"\u00f8\u0002\u00f9\u0007\u00f9\u0002\u00fa\u0007\u00fa\u0002\u00fb\u0007"+
		"\u00fb\u0002\u00fc\u0007\u00fc\u0002\u00fd\u0007\u00fd\u0002\u00fe\u0007"+
		"\u00fe\u0002\u00ff\u0007\u00ff\u0002\u0100\u0007\u0100\u0002\u0101\u0007"+
		"\u0101\u0002\u0102\u0007\u0102\u0002\u0103\u0007\u0103\u0002\u0104\u0007"+
		"\u0104\u0002\u0105\u0007\u0105\u0002\u0106\u0007\u0106\u0002\u0107\u0007"+
		"\u0107\u0002\u0108\u0007\u0108\u0002\u0109\u0007\u0109\u0002\u010a\u0007"+
		"\u010a\u0002\u010b\u0007\u010b\u0002\u010c\u0007\u010c\u0002\u010d\u0007"+
		"\u010d\u0002\u010e\u0007\u010e\u0002\u010f\u0007\u010f\u0002\u0110\u0007"+
		"\u0110\u0002\u0111\u0007\u0111\u0002\u0112\u0007\u0112\u0002\u0113\u0007"+
		"\u0113\u0002\u0114\u0007\u0114\u0002\u0115\u0007\u0115\u0002\u0116\u0007"+
		"\u0116\u0002\u0117\u0007\u0117\u0002\u0118\u0007\u0118\u0002\u0119\u0007"+
		"\u0119\u0002\u011a\u0007\u011a\u0002\u011b\u0007\u011b\u0002\u011c\u0007"+
		"\u011c\u0002\u011d\u0007\u011d\u0002\u011e\u0007\u011e\u0002\u011f\u0007"+
		"\u011f\u0002\u0120\u0007\u0120\u0002\u0121\u0007\u0121\u0002\u0122\u0007"+
		"\u0122\u0002\u0123\u0007\u0123\u0002\u0124\u0007\u0124\u0002\u0125\u0007"+
		"\u0125\u0002\u0126\u0007\u0126\u0002\u0127\u0007\u0127\u0002\u0128\u0007"+
		"\u0128\u0002\u0129\u0007\u0129\u0002\u012a\u0007\u012a\u0002\u012b\u0007"+
		"\u012b\u0002\u012c\u0007\u012c\u0002\u012d\u0007\u012d\u0002\u012e\u0007"+
		"\u012e\u0002\u012f\u0007\u012f\u0002\u0130\u0007\u0130\u0002\u0131\u0007"+
		"\u0131\u0002\u0132\u0007\u0132\u0002\u0133\u0007\u0133\u0002\u0134\u0007"+
		"\u0134\u0002\u0135\u0007\u0135\u0002\u0136\u0007\u0136\u0002\u0137\u0007"+
		"\u0137\u0002\u0138\u0007\u0138\u0002\u0139\u0007\u0139\u0001\u0000\u0003"+
		"\u0000\u0276\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0282\b\u0001\u0001\u0001\u0003\u0001\u0285\b\u0001\u0001\u0001"+
		"\u0003\u0001\u0288\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002\u028e\b\u0002\u000b\u0002\f\u0002\u028f\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0295\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0299\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u029f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u02aa"+
		"\b\u0006\n\u0006\f\u0006\u02ad\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u02b3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u02c5\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u02cb\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u02d1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u02dc"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u02e2"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u02e6\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u02eb\b\u0011\u0001\u0012\u0003\u0012"+
		"\u02ee\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u02f6\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u02fb\b\u0013\u0005\u0013\u02fd\b\u0013\n\u0013\f\u0013\u0300"+
		"\t\u0013\u0001\u0014\u0003\u0014\u0303\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u030f\b\u0017\u0001\u0017\u0003\u0017"+
		"\u0312\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0319\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u031d\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0322\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0326\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u032d\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0339\b\u001f\u0001 \u0001"+
		" \u0003 \u033d\b \u0001!\u0001!\u0003!\u0341\b!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0003#\u0347\b#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0003&\u0352\b&\u0001\'\u0004\'\u0355\b\'\u000b\'\f\'"+
		"\u0356\u0001(\u0001(\u0003(\u035b\b(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u0364\b)\n)\f)\u0367\t)\u0001*\u0001*\u0003*\u036b"+
		"\b*\u0001+\u0001+\u0001+\u0003+\u0370\b+\u0001,\u0001,\u0003,\u0374\b"+
		",\u0001,\u0003,\u0377\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u037e"+
		"\b-\u0001.\u0004.\u0381\b.\u000b.\f.\u0382\u0001/\u0001/\u0001/\u0003"+
		"/\u0388\b/\u00010\u00010\u00030\u038c\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u0398\b1\u00011\u00011\u0001"+
		"1\u00031\u039d\b1\u00011\u00011\u00051\u03a1\b1\n1\f1\u03a4\t1\u00012"+
		"\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u03b4\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u03c3"+
		"\b2\u00013\u00013\u00033\u03c7\b3\u00014\u00014\u00014\u00034\u03cc\b"+
		"4\u00015\u00015\u00016\u00016\u00017\u00017\u00017\u00057\u03d5\b7\n7"+
		"\f7\u03d8\t7\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u03e6\b9\u00019\u00019\u0001:\u0001:\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u03fd\b?\n?\f?\u0400"+
		"\t?\u0001@\u0001@\u0001@\u0001@\u0003@\u0406\b@\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u040f\bB\u0003B\u0411\bB\u0001C\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0005D\u041a\bD\nD\fD\u041d\tD\u0001E\u0001"+
		"E\u0001E\u0001E\u0003E\u0423\bE\u0003E\u0425\bE\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0001G\u0005G\u042d\bG\nG\fG\u0430\tG\u0001H\u0001H\u0003H\u0434"+
		"\bH\u0001I\u0001I\u0001I\u0001I\u0003I\u043a\bI\u0001J\u0001J\u0001J\u0001"+
		"J\u0003J\u0440\bJ\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005"+
		"L\u0449\bL\nL\fL\u044c\tL\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0003N\u045f\bN\u0001N\u0003N\u0462\bN\u0001O\u0004O\u0465\bO\u000b"+
		"O\fO\u0466\u0001P\u0003P\u046a\bP\u0001Q\u0001Q\u0003Q\u046e\bQ\u0001"+
		"Q\u0001Q\u0001R\u0003R\u0473\bR\u0001R\u0001R\u0003R\u0477\bR\u0001R\u0001"+
		"R\u0001S\u0001S\u0001T\u0001T\u0001T\u0005T\u0480\bT\nT\fT\u0483\tT\u0001"+
		"U\u0001U\u0003U\u0487\bU\u0001V\u0003V\u048a\bV\u0001V\u0003V\u048d\b"+
		"V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0005W\u0495\bW\nW\fW\u0498"+
		"\tW\u0001X\u0001X\u0003X\u049c\bX\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003Z\u04aa\bZ\u0001Z\u0003"+
		"Z\u04ad\bZ\u0003Z\u04af\bZ\u0001Z\u0003Z\u04b2\bZ\u0001[\u0003[\u04b5"+
		"\b[\u0001[\u0003[\u04b8\b[\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001"+
		"]\u0001]\u0003]\u04c1\b]\u0001]\u0001]\u0001]\u0003]\u04c6\b]\u0001]\u0001"+
		"]\u0001]\u0003]\u04cb\b]\u0001^\u0003^\u04ce\b^\u0001^\u0003^\u04d1\b"+
		"^\u0001^\u0001^\u0003^\u04d5\b^\u0001_\u0003_\u04d8\b_\u0001_\u0003_\u04db"+
		"\b_\u0001_\u0001_\u0003_\u04df\b_\u0001_\u0003_\u04e2\b_\u0001`\u0001"+
		"`\u0001`\u0001`\u0001a\u0001a\u0001a\u0003a\u04eb\ba\u0001a\u0001a\u0001"+
		"a\u0003a\u04f0\ba\u0001a\u0001a\u0001b\u0003b\u04f5\bb\u0001b\u0003b\u04f8"+
		"\bb\u0001b\u0001b\u0001c\u0003c\u04fd\bc\u0001c\u0003c\u0500\bc\u0001"+
		"c\u0001c\u0001d\u0001d\u0001d\u0003d\u0507\bd\u0001d\u0001d\u0003d\u050b"+
		"\bd\u0003d\u050d\bd\u0001d\u0001d\u0001e\u0003e\u0512\be\u0001e\u0001"+
		"e\u0003e\u0516\be\u0001e\u0001e\u0001f\u0003f\u051b\bf\u0001f\u0001f\u0003"+
		"f\u051f\bf\u0001f\u0001f\u0001g\u0003g\u0524\bg\u0001g\u0003g\u0527\b"+
		"g\u0001g\u0001g\u0001g\u0003g\u052c\bg\u0001g\u0001g\u0001h\u0001h\u0001"+
		"i\u0001i\u0001i\u0001j\u0001j\u0001j\u0003j\u0538\bj\u0001j\u0001j\u0003"+
		"j\u053c\bj\u0001j\u0003j\u053f\bj\u0001k\u0003k\u0542\bk\u0001k\u0003"+
		"k\u0545\bk\u0001k\u0001k\u0001l\u0001l\u0003l\u054b\bl\u0001m\u0001m\u0003"+
		"m\u054f\bm\u0001m\u0003m\u0552\bm\u0001m\u0003m\u0555\bm\u0001n\u0001"+
		"n\u0003n\u0559\bn\u0001n\u0001n\u0001o\u0001o\u0001p\u0001p\u0003p\u0561"+
		"\bp\u0001p\u0001p\u0001q\u0001q\u0001q\u0005q\u0568\bq\nq\fq\u056b\tq"+
		"\u0001r\u0003r\u056e\br\u0001r\u0003r\u0571\br\u0001r\u0001r\u0001r\u0003"+
		"r\u0576\br\u0001r\u0003r\u0579\br\u0001s\u0001s\u0001t\u0001t\u0001u\u0001"+
		"u\u0001u\u0001v\u0003v\u0583\bv\u0001v\u0003v\u0586\bv\u0001v\u0001v\u0003"+
		"v\u058a\bv\u0001w\u0003w\u058d\bw\u0001w\u0001w\u0001w\u0003w\u0592\b"+
		"w\u0001w\u0003w\u0595\bw\u0001w\u0003w\u0598\bw\u0001w\u0001w\u0003w\u059c"+
		"\bw\u0001w\u0001w\u0001x\u0004x\u05a1\bx\u000bx\fx\u05a2\u0001y\u0001"+
		"y\u0001y\u0003y\u05a8\by\u0001z\u0003z\u05ab\bz\u0001z\u0003z\u05ae\b"+
		"z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001{\u0005{\u05b6\b{\n{\f{\u05b9"+
		"\t{\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003|\u05c2\b|\u0003"+
		"|\u05c4\b|\u0001}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0003\u007f\u05cd\b\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u05d1\b"+
		"\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0004"+
		"\u0080\u05d8\b\u0080\u000b\u0080\f\u0080\u05d9\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0003\u0081\u05df\b\u0081\u0001\u0082\u0003\u0082\u05e2\b"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0005\u0083\u05ea\b\u0083\n\u0083\f\u0083\u05ed\t\u0083\u0001\u0084"+
		"\u0001\u0084\u0003\u0084\u05f1\b\u0084\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0003\u0086\u05f9\b\u0086\u0001\u0087"+
		"\u0003\u0087\u05fc\b\u0087\u0001\u0087\u0003\u0087\u05ff\b\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0604\b\u0087\u0001\u0087\u0003"+
		"\u0087\u0607\b\u0087\u0001\u0087\u0003\u0087\u060a\b\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u008a\u0005\u008a\u0615\b\u008a\n\u008a\f\u008a\u0618"+
		"\t\u008a\u0001\u008b\u0001\u008b\u0003\u008b\u061c\b\u008b\u0001\u008c"+
		"\u0003\u008c\u061f\b\u008c\u0001\u008c\u0003\u008c\u0622\b\u008c\u0001"+
		"\u008c\u0003\u008c\u0625\b\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u0629"+
		"\b\u008c\u0003\u008c\u062b\b\u008c\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0003\u008c\u0630\b\u008c\u0001\u008c\u0003\u008c\u0633\b\u008c\u0001"+
		"\u008c\u0003\u008c\u0636\b\u008c\u0001\u008c\u0001\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0005"+
		"\u008f\u0641\b\u008f\n\u008f\f\u008f\u0644\t\u008f\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u0648\b\u0090\u0001\u0091\u0003\u0091\u064b\b\u0091\u0001"+
		"\u0091\u0003\u0091\u064e\b\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001"+
		"\u0091\u0001\u0091\u0003\u0091\u0655\b\u0091\u0001\u0091\u0003\u0091\u0658"+
		"\b\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0001\u0093\u0001\u0094\u0005\u0094\u0663\b\u0094\n"+
		"\u0094\f\u0094\u0666\t\u0094\u0001\u0095\u0001\u0095\u0003\u0095\u066a"+
		"\b\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001"+
		"\u0096\u0003\u0096\u0672\b\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u067c"+
		"\b\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u0680\b\u0098\u0001\u0099"+
		"\u0001\u0099\u0003\u0099\u0684\b\u0099\u0001\u0099\u0001\u0099\u0003\u0099"+
		"\u0688\b\u0099\u0001\u0099\u0003\u0099\u068b\b\u0099\u0001\u0099\u0003"+
		"\u0099\u068e\b\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0693"+
		"\b\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0003\u009b\u0698\b\u009b"+
		"\u0001\u009b\u0003\u009b\u069b\b\u009b\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0003\u009b\u06a0\b\u009b\u0001\u009b\u0003\u009b\u06a3\b\u009b\u0001"+
		"\u009b\u0003\u009b\u06a6\b\u009b\u0001\u009c\u0001\u009c\u0003\u009c\u06aa"+
		"\b\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u06ae\b\u009c\u0001\u009c"+
		"\u0003\u009c\u06b1\b\u009c\u0001\u009c\u0001\u009c\u0001\u009d\u0003\u009d"+
		"\u06b6\b\u009d\u0001\u009d\u0003\u009d\u06b9\b\u009d\u0001\u009d\u0001"+
		"\u009d\u0003\u009d\u06bd\b\u009d\u0001\u009e\u0001\u009e\u0001\u009f\u0003"+
		"\u009f\u06c2\b\u009f\u0001\u009f\u0001\u009f\u0001\u009f\u0001\u00a0\u0003"+
		"\u00a0\u06c8\b\u00a0\u0001\u00a0\u0003\u00a0\u06cb\b\u00a0\u0001\u00a0"+
		"\u0001\u00a0\u0001\u00a0\u0003\u00a0\u06d0\b\u00a0\u0001\u00a0\u0003\u00a0"+
		"\u06d3\b\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a2\u0005\u00a2\u06dc\b\u00a2\n\u00a2\f\u00a2\u06df"+
		"\t\u00a2\u0001\u00a3\u0001\u00a3\u0003\u00a3\u06e3\b\u00a3\u0001\u00a4"+
		"\u0001\u00a4\u0001\u00a4\u0003\u00a4\u06e8\b\u00a4\u0001\u00a4\u0001\u00a4"+
		"\u0001\u00a4\u0003\u00a4\u06ed\b\u00a4\u0001\u00a5\u0003\u00a5\u06f0\b"+
		"\u00a5\u0001\u00a5\u0003\u00a5\u06f3\b\u00a5\u0001\u00a5\u0001\u00a5\u0003"+
		"\u00a5\u06f7\b\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0003"+
		"\u00a6\u06fd\b\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0001\u00a7\u0001"+
		"\u00a7\u0003\u00a7\u0704\b\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001"+
		"\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0001"+
		"\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u0712\b\u00aa\u0001\u00ab\u0001"+
		"\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0003"+
		"\u00ac\u071b\b\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0004\u00ad\u0720"+
		"\b\u00ad\u000b\u00ad\f\u00ad\u0721\u0001\u00ae\u0001\u00ae\u0001\u00ae"+
		"\u0003\u00ae\u0727\b\u00ae\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af"+
		"\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0005\u00b2"+
		"\u0738\b\u00b2\n\u00b2\f\u00b2\u073b\t\u00b2\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0005\u00b3\u0740\b\u00b3\n\u00b3\f\u00b3\u0743\t\u00b3\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0003\u00b4\u0755\b\u00b4\u0001\u00b4"+
		"\u0001\u00b4\u0001\u00b4\u0003\u00b4\u075a\b\u00b4\u0001\u00b5\u0004\u00b5"+
		"\u075d\b\u00b5\u000b\u00b5\f\u00b5\u075e\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b6\u0003\u00b6\u0765\b\u00b6\u0001\u00b7\u0001\u00b7\u0001"+
		"\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u076d\b\u00b8\u0001"+
		"\u00b8\u0003\u00b8\u0770\b\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u0778\b\u00b8\u0001\u00b8\u0001"+
		"\u00b8\u0001\u00b8\u0005\u00b8\u077d\b\u00b8\n\u00b8\f\u00b8\u0780\t\u00b8"+
		"\u0001\u00b9\u0001\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0003\u00bb\u078a\b\u00bb\u0001\u00bc\u0001\u00bc"+
		"\u0003\u00bc\u078e\b\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bd\u0001\u00bd"+
		"\u0001\u00bd\u0005\u00bd\u0795\b\u00bd\n\u00bd\f\u00bd\u0798\t\u00bd\u0001"+
		"\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u079d\b\u00be\u0001\u00be\u0001"+
		"\u00be\u0001\u00bf\u0003\u00bf\u07a2\b\u00bf\u0001\u00bf\u0001\u00bf\u0001"+
		"\u00bf\u0003\u00bf\u07a7\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u07b1"+
		"\b\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0005\u00c3\u07b6\b\u00c3"+
		"\n\u00c3\f\u00c3\u07b9\t\u00c3\u0001\u00c4\u0001\u00c4\u0003\u00c4\u07bd"+
		"\b\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c5\u0004\u00c5\u07c2\b\u00c5"+
		"\u000b\u00c5\f\u00c5\u07c3\u0001\u00c6\u0004\u00c6\u07c7\b\u00c6\u000b"+
		"\u00c6\f\u00c6\u07c8\u0001\u00c7\u0001\u00c7\u0003\u00c7\u07cd\b\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u07d2\b\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0003\u00c7\u07d7\b\u00c7\u0001\u00c7\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u07df\b\u00c7"+
		"\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8"+
		"\u0003\u00c8\u07e7\b\u00c8\u0001\u00c9\u0003\u00c9\u07ea\b\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0003\u00c9\u07ee\b\u00c9\u0001\u00ca\u0001\u00ca\u0001"+
		"\u00ca\u0005\u00ca\u07f3\b\u00ca\n\u00ca\f\u00ca\u07f6\t\u00ca\u0001\u00cb"+
		"\u0003\u00cb\u07f9\b\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u07fd\b"+
		"\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cd\u0001\u00cd\u0003"+
		"\u00cd\u0804\b\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00ce\u0003\u00ce\u080b\b\u00ce\u0001\u00ce\u0003\u00ce\u080e\b\u00ce"+
		"\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0003\u00ce\u0813\b\u00ce\u0001\u00cf"+
		"\u0004\u00cf\u0816\b\u00cf\u000b\u00cf\f\u00cf\u0817\u0001\u00d0\u0001"+
		"\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0003"+
		"\u00d1\u0821\b\u00d1\u0003\u00d1\u0823\b\u00d1\u0001\u00d1\u0001\u00d1"+
		"\u0001\u00d2\u0001\u00d2\u0003\u00d2\u0829\b\u00d2\u0001\u00d2\u0001\u00d2"+
		"\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2"+
		"\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2"+
		"\u0003\u00d2\u0839\b\u00d2\u0001\u00d3\u0001\u00d3\u0001\u00d3\u0001\u00d3"+
		"\u0001\u00d3\u0003\u00d3\u0840\b\u00d3\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0001\u00d4\u0003\u00d4\u084d\b\u00d4\u0001\u00d5\u0001\u00d5"+
		"\u0003\u00d5\u0851\b\u00d5\u0001\u00d5\u0001\u00d5\u0001\u00d6\u0001\u00d6"+
		"\u0001\u00d6\u0005\u00d6\u0858\b\u00d6\n\u00d6\f\u00d6\u085b\t\u00d6\u0001"+
		"\u00d6\u0003\u00d6\u085e\b\u00d6\u0001\u00d7\u0001\u00d7\u0001\u00d8\u0001"+
		"\u00d8\u0001\u00d8\u0003\u00d8\u0865\b\u00d8\u0001\u00d8\u0001\u00d8\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0005\u00d9\u086c\b\u00d9\n\u00d9\f\u00d9"+
		"\u086f\t\u00d9\u0001\u00d9\u0003\u00d9\u0872\b\u00d9\u0001\u00da\u0001"+
		"\u00da\u0001\u00da\u0001\u00da\u0001\u00db\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001"+
		"\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0001\u00db\u0003"+
		"\u00db\u0899\b\u00db\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001"+
		"\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001\u00dc\u0001"+
		"\u00dc\u0001\u00dc\u0003\u00dc\u08a7\b\u00dc\u0001\u00dd\u0001\u00dd\u0001"+
		"\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001\u00dd\u0001"+
		"\u00dd\u0001\u00dd\u0001\u00dd\u0003\u00dd\u08b4\b\u00dd\u0001\u00de\u0001"+
		"\u00de\u0003\u00de\u08b8\b\u00de\u0001\u00de\u0003\u00de\u08bb\b\u00de"+
		"\u0001\u00de\u0001\u00de\u0001\u00df\u0003\u00df\u08c0\b\u00df\u0001\u00df"+
		"\u0001\u00df\u0003\u00df\u08c4\b\u00df\u0001\u00df\u0003\u00df\u08c7\b"+
		"\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0001\u00df\u0003"+
		"\u00df\u08ce\b\u00df\u0001\u00e0\u0001\u00e0\u0003\u00e0\u08d2\b\u00e0"+
		"\u0001\u00e0\u0001\u00e0\u0003\u00e0\u08d6\b\u00e0\u0001\u00e1\u0001\u00e1"+
		"\u0001\u00e1\u0005\u00e1\u08db\b\u00e1\n\u00e1\f\u00e1\u08de\t\u00e1\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0003\u00e2\u08e3\b\u00e2\u0003\u00e2\u08e5"+
		"\b\u00e2\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e3\u0001\u00e4\u0001"+
		"\u00e4\u0001\u00e4\u0005\u00e4\u08ee\b\u00e4\n\u00e4\f\u00e4\u08f1\t\u00e4"+
		"\u0001\u00e5\u0003\u00e5\u08f4\b\u00e5\u0001\u00e5\u0001\u00e5\u0003\u00e5"+
		"\u08f8\b\u00e5\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0003\u00e5\u08fd\b"+
		"\u00e5\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0003"+
		"\u00e6\u0904\b\u00e6\u0003\u00e6\u0906\b\u00e6\u0001\u00e7\u0001\u00e7"+
		"\u0001\u00e7\u0003\u00e7\u090b\b\u00e7\u0001\u00e7\u0001\u00e7\u0003\u00e7"+
		"\u090f\b\u00e7\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e8\u0001\u00e9"+
		"\u0001\u00e9\u0001\u00e9\u0001\u00e9\u0001\u00ea\u0001\u00ea\u0001\u00ea"+
		"\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00ea\u0003\u00ea"+
		"\u0921\b\u00ea\u0001\u00eb\u0001\u00eb\u0001\u00eb\u0005\u00eb\u0926\b"+
		"\u00eb\n\u00eb\f\u00eb\u0929\t\u00eb\u0001\u00ec\u0001\u00ec\u0001\u00ec"+
		"\u0003\u00ec\u092e\b\u00ec\u0001\u00ec\u0001\u00ec\u0001\u00ed\u0001\u00ed"+
		"\u0001\u00ee\u0001\u00ee\u0003\u00ee\u0936\b\u00ee\u0001\u00ee\u0001\u00ee"+
		"\u0001\u00ee\u0001\u00ef\u0001\u00ef\u0001\u00ef\u0005\u00ef\u093e\b\u00ef"+
		"\n\u00ef\f\u00ef\u0941\t\u00ef\u0001\u00f0\u0001\u00f0\u0003\u00f0\u0945"+
		"\b\u00f0\u0001\u00f0\u0003\u00f0\u0948\b\u00f0\u0001\u00f1\u0004\u00f1"+
		"\u094b\b\u00f1\u000b\u00f1\f\u00f1\u094c\u0001\u00f2\u0001\u00f2\u0001"+
		"\u00f2\u0001\u00f2\u0001\u00f2\u0001\u00f2\u0001\u00f2\u0003\u00f2\u0956"+
		"\b\u00f2\u0001\u00f3\u0001\u00f3\u0001\u00f3\u0001\u00f3\u0003\u00f3\u095c"+
		"\b\u00f3\u0001\u00f3\u0001\u00f3\u0001\u00f3\u0001\u00f4\u0001\u00f4\u0001"+
		"\u00f4\u0001\u00f4\u0001\u00f4\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001"+
		"\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0001\u00f5\u0005\u00f5\u096e"+
		"\b\u00f5\n\u00f5\f\u00f5\u0971\t\u00f5\u0001\u00f5\u0005\u00f5\u0974\b"+
		"\u00f5\n\u00f5\f\u00f5\u0977\t\u00f5\u0001\u00f6\u0003\u00f6\u097a\b\u00f6"+
		"\u0001\u00f6\u0001\u00f6\u0003\u00f6\u097e\b\u00f6\u0001\u00f7\u0001\u00f7"+
		"\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0001\u00f7\u0003\u00f7\u0986\b\u00f7"+
		"\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8\u0001\u00f8"+
		"\u0001\u00f8\u0001\u00f8\u0003\u00f8\u0990\b\u00f8\u0003\u00f8\u0992\b"+
		"\u00f8\u0001\u00f9\u0001\u00f9\u0001\u00f9\u0001\u00fa\u0001\u00fa\u0001"+
		"\u00fa\u0001\u00fa\u0001\u00fb\u0001\u00fb\u0001\u00fb\u0001\u00fc\u0001"+
		"\u00fc\u0001\u00fc\u0001\u00fd\u0001\u00fd\u0003\u00fd\u09a3\b\u00fd\u0001"+
		"\u00fd\u0001\u00fd\u0001\u00fe\u0001\u00fe\u0001\u00fe\u0005\u00fe\u09aa"+
		"\b\u00fe\n\u00fe\f\u00fe\u09ad\t\u00fe\u0001\u00ff\u0003\u00ff\u09b0\b"+
		"\u00ff\u0001\u00ff\u0001\u00ff\u0001\u00ff\u0003\u00ff\u09b5\b\u00ff\u0001"+
		"\u0100\u0001\u0100\u0003\u0100\u09b9\b\u0100\u0001\u0101\u0004\u0101\u09bc"+
		"\b\u0101\u000b\u0101\f\u0101\u09bd\u0001\u0102\u0001\u0102\u0001\u0102"+
		"\u0001\u0102\u0001\u0103\u0004\u0103\u09c5\b\u0103\u000b\u0103\f\u0103"+
		"\u09c6\u0001\u0104\u0001\u0104\u0001\u0104\u0001\u0105\u0001\u0105\u0001"+
		"\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001"+
		"\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0003"+
		"\u0105\u09da\b\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001"+
		"\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0001\u0105\u0003\u0105\u09e5"+
		"\b\u0105\u0005\u0105\u09e7\b\u0105\n\u0105\f\u0105\u09ea\t\u0105\u0001"+
		"\u0106\u0001\u0106\u0003\u0106\u09ee\b\u0106\u0001\u0106\u0003\u0106\u09f1"+
		"\b\u0106\u0001\u0106\u0001\u0106\u0001\u0107\u0001\u0107\u0003\u0107\u09f7"+
		"\b\u0107\u0001\u0107\u0001\u0107\u0003\u0107\u09fb\b\u0107\u0001\u0108"+
		"\u0001\u0108\u0001\u0109\u0001\u0109\u0003\u0109\u0a01\b\u0109\u0001\u0109"+
		"\u0001\u0109\u0001\u010a\u0001\u010a\u0001\u010a\u0005\u010a\u0a08\b\u010a"+
		"\n\u010a\f\u010a\u0a0b\t\u010a\u0001\u010b\u0001\u010b\u0001\u010b\u0001"+
		"\u010b\u0003\u010b\u0a11\b\u010b\u0001\u010b\u0001\u010b\u0003\u010b\u0a15"+
		"\b\u010b\u0001\u010c\u0004\u010c\u0a18\b\u010c\u000b\u010c\f\u010c\u0a19"+
		"\u0001\u010d\u0003\u010d\u0a1d\b\u010d\u0001\u010d\u0001\u010d\u0003\u010d"+
		"\u0a21\b\u010d\u0001\u010d\u0001\u010d\u0001\u010d\u0001\u010e\u0001\u010e"+
		"\u0001\u010e\u0003\u010e\u0a29\b\u010e\u0003\u010e\u0a2b\b\u010e\u0001"+
		"\u010e\u0001\u010e\u0001\u010f\u0001\u010f\u0001\u010f\u0005\u010f\u0a32"+
		"\b\u010f\n\u010f\f\u010f\u0a35\t\u010f\u0001\u0110\u0003\u0110\u0a38\b"+
		"\u0110\u0001\u0110\u0003\u0110\u0a3b\b\u0110\u0001\u0110\u0001\u0110\u0001"+
		"\u0110\u0001\u0110\u0003\u0110\u0a41\b\u0110\u0001\u0111\u0004\u0111\u0a44"+
		"\b\u0111\u000b\u0111\f\u0111\u0a45\u0001\u0112\u0001\u0112\u0001\u0112"+
		"\u0001\u0112\u0001\u0113\u0001\u0113\u0001\u0113\u0001\u0113\u0001\u0113"+
		"\u0001\u0113\u0001\u0114\u0001\u0114\u0001\u0114\u0005\u0114\u0a55\b\u0114"+
		"\n\u0114\f\u0114\u0a58\t\u0114\u0001\u0114\u0003\u0114\u0a5b\b\u0114\u0001"+
		"\u0115\u0001\u0115\u0001\u0115\u0001\u0116\u0001\u0116\u0001\u0116\u0001"+
		"\u0117\u0001\u0117\u0001\u0118\u0001\u0118\u0001\u0119\u0001\u0119\u0001"+
		"\u0119\u0001\u011a\u0001\u011a\u0001\u011a\u0005\u011a\u0a6d\b\u011a\n"+
		"\u011a\f\u011a\u0a70\t\u011a\u0001\u011b\u0001\u011b\u0001\u011b\u0001"+
		"\u011b\u0001\u011b\u0001\u011b\u0003\u011b\u0a78\b\u011b\u0001\u011b\u0003"+
		"\u011b\u0a7b\b\u011b\u0001\u011c\u0001\u011c\u0001\u011c\u0005\u011c\u0a80"+
		"\b\u011c\n\u011c\f\u011c\u0a83\t\u011c\u0001\u011d\u0001\u011d\u0001\u011e"+
		"\u0001\u011e\u0001\u011e\u0001\u011f\u0001\u011f\u0001\u011f\u0001\u0120"+
		"\u0001\u0120\u0001\u0120\u0001\u0120\u0001\u0121\u0001\u0121\u0001\u0121"+
		"\u0001\u0121\u0001\u0122\u0001\u0122\u0001\u0122\u0001\u0122\u0001\u0123"+
		"\u0001\u0123\u0001\u0123\u0001\u0124\u0001\u0124\u0001\u0124\u0001\u0124"+
		"\u0001\u0125\u0001\u0125\u0001\u0125\u0001\u0125\u0001\u0125\u0001\u0126"+
		"\u0001\u0126\u0001\u0126\u0001\u0126\u0001\u0127\u0001\u0127\u0001\u0127"+
		"\u0001\u0128\u0001\u0128\u0001\u0128\u0001\u0129\u0001\u0129\u0001\u0129"+
		"\u0001\u012a\u0001\u012a\u0003\u012a\u0ab4\b\u012a\u0001\u012a\u0001\u012a"+
		"\u0001\u012a\u0003\u012a\u0ab9\b\u012a\u0001\u012b\u0001\u012b\u0003\u012b"+
		"\u0abd\b\u012b\u0001\u012c\u0001\u012c\u0003\u012c\u0ac1\b\u012c\u0001"+
		"\u012d\u0001\u012d\u0004\u012d\u0ac5\b\u012d\u000b\u012d\f\u012d\u0ac6"+
		"\u0001\u012e\u0001\u012e\u0001\u012f\u0001\u012f\u0003\u012f\u0acd\b\u012f"+
		"\u0001\u0130\u0001\u0130\u0004\u0130\u0ad1\b\u0130\u000b\u0130\f\u0130"+
		"\u0ad2\u0001\u0131\u0001\u0131\u0001\u0131\u0001\u0131\u0003\u0131\u0ad9"+
		"\b\u0131\u0001\u0132\u0003\u0132\u0adc\b\u0132\u0001\u0132\u0001\u0132"+
		"\u0003\u0132\u0ae0\b\u0132\u0001\u0132\u0003\u0132\u0ae3\b\u0132\u0001"+
		"\u0133\u0001\u0133\u0001\u0134\u0001\u0134\u0001\u0135\u0001\u0135\u0001"+
		"\u0136\u0001\u0136\u0001\u0136\u0003\u0136\u0aee\b\u0136\u0001\u0137\u0001"+
		"\u0137\u0004\u0137\u0af2\b\u0137\u000b\u0137\f\u0137\u0af3\u0001\u0137"+
		"\u0001\u0137\u0001\u0137\u0004\u0137\u0af9\b\u0137\u000b\u0137\f\u0137"+
		"\u0afa\u0001\u0137\u0003\u0137\u0afe\b\u0137\u0001\u0138\u0001\u0138\u0005"+
		"\u0138\u0b02\b\u0138\n\u0138\f\u0138\u0b05\t\u0138\u0001\u0138\u0001\u0138"+
		"\u0001\u0138\u0005\u0138\u0b0a\b\u0138\n\u0138\f\u0138\u0b0d\t\u0138\u0001"+
		"\u0138\u0003\u0138\u0b10\b\u0138\u0001\u0139\u0001\u0139\u0001\u0139\u0001"+
		"\u0139\u0001\u0139\u0001\u0139\u0001\u0139\u0001\u0139\u0003\u0139\u0b1a"+
		"\b\u0139\u0001\u0139\u0001\u0139\u0005\u0139\u0b1e\b\u0139\n\u0139\f\u0139"+
		"\u0b21\t\u0139\u0001\u0139\u0001\u0139\u0001\u0139\u0001\u0139\u0001\u0139"+
		"\u0001\u0139\u0001\u0139\u0001\u0139\u0001\u0139\u0003\u0139\u0b2c\b\u0139"+
		"\u0001\u0139\u0001\u0139\u0005\u0139\u0b30\b\u0139\n\u0139\f\u0139\u0b33"+
		"\t\u0139\u0001\u0139\u0003\u0139\u0b36\b\u0139\u0001\u0139\u0001\u0975"+
		"\u0003b\u0170\u020a\u013a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8"+
		"\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0"+
		"\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8"+
		"\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210"+
		"\u0212\u0214\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228"+
		"\u022a\u022c\u022e\u0230\u0232\u0234\u0236\u0238\u023a\u023c\u023e\u0240"+
		"\u0242\u0244\u0246\u0248\u024a\u024c\u024e\u0250\u0252\u0254\u0256\u0258"+
		"\u025a\u025c\u025e\u0260\u0262\u0264\u0266\u0268\u026a\u026c\u026e\u0270"+
		"\u0272\u0000\u0016\u0001\u0000\u001b\u001c\u0001\u0000>?\u0001\u0000a"+
		"g\u0001\u0000hk\u0001\u0000lm\u0001\u0000tu\u0002\u0000aemp\u0006\u0000"+
		"\u0006\u0006\r\r\u0010\u0010\u001b\u001d$$;;\u0001\u0000\'(\u0001\u0000"+
		"\u0097\u0098\u0001\u000056\u0001\u000013\u0001\u0000KL\u0003\u0000\u0014"+
		"\u0014\u0016\u0018OO\u0001\u0000MN\u0005\u0000\u008a\u008a\u0091\u0093"+
		"\u0098\u0099\u009c\u009c\u00a4\u00a5\u0001\u0000\u0087\u0088\u0010\u0000"+
		"\u0001\u0002\u0005\u0006\b\b\n\u000b\u000e\u000e\u0011\u0011\u0014\u001a"+
		"\u001d!))/:<GINUX\\prs\u0087\u0088\u000f\u0000\u0001\u0001\u0003\u0014"+
		"\u0016\u001d\"(*.:;HHOTY[_`qqt\u0080\u0082\u0082\u0084\u0086\u0096\u0096"+
		"\u0003\u0000\u0094\u0095\u0097\u0098\u009a\u00a3\u0002\u0000TTYY\u0001"+
		"\u0000\u00aa\u00ae\u0be1\u0000\u0275\u0001\u0000\u0000\u0000\u0002\u0287"+
		"\u0001\u0000\u0000\u0000\u0004\u028d\u0001\u0000\u0000\u0000\u0006\u0294"+
		"\u0001\u0000\u0000\u0000\b\u0296\u0001\u0000\u0000\u0000\n\u02a2\u0001"+
		"\u0000\u0000\u0000\f\u02a6\u0001\u0000\u0000\u0000\u000e\u02b2\u0001\u0000"+
		"\u0000\u0000\u0010\u02b4\u0001\u0000\u0000\u0000\u0012\u02b8\u0001\u0000"+
		"\u0000\u0000\u0014\u02bc\u0001\u0000\u0000\u0000\u0016\u02c4\u0001\u0000"+
		"\u0000\u0000\u0018\u02c6\u0001\u0000\u0000\u0000\u001a\u02d0\u0001\u0000"+
		"\u0000\u0000\u001c\u02d2\u0001\u0000\u0000\u0000\u001e\u02d7\u0001\u0000"+
		"\u0000\u0000 \u02df\u0001\u0000\u0000\u0000\"\u02ea\u0001\u0000\u0000"+
		"\u0000$\u02ed\u0001\u0000\u0000\u0000&\u02f3\u0001\u0000\u0000\u0000("+
		"\u0302\u0001\u0000\u0000\u0000*\u0307\u0001\u0000\u0000\u0000,\u030a\u0001"+
		"\u0000\u0000\u0000.\u030c\u0001\u0000\u0000\u00000\u0315\u0001\u0000\u0000"+
		"\u00002\u031a\u0001\u0000\u0000\u00004\u031e\u0001\u0000\u0000\u00006"+
		"\u0323\u0001\u0000\u0000\u00008\u0327\u0001\u0000\u0000\u0000:\u032e\u0001"+
		"\u0000\u0000\u0000<\u0331\u0001\u0000\u0000\u0000>\u0338\u0001\u0000\u0000"+
		"\u0000@\u033a\u0001\u0000\u0000\u0000B\u033e\u0001\u0000\u0000\u0000D"+
		"\u0342\u0001\u0000\u0000\u0000F\u0344\u0001\u0000\u0000\u0000H\u0348\u0001"+
		"\u0000\u0000\u0000J\u034b\u0001\u0000\u0000\u0000L\u034e\u0001\u0000\u0000"+
		"\u0000N\u0354\u0001\u0000\u0000\u0000P\u0358\u0001\u0000\u0000\u0000R"+
		"\u035e\u0001\u0000\u0000\u0000T\u0368\u0001\u0000\u0000\u0000V\u036f\u0001"+
		"\u0000\u0000\u0000X\u0371\u0001\u0000\u0000\u0000Z\u037a\u0001\u0000\u0000"+
		"\u0000\\\u0380\u0001\u0000\u0000\u0000^\u0384\u0001\u0000\u0000\u0000"+
		"`\u0389\u0001\u0000\u0000\u0000b\u0397\u0001\u0000\u0000\u0000d\u03c2"+
		"\u0001\u0000\u0000\u0000f\u03c4\u0001\u0000\u0000\u0000h\u03c8\u0001\u0000"+
		"\u0000\u0000j\u03cd\u0001\u0000\u0000\u0000l\u03cf\u0001\u0000\u0000\u0000"+
		"n\u03d1\u0001\u0000\u0000\u0000p\u03d9\u0001\u0000\u0000\u0000r\u03db"+
		"\u0001\u0000\u0000\u0000t\u03e9\u0001\u0000\u0000\u0000v\u03eb\u0001\u0000"+
		"\u0000\u0000x\u03ed\u0001\u0000\u0000\u0000z\u03f2\u0001\u0000\u0000\u0000"+
		"|\u03f4\u0001\u0000\u0000\u0000~\u03f9\u0001\u0000\u0000\u0000\u0080\u0405"+
		"\u0001\u0000\u0000\u0000\u0082\u0407\u0001\u0000\u0000\u0000\u0084\u0410"+
		"\u0001\u0000\u0000\u0000\u0086\u0412\u0001\u0000\u0000\u0000\u0088\u0416"+
		"\u0001\u0000\u0000\u0000\u008a\u041e\u0001\u0000\u0000\u0000\u008c\u0426"+
		"\u0001\u0000\u0000\u0000\u008e\u0429\u0001\u0000\u0000\u0000\u0090\u0433"+
		"\u0001\u0000\u0000\u0000\u0092\u0435\u0001\u0000\u0000\u0000\u0094\u043b"+
		"\u0001\u0000\u0000\u0000\u0096\u0441\u0001\u0000\u0000\u0000\u0098\u0445"+
		"\u0001\u0000\u0000\u0000\u009a\u044d\u0001\u0000\u0000\u0000\u009c\u045e"+
		"\u0001\u0000\u0000\u0000\u009e\u0464\u0001\u0000\u0000\u0000\u00a0\u0469"+
		"\u0001\u0000\u0000\u0000\u00a2\u046b\u0001\u0000\u0000\u0000\u00a4\u0472"+
		"\u0001\u0000\u0000\u0000\u00a6\u047a\u0001\u0000\u0000\u0000\u00a8\u047c"+
		"\u0001\u0000\u0000\u0000\u00aa\u0486\u0001\u0000\u0000\u0000\u00ac\u0489"+
		"\u0001\u0000\u0000\u0000\u00ae\u0491\u0001\u0000\u0000\u0000\u00b0\u0499"+
		"\u0001\u0000\u0000\u0000\u00b2\u049d\u0001\u0000\u0000\u0000\u00b4\u04a0"+
		"\u0001\u0000\u0000\u0000\u00b6\u04b4\u0001\u0000\u0000\u0000\u00b8\u04bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u04ca\u0001\u0000\u0000\u0000\u00bc\u04cd"+
		"\u0001\u0000\u0000\u0000\u00be\u04d7\u0001\u0000\u0000\u0000\u00c0\u04e3"+
		"\u0001\u0000\u0000\u0000\u00c2\u04e7\u0001\u0000\u0000\u0000\u00c4\u04f4"+
		"\u0001\u0000\u0000\u0000\u00c6\u04fc\u0001\u0000\u0000\u0000\u00c8\u0503"+
		"\u0001\u0000\u0000\u0000\u00ca\u0511\u0001\u0000\u0000\u0000\u00cc\u051a"+
		"\u0001\u0000\u0000\u0000\u00ce\u0523\u0001\u0000\u0000\u0000\u00d0\u052f"+
		"\u0001\u0000\u0000\u0000\u00d2\u0531\u0001\u0000\u0000\u0000\u00d4\u0534"+
		"\u0001\u0000\u0000\u0000\u00d6\u0541\u0001\u0000\u0000\u0000\u00d8\u054a"+
		"\u0001\u0000\u0000\u0000\u00da\u054c\u0001\u0000\u0000\u0000\u00dc\u0556"+
		"\u0001\u0000\u0000\u0000\u00de\u055c\u0001\u0000\u0000\u0000\u00e0\u055e"+
		"\u0001\u0000\u0000\u0000\u00e2\u0564\u0001\u0000\u0000\u0000\u00e4\u056d"+
		"\u0001\u0000\u0000\u0000\u00e6\u057a\u0001\u0000\u0000\u0000\u00e8\u057c"+
		"\u0001\u0000\u0000\u0000\u00ea\u057e\u0001\u0000\u0000\u0000\u00ec\u0582"+
		"\u0001\u0000\u0000\u0000\u00ee\u058c\u0001\u0000\u0000\u0000\u00f0\u05a0"+
		"\u0001\u0000\u0000\u0000\u00f2\u05a7\u0001\u0000\u0000\u0000\u00f4\u05aa"+
		"\u0001\u0000\u0000\u0000\u00f6\u05b2\u0001\u0000\u0000\u0000\u00f8\u05c3"+
		"\u0001\u0000\u0000\u0000\u00fa\u05c5\u0001\u0000\u0000\u0000\u00fc\u05c7"+
		"\u0001\u0000\u0000\u0000\u00fe\u05c9\u0001\u0000\u0000\u0000\u0100\u05d7"+
		"\u0001\u0000\u0000\u0000\u0102\u05de\u0001\u0000\u0000\u0000\u0104\u05e1"+
		"\u0001\u0000\u0000\u0000\u0106\u05e6\u0001\u0000\u0000\u0000\u0108\u05ee"+
		"\u0001\u0000\u0000\u0000\u010a\u05f2\u0001\u0000\u0000\u0000\u010c\u05f8"+
		"\u0001\u0000\u0000\u0000\u010e\u05fb\u0001\u0000\u0000\u0000\u0110\u060d"+
		"\u0001\u0000\u0000\u0000\u0112\u060f\u0001\u0000\u0000\u0000\u0114\u0616"+
		"\u0001\u0000\u0000\u0000\u0116\u061b\u0001\u0000\u0000\u0000\u0118\u061e"+
		"\u0001\u0000\u0000\u0000\u011a\u0639\u0001\u0000\u0000\u0000\u011c\u063b"+
		"\u0001\u0000\u0000\u0000\u011e\u0642\u0001\u0000\u0000\u0000\u0120\u0647"+
		"\u0001\u0000\u0000\u0000\u0122\u064a\u0001\u0000\u0000\u0000\u0124\u065b"+
		"\u0001\u0000\u0000\u0000\u0126\u065d\u0001\u0000\u0000\u0000\u0128\u0664"+
		"\u0001\u0000\u0000\u0000\u012a\u0669\u0001\u0000\u0000\u0000\u012c\u0671"+
		"\u0001\u0000\u0000\u0000\u012e\u0673\u0001\u0000\u0000\u0000\u0130\u0678"+
		"\u0001\u0000\u0000\u0000\u0132\u0681\u0001\u0000\u0000\u0000\u0134\u068f"+
		"\u0001\u0000\u0000\u0000\u0136\u0697\u0001\u0000\u0000\u0000\u0138\u06a7"+
		"\u0001\u0000\u0000\u0000\u013a\u06b5\u0001\u0000\u0000\u0000\u013c\u06be"+
		"\u0001\u0000\u0000\u0000\u013e\u06c1\u0001\u0000\u0000\u0000\u0140\u06c7"+
		"\u0001\u0000\u0000\u0000\u0142\u06d6\u0001\u0000\u0000\u0000\u0144\u06dd"+
		"\u0001\u0000\u0000\u0000\u0146\u06e2\u0001\u0000\u0000\u0000\u0148\u06e4"+
		"\u0001\u0000\u0000\u0000\u014a\u06ef\u0001\u0000\u0000\u0000\u014c\u06fa"+
		"\u0001\u0000\u0000\u0000\u014e\u0703\u0001\u0000\u0000\u0000\u0150\u0705"+
		"\u0001\u0000\u0000\u0000\u0152\u0709\u0001\u0000\u0000\u0000\u0154\u070d"+
		"\u0001\u0000\u0000\u0000\u0156\u0713\u0001\u0000\u0000\u0000\u0158\u0716"+
		"\u0001\u0000\u0000\u0000\u015a\u071f\u0001\u0000\u0000\u0000\u015c\u0726"+
		"\u0001\u0000\u0000\u0000\u015e\u0728\u0001\u0000\u0000\u0000\u0160\u072c"+
		"\u0001\u0000\u0000\u0000\u0162\u0730\u0001\u0000\u0000\u0000\u0164\u0734"+
		"\u0001\u0000\u0000\u0000\u0166\u073c\u0001\u0000\u0000\u0000\u0168\u0759"+
		"\u0001\u0000\u0000\u0000\u016a\u075c\u0001\u0000\u0000\u0000\u016c\u0760"+
		"\u0001\u0000\u0000\u0000\u016e\u0766\u0001\u0000\u0000\u0000\u0170\u0777"+
		"\u0001\u0000\u0000\u0000\u0172\u0781\u0001\u0000\u0000\u0000\u0174\u0783"+
		"\u0001\u0000\u0000\u0000\u0176\u0789\u0001\u0000\u0000\u0000\u0178\u078b"+
		"\u0001\u0000\u0000\u0000\u017a\u0791\u0001\u0000\u0000\u0000\u017c\u079c"+
		"\u0001\u0000\u0000\u0000\u017e\u07a1\u0001\u0000\u0000\u0000\u0180\u07a8"+
		"\u0001\u0000\u0000\u0000\u0182\u07ab\u0001\u0000\u0000\u0000\u0184\u07ad"+
		"\u0001\u0000\u0000\u0000\u0186\u07b2\u0001\u0000\u0000\u0000\u0188\u07ba"+
		"\u0001\u0000\u0000\u0000\u018a\u07c1\u0001\u0000\u0000\u0000\u018c\u07c6"+
		"\u0001\u0000\u0000\u0000\u018e\u07de\u0001\u0000\u0000\u0000\u0190\u07e6"+
		"\u0001\u0000\u0000\u0000\u0192\u07e9\u0001\u0000\u0000\u0000\u0194\u07ef"+
		"\u0001\u0000\u0000\u0000\u0196\u07fc\u0001\u0000\u0000\u0000\u0198\u07fe"+
		"\u0001\u0000\u0000\u0000\u019a\u0801\u0001\u0000\u0000\u0000\u019c\u0812"+
		"\u0001\u0000\u0000\u0000\u019e\u0815\u0001\u0000\u0000\u0000\u01a0\u0819"+
		"\u0001\u0000\u0000\u0000\u01a2\u0822\u0001\u0000\u0000\u0000\u01a4\u0838"+
		"\u0001\u0000\u0000\u0000\u01a6\u083a\u0001\u0000\u0000\u0000\u01a8\u084c"+
		"\u0001\u0000\u0000\u0000\u01aa\u084e\u0001\u0000\u0000\u0000\u01ac\u0854"+
		"\u0001\u0000\u0000\u0000\u01ae\u085f\u0001\u0000\u0000\u0000\u01b0\u0861"+
		"\u0001\u0000\u0000\u0000\u01b2\u0868\u0001\u0000\u0000\u0000\u01b4\u0873"+
		"\u0001\u0000\u0000\u0000\u01b6\u0898\u0001\u0000\u0000\u0000\u01b8\u08a6"+
		"\u0001\u0000\u0000\u0000\u01ba\u08b3\u0001\u0000\u0000\u0000\u01bc\u08b5"+
		"\u0001\u0000\u0000\u0000\u01be\u08cd\u0001\u0000\u0000\u0000\u01c0\u08d5"+
		"\u0001\u0000\u0000\u0000\u01c2\u08d7\u0001\u0000\u0000\u0000\u01c4\u08df"+
		"\u0001\u0000\u0000\u0000\u01c6\u08e6\u0001\u0000\u0000\u0000\u01c8\u08ea"+
		"\u0001\u0000\u0000\u0000\u01ca\u08f3\u0001\u0000\u0000\u0000\u01cc\u0905"+
		"\u0001\u0000\u0000\u0000\u01ce\u0907\u0001\u0000\u0000\u0000\u01d0\u0910"+
		"\u0001\u0000\u0000\u0000\u01d2\u0914\u0001\u0000\u0000\u0000\u01d4\u0920"+
		"\u0001\u0000\u0000\u0000\u01d6\u0922\u0001\u0000\u0000\u0000\u01d8\u092d"+
		"\u0001\u0000\u0000\u0000\u01da\u0931\u0001\u0000\u0000\u0000\u01dc\u0933"+
		"\u0001\u0000\u0000\u0000\u01de\u093a\u0001\u0000\u0000\u0000\u01e0\u0947"+
		"\u0001\u0000\u0000\u0000\u01e2\u094a\u0001\u0000\u0000\u0000\u01e4\u0955"+
		"\u0001\u0000\u0000\u0000\u01e6\u0957\u0001\u0000\u0000\u0000\u01e8\u0960"+
		"\u0001\u0000\u0000\u0000\u01ea\u0965\u0001\u0000\u0000\u0000\u01ec\u097d"+
		"\u0001\u0000\u0000\u0000\u01ee\u097f\u0001\u0000\u0000\u0000\u01f0\u0987"+
		"\u0001\u0000\u0000\u0000\u01f2\u0993\u0001\u0000\u0000\u0000\u01f4\u0996"+
		"\u0001\u0000\u0000\u0000\u01f6\u099a\u0001\u0000\u0000\u0000\u01f8\u099d"+
		"\u0001\u0000\u0000\u0000\u01fa\u09a0\u0001\u0000\u0000\u0000\u01fc\u09a6"+
		"\u0001\u0000\u0000\u0000\u01fe\u09af\u0001\u0000\u0000\u0000\u0200\u09b6"+
		"\u0001\u0000\u0000\u0000\u0202\u09bb\u0001\u0000\u0000\u0000\u0204\u09bf"+
		"\u0001\u0000\u0000\u0000\u0206\u09c4\u0001\u0000\u0000\u0000\u0208\u09c8"+
		"\u0001\u0000\u0000\u0000\u020a\u09d9\u0001\u0000\u0000\u0000\u020c\u09eb"+
		"\u0001\u0000\u0000\u0000\u020e\u09f4\u0001\u0000\u0000\u0000\u0210\u09fc"+
		"\u0001\u0000\u0000\u0000\u0212\u09fe\u0001\u0000\u0000\u0000\u0214\u0a04"+
		"\u0001\u0000\u0000\u0000\u0216\u0a10\u0001\u0000\u0000\u0000\u0218\u0a17"+
		"\u0001\u0000\u0000\u0000\u021a\u0a1c\u0001\u0000\u0000\u0000\u021c\u0a25"+
		"\u0001\u0000\u0000\u0000\u021e\u0a2e\u0001\u0000\u0000\u0000\u0220\u0a40"+
		"\u0001\u0000\u0000\u0000\u0222\u0a43\u0001\u0000\u0000\u0000\u0224\u0a47"+
		"\u0001\u0000\u0000\u0000\u0226\u0a4b\u0001\u0000\u0000\u0000\u0228\u0a51"+
		"\u0001\u0000\u0000\u0000\u022a\u0a5c\u0001\u0000\u0000\u0000\u022c\u0a5f"+
		"\u0001\u0000\u0000\u0000\u022e\u0a62\u0001\u0000\u0000\u0000\u0230\u0a64"+
		"\u0001\u0000\u0000\u0000\u0232\u0a66\u0001\u0000\u0000\u0000\u0234\u0a69"+
		"\u0001\u0000\u0000\u0000\u0236\u0a7a\u0001\u0000\u0000\u0000\u0238\u0a7c"+
		"\u0001\u0000\u0000\u0000\u023a\u0a84\u0001\u0000\u0000\u0000\u023c\u0a86"+
		"\u0001\u0000\u0000\u0000\u023e\u0a89\u0001\u0000\u0000\u0000\u0240\u0a8c"+
		"\u0001\u0000\u0000\u0000\u0242\u0a90\u0001\u0000\u0000\u0000\u0244\u0a94"+
		"\u0001\u0000\u0000\u0000\u0246\u0a98\u0001\u0000\u0000\u0000\u0248\u0a9b"+
		"\u0001\u0000\u0000\u0000\u024a\u0a9f\u0001\u0000\u0000\u0000\u024c\u0aa4"+
		"\u0001\u0000\u0000\u0000\u024e\u0aa8\u0001\u0000\u0000\u0000\u0250\u0aab"+
		"\u0001\u0000\u0000\u0000\u0252\u0aae\u0001\u0000\u0000\u0000\u0254\u0ab8"+
		"\u0001\u0000\u0000\u0000\u0256\u0abc\u0001\u0000\u0000\u0000\u0258\u0ac0"+
		"\u0001\u0000\u0000\u0000\u025a\u0ac4\u0001\u0000\u0000\u0000\u025c\u0ac8"+
		"\u0001\u0000\u0000\u0000\u025e\u0acc\u0001\u0000\u0000\u0000\u0260\u0ad0"+
		"\u0001\u0000\u0000\u0000\u0262\u0ad8\u0001\u0000\u0000\u0000\u0264\u0ae2"+
		"\u0001\u0000\u0000\u0000\u0266\u0ae4\u0001\u0000\u0000\u0000\u0268\u0ae6"+
		"\u0001\u0000\u0000\u0000\u026a\u0ae8\u0001\u0000\u0000\u0000\u026c\u0aed"+
		"\u0001\u0000\u0000\u0000\u026e\u0afd\u0001\u0000\u0000\u0000\u0270\u0b0f"+
		"\u0001\u0000\u0000\u0000\u0272\u0b35\u0001\u0000\u0000\u0000\u0274\u0276"+
		"\u0003\u0004\u0002\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0005\u0000\u0000\u0001\u0278\u0001\u0001\u0000\u0000\u0000\u0279\u0282"+
		"\u0003\u0006\u0003\u0000\u027a\u0282\u0003\u009cN\u0000\u027b\u0282\u0003"+
		"\u0016\u000b\u0000\u027c\u0282\u00038\u001c\u0000\u027d\u0282\u0003>\u001f"+
		"\u0000\u027e\u0282\u0003J%\u0000\u027f\u0282\u0003L&\u0000\u0280\u0282"+
		"\u0003\u0192\u00c9\u0000\u0281\u0279\u0001\u0000\u0000\u0000\u0281\u027a"+
		"\u0001\u0000\u0000\u0000\u0281\u027b\u0001\u0000\u0000\u0000\u0281\u027c"+
		"\u0001\u0000\u0000\u0000\u0281\u027d\u0001\u0000\u0000\u0000\u0281\u027e"+
		"\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u0285"+
		"\u0005\u0093\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285"+
		"\u0001\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0288"+
		"\u0003V+\u0000\u0287\u0281\u0001\u0000\u0000\u0000\u0287\u0286\u0001\u0000"+
		"\u0000\u0000\u0288\u0003\u0001\u0000\u0000\u0000\u0289\u028a\u0004\u0002"+
		"\u0000\u0001\u028a\u028b\u0003\u0002\u0001\u0000\u028b\u028c\u0006\u0002"+
		"\uffff\uffff\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u0289\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0005\u0001"+
		"\u0000\u0000\u0000\u0291\u0295\u0003\b\u0004\u0000\u0292\u0295\u0003\n"+
		"\u0005\u0000\u0293\u0295\u0003\u0014\n\u0000\u0294\u0291\u0001\u0000\u0000"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0295\u0007\u0001\u0000\u0000\u0000\u0296\u0298\u0005\u000e\u0000"+
		"\u0000\u0297\u0299\u0005\u0004\u0000\u0000\u0298\u0297\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0003\u0170\u00b8\u0000\u029b\u029c\u0005\u0011\u0000"+
		"\u0000\u029c\u029e\u0003\u0192\u00c9\u0000\u029d\u029f\u0003*\u0015\u0000"+
		"\u029e\u029d\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0003\u00a2Q\u0000\u02a1"+
		"\t\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005\u001a\u0000\u0000\u02a3\u02a4"+
		"\u0003\f\u0006\u0000\u02a4\u02a5\u0003\u00a2Q\u0000\u02a5\u000b\u0001"+
		"\u0000\u0000\u0000\u02a6\u02ab\u0003\u000e\u0007\u0000\u02a7\u02a8\u0005"+
		"\u0091\u0000\u0000\u02a8\u02aa\u0003\u000e\u0007\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\r\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02b3\u0003|>\u0000"+
		"\u02af\u02b3\u0003\u0192\u00c9\u0000\u02b0\u02b3\u0003\u0010\b\u0000\u02b1"+
		"\u02b3\u0003\u0012\t\u0000\u02b2\u02ae\u0001\u0000\u0000\u0000\u02b2\u02af"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u000f\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0005\u0004\u0000\u0000\u02b5\u02b6\u0003\u0170\u00b8\u0000\u02b6\u02b7"+
		"\u0003\u00b2Y\u0000\u02b7\u0011\u0001\u0000\u0000\u0000\u02b8\u02b9\u0007"+
		"\u0000\u0000\u0000\u02b9\u02ba\u0003\u0170\u00b8\u0000\u02ba\u02bb\u0003"+
		"\u00b2Y\u0000\u02bb\u0013\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005\""+
		"\u0000\u0000\u02bd\u02be\u0003\u00a2Q\u0000\u02be\u02bf\u0005\u001a\u0000"+
		"\u0000\u02bf\u02c0\u0003\u0192\u00c9\u0000\u02c0\u0015\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c5\u0003\u0018\f\u0000\u02c2\u02c5\u0003\u001c\u000e\u0000"+
		"\u02c3\u02c5\u0003\u001e\u000f\u0000\u02c4\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c5\u0017\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005\u0012\u0000\u0000"+
		"\u02c7\u02c8\u0003\f\u0006\u0000\u02c8\u02ca\u0003\u00a2Q\u0000\u02c9"+
		"\u02cb\u0003\u001a\r\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u0019\u0001\u0000\u0000\u0000\u02cc\u02cd"+
		"\u0005\f\u0000\u0000\u02cd\u02d1\u0003\u00a2Q\u0000\u02ce\u02cf\u0005"+
		"\f\u0000\u0000\u02cf\u02d1\u0003\u0018\f\u0000\u02d0\u02cc\u0001\u0000"+
		"\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u001b\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\u0005\u000b\u0000\u0000\u02d3\u02d4\u0003\f\u0006"+
		"\u0000\u02d4\u02d5\u0005\f\u0000\u0000\u02d5\u02d6\u0003\u00a2Q\u0000"+
		"\u02d6\u001d\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005#\u0000\u0000\u02d8"+
		"\u02d9\u0003\u0192\u00c9\u0000\u02d9\u02db\u0005\u008b\u0000\u0000\u02da"+
		"\u02dc\u0003 \u0010\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005\u008e\u0000\u0000\u02de\u001f\u0001\u0000\u0000\u0000\u02df\u02e1"+
		"\u0003\"\u0011\u0000\u02e0\u02e2\u0003 \u0010\u0000\u02e1\u02e0\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2!\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e6\u0003$\u0012\u0000\u02e4\u02e6\u0003(\u0014\u0000"+
		"\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0003\u0004\u0002\u0000"+
		"\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02eb\u0003.\u0017\u0000\u02ea"+
		"\u02e5\u0001\u0000\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"#\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003\u018a\u00c5\u0000\u02ed\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u0004\u0000\u0000\u02f0\u02f1"+
		"\u0003&\u0013\u0000\u02f1\u02f2\u0005\u0092\u0000\u0000\u02f2%\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f5\u0003\u0170\u00b8\u0000\u02f4\u02f6\u0003*\u0015"+
		"\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f6\u02fe\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005\u0091\u0000"+
		"\u0000\u02f8\u02fa\u0003\u0170\u00b8\u0000\u02f9\u02fb\u0003*\u0015\u0000"+
		"\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02f7\u0001\u0000\u0000\u0000"+
		"\u02fd\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\'\u0001\u0000\u0000\u0000\u0300"+
		"\u02fe\u0001\u0000\u0000\u0000\u0301\u0303\u0003\u018a\u00c5\u0000\u0302"+
		"\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0005\b\u0000\u0000\u0305\u0306"+
		"\u0005\u0092\u0000\u0000\u0306)\u0001\u0000\u0000\u0000\u0307\u0308\u0005"+
		"\u0019\u0000\u0000\u0308\u0309\u0003,\u0016\u0000\u0309+\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0003\u0192\u00c9\u0000\u030b-\u0001\u0000\u0000\u0000"+
		"\u030c\u030e\u00030\u0018\u0000\u030d\u030f\u00032\u0019\u0000\u030e\u030d"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311"+
		"\u0001\u0000\u0000\u0000\u0310\u0312\u00036\u001b\u0000\u0311\u0310\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001"+
		"\u0000\u0000\u0000\u0313\u0314\u0005z\u0000\u0000\u0314/\u0001\u0000\u0000"+
		"\u0000\u0315\u0316\u0005w\u0000\u0000\u0316\u0318\u0003b1\u0000\u0317"+
		"\u0319\u0003 \u0010\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0001\u0000\u0000\u0000\u03191\u0001\u0000\u0000\u0000\u031a\u031c\u0003"+
		"^/\u0000\u031b\u031d\u00032\u0019\u0000\u031c\u031b\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d3\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0005x\u0000\u0000\u031f\u0321\u0003b1\u0000\u0320\u0322"+
		"\u0003 \u0010\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0321\u0322\u0001"+
		"\u0000\u0000\u0000\u03225\u0001\u0000\u0000\u0000\u0323\u0325\u0005y\u0000"+
		"\u0000\u0324\u0326\u0003 \u0010\u0000\u0325\u0324\u0001\u0000\u0000\u0000"+
		"\u0325\u0326\u0001\u0000\u0000\u0000\u03267\u0001\u0000\u0000\u0000\u0327"+
		"\u032c\u0003:\u001d\u0000\u0328\u032d\u0003\u0006\u0003\u0000\u0329\u032d"+
		"\u0003\u0018\f\u0000\u032a\u032d\u0003\u001e\u000f\u0000\u032b\u032d\u0003"+
		"L&\u0000\u032c\u0328\u0001\u0000\u0000\u0000\u032c\u0329\u0001\u0000\u0000"+
		"\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032b\u0001\u0000\u0000"+
		"\u0000\u032d9\u0001\u0000\u0000\u0000\u032e\u032f\u0003<\u001e\u0000\u032f"+
		"\u0330\u0005\u0092\u0000\u0000\u0330;\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0003\u0236\u011b\u0000\u0332=\u0001\u0000\u0000\u0000\u0333\u0339\u0003"+
		"@ \u0000\u0334\u0339\u0003B!\u0000\u0335\u0339\u0003D\"\u0000\u0336\u0339"+
		"\u0003F#\u0000\u0337\u0339\u0003H$\u0000\u0338\u0333\u0001\u0000\u0000"+
		"\u0000\u0338\u0334\u0001\u0000\u0000\u0000\u0338\u0335\u0001\u0000\u0000"+
		"\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0337\u0001\u0000\u0000"+
		"\u0000\u0339?\u0001\u0000\u0000\u0000\u033a\u033c\u0005\u0003\u0000\u0000"+
		"\u033b\u033d\u0003<\u001e\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0001\u0000\u0000\u0000\u033dA\u0001\u0000\u0000\u0000\u033e\u0340"+
		"\u0005\u0007\u0000\u0000\u033f\u0341\u0003<\u001e\u0000\u0340\u033f\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341C\u0001\u0000"+
		"\u0000\u0000\u0342\u0343\u0005\u000f\u0000\u0000\u0343E\u0001\u0000\u0000"+
		"\u0000\u0344\u0346\u0005%\u0000\u0000\u0345\u0347\u0003\u0192\u00c9\u0000"+
		"\u0346\u0345\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000"+
		"\u0347G\u0001\u0000\u0000\u0000\u0348\u0349\u0005&\u0000\u0000\u0349\u034a"+
		"\u0003\u0192\u00c9\u0000\u034aI\u0001\u0000\u0000\u0000\u034b\u034c\u0005"+
		"\t\u0000\u0000\u034c\u034d\u0003\u00a2Q\u0000\u034dK\u0001\u0000\u0000"+
		"\u0000\u034e\u034f\u0005\n\u0000\u0000\u034f\u0351\u0003\u00a2Q\u0000"+
		"\u0350\u0352\u0003N\'\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0001\u0000\u0000\u0000\u0352M\u0001\u0000\u0000\u0000\u0353\u0355"+
		"\u0003P(\u0000\u0354\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357O\u0001\u0000\u0000\u0000\u0358\u035a\u0005\u0005\u0000"+
		"\u0000\u0359\u035b\u0003R)\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035a"+
		"\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0003\u00a2Q\u0000\u035dQ\u0001\u0000\u0000\u0000\u035e\u0365\u0003"+
		"T*\u0000\u035f\u0360\u0003T*\u0000\u0360\u0361\u0005\u0091\u0000\u0000"+
		"\u0361\u0362\u0003T*\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u035f"+
		"\u0001\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365\u0363"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366S\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u036a\u0003"+
		"\u0170\u00b8\u0000\u0369\u036b\u0003*\u0015\u0000\u036a\u0369\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036bU\u0001\u0000\u0000"+
		"\u0000\u036c\u0370\u0003X,\u0000\u036d\u0370\u0003r9\u0000\u036e\u0370"+
		"\u0003x<\u0000\u036f\u036c\u0001\u0000\u0000\u0000\u036f\u036d\u0001\u0000"+
		"\u0000\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u0370W\u0001\u0000\u0000"+
		"\u0000\u0371\u0373\u0003Z-\u0000\u0372\u0374\u0003\\.\u0000\u0373\u0372"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376"+
		"\u0001\u0000\u0000\u0000\u0375\u0377\u0003`0\u0000\u0376\u0375\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000"+
		"\u0000\u0000\u0378\u0379\u0005z\u0000\u0000\u0379Y\u0001\u0000\u0000\u0000"+
		"\u037a\u037b\u0005w\u0000\u0000\u037b\u037d\u0003b1\u0000\u037c\u037e"+
		"\u0003\u0004\u0002\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0001\u0000\u0000\u0000\u037e[\u0001\u0000\u0000\u0000\u037f\u0381\u0003"+
		"^/\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000"+
		"\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000"+
		"\u0000\u0383]\u0001\u0000\u0000\u0000\u0384\u0385\u0005x\u0000\u0000\u0385"+
		"\u0387\u0003b1\u0000\u0386\u0388\u0003\u0004\u0002\u0000\u0387\u0386\u0001"+
		"\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388_\u0001\u0000"+
		"\u0000\u0000\u0389\u038b\u0005y\u0000\u0000\u038a\u038c\u0003\u0004\u0002"+
		"\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000"+
		"\u0000\u038ca\u0001\u0000\u0000\u0000\u038d\u038e\u00061\uffff\uffff\u0000"+
		"\u038e\u0398\u0003d2\u0000\u038f\u0398\u0003\u0236\u011b\u0000\u0390\u0398"+
		"\u0003\u0266\u0133\u0000\u0391\u0392\u0005\u008c\u0000\u0000\u0392\u0393"+
		"\u0003b1\u0000\u0393\u0394\u0005\u008f\u0000\u0000\u0394\u0398\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0005\u0097\u0000\u0000\u0396\u0398\u0003b1\u0002"+
		"\u0397\u038d\u0001\u0000\u0000\u0000\u0397\u038f\u0001\u0000\u0000\u0000"+
		"\u0397\u0390\u0001\u0000\u0000\u0000\u0397\u0391\u0001\u0000\u0000\u0000"+
		"\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u03a2\u0001\u0000\u0000\u0000"+
		"\u0399\u039c\n\u0001\u0000\u0000\u039a\u039d\u0003\u0240\u0120\u0000\u039b"+
		"\u039d\u0003\u0242\u0121\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c"+
		"\u039b\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u039f\u0003b1\u0002\u039f\u03a1\u0001\u0000\u0000\u0000\u03a0\u0399\u0001"+
		"\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3c\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a6\u0005<\u0000"+
		"\u0000\u03a6\u03a7\u0005\u008c\u0000\u0000\u03a7\u03a8\u0003j5\u0000\u03a8"+
		"\u03a9\u0005\u008f\u0000\u0000\u03a9\u03c3\u0001\u0000\u0000\u0000\u03aa"+
		"\u03ab\u0005=\u0000\u0000\u03ab\u03ac\u0005\u008c\u0000\u0000\u03ac\u03ad"+
		"\u0003l6\u0000\u03ad\u03ae\u0005\u008f\u0000\u0000\u03ae\u03c3\u0001\u0000"+
		"\u0000\u0000\u03af\u03b0\u0007\u0001\u0000\u0000\u03b0\u03b3\u0005\u008c"+
		"\u0000\u0000\u03b1\u03b4\u0003\u0244\u0122\u0000\u03b2\u03b4\u0003\u0246"+
		"\u0123\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b6\u0003f3\u0000"+
		"\u03b6\u03b7\u0005\u008f\u0000\u0000\u03b7\u03c3\u0001\u0000\u0000\u0000"+
		"\u03b8\u03b9\u0005@\u0000\u0000\u03b9\u03ba\u0005\u008c\u0000\u0000\u03ba"+
		"\u03bb\u0003n7\u0000\u03bb\u03bc\u0005\u008f\u0000\u0000\u03bc\u03c3\u0001"+
		"\u0000\u0000\u0000\u03bd\u03be\u0005A\u0000\u0000\u03be\u03bf\u0005\u008c"+
		"\u0000\u0000\u03bf\u03c0\u0003p8\u0000\u03c0\u03c1\u0005\u008f\u0000\u0000"+
		"\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03a5\u0001\u0000\u0000\u0000"+
		"\u03c2\u03aa\u0001\u0000\u0000\u0000\u03c2\u03af\u0001\u0000\u0000\u0000"+
		"\u03c2\u03b8\u0001\u0000\u0000\u0000\u03c2\u03bd\u0001\u0000\u0000\u0000"+
		"\u03c3e\u0001\u0000\u0000\u0000\u03c4\u03c6\u0005\u00ac\u0000\u0000\u03c5"+
		"\u03c7\u0003h4\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c7g\u0001\u0000\u0000\u0000\u03c8\u03c9\u0005\u008a"+
		"\u0000\u0000\u03c9\u03cb\u0005\u00ac\u0000\u0000\u03ca\u03cc\u0003h4\u0000"+
		"\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cci\u0001\u0000\u0000\u0000\u03cd\u03ce\u0007\u0002\u0000\u0000\u03ce"+
		"k\u0001\u0000\u0000\u0000\u03cf\u03d0\u0007\u0003\u0000\u0000\u03d0m\u0001"+
		"\u0000\u0000\u0000\u03d1\u03d6\u0003\u0236\u011b\u0000\u03d2\u03d3\u0005"+
		"\u008a\u0000\u0000\u03d3\u03d5\u0003\u0236\u011b\u0000\u03d4\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d8\u0001\u0000\u0000\u0000\u03d6\u03d4\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7o\u0001\u0000"+
		"\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d9\u03da\u0007\u0004"+
		"\u0000\u0000\u03daq\u0001\u0000\u0000\u0000\u03db\u03dc\u0005q\u0000\u0000"+
		"\u03dc\u03e5\u0005\u008c\u0000\u0000\u03dd\u03de\u0005r\u0000\u0000\u03de"+
		"\u03df\u0005\u0092\u0000\u0000\u03df\u03e0\u0003v;\u0000\u03e0\u03e1\u0005"+
		"\u0091\u0000\u0000\u03e1\u03e2\u0005s\u0000\u0000\u03e2\u03e3\u0005\u0092"+
		"\u0000\u0000\u03e3\u03e4\u0003t:\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e5\u03dd\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u0005\u008f\u0000\u0000"+
		"\u03e8s\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005\u00ad\u0000\u0000\u03ea"+
		"u\u0001\u0000\u0000\u0000\u03eb\u03ec\u0003\u0270\u0138\u0000\u03ecw\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0007\u0005\u0000\u0000\u03ee\u03ef\u0005"+
		"\u008c\u0000\u0000\u03ef\u03f0\u0003z=\u0000\u03f0\u03f1\u0005\u008f\u0000"+
		"\u0000\u03f1y\u0001\u0000\u0000\u0000\u03f2\u03f3\u0003\u0270\u0138\u0000"+
		"\u03f3{\u0001\u0000\u0000\u0000\u03f4\u03f5\u0005v\u0000\u0000\u03f5\u03f6"+
		"\u0005\u008c\u0000\u0000\u03f6\u03f7\u0003~?\u0000\u03f7\u03f8\u0005\u008f"+
		"\u0000\u0000\u03f8}\u0001\u0000\u0000\u0000\u03f9\u03fe\u0003\u0080@\u0000"+
		"\u03fa\u03fb\u0005\u0091\u0000\u0000\u03fb\u03fd\u0003\u0080@\u0000\u03fc"+
		"\u03fa\u0001\u0000\u0000\u0000\u03fd\u0400\u0001\u0000\u0000\u0000\u03fe"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff"+
		"\u007f\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0003\u0082A\u0000\u0402\u0403\u0003\u0084B\u0000\u0403\u0406\u0001"+
		"\u0000\u0000\u0000\u0404\u0406\u0005\u00a0\u0000\u0000\u0405\u0401\u0001"+
		"\u0000\u0000\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0406\u0081\u0001"+
		"\u0000\u0000\u0000\u0407\u0408\u0007\u0006\u0000\u0000\u0408\u0083\u0001"+
		"\u0000\u0000\u0000\u0409\u0411\u0005\u00ad\u0000\u0000\u040a\u0411\u0005"+
		"\u00ac\u0000\u0000\u040b\u040e\u0005\u00af\u0000\u0000\u040c\u040d\u0005"+
		"\u008a\u0000\u0000\u040d\u040f\u0005\u00ac\u0000\u0000\u040e\u040c\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0411\u0001"+
		"\u0000\u0000\u0000\u0410\u0409\u0001\u0000\u0000\u0000\u0410\u040a\u0001"+
		"\u0000\u0000\u0000\u0410\u040b\u0001\u0000\u0000\u0000\u0411\u0085\u0001"+
		"\u0000\u0000\u0000\u0412\u0413\u0005\u0094\u0000\u0000\u0413\u0414\u0003"+
		"\u0088D\u0000\u0414\u0415\u0005\u0095\u0000\u0000\u0415\u0087\u0001\u0000"+
		"\u0000\u0000\u0416\u041b\u0003\u008aE\u0000\u0417\u0418\u0005\u0091\u0000"+
		"\u0000\u0418\u041a\u0003\u008aE\u0000\u0419\u0417\u0001\u0000\u0000\u0000"+
		"\u041a\u041d\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000"+
		"\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u0089\u0001\u0000\u0000\u0000"+
		"\u041d\u041b\u0001\u0000\u0000\u0000\u041e\u0424\u0003\u0210\u0108\u0000"+
		"\u041f\u0422\u0005\u0092\u0000\u0000\u0420\u0423\u0003\u020e\u0107\u0000"+
		"\u0421\u0423\u0003\u0228\u0114\u0000\u0422\u0420\u0001\u0000\u0000\u0000"+
		"\u0422\u0421\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000"+
		"\u0424\u041f\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000"+
		"\u0425\u008b\u0001\u0000\u0000\u0000\u0426\u0427\u0005\u0019\u0000\u0000"+
		"\u0427\u0428\u0003\u008eG\u0000\u0428\u008d\u0001\u0000\u0000\u0000\u0429"+
		"\u042e\u0003\u0090H\u0000\u042a\u042b\u0005\u0091\u0000\u0000\u042b\u042d"+
		"\u0003\u0090H\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042d\u0430\u0001"+
		"\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000\u0000\u042e\u042f\u0001"+
		"\u0000\u0000\u0000\u042f\u008f\u0001\u0000\u0000\u0000\u0430\u042e\u0001"+
		"\u0000\u0000\u0000\u0431\u0434\u0003\u0092I\u0000\u0432\u0434\u0003\u0094"+
		"J\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0432\u0001\u0000\u0000"+
		"\u0000\u0434\u0091\u0001\u0000\u0000\u0000\u0435\u0436\u0003\u020e\u0107"+
		"\u0000\u0436\u0439\u0005\u0092\u0000\u0000\u0437\u043a\u0003\u020e\u0107"+
		"\u0000\u0438\u043a\u0003\u0228\u0114\u0000\u0439\u0437\u0001\u0000\u0000"+
		"\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u043a\u0093\u0001\u0000\u0000"+
		"\u0000\u043b\u043c\u0003\u020e\u0107\u0000\u043c\u043f\u0003\u024c\u0126"+
		"\u0000\u043d\u0440\u0003\u020e\u0107\u0000\u043e\u0440\u0003\u020a\u0105"+
		"\u0000\u043f\u043d\u0001\u0000\u0000\u0000\u043f\u043e\u0001\u0000\u0000"+
		"\u0000\u0440\u0095\u0001\u0000\u0000\u0000\u0441\u0442\u0005\u0094\u0000"+
		"\u0000\u0442\u0443\u0003\u0098L\u0000\u0443\u0444\u0005\u0095\u0000\u0000"+
		"\u0444\u0097\u0001\u0000\u0000\u0000\u0445\u044a\u0003\u009aM\u0000\u0446"+
		"\u0447\u0005\u0091\u0000\u0000\u0447\u0449\u0003\u009aM\u0000\u0448\u0446"+
		"\u0001\u0000\u0000\u0000\u0449\u044c\u0001\u0000\u0000\u0000\u044a\u0448"+
		"\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u0099"+
		"\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044d\u044e"+
		"\u0003\u020a\u0105\u0000\u044e\u009b\u0001\u0000\u0000\u0000\u044f\u045f"+
		"\u0003\u00a4R\u0000\u0450\u045f\u0003\u00acV\u0000\u0451\u045f\u0003\u00b4"+
		"Z\u0000\u0452\u045f\u0003\u00ceg\u0000\u0453\u045f\u0003\u00d4j\u0000"+
		"\u0454\u045f\u0003\u00ecv\u0000\u0455\u045f\u0003\u010e\u0087\u0000\u0456"+
		"\u045f\u0003\u0118\u008c\u0000\u0457\u045f\u0003\u0122\u0091\u0000\u0458"+
		"\u045f\u0003\u0138\u009c\u0000\u0459\u045f\u0003\u013e\u009f\u0000\u045a"+
		"\u045f\u0003\u0140\u00a0\u0000\u045b\u045f\u0003\u0148\u00a4\u0000\u045c"+
		"\u045f\u0003\u014e\u00a7\u0000\u045d\u045f\u0003\u0158\u00ac\u0000\u045e"+
		"\u044f\u0001\u0000\u0000\u0000\u045e\u0450\u0001\u0000\u0000\u0000\u045e"+
		"\u0451\u0001\u0000\u0000\u0000\u045e\u0452\u0001\u0000\u0000\u0000\u045e"+
		"\u0453\u0001\u0000\u0000\u0000\u045e\u0454\u0001\u0000\u0000\u0000\u045e"+
		"\u0455\u0001\u0000\u0000\u0000\u045e\u0456\u0001\u0000\u0000\u0000\u045e"+
		"\u0457\u0001\u0000\u0000\u0000\u045e\u0458\u0001\u0000\u0000\u0000\u045e"+
		"\u0459\u0001\u0000\u0000\u0000\u045e\u045a\u0001\u0000\u0000\u0000\u045e"+
		"\u045b\u0001\u0000\u0000\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045e"+
		"\u045d\u0001\u0000\u0000\u0000\u045f\u0461\u0001\u0000\u0000\u0000\u0460"+
		"\u0462\u0005\u0093\u0000\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0461"+
		"\u0462\u0001\u0000\u0000\u0000\u0462\u009d\u0001\u0000\u0000\u0000\u0463"+
		"\u0465\u0003\u009cN\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0465\u0466"+
		"\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u009f\u0001\u0000\u0000\u0000\u0468\u046a"+
		"\u0003\u0004\u0002\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0001\u0000\u0000\u0000\u046a\u00a1\u0001\u0000\u0000\u0000\u046b\u046d"+
		"\u0005\u008b\u0000\u0000\u046c\u046e\u0003\u0004\u0002\u0000\u046d\u046c"+
		"\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u046f"+
		"\u0001\u0000\u0000\u0000\u046f\u0470\u0005\u008e\u0000\u0000\u0470\u00a3"+
		"\u0001\u0000\u0000\u0000\u0471\u0473\u0003\u018a\u00c5\u0000\u0472\u0471"+
		"\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0474"+
		"\u0001\u0000\u0000\u0000\u0474\u0476\u0005\u0013\u0000\u0000\u0475\u0477"+
		"\u0003\u00a6S\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0476\u0477\u0001"+
		"\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u0479\u0003"+
		"\u00a8T\u0000\u0479\u00a5\u0001\u0000\u0000\u0000\u047a\u047b\u0007\u0007"+
		"\u0000\u0000\u047b\u00a7\u0001\u0000\u0000\u0000\u047c\u0481\u0003\u00aa"+
		"U\u0000\u047d\u047e\u0005\u008a\u0000\u0000\u047e\u0480\u0003\u00aaU\u0000"+
		"\u047f\u047d\u0001\u0000\u0000\u0000\u0480\u0483\u0001\u0000\u0000\u0000"+
		"\u0481\u047f\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000"+
		"\u0482\u00a9\u0001\u0000\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000"+
		"\u0484\u0487\u0003\u0236\u011b\u0000\u0485\u0487\u0003\u0254\u012a\u0000"+
		"\u0486\u0484\u0001\u0000\u0000\u0000\u0486\u0485\u0001\u0000\u0000\u0000"+
		"\u0487\u00ab\u0001\u0000\u0000\u0000\u0488\u048a\u0003\u018a\u00c5\u0000"+
		"\u0489\u0488\u0001\u0000\u0000\u0000\u0489\u048a\u0001\u0000\u0000\u0000"+
		"\u048a\u048c\u0001\u0000\u0000\u0000\u048b\u048d\u0003\u016a\u00b5\u0000"+
		"\u048c\u048b\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000"+
		"\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u048f\u0005\u001b\u0000\u0000"+
		"\u048f\u0490\u0003\u00aeW\u0000\u0490\u00ad\u0001\u0000\u0000\u0000\u0491"+
		"\u0496\u0003\u00b0X\u0000\u0492\u0493\u0005\u0091\u0000\u0000\u0493\u0495"+
		"\u0003\u00b0X\u0000\u0494\u0492\u0001\u0000\u0000\u0000\u0495\u0498\u0001"+
		"\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0496\u0497\u0001"+
		"\u0000\u0000\u0000\u0497\u00af\u0001\u0000\u0000\u0000\u0498\u0496\u0001"+
		"\u0000\u0000\u0000\u0499\u049b\u0003\u0170\u00b8\u0000\u049a\u049c\u0003"+
		"\u00b2Y\u0000\u049b\u049a\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000"+
		"\u0000\u0000\u049c\u00b1\u0001\u0000\u0000\u0000\u049d\u049e\u0005\u009c"+
		"\u0000\u0000\u049e\u049f\u0003\u0192\u00c9\u0000\u049f\u00b3\u0001\u0000"+
		"\u0000\u0000\u04a0\u04b1\u0003\u00b6[\u0000\u04a1\u04ae\u0003\u00b8\\"+
		"\u0000\u04a2\u04a3\u0003\u00b2Y\u0000\u04a3\u04a4\u0003\u00c8d\u0000\u04a4"+
		"\u04af\u0001\u0000\u0000\u0000\u04a5\u04ac\u0003\u020c\u0106\u0000\u04a6"+
		"\u04ad\u0003\u00ba]\u0000\u04a7\u04ad\u0003\u00c2a\u0000\u04a8\u04aa\u0003"+
		"\u00b2Y\u0000\u04a9\u04a8\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000"+
		"\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ad\u0003\u00c8"+
		"d\u0000\u04ac\u04a6\u0001\u0000\u0000\u0000\u04ac\u04a7\u0001\u0000\u0000"+
		"\u0000\u04ac\u04a9\u0001\u0000\u0000\u0000\u04ad\u04af\u0001\u0000\u0000"+
		"\u0000\u04ae\u04a2\u0001\u0000\u0000\u0000\u04ae\u04a5\u0001\u0000\u0000"+
		"\u0000\u04af\u04b2\u0001\u0000\u0000\u0000\u04b0\u04b2\u0003\u00aeW\u0000"+
		"\u04b1\u04a1\u0001\u0000\u0000\u0000\u04b1\u04b0\u0001\u0000\u0000\u0000"+
		"\u04b2\u00b5\u0001\u0000\u0000\u0000\u04b3\u04b5\u0003\u018a\u00c5\u0000"+
		"\u04b4\u04b3\u0001\u0000\u0000\u0000\u04b4\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b7\u0001\u0000\u0000\u0000\u04b6\u04b8\u0003\u016a\u00b5\u0000"+
		"\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba\u0005\u001c\u0000\u0000"+
		"\u04ba\u00b7\u0001\u0000\u0000\u0000\u04bb\u04bc\u0003\u0236\u011b\u0000"+
		"\u04bc\u00b9\u0001\u0000\u0000\u0000\u04bd\u04c5\u0005\u008b\u0000\u0000"+
		"\u04be\u04c0\u0003\u00bc^\u0000\u04bf\u04c1\u0003\u00be_\u0000\u04c0\u04bf"+
		"\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c6"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c3\u0003\u00be_\u0000\u04c3\u04c4\u0003"+
		"\u00bc^\u0000\u04c4\u04c6\u0001\u0000\u0000\u0000\u04c5\u04be\u0001\u0000"+
		"\u0000\u0000\u04c5\u04c2\u0001\u0000\u0000\u0000\u04c6\u04c7\u0001\u0000"+
		"\u0000\u0000\u04c7\u04c8\u0005\u008e\u0000\u0000\u04c8\u04cb\u0001\u0000"+
		"\u0000\u0000\u04c9\u04cb\u0003\u00a2Q\u0000\u04ca\u04bd\u0001\u0000\u0000"+
		"\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04cb\u00bb\u0001\u0000\u0000"+
		"\u0000\u04cc\u04ce\u0003\u018a\u00c5\u0000\u04cd\u04cc\u0001\u0000\u0000"+
		"\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04d0\u0001\u0000\u0000"+
		"\u0000\u04cf\u04d1\u0003\u016e\u00b7\u0000\u04d0\u04cf\u0001\u0000\u0000"+
		"\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000\u0000"+
		"\u0000\u04d2\u04d4\u0005\u001e\u0000\u0000\u04d3\u04d5\u0003\u00a2Q\u0000"+
		"\u04d4\u04d3\u0001\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000"+
		"\u04d5\u00bd\u0001\u0000\u0000\u0000\u04d6\u04d8\u0003\u018a\u00c5\u0000"+
		"\u04d7\u04d6\u0001\u0000\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000\u0000"+
		"\u04d8\u04da\u0001\u0000\u0000\u0000\u04d9\u04db\u0003\u016e\u00b7\u0000"+
		"\u04da\u04d9\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000"+
		"\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04de\u0005\u001f\u0000\u0000"+
		"\u04dd\u04df\u0003\u00c0`\u0000\u04de\u04dd\u0001\u0000\u0000\u0000\u04de"+
		"\u04df\u0001\u0000\u0000\u0000\u04df\u04e1\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e2\u0003\u00a2Q\u0000\u04e1\u04e0\u0001\u0000\u0000\u0000\u04e1\u04e2"+
		"\u0001\u0000\u0000\u0000\u04e2\u00bf\u0001\u0000\u0000\u0000\u04e3\u04e4"+
		"\u0005\u008c\u0000\u0000\u04e4\u04e5\u0003\u0236\u011b\u0000\u04e5\u04e6"+
		"\u0005\u008f\u0000\u0000\u04e6\u00c1\u0001\u0000\u0000\u0000\u04e7\u04ef"+
		"\u0005\u008b\u0000\u0000\u04e8\u04ea\u0003\u00c4b\u0000\u04e9\u04eb\u0003"+
		"\u00c6c\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04ea\u04eb\u0001\u0000"+
		"\u0000\u0000\u04eb\u04f0\u0001\u0000\u0000\u0000\u04ec\u04ed\u0003\u00c6"+
		"c\u0000\u04ed\u04ee\u0003\u00c4b\u0000\u04ee\u04f0\u0001\u0000\u0000\u0000"+
		"\u04ef\u04e8\u0001\u0000\u0000\u0000\u04ef\u04ec\u0001\u0000\u0000\u0000"+
		"\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f2\u0005\u008e\u0000\u0000"+
		"\u04f2\u00c3\u0001\u0000\u0000\u0000\u04f3\u04f5\u0003\u018a\u00c5\u0000"+
		"\u04f4\u04f3\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000\u0000\u0000"+
		"\u04f5\u04f7\u0001\u0000\u0000\u0000\u04f6\u04f8\u0003\u016e\u00b7\u0000"+
		"\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000"+
		"\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fa\u0005\u001e\u0000\u0000"+
		"\u04fa\u00c5\u0001\u0000\u0000\u0000\u04fb\u04fd\u0003\u018a\u00c5\u0000"+
		"\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000"+
		"\u04fd\u04ff\u0001\u0000\u0000\u0000\u04fe\u0500\u0003\u016e\u00b7\u0000"+
		"\u04ff\u04fe\u0001\u0000\u0000\u0000\u04ff\u0500\u0001\u0000\u0000\u0000"+
		"\u0500\u0501\u0001\u0000\u0000\u0000\u0501\u0502\u0005\u001f\u0000\u0000"+
		"\u0502\u00c7\u0001\u0000\u0000\u0000\u0503\u050c\u0005\u008b\u0000\u0000"+
		"\u0504\u0506\u0003\u00cae\u0000\u0505\u0507\u0003\u00ccf\u0000\u0506\u0505"+
		"\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u050d"+
		"\u0001\u0000\u0000\u0000\u0508\u050a\u0003\u00ccf\u0000\u0509\u050b\u0003"+
		"\u00cae\u0000\u050a\u0509\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000"+
		"\u0000\u0000\u050b\u050d\u0001\u0000\u0000\u0000\u050c\u0504\u0001\u0000"+
		"\u0000\u0000\u050c\u0508\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000"+
		"\u0000\u0000\u050e\u050f\u0005\u008e\u0000\u0000\u050f\u00c9\u0001\u0000"+
		"\u0000\u0000\u0510\u0512\u0003\u018a\u00c5\u0000\u0511\u0510\u0001\u0000"+
		"\u0000\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000"+
		"\u0000\u0000\u0513\u0515\u0005 \u0000\u0000\u0514\u0516\u0003\u00c0`\u0000"+
		"\u0515\u0514\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000"+
		"\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u0518\u0003\u00a2Q\u0000\u0518"+
		"\u00cb\u0001\u0000\u0000\u0000\u0519\u051b\u0003\u018a\u00c5\u0000\u051a"+
		"\u0519\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b"+
		"\u051c\u0001\u0000\u0000\u0000\u051c\u051e\u0005!\u0000\u0000\u051d\u051f"+
		"\u0003\u00c0`\u0000\u051e\u051d\u0001\u0000\u0000\u0000\u051e\u051f\u0001"+
		"\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u0521\u0003"+
		"\u00a2Q\u0000\u0521\u00cd\u0001\u0000\u0000\u0000\u0522\u0524\u0003\u018a"+
		"\u00c5\u0000\u0523\u0522\u0001\u0000\u0000\u0000\u0523\u0524\u0001\u0000"+
		"\u0000\u0000\u0524\u0526\u0001\u0000\u0000\u0000\u0525\u0527\u0003\u016c"+
		"\u00b6\u0000\u0526\u0525\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000"+
		"\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u0529\u0005;\u0000"+
		"\u0000\u0529\u052b\u0003\u00d0h\u0000\u052a\u052c\u0003\u0086C\u0000\u052b"+
		"\u052a\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000\u0000\u0000\u052c"+
		"\u052d\u0001\u0000\u0000\u0000\u052d\u052e\u0003\u00d2i\u0000\u052e\u00cf"+
		"\u0001\u0000\u0000\u0000\u052f\u0530\u0003\u0236\u011b\u0000\u0530\u00d1"+
		"\u0001\u0000\u0000\u0000\u0531\u0532\u0005\u009c\u0000\u0000\u0532\u0533"+
		"\u0003\u020a\u0105\u0000\u0533\u00d3\u0001\u0000\u0000\u0000\u0534\u0535"+
		"\u0003\u00d6k\u0000\u0535\u0537\u0003\u00d8l\u0000\u0536\u0538\u0003\u0086"+
		"C\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000\u0000"+
		"\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053b\u0003\u00dam\u0000"+
		"\u053a\u053c\u0003\u008cF\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053b"+
		"\u053c\u0001\u0000\u0000\u0000\u053c\u053e\u0001\u0000\u0000\u0000\u053d"+
		"\u053f\u0003\u00deo\u0000\u053e\u053d\u0001\u0000\u0000\u0000\u053e\u053f"+
		"\u0001\u0000\u0000\u0000\u053f\u00d5\u0001\u0000\u0000\u0000\u0540\u0542"+
		"\u0003\u018a\u00c5\u0000\u0541\u0540\u0001\u0000\u0000\u0000\u0541\u0542"+
		"\u0001\u0000\u0000\u0000\u0542\u0544\u0001\u0000\u0000\u0000\u0543\u0545"+
		"\u0003\u016a\u00b5\u0000\u0544\u0543\u0001\u0000\u0000\u0000\u0544\u0545"+
		"\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0005\u0010\u0000\u0000\u0547\u00d7\u0001\u0000\u0000\u0000\u0548\u054b"+
		"\u0003\u0236\u011b\u0000\u0549\u054b\u0003\u0254\u012a\u0000\u054a\u0548"+
		"\u0001\u0000\u0000\u0000\u054a\u0549\u0001\u0000\u0000\u0000\u054b\u00d9"+
		"\u0001\u0000\u0000\u0000\u054c\u0551\u0003\u00e0p\u0000\u054d\u054f\u0005"+
		"\'\u0000\u0000\u054e\u054d\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000"+
		"\u0000\u0000\u054f\u0552\u0001\u0000\u0000\u0000\u0550\u0552\u0005(\u0000"+
		"\u0000\u0551\u054e\u0001\u0000\u0000\u0000\u0551\u0550\u0001\u0000\u0000"+
		"\u0000\u0552\u0554\u0001\u0000\u0000\u0000\u0553\u0555\u0003\u00dcn\u0000"+
		"\u0554\u0553\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000"+
		"\u0555\u00db\u0001\u0000\u0000\u0000\u0556\u0558\u0003\u0248\u0124\u0000"+
		"\u0557\u0559\u0003\u018a\u00c5\u0000\u0558\u0557\u0001\u0000\u0000\u0000"+
		"\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055a\u0001\u0000\u0000\u0000"+
		"\u055a\u055b\u0003\u020a\u0105\u0000\u055b\u00dd\u0001\u0000\u0000\u0000"+
		"\u055c\u055d\u0003\u00a2Q\u0000\u055d\u00df\u0001\u0000\u0000\u0000\u055e"+
		"\u0560\u0005\u008c\u0000\u0000\u055f\u0561\u0003\u00e2q\u0000\u0560\u055f"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0562"+
		"\u0001\u0000\u0000\u0000\u0562\u0563\u0005\u008f\u0000\u0000\u0563\u00e1"+
		"\u0001\u0000\u0000\u0000\u0564\u0569\u0003\u00e4r\u0000\u0565\u0566\u0005"+
		"\u0091\u0000\u0000\u0566\u0568\u0003\u00e4r\u0000\u0567\u0565\u0001\u0000"+
		"\u0000\u0000\u0568\u056b\u0001\u0000\u0000\u0000\u0569\u0567\u0001\u0000"+
		"\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u00e3\u0001\u0000"+
		"\u0000\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056c\u056e\u0003\u018a"+
		"\u00c5\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000"+
		"\u0000\u0000\u056e\u0570\u0001\u0000\u0000\u0000\u056f\u0571\u0003\u00e6"+
		"s\u0000\u0570\u056f\u0001\u0000\u0000\u0000\u0570\u0571\u0001\u0000\u0000"+
		"\u0000\u0571\u0572\u0001\u0000\u0000\u0000\u0572\u0573\u0003\u00e8t\u0000"+
		"\u0573\u0578\u0003\u020c\u0106\u0000\u0574\u0576\u0003\u00eau\u0000\u0575"+
		"\u0574\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576"+
		"\u0579\u0001\u0000\u0000\u0000\u0577\u0579\u0003\u024a\u0125\u0000\u0578"+
		"\u0575\u0001\u0000\u0000\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0579"+
		"\u00e5\u0001\u0000\u0000\u0000\u057a\u057b\u0003\u0236\u011b\u0000\u057b"+
		"\u00e7\u0001\u0000\u0000\u0000\u057c\u057d\u0003\u0236\u011b\u0000\u057d"+
		"\u00e9\u0001\u0000\u0000\u0000\u057e\u057f\u0005\u009c\u0000\u0000\u057f"+
		"\u0580\u0003\u0192\u00c9\u0000\u0580\u00eb\u0001\u0000\u0000\u0000\u0581"+
		"\u0583\u0003\u018a\u00c5\u0000\u0582\u0581\u0001\u0000\u0000\u0000\u0582"+
		"\u0583\u0001\u0000\u0000\u0000\u0583\u0585\u0001\u0000\u0000\u0000\u0584"+
		"\u0586\u0003\u016c\u00b6\u0000\u0585\u0584\u0001\u0000\u0000\u0000\u0585"+
		"\u0586\u0001\u0000\u0000\u0000\u0586\u0589\u0001\u0000\u0000\u0000\u0587"+
		"\u058a\u0003\u00eew\u0000\u0588\u058a\u0003\u00fe\u007f\u0000\u0589\u0587"+
		"\u0001\u0000\u0000\u0000\u0589\u0588\u0001\u0000\u0000\u0000\u058a\u00ed"+
		"\u0001\u0000\u0000\u0000\u058b\u058d\u0005)\u0000\u0000\u058c\u058b\u0001"+
		"\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000\u0000\u058d\u058e\u0001"+
		"\u0000\u0000\u0000\u058e\u058f\u0005\r\u0000\u0000\u058f\u0591\u0003\u00fa"+
		"}\u0000\u0590\u0592\u0003\u0086C\u0000\u0591\u0590\u0001\u0000\u0000\u0000"+
		"\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0594\u0001\u0000\u0000\u0000"+
		"\u0593\u0595\u0003\u0232\u0119\u0000\u0594\u0593\u0001\u0000\u0000\u0000"+
		"\u0594\u0595\u0001\u0000\u0000\u0000\u0595\u0597\u0001\u0000\u0000\u0000"+
		"\u0596\u0598\u0003\u008cF\u0000\u0597\u0596\u0001\u0000\u0000\u0000\u0597"+
		"\u0598\u0001\u0000\u0000\u0000\u0598\u0599\u0001\u0000\u0000\u0000\u0599"+
		"\u059b\u0005\u008b\u0000\u0000\u059a\u059c\u0003\u00f0x\u0000\u059b\u059a"+
		"\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u059d"+
		"\u0001\u0000\u0000\u0000\u059d\u059e\u0005\u008e\u0000\u0000\u059e\u00ef"+
		"\u0001\u0000\u0000\u0000\u059f\u05a1\u0003\u00f2y\u0000\u05a0\u059f\u0001"+
		"\u0000\u0000\u0000\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u05a0\u0001"+
		"\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000\u0000\u05a3\u00f1\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a8\u0003\u009cN\u0000\u05a5\u05a8\u0003\u00f4"+
		"z\u0000\u05a6\u05a8\u0003V+\u0000\u05a7\u05a4\u0001\u0000\u0000\u0000"+
		"\u05a7\u05a5\u0001\u0000\u0000\u0000\u05a7\u05a6\u0001\u0000\u0000\u0000"+
		"\u05a8\u00f3\u0001\u0000\u0000\u0000\u05a9\u05ab\u0003\u018a\u00c5\u0000"+
		"\u05aa\u05a9\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000"+
		"\u05ab\u05ad\u0001\u0000\u0000\u0000\u05ac\u05ae\u0005)\u0000\u0000\u05ad"+
		"\u05ac\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000\u0000\u05ae"+
		"\u05af\u0001\u0000\u0000\u0000\u05af\u05b0\u0005\u0004\u0000\u0000\u05b0"+
		"\u05b1\u0003\u00f6{\u0000\u05b1\u00f5\u0001\u0000\u0000\u0000\u05b2\u05b7"+
		"\u0003\u00f8|\u0000\u05b3\u05b4\u0005\u0091\u0000\u0000\u05b4\u05b6\u0003"+
		"\u00f8|\u0000\u05b5\u05b3\u0001\u0000\u0000\u0000\u05b6\u05b9\u0001\u0000"+
		"\u0000\u0000\u05b7\u05b5\u0001\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000"+
		"\u0000\u0000\u05b8\u00f7\u0001\u0000\u0000\u0000\u05b9\u05b7\u0001\u0000"+
		"\u0000\u0000\u05ba\u05c4\u0003\u022c\u0116\u0000\u05bb\u05c1\u0003\u00fc"+
		"~\u0000\u05bc\u05c2\u0003\u0212\u0109\u0000\u05bd\u05be\u0005\u008c\u0000"+
		"\u0000\u05be\u05bf\u0003\u020a\u0105\u0000\u05bf\u05c0\u0005\u008f\u0000"+
		"\u0000\u05c0\u05c2\u0001\u0000\u0000\u0000\u05c1\u05bc\u0001\u0000\u0000"+
		"\u0000\u05c1\u05bd\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000"+
		"\u0000\u05c2\u05c4\u0001\u0000\u0000\u0000\u05c3\u05ba\u0001\u0000\u0000"+
		"\u0000\u05c3\u05bb\u0001\u0000\u0000\u0000\u05c4\u00f9\u0001\u0000\u0000"+
		"\u0000\u05c5\u05c6\u0003\u0236\u011b\u0000\u05c6\u00fb\u0001\u0000\u0000"+
		"\u0000\u05c7\u05c8\u0003\u0236\u011b\u0000\u05c8\u00fd\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0005\r\u0000\u0000\u05ca\u05cc\u0003\u00fa}\u0000"+
		"\u05cb\u05cd\u0003\u0086C\u0000\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc"+
		"\u05cd\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce"+
		"\u05d0\u0003\u0232\u0119\u0000\u05cf\u05d1\u0003\u008cF\u0000\u05d0\u05cf"+
		"\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d2\u05d3\u0005\u008b\u0000\u0000\u05d3\u05d4"+
		"\u0003\u0100\u0080\u0000\u05d4\u05d5\u0005\u008e\u0000\u0000\u05d5\u00ff"+
		"\u0001\u0000\u0000\u0000\u05d6\u05d8\u0003\u0102\u0081\u0000\u05d7\u05d6"+
		"\u0001\u0000\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05d7"+
		"\u0001\u0000\u0000\u0000\u05d9\u05da\u0001\u0000\u0000\u0000\u05da\u0101"+
		"\u0001\u0000\u0000\u0000\u05db\u05df\u0003\u009cN\u0000\u05dc\u05df\u0003"+
		"\u0104\u0082\u0000\u05dd\u05df\u0003V+\u0000\u05de\u05db\u0001\u0000\u0000"+
		"\u0000\u05de\u05dc\u0001\u0000\u0000\u0000\u05de\u05dd\u0001\u0000\u0000"+
		"\u0000\u05df\u0103\u0001\u0000\u0000\u0000\u05e0\u05e2\u0003\u018a\u00c5"+
		"\u0000\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005\u0004\u0000"+
		"\u0000\u05e4\u05e5\u0003\u0106\u0083\u0000\u05e5\u0105\u0001\u0000\u0000"+
		"\u0000\u05e6\u05eb\u0003\u0108\u0084\u0000\u05e7\u05e8\u0005\u0091\u0000"+
		"\u0000\u05e8\u05ea\u0003\u0108\u0084\u0000\u05e9\u05e7\u0001\u0000\u0000"+
		"\u0000\u05ea\u05ed\u0001\u0000\u0000\u0000\u05eb\u05e9\u0001\u0000\u0000"+
		"\u0000\u05eb\u05ec\u0001\u0000\u0000\u0000\u05ec\u0107\u0001\u0000\u0000"+
		"\u0000\u05ed\u05eb\u0001\u0000\u0000\u0000\u05ee\u05f0\u0003\u00fc~\u0000"+
		"\u05ef\u05f1\u0003\u010a\u0085\u0000\u05f0\u05ef\u0001\u0000\u0000\u0000"+
		"\u05f0\u05f1\u0001\u0000\u0000\u0000\u05f1\u0109\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f3\u0005\u009c\u0000\u0000\u05f3\u05f4\u0003\u010c\u0086\u0000"+
		"\u05f4\u010b\u0001\u0000\u0000\u0000\u05f5\u05f9\u0003\u0264\u0132\u0000"+
		"\u05f6\u05f9\u0003\u0270\u0138\u0000\u05f7\u05f9\u0003\u0266\u0133\u0000"+
		"\u05f8\u05f5\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000\u0000\u0000"+
		"\u05f8\u05f7\u0001\u0000\u0000\u0000\u05f9\u010d\u0001\u0000\u0000\u0000"+
		"\u05fa\u05fc\u0003\u018a\u00c5\u0000\u05fb\u05fa\u0001\u0000\u0000\u0000"+
		"\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc\u05fe\u0001\u0000\u0000\u0000"+
		"\u05fd\u05ff\u0003\u016c\u00b6\u0000\u05fe\u05fd\u0001\u0000\u0000\u0000"+
		"\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff\u0600\u0001\u0000\u0000\u0000"+
		"\u0600\u0601\u0005$\u0000\u0000\u0601\u0603\u0003\u0110\u0088\u0000\u0602"+
		"\u0604\u0003\u0086C\u0000\u0603\u0602\u0001\u0000\u0000\u0000\u0603\u0604"+
		"\u0001\u0000\u0000\u0000\u0604\u0606\u0001\u0000\u0000\u0000\u0605\u0607"+
		"\u0003\u0232\u0119\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0606\u0607"+
		"\u0001\u0000\u0000\u0000\u0607\u0609\u0001\u0000\u0000\u0000\u0608\u060a"+
		"\u0003\u008cF\u0000\u0609\u0608\u0001\u0000\u0000\u0000\u0609\u060a\u0001"+
		"\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000\u060b\u060c\u0003"+
		"\u0112\u0089\u0000\u060c\u010f\u0001\u0000\u0000\u0000\u060d\u060e\u0003"+
		"\u0236\u011b\u0000\u060e\u0111\u0001\u0000\u0000\u0000\u060f\u0610\u0005"+
		"\u008b\u0000\u0000\u0610\u0611\u0003\u0114\u008a\u0000\u0611\u0612\u0005"+
		"\u008e\u0000\u0000\u0612\u0113\u0001\u0000\u0000\u0000\u0613\u0615\u0003"+
		"\u0116\u008b\u0000\u0614\u0613\u0001\u0000\u0000\u0000\u0615\u0618\u0001"+
		"\u0000\u0000\u0000\u0616\u0614\u0001\u0000\u0000\u0000\u0616\u0617\u0001"+
		"\u0000\u0000\u0000\u0617\u0115\u0001\u0000\u0000\u0000\u0618\u0616\u0001"+
		"\u0000\u0000\u0000\u0619\u061c\u0003\u009cN\u0000\u061a\u061c\u0003V+"+
		"\u0000\u061b\u0619\u0001\u0000\u0000\u0000\u061b\u061a\u0001\u0000\u0000"+
		"\u0000\u061c\u0117\u0001\u0000\u0000\u0000\u061d\u061f\u0003\u018a\u00c5"+
		"\u0000\u061e\u061d\u0001\u0000\u0000\u0000\u061e\u061f\u0001\u0000\u0000"+
		"\u0000\u061f\u062a\u0001\u0000\u0000\u0000\u0620\u0622\u0003\u016c\u00b6"+
		"\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621\u0622\u0001\u0000\u0000"+
		"\u0000\u0622\u0624\u0001\u0000\u0000\u0000\u0623\u0625\u0005\u0015\u0000"+
		"\u0000\u0624\u0623\u0001\u0000\u0000\u0000\u0624\u0625\u0001\u0000\u0000"+
		"\u0000\u0625\u062b\u0001\u0000\u0000\u0000\u0626\u0628\u0005\u0015\u0000"+
		"\u0000\u0627\u0629\u0003\u016c\u00b6\u0000\u0628\u0627\u0001\u0000\u0000"+
		"\u0000\u0628\u0629\u0001\u0000\u0000\u0000\u0629\u062b\u0001\u0000\u0000"+
		"\u0000\u062a\u0621\u0001\u0000\u0000\u0000\u062a\u0626\u0001\u0000\u0000"+
		"\u0000\u062b\u062c\u0001\u0000\u0000\u0000\u062c\u062d\u0005\u0006\u0000"+
		"\u0000\u062d\u062f\u0003\u011a\u008d\u0000\u062e\u0630\u0003\u0086C\u0000"+
		"\u062f\u062e\u0001\u0000\u0000\u0000\u062f\u0630\u0001\u0000\u0000\u0000"+
		"\u0630\u0632\u0001\u0000\u0000\u0000\u0631\u0633\u0003\u0232\u0119\u0000"+
		"\u0632\u0631\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000\u0000"+
		"\u0633\u0635\u0001\u0000\u0000\u0000\u0634\u0636\u0003\u008cF\u0000\u0635"+
		"\u0634\u0001\u0000\u0000\u0000\u0635\u0636\u0001\u0000\u0000\u0000\u0636"+
		"\u0637\u0001\u0000\u0000\u0000\u0637\u0638\u0003\u011c\u008e\u0000\u0638"+
		"\u0119\u0001\u0000\u0000\u0000\u0639\u063a\u0003\u0236\u011b\u0000\u063a"+
		"\u011b\u0001\u0000\u0000\u0000\u063b\u063c\u0005\u008b\u0000\u0000\u063c"+
		"\u063d\u0003\u011e\u008f\u0000\u063d\u063e\u0005\u008e\u0000\u0000\u063e"+
		"\u011d\u0001\u0000\u0000\u0000\u063f\u0641\u0003\u0120\u0090\u0000\u0640"+
		"\u063f\u0001\u0000\u0000\u0000\u0641\u0644\u0001\u0000\u0000\u0000\u0642"+
		"\u0640\u0001\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643"+
		"\u011f\u0001\u0000\u0000\u0000\u0644\u0642\u0001\u0000\u0000\u0000\u0645"+
		"\u0648\u0003\u009cN\u0000\u0646\u0648\u0003V+\u0000\u0647\u0645\u0001"+
		"\u0000\u0000\u0000\u0647\u0646\u0001\u0000\u0000\u0000\u0648\u0121\u0001"+
		"\u0000\u0000\u0000\u0649\u064b\u0003\u018a\u00c5\u0000\u064a\u0649\u0001"+
		"\u0000\u0000\u0000\u064a\u064b\u0001\u0000\u0000\u0000\u064b\u064d\u0001"+
		"\u0000\u0000\u0000\u064c\u064e\u0003\u016c\u00b6\u0000\u064d\u064c\u0001"+
		"\u0000\u0000\u0000\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u064f\u0001"+
		"\u0000\u0000\u0000\u064f\u0650\u0005\u001d\u0000\u0000\u0650\u0654\u0003"+
		"\u0124\u0092\u0000\u0651\u0652\u0005\u0092\u0000\u0000\u0652\u0655\u0005"+
		"\u0006\u0000\u0000\u0653\u0655\u0003\u0232\u0119\u0000\u0654\u0651\u0001"+
		"\u0000\u0000\u0000\u0654\u0653\u0001\u0000\u0000\u0000\u0654\u0655\u0001"+
		"\u0000\u0000\u0000\u0655\u0657\u0001\u0000\u0000\u0000\u0656\u0658\u0003"+
		"\u008cF\u0000\u0657\u0656\u0001\u0000\u0000\u0000\u0657\u0658\u0001\u0000"+
		"\u0000\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u065a\u0003\u0126"+
		"\u0093\u0000\u065a\u0123\u0001\u0000\u0000\u0000\u065b\u065c\u0003\u0236"+
		"\u011b\u0000\u065c\u0125\u0001\u0000\u0000\u0000\u065d\u065e\u0005\u008b"+
		"\u0000\u0000\u065e\u065f\u0003\u0128\u0094\u0000\u065f\u0660\u0005\u008e"+
		"\u0000\u0000\u0660\u0127\u0001\u0000\u0000\u0000\u0661\u0663\u0003\u012a"+
		"\u0095\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0663\u0666\u0001\u0000"+
		"\u0000\u0000\u0664\u0662\u0001\u0000\u0000\u0000\u0664\u0665\u0001\u0000"+
		"\u0000\u0000\u0665\u0129\u0001\u0000\u0000\u0000\u0666\u0664\u0001\u0000"+
		"\u0000\u0000\u0667\u066a\u0003\u012c\u0096\u0000\u0668\u066a\u0003V+\u0000"+
		"\u0669\u0667\u0001\u0000\u0000\u0000\u0669\u0668\u0001\u0000\u0000\u0000"+
		"\u066a\u012b\u0001\u0000\u0000\u0000\u066b\u0672\u0003\u012e\u0097\u0000"+
		"\u066c\u0672\u0003\u0130\u0098\u0000\u066d\u0672\u0003\u0132\u0099\u0000"+
		"\u066e\u0672\u0003\u0134\u009a\u0000\u066f\u0672\u0003\u0136\u009b\u0000"+
		"\u0670\u0672\u0003\u00ceg\u0000\u0671\u066b\u0001\u0000\u0000\u0000\u0671"+
		"\u066c\u0001\u0000\u0000\u0000\u0671\u066d\u0001\u0000\u0000\u0000\u0671"+
		"\u066e\u0001\u0000\u0000\u0000\u0671\u066f\u0001\u0000\u0000\u0000\u0671"+
		"\u0670\u0001\u0000\u0000\u0000\u0672\u012d\u0001\u0000\u0000\u0000\u0673"+
		"\u0674\u0003\u00b6[\u0000\u0674\u0675\u0003\u00b8\\\u0000\u0675\u0676"+
		"\u0003\u020c\u0106\u0000\u0676\u0677\u0003\u00c2a\u0000\u0677\u012f\u0001"+
		"\u0000\u0000\u0000\u0678\u0679\u0003\u00d6k\u0000\u0679\u067b\u0003\u00d8"+
		"l\u0000\u067a\u067c\u0003\u0086C\u0000\u067b\u067a\u0001\u0000\u0000\u0000"+
		"\u067b\u067c\u0001\u0000\u0000\u0000\u067c\u067d\u0001\u0000\u0000\u0000"+
		"\u067d\u067f\u0003\u00dam\u0000\u067e\u0680\u0003\u008cF\u0000\u067f\u067e"+
		"\u0001\u0000\u0000\u0000\u067f\u0680\u0001\u0000\u0000\u0000\u0680\u0131"+
		"\u0001\u0000\u0000\u0000\u0681\u0683\u0003\u013a\u009d\u0000\u0682\u0684"+
		"\u0003\u0086C\u0000\u0683\u0682\u0001\u0000\u0000\u0000\u0683\u0684\u0001"+
		"\u0000\u0000\u0000\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u068a\u0003"+
		"\u00e0p\u0000\u0686\u0688\u0005\'\u0000\u0000\u0687\u0686\u0001\u0000"+
		"\u0000\u0000\u0687\u0688\u0001\u0000\u0000\u0000\u0688\u068b\u0001\u0000"+
		"\u0000\u0000\u0689\u068b\u0005(\u0000\u0000\u068a\u0687\u0001\u0000\u0000"+
		"\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068b\u068d\u0001\u0000\u0000"+
		"\u0000\u068c\u068e\u0003\u008cF\u0000\u068d\u068c\u0001\u0000\u0000\u0000"+
		"\u068d\u068e\u0001\u0000\u0000\u0000\u068e\u0133\u0001\u0000\u0000\u0000"+
		"\u068f\u0690\u0003\u014a\u00a5\u0000\u0690\u0692\u0003\u014c\u00a6\u0000"+
		"\u0691\u0693\u0003\u008cF\u0000\u0692\u0691\u0001\u0000\u0000\u0000\u0692"+
		"\u0693\u0001\u0000\u0000\u0000\u0693\u0694\u0001\u0000\u0000\u0000\u0694"+
		"\u0695\u0003\u00c2a\u0000\u0695\u0135\u0001\u0000\u0000\u0000\u0696\u0698"+
		"\u0003\u018a\u00c5\u0000\u0697\u0696\u0001\u0000\u0000\u0000\u0697\u0698"+
		"\u0001\u0000\u0000\u0000\u0698\u069a\u0001\u0000\u0000\u0000\u0699\u069b"+
		"\u0003\u016c\u00b6\u0000\u069a\u0699\u0001\u0000\u0000\u0000\u069a\u069b"+
		"\u0001\u0000\u0000\u0000\u069b\u069c\u0001\u0000\u0000\u0000\u069c\u069d"+
		"\u0005,\u0000\u0000\u069d\u069f\u0003\u00d0h\u0000\u069e\u06a0\u0003\u0232"+
		"\u0119\u0000\u069f\u069e\u0001\u0000\u0000\u0000\u069f\u06a0\u0001\u0000"+
		"\u0000\u0000\u06a0\u06a2\u0001\u0000\u0000\u0000\u06a1\u06a3\u0003\u00d2"+
		"i\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a2\u06a3\u0001\u0000\u0000"+
		"\u0000\u06a3\u06a5\u0001\u0000\u0000\u0000\u06a4\u06a6\u0003\u008cF\u0000"+
		"\u06a5\u06a4\u0001\u0000\u0000\u0000\u06a5\u06a6\u0001\u0000\u0000\u0000"+
		"\u06a6\u0137\u0001\u0000\u0000\u0000\u06a7\u06a9\u0003\u013a\u009d\u0000"+
		"\u06a8\u06aa\u0003\u0086C\u0000\u06a9\u06a8\u0001\u0000\u0000\u0000\u06a9"+
		"\u06aa\u0001\u0000\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab"+
		"\u06ad\u0003\u00e0p\u0000\u06ac\u06ae\u0007\b\u0000\u0000\u06ad\u06ac"+
		"\u0001\u0000\u0000\u0000\u06ad\u06ae\u0001\u0000\u0000\u0000\u06ae\u06b0"+
		"\u0001\u0000\u0000\u0000\u06af\u06b1\u0003\u008cF\u0000\u06b0\u06af\u0001"+
		"\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001"+
		"\u0000\u0000\u0000\u06b2\u06b3\u0003\u013c\u009e\u0000\u06b3\u0139\u0001"+
		"\u0000\u0000\u0000\u06b4\u06b6\u0003\u018a\u00c5\u0000\u06b5\u06b4\u0001"+
		"\u0000\u0000\u0000\u06b5\u06b6\u0001\u0000\u0000\u0000\u06b6\u06b8\u0001"+
		"\u0000\u0000\u0000\u06b7\u06b9\u0003\u016a\u00b5\u0000\u06b8\u06b7\u0001"+
		"\u0000\u0000\u0000\u06b8\u06b9\u0001\u0000\u0000\u0000\u06b9\u06ba\u0001"+
		"\u0000\u0000\u0000\u06ba\u06bc\u0005*\u0000\u0000\u06bb\u06bd\u0007\t"+
		"\u0000\u0000\u06bc\u06bb\u0001\u0000\u0000\u0000\u06bc\u06bd\u0001\u0000"+
		"\u0000\u0000\u06bd\u013b\u0001\u0000\u0000\u0000\u06be\u06bf\u0003\u00a2"+
		"Q\u0000\u06bf\u013d\u0001\u0000\u0000\u0000\u06c0\u06c2\u0003\u018a\u00c5"+
		"\u0000\u06c1\u06c0\u0001\u0000\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000"+
		"\u0000\u06c2\u06c3\u0001\u0000\u0000\u0000\u06c3\u06c4\u0005+\u0000\u0000"+
		"\u06c4\u06c5\u0003\u00a2Q\u0000\u06c5\u013f\u0001\u0000\u0000\u0000\u06c6"+
		"\u06c8\u0003\u018a\u00c5\u0000\u06c7\u06c6\u0001\u0000\u0000\u0000\u06c7"+
		"\u06c8\u0001\u0000\u0000\u0000\u06c8\u06ca\u0001\u0000\u0000\u0000\u06c9"+
		"\u06cb\u0003\u016c\u00b6\u0000\u06ca\u06c9\u0001\u0000\u0000\u0000\u06ca"+
		"\u06cb\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000\u06cc"+
		"\u06cd\u0005-\u0000\u0000\u06cd\u06cf\u0003\u020e\u0107\u0000\u06ce\u06d0"+
		"\u0003\u0232\u0119\u0000\u06cf\u06ce\u0001\u0000\u0000\u0000\u06cf\u06d0"+
		"\u0001\u0000\u0000\u0000\u06d0\u06d2\u0001\u0000\u0000\u0000\u06d1\u06d3"+
		"\u0003\u008cF\u0000\u06d2\u06d1\u0001\u0000\u0000\u0000\u06d2\u06d3\u0001"+
		"\u0000\u0000\u0000\u06d3\u06d4\u0001\u0000\u0000\u0000\u06d4\u06d5\u0003"+
		"\u0142\u00a1\u0000\u06d5\u0141\u0001\u0000\u0000\u0000\u06d6\u06d7\u0005"+
		"\u008b\u0000\u0000\u06d7\u06d8\u0003\u0144\u00a2\u0000\u06d8\u06d9\u0005"+
		"\u008e\u0000\u0000\u06d9\u0143\u0001\u0000\u0000\u0000\u06da\u06dc\u0003"+
		"\u0146\u00a3\u0000\u06db\u06da\u0001\u0000\u0000\u0000\u06dc\u06df\u0001"+
		"\u0000\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001"+
		"\u0000\u0000\u0000\u06de\u0145\u0001\u0000\u0000\u0000\u06df\u06dd\u0001"+
		"\u0000\u0000\u0000\u06e0\u06e3\u0003\u009cN\u0000\u06e1\u06e3\u0003V+"+
		"\u0000\u06e2\u06e0\u0001\u0000\u0000\u0000\u06e2\u06e1\u0001\u0000\u0000"+
		"\u0000\u06e3\u0147\u0001\u0000\u0000\u0000\u06e4\u06e5\u0003\u014a\u00a5"+
		"\u0000\u06e5\u06e7\u0003\u014c\u00a6\u0000\u06e6\u06e8\u0003\u008cF\u0000"+
		"\u06e7\u06e6\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000"+
		"\u06e8\u06ec\u0001\u0000\u0000\u0000\u06e9\u06ed\u0003\u00a2Q\u0000\u06ea"+
		"\u06ed\u0003\u00ba]\u0000\u06eb\u06ed\u0003\u00c2a\u0000\u06ec\u06e9\u0001"+
		"\u0000\u0000\u0000\u06ec\u06ea\u0001\u0000\u0000\u0000\u06ec\u06eb\u0001"+
		"\u0000\u0000\u0000\u06ed\u0149\u0001\u0000\u0000\u0000\u06ee\u06f0\u0003"+
		"\u018a\u00c5\u0000\u06ef\u06ee\u0001\u0000\u0000\u0000\u06ef\u06f0\u0001"+
		"\u0000\u0000\u0000\u06f0\u06f2\u0001\u0000\u0000\u0000\u06f1\u06f3\u0003"+
		"\u016a\u00b5\u0000\u06f2\u06f1\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001"+
		"\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f6\u0005"+
		".\u0000\u0000\u06f5\u06f7\u0003\u0086C\u0000\u06f6\u06f5\u0001\u0000\u0000"+
		"\u0000\u06f6\u06f7\u0001\u0000\u0000\u0000\u06f7\u06f8\u0001\u0000\u0000"+
		"\u0000\u06f8\u06f9\u0003\u00e0p\u0000\u06f9\u014b\u0001\u0000\u0000\u0000"+
		"\u06fa\u06fc\u0003\u0248\u0124\u0000\u06fb\u06fd\u0003\u018a\u00c5\u0000"+
		"\u06fc\u06fb\u0001\u0000\u0000\u0000\u06fc\u06fd\u0001\u0000\u0000\u0000"+
		"\u06fd\u06fe\u0001\u0000\u0000\u0000\u06fe\u06ff\u0003\u020a\u0105\u0000"+
		"\u06ff\u014d\u0001\u0000\u0000\u0000\u0700\u0704\u0003\u0150\u00a8\u0000"+
		"\u0701\u0704\u0003\u0152\u00a9\u0000\u0702\u0704\u0003\u0154\u00aa\u0000"+
		"\u0703\u0700\u0001\u0000\u0000\u0000\u0703\u0701\u0001\u0000\u0000\u0000"+
		"\u0703\u0702\u0001\u0000\u0000\u0000\u0704\u014f\u0001\u0000\u0000\u0000"+
		"\u0705\u0706\u0005/\u0000\u0000\u0706\u0707\u0005:\u0000\u0000\u0707\u0708"+
		"\u0003\u0254\u012a\u0000\u0708\u0151\u0001\u0000\u0000\u0000\u0709\u070a"+
		"\u00059\u0000\u0000\u070a\u070b\u0005:\u0000\u0000\u070b\u070c\u0003\u0254"+
		"\u012a\u0000\u070c\u0153\u0001\u0000\u0000\u0000\u070d\u070e\u00050\u0000"+
		"\u0000\u070e\u070f\u0005:\u0000\u0000\u070f\u0711\u0003\u0254\u012a\u0000"+
		"\u0710\u0712\u0003\u0156\u00ab\u0000\u0711\u0710\u0001\u0000\u0000\u0000"+
		"\u0711\u0712\u0001\u0000\u0000\u0000\u0712\u0155\u0001\u0000\u0000\u0000"+
		"\u0713\u0714\u0005\u0092\u0000\u0000\u0714\u0715\u0003\u0166\u00b3\u0000"+
		"\u0715\u0157\u0001\u0000\u0000\u0000\u0716\u0717\u00054\u0000\u0000\u0717"+
		"\u0718\u0003\u0166\u00b3\u0000\u0718\u071a\u0005\u008b\u0000\u0000\u0719"+
		"\u071b\u0003\u015a\u00ad\u0000\u071a\u0719\u0001\u0000\u0000\u0000\u071a"+
		"\u071b\u0001\u0000\u0000\u0000\u071b\u071c\u0001\u0000\u0000\u0000\u071c"+
		"\u071d\u0005\u008e\u0000\u0000\u071d\u0159\u0001\u0000\u0000\u0000\u071e"+
		"\u0720\u0003\u015c\u00ae\u0000\u071f\u071e\u0001\u0000\u0000\u0000\u0720"+
		"\u0721\u0001\u0000\u0000\u0000\u0721\u071f\u0001\u0000\u0000\u0000\u0721"+
		"\u0722\u0001\u0000\u0000\u0000\u0722\u015b\u0001\u0000\u0000\u0000\u0723"+
		"\u0727\u0003\u015e\u00af\u0000\u0724\u0727\u0003\u0160\u00b0\u0000\u0725"+
		"\u0727\u0003\u0162\u00b1\u0000\u0726\u0723\u0001\u0000\u0000\u0000\u0726"+
		"\u0724\u0001\u0000\u0000\u0000\u0726\u0725\u0001\u0000\u0000\u0000\u0727"+
		"\u015d\u0001\u0000\u0000\u0000\u0728\u0729\u0007\n\u0000\u0000\u0729\u072a"+
		"\u0005\u0092\u0000\u0000\u072a\u072b\u0003\u0164\u00b2\u0000\u072b\u015f"+
		"\u0001\u0000\u0000\u0000\u072c\u072d\u00057\u0000\u0000\u072d\u072e\u0005"+
		"\u0092\u0000\u0000\u072e\u072f\u0003\u0266\u0133\u0000\u072f\u0161\u0001"+
		"\u0000\u0000\u0000\u0730\u0731\u00058\u0000\u0000\u0731\u0732\u0005\u0092"+
		"\u0000\u0000\u0732\u0733\u0007\u000b\u0000\u0000\u0733\u0163\u0001\u0000"+
		"\u0000\u0000\u0734\u0739\u0003\u0166\u00b3\u0000\u0735\u0736\u0005\u0091"+
		"\u0000\u0000\u0736\u0738\u0003\u0166\u00b3\u0000\u0737\u0735\u0001\u0000"+
		"\u0000\u0000\u0738\u073b\u0001\u0000\u0000\u0000\u0739\u0737\u0001\u0000"+
		"\u0000\u0000\u0739\u073a\u0001\u0000\u0000\u0000\u073a\u0165\u0001\u0000"+
		"\u0000\u0000\u073b\u0739\u0001\u0000\u0000\u0000\u073c\u0741\u0003\u0236"+
		"\u011b\u0000\u073d\u073e\u0005\u008a\u0000\u0000\u073e\u0740\u0003\u0236"+
		"\u011b\u0000\u073f\u073d\u0001\u0000\u0000\u0000\u0740\u0743\u0001\u0000"+
		"\u0000\u0000\u0741\u073f\u0001\u0000\u0000\u0000\u0741\u0742\u0001\u0000"+
		"\u0000\u0000\u0742\u0167\u0001\u0000\u0000\u0000\u0743\u0741\u0001\u0000"+
		"\u0000\u0000\u0744\u075a\u0005\u0006\u0000\u0000\u0745\u075a\u0005B\u0000"+
		"\u0000\u0746\u075a\u0005C\u0000\u0000\u0747\u075a\u0005\u0015\u0000\u0000"+
		"\u0748\u075a\u00050\u0000\u0000\u0749\u075a\u0005D\u0000\u0000\u074a\u075a"+
		"\u0005E\u0000\u0000\u074b\u075a\u0005F\u0000\u0000\u074c\u075a\u00059"+
		"\u0000\u0000\u074d\u075a\u0005/\u0000\u0000\u074e\u075a\u0005G\u0000\u0000"+
		"\u074f\u075a\u0005H\u0000\u0000\u0750\u0754\u0005J\u0000\u0000\u0751\u0752"+
		"\u0005\u008c\u0000\u0000\u0752\u0753\u0007\f\u0000\u0000\u0753\u0755\u0005"+
		"\u008f\u0000\u0000\u0754\u0751\u0001\u0000\u0000\u0000\u0754\u0755\u0001"+
		"\u0000\u0000\u0000\u0755\u075a\u0001\u0000\u0000\u0000\u0756\u075a\u0005"+
		"I\u0000\u0000\u0757\u075a\u0003\u016c\u00b6\u0000\u0758\u075a\u0003\u016e"+
		"\u00b7\u0000\u0759\u0744\u0001\u0000\u0000\u0000\u0759\u0745\u0001\u0000"+
		"\u0000\u0000\u0759\u0746\u0001\u0000\u0000\u0000\u0759\u0747\u0001\u0000"+
		"\u0000\u0000\u0759\u0748\u0001\u0000\u0000\u0000\u0759\u0749\u0001\u0000"+
		"\u0000\u0000\u0759\u074a\u0001\u0000\u0000\u0000\u0759\u074b\u0001\u0000"+
		"\u0000\u0000\u0759\u074c\u0001\u0000\u0000\u0000\u0759\u074d\u0001\u0000"+
		"\u0000\u0000\u0759\u074e\u0001\u0000\u0000\u0000\u0759\u074f\u0001\u0000"+
		"\u0000\u0000\u0759\u0750\u0001\u0000\u0000\u0000\u0759\u0756\u0001\u0000"+
		"\u0000\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u0759\u0758\u0001\u0000"+
		"\u0000\u0000\u075a\u0169\u0001\u0000\u0000\u0000\u075b\u075d\u0003\u0168"+
		"\u00b4\u0000\u075c\u075b\u0001\u0000\u0000\u0000\u075d\u075e\u0001\u0000"+
		"\u0000\u0000\u075e\u075c\u0001\u0000\u0000\u0000\u075e\u075f\u0001\u0000"+
		"\u0000\u0000\u075f\u016b\u0001\u0000\u0000\u0000\u0760\u0764\u0007\r\u0000"+
		"\u0000\u0761\u0762\u0005\u008c\u0000\u0000\u0762\u0763\u0005\u001f\u0000"+
		"\u0000\u0763\u0765\u0005\u008f\u0000\u0000\u0764\u0761\u0001\u0000\u0000"+
		"\u0000\u0764\u0765\u0001\u0000\u0000\u0000\u0765\u016d\u0001\u0000\u0000"+
		"\u0000\u0766\u0767\u0007\u000e\u0000\u0000\u0767\u016f\u0001\u0000\u0000"+
		"\u0000\u0768\u076c\u0006\u00b8\uffff\uffff\u0000\u0769\u076d\u0003\u0172"+
		"\u00b9\u0000\u076a\u076d\u0003\u0174\u00ba\u0000\u076b\u076d\u0003\u0178"+
		"\u00bc\u0000\u076c\u0769\u0001\u0000\u0000\u0000\u076c\u076a\u0001\u0000"+
		"\u0000\u0000\u076c\u076b\u0001\u0000\u0000\u0000\u076d\u076f\u0001\u0000"+
		"\u0000\u0000\u076e\u0770\u0003\u020c\u0106\u0000\u076f\u076e\u0001\u0000"+
		"\u0000\u0000\u076f\u0770\u0001\u0000\u0000\u0000\u0770\u0778\u0001\u0000"+
		"\u0000\u0000\u0771\u0778\u0003\u0176\u00bb\u0000\u0772\u0778\u0003\u017e"+
		"\u00bf\u0000\u0773\u0778\u0003\u0180\u00c0\u0000\u0774\u0775\u0005P\u0000"+
		"\u0000\u0775\u0778\u0003\u020a\u0105\u0000\u0776\u0778\u0003\u0182\u00c1"+
		"\u0000\u0777\u0768\u0001\u0000\u0000\u0000\u0777\u0771\u0001\u0000\u0000"+
		"\u0000\u0777\u0772\u0001\u0000\u0000\u0000\u0777\u0773\u0001\u0000\u0000"+
		"\u0000\u0777\u0774\u0001\u0000\u0000\u0000\u0777\u0776\u0001\u0000\u0000"+
		"\u0000\u0778\u077e\u0001\u0000\u0000\u0000\u0779\u077a\n\u0002\u0000\u0000"+
		"\u077a\u077b\u0005\u0001\u0000\u0000\u077b\u077d\u0003\u020a\u0105\u0000"+
		"\u077c\u0779\u0001\u0000\u0000\u0000\u077d\u0780\u0001\u0000\u0000\u0000"+
		"\u077e\u077c\u0001\u0000\u0000\u0000\u077e\u077f\u0001\u0000\u0000\u0000"+
		"\u077f\u0171\u0001\u0000\u0000\u0000\u0780\u077e\u0001\u0000\u0000\u0000"+
		"\u0781\u0782\u0005\u0096\u0000\u0000\u0782\u0173\u0001\u0000\u0000\u0000"+
		"\u0783\u0784\u0003\u0236\u011b\u0000\u0784\u0175\u0001\u0000\u0000\u0000"+
		"\u0785\u0786\u0005\u001c\u0000\u0000\u0786\u078a\u0003\u0170\u00b8\u0000"+
		"\u0787\u0788\u0005\u001b\u0000\u0000\u0788\u078a\u0003\u0170\u00b8\u0000"+
		"\u0789\u0785\u0001\u0000\u0000\u0000\u0789\u0787\u0001\u0000\u0000\u0000"+
		"\u078a\u0177\u0001\u0000\u0000\u0000\u078b\u078d\u0005\u008c\u0000\u0000"+
		"\u078c\u078e\u0003\u017a\u00bd\u0000\u078d\u078c\u0001\u0000\u0000\u0000"+
		"\u078d\u078e\u0001\u0000\u0000\u0000\u078e\u078f\u0001\u0000\u0000\u0000"+
		"\u078f\u0790\u0005\u008f\u0000\u0000\u0790\u0179\u0001\u0000\u0000\u0000"+
		"\u0791\u0796\u0003\u017c\u00be\u0000\u0792\u0793\u0005\u0091\u0000\u0000"+
		"\u0793\u0795\u0003\u017c\u00be\u0000\u0794\u0792\u0001\u0000\u0000\u0000"+
		"\u0795\u0798\u0001\u0000\u0000\u0000\u0796\u0794\u0001\u0000\u0000\u0000"+
		"\u0796\u0797\u0001\u0000\u0000\u0000\u0797\u017b\u0001\u0000\u0000\u0000"+
		"\u0798\u0796\u0001\u0000\u0000\u0000\u0799\u079a\u0003\u0236\u011b\u0000"+
		"\u079a\u079b\u0005\u0092\u0000\u0000\u079b\u079d\u0001\u0000\u0000\u0000"+
		"\u079c\u0799\u0001\u0000\u0000\u0000\u079c\u079d\u0001\u0000\u0000\u0000"+
		"\u079d\u079e\u0001\u0000\u0000\u0000\u079e\u079f\u0003\u0170\u00b8\u0000"+
		"\u079f\u017d\u0001\u0000\u0000\u0000\u07a0\u07a2\u0003\u020e\u0107\u0000"+
		"\u07a1\u07a0\u0001\u0000\u0000\u0000\u07a1\u07a2\u0001\u0000\u0000\u0000"+
		"\u07a2\u07a3\u0001\u0000\u0000\u0000\u07a3\u07a4\u0005\u008a\u0000\u0000"+
		"\u07a4\u07a6\u0003\u00fc~\u0000\u07a5\u07a7\u0003\u0178\u00bc\u0000\u07a6"+
		"\u07a5\u0001\u0000\u0000\u0000\u07a6\u07a7\u0001\u0000\u0000\u0000\u07a7"+
		"\u017f\u0001\u0000\u0000\u0000\u07a8\u07a9\u0003\u0174\u00ba\u0000\u07a9"+
		"\u07aa\u0005\u0098\u0000\u0000\u07aa\u0181\u0001\u0000\u0000\u0000\u07ab"+
		"\u07ac\u0003\u0192\u00c9\u0000\u07ac\u0183\u0001\u0000\u0000\u0000\u07ad"+
		"\u07ae\u0005\u0099\u0000\u0000\u07ae\u07b0\u0003\u0186\u00c3\u0000\u07af"+
		"\u07b1\u0003\u0188\u00c4\u0000\u07b0\u07af\u0001\u0000\u0000\u0000\u07b0"+
		"\u07b1\u0001\u0000\u0000\u0000\u07b1\u0185\u0001\u0000\u0000\u0000\u07b2"+
		"\u07b7\u0003\u0236\u011b\u0000\u07b3\u07b4\u0005\u008a\u0000\u0000\u07b4"+
		"\u07b6\u0003\u0236\u011b\u0000\u07b5\u07b3\u0001\u0000\u0000\u0000\u07b6"+
		"\u07b9\u0001\u0000\u0000\u0000\u07b7\u07b5\u0001\u0000\u0000\u0000\u07b7"+
		"\u07b8\u0001\u0000\u0000\u0000\u07b8\u0187\u0001\u0000\u0000\u0000\u07b9"+
		"\u07b7\u0001\u0000\u0000\u0000\u07ba\u07bc\u0005\u008c\u0000\u0000\u07bb"+
		"\u07bd\u0003\u018c\u00c6\u0000\u07bc\u07bb\u0001\u0000\u0000\u0000\u07bc"+
		"\u07bd\u0001\u0000\u0000\u0000\u07bd\u07be\u0001\u0000\u0000\u0000\u07be"+
		"\u07bf\u0005\u008f\u0000\u0000\u07bf\u0189\u0001\u0000\u0000\u0000\u07c0"+
		"\u07c2\u0003\u0184\u00c2\u0000\u07c1\u07c0\u0001\u0000\u0000\u0000\u07c2"+
		"\u07c3\u0001\u0000\u0000\u0000\u07c3\u07c1\u0001\u0000\u0000\u0000\u07c3"+
		"\u07c4\u0001\u0000\u0000\u0000\u07c4\u018b\u0001\u0000\u0000\u0000\u07c5"+
		"\u07c7\u0003\u018e\u00c7\u0000\u07c6\u07c5\u0001\u0000\u0000\u0000\u07c7"+
		"\u07c8\u0001\u0000\u0000\u0000\u07c8\u07c6\u0001\u0000\u0000\u0000\u07c8"+
		"\u07c9\u0001\u0000\u0000\u0000\u07c9\u018d\u0001\u0000\u0000\u0000\u07ca"+
		"\u07cc\u0005\u008c\u0000\u0000\u07cb\u07cd\u0003\u018c\u00c6\u0000\u07cc"+
		"\u07cb\u0001\u0000\u0000\u0000\u07cc\u07cd\u0001\u0000\u0000\u0000\u07cd"+
		"\u07ce\u0001\u0000\u0000\u0000\u07ce\u07df\u0005\u008f\u0000\u0000\u07cf"+
		"\u07d1\u0005\u008d\u0000\u0000\u07d0\u07d2\u0003\u018c\u00c6\u0000\u07d1"+
		"\u07d0\u0001\u0000\u0000\u0000\u07d1\u07d2\u0001\u0000\u0000\u0000\u07d2"+
		"\u07d3\u0001\u0000\u0000\u0000\u07d3\u07df\u0005\u0090\u0000\u0000\u07d4"+
		"\u07d6\u0005\u008b\u0000\u0000\u07d5\u07d7\u0003\u018c\u00c6\u0000\u07d6"+
		"\u07d5\u0001\u0000\u0000\u0000\u07d6\u07d7\u0001\u0000\u0000\u0000\u07d7"+
		"\u07d8\u0001\u0000\u0000\u0000\u07d8\u07df\u0005\u008e\u0000\u0000\u07d9"+
		"\u07df\u0003\u0236\u011b\u0000\u07da\u07df\u0003\u023a\u011d\u0000\u07db"+
		"\u07df\u0003\u0262\u0131\u0000\u07dc\u07df\u0003\u0254\u012a\u0000\u07dd"+
		"\u07df\u0003\u0190\u00c8\u0000\u07de\u07ca\u0001\u0000\u0000\u0000\u07de"+
		"\u07cf\u0001\u0000\u0000\u0000\u07de\u07d4\u0001\u0000\u0000\u0000\u07de"+
		"\u07d9\u0001\u0000\u0000\u0000\u07de\u07da\u0001\u0000\u0000\u0000\u07de"+
		"\u07db\u0001\u0000\u0000\u0000\u07de\u07dc\u0001\u0000\u0000\u0000\u07de"+
		"\u07dd\u0001\u0000\u0000\u0000\u07df\u018f\u0001\u0000\u0000\u0000\u07e0"+
		"\u07e7\u0007\u000f\u0000\u0000\u07e1\u07e7\u0003\u0248\u0124\u0000\u07e2"+
		"\u07e3\u0004\u00c8\u0003\u0000\u07e3\u07e7\u0005\u009a\u0000\u0000\u07e4"+
		"\u07e5\u0004\u00c8\u0004\u0000\u07e5\u07e7\u0005\u0097\u0000\u0000\u07e6"+
		"\u07e0\u0001\u0000\u0000\u0000\u07e6\u07e1\u0001\u0000\u0000\u0000\u07e6"+
		"\u07e2\u0001\u0000\u0000\u0000\u07e6\u07e4\u0001\u0000\u0000\u0000\u07e7"+
		"\u0191\u0001\u0000\u0000\u0000\u07e8\u07ea\u0003\u019a\u00cd\u0000\u07e9"+
		"\u07e8\u0001\u0000\u0000\u0000\u07e9\u07ea\u0001\u0000\u0000\u0000\u07ea"+
		"\u07eb\u0001\u0000\u0000\u0000\u07eb\u07ed\u0003\u0196\u00cb\u0000\u07ec"+
		"\u07ee\u0003\u019e\u00cf\u0000\u07ed\u07ec\u0001\u0000\u0000\u0000\u07ed"+
		"\u07ee\u0001\u0000\u0000\u0000\u07ee\u0193\u0001\u0000\u0000\u0000\u07ef"+
		"\u07f4\u0003\u0192\u00c9\u0000\u07f0\u07f1\u0005\u0091\u0000\u0000\u07f1"+
		"\u07f3\u0003\u0192\u00c9\u0000\u07f2\u07f0\u0001\u0000\u0000\u0000\u07f3"+
		"\u07f6\u0001\u0000\u0000\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000\u07f4"+
		"\u07f5\u0001\u0000\u0000\u0000\u07f5\u0195\u0001\u0000\u0000\u0000\u07f6"+
		"\u07f4\u0001\u0000\u0000\u0000\u07f7\u07f9\u0003\u0250\u0128\u0000\u07f8"+
		"\u07f7\u0001\u0000\u0000\u0000\u07f8\u07f9\u0001\u0000\u0000\u0000\u07f9"+
		"\u07fa\u0001\u0000\u0000\u0000\u07fa\u07fd\u0003\u01ea\u00f5\u0000\u07fb"+
		"\u07fd\u0003\u0198\u00cc\u0000\u07fc\u07f8\u0001\u0000\u0000\u0000\u07fc"+
		"\u07fb\u0001\u0000\u0000\u0000\u07fd\u0197\u0001\u0000\u0000\u0000\u07fe"+
		"\u07ff\u0005\u009a\u0000\u0000\u07ff\u0800\u0003\u0236\u011b\u0000\u0800"+
		"\u0199\u0001\u0000\u0000\u0000\u0801\u0803\u0005Q\u0000\u0000\u0802\u0804"+
		"\u0007\t\u0000\u0000\u0803\u0802\u0001\u0000\u0000\u0000\u0803\u0804\u0001"+
		"\u0000\u0000\u0000\u0804\u019b\u0001\u0000\u0000\u0000\u0805\u0806\u0003"+
		"\u024e\u0127\u0000\u0806\u0807\u0003\u0196\u00cb\u0000\u0807\u0813\u0001"+
		"\u0000\u0000\u0000\u0808\u080b\u0003\u023c\u011e\u0000\u0809\u080b\u0003"+
		"\u01a0\u00d0\u0000\u080a\u0808\u0001\u0000\u0000\u0000\u080a\u0809\u0001"+
		"\u0000\u0000\u0000\u080b\u080d\u0001\u0000\u0000\u0000\u080c\u080e\u0003"+
		"\u019a\u00cd\u0000\u080d\u080c\u0001\u0000\u0000\u0000\u080d\u080e\u0001"+
		"\u0000\u0000\u0000\u080e\u080f\u0001\u0000\u0000\u0000\u080f\u0810\u0003"+
		"\u0196\u00cb\u0000\u0810\u0813\u0001\u0000\u0000\u0000\u0811\u0813\u0003"+
		"\u01a2\u00d1\u0000\u0812\u0805\u0001\u0000\u0000\u0000\u0812\u080a\u0001"+
		"\u0000\u0000\u0000\u0812\u0811\u0001\u0000\u0000\u0000\u0813\u019d\u0001"+
		"\u0000\u0000\u0000\u0814\u0816\u0003\u019c\u00ce\u0000\u0815\u0814\u0001"+
		"\u0000\u0000\u0000\u0816\u0817\u0001\u0000\u0000\u0000\u0817\u0815\u0001"+
		"\u0000\u0000\u0000\u0817\u0818\u0001\u0000\u0000\u0000\u0818\u019f\u0001"+
		"\u0000\u0000\u0000\u0819\u081a\u0005\u0098\u0000\u0000\u081a\u081b\u0003"+
		"\u0192\u00c9\u0000\u081b\u081c\u0005\u0092\u0000\u0000\u081c\u01a1\u0001"+
		"\u0000\u0000\u0000\u081d\u0823\u0005P\u0000\u0000\u081e\u0820\u0005\u0001"+
		"\u0000\u0000\u081f\u0821\u0007\t\u0000\u0000\u0820\u081f\u0001\u0000\u0000"+
		"\u0000\u0820\u0821\u0001\u0000\u0000\u0000\u0821\u0823\u0001\u0000\u0000"+
		"\u0000\u0822\u081d\u0001\u0000\u0000\u0000\u0822\u081e\u0001\u0000\u0000"+
		"\u0000\u0823\u0824\u0001\u0000\u0000\u0000\u0824\u0825\u0003\u020a\u0105"+
		"\u0000\u0825\u01a3\u0001\u0000\u0000\u0000\u0826\u0828\u0003\u01a6\u00d3"+
		"\u0000\u0827\u0829\u0003\u0096K\u0000\u0828\u0827\u0001\u0000\u0000\u0000"+
		"\u0828\u0829\u0001\u0000\u0000\u0000\u0829\u0839\u0001\u0000\u0000\u0000"+
		"\u082a\u0839\u0003\u0224\u0112\u0000\u082b\u0839\u0003\u0226\u0113\u0000"+
		"\u082c\u0839\u0003\u01a8\u00d4\u0000\u082d\u0839\u0003\u01b8\u00dc\u0000"+
		"\u082e\u0839\u0003\u01ba\u00dd\u0000\u082f\u0839\u0003\u01bc\u00de\u0000"+
		"\u0830\u0839\u0003\u01d0\u00e8\u0000\u0831\u0839\u0003\u01d2\u00e9\u0000"+
		"\u0832\u0839\u0003\u01d4\u00ea\u0000\u0833\u0839\u0003\u01ce\u00e7\u0000"+
		"\u0834\u0839\u0003\u01da\u00ed\u0000\u0835\u0839\u0003\u01dc\u00ee\u0000"+
		"\u0836\u0839\u0003\u01e6\u00f3\u0000\u0837\u0839\u0003\u01e8\u00f4\u0000"+
		"\u0838\u0826\u0001\u0000\u0000\u0000\u0838\u082a\u0001\u0000\u0000\u0000"+
		"\u0838\u082b\u0001\u0000\u0000\u0000\u0838\u082c\u0001\u0000\u0000\u0000"+
		"\u0838\u082d\u0001\u0000\u0000\u0000\u0838\u082e\u0001\u0000\u0000\u0000"+
		"\u0838\u082f\u0001\u0000\u0000\u0000\u0838\u0830\u0001\u0000\u0000\u0000"+
		"\u0838\u0831\u0001\u0000\u0000\u0000\u0838\u0832\u0001\u0000\u0000\u0000"+
		"\u0838\u0833\u0001\u0000\u0000\u0000\u0838\u0834\u0001\u0000\u0000\u0000"+
		"\u0838\u0835\u0001\u0000\u0000\u0000\u0838\u0836\u0001\u0000\u0000\u0000"+
		"\u0838\u0837\u0001\u0000\u0000\u0000\u0839\u01a5\u0001\u0000\u0000\u0000"+
		"\u083a\u083f\u0003\u0236\u011b\u0000\u083b\u083c\u0005\u008c\u0000\u0000"+
		"\u083c\u083d\u0003\u0206\u0103\u0000\u083d\u083e\u0005\u008f\u0000\u0000"+
		"\u083e\u0840\u0001\u0000\u0000\u0000\u083f\u083b\u0001\u0000\u0000\u0000"+
		"\u083f\u0840\u0001\u0000\u0000\u0000\u0840\u01a7\u0001\u0000\u0000\u0000"+
		"\u0841\u084d\u0003\u0262\u0131\u0000\u0842\u084d\u0003\u01aa\u00d5\u0000"+
		"\u0843\u084d\u0003\u01b0\u00d8\u0000\u0844\u084d\u0003\u01b6\u00db\u0000"+
		"\u0845\u084d\u0005{\u0000\u0000\u0846\u084d\u0005|\u0000\u0000\u0847\u084d"+
		"\u0005}\u0000\u0000\u0848\u084d\u0005~\u0000\u0000\u0849\u084d\u0005\u007f"+
		"\u0000\u0000\u084a\u084d\u0005\u0080\u0000\u0000\u084b\u084d\u0005\u0081"+
		"\u0000\u0000\u084c\u0841\u0001\u0000\u0000\u0000\u084c\u0842\u0001\u0000"+
		"\u0000\u0000\u084c\u0843\u0001\u0000\u0000\u0000\u084c\u0844\u0001\u0000"+
		"\u0000\u0000\u084c\u0845\u0001\u0000\u0000\u0000\u084c\u0846\u0001\u0000"+
		"\u0000\u0000\u084c\u0847\u0001\u0000\u0000\u0000\u084c\u0848\u0001\u0000"+
		"\u0000\u0000\u084c\u0849\u0001\u0000\u0000\u0000\u084c\u084a\u0001\u0000"+
		"\u0000\u0000\u084c\u084b\u0001\u0000\u0000\u0000\u084d\u01a9\u0001\u0000"+
		"\u0000\u0000\u084e\u0850\u0005\u008d\u0000\u0000\u084f\u0851\u0003\u01ac"+
		"\u00d6\u0000\u0850\u084f\u0001\u0000\u0000\u0000\u0850\u0851\u0001\u0000"+
		"\u0000\u0000\u0851\u0852\u0001\u0000\u0000\u0000\u0852\u0853\u0005\u0090"+
		"\u0000\u0000\u0853\u01ab\u0001\u0000\u0000\u0000\u0854\u0859\u0003\u01ae"+
		"\u00d7\u0000\u0855\u0856\u0005\u0091\u0000\u0000\u0856\u0858\u0003\u01ae"+
		"\u00d7\u0000\u0857\u0855\u0001\u0000\u0000\u0000\u0858\u085b\u0001\u0000"+
		"\u0000\u0000\u0859\u0857\u0001\u0000\u0000\u0000\u0859\u085a\u0001\u0000"+
		"\u0000\u0000\u085a\u085d\u0001\u0000\u0000\u0000\u085b\u0859\u0001\u0000"+
		"\u0000\u0000\u085c\u085e\u0005\u0091\u0000\u0000\u085d\u085c\u0001\u0000"+
		"\u0000\u0000\u085d\u085e\u0001\u0000\u0000\u0000\u085e\u01ad\u0001\u0000"+
		"\u0000\u0000\u085f\u0860\u0003\u0192\u00c9\u0000\u0860\u01af\u0001\u0000"+
		"\u0000\u0000\u0861\u0864\u0005\u008d\u0000\u0000\u0862\u0865\u0003\u01b2"+
		"\u00d9\u0000\u0863\u0865\u0005\u0092\u0000\u0000\u0864\u0862\u0001\u0000"+
		"\u0000\u0000\u0864\u0863\u0001\u0000\u0000\u0000\u0865\u0866\u0001\u0000"+
		"\u0000\u0000\u0866\u0867\u0005\u0090\u0000\u0000\u0867\u01b1\u0001\u0000"+
		"\u0000\u0000\u0868\u086d\u0003\u01b4\u00da\u0000\u0869\u086a\u0005\u0091"+
		"\u0000\u0000\u086a\u086c\u0003\u01b4\u00da\u0000\u086b\u0869\u0001\u0000"+
		"\u0000\u0000\u086c\u086f\u0001\u0000\u0000\u0000\u086d\u086b\u0001\u0000"+
		"\u0000\u0000\u086d\u086e\u0001\u0000\u0000\u0000\u086e\u0871\u0001\u0000"+
		"\u0000\u0000\u086f\u086d\u0001\u0000\u0000\u0000\u0870\u0872\u0005\u0091"+
		"\u0000\u0000\u0871\u0870\u0001\u0000\u0000\u0000\u0871\u0872\u0001\u0000"+
		"\u0000\u0000\u0872\u01b3\u0001\u0000\u0000\u0000\u0873\u0874\u0003\u0192"+
		"\u00c9\u0000\u0874\u0875\u0005\u0092\u0000\u0000\u0875\u0876\u0003\u0192"+
		"\u00c9\u0000\u0876\u01b5\u0001\u0000\u0000\u0000\u0877\u0878\u0005\u0084"+
		"\u0000\u0000\u0878\u0879\u0005\u008c\u0000\u0000\u0879\u087a\u0005U\u0000"+
		"\u0000\u087a\u087b\u0005\u0092\u0000\u0000\u087b\u087c\u0003\u0192\u00c9"+
		"\u0000\u087c\u087d\u0005\u0091\u0000\u0000\u087d\u087e\u0005W\u0000\u0000"+
		"\u087e\u087f\u0005\u0092\u0000\u0000\u087f\u0880\u0003\u0192\u00c9\u0000"+
		"\u0880\u0881\u0005\u0091\u0000\u0000\u0881\u0882\u0005V\u0000\u0000\u0882"+
		"\u0883\u0005\u0092\u0000\u0000\u0883\u0884\u0003\u0192\u00c9\u0000\u0884"+
		"\u0885\u0005\u0091\u0000\u0000\u0885\u0886\u0005\u0002\u0000\u0000\u0886"+
		"\u0887\u0005\u0092\u0000\u0000\u0887\u0888\u0003\u0192\u00c9\u0000\u0888"+
		"\u0889\u0005\u008f\u0000\u0000\u0889\u0899\u0001\u0000\u0000\u0000\u088a"+
		"\u088b\u0005\u0085\u0000\u0000\u088b\u088c\u0005\u008c\u0000\u0000\u088c"+
		"\u088d\u0005X\u0000\u0000\u088d\u088e\u0005\u0092\u0000\u0000\u088e\u088f"+
		"\u0003\u0192\u00c9\u0000\u088f\u0890\u0005\u008f\u0000\u0000\u0890\u0899"+
		"\u0001\u0000\u0000\u0000\u0891\u0892\u0005\u0086\u0000\u0000\u0892\u0893"+
		"\u0005\u008c\u0000\u0000\u0893\u0894\u0005X\u0000\u0000\u0894\u0895\u0005"+
		"\u0092\u0000\u0000\u0895\u0896\u0003\u0192\u00c9\u0000\u0896\u0897\u0005"+
		"\u008f\u0000\u0000\u0897\u0899\u0001\u0000\u0000\u0000\u0898\u0877\u0001"+
		"\u0000\u0000\u0000\u0898\u088a\u0001\u0000\u0000\u0000\u0898\u0891\u0001"+
		"\u0000\u0000\u0000\u0899\u01b7\u0001\u0000\u0000\u0000\u089a\u08a7\u0005"+
		"_\u0000\u0000\u089b\u089c\u0005_\u0000\u0000\u089c\u089d\u0005\u008a\u0000"+
		"\u0000\u089d\u08a7\u0003\u0236\u011b\u0000\u089e\u089f\u0005_\u0000\u0000"+
		"\u089f\u08a0\u0005\u008d\u0000\u0000\u08a0\u08a1\u0003\u01fc\u00fe\u0000"+
		"\u08a1\u08a2\u0005\u0090\u0000\u0000\u08a2\u08a7\u0001\u0000\u0000\u0000"+
		"\u08a3\u08a4\u0005_\u0000\u0000\u08a4\u08a5\u0005\u008a\u0000\u0000\u08a5"+
		"\u08a7\u0005*\u0000\u0000\u08a6\u089a\u0001\u0000\u0000\u0000\u08a6\u089b"+
		"\u0001\u0000\u0000\u0000\u08a6\u089e\u0001\u0000\u0000\u0000\u08a6\u08a3"+
		"\u0001\u0000\u0000\u0000\u08a7\u01b9\u0001\u0000\u0000\u0000\u08a8\u08a9"+
		"\u0005R\u0000\u0000\u08a9\u08aa\u0005\u008a\u0000\u0000\u08aa\u08b4\u0003"+
		"\u0236\u011b\u0000\u08ab\u08ac\u0005R\u0000\u0000\u08ac\u08ad\u0005\u008d"+
		"\u0000\u0000\u08ad\u08ae\u0003\u01fc\u00fe\u0000\u08ae\u08af\u0005\u0090"+
		"\u0000\u0000\u08af\u08b4\u0001\u0000\u0000\u0000\u08b0\u08b1\u0005R\u0000"+
		"\u0000\u08b1\u08b2\u0005\u008a\u0000\u0000\u08b2\u08b4\u0005*\u0000\u0000"+
		"\u08b3\u08a8\u0001\u0000\u0000\u0000\u08b3\u08ab\u0001\u0000\u0000\u0000"+
		"\u08b3\u08b0\u0001\u0000\u0000\u0000\u08b4\u01bb\u0001\u0000\u0000\u0000"+
		"\u08b5\u08b7\u0005\u008b\u0000\u0000\u08b6\u08b8\u0003\u01be\u00df\u0000"+
		"\u08b7\u08b6\u0001\u0000\u0000\u0000\u08b7\u08b8\u0001\u0000\u0000\u0000"+
		"\u08b8\u08ba\u0001\u0000\u0000\u0000\u08b9\u08bb\u0003\u0004\u0002\u0000"+
		"\u08ba\u08b9\u0001\u0000\u0000\u0000\u08ba\u08bb\u0001\u0000\u0000\u0000"+
		"\u08bb\u08bc\u0001\u0000\u0000\u0000\u08bc\u08bd\u0005\u008e\u0000\u0000"+
		"\u08bd\u01bd\u0001\u0000\u0000\u0000\u08be\u08c0\u0003\u01c6\u00e3\u0000"+
		"\u08bf\u08be\u0001\u0000\u0000\u0000\u08bf\u08c0\u0001\u0000\u0000\u0000"+
		"\u08c0\u08c1\u0001\u0000\u0000\u0000\u08c1\u08c3\u0003\u01c0\u00e0\u0000"+
		"\u08c2\u08c4\u0005\'\u0000\u0000\u08c3\u08c2\u0001\u0000\u0000\u0000\u08c3"+
		"\u08c4\u0001\u0000\u0000\u0000\u08c4\u08c6\u0001\u0000\u0000\u0000\u08c5"+
		"\u08c7\u0003\u00dcn\u0000\u08c6\u08c5\u0001\u0000\u0000\u0000\u08c6\u08c7"+
		"\u0001\u0000\u0000\u0000\u08c7\u08c8\u0001\u0000\u0000\u0000\u08c8\u08c9"+
		"\u0005\u0011\u0000\u0000\u08c9\u08ce\u0001\u0000\u0000\u0000\u08ca\u08cb"+
		"\u0003\u01c6\u00e3\u0000\u08cb\u08cc\u0005\u0011\u0000\u0000\u08cc\u08ce"+
		"\u0001\u0000\u0000\u0000\u08cd\u08bf\u0001\u0000\u0000\u0000\u08cd\u08ca"+
		"\u0001\u0000\u0000\u0000\u08ce\u01bf\u0001\u0000\u0000\u0000\u08cf\u08d1"+
		"\u0005\u008c\u0000\u0000\u08d0\u08d2\u0003\u01c2\u00e1\u0000\u08d1\u08d0"+
		"\u0001\u0000\u0000\u0000\u08d1\u08d2\u0001\u0000\u0000\u0000\u08d2\u08d3"+
		"\u0001\u0000\u0000\u0000\u08d3\u08d6\u0005\u008f\u0000\u0000\u08d4\u08d6"+
		"\u0003\u0238\u011c\u0000\u08d5\u08cf\u0001\u0000\u0000\u0000\u08d5\u08d4"+
		"\u0001\u0000\u0000\u0000\u08d6\u01c1\u0001\u0000\u0000\u0000\u08d7\u08dc"+
		"\u0003\u01c4\u00e2\u0000\u08d8\u08d9\u0005\u0091\u0000\u0000\u08d9\u08db"+
		"\u0003\u01c4\u00e2\u0000\u08da\u08d8\u0001\u0000\u0000\u0000\u08db\u08de"+
		"\u0001\u0000\u0000\u0000\u08dc\u08da\u0001\u0000\u0000\u0000\u08dc\u08dd"+
		"\u0001\u0000\u0000\u0000\u08dd\u01c3\u0001\u0000\u0000\u0000\u08de\u08dc"+
		"\u0001\u0000\u0000\u0000\u08df\u08e4\u0003\u0236\u011b\u0000\u08e0\u08e2"+
		"\u0003\u020c\u0106\u0000\u08e1\u08e3\u0003\u024a\u0125\u0000\u08e2\u08e1"+
		"\u0001\u0000\u0000\u0000\u08e2\u08e3\u0001\u0000\u0000\u0000\u08e3\u08e5"+
		"\u0001\u0000\u0000\u0000\u08e4\u08e0\u0001\u0000\u0000\u0000\u08e4\u08e5"+
		"\u0001\u0000\u0000\u0000\u08e5\u01c5\u0001\u0000\u0000\u0000\u08e6\u08e7"+
		"\u0005\u008d\u0000\u0000\u08e7\u08e8\u0003\u01c8\u00e4\u0000\u08e8\u08e9"+
		"\u0005\u0090\u0000\u0000\u08e9\u01c7\u0001\u0000\u0000\u0000\u08ea\u08ef"+
		"\u0003\u01ca\u00e5\u0000\u08eb\u08ec\u0005\u0091\u0000\u0000\u08ec\u08ee"+
		"\u0003\u01ca\u00e5\u0000\u08ed\u08eb\u0001\u0000\u0000\u0000\u08ee\u08f1"+
		"\u0001\u0000\u0000\u0000\u08ef\u08ed\u0001\u0000\u0000\u0000\u08ef\u08f0"+
		"\u0001\u0000\u0000\u0000\u08f0\u01c9\u0001\u0000\u0000\u0000\u08f1\u08ef"+
		"\u0001\u0000\u0000\u0000\u08f2\u08f4\u0003\u01cc\u00e6\u0000\u08f3\u08f2"+
		"\u0001\u0000\u0000\u0000\u08f3\u08f4\u0001\u0000\u0000\u0000\u08f4\u08fc"+
		"\u0001\u0000\u0000\u0000\u08f5\u08f7\u0003\u0236\u011b\u0000\u08f6\u08f8"+
		"\u0005\u009c\u0000\u0000\u08f7\u08f6\u0001\u0000\u0000\u0000\u08f7\u08f8"+
		"\u0001\u0000\u0000\u0000\u08f8\u08f9\u0001\u0000\u0000\u0000\u08f9\u08fa"+
		"\u0003\u0192\u00c9\u0000\u08fa\u08fd\u0001\u0000\u0000\u0000\u08fb\u08fd"+
		"\u0003\u01b8\u00dc\u0000\u08fc\u08f5\u0001\u0000\u0000\u0000\u08fc\u08fb"+
		"\u0001\u0000\u0000\u0000\u08fd\u01cb\u0001\u0000\u0000\u0000\u08fe\u0906"+
		"\u0005I\u0000\u0000\u08ff\u0903\u0005J\u0000\u0000\u0900\u0901\u0005\u008c"+
		"\u0000\u0000\u0901\u0902\u0007\f\u0000\u0000\u0902\u0904\u0005\u008f\u0000"+
		"\u0000\u0903\u0900\u0001\u0000\u0000\u0000\u0903\u0904\u0001\u0000\u0000"+
		"\u0000\u0904\u0906\u0001\u0000\u0000\u0000\u0905\u08fe\u0001\u0000\u0000"+
		"\u0000\u0905\u08ff\u0001\u0000\u0000\u0000\u0906\u01cd\u0001\u0000\u0000"+
		"\u0000\u0907\u090a\u0005\u008a\u0000\u0000\u0908\u090b\u0003\u0236\u011b"+
		"\u0000\u0909\u090b\u0003\u023a\u011d\u0000\u090a\u0908\u0001\u0000\u0000"+
		"\u0000\u090a\u0909\u0001\u0000\u0000\u0000\u090b\u090e\u0001\u0000\u0000"+
		"\u0000\u090c\u090d\u0005\u008a\u0000\u0000\u090d\u090f\u0003\u01ea\u00f5"+
		"\u0000\u090e\u090c\u0001\u0000\u0000\u0000\u090e\u090f\u0001\u0000\u0000"+
		"\u0000\u090f\u01cf\u0001\u0000\u0000\u0000\u0910\u0911\u0005\u008c\u0000"+
		"\u0000\u0911\u0912\u0003\u0254\u012a\u0000\u0912\u0913\u0005\u008f\u0000"+
		"\u0000\u0913\u01d1\u0001\u0000\u0000\u0000\u0914\u0915\u0005\u008c\u0000"+
		"\u0000\u0915\u0916\u0003\u0192\u00c9\u0000\u0916\u0917\u0005\u008f\u0000"+
		"\u0000\u0917\u01d3\u0001\u0000\u0000\u0000\u0918\u0919\u0005\u008c\u0000"+
		"\u0000\u0919\u0921\u0005\u008f\u0000\u0000\u091a\u091b\u0005\u008c\u0000"+
		"\u0000\u091b\u091c\u0003\u01d8\u00ec\u0000\u091c\u091d\u0005\u0091\u0000"+
		"\u0000\u091d\u091e\u0003\u01d6\u00eb\u0000\u091e\u091f\u0005\u008f\u0000"+
		"\u0000\u091f\u0921\u0001\u0000\u0000\u0000\u0920\u0918\u0001\u0000\u0000"+
		"\u0000\u0920\u091a\u0001\u0000\u0000\u0000\u0921\u01d5\u0001\u0000\u0000"+
		"\u0000\u0922\u0927\u0003\u01d8\u00ec\u0000\u0923\u0924\u0005\u0091\u0000"+
		"\u0000\u0924\u0926\u0003\u01d8\u00ec\u0000\u0925\u0923\u0001\u0000\u0000"+
		"\u0000\u0926\u0929\u0001\u0000\u0000\u0000\u0927\u0925\u0001\u0000\u0000"+
		"\u0000\u0927\u0928\u0001\u0000\u0000\u0000\u0928\u01d7\u0001\u0000\u0000"+
		"\u0000\u0929\u0927\u0001\u0000\u0000\u0000\u092a\u092b\u0003\u0236\u011b"+
		"\u0000\u092b\u092c\u0005\u0092\u0000\u0000\u092c\u092e\u0001\u0000\u0000"+
		"\u0000\u092d\u092a\u0001\u0000\u0000\u0000\u092d\u092e\u0001\u0000\u0000"+
		"\u0000\u092e\u092f\u0001\u0000\u0000\u0000\u092f\u0930\u0003\u0192\u00c9"+
		"\u0000\u0930\u01d9\u0001\u0000\u0000\u0000\u0931\u0932\u0005\u0096\u0000"+
		"\u0000\u0932\u01db\u0001\u0000\u0000\u0000\u0933\u0935\u0005\u00a7\u0000"+
		"\u0000\u0934\u0936\u0003\u020a\u0105\u0000\u0935\u0934\u0001\u0000\u0000"+
		"\u0000\u0935\u0936\u0001\u0000\u0000\u0000\u0936\u0937\u0001\u0000\u0000"+
		"\u0000\u0937\u0938\u0005\u008a\u0000\u0000\u0938\u0939\u0003\u01de\u00ef"+
		"\u0000\u0939\u01dd\u0001\u0000\u0000\u0000\u093a\u093f\u0003\u01e0\u00f0"+
		"\u0000\u093b\u093c\u0005\u008a\u0000\u0000\u093c\u093e\u0003\u01e0\u00f0"+
		"\u0000\u093d\u093b\u0001\u0000\u0000\u0000\u093e\u0941\u0001\u0000\u0000"+
		"\u0000\u093f\u093d\u0001\u0000\u0000\u0000\u093f\u0940\u0001\u0000\u0000"+
		"\u0000\u0940\u01df\u0001\u0000\u0000\u0000\u0941\u093f\u0001\u0000\u0000"+
		"\u0000\u0942\u0944\u0003\u0236\u011b\u0000\u0943\u0945\u0003\u01e2\u00f1"+
		"\u0000\u0944\u0943\u0001\u0000\u0000\u0000\u0944\u0945\u0001\u0000\u0000"+
		"\u0000\u0945\u0948\u0001\u0000\u0000\u0000\u0946\u0948\u0003\u01e2\u00f1"+
		"\u0000\u0947\u0942\u0001\u0000\u0000\u0000\u0947\u0946\u0001\u0000\u0000"+
		"\u0000\u0948\u01e1\u0001\u0000\u0000\u0000\u0949\u094b\u0003\u01e4\u00f2"+
		"\u0000\u094a\u0949\u0001\u0000\u0000\u0000\u094b\u094c\u0001\u0000\u0000"+
		"\u0000\u094c\u094a\u0001\u0000\u0000\u0000\u094c\u094d\u0001\u0000\u0000"+
		"\u0000\u094d\u01e3\u0001\u0000\u0000\u0000\u094e\u0956\u0005\u0098\u0000"+
		"\u0000\u094f\u0956\u0005\u0097\u0000\u0000\u0950\u0956\u0005_\u0000\u0000"+
		"\u0951\u0952\u0005\u008d\u0000\u0000\u0952\u0953\u0003\u01fc\u00fe\u0000"+
		"\u0953\u0954\u0005\u0090\u0000\u0000\u0954\u0956\u0001\u0000\u0000\u0000"+
		"\u0955\u094e\u0001\u0000\u0000\u0000\u0955\u094f\u0001\u0000\u0000\u0000"+
		"\u0955\u0950\u0001\u0000\u0000\u0000\u0955\u0951\u0001\u0000\u0000\u0000"+
		"\u0956\u01e5\u0001\u0000\u0000\u0000\u0957\u0958\u0005\u0082\u0000\u0000"+
		"\u0958\u095b\u0005\u008c\u0000\u0000\u0959\u095a\u0007\u0010\u0000\u0000"+
		"\u095a\u095c\u0005\u0092\u0000\u0000\u095b\u0959\u0001\u0000\u0000\u0000"+
		"\u095b\u095c\u0001\u0000\u0000\u0000\u095c\u095d\u0001\u0000\u0000\u0000"+
		"\u095d\u095e\u0003\u0192\u00c9\u0000\u095e\u095f\u0005\u008f\u0000\u0000"+
		"\u095f\u01e7\u0001\u0000\u0000\u0000\u0960\u0961\u0005\u0083\u0000\u0000"+
		"\u0961\u0962\u0005\u008c\u0000\u0000\u0962\u0963\u0003\u0192\u00c9\u0000"+
		"\u0963\u0964\u0005\u008f\u0000\u0000\u0964\u01e9\u0001\u0000\u0000\u0000"+
		"\u0965\u096f\u0003\u01a4\u00d2\u0000\u0966\u096e\u0003\u01ec\u00f6\u0000"+
		"\u0967\u096e\u0003\u01ee\u00f7\u0000\u0968\u096e\u0003\u01f0\u00f8\u0000"+
		"\u0969\u096e\u0003\u01f2\u00f9\u0000\u096a\u096e\u0003\u01f4\u00fa\u0000"+
		"\u096b\u096e\u0003\u01f6\u00fb\u0000\u096c\u096e\u0003\u01f8\u00fc\u0000"+
		"\u096d\u0966\u0001\u0000\u0000\u0000\u096d\u0967\u0001\u0000\u0000\u0000"+
		"\u096d\u0968\u0001\u0000\u0000\u0000\u096d\u0969\u0001\u0000\u0000\u0000"+
		"\u096d\u096a\u0001\u0000\u0000\u0000\u096d\u096b\u0001\u0000\u0000\u0000"+
		"\u096d\u096c\u0001\u0000\u0000\u0000\u096e\u0971\u0001\u0000\u0000\u0000"+
		"\u096f\u096d\u0001\u0000\u0000\u0000\u096f\u0970\u0001\u0000\u0000\u0000"+
		"\u0970\u0975\u0001\u0000\u0000\u0000\u0971\u096f\u0001\u0000\u0000\u0000"+
		"\u0972\u0974\u0003\u0252\u0129\u0000\u0973\u0972\u0001\u0000\u0000\u0000"+
		"\u0974\u0977\u0001\u0000\u0000\u0000\u0975\u0976\u0001\u0000\u0000\u0000"+
		"\u0975\u0973\u0001\u0000\u0000\u0000\u0976\u01eb\u0001\u0000\u0000\u0000"+
		"\u0977\u0975\u0001\u0000\u0000\u0000\u0978\u097a\u0003\u01fa\u00fd\u0000"+
		"\u0979\u0978\u0001\u0000\u0000\u0000\u0979\u097a\u0001\u0000\u0000\u0000"+
		"\u097a\u097b\u0001\u0000\u0000\u0000\u097b\u097e\u0003\u0200\u0100\u0000"+
		"\u097c\u097e\u0003\u01fa\u00fd\u0000\u097d\u0979\u0001\u0000\u0000\u0000"+
		"\u097d\u097c\u0001\u0000\u0000\u0000\u097e\u01ed\u0001\u0000\u0000\u0000"+
		"\u097f\u0980\u0005\u008a\u0000\u0000\u0980\u0985\u0005*\u0000\u0000\u0981"+
		"\u0982\u0005\u008c\u0000\u0000\u0982\u0983\u0003\u0206\u0103\u0000\u0983"+
		"\u0984\u0005\u008f\u0000\u0000\u0984\u0986\u0001\u0000\u0000\u0000\u0985"+
		"\u0981\u0001\u0000\u0000\u0000\u0985\u0986\u0001";
	private static final String _serializedATNSegment1 =
		"\u0000\u0000\u0000\u0986\u01ef\u0001\u0000\u0000\u0000\u0987\u0991\u0005"+
		"\u008a\u0000\u0000\u0988\u0992\u0005\u00ac\u0000\u0000\u0989\u098f\u0003"+
		"\u0236\u011b\u0000\u098a\u0990\u0003\u0096K\u0000\u098b\u098c\u0005\u008c"+
		"\u0000\u0000\u098c\u098d\u0003\u0206\u0103\u0000\u098d\u098e\u0005\u008f"+
		"\u0000\u0000\u098e\u0990\u0001\u0000\u0000\u0000\u098f\u098a\u0001\u0000"+
		"\u0000\u0000\u098f\u098b\u0001\u0000\u0000\u0000\u098f\u0990\u0001\u0000"+
		"\u0000\u0000\u0990\u0992\u0001\u0000\u0000\u0000\u0991\u0988\u0001\u0000"+
		"\u0000\u0000\u0991\u0989\u0001\u0000\u0000\u0000\u0992\u01f1\u0001\u0000"+
		"\u0000\u0000\u0993\u0994\u0005\u008a\u0000\u0000\u0994\u0995\u0005_\u0000"+
		"\u0000\u0995\u01f3\u0001\u0000\u0000\u0000\u0996\u0997\u0005\u008d\u0000"+
		"\u0000\u0997\u0998\u0003\u01fc\u00fe\u0000\u0998\u0999\u0005\u0090\u0000"+
		"\u0000\u0999\u01f5\u0001\u0000\u0000\u0000\u099a\u099b\u0004\u00fb\u0005"+
		"\u0000\u099b\u099c\u0005\u0097\u0000\u0000\u099c\u01f7\u0001\u0000\u0000"+
		"\u0000\u099d\u099e\u0004\u00fc\u0006\u0000\u099e\u099f\u0005\u0098\u0000"+
		"\u0000\u099f\u01f9\u0001\u0000\u0000\u0000\u09a0\u09a2\u0005\u008c\u0000"+
		"\u0000\u09a1\u09a3\u0003\u01fc\u00fe\u0000\u09a2\u09a1\u0001\u0000\u0000"+
		"\u0000\u09a2\u09a3\u0001\u0000\u0000\u0000\u09a3\u09a4\u0001\u0000\u0000"+
		"\u0000\u09a4\u09a5\u0005\u008f\u0000\u0000\u09a5\u01fb\u0001\u0000\u0000"+
		"\u0000\u09a6\u09ab\u0003\u01fe\u00ff\u0000\u09a7\u09a8\u0005\u0091\u0000"+
		"\u0000\u09a8\u09aa\u0003\u01fe\u00ff\u0000\u09a9\u09a7\u0001\u0000\u0000"+
		"\u0000\u09aa\u09ad\u0001\u0000\u0000\u0000\u09ab\u09a9\u0001\u0000\u0000"+
		"\u0000\u09ab\u09ac\u0001\u0000\u0000\u0000\u09ac\u01fd\u0001\u0000\u0000"+
		"\u0000\u09ad\u09ab\u0001\u0000\u0000\u0000\u09ae\u09b0\u0003\u0208\u0104"+
		"\u0000\u09af\u09ae\u0001\u0000\u0000\u0000\u09af\u09b0\u0001\u0000\u0000"+
		"\u0000\u09b0\u09b4\u0001\u0000\u0000\u0000\u09b1\u09b5\u0003\u0236\u011b"+
		"\u0000\u09b2\u09b5\u0003\u0192\u00c9\u0000\u09b3\u09b5\u0003\u0254\u012a"+
		"\u0000\u09b4\u09b1\u0001\u0000\u0000\u0000\u09b4\u09b2\u0001\u0000\u0000"+
		"\u0000\u09b4\u09b3\u0001\u0000\u0000\u0000\u09b5\u01ff\u0001\u0000\u0000"+
		"\u0000\u09b6\u09b8\u0003\u01bc\u00de\u0000\u09b7\u09b9\u0003\u0202\u0101"+
		"\u0000\u09b8\u09b7\u0001\u0000\u0000\u0000\u09b8\u09b9\u0001\u0000\u0000"+
		"\u0000\u09b9\u0201\u0001\u0000\u0000\u0000\u09ba\u09bc\u0003\u0204\u0102"+
		"\u0000\u09bb\u09ba\u0001\u0000\u0000\u0000\u09bc\u09bd\u0001\u0000\u0000"+
		"\u0000\u09bd\u09bb\u0001\u0000\u0000\u0000\u09bd\u09be\u0001\u0000\u0000"+
		"\u0000\u09be\u0203\u0001\u0000\u0000\u0000\u09bf\u09c0\u0003\u0236\u011b"+
		"\u0000\u09c0\u09c1\u0005\u0092\u0000\u0000\u09c1\u09c2\u0003\u01bc\u00de"+
		"\u0000\u09c2\u0205\u0001\u0000\u0000\u0000\u09c3\u09c5\u0003\u0208\u0104"+
		"\u0000\u09c4\u09c3\u0001\u0000\u0000\u0000\u09c5\u09c6\u0001\u0000\u0000"+
		"\u0000\u09c6\u09c4\u0001\u0000\u0000\u0000\u09c6\u09c7\u0001\u0000\u0000"+
		"\u0000\u09c7\u0207\u0001\u0000\u0000\u0000\u09c8\u09c9\u0003\u0236\u011b"+
		"\u0000\u09c9\u09ca\u0005\u0092\u0000\u0000\u09ca\u0209\u0001\u0000\u0000"+
		"\u0000\u09cb\u09cc\u0006\u0105\uffff\uffff\u0000\u09cc\u09da\u0003\u021a"+
		"\u010d\u0000\u09cd\u09da\u0003\u0224\u0112\u0000\u09ce\u09da\u0003\u0226"+
		"\u0113\u0000\u09cf\u09da\u0003\u0228\u0114\u0000\u09d0\u09da\u0003\u020e"+
		"\u0107\u0000\u09d1\u09da\u0003\u0212\u0109\u0000\u09d2\u09da\u0003\u022c"+
		"\u0116\u0000\u09d3\u09da\u0003\u022e\u0117\u0000\u09d4\u09da\u0003\u0230"+
		"\u0118\u0000\u09d5\u09d6\u0005\u008c\u0000\u0000\u09d6\u09d7\u0003\u020a"+
		"\u0105\u0000\u09d7\u09d8\u0005\u008f\u0000\u0000\u09d8\u09da\u0001\u0000"+
		"\u0000\u0000\u09d9\u09cb\u0001\u0000\u0000\u0000\u09d9\u09cd\u0001\u0000"+
		"\u0000\u0000\u09d9\u09ce\u0001\u0000\u0000\u0000\u09d9\u09cf\u0001\u0000"+
		"\u0000\u0000\u09d9\u09d0\u0001\u0000\u0000\u0000\u09d9\u09d1\u0001\u0000"+
		"\u0000\u0000\u09d9\u09d2\u0001\u0000\u0000\u0000\u09d9\u09d3\u0001\u0000"+
		"\u0000\u0000\u09d9\u09d4\u0001\u0000\u0000\u0000\u09d9\u09d5\u0001\u0000"+
		"\u0000\u0000\u09da\u09e8\u0001\u0000\u0000\u0000\u09db\u09e4\n\u0004\u0000"+
		"\u0000\u09dc\u09dd\u0004\u0105\b\u0000\u09dd\u09e5\u0005\u0098\u0000\u0000"+
		"\u09de\u09df\u0004\u0105\t\u0000\u09df\u09e5\u0005\u0097\u0000\u0000\u09e0"+
		"\u09e1\u0005\u008a\u0000\u0000\u09e1\u09e5\u0005]\u0000\u0000\u09e2\u09e3"+
		"\u0005\u008a\u0000\u0000\u09e3\u09e5\u0005\u001d\u0000\u0000\u09e4\u09dc"+
		"\u0001\u0000\u0000\u0000\u09e4\u09de\u0001\u0000\u0000\u0000\u09e4\u09e0"+
		"\u0001\u0000\u0000\u0000\u09e4\u09e2\u0001\u0000\u0000\u0000\u09e5\u09e7"+
		"\u0001\u0000\u0000\u0000\u09e6\u09db\u0001\u0000\u0000\u0000\u09e7\u09ea"+
		"\u0001\u0000\u0000\u0000\u09e8\u09e6\u0001\u0000\u0000\u0000\u09e8\u09e9"+
		"\u0001\u0000\u0000\u0000\u09e9\u020b\u0001\u0000\u0000\u0000\u09ea\u09e8"+
		"\u0001\u0000\u0000\u0000\u09eb\u09ed\u0005\u0092\u0000\u0000\u09ec\u09ee"+
		"\u0003\u018a\u00c5\u0000\u09ed\u09ec\u0001\u0000\u0000\u0000\u09ed\u09ee"+
		"\u0001\u0000\u0000\u0000\u09ee\u09f0\u0001\u0000\u0000\u0000\u09ef\u09f1"+
		"\u0005[\u0000\u0000\u09f0\u09ef\u0001\u0000\u0000\u0000\u09f0\u09f1\u0001"+
		"\u0000\u0000\u0000\u09f1\u09f2\u0001\u0000\u0000\u0000\u09f2\u09f3\u0003"+
		"\u020a\u0105\u0000\u09f3\u020d\u0001\u0000\u0000\u0000\u09f4\u09f6\u0003"+
		"\u0210\u0108\u0000\u09f5\u09f7\u0003\u0096K\u0000\u09f6\u09f5\u0001\u0000"+
		"\u0000\u0000\u09f6\u09f7\u0001\u0000\u0000\u0000\u09f7\u09fa\u0001\u0000"+
		"\u0000\u0000\u09f8\u09f9\u0005\u008a\u0000\u0000\u09f9\u09fb\u0003\u020e"+
		"\u0107\u0000\u09fa\u09f8\u0001\u0000\u0000\u0000\u09fa\u09fb\u0001\u0000"+
		"\u0000\u0000\u09fb\u020f\u0001\u0000\u0000\u0000\u09fc\u09fd\u0003\u0236"+
		"\u011b\u0000\u09fd\u0211\u0001\u0000\u0000\u0000\u09fe\u0a00\u0005\u008c"+
		"\u0000\u0000\u09ff\u0a01\u0003\u0214\u010a\u0000\u0a00\u09ff\u0001\u0000"+
		"\u0000\u0000\u0a00\u0a01\u0001\u0000\u0000\u0000\u0a01\u0a02\u0001\u0000"+
		"\u0000\u0000\u0a02\u0a03\u0005\u008f\u0000\u0000\u0a03\u0213\u0001\u0000"+
		"\u0000\u0000\u0a04\u0a09\u0003\u0216\u010b\u0000\u0a05\u0a06\u0005\u0091"+
		"\u0000\u0000\u0a06\u0a08\u0003\u0216\u010b\u0000\u0a07\u0a05\u0001\u0000"+
		"\u0000\u0000\u0a08\u0a0b\u0001\u0000\u0000\u0000\u0a09\u0a07\u0001\u0000"+
		"\u0000\u0000\u0a09\u0a0a\u0001\u0000\u0000\u0000\u0a0a\u0215\u0001\u0000"+
		"\u0000\u0000\u0a0b\u0a09\u0001\u0000\u0000\u0000\u0a0c\u0a0d\u0003\u0218"+
		"\u010c\u0000\u0a0d\u0a0e\u0003\u020c\u0106\u0000\u0a0e\u0a11\u0001\u0000"+
		"\u0000\u0000\u0a0f\u0a11\u0003\u020a\u0105\u0000\u0a10\u0a0c\u0001\u0000"+
		"\u0000\u0000\u0a10\u0a0f\u0001\u0000\u0000\u0000\u0a11\u0a14\u0001\u0000"+
		"\u0000\u0000\u0a12\u0a13\u0005\u009c\u0000\u0000\u0a13\u0a15\u0003\u0192"+
		"\u00c9\u0000\u0a14\u0a12\u0001\u0000\u0000\u0000\u0a14\u0a15\u0001\u0000"+
		"\u0000\u0000\u0a15\u0217\u0001\u0000\u0000\u0000\u0a16\u0a18\u0003\u0236"+
		"\u011b\u0000\u0a17\u0a16\u0001\u0000\u0000\u0000\u0a18\u0a19\u0001\u0000"+
		"\u0000\u0000\u0a19\u0a17\u0001\u0000\u0000\u0000\u0a19\u0a1a\u0001\u0000"+
		"\u0000\u0000\u0a1a\u0219\u0001\u0000\u0000\u0000\u0a1b\u0a1d\u0003\u018a"+
		"\u00c5\u0000\u0a1c\u0a1b\u0001\u0000\u0000\u0000\u0a1c\u0a1d\u0001\u0000"+
		"\u0000\u0000\u0a1d\u0a1e\u0001\u0000\u0000\u0000\u0a1e\u0a20\u0003\u021c"+
		"\u010e\u0000\u0a1f\u0a21\u0005\'\u0000\u0000\u0a20\u0a1f\u0001\u0000\u0000"+
		"\u0000\u0a20\u0a21\u0001\u0000\u0000\u0000\u0a21\u0a22\u0001\u0000\u0000"+
		"\u0000\u0a22\u0a23\u0003\u0248\u0124\u0000\u0a23\u0a24\u0003\u020a\u0105"+
		"\u0000\u0a24\u021b\u0001\u0000\u0000\u0000\u0a25\u0a2a\u0005\u008c\u0000"+
		"\u0000\u0a26\u0a28\u0003\u021e\u010f\u0000\u0a27\u0a29\u0003\u024a\u0125"+
		"\u0000\u0a28\u0a27\u0001\u0000\u0000\u0000\u0a28\u0a29\u0001\u0000\u0000"+
		"\u0000\u0a29\u0a2b\u0001\u0000\u0000\u0000\u0a2a\u0a26\u0001\u0000\u0000"+
		"\u0000\u0a2a\u0a2b\u0001\u0000\u0000\u0000\u0a2b\u0a2c\u0001\u0000\u0000"+
		"\u0000\u0a2c\u0a2d\u0005\u008f\u0000\u0000\u0a2d\u021d\u0001\u0000\u0000"+
		"\u0000\u0a2e\u0a33\u0003\u0220\u0110\u0000\u0a2f\u0a30\u0005\u0091\u0000"+
		"\u0000\u0a30\u0a32\u0003\u0220\u0110\u0000\u0a31\u0a2f\u0001\u0000\u0000"+
		"\u0000\u0a32\u0a35\u0001\u0000\u0000\u0000\u0a33\u0a31\u0001\u0000\u0000"+
		"\u0000\u0a33\u0a34\u0001\u0000\u0000\u0000\u0a34\u021f\u0001\u0000\u0000"+
		"\u0000\u0a35\u0a33\u0001\u0000\u0000\u0000\u0a36\u0a38\u0003\u018a\u00c5"+
		"\u0000\u0a37\u0a36\u0001\u0000\u0000\u0000\u0a37\u0a38\u0001\u0000\u0000"+
		"\u0000\u0a38\u0a3a\u0001\u0000\u0000\u0000\u0a39\u0a3b\u0005[\u0000\u0000"+
		"\u0a3a\u0a39\u0001\u0000\u0000\u0000\u0a3a\u0a3b\u0001\u0000\u0000\u0000"+
		"\u0a3b\u0a3c\u0001\u0000\u0000\u0000\u0a3c\u0a41\u0003\u020a\u0105\u0000"+
		"\u0a3d\u0a3e\u0003\u0222\u0111\u0000\u0a3e\u0a3f\u0003\u020c\u0106\u0000"+
		"\u0a3f\u0a41\u0001\u0000\u0000\u0000\u0a40\u0a37\u0001\u0000\u0000\u0000"+
		"\u0a40\u0a3d\u0001\u0000\u0000\u0000\u0a41\u0221\u0001\u0000\u0000\u0000"+
		"\u0a42\u0a44\u0003\u0236\u011b\u0000\u0a43\u0a42\u0001\u0000\u0000\u0000"+
		"\u0a44\u0a45\u0001\u0000\u0000\u0000\u0a45\u0a43\u0001\u0000\u0000\u0000"+
		"\u0a45\u0a46\u0001\u0000\u0000\u0000\u0a46\u0223\u0001\u0000\u0000\u0000"+
		"\u0a47\u0a48\u0005\u008d\u0000\u0000\u0a48\u0a49\u0003\u020a\u0105\u0000"+
		"\u0a49\u0a4a\u0005\u0090\u0000\u0000\u0a4a\u0225\u0001\u0000\u0000\u0000"+
		"\u0a4b\u0a4c\u0005\u008d\u0000\u0000\u0a4c\u0a4d\u0003\u020a\u0105\u0000"+
		"\u0a4d\u0a4e\u0005\u0092\u0000\u0000\u0a4e\u0a4f\u0003\u020a\u0105\u0000"+
		"\u0a4f\u0a50\u0005\u0090\u0000\u0000\u0a50\u0227\u0001\u0000\u0000\u0000"+
		"\u0a51\u0a56\u0003\u020e\u0107\u0000\u0a52\u0a53\u0005\u009a\u0000\u0000"+
		"\u0a53\u0a55\u0003\u020e\u0107\u0000\u0a54\u0a52\u0001\u0000\u0000\u0000"+
		"\u0a55\u0a58\u0001\u0000\u0000\u0000\u0a56\u0a54\u0001\u0000\u0000\u0000"+
		"\u0a56\u0a57\u0001\u0000\u0000\u0000\u0a57\u0a5a\u0001\u0000\u0000\u0000"+
		"\u0a58\u0a56\u0001\u0000\u0000\u0000\u0a59\u0a5b\u0003\u022a\u0115\u0000"+
		"\u0a5a\u0a59\u0001\u0000\u0000\u0000\u0a5a\u0a5b\u0001\u0000\u0000\u0000"+
		"\u0a5b\u0229\u0001\u0000\u0000\u0000\u0a5c\u0a5d\u0004\u0115\n\u0000\u0a5d"+
		"\u0a5e\u0005\u009a\u0000\u0000\u0a5e\u022b\u0001\u0000\u0000\u0000\u0a5f"+
		"\u0a60\u0005\\\u0000\u0000\u0a60\u0a61\u0003\u020a\u0105\u0000\u0a61\u022d"+
		"\u0001\u0000\u0000\u0000\u0a62\u0a63\u0005S\u0000\u0000\u0a63\u022f\u0001"+
		"\u0000\u0000\u0000\u0a64\u0a65\u0005`\u0000\u0000\u0a65\u0231\u0001\u0000"+
		"\u0000\u0000\u0a66\u0a67\u0005\u0092\u0000\u0000\u0a67\u0a68\u0003\u0234"+
		"\u011a\u0000\u0a68\u0233\u0001\u0000\u0000\u0000\u0a69\u0a6e\u0003\u020e"+
		"\u0107\u0000\u0a6a\u0a6b\u0005\u0091\u0000\u0000\u0a6b\u0a6d\u0003\u020e"+
		"\u0107\u0000\u0a6c\u0a6a\u0001\u0000\u0000\u0000\u0a6d\u0a70\u0001\u0000"+
		"\u0000\u0000\u0a6e\u0a6c\u0001\u0000\u0000\u0000\u0a6e\u0a6f\u0001\u0000"+
		"\u0000\u0000\u0a6f\u0235\u0001\u0000\u0000\u0000\u0a70\u0a6e\u0001\u0000"+
		"\u0000\u0000\u0a71\u0a7b\u0007\u0011\u0000\u0000\u0a72\u0a7b\u0005\u0089"+
		"\u0000\u0000\u0a73\u0a77\u0005\u00a5\u0000\u0000\u0a74\u0a78\u0003\u023a"+
		"\u011d\u0000\u0a75\u0a78\u0005\u0089\u0000\u0000\u0a76\u0a78\u0005\u00a6"+
		"\u0000\u0000\u0a77\u0a74\u0001\u0000\u0000\u0000\u0a77\u0a75\u0001\u0000"+
		"\u0000\u0000\u0a77\u0a76\u0001\u0000\u0000\u0000\u0a78\u0a79\u0001\u0000"+
		"\u0000\u0000\u0a79\u0a7b\u0005\u00a5\u0000\u0000\u0a7a\u0a71\u0001\u0000"+
		"\u0000\u0000\u0a7a\u0a72\u0001\u0000\u0000\u0000\u0a7a\u0a73\u0001\u0000"+
		"\u0000\u0000\u0a7b\u0237\u0001\u0000\u0000\u0000\u0a7c\u0a81\u0003\u0236"+
		"\u011b\u0000\u0a7d\u0a7e\u0005\u0091\u0000\u0000\u0a7e\u0a80\u0003\u0236"+
		"\u011b\u0000\u0a7f\u0a7d\u0001\u0000\u0000\u0000\u0a80\u0a83\u0001\u0000"+
		"\u0000\u0000\u0a81\u0a7f\u0001\u0000\u0000\u0000\u0a81\u0a82\u0001\u0000"+
		"\u0000\u0000\u0a82\u0239\u0001\u0000\u0000\u0000\u0a83\u0a81\u0001\u0000"+
		"\u0000\u0000\u0a84\u0a85\u0007\u0012\u0000\u0000\u0a85\u023b\u0001\u0000"+
		"\u0000\u0000\u0a86\u0a87\u0004\u011e\u000b\u0000\u0a87\u0a88\u0005\u009c"+
		"\u0000\u0000\u0a88\u023d\u0001\u0000\u0000\u0000\u0a89\u0a8a\u0004\u011f"+
		"\f\u0000\u0a8a\u0a8b\u0005\u009b\u0000\u0000\u0a8b\u023f\u0001\u0000\u0000"+
		"\u0000\u0a8c\u0a8d\u0004\u0120\r\u0000\u0a8d\u0a8e\u0005\u009a\u0000\u0000"+
		"\u0a8e\u0a8f\u0005\u009a\u0000\u0000\u0a8f\u0241\u0001\u0000\u0000\u0000"+
		"\u0a90\u0a91\u0004\u0121\u000e\u0000\u0a91\u0a92\u0005\u009d\u0000\u0000"+
		"\u0a92\u0a93\u0005\u009d\u0000\u0000\u0a93\u0243\u0001\u0000\u0000\u0000"+
		"\u0a94\u0a95\u0004\u0122\u000f\u0000\u0a95\u0a96\u0005\u0095\u0000\u0000"+
		"\u0a96\u0a97\u0005\u009c\u0000\u0000\u0a97\u0245\u0001\u0000\u0000\u0000"+
		"\u0a98\u0a99\u0004\u0123\u0010\u0000\u0a99\u0a9a\u0005\u0094\u0000\u0000"+
		"\u0a9a\u0247\u0001\u0000\u0000\u0000\u0a9b\u0a9c\u0004\u0124\u0011\u0000"+
		"\u0a9c\u0a9d\u0005\u009b\u0000\u0000\u0a9d\u0a9e\u0005\u0095\u0000\u0000"+
		"\u0a9e\u0249\u0001\u0000\u0000\u0000\u0a9f\u0aa0\u0004\u0125\u0012\u0000"+
		"\u0aa0\u0aa1\u0005\u008a\u0000\u0000\u0aa1\u0aa2\u0005\u008a\u0000\u0000"+
		"\u0aa2\u0aa3\u0005\u008a\u0000\u0000\u0aa3\u024b\u0001\u0000\u0000\u0000"+
		"\u0aa4\u0aa5\u0004\u0126\u0013\u0000\u0aa5\u0aa6\u0005\u009c\u0000\u0000"+
		"\u0aa6\u0aa7\u0005\u009c\u0000\u0000\u0aa7\u024d\u0001\u0000\u0000\u0000"+
		"\u0aa8\u0aa9\u0004\u0127\u0014\u0000\u0aa9\u0aaa\u0003\u0254\u012a\u0000"+
		"\u0aaa\u024f\u0001\u0000\u0000\u0000\u0aab\u0aac\u0004\u0128\u0015\u0000"+
		"\u0aac\u0aad\u0003\u0254\u012a\u0000\u0aad\u0251\u0001\u0000\u0000\u0000"+
		"\u0aae\u0aaf\u0004\u0129\u0016\u0000\u0aaf\u0ab0\u0003\u0254\u012a\u0000"+
		"\u0ab0\u0253\u0001\u0000\u0000\u0000\u0ab1\u0ab3\u0003\u0256\u012b\u0000"+
		"\u0ab2\u0ab4\u0003\u025a\u012d\u0000\u0ab3\u0ab2\u0001\u0000\u0000\u0000"+
		"\u0ab3\u0ab4\u0001\u0000\u0000\u0000\u0ab4\u0ab9\u0001\u0000\u0000\u0000"+
		"\u0ab5\u0ab6\u0003\u025c\u012e\u0000\u0ab6\u0ab7\u0003\u0260\u0130\u0000"+
		"\u0ab7\u0ab9\u0001\u0000\u0000\u0000\u0ab8\u0ab1\u0001\u0000\u0000\u0000"+
		"\u0ab8\u0ab5\u0001\u0000\u0000\u0000\u0ab9\u0255\u0001\u0000\u0000\u0000"+
		"\u0aba\u0abd\u0007\u0013\u0000\u0000\u0abb\u0abd\u0005\u00a8\u0000\u0000"+
		"\u0abc\u0aba\u0001\u0000\u0000\u0000\u0abc\u0abb\u0001\u0000\u0000\u0000"+
		"\u0abd\u0257\u0001\u0000\u0000\u0000\u0abe\u0ac1\u0003\u0256\u012b\u0000"+
		"\u0abf\u0ac1\u0005\u00a9\u0000\u0000\u0ac0\u0abe\u0001\u0000\u0000\u0000"+
		"\u0ac0\u0abf\u0001\u0000\u0000\u0000\u0ac1\u0259\u0001\u0000\u0000\u0000"+
		"\u0ac2\u0ac3\u0004\u012d\u0017\u0000\u0ac3\u0ac5\u0003\u0258\u012c\u0000"+
		"\u0ac4\u0ac2\u0001\u0000\u0000\u0000\u0ac5\u0ac6\u0001\u0000\u0000\u0000"+
		"\u0ac6\u0ac4\u0001\u0000\u0000\u0000\u0ac6\u0ac7\u0001\u0000\u0000\u0000"+
		"\u0ac7\u025b\u0001\u0000\u0000\u0000\u0ac8\u0ac9\u0005\u008a\u0000\u0000"+
		"\u0ac9\u025d\u0001\u0000\u0000\u0000\u0aca\u0acd\u0005\u008a\u0000\u0000"+
		"\u0acb\u0acd\u0003\u0258\u012c\u0000\u0acc\u0aca\u0001\u0000\u0000\u0000"+
		"\u0acc\u0acb\u0001\u0000\u0000\u0000\u0acd\u025f\u0001\u0000\u0000\u0000"+
		"\u0ace\u0acf\u0004\u0130\u0018\u0000\u0acf\u0ad1\u0003\u025e\u012f\u0000"+
		"\u0ad0\u0ace\u0001\u0000\u0000\u0000\u0ad1\u0ad2\u0001\u0000\u0000\u0000"+
		"\u0ad2\u0ad0\u0001\u0000\u0000\u0000\u0ad2\u0ad3\u0001\u0000\u0000\u0000"+
		"\u0ad3\u0261\u0001\u0000\u0000\u0000\u0ad4\u0ad9\u0003\u0264\u0132\u0000"+
		"\u0ad5\u0ad9\u0003\u026c\u0136\u0000\u0ad6\u0ad9\u0003\u0266\u0133\u0000"+
		"\u0ad7\u0ad9\u0003\u0268\u0134\u0000\u0ad8\u0ad4\u0001\u0000\u0000\u0000"+
		"\u0ad8\u0ad5\u0001\u0000\u0000\u0000\u0ad8\u0ad6\u0001\u0000\u0000\u0000"+
		"\u0ad8\u0ad7\u0001\u0000\u0000\u0000\u0ad9\u0263\u0001\u0000\u0000\u0000"+
		"\u0ada\u0adc\u0003\u023e\u011f\u0000\u0adb\u0ada\u0001\u0000\u0000\u0000"+
		"\u0adb\u0adc\u0001\u0000\u0000\u0000\u0adc\u0add\u0001\u0000\u0000\u0000"+
		"\u0add\u0ae3\u0003\u026a\u0135\u0000\u0ade\u0ae0\u0003\u023e\u011f\u0000"+
		"\u0adf\u0ade\u0001\u0000\u0000\u0000\u0adf\u0ae0\u0001\u0000\u0000\u0000"+
		"\u0ae0\u0ae1\u0001\u0000\u0000\u0000\u0ae1\u0ae3\u0005\u00af\u0000\u0000"+
		"\u0ae2\u0adb\u0001\u0000\u0000\u0000\u0ae2\u0adf\u0001\u0000\u0000\u0000"+
		"\u0ae3\u0265\u0001\u0000\u0000\u0000\u0ae4\u0ae5\u0007\u0014\u0000\u0000"+
		"\u0ae5\u0267\u0001\u0000\u0000\u0000\u0ae6\u0ae7\u0005Z\u0000\u0000\u0ae7"+
		"\u0269\u0001\u0000\u0000\u0000\u0ae8\u0ae9\u0007\u0015\u0000\u0000\u0ae9"+
		"\u026b\u0001\u0000\u0000\u0000\u0aea\u0aee\u0003\u026e\u0137\u0000\u0aeb"+
		"\u0aee\u0003\u0272\u0139\u0000\u0aec\u0aee\u0003\u0270\u0138\u0000\u0aed"+
		"\u0aea\u0001\u0000\u0000\u0000\u0aed\u0aeb\u0001\u0000\u0000\u0000\u0aed"+
		"\u0aec\u0001\u0000\u0000\u0000\u0aee\u026d\u0001\u0000\u0000\u0000\u0aef"+
		"\u0af1\u0005\u00b4\u0000\u0000\u0af0\u0af2\u0005\u00c1\u0000\u0000\u0af1"+
		"\u0af0\u0001\u0000\u0000\u0000\u0af2\u0af3\u0001\u0000\u0000\u0000\u0af3"+
		"\u0af1\u0001\u0000\u0000\u0000\u0af3\u0af4\u0001\u0000\u0000\u0000\u0af4"+
		"\u0af5\u0001\u0000\u0000\u0000\u0af5\u0afe\u0005\u00c0\u0000\u0000\u0af6"+
		"\u0af8\u0005\u00b5\u0000\u0000\u0af7\u0af9\u0005\u00bf\u0000\u0000\u0af8"+
		"\u0af7\u0001\u0000\u0000\u0000\u0af9\u0afa\u0001\u0000\u0000\u0000\u0afa"+
		"\u0af8\u0001\u0000\u0000\u0000\u0afa\u0afb\u0001\u0000\u0000\u0000\u0afb"+
		"\u0afc\u0001\u0000\u0000\u0000\u0afc\u0afe\u0005\u00be\u0000\u0000\u0afd"+
		"\u0aef\u0001\u0000\u0000\u0000\u0afd\u0af6\u0001\u0000\u0000\u0000\u0afe"+
		"\u026f\u0001\u0000\u0000\u0000\u0aff\u0b03\u0005\u00b7\u0000\u0000\u0b00"+
		"\u0b02\u0005\u00ba\u0000\u0000\u0b01\u0b00\u0001\u0000\u0000\u0000\u0b02"+
		"\u0b05\u0001\u0000\u0000\u0000\u0b03\u0b01\u0001\u0000\u0000\u0000\u0b03"+
		"\u0b04\u0001\u0000\u0000\u0000\u0b04\u0b06\u0001\u0000\u0000\u0000\u0b05"+
		"\u0b03\u0001\u0000\u0000\u0000\u0b06\u0b10\u0005\u00b9\u0000\u0000\u0b07"+
		"\u0b0b\u0005\u00b6\u0000\u0000\u0b08\u0b0a\u0005\u00bd\u0000\u0000\u0b09"+
		"\u0b08\u0001\u0000\u0000\u0000\u0b0a\u0b0d\u0001\u0000\u0000\u0000\u0b0b"+
		"\u0b09\u0001\u0000\u0000\u0000\u0b0b\u0b0c\u0001\u0000\u0000\u0000\u0b0c"+
		"\u0b0e\u0001\u0000\u0000\u0000\u0b0d\u0b0b\u0001\u0000\u0000\u0000\u0b0e"+
		"\u0b10\u0005\u00bc\u0000\u0000\u0b0f\u0aff\u0001\u0000\u0000\u0000\u0b0f"+
		"\u0b07\u0001\u0000\u0000\u0000\u0b10\u0271\u0001\u0000\u0000\u0000\u0b11"+
		"\u0b1f\u0005\u00b7\u0000\u0000\u0b12\u0b1e\u0005\u00ba\u0000\u0000\u0b13"+
		"\u0b19\u0005\u00b8\u0000\u0000\u0b14\u0b1a\u0003\u0192\u00c9\u0000\u0b15"+
		"\u0b16\u0003\u01d8\u00ec\u0000\u0b16\u0b17\u0005\u0091\u0000\u0000\u0b17"+
		"\u0b18\u0003\u01d6\u00eb\u0000\u0b18\u0b1a\u0001\u0000\u0000\u0000\u0b19"+
		"\u0b14\u0001\u0000\u0000\u0000\u0b19\u0b15\u0001\u0000\u0000\u0000\u0b1a"+
		"\u0b1b\u0001\u0000\u0000\u0000\u0b1b\u0b1c\u0005\u008f\u0000\u0000\u0b1c"+
		"\u0b1e\u0001\u0000\u0000\u0000\u0b1d\u0b12\u0001\u0000\u0000\u0000\u0b1d"+
		"\u0b13\u0001\u0000\u0000\u0000\u0b1e\u0b21\u0001\u0000\u0000\u0000\u0b1f"+
		"\u0b1d\u0001\u0000\u0000\u0000\u0b1f\u0b20\u0001\u0000\u0000\u0000\u0b20"+
		"\u0b22\u0001\u0000\u0000\u0000\u0b21\u0b1f\u0001\u0000\u0000\u0000\u0b22"+
		"\u0b36\u0005\u00b9\u0000\u0000\u0b23\u0b31\u0005\u00b6\u0000\u0000\u0b24"+
		"\u0b30\u0005\u00bd\u0000\u0000\u0b25\u0b2b\u0005\u00bb\u0000\u0000\u0b26"+
		"\u0b2c\u0003\u0192\u00c9\u0000\u0b27\u0b28\u0003\u01d8\u00ec\u0000\u0b28"+
		"\u0b29\u0005\u0091\u0000\u0000\u0b29\u0b2a\u0003\u01d6\u00eb\u0000\u0b2a"+
		"\u0b2c\u0001\u0000\u0000\u0000\u0b2b\u0b26\u0001\u0000\u0000\u0000\u0b2b"+
		"\u0b27\u0001\u0000\u0000\u0000\u0b2c\u0b2d\u0001\u0000\u0000\u0000\u0b2d"+
		"\u0b2e\u0005\u008f\u0000\u0000\u0b2e\u0b30\u0001\u0000\u0000\u0000\u0b2f"+
		"\u0b24\u0001\u0000\u0000\u0000\u0b2f\u0b25\u0001\u0000\u0000\u0000\u0b30"+
		"\u0b33\u0001\u0000\u0000\u0000\u0b31\u0b2f\u0001\u0000\u0000\u0000\u0b31"+
		"\u0b32\u0001\u0000\u0000\u0000\u0b32\u0b34\u0001\u0000\u0000\u0000\u0b33"+
		"\u0b31\u0001\u0000\u0000\u0000\u0b34\u0b36\u0005\u00bc\u0000\u0000\u0b35"+
		"\u0b11\u0001\u0000\u0000\u0000\u0b35\u0b23\u0001\u0000\u0000\u0000\u0b36"+
		"\u0273\u0001\u0000\u0000\u0000\u0165\u0275\u0281\u0284\u0287\u028f\u0294"+
		"\u0298\u029e\u02ab\u02b2\u02c4\u02ca\u02d0\u02db\u02e1\u02e5\u02ea\u02ed"+
		"\u02f5\u02fa\u02fe\u0302\u030e\u0311\u0318\u031c\u0321\u0325\u032c\u0338"+
		"\u033c\u0340\u0346\u0351\u0356\u035a\u0365\u036a\u036f\u0373\u0376\u037d"+
		"\u0382\u0387\u038b\u0397\u039c\u03a2\u03b3\u03c2\u03c6\u03cb\u03d6\u03e5"+
		"\u03fe\u0405\u040e\u0410\u041b\u0422\u0424\u042e\u0433\u0439\u043f\u044a"+
		"\u045e\u0461\u0466\u0469\u046d\u0472\u0476\u0481\u0486\u0489\u048c\u0496"+
		"\u049b\u04a9\u04ac\u04ae\u04b1\u04b4\u04b7\u04c0\u04c5\u04ca\u04cd\u04d0"+
		"\u04d4\u04d7\u04da\u04de\u04e1\u04ea\u04ef\u04f4\u04f7\u04fc\u04ff\u0506"+
		"\u050a\u050c\u0511\u0515\u051a\u051e\u0523\u0526\u052b\u0537\u053b\u053e"+
		"\u0541\u0544\u054a\u054e\u0551\u0554\u0558\u0560\u0569\u056d\u0570\u0575"+
		"\u0578\u0582\u0585\u0589\u058c\u0591\u0594\u0597\u059b\u05a2\u05a7\u05aa"+
		"\u05ad\u05b7\u05c1\u05c3\u05cc\u05d0\u05d9\u05de\u05e1\u05eb\u05f0\u05f8"+
		"\u05fb\u05fe\u0603\u0606\u0609\u0616\u061b\u061e\u0621\u0624\u0628\u062a"+
		"\u062f\u0632\u0635\u0642\u0647\u064a\u064d\u0654\u0657\u0664\u0669\u0671"+
		"\u067b\u067f\u0683\u0687\u068a\u068d\u0692\u0697\u069a\u069f\u06a2\u06a5"+
		"\u06a9\u06ad\u06b0\u06b5\u06b8\u06bc\u06c1\u06c7\u06ca\u06cf\u06d2\u06dd"+
		"\u06e2\u06e7\u06ec\u06ef\u06f2\u06f6\u06fc\u0703\u0711\u071a\u0721\u0726"+
		"\u0739\u0741\u0754\u0759\u075e\u0764\u076c\u076f\u0777\u077e\u0789\u078d"+
		"\u0796\u079c\u07a1\u07a6\u07b0\u07b7\u07bc\u07c3\u07c8\u07cc\u07d1\u07d6"+
		"\u07de\u07e6\u07e9\u07ed\u07f4\u07f8\u07fc\u0803\u080a\u080d\u0812\u0817"+
		"\u0820\u0822\u0828\u0838\u083f\u084c\u0850\u0859\u085d\u0864\u086d\u0871"+
		"\u0898\u08a6\u08b3\u08b7\u08ba\u08bf\u08c3\u08c6\u08cd\u08d1\u08d5\u08dc"+
		"\u08e2\u08e4\u08ef\u08f3\u08f7\u08fc\u0903\u0905\u090a\u090e\u0920\u0927"+
		"\u092d\u0935\u093f\u0944\u0947\u094c\u0955\u095b\u096d\u096f\u0975\u0979"+
		"\u097d\u0985\u098f\u0991\u09a2\u09ab\u09af\u09b4\u09b8\u09bd\u09c6\u09d9"+
		"\u09e4\u09e8\u09ed\u09f0\u09f6\u09fa\u0a00\u0a09\u0a10\u0a14\u0a19\u0a1c"+
		"\u0a20\u0a28\u0a2a\u0a33\u0a37\u0a3a\u0a40\u0a45\u0a56\u0a5a\u0a6e\u0a77"+
		"\u0a7a\u0a81\u0ab3\u0ab8\u0abc\u0ac0\u0ac6\u0acc\u0ad2\u0ad8\u0adb\u0adf"+
		"\u0ae2\u0aed\u0af3\u0afa\u0afd\u0b03\u0b0b\u0b0f\u0b19\u0b1d\u0b1f\u0b2b"+
		"\u0b2f\u0b31\u0b35";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}