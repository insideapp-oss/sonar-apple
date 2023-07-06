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
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ObjectiveCPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO=1, BREAK=2, CASE=3, CHAR=4, CONST=5, CONTINUE=6, DEFAULT=7, DO=8, 
		DOUBLE=9, ELSE=10, ENUM=11, EXTERN=12, FLOAT=13, FOR=14, GOTO=15, IF=16, 
		INLINE=17, INT=18, LONG=19, REGISTER=20, RESTRICT=21, RETURN=22, SHORT=23, 
		SIGNED=24, SIZEOF=25, STATIC=26, STRUCT=27, SWITCH=28, TYPEDEF=29, UNION=30, 
		UNSIGNED=31, VOID=32, VOLATILE=33, WHILE=34, BOOL_=35, COMPLEX=36, IMAGINERY=37, 
		TRUE=38, FALSE=39, BOOL=40, Class=41, BYCOPY=42, BYREF=43, ID=44, IMP=45, 
		IN=46, INOUT=47, NIL=48, NO=49, NULL_=50, ONEWAY=51, OUT=52, PROTOCOL_=53, 
		SEL=54, SELF=55, SUPER=56, YES=57, AUTORELEASEPOOL=58, CATCH=59, CLASS=60, 
		DYNAMIC=61, ENCODE=62, END=63, FINALLY=64, IMPLEMENTATION=65, INTERFACE=66, 
		IMPORT=67, PACKAGE=68, PROTOCOL=69, OPTIONAL=70, PRIVATE=71, PROPERTY=72, 
		PROTECTED=73, PUBLIC=74, REQUIRED=75, SELECTOR=76, SYNCHRONIZED=77, SYNTHESIZE=78, 
		THROW=79, TRY=80, ATOMIC=81, NONATOMIC=82, RETAIN=83, ATTRIBUTE=84, AUTORELEASING_QUALIFIER=85, 
		BLOCK=86, BRIDGE=87, BRIDGE_RETAINED=88, BRIDGE_TRANSFER=89, COVARIANT=90, 
		CONTRAVARIANT=91, DEPRECATED=92, KINDOF=93, STRONG_QUALIFIER=94, TYPEOF=95, 
		UNSAFE_UNRETAINED_QUALIFIER=96, UNUSED=97, WEAK_QUALIFIER=98, NULL_UNSPECIFIED=99, 
		NULLABLE=100, NONNULL=101, NULL_RESETTABLE=102, NS_INLINE=103, NS_ENUM=104, 
		NS_OPTIONS=105, ASSIGN=106, COPY=107, GETTER=108, SETTER=109, STRONG=110, 
		READONLY=111, READWRITE=112, WEAK=113, UNSAFE_UNRETAINED=114, IB_OUTLET=115, 
		IB_OUTLET_COLLECTION=116, IB_INSPECTABLE=117, IB_DESIGNABLE=118, NS_ASSUME_NONNULL_BEGIN=119, 
		NS_ASSUME_NONNULL_END=120, EXTERN_SUFFIX=121, IOS_SUFFIX=122, MAC_SUFFIX=123, 
		TVOS_PROHIBITED=124, IDENTIFIER=125, LP=126, RP=127, LBRACE=128, RBRACE=129, 
		LBRACK=130, RBRACK=131, SEMI=132, COMMA=133, DOT=134, STRUCTACCESS=135, 
		AT=136, ASSIGNMENT=137, GT=138, LT=139, BANG=140, TILDE=141, QUESTION=142, 
		COLON=143, EQUAL=144, LE=145, GE=146, NOTEQUAL=147, AND=148, OR=149, INC=150, 
		DEC=151, ADD=152, SUB=153, MUL=154, DIV=155, BITAND=156, BITOR=157, BITXOR=158, 
		MOD=159, ADD_ASSIGN=160, SUB_ASSIGN=161, MUL_ASSIGN=162, DIV_ASSIGN=163, 
		AND_ASSIGN=164, OR_ASSIGN=165, XOR_ASSIGN=166, MOD_ASSIGN=167, LSHIFT_ASSIGN=168, 
		RSHIFT_ASSIGN=169, ELIPSIS=170, CHARACTER_LITERAL=171, STRING_START=172, 
		HEX_LITERAL=173, OCTAL_LITERAL=174, BINARY_LITERAL=175, DECIMAL_LITERAL=176, 
		FLOATING_POINT_LITERAL=177, WS=178, MULTI_COMMENT=179, SINGLE_COMMENT=180, 
		BACKSLASH=181, SHARP=182, STRING_NEWLINE=183, STRING_END=184, STRING_VALUE=185, 
		DIRECTIVE_IMPORT=186, DIRECTIVE_INCLUDE=187, DIRECTIVE_PRAGMA=188, DIRECTIVE_DEFINE=189, 
		DIRECTIVE_DEFINED=190, DIRECTIVE_IF=191, DIRECTIVE_ELIF=192, DIRECTIVE_ELSE=193, 
		DIRECTIVE_UNDEF=194, DIRECTIVE_IFDEF=195, DIRECTIVE_IFNDEF=196, DIRECTIVE_ENDIF=197, 
		DIRECTIVE_TRUE=198, DIRECTIVE_FALSE=199, DIRECTIVE_ERROR=200, DIRECTIVE_WARNING=201, 
		DIRECTIVE_BANG=202, DIRECTIVE_LP=203, DIRECTIVE_RP=204, DIRECTIVE_EQUAL=205, 
		DIRECTIVE_NOTEQUAL=206, DIRECTIVE_AND=207, DIRECTIVE_OR=208, DIRECTIVE_LT=209, 
		DIRECTIVE_GT=210, DIRECTIVE_LE=211, DIRECTIVE_GE=212, DIRECTIVE_STRING=213, 
		DIRECTIVE_ID=214, DIRECTIVE_DECIMAL_LITERAL=215, DIRECTIVE_FLOAT=216, 
		DIRECTIVE_NEWLINE=217, DIRECTIVE_MULTI_COMMENT=218, DIRECTIVE_SINGLE_COMMENT=219, 
		DIRECTIVE_BACKSLASH_NEWLINE=220, DIRECTIVE_TEXT_NEWLINE=221, DIRECTIVE_TEXT=222;
	public static final int
		RULE_directive = 0, RULE_directiveText = 1, RULE_preprocessorExpression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"directive", "directiveText", "preprocessorExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", null, "'enum'", "'extern'", "'float'", 
			"'for'", "'goto'", null, "'inline'", "'int'", "'long'", "'register'", 
			"'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
			"'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", "'void'", 
			"'volatile'", "'while'", "'_Bool'", "'_Complex'", "'_Imaginery'", "'true'", 
			"'false'", "'BOOL'", "'Class'", "'bycopy'", "'byref'", "'id'", "'IMP'", 
			"'in'", "'inout'", "'nil'", "'NO'", "'NULL'", "'oneway'", "'out'", "'Protocol'", 
			"'SEL'", "'self'", "'super'", "'YES'", "'@autoreleasepool'", "'@catch'", 
			"'@class'", "'@dynamic'", "'@encode'", "'@end'", "'@finally'", "'@implementation'", 
			"'@interface'", "'@import'", "'@package'", "'@protocol'", "'@optional'", 
			"'@private'", "'@property'", "'@protected'", "'@public'", "'@required'", 
			"'@selector'", "'@synchronized'", "'@synthesize'", "'@throw'", "'@try'", 
			"'atomic'", "'nonatomic'", "'retain'", "'__attribute__'", "'__autoreleasing'", 
			"'__block'", "'__bridge'", "'__bridge_retained'", "'__bridge_transfer'", 
			"'__covariant'", "'__contravariant'", "'__deprecated'", "'__kindof'", 
			"'__strong'", null, "'__unsafe_unretained'", "'__unused'", "'__weak'", 
			null, null, null, "'null_resettable'", "'NS_INLINE'", "'NS_ENUM'", "'NS_OPTIONS'", 
			"'assign'", "'copy'", "'getter'", "'setter'", "'strong'", "'readonly'", 
			"'readwrite'", "'weak'", "'unsafe_unretained'", "'IBOutlet'", "'IBOutletCollection'", 
			"'IBInspectable'", "'IB_DESIGNABLE'", null, null, null, null, null, "'__TVOS_PROHIBITED'", 
			null, null, null, "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", 
			"'@'", "'='", null, null, null, "'~'", "'?'", "':'", null, null, null, 
			null, null, null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
			"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
			"'^='", "'%='", "'<<='", "'>>='", "'...'", null, null, null, null, null, 
			null, null, null, null, null, "'\\'", null, null, null, null, null, null, 
			null, null, "'defined'", null, "'elif'", null, "'undef'", "'ifdef'", 
			"'ifndef'", "'endif'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", "GOTO", "IF", 
			"INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", "SHORT", "SIGNED", 
			"SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", "UNION", "UNSIGNED", 
			"VOID", "VOLATILE", "WHILE", "BOOL_", "COMPLEX", "IMAGINERY", "TRUE", 
			"FALSE", "BOOL", "Class", "BYCOPY", "BYREF", "ID", "IMP", "IN", "INOUT", 
			"NIL", "NO", "NULL_", "ONEWAY", "OUT", "PROTOCOL_", "SEL", "SELF", "SUPER", 
			"YES", "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", 
			"FINALLY", "IMPLEMENTATION", "INTERFACE", "IMPORT", "PACKAGE", "PROTOCOL", 
			"OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "REQUIRED", 
			"SELECTOR", "SYNCHRONIZED", "SYNTHESIZE", "THROW", "TRY", "ATOMIC", "NONATOMIC", 
			"RETAIN", "ATTRIBUTE", "AUTORELEASING_QUALIFIER", "BLOCK", "BRIDGE", 
			"BRIDGE_RETAINED", "BRIDGE_TRANSFER", "COVARIANT", "CONTRAVARIANT", "DEPRECATED", 
			"KINDOF", "STRONG_QUALIFIER", "TYPEOF", "UNSAFE_UNRETAINED_QUALIFIER", 
			"UNUSED", "WEAK_QUALIFIER", "NULL_UNSPECIFIED", "NULLABLE", "NONNULL", 
			"NULL_RESETTABLE", "NS_INLINE", "NS_ENUM", "NS_OPTIONS", "ASSIGN", "COPY", 
			"GETTER", "SETTER", "STRONG", "READONLY", "READWRITE", "WEAK", "UNSAFE_UNRETAINED", 
			"IB_OUTLET", "IB_OUTLET_COLLECTION", "IB_INSPECTABLE", "IB_DESIGNABLE", 
			"NS_ASSUME_NONNULL_BEGIN", "NS_ASSUME_NONNULL_END", "EXTERN_SUFFIX", 
			"IOS_SUFFIX", "MAC_SUFFIX", "TVOS_PROHIBITED", "IDENTIFIER", "LP", "RP", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "STRUCTACCESS", 
			"AT", "ASSIGNMENT", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
			"MUL", "DIV", "BITAND", "BITOR", "BITXOR", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "ELIPSIS", "CHARACTER_LITERAL", 
			"STRING_START", "HEX_LITERAL", "OCTAL_LITERAL", "BINARY_LITERAL", "DECIMAL_LITERAL", 
			"FLOATING_POINT_LITERAL", "WS", "MULTI_COMMENT", "SINGLE_COMMENT", "BACKSLASH", 
			"SHARP", "STRING_NEWLINE", "STRING_END", "STRING_VALUE", "DIRECTIVE_IMPORT", 
			"DIRECTIVE_INCLUDE", "DIRECTIVE_PRAGMA", "DIRECTIVE_DEFINE", "DIRECTIVE_DEFINED", 
			"DIRECTIVE_IF", "DIRECTIVE_ELIF", "DIRECTIVE_ELSE", "DIRECTIVE_UNDEF", 
			"DIRECTIVE_IFDEF", "DIRECTIVE_IFNDEF", "DIRECTIVE_ENDIF", "DIRECTIVE_TRUE", 
			"DIRECTIVE_FALSE", "DIRECTIVE_ERROR", "DIRECTIVE_WARNING", "DIRECTIVE_BANG", 
			"DIRECTIVE_LP", "DIRECTIVE_RP", "DIRECTIVE_EQUAL", "DIRECTIVE_NOTEQUAL", 
			"DIRECTIVE_AND", "DIRECTIVE_OR", "DIRECTIVE_LT", "DIRECTIVE_GT", "DIRECTIVE_LE", 
			"DIRECTIVE_GE", "DIRECTIVE_STRING", "DIRECTIVE_ID", "DIRECTIVE_DECIMAL_LITERAL", 
			"DIRECTIVE_FLOAT", "DIRECTIVE_NEWLINE", "DIRECTIVE_MULTI_COMMENT", "DIRECTIVE_SINGLE_COMMENT", 
			"DIRECTIVE_BACKSLASH_NEWLINE", "DIRECTIVE_TEXT_NEWLINE", "DIRECTIVE_TEXT"
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
	public String getGrammarFileName() { return "ObjectiveCPreprocessorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectiveCPreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorDefContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_IFDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IFDEF, 0); }
		public TerminalNode DIRECTIVE_ID() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ID, 0); }
		public TerminalNode DIRECTIVE_IFNDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IFNDEF, 0); }
		public TerminalNode DIRECTIVE_UNDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_UNDEF, 0); }
		public PreprocessorDefContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorErrorContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_ERROR() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ERROR, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public PreprocessorErrorContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorError(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorConditionalContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_IF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IF, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_ELIF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ELIF, 0); }
		public TerminalNode DIRECTIVE_ELSE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ELSE, 0); }
		public TerminalNode DIRECTIVE_ENDIF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ENDIF, 0); }
		public PreprocessorConditionalContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditional(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorImportContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public TerminalNode DIRECTIVE_IMPORT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IMPORT, 0); }
		public TerminalNode DIRECTIVE_INCLUDE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_INCLUDE, 0); }
		public PreprocessorImportContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorImport(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorPragmaContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_PRAGMA() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_PRAGMA, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public PreprocessorPragmaContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorPragma(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorDefineContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_DEFINE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DEFINE, 0); }
		public TerminalNode DIRECTIVE_ID() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ID, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public PreprocessorDefineContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDefine(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorWarningContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_WARNING() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_WARNING, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public PreprocessorWarningContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorWarning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorWarning(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_directive);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PreprocessorImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(SHARP);
				setState(7);
				_la = _input.LA(1);
				if ( !(_la==DIRECTIVE_IMPORT || _la==DIRECTIVE_INCLUDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(8);
				directiveText();
				}
				break;
			case 2:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(SHARP);
				setState(10);
				match(DIRECTIVE_IF);
				setState(11);
				preprocessorExpression(0);
				}
				break;
			case 3:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(SHARP);
				setState(13);
				match(DIRECTIVE_ELIF);
				setState(14);
				preprocessorExpression(0);
				}
				break;
			case 4:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(SHARP);
				setState(16);
				match(DIRECTIVE_ELSE);
				}
				break;
			case 5:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				match(SHARP);
				setState(18);
				match(DIRECTIVE_ENDIF);
				}
				break;
			case 6:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(19);
				match(SHARP);
				setState(20);
				match(DIRECTIVE_IFDEF);
				setState(21);
				match(DIRECTIVE_ID);
				}
				break;
			case 7:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				match(SHARP);
				setState(23);
				match(DIRECTIVE_IFNDEF);
				setState(24);
				match(DIRECTIVE_ID);
				}
				break;
			case 8:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(25);
				match(SHARP);
				setState(26);
				match(DIRECTIVE_UNDEF);
				setState(27);
				match(DIRECTIVE_ID);
				}
				break;
			case 9:
				_localctx = new PreprocessorPragmaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
				match(SHARP);
				setState(29);
				match(DIRECTIVE_PRAGMA);
				setState(30);
				directiveText();
				}
				break;
			case 10:
				_localctx = new PreprocessorErrorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				match(SHARP);
				setState(32);
				match(DIRECTIVE_ERROR);
				setState(33);
				directiveText();
				}
				break;
			case 11:
				_localctx = new PreprocessorWarningContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(34);
				match(SHARP);
				setState(35);
				match(DIRECTIVE_WARNING);
				setState(36);
				directiveText();
				}
				break;
			case 12:
				_localctx = new PreprocessorDefineContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(37);
				match(SHARP);
				setState(38);
				match(DIRECTIVE_DEFINE);
				setState(39);
				match(DIRECTIVE_ID);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIRECTIVE_TEXT_NEWLINE || _la==DIRECTIVE_TEXT) {
					{
					setState(40);
					directiveText();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveTextContext extends ParserRuleContext {
		public List<TerminalNode> DIRECTIVE_TEXT() { return getTokens(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT); }
		public TerminalNode DIRECTIVE_TEXT(int i) {
			return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT, i);
		}
		public List<TerminalNode> DIRECTIVE_TEXT_NEWLINE() { return getTokens(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT_NEWLINE); }
		public TerminalNode DIRECTIVE_TEXT_NEWLINE(int i) {
			return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT_NEWLINE, i);
		}
		public DirectiveTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterDirectiveText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitDirectiveText(this);
		}
	}

	public final DirectiveTextContext directiveText() throws RecognitionException {
		DirectiveTextContext _localctx = new DirectiveTextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directiveText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==DIRECTIVE_TEXT_NEWLINE || _la==DIRECTIVE_TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIRECTIVE_TEXT_NEWLINE || _la==DIRECTIVE_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorExpressionContext extends ParserRuleContext {
		public PreprocessorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorExpression; }
	 
		public PreprocessorExpressionContext() { }
		public void copyFrom(PreprocessorExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorParenthesisContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorParenthesisContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorParenthesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorNotContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_BANG() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_BANG, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public PreprocessorNotContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorBinaryContext extends PreprocessorExpressionContext {
		public Token op;
		public List<PreprocessorExpressionContext> preprocessorExpression() {
			return getRuleContexts(PreprocessorExpressionContext.class);
		}
		public PreprocessorExpressionContext preprocessorExpression(int i) {
			return getRuleContext(PreprocessorExpressionContext.class,i);
		}
		public TerminalNode DIRECTIVE_EQUAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_EQUAL, 0); }
		public TerminalNode DIRECTIVE_NOTEQUAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_NOTEQUAL, 0); }
		public TerminalNode DIRECTIVE_AND() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_AND, 0); }
		public TerminalNode DIRECTIVE_OR() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_OR, 0); }
		public TerminalNode DIRECTIVE_LT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LT, 0); }
		public TerminalNode DIRECTIVE_GT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_GT, 0); }
		public TerminalNode DIRECTIVE_LE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LE, 0); }
		public TerminalNode DIRECTIVE_GE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_GE, 0); }
		public PreprocessorBinaryContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorBinary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorConstantContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_TRUE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_TRUE, 0); }
		public TerminalNode DIRECTIVE_FALSE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_FALSE, 0); }
		public TerminalNode DIRECTIVE_DECIMAL_LITERAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DECIMAL_LITERAL, 0); }
		public TerminalNode DIRECTIVE_STRING() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_STRING, 0); }
		public PreprocessorConstantContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConstant(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorConditionalSymbolContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_ID() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ID, 0); }
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorConditionalSymbolContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditionalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditionalSymbol(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorDefinedContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_DEFINED() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DEFINED, 0); }
		public TerminalNode DIRECTIVE_ID() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ID, 0); }
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorDefinedContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDefined(this);
		}
	}

	public final PreprocessorExpressionContext preprocessorExpression() throws RecognitionException {
		return preprocessorExpression(0);
	}

	private PreprocessorExpressionContext preprocessorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PreprocessorExpressionContext _localctx = new PreprocessorExpressionContext(_ctx, _parentState);
		PreprocessorExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_preprocessorExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_TRUE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(DIRECTIVE_TRUE);
				}
				break;
			case DIRECTIVE_FALSE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(DIRECTIVE_FALSE);
				}
				break;
			case DIRECTIVE_DECIMAL_LITERAL:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(DIRECTIVE_DECIMAL_LITERAL);
				}
				break;
			case DIRECTIVE_STRING:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(DIRECTIVE_STRING);
				}
				break;
			case DIRECTIVE_ID:
				{
				_localctx = new PreprocessorConditionalSymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(DIRECTIVE_ID);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					match(DIRECTIVE_LP);
					setState(57);
					preprocessorExpression(0);
					setState(58);
					match(DIRECTIVE_RP);
					}
					break;
				}
				}
				break;
			case DIRECTIVE_LP:
				{
				_localctx = new PreprocessorParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(DIRECTIVE_LP);
				setState(63);
				preprocessorExpression(0);
				setState(64);
				match(DIRECTIVE_RP);
				}
				break;
			case DIRECTIVE_BANG:
				{
				_localctx = new PreprocessorNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(DIRECTIVE_BANG);
				setState(67);
				preprocessorExpression(6);
				}
				break;
			case DIRECTIVE_DEFINED:
				{
				_localctx = new PreprocessorDefinedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(DIRECTIVE_DEFINED);
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIRECTIVE_ID:
					{
					setState(69);
					match(DIRECTIVE_ID);
					}
					break;
				case DIRECTIVE_LP:
					{
					setState(70);
					match(DIRECTIVE_LP);
					setState(71);
					match(DIRECTIVE_ID);
					setState(72);
					match(DIRECTIVE_RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(77);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(78);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIRECTIVE_EQUAL || _la==DIRECTIVE_NOTEQUAL) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						preprocessorExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						((PreprocessorBinaryContext)_localctx).op = match(DIRECTIVE_AND);
						setState(82);
						preprocessorExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						((PreprocessorBinaryContext)_localctx).op = match(DIRECTIVE_OR);
						setState(85);
						preprocessorExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & 15L) != 0)) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						preprocessorExpression(3);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return preprocessorExpression_sempred((PreprocessorExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean preprocessorExpression_sempred(PreprocessorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00de_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000*\b\u0000\u0003\u0000,\b\u0000\u0001\u0001\u0004\u0001"+
		"/\b\u0001\u000b\u0001\f\u00010\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0003\u0002L\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"Z\b\u0002\n\u0002\f\u0002]\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003"+
		"\u0000\u0002\u0004\u0000\u0004\u0001\u0000\u00ba\u00bb\u0001\u0000\u00dd"+
		"\u00de\u0001\u0000\u00cd\u00ce\u0001\u0000\u00d1\u00d4u\u0000+\u0001\u0000"+
		"\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000"+
		"\u0006\u0007\u0005\u00b6\u0000\u0000\u0007\b\u0007\u0000\u0000\u0000\b"+
		",\u0003\u0002\u0001\u0000\t\n\u0005\u00b6\u0000\u0000\n\u000b\u0005\u00bf"+
		"\u0000\u0000\u000b,\u0003\u0004\u0002\u0000\f\r\u0005\u00b6\u0000\u0000"+
		"\r\u000e\u0005\u00c0\u0000\u0000\u000e,\u0003\u0004\u0002\u0000\u000f"+
		"\u0010\u0005\u00b6\u0000\u0000\u0010,\u0005\u00c1\u0000\u0000\u0011\u0012"+
		"\u0005\u00b6\u0000\u0000\u0012,\u0005\u00c5\u0000\u0000\u0013\u0014\u0005"+
		"\u00b6\u0000\u0000\u0014\u0015\u0005\u00c3\u0000\u0000\u0015,\u0005\u00d6"+
		"\u0000\u0000\u0016\u0017\u0005\u00b6\u0000\u0000\u0017\u0018\u0005\u00c4"+
		"\u0000\u0000\u0018,\u0005\u00d6\u0000\u0000\u0019\u001a\u0005\u00b6\u0000"+
		"\u0000\u001a\u001b\u0005\u00c2\u0000\u0000\u001b,\u0005\u00d6\u0000\u0000"+
		"\u001c\u001d\u0005\u00b6\u0000\u0000\u001d\u001e\u0005\u00bc\u0000\u0000"+
		"\u001e,\u0003\u0002\u0001\u0000\u001f \u0005\u00b6\u0000\u0000 !\u0005"+
		"\u00c8\u0000\u0000!,\u0003\u0002\u0001\u0000\"#\u0005\u00b6\u0000\u0000"+
		"#$\u0005\u00c9\u0000\u0000$,\u0003\u0002\u0001\u0000%&\u0005\u00b6\u0000"+
		"\u0000&\'\u0005\u00bd\u0000\u0000\')\u0005\u00d6\u0000\u0000(*\u0003\u0002"+
		"\u0001\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+\u0006\u0001\u0000\u0000\u0000+\t\u0001\u0000\u0000"+
		"\u0000+\f\u0001\u0000\u0000\u0000+\u000f\u0001\u0000\u0000\u0000+\u0011"+
		"\u0001\u0000\u0000\u0000+\u0013\u0001\u0000\u0000\u0000+\u0016\u0001\u0000"+
		"\u0000\u0000+\u0019\u0001\u0000\u0000\u0000+\u001c\u0001\u0000\u0000\u0000"+
		"+\u001f\u0001\u0000\u0000\u0000+\"\u0001\u0000\u0000\u0000+%\u0001\u0000"+
		"\u0000\u0000,\u0001\u0001\u0000\u0000\u0000-/\u0007\u0001\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0006"+
		"\u0002\uffff\uffff\u00003L\u0005\u00c6\u0000\u00004L\u0005\u00c7\u0000"+
		"\u00005L\u0005\u00d7\u0000\u00006L\u0005\u00d5\u0000\u00007<\u0005\u00d6"+
		"\u0000\u000089\u0005\u00cb\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005"+
		"\u00cc\u0000\u0000;=\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=L\u0001\u0000\u0000\u0000>?\u0005\u00cb\u0000"+
		"\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u00cc\u0000\u0000AL\u0001\u0000"+
		"\u0000\u0000BC\u0005\u00ca\u0000\u0000CL\u0003\u0004\u0002\u0006DI\u0005"+
		"\u00be\u0000\u0000EJ\u0005\u00d6\u0000\u0000FG\u0005\u00cb\u0000\u0000"+
		"GH\u0005\u00d6\u0000\u0000HJ\u0005\u00cc\u0000\u0000IE\u0001\u0000\u0000"+
		"\u0000IF\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000K2\u0001\u0000"+
		"\u0000\u0000K4\u0001\u0000\u0000\u0000K5\u0001\u0000\u0000\u0000K6\u0001"+
		"\u0000\u0000\u0000K7\u0001\u0000\u0000\u0000K>\u0001\u0000\u0000\u0000"+
		"KB\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000L[\u0001\u0000\u0000"+
		"\u0000MN\n\u0005\u0000\u0000NO\u0007\u0002\u0000\u0000OZ\u0003\u0004\u0002"+
		"\u0006PQ\n\u0004\u0000\u0000QR\u0005\u00cf\u0000\u0000RZ\u0003\u0004\u0002"+
		"\u0005ST\n\u0003\u0000\u0000TU\u0005\u00d0\u0000\u0000UZ\u0003\u0004\u0002"+
		"\u0004VW\n\u0002\u0000\u0000WX\u0007\u0003\u0000\u0000XZ\u0003\u0004\u0002"+
		"\u0003YM\u0001\u0000\u0000\u0000YP\u0001\u0000\u0000\u0000YS\u0001\u0000"+
		"\u0000\u0000YV\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000\b)+0<IKY[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}