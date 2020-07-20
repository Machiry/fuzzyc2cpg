// Generated from /home/machiry/projects/antl4c/src/main/antlr/Common.g4 by ANTLR 4.2.2
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__62=1, T__61=2, T__60=3, T__59=4, T__58=5, T__57=6, T__56=7, T__55=8, 
		T__54=9, T__53=10, T__52=11, T__51=12, T__50=13, T__49=14, T__48=15, T__47=16, 
		T__46=17, T__45=18, T__44=19, T__43=20, T__42=21, T__41=22, T__40=23, 
		T__39=24, T__38=25, T__37=26, T__36=27, T__35=28, T__34=29, T__33=30, 
		T__32=31, T__31=32, T__30=33, T__29=34, T__28=35, T__27=36, T__26=37, 
		T__25=38, T__24=39, T__23=40, T__22=41, T__21=42, T__20=43, T__19=44, 
		T__18=45, T__17=46, T__16=47, T__15=48, T__14=49, T__13=50, T__12=51, 
		T__11=52, T__10=53, T__9=54, T__8=55, T__7=56, T__6=57, T__5=58, T__4=59, 
		T__3=60, T__2=61, T__1=62, T__0=63, IF=64, ELSE=65, FOR=66, WHILE=67, 
		BREAK=68, CASE=69, CONTINUE=70, SWITCH=71, DO=72, GOTO=73, RETURN=74, 
		TYPEDEF=75, EXTERN=76, VOID=77, UNSIGNED=78, SIGNED=79, LONG=80, CV_QUALIFIER=81, 
		VIRTUAL=82, TRY=83, CATCH=84, THROW=85, USING=86, NAMESPACE=87, AUTO=88, 
		REGISTER=89, OPERATOR=90, TEMPLATE=91, NEW=92, DELETE=93, GCC_ATTRIBUTE=94, 
		ALPHA_NUMERIC=95, OPENING_CURLY=96, CLOSING_CURLY=97, PRE_IF=98, PRE_ELSE=99, 
		PRE_ENDIF=100, PRE_DEFINE=101, HEX_LITERAL=102, DECIMAL_LITERAL=103, OCTAL_LITERAL=104, 
		BINARY_LITERAL=105, FLOATING_POINT_LITERAL=106, CHAR=107, STRING=108, 
		MULTILINE_STRING=109, COMMENT=110, LINE_COMMENT=111, WHITESPACE=112, ELLIPSIS=113, 
		OTHER=114;
	public static final String[] tokenNames = {
		"<INVALID>", "'+='", "'private'", "'%='", "'!='", "'restrict'", "'::'", 
		"'&&'", "'>>'", "'^='", "'='", "'<<='", "'^'", "'->*'", "'|='", "'union'", 
		"'('", "','", "'-='", "'/='", "'typename'", "'>='", "'++'", "'<'", "']'", 
		"'~'", "'dynamic_cast'", "'static'", "'friend'", "'protected'", "'sizeof'", 
		"'+'", "'struct'", "'*='", "'/'", "'&='", "'reinterpret_cast'", "'class'", 
		"';'", "'||'", "'>>='", "'inline'", "'<<'", "'?'", "'enum'", "'<='", "'&'", 
		"'*'", "'.'", "'const_cast'", "'->'", "':'", "'explicit'", "'['", "'--'", 
		"'=='", "'|'", "'public'", "'>'", "'!'", "'%'", "')'", "'static_cast'", 
		"'-'", "'if'", "'else'", "'for'", "'while'", "'break'", "'case'", "'continue'", 
		"'switch'", "'do'", "'goto'", "'return'", "'typedef'", "'extern'", "'void'", 
		"'unsigned'", "'signed'", "'long'", "CV_QUALIFIER", "'virtual'", "'try'", 
		"'catch'", "'throw'", "'using'", "'namespace'", "'auto'", "'register'", 
		"'operator'", "'template'", "'new'", "'delete'", "'__attribute__'", "ALPHA_NUMERIC", 
		"'{'", "'}'", "PRE_IF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "HEX_LITERAL", 
		"DECIMAL_LITERAL", "OCTAL_LITERAL", "BINARY_LITERAL", "FLOATING_POINT_LITERAL", 
		"CHAR", "STRING", "MULTILINE_STRING", "COMMENT", "LINE_COMMENT", "WHITESPACE", 
		"'...'", "OTHER"
	};
	public static final int
		RULE_unary_operator = 0, RULE_relational_operator = 1, RULE_constant = 2, 
		RULE_function_decl_specifiers = 3, RULE_ptr_operator = 4, RULE_access_specifier = 5, 
		RULE_operator = 6, RULE_assignment_operator = 7, RULE_equality_operator = 8, 
		RULE_template_decl = 9, RULE_template_decl_param_list = 10, RULE_template_template = 11, 
		RULE_template_decl_param = 12, RULE_template_decl_keyword = 13, RULE_template_name = 14, 
		RULE_template_args = 15, RULE_template_args_param_list = 16, RULE_template_args_param = 17, 
		RULE_no_brackets = 18, RULE_no_brackets_curlies_or_squares = 19, RULE_no_brackets_or_semicolon = 20, 
		RULE_no_angle_brackets_or_brackets = 21, RULE_no_curlies = 22, RULE_no_squares = 23, 
		RULE_no_squares_or_semicolon = 24, RULE_no_comma_or_semicolon = 25, RULE_assign_water = 26, 
		RULE_assign_water_l2 = 27, RULE_water = 28, RULE_identifier = 29, RULE_number = 30, 
		RULE_ptrs = 31, RULE_func_ptrs = 32, RULE_rvalue_ref = 33, RULE_class_key = 34, 
		RULE_class_def = 35, RULE_class_name = 36, RULE_base_classes = 37, RULE_base_class = 38, 
		RULE_type_name = 39, RULE_base_type = 40, RULE_gcc_attribute = 41, RULE_expr = 42, 
		RULE_assign_expr = 43, RULE_conditional_expression = 44, RULE_or_expression = 45, 
		RULE_and_expression = 46, RULE_inclusive_or_expression = 47, RULE_exclusive_or_expression = 48, 
		RULE_bit_and_expression = 49, RULE_equality_expression = 50, RULE_relational_expression = 51, 
		RULE_shift_expression = 52, RULE_additive_expression = 53, RULE_multiplicative_expression = 54, 
		RULE_cpp_cast_identifier = 55, RULE_cast_expression = 56, RULE_cast_target = 57, 
		RULE_unary_expression = 58, RULE_new_expression = 59, RULE_delete_expression = 60, 
		RULE_unary_op_and_cast_expr = 61, RULE_sizeof_expression = 62, RULE_sizeof = 63, 
		RULE_sizeof_operand = 64, RULE_sizeof_operand2 = 65, RULE_inc_dec = 66, 
		RULE_postfix_expression = 67, RULE_function_argument_list = 68, RULE_function_argument = 69, 
		RULE_primary_expression = 70;
	public static final String[] ruleNames = {
		"unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
		"ptr_operator", "access_specifier", "operator", "assignment_operator", 
		"equality_operator", "template_decl", "template_decl_param_list", "template_template", 
		"template_decl_param", "template_decl_keyword", "template_name", "template_args", 
		"template_args_param_list", "template_args_param", "no_brackets", "no_brackets_curlies_or_squares", 
		"no_brackets_or_semicolon", "no_angle_brackets_or_brackets", "no_curlies", 
		"no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", "assign_water", 
		"assign_water_l2", "water", "identifier", "number", "ptrs", "func_ptrs", 
		"rvalue_ref", "class_key", "class_def", "class_name", "base_classes", 
		"base_class", "type_name", "base_type", "gcc_attribute", "expr", "assign_expr", 
		"conditional_expression", "or_expression", "and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "bit_and_expression", "equality_expression", 
		"relational_expression", "shift_expression", "additive_expression", "multiplicative_expression", 
		"cpp_cast_identifier", "cast_expression", "cast_target", "unary_expression", 
		"new_expression", "delete_expression", "unary_op_and_cast_expr", "sizeof_expression", 
		"sizeof", "sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"function_argument_list", "function_argument", "primary_expression"
	};

	@Override
	public String getGrammarFileName() { return "Common.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    public void skipToEndOfObject() {
	        Stack<Object> CurlyStack = new Stack<>();
	        Object o = new Object();
	        int t = _input.LA(1);

	        while (t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)) {

	            if (t == PRE_ELSE){
	                Stack<Object> ifdefStack = new Stack<>();
	                consume();
	                t = _input.LA(1);

	                while (t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))) {

	                    if (t == PRE_IF) ifdefStack.push(o);
	                    else if (t == PRE_ENDIF) ifdefStack.pop();

	                    consume();
	                    t = _input.LA(1);
	                }
	            }

	            if (t == OPENING_CURLY) CurlyStack.push(o);
	            else if (t == CLOSING_CURLY) CurlyStack.pop();

	            consume();
	            t = _input.LA(1);
	        }

	        if(t != EOF) consume();
	    }


	public CommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 25) | (1L << 31) | (1L << 46) | (1L << 47) | (1L << 59) | (1L << 63))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 23) | (1L << 45) | (1L << 58))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode OCTAL_LITERAL() { return getToken(CommonParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CommonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(CommonParser.MULTILINE_STRING, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CommonParser.HEX_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(CommonParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(CommonParser.CHAR, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CommonParser.BINARY_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(CommonParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (BINARY_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)) | (1L << (MULTILINE_STRING - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (27 - 27)) | (1L << (28 - 27)) | (1L << (41 - 27)) | (1L << (52 - 27)) | (1L << (VIRTUAL - 27)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==46 || _la==47) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			setState(199);
			switch (_input.LA(1)) {
			case NEW:
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==NEW || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(157);
				_la = _input.LA(1);
				if (_la==53) {
					{
					setState(155); match(53);
					setState(156); match(24);
					}
				}

				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(31);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(63);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 4);
				{
				setState(161); match(47);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 5);
				{
				setState(162); match(34);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 6);
				{
				setState(163); match(60);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 7);
				{
				setState(164); match(12);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 8);
				{
				setState(165); match(46);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 9);
				{
				setState(166); match(56);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 10);
				{
				setState(167); match(25);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 11);
				{
				setState(168); match(59);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 12);
				{
				setState(169); match(10);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 13);
				{
				setState(170); match(23);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 14);
				{
				setState(171); match(58);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 15);
				{
				setState(172); match(1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 16);
				{
				setState(173); match(18);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 17);
				{
				setState(174); match(33);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 18);
				{
				setState(175); match(19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 19);
				{
				setState(176); match(3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 20);
				{
				setState(177); match(9);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 21);
				{
				setState(178); match(35);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 22);
				{
				setState(179); match(14);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 23);
				{
				setState(180); match(8);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 24);
				{
				setState(181); match(42);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 25);
				{
				setState(182); match(40);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 26);
				{
				setState(183); match(11);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 27);
				{
				setState(184); match(55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 28);
				{
				setState(185); match(4);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 29);
				{
				setState(186); match(45);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 30);
				{
				setState(187); match(21);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 31);
				{
				setState(188); match(7);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 32);
				{
				setState(189); match(39);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 33);
				{
				setState(190); match(22);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 34);
				{
				setState(191); match(54);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 35);
				{
				setState(192); match(17);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 36);
				{
				setState(193); match(13);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 37);
				{
				setState(194); match(50);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 38);
				{
				setState(195); match(16);
				setState(196); match(61);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 39);
				{
				setState(197); match(53);
				setState(198); match(24);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 18) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==4 || _la==55) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_declContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(TEMPLATE);
			setState(206); match(23);
			setState(208);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 20) | (1L << 29) | (1L << 37) | (1L << 57))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CV_QUALIFIER - 81)) | (1L << (TEMPLATE - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
				{
				setState(207); template_decl_param_list(0);
				}
			}

			setState(210); match(58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_param_listContext extends ParserRuleContext {
		public Template_templateContext template_template() {
			return getRuleContext(Template_templateContext.class,0);
		}
		public Template_decl_keywordContext template_decl_keyword() {
			return getRuleContext(Template_decl_keywordContext.class,0);
		}
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_decl_paramContext template_decl_param() {
			return getRuleContext(Template_decl_paramContext.class,0);
		}
		public Template_decl_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_param_listContext template_decl_param_list() throws RecognitionException {
		return template_decl_param_list(0);
	}

	private Template_decl_param_listContext template_decl_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_decl_param_listContext _localctx = new Template_decl_param_listContext(_ctx, _parentState);
		Template_decl_param_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(213); template_template();
				setState(214); template_decl_keyword();
				setState(215); template_name();
				}
				break;
			case 2:
			case 20:
			case 29:
			case 37:
			case 57:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(217); template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(220);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(221); match(17);
					setState(222); template_decl_param();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Template_templateContext extends ParserRuleContext {
		public List<Template_decl_keywordContext> template_decl_keyword() {
			return getRuleContexts(Template_decl_keywordContext.class);
		}
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public Template_decl_keywordContext template_decl_keyword(int i) {
			return getRuleContext(Template_decl_keywordContext.class,i);
		}
		public Template_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(TEMPLATE);
			setState(229); match(23);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230); template_decl_keyword();
				setState(232);
				_la = _input.LA(1);
				if (_la==17) {
					{
					setState(231); match(17);
					}
				}

				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==20 || _la==37 );
			setState(238); match(58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_paramContext extends ParserRuleContext {
		public Template_decl_keywordContext template_decl_keyword() {
			return getRuleContext(Template_decl_keywordContext.class,0);
		}
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(CommonParser.CV_QUALIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch (_input.LA(1)) {
			case 20:
			case 37:
				{
				setState(240); template_decl_keyword();
				}
				break;
			case 2:
			case 29:
			case 57:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(242);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(241); match(CV_QUALIFIER);
					}
				}

				setState(244); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(247); template_name();
				}
				break;
			}
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(250); ptr_operator();
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

	public static class Template_decl_keywordContext extends ParserRuleContext {
		public Template_decl_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==20 || _la==37) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(CommonParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(255); match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(260); match(ELLIPSIS);
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

	public static class Template_argsContext extends ParserRuleContext {
		public Template_args_param_listContext template_args_param_list() {
			return getRuleContext(Template_args_param_listContext.class,0);
		}
		public Template_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(23);
			setState(265);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
				{
				setState(264); template_args_param_list(0);
				}
			}

			setState(267); match(58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_args_param_listContext extends ParserRuleContext {
		public Template_args_param_listContext template_args_param_list() {
			return getRuleContext(Template_args_param_listContext.class,0);
		}
		public Template_args_paramContext template_args_param() {
			return getRuleContext(Template_args_paramContext.class,0);
		}
		public Template_args_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_param_listContext template_args_param_list() throws RecognitionException {
		return template_args_param_list(0);
	}

	private Template_args_param_listContext template_args_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_args_param_listContext _localctx = new Template_args_param_listContext(_ctx, _parentState);
		Template_args_param_listContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270); template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(272);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(273); match(17);
					setState(274); template_args_param();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Template_args_paramContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(CommonParser.CV_QUALIFIER, 0); }
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(280); match(CV_QUALIFIER);
				}
			}

			setState(283); base_type();
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(284); ptr_operator();
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

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==16 || _la==61) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << 53) | (1L << 61))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 38) | (1L << 61))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 23) | (1L << 58) | (1L << 61))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_curliesContext extends ParserRuleContext {
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==24 || _la==53) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 24) | (1L << 38) | (1L << 53))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==17 || _la==38) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_waterContext extends ParserRuleContext {
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 17) | (1L << 24) | (1L << 38) | (1L << 53) | (1L << 61))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_water_l2Context extends ParserRuleContext {
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << 53) | (1L << 61))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			int _alt;
			setState(318);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(309); match(ALPHA_NUMERIC);
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310); match(6);
						setState(311); match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				}
				break;
			case 2:
			case 29:
			case 57:
				enterOuterAlt(_localctx, 2);
				{
				setState(317); access_specifier();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CommonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(CommonParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CommonParser.HEX_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrsContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(CommonParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(CommonParser.CV_QUALIFIER); }
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(322); match(CV_QUALIFIER);
					}
				}

				setState(325); ptr_operator();
				setState(327);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(326); match(5);
					}
				}

				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Func_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); ptrs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rvalue_refContext extends ParserRuleContext {
		public Rvalue_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_keyContext extends ParserRuleContext {
		public Class_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 32) | (1L << 37) | (1L << 44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public Gcc_attributeContext gcc_attribute() {
			return getRuleContext(Gcc_attributeContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(339); template_decl();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345); class_key();
			setState(347);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(346); gcc_attribute();
				}
			}

			setState(350);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(349); class_name();
				}
			}

			setState(353);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(352); template_args();
				}
			}

			setState(356);
			_la = _input.LA(1);
			if (_la==51) {
				{
				setState(355); base_classes();
				}
			}

			setState(358); match(OPENING_CURLY);
			 skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); match(51);
			setState(364); base_class();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(365); match(17);
				setState(366); base_class();
				}
				}
				setState(371);
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

	public static class Base_classContext extends ParserRuleContext {
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(CommonParser.VIRTUAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(372); match(VIRTUAL);
				}
			}

			setState(376);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(375); access_specifier();
				}
				break;
			}
			setState(378); identifier();
			setState(380);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(379); template_args();
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<Template_argsContext> template_args() {
			return getRuleContexts(Template_argsContext.class);
		}
		public TerminalNode SIGNED() { return getToken(CommonParser.SIGNED, 0); }
		public Template_argsContext template_args(int i) {
			return getRuleContext(Template_argsContext.class,i);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(CommonParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(CommonParser.CV_QUALIFIER); }
		public TerminalNode UNSIGNED() { return getToken(CommonParser.UNSIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_name);
		int _la;
		try {
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(382); match(CV_QUALIFIER);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				switch (_input.LA(1)) {
				case 15:
				case 32:
				case 37:
				case 44:
					{
					setState(388); class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(389); match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(390); match(SIGNED);
					}
					break;
				case VOID:
				case LONG:
				case AUTO:
				case ALPHA_NUMERIC:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(393); base_type();
				setState(395);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(394); template_args();
					}
				}

				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==6) {
					{
					{
					setState(397); match(6);
					setState(398); base_type();
					setState(400);
					_la = _input.LA(1);
					if (_la==23) {
						{
						setState(399); template_args();
						}
					}

					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(408);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(407); match(CV_QUALIFIER);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410); match(UNSIGNED);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411); match(SIGNED);
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

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode VOID(int i) {
			return getToken(CommonParser.VOID, i);
		}
		public TerminalNode ELLIPSIS(int i) {
			return getToken(CommonParser.ELLIPSIS, i);
		}
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CommonParser.LONG); }
		public List<TerminalNode> ELLIPSIS() { return getTokens(CommonParser.ELLIPSIS); }
		public List<TerminalNode> AUTO() { return getTokens(CommonParser.AUTO); }
		public List<TerminalNode> VOID() { return getTokens(CommonParser.VOID); }
		public TerminalNode LONG(int i) {
			return getToken(CommonParser.LONG, i);
		}
		public TerminalNode AUTO(int i) {
			return getToken(CommonParser.AUTO, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(414);
					_la = _input.LA(1);
					if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(416);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(415); match(ELLIPSIS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(420); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gcc_attributeContext extends ParserRuleContext {
		public TerminalNode GCC_ATTRIBUTE() { return getToken(CommonParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(GCC_ATTRIBUTE);
			setState(423); match(16);
			setState(424); match(16);
			setState(425); identifier();
			setState(426); match(61);
			setState(427); match(61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); assign_expr();
			setState(432);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(430); match(17);
				setState(431); expr();
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

	public static class Assign_exprContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); conditional_expression();
			setState(438);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 18) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 40))) != 0)) {
				{
				setState(435); assignment_operator();
				setState(436); assign_expr();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNormOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditional_expression);
		try {
			setState(447);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440); or_expression();
				}
				break;

			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441); or_expression();
				{
				setState(442); match(43);
				setState(443); expr();
				setState(444); match(51);
				setState(445); conditional_expression();
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

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); and_expression();
			setState(452);
			_la = _input.LA(1);
			if (_la==39) {
				{
				setState(450); match(39);
				setState(451); or_expression();
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

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); inclusive_or_expression();
			setState(457);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(455); match(7);
				setState(456); and_expression();
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); exclusive_or_expression();
			setState(462);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(460); match(56);
				setState(461); inclusive_or_expression();
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); bit_and_expression();
			setState(467);
			_la = _input.LA(1);
			if (_la==12) {
				{
				setState(465); match(12);
				setState(466); exclusive_or_expression();
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

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); equality_expression();
			setState(472);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(470); match(46);
				setState(471); bit_and_expression();
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); relational_expression();
			setState(478);
			_la = _input.LA(1);
			if (_la==4 || _la==55) {
				{
				setState(475); equality_operator();
				setState(476); equality_expression();
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); shift_expression();
			setState(484);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 23) | (1L << 45) | (1L << 58))) != 0)) {
				{
				setState(481); relational_operator();
				setState(482); relational_expression();
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); additive_expression();
			setState(489);
			_la = _input.LA(1);
			if (_la==8 || _la==42) {
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==8 || _la==42) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(488); shift_expression();
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); multiplicative_expression();
			setState(494);
			_la = _input.LA(1);
			if (_la==31 || _la==63) {
				{
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==31 || _la==63) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(493); additive_expression();
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); cast_expression();
			setState(499);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) {
				{
				setState(497);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(498); multiplicative_expression();
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

	public static class Cpp_cast_identifierContext extends ParserRuleContext {
		public Cpp_cast_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp_cast_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCpp_cast_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCpp_cast_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCpp_cast_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_cast_identifierContext cpp_cast_identifier() throws RecognitionException {
		Cpp_cast_identifierContext _localctx = new Cpp_cast_identifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cpp_cast_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << 36) | (1L << 49) | (1L << 62))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cpp_cast_identifierContext cpp_cast_identifier() {
			return getRuleContext(Cpp_cast_identifierContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cast_expression);
		try {
			setState(517);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(503); match(16);
				setState(504); cast_target();
				setState(505); match(61);
				setState(506); cast_expression();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); cpp_cast_identifier();
				setState(509); match(23);
				setState(510); cast_target();
				setState(511); match(58);
				setState(512); match(16);
				setState(513); cast_expression();
				setState(514); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516); unary_expression();
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

	public static class Cast_targetContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); type_name();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(520); ptr_operator();
				}
				}
				setState(525);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public Delete_expressionContext delete_expression() {
			return getRuleContext(Delete_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unary_expression);
		try {
			setState(534);
			switch (_input.LA(1)) {
			case 22:
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(526); inc_dec();
				setState(527); cast_expression();
				}
				break;
			case 25:
			case 31:
			case 46:
			case 47:
			case 59:
			case 63:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); unary_op_and_cast_expr();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 3);
				{
				setState(530); sizeof_expression();
				}
				break;
			case 6:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(531); new_expression();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(532); delete_expression();
				}
				break;
			case 2:
			case 16:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(533); postfix_expression(0);
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

	public static class New_expressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CommonParser.NEW, 0); }
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_new_expression);
		int _la;
		try {
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(536); match(6);
					}
				}

				setState(539); match(NEW);
				setState(540); type_name();
				setState(541); match(53);
				setState(543);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(542); conditional_expression();
					}
				}

				setState(545); match(24);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(547); match(6);
					}
				}

				setState(550); match(NEW);
				setState(551); type_name();
				setState(552); match(16);
				setState(554);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(553); expr();
					}
				}

				setState(556); match(61);
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

	public static class Delete_expressionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CommonParser.DELETE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Delete_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterDelete_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitDelete_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitDelete_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_expressionContext delete_expression() throws RecognitionException {
		Delete_expressionContext _localctx = new Delete_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_delete_expression);
		try {
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560); match(DELETE);
				setState(561); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562); match(DELETE);
				setState(563); match(53);
				setState(564); match(24);
				setState(565); identifier();
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

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); unary_operator();
			setState(569); cast_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sizeof_expression);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571); sizeof();
				setState(572); sizeof_operand2();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574); sizeof();
				setState(575); match(16);
				setState(576); sizeof_operand2();
				setState(577); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579); sizeof();
				setState(580); match(16);
				setState(581); sizeof_operand();
				setState(582); match(61);
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

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); match(30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); type_name();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(589); ptr_operator();
				}
				}
				setState(594);
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

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==22 || _la==54) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitIncDecOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPrimaryOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(600); primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(602);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(603); match(53);
						setState(604); expr();
						setState(605); match(24);
						}
						break;

					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(607);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(608); match(16);
						setState(609); function_argument_list();
						setState(610); match(61);
						}
						break;

					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(612);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(613); match(48);
						setState(615);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(614); match(TEMPLATE);
							}
						}

						{
						setState(617); identifier();
						}
						}
						break;

					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(618);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(619); match(50);
						setState(621);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(620); match(TEMPLATE);
							}
						}

						{
						setState(623); identifier();
						}
						}
						break;

					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(624);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(625); inc_dec();
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(631); function_argument();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==17) {
					{
					{
					setState(632); match(17);
					setState(633); function_argument();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); assign_expr();
			}
		}
		catch (RecognitionException re) {
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_primary_expression);
		try {
			setState(649);
			switch (_input.LA(1)) {
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(643); identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(644); constant();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(645); match(16);
				setState(646); expr();
				setState(647); match(61);
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
		case 10: return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);

		case 16: return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);

		case 67: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean template_decl_param_list_sempred(Template_decl_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);

		case 4: return precpred(_ctx, 4);

		case 5: return precpred(_ctx, 3);

		case 6: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean template_args_param_list_sempred(Template_args_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u028e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u00a0\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00ca\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13"+
		"\u00d3\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\3"+
		"\f\7\f\u00e2\n\f\f\f\16\f\u00e5\13\f\3\r\3\r\3\r\3\r\5\r\u00eb\n\r\6\r"+
		"\u00ed\n\r\r\r\16\r\u00ee\3\r\3\r\3\16\3\16\5\16\u00f5\n\16\3\16\5\16"+
		"\u00f8\n\16\3\16\5\16\u00fb\n\16\3\16\5\16\u00fe\n\16\3\17\3\17\3\20\6"+
		"\20\u0103\n\20\r\20\16\20\u0104\3\20\5\20\u0108\n\20\3\21\3\21\5\21\u010c"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0116\n\22\f\22\16"+
		"\22\u0119\13\22\3\23\5\23\u011c\n\23\3\23\3\23\5\23\u0120\n\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u013b\n\37\f\37"+
		"\16\37\u013e\13\37\3\37\5\37\u0141\n\37\3 \3 \3!\5!\u0146\n!\3!\3!\5!"+
		"\u014a\n!\6!\u014c\n!\r!\16!\u014d\3\"\3\"\3#\3#\3$\3$\3%\7%\u0157\n%"+
		"\f%\16%\u015a\13%\3%\3%\5%\u015e\n%\3%\5%\u0161\n%\3%\5%\u0164\n%\3%\5"+
		"%\u0167\n%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\7\'\u0172\n\'\f\'\16\'\u0175"+
		"\13\'\3(\5(\u0178\n(\3(\5(\u017b\n(\3(\3(\5(\u017f\n(\3)\7)\u0182\n)\f"+
		")\16)\u0185\13)\3)\3)\3)\5)\u018a\n)\3)\3)\5)\u018e\n)\3)\3)\3)\5)\u0193"+
		"\n)\7)\u0195\n)\f)\16)\u0198\13)\3)\5)\u019b\n)\3)\3)\5)\u019f\n)\3*\3"+
		"*\5*\u01a3\n*\6*\u01a5\n*\r*\16*\u01a6\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5"+
		",\u01b3\n,\3-\3-\3-\3-\5-\u01b9\n-\3.\3.\3.\3.\3.\3.\3.\5.\u01c2\n.\3"+
		"/\3/\3/\5/\u01c7\n/\3\60\3\60\3\60\5\60\u01cc\n\60\3\61\3\61\3\61\5\61"+
		"\u01d1\n\61\3\62\3\62\3\62\5\62\u01d6\n\62\3\63\3\63\3\63\5\63\u01db\n"+
		"\63\3\64\3\64\3\64\3\64\5\64\u01e1\n\64\3\65\3\65\3\65\3\65\5\65\u01e7"+
		"\n\65\3\66\3\66\3\66\5\66\u01ec\n\66\3\67\3\67\3\67\5\67\u01f1\n\67\3"+
		"8\38\38\58\u01f6\n8\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5"+
		":\u0208\n:\3;\3;\7;\u020c\n;\f;\16;\u020f\13;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\5<\u0219\n<\3=\5=\u021c\n=\3=\3=\3=\3=\5=\u0222\n=\3=\3=\3=\5=\u0227"+
		"\n=\3=\3=\3=\3=\5=\u022d\n=\3=\3=\5=\u0231\n=\3>\3>\3>\3>\3>\3>\5>\u0239"+
		"\n>\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u024b\n@\3A\3A"+
		"\3B\3B\7B\u0251\nB\fB\16B\u0254\13B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u026a\nE\3E\3E\3E\3E\5E\u0270\nE\3E\3E\3"+
		"E\7E\u0275\nE\fE\16E\u0278\13E\3F\3F\3F\7F\u027d\nF\fF\16F\u0280\13F\5"+
		"F\u0282\nF\3G\3G\3H\3H\3H\3H\3H\3H\5H\u028c\nH\3H\2\5\26\"\u0088I\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\2\35\7\2\33\33!!\60\61==AA\6\2\27\27\31\31//<<\3\2ho\6\2\35\36++\66\66"+
		"TT\3\2\60\61\5\2\4\4\37\37;;\3\2^_\n\2\3\3\5\5\13\r\20\20\24\25##%%**"+
		"\4\2\6\699\4\2\26\26\'\'\4\2\22\22??\7\2\22\22\32\32\67\67??bc\5\2\22"+
		"\22((??\6\2\22\22\31\31<<??\3\2bc\4\2\32\32\67\67\5\2\32\32((\67\67\4"+
		"\2\23\23((\b\2\22\23\32\32((\67\67??bc\3\2hj\6\2\21\21\"\"\'\'..\6\2O"+
		"ORRZZaa\4\2\n\n,,\4\2!!AA\5\2$$\61\61>>\6\2\34\34&&\63\63@@\4\2\30\30"+
		"88\u02bf\2\u0090\3\2\2\2\4\u0092\3\2\2\2\6\u0094\3\2\2\2\b\u0096\3\2\2"+
		"\2\n\u0098\3\2\2\2\f\u009a\3\2\2\2\16\u00c9\3\2\2\2\20\u00cb\3\2\2\2\22"+
		"\u00cd\3\2\2\2\24\u00cf\3\2\2\2\26\u00dc\3\2\2\2\30\u00e6\3\2\2\2\32\u00f7"+
		"\3\2\2\2\34\u00ff\3\2\2\2\36\u0102\3\2\2\2 \u0109\3\2\2\2\"\u010f\3\2"+
		"\2\2$\u011b\3\2\2\2&\u0121\3\2\2\2(\u0123\3\2\2\2*\u0125\3\2\2\2,\u0127"+
		"\3\2\2\2.\u0129\3\2\2\2\60\u012b\3\2\2\2\62\u012d\3\2\2\2\64\u012f\3\2"+
		"\2\2\66\u0131\3\2\2\28\u0133\3\2\2\2:\u0135\3\2\2\2<\u0140\3\2\2\2>\u0142"+
		"\3\2\2\2@\u014b\3\2\2\2B\u014f\3\2\2\2D\u0151\3\2\2\2F\u0153\3\2\2\2H"+
		"\u0158\3\2\2\2J\u016b\3\2\2\2L\u016d\3\2\2\2N\u0177\3\2\2\2P\u019e\3\2"+
		"\2\2R\u01a4\3\2\2\2T\u01a8\3\2\2\2V\u01af\3\2\2\2X\u01b4\3\2\2\2Z\u01c1"+
		"\3\2\2\2\\\u01c3\3\2\2\2^\u01c8\3\2\2\2`\u01cd\3\2\2\2b\u01d2\3\2\2\2"+
		"d\u01d7\3\2\2\2f\u01dc\3\2\2\2h\u01e2\3\2\2\2j\u01e8\3\2\2\2l\u01ed\3"+
		"\2\2\2n\u01f2\3\2\2\2p\u01f7\3\2\2\2r\u0207\3\2\2\2t\u0209\3\2\2\2v\u0218"+
		"\3\2\2\2x\u0230\3\2\2\2z\u0238\3\2\2\2|\u023a\3\2\2\2~\u024a\3\2\2\2\u0080"+
		"\u024c\3\2\2\2\u0082\u024e\3\2\2\2\u0084\u0255\3\2\2\2\u0086\u0257\3\2"+
		"\2\2\u0088\u0259\3\2\2\2\u008a\u0281\3\2\2\2\u008c\u0283\3\2\2\2\u008e"+
		"\u028b\3\2\2\2\u0090\u0091\t\2\2\2\u0091\3\3\2\2\2\u0092\u0093\t\3\2\2"+
		"\u0093\5\3\2\2\2\u0094\u0095\t\4\2\2\u0095\7\3\2\2\2\u0096\u0097\t\5\2"+
		"\2\u0097\t\3\2\2\2\u0098\u0099\t\6\2\2\u0099\13\3\2\2\2\u009a\u009b\t"+
		"\7\2\2\u009b\r\3\2\2\2\u009c\u009f\t\b\2\2\u009d\u009e\7\67\2\2\u009e"+
		"\u00a0\7\32\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ca\3"+
		"\2\2\2\u00a1\u00ca\7!\2\2\u00a2\u00ca\7A\2\2\u00a3\u00ca\7\61\2\2\u00a4"+
		"\u00ca\7$\2\2\u00a5\u00ca\7>\2\2\u00a6\u00ca\7\16\2\2\u00a7\u00ca\7\60"+
		"\2\2\u00a8\u00ca\7:\2\2\u00a9\u00ca\7\33\2\2\u00aa\u00ca\7=\2\2\u00ab"+
		"\u00ca\7\f\2\2\u00ac\u00ca\7\31\2\2\u00ad\u00ca\7<\2\2\u00ae\u00ca\7\3"+
		"\2\2\u00af\u00ca\7\24\2\2\u00b0\u00ca\7#\2\2\u00b1\u00ca\7\25\2\2\u00b2"+
		"\u00ca\7\5\2\2\u00b3\u00ca\7\13\2\2\u00b4\u00ca\7%\2\2\u00b5\u00ca\7\20"+
		"\2\2\u00b6\u00ca\7\n\2\2\u00b7\u00ca\7,\2\2\u00b8\u00ca\7*\2\2\u00b9\u00ca"+
		"\7\r\2\2\u00ba\u00ca\79\2\2\u00bb\u00ca\7\6\2\2\u00bc\u00ca\7/\2\2\u00bd"+
		"\u00ca\7\27\2\2\u00be\u00ca\7\t\2\2\u00bf\u00ca\7)\2\2\u00c0\u00ca\7\30"+
		"\2\2\u00c1\u00ca\78\2\2\u00c2\u00ca\7\23\2\2\u00c3\u00ca\7\17\2\2\u00c4"+
		"\u00ca\7\64\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00ca\7?\2\2\u00c7\u00c8\7"+
		"\67\2\2\u00c8\u00ca\7\32\2\2\u00c9\u009c\3\2\2\2\u00c9\u00a1\3\2\2\2\u00c9"+
		"\u00a2\3\2\2\2\u00c9\u00a3\3\2\2\2\u00c9\u00a4\3\2\2\2\u00c9\u00a5\3\2"+
		"\2\2\u00c9\u00a6\3\2\2\2\u00c9\u00a7\3\2\2\2\u00c9\u00a8\3\2\2\2\u00c9"+
		"\u00a9\3\2\2\2\u00c9\u00aa\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00ac\3\2"+
		"\2\2\u00c9\u00ad\3\2\2\2\u00c9\u00ae\3\2\2\2\u00c9\u00af\3\2\2\2\u00c9"+
		"\u00b0\3\2\2\2\u00c9\u00b1\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00b3\3\2"+
		"\2\2\u00c9\u00b4\3\2\2\2\u00c9\u00b5\3\2\2\2\u00c9\u00b6\3\2\2\2\u00c9"+
		"\u00b7\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00ba\3\2"+
		"\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00be\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c1\3\2"+
		"\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9"+
		"\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00cc\t\t\2"+
		"\2\u00cc\21\3\2\2\2\u00cd\u00ce\t\n\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\7"+
		"]\2\2\u00d0\u00d2\7\31\2\2\u00d1\u00d3\5\26\f\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5\25\3\2\2\2"+
		"\u00d6\u00d7\b\f\1\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\5\34\17\2\u00d9"+
		"\u00da\5\36\20\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5\32\16\2\u00dc\u00d6"+
		"\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\f\3\2\2\u00df"+
		"\u00e0\7\23\2\2\u00e0\u00e2\5\32\16\2\u00e1\u00de\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7]\2\2\u00e7\u00ec\7\31\2\2\u00e8\u00ea\5\34"+
		"\17\2\u00e9\u00eb\7\23\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1"+
		"\31\3\2\2\2\u00f2\u00f8\5\34\17\2\u00f3\u00f5\7S\2\2\u00f4\u00f3\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\5<\37\2\u00f7\u00f2"+
		"\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\5\36\20\2"+
		"\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe"+
		"\5\n\6\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\33\3\2\2\2\u00ff"+
		"\u0100\t\13\2\2\u0100\35\3\2\2\2\u0101\u0103\7a\2\2\u0102\u0101\3\2\2"+
		"\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0108\7s\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\37\3\2\2\2\u0109\u010b\7\31\2\2\u010a\u010c\5\"\22\2\u010b\u010a\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7<\2\2\u010e"+
		"!\3\2\2\2\u010f\u0110\b\22\1\2\u0110\u0111\5$\23\2\u0111\u0117\3\2\2\2"+
		"\u0112\u0113\f\3\2\2\u0113\u0114\7\23\2\2\u0114\u0116\5$\23\2\u0115\u0112"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"#\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7S\2\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\5R*\2\u011e\u0120\5\n\6"+
		"\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120%\3\2\2\2\u0121\u0122"+
		"\n\f\2\2\u0122\'\3\2\2\2\u0123\u0124\n\r\2\2\u0124)\3\2\2\2\u0125\u0126"+
		"\n\16\2\2\u0126+\3\2\2\2\u0127\u0128\n\17\2\2\u0128-\3\2\2\2\u0129\u012a"+
		"\n\20\2\2\u012a/\3\2\2\2\u012b\u012c\n\21\2\2\u012c\61\3\2\2\2\u012d\u012e"+
		"\n\22\2\2\u012e\63\3\2\2\2\u012f\u0130\n\23\2\2\u0130\65\3\2\2\2\u0131"+
		"\u0132\n\24\2\2\u0132\67\3\2\2\2\u0133\u0134\n\r\2\2\u01349\3\2\2\2\u0135"+
		"\u0136\13\2\2\2\u0136;\3\2\2\2\u0137\u013c\7a\2\2\u0138\u0139\7\b\2\2"+
		"\u0139\u013b\7a\2\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\5\f\7\2\u0140\u0137\3\2\2\2\u0140\u013f\3\2\2\2\u0141=\3\2\2\2"+
		"\u0142\u0143\t\25\2\2\u0143?\3\2\2\2\u0144\u0146\7S\2\2\u0145\u0144\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\5\n\6\2\u0148"+
		"\u014a\7\7\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2"+
		"\2\2\u014b\u0145\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014eA\3\2\2\2\u014f\u0150\5@!\2\u0150C\3\2\2\2\u0151\u0152"+
		"\7\t\2\2\u0152E\3\2\2\2\u0153\u0154\t\26\2\2\u0154G\3\2\2\2\u0155\u0157"+
		"\5\24\13\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d"+
		"\5F$\2\u015c\u015e\5T+\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\3\2\2\2\u015f\u0161\5J&\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2"+
		"\2\u0161\u0163\3\2\2\2\u0162\u0164\5 \21\2\u0163\u0162\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5L\'\2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7b\2\2\u0169\u016a\b%\1"+
		"\2\u016aI\3\2\2\2\u016b\u016c\5<\37\2\u016cK\3\2\2\2\u016d\u016e\7\65"+
		"\2\2\u016e\u0173\5N(\2\u016f\u0170\7\23\2\2\u0170\u0172\5N(\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"M\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\7T\2\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5\f\7\2\u017a\u0179\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\5<\37\2\u017d"+
		"\u017f\5 \21\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017fO\3\2\2\2"+
		"\u0180\u0182\7S\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0189\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u018a\5F$\2\u0187\u018a\7P\2\2\u0188\u018a\7Q\2\2\u0189\u0186\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018d\5R*\2\u018c\u018e\5 \21\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0196\3\2\2\2\u018f\u0190\7\b\2\2\u0190\u0192\5R"+
		"*\2\u0191\u0193\5 \21\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019b\7S\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019f\3\2"+
		"\2\2\u019c\u019f\7P\2\2\u019d\u019f\7Q\2\2\u019e\u0183\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019d\3\2\2\2\u019fQ\3\2\2\2\u01a0\u01a2\t\27\2\2\u01a1"+
		"\u01a3\7s\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7S\3\2\2\2\u01a8\u01a9\7`\2\2\u01a9\u01aa\7\22\2\2"+
		"\u01aa\u01ab\7\22\2\2\u01ab\u01ac\5<\37\2\u01ac\u01ad\7?\2\2\u01ad\u01ae"+
		"\7?\2\2\u01aeU\3\2\2\2\u01af\u01b2\5X-\2\u01b0\u01b1\7\23\2\2\u01b1\u01b3"+
		"\5V,\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3W\3\2\2\2\u01b4\u01b8"+
		"\5Z.\2\u01b5\u01b6\5\20\t\2\u01b6\u01b7\5X-\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u01b5\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9Y\3\2\2\2\u01ba\u01c2\5\\/\2\u01bb"+
		"\u01bc\5\\/\2\u01bc\u01bd\7-\2\2\u01bd\u01be\5V,\2\u01be\u01bf\7\65\2"+
		"\2\u01bf\u01c0\5Z.\2\u01c0\u01c2\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c1\u01bb"+
		"\3\2\2\2\u01c2[\3\2\2\2\u01c3\u01c6\5^\60\2\u01c4\u01c5\7)\2\2\u01c5\u01c7"+
		"\5\\/\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7]\3\2\2\2\u01c8\u01cb"+
		"\5`\61\2\u01c9\u01ca\7\t\2\2\u01ca\u01cc\5^\60\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc_\3\2\2\2\u01cd\u01d0\5b\62\2\u01ce\u01cf\7:\2\2\u01cf"+
		"\u01d1\5`\61\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1a\3\2\2\2"+
		"\u01d2\u01d5\5d\63\2\u01d3\u01d4\7\16\2\2\u01d4\u01d6\5b\62\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6c\3\2\2\2\u01d7\u01da\5f\64\2\u01d8"+
		"\u01d9\7\60\2\2\u01d9\u01db\5d\63\2\u01da\u01d8\3\2\2\2\u01da\u01db\3"+
		"\2\2\2\u01dbe\3\2\2\2\u01dc\u01e0\5h\65\2\u01dd\u01de\5\22\n\2\u01de\u01df"+
		"\5f\64\2\u01df\u01e1\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"g\3\2\2\2\u01e2\u01e6\5j\66\2\u01e3\u01e4\5\4\3\2\u01e4\u01e5\5h\65\2"+
		"\u01e5\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7i\3"+
		"\2\2\2\u01e8\u01eb\5l\67\2\u01e9\u01ea\t\30\2\2\u01ea\u01ec\5j\66\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01eck\3\2\2\2\u01ed\u01f0\5n8\2\u01ee"+
		"\u01ef\t\31\2\2\u01ef\u01f1\5l\67\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3"+
		"\2\2\2\u01f1m\3\2\2\2\u01f2\u01f5\5r:\2\u01f3\u01f4\t\32\2\2\u01f4\u01f6"+
		"\5n8\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6o\3\2\2\2\u01f7\u01f8"+
		"\t\33\2\2\u01f8q\3\2\2\2\u01f9\u01fa\7\22\2\2\u01fa\u01fb\5t;\2\u01fb"+
		"\u01fc\7?\2\2\u01fc\u01fd\5r:\2\u01fd\u0208\3\2\2\2\u01fe\u01ff\5p9\2"+
		"\u01ff\u0200\7\31\2\2\u0200\u0201\5t;\2\u0201\u0202\7<\2\2\u0202\u0203"+
		"\7\22\2\2\u0203\u0204\5r:\2\u0204\u0205\7?\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0208\5v<\2\u0207\u01f9\3\2\2\2\u0207\u01fe\3\2\2\2\u0207\u0206\3\2\2"+
		"\2\u0208s\3\2\2\2\u0209\u020d\5P)\2\u020a\u020c\5\n\6\2\u020b\u020a\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"u\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5\u0086D\2\u0211\u0212\5r:\2"+
		"\u0212\u0219\3\2\2\2\u0213\u0219\5|?\2\u0214\u0219\5~@\2\u0215\u0219\5"+
		"x=\2\u0216\u0219\5z>\2\u0217\u0219\5\u0088E\2\u0218\u0210\3\2\2\2\u0218"+
		"\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0215\3\2\2\2\u0218\u0216\3\2"+
		"\2\2\u0218\u0217\3\2\2\2\u0219w\3\2\2\2\u021a\u021c\7\b\2\2\u021b\u021a"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7^\2\2\u021e"+
		"\u021f\5P)\2\u021f\u0221\7\67\2\2\u0220\u0222\5Z.\2\u0221\u0220\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\32\2\2\u0224"+
		"\u0231\3\2\2\2\u0225\u0227\7\b\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7^\2\2\u0229\u022a\5P)\2\u022a\u022c"+
		"\7\22\2\2\u022b\u022d\5V,\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\7?\2\2\u022f\u0231\3\2\2\2\u0230\u021b\3\2"+
		"\2\2\u0230\u0226\3\2\2\2\u0231y\3\2\2\2\u0232\u0233\7_\2\2\u0233\u0239"+
		"\5<\37\2\u0234\u0235\7_\2\2\u0235\u0236\7\67\2\2\u0236\u0237\7\32\2\2"+
		"\u0237\u0239\5<\37\2\u0238\u0232\3\2\2\2\u0238\u0234\3\2\2\2\u0239{\3"+
		"\2\2\2\u023a\u023b\5\2\2\2\u023b\u023c\5r:\2\u023c}\3\2\2\2\u023d\u023e"+
		"\5\u0080A\2\u023e\u023f\5\u0084C\2\u023f\u024b\3\2\2\2\u0240\u0241\5\u0080"+
		"A\2\u0241\u0242\7\22\2\2\u0242\u0243\5\u0084C\2\u0243\u0244\7?\2\2\u0244"+
		"\u024b\3\2\2\2\u0245\u0246\5\u0080A\2\u0246\u0247\7\22\2\2\u0247\u0248"+
		"\5\u0082B\2\u0248\u0249\7?\2\2\u0249\u024b\3\2\2\2\u024a\u023d\3\2\2\2"+
		"\u024a\u0240\3\2\2\2\u024a\u0245\3\2\2\2\u024b\177\3\2\2\2\u024c\u024d"+
		"\7 \2\2\u024d\u0081\3\2\2\2\u024e\u0252\5P)\2\u024f\u0251\5\n\6\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0083\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\5v<\2\u0256\u0085"+
		"\3\2\2\2\u0257\u0258\t\34\2\2\u0258\u0087\3\2\2\2\u0259\u025a\bE\1\2\u025a"+
		"\u025b\5\u008eH\2\u025b\u0276\3\2\2\2\u025c\u025d\f\b\2\2\u025d\u025e"+
		"\7\67\2\2\u025e\u025f\5V,\2\u025f\u0260\7\32\2\2\u0260\u0275\3\2\2\2\u0261"+
		"\u0262\f\7\2\2\u0262\u0263\7\22\2\2\u0263\u0264\5\u008aF\2\u0264\u0265"+
		"\7?\2\2\u0265\u0275\3\2\2\2\u0266\u0267\f\6\2\2\u0267\u0269\7\62\2\2\u0268"+
		"\u026a\7]\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u0275\5<\37\2\u026c\u026d\f\5\2\2\u026d\u026f\7\64\2\2\u026e"+
		"\u0270\7]\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0275\5<\37\2\u0272\u0273\f\4\2\2\u0273\u0275\5\u0086D\2\u0274"+
		"\u025c\3\2\2\2\u0274\u0261\3\2\2\2\u0274\u0266\3\2\2\2\u0274\u026c\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0089\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027e\5\u008c"+
		"G\2\u027a\u027b\7\23\2\2\u027b\u027d\5\u008cG\2\u027c\u027a\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282\3\2"+
		"\2\2\u0280\u027e\3\2\2\2\u0281\u0279\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u008b\3\2\2\2\u0283\u0284\5X-\2\u0284\u008d\3\2\2\2\u0285\u028c\5<\37"+
		"\2\u0286\u028c\5\6\4\2\u0287\u0288\7\22\2\2\u0288\u0289\5V,\2\u0289\u028a"+
		"\7?\2\2\u028a\u028c\3\2\2\2\u028b\u0285\3\2\2\2\u028b\u0286\3\2\2\2\u028b"+
		"\u0287\3\2\2\2\u028c\u008f\3\2\2\2I\u009f\u00c9\u00d2\u00dc\u00e3\u00ea"+
		"\u00ee\u00f4\u00f7\u00fa\u00fd\u0104\u0107\u010b\u0117\u011b\u011f\u013c"+
		"\u0140\u0145\u0149\u014d\u0158\u015d\u0160\u0163\u0166\u0173\u0177\u017a"+
		"\u017e\u0183\u0189\u018d\u0192\u0196\u019a\u019e\u01a2\u01a6\u01b2\u01b8"+
		"\u01c1\u01c6\u01cb\u01d0\u01d5\u01da\u01e0\u01e6\u01eb\u01f0\u01f5\u0207"+
		"\u020d\u0218\u021b\u0221\u0226\u022c\u0230\u0238\u024a\u0252\u0269\u026f"+
		"\u0274\u0276\u027e\u0281\u028b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}