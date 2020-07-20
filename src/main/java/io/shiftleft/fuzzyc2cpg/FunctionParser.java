// Generated from /home/machiry/projects/antl4c/src/main/antlr/Function.g4 by ANTLR 4.2.2
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
public class FunctionParser extends Parser {
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
		"'('", "'-='", "','", "'/='", "'typename'", "'>='", "'++'", "'<'", "']'", 
		"'~'", "'dynamic_cast'", "'static'", "'friend'", "'protected'", "'sizeof'", 
		"'+'", "'struct'", "'*='", "'/'", "'&='", "'reinterpret_cast'", "'class'", 
		"'||'", "'>>='", "'inline'", "';'", "'<<'", "'?'", "'enum'", "'<='", "'&'", 
		"'*'", "'.'", "'const_cast'", "'->'", "'explicit'", "':'", "'['", "'--'", 
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
		RULE_statements = 0, RULE_statement = 1, RULE_pre_opener = 2, RULE_pre_else = 3, 
		RULE_pre_closer = 4, RULE_opening_curly = 5, RULE_closing_curly = 6, RULE_block_starter = 7, 
		RULE_selection_or_iteration = 8, RULE_do_statement1 = 9, RULE_for_init_statement = 10, 
		RULE_jump_statement = 11, RULE_label = 12, RULE_expr_statement = 13, RULE_condition = 14, 
		RULE_init_declarator = 15, RULE_declarator = 16, RULE_type_suffix = 17, 
		RULE_simple_decl = 18, RULE_var_decl = 19, RULE_init_declarator_list = 20, 
		RULE_initializer = 21, RULE_initializer_list = 22, RULE_param_decl_specifiers = 23, 
		RULE_parameter_name = 24, RULE_param_type_list = 25, RULE_param_type = 26, 
		RULE_param_type_id = 27, RULE_unary_operator = 28, RULE_relational_operator = 29, 
		RULE_constant = 30, RULE_function_decl_specifiers = 31, RULE_ptr_operator = 32, 
		RULE_access_specifier = 33, RULE_operator = 34, RULE_assignment_operator = 35, 
		RULE_equality_operator = 36, RULE_template_decl = 37, RULE_template_decl_param_list = 38, 
		RULE_template_template = 39, RULE_template_decl_param = 40, RULE_template_decl_keyword = 41, 
		RULE_template_name = 42, RULE_template_args = 43, RULE_template_args_param_list = 44, 
		RULE_template_args_param = 45, RULE_no_brackets = 46, RULE_no_brackets_curlies_or_squares = 47, 
		RULE_no_brackets_or_semicolon = 48, RULE_no_angle_brackets_or_brackets = 49, 
		RULE_no_curlies = 50, RULE_no_squares = 51, RULE_no_squares_or_semicolon = 52, 
		RULE_no_comma_or_semicolon = 53, RULE_assign_water = 54, RULE_assign_water_l2 = 55, 
		RULE_water = 56, RULE_identifier = 57, RULE_number = 58, RULE_ptrs = 59, 
		RULE_func_ptrs = 60, RULE_rvalue_ref = 61, RULE_class_key = 62, RULE_class_def = 63, 
		RULE_class_name = 64, RULE_base_classes = 65, RULE_base_class = 66, RULE_type_name = 67, 
		RULE_base_type = 68, RULE_gcc_attribute = 69, RULE_expr = 70, RULE_assign_expr = 71, 
		RULE_conditional_expression = 72, RULE_or_expression = 73, RULE_and_expression = 74, 
		RULE_inclusive_or_expression = 75, RULE_exclusive_or_expression = 76, 
		RULE_bit_and_expression = 77, RULE_equality_expression = 78, RULE_relational_expression = 79, 
		RULE_shift_expression = 80, RULE_additive_expression = 81, RULE_multiplicative_expression = 82, 
		RULE_cpp_cast_identifier = 83, RULE_cast_expression = 84, RULE_cast_target = 85, 
		RULE_unary_expression = 86, RULE_new_expression = 87, RULE_delete_expression = 88, 
		RULE_unary_op_and_cast_expr = 89, RULE_sizeof_expression = 90, RULE_sizeof = 91, 
		RULE_sizeof_operand = 92, RULE_sizeof_operand2 = 93, RULE_inc_dec = 94, 
		RULE_postfix_expression = 95, RULE_function_argument_list = 96, RULE_function_argument = 97, 
		RULE_primary_expression = 98;
	public static final String[] ruleNames = {
		"statements", "statement", "pre_opener", "pre_else", "pre_closer", "opening_curly", 
		"closing_curly", "block_starter", "selection_or_iteration", "do_statement1", 
		"for_init_statement", "jump_statement", "label", "expr_statement", "condition", 
		"init_declarator", "declarator", "type_suffix", "simple_decl", "var_decl", 
		"init_declarator_list", "initializer", "initializer_list", "param_decl_specifiers", 
		"parameter_name", "param_type_list", "param_type", "param_type_id", "unary_operator", 
		"relational_operator", "constant", "function_decl_specifiers", "ptr_operator", 
		"access_specifier", "operator", "assignment_operator", "equality_operator", 
		"template_decl", "template_decl_param_list", "template_template", "template_decl_param", 
		"template_decl_keyword", "template_name", "template_args", "template_args_param_list", 
		"template_args_param", "no_brackets", "no_brackets_curlies_or_squares", 
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
	public String getGrammarFileName() { return "Function.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public void preProcSkipToEnd() {
	        Stack<Object> CurlyStack = new Stack<>();
	        Object o = new Object();
	        int t = _input.LA(1);

	        while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){

	            if(t == PRE_IF) CurlyStack.push(o);
	            else if(t == PRE_ENDIF) CurlyStack.pop();

	            consume();
	            t = _input.LA(1);
	        }
	        if(t != EOF) consume();
	   }



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


	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public Pre_openerContext pre_opener(int i) {
			return getRuleContext(Pre_openerContext.class,i);
		}
		public List<Pre_closerContext> pre_closer() {
			return getRuleContexts(Pre_closerContext.class);
		}
		public List<Pre_elseContext> pre_else() {
			return getRuleContexts(Pre_elseContext.class);
		}
		public Pre_elseContext pre_else(int i) {
			return getRuleContext(Pre_elseContext.class,i);
		}
		public Pre_closerContext pre_closer(int i) {
			return getRuleContext(Pre_closerContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<Pre_openerContext> pre_opener() {
			return getRuleContexts(Pre_openerContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(204);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(198); pre_opener();
					}
					break;

				case 2:
					{
					setState(199); pre_closer();
					}
					break;

				case 3:
					{
					setState(200); pre_else();
					preProcSkipToEnd(); 
					}
					break;

				case 4:
					{
					setState(203); statement();
					}
					break;
				}
				}
				setState(208);
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

	public static class StatementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public Closing_curlyContext closing_curly() {
			return getRuleContext(Closing_curlyContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Block_starterContext block_starter() {
			return getRuleContext(Block_starterContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public Opening_curlyContext opening_curly() {
			return getRuleContext(Opening_curlyContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); opening_curly();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); closing_curly();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); block_starter();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212); jump_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213); label();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214); simple_decl();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215); expr_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(216); water();
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

	public static class Pre_openerContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public Pre_openerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_opener; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_opener(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_opener(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_opener(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_openerContext pre_opener() throws RecognitionException {
		Pre_openerContext _localctx = new Pre_openerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(PRE_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_elseContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public Pre_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_elseContext pre_else() throws RecognitionException {
		Pre_elseContext _localctx = new Pre_elseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(PRE_ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_closerContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Pre_closerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_closer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_closer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_closer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_closer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_closerContext pre_closer() throws RecognitionException {
		Pre_closerContext _localctx = new Pre_closerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(PRE_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Opening_curlyContext extends ParserRuleContext {
		public Opening_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOpening_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOpening_curly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOpening_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opening_curlyContext opening_curly() throws RecognitionException {
		Opening_curlyContext _localctx = new Opening_curlyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opening_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(OPENING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closing_curlyContext extends ParserRuleContext {
		public Closing_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClosing_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClosing_curly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClosing_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closing_curlyContext closing_curly() throws RecognitionException {
		Closing_curlyContext _localctx = new Closing_curlyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_closing_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(CLOSING_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_starterContext extends ParserRuleContext {
		public Selection_or_iterationContext selection_or_iteration() {
			return getRuleContext(Selection_or_iterationContext.class,0);
		}
		public Block_starterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_starter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBlock_starter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBlock_starter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBlock_starter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_starterContext block_starter() throws RecognitionException {
		Block_starterContext _localctx = new Block_starterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); selection_or_iteration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_or_iterationContext extends ParserRuleContext {
		public Selection_or_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_or_iteration; }
	 
		public Selection_or_iterationContext() { }
		public void copyFrom(Selection_or_iterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_statementContext extends Selection_or_iterationContext {
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public Try_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statementContext extends Selection_or_iterationContext {
		public TerminalNode IF() { return getToken(FunctionParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Catch_statementContext extends Selection_or_iterationContext {
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
		public Catch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_statementContext extends Selection_or_iterationContext {
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(FunctionParser.FOR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public For_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Else_statementContext extends Selection_or_iterationContext {
		public TerminalNode ELSE() { return getToken(FunctionParser.ELSE, 0); }
		public Else_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_statementContext extends Selection_or_iterationContext {
		public TerminalNode SWITCH() { return getToken(FunctionParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Switch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Do_statementContext extends Selection_or_iterationContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public Do_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statementContext extends Selection_or_iterationContext {
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_or_iterationContext selection_or_iteration() throws RecognitionException {
		Selection_or_iterationContext _localctx = new Selection_or_iterationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selection_or_iteration);
		int _la;
		try {
			setState(270);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232); match(CATCH);
				setState(233); match(16);
				setState(236);
				switch (_input.LA(1)) {
				case 15:
				case 32:
				case 37:
				case 44:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case REGISTER:
				case ALPHA_NUMERIC:
					{
					setState(234); param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(235); match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(238); match(61);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239); match(IF);
				setState(240); match(16);
				setState(241); condition();
				setState(242); match(61);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244); match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245); match(SWITCH);
				setState(246); match(16);
				setState(247); condition();
				setState(248); match(61);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(250); match(FOR);
				setState(251); match(16);
				setState(254);
				switch (_input.LA(1)) {
				case 2:
				case 6:
				case 15:
				case 16:
				case 22:
				case 25:
				case 26:
				case 29:
				case 30:
				case 31:
				case 32:
				case 36:
				case 37:
				case 44:
				case 46:
				case 47:
				case 49:
				case 54:
				case 57:
				case 59:
				case 62:
				case 63:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case TEMPLATE:
				case NEW:
				case DELETE:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case MULTILINE_STRING:
					{
					setState(252); for_init_statement();
					}
					break;
				case 41:
					{
					setState(253); match(41);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(257);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 15) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 36) | (1L << 37) | (1L << 44) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (NEW - 77)) | (1L << (DELETE - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (BINARY_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)) | (1L << (MULTILINE_STRING - 77)))) != 0)) {
					{
					setState(256); condition();
					}
				}

				setState(259); match(41);
				setState(261);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(260); expr();
					}
				}

				setState(263); match(61);
				}
				break;
			case DO:
				_localctx = new Do_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(264); match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(265); match(WHILE);
				setState(266); match(16);
				setState(267); condition();
				setState(268); match(61);
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

	public static class Do_statement1Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public Do_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDo_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statement1Context do_statement1() throws RecognitionException {
		Do_statement1Context _localctx = new Do_statement1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_statement1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(DO);
			setState(273); statement();
			setState(274); match(WHILE);
			setState(275); match(16);
			setState(276); expr();
			setState(277); match(61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_init_statementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_init_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFor_init_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_init_statement);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); simple_decl();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); expr();
				setState(281); match(41);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThrowStatementContext extends Jump_statementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THROW() { return getToken(FunctionParser.THROW, 0); }
		public ThrowStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(FunctionParser.BREAK, 0); }
		public BreakStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(FunctionParser.CONTINUE, 0); }
		public ContinueStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(FunctionParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(FunctionParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jump_statement);
		int _la;
		try {
			setState(303);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(BREAK);
				setState(286); match(41);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287); match(CONTINUE);
				setState(288); match(41);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289); match(GOTO);
				setState(290); identifier();
				setState(291); match(41);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293); match(RETURN);
				setState(295);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(294); expr();
					}
				}

				setState(297); match(41);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298); match(THROW);
				setState(300);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(299); expr();
					}
				}

				setState(302); match(41);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(FunctionParser.CASE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(305); match(CASE);
				}
			}

			setState(311);
			switch (_input.LA(1)) {
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				{
				setState(308); identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(309); number();
				}
				break;
			case CHAR:
				{
				setState(310); match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313); match(52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExpr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(315); expr();
				}
			}

			setState(318); match(41);
			}
		}
		catch (RecognitionException re) {
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); expr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); type_name();
				setState(322); declarator();
				setState(323); match(10);
				setState(324); assign_expr();
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclWithAssignContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclWithAssignContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclWithAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclWithCallContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitDeclWithCallContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclWithCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_init_declarator);
		int _la;
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328); declarator();
				setState(329); match(16);
				setState(331);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(330); expr();
					}
				}

				setState(333); match(61);
				}
				break;

			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335); declarator();
				setState(336); match(10);
				setState(337); initializer();
				}
				break;

			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339); declarator();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declarator);
		int _la;
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0)) {
					{
					setState(342); ptrs();
					}
				}

				setState(345); identifier();
				setState(347);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(346); template_args();
					}
				}

				setState(350);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(349); type_suffix();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0)) {
					{
					setState(352); ptrs();
					}
				}

				setState(355); match(16);
				setState(356); func_ptrs();
				setState(357); identifier();
				setState(358); match(61);
				setState(359); type_suffix();
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

	public static class Type_suffixContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitType_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_suffix);
		int _la;
		try {
			setState(369);
			switch (_input.LA(1)) {
			case 53:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(363); match(53);
				setState(365);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(364); conditional_expression();
					}
				}

				setState(367); match(24);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); param_type_list();
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

	public static class Simple_declContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSimple_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSimple_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(372);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(371); match(TYPEDEF);
				}
			}

			}
			setState(374); var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclByClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclByType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var_decl);
		int _la;
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376); class_def();
				setState(378);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(377); init_declarator_list();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(380); template_decl();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386); type_name();
				setState(387); init_declarator_list();
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391); init_declarator();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(392); match(18);
				setState(393); init_declarator();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399); match(41);
			}
		}
		catch (RecognitionException re) {
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
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initializer);
		try {
			setState(406);
			switch (_input.LA(1)) {
			case 2:
			case 6:
			case 16:
			case 22:
			case 25:
			case 26:
			case 29:
			case 30:
			case 31:
			case 36:
			case 46:
			case 47:
			case 49:
			case 54:
			case 57:
			case 59:
			case 62:
			case 63:
			case NEW:
			case DELETE:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); match(OPENING_CURLY);
				setState(403); initializer_list();
				setState(404); match(CLOSING_CURLY);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); initializer();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(409); match(18);
				setState(410); initializer();
				}
				}
				setState(415);
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

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(FunctionParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(FunctionParser.REGISTER, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(419); type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_listContext extends ParserRuleContext {
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_param_type_list);
		int _la;
		try {
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423); match(16);
				setState(424); match(VOID);
				setState(425); match(61);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); match(16);
				setState(435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 32) | (1L << 37) | (1L << 44))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(427); param_type();
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(428); match(18);
						setState(429); param_type();
						}
						}
						setState(434);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(437); match(61);
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

	public static class Param_typeContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440); param_decl_specifiers();
			setState(441); param_type_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_idContext extends ParserRuleContext {
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Rvalue_refContext rvalue_ref() {
			return getRuleContext(Rvalue_refContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			switch (_input.LA(1)) {
			case 46:
			case 47:
			case CV_QUALIFIER:
				{
				setState(443); ptrs();
				}
				break;
			case 7:
				{
				setState(444); rvalue_ref();
				}
				break;
			case 2:
			case 16:
			case 18:
			case 29:
			case 53:
			case 57:
			case 61:
			case ALPHA_NUMERIC:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(447); match(16);
				setState(448); param_type_id();
				setState(449); match(61);
				}
				break;

			case 2:
				{
				setState(452);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(451); parameter_name();
					}
				}

				}
				break;
			}
			setState(457);
			_la = _input.LA(1);
			if (_la==16 || _la==53) {
				{
				setState(456); type_suffix();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(FunctionParser.MULTILINE_STRING, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(FunctionParser.BINARY_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(FunctionParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (27 - 27)) | (1L << (28 - 27)) | (1L << (40 - 27)) | (1L << (51 - 27)) | (1L << (VIRTUAL - 27)))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operator);
		int _la;
		try {
			setState(516);
			switch (_input.LA(1)) {
			case NEW:
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==NEW || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(474);
				_la = _input.LA(1);
				if (_la==53) {
					{
					setState(472); match(53);
					setState(473); match(24);
					}
				}

				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); match(31);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 3);
				{
				setState(477); match(63);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 4);
				{
				setState(478); match(47);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 5);
				{
				setState(479); match(34);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 6);
				{
				setState(480); match(60);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 7);
				{
				setState(481); match(12);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 8);
				{
				setState(482); match(46);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 9);
				{
				setState(483); match(56);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 10);
				{
				setState(484); match(25);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 11);
				{
				setState(485); match(59);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 12);
				{
				setState(486); match(10);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 13);
				{
				setState(487); match(23);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 14);
				{
				setState(488); match(58);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 15);
				{
				setState(489); match(1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 16);
				{
				setState(490); match(17);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 17);
				{
				setState(491); match(33);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 18);
				{
				setState(492); match(19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 19);
				{
				setState(493); match(3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 20);
				{
				setState(494); match(9);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 21);
				{
				setState(495); match(35);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 22);
				{
				setState(496); match(14);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 23);
				{
				setState(497); match(8);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 24);
				{
				setState(498); match(42);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 25);
				{
				setState(499); match(39);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 26);
				{
				setState(500); match(11);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 27);
				{
				setState(501); match(55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 28);
				{
				setState(502); match(4);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 29);
				{
				setState(503); match(45);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 30);
				{
				setState(504); match(21);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 31);
				{
				setState(505); match(7);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 32);
				{
				setState(506); match(38);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 33);
				{
				setState(507); match(22);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 34);
				{
				setState(508); match(54);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 35);
				{
				setState(509); match(18);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 36);
				{
				setState(510); match(13);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 37);
				{
				setState(511); match(50);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 38);
				{
				setState(512); match(16);
				setState(513); match(61);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 39);
				{
				setState(514); match(53);
				setState(515); match(24);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 39))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); match(TEMPLATE);
			setState(523); match(23);
			setState(525);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 20) | (1L << 29) | (1L << 37) | (1L << 57))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CV_QUALIFIER - 81)) | (1L << (TEMPLATE - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
				{
				setState(524); template_decl_param_list(0);
				}
			}

			setState(527); match(58);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(530); template_template();
				setState(531); template_decl_keyword();
				setState(532); template_name();
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
				setState(534); template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(537);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(538); match(18);
					setState(539); template_decl_param();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_decl_keywordContext template_decl_keyword(int i) {
			return getRuleContext(Template_decl_keywordContext.class,i);
		}
		public Template_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(TEMPLATE);
			setState(546); match(23);
			setState(551); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(547); template_decl_keyword();
				setState(549);
				_la = _input.LA(1);
				if (_la==18) {
					{
					setState(548); match(18);
					}
				}

				}
				}
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==20 || _la==37 );
			setState(555); match(58);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			switch (_input.LA(1)) {
			case 20:
			case 37:
				{
				setState(557); template_decl_keyword();
				}
				break;
			case 2:
			case 29:
			case 57:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(559);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(558); match(CV_QUALIFIER);
					}
				}

				setState(561); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(564); template_name();
				}
				break;
			}
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(567); ptr_operator();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(572); match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(575); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(577); match(ELLIPSIS);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); match(23);
			setState(582);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
				{
				setState(581); template_args_param_list(0);
				}
			}

			setState(584); match(58);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(587); template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(589);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(590); match(18);
					setState(591); template_args_param();
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(597); match(CV_QUALIFIER);
				}
			}

			setState(600); base_type();
			setState(602);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(601); ptr_operator();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 41) | (1L << 61))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 24) | (1L << 41) | (1L << 53))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==18 || _la==41) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 18) | (1L << 24) | (1L << 41) | (1L << 53) | (1L << 61))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifier);
		try {
			int _alt;
			setState(635);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(626); match(ALPHA_NUMERIC);
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627); match(6);
						setState(628); match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				}
				break;
			case 2:
			case 29:
			case 57:
				enterOuterAlt(_localctx, 2);
				{
				setState(634); access_specifier();
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(640);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(639); match(CV_QUALIFIER);
					}
				}

				setState(642); ptr_operator();
				setState(644);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(643); match(5);
					}
				}

				}
				}
				setState(648); 
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650); ptrs();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); match(7);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Gcc_attributeContext gcc_attribute() {
			return getRuleContext(Gcc_attributeContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(656); template_decl();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662); class_key();
			setState(664);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(663); gcc_attribute();
				}
			}

			setState(667);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(666); class_name();
				}
			}

			setState(670);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(669); template_args();
				}
			}

			setState(673);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(672); base_classes();
				}
			}

			setState(675); match(OPENING_CURLY);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); identifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(52);
			setState(681); base_class();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(682); match(18);
				setState(683); base_class();
				}
				}
				setState(688);
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
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(689); match(VIRTUAL);
				}
			}

			setState(693);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(692); access_specifier();
				}
				break;
			}
			setState(695); identifier();
			setState(697);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(696); template_args();
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
		public TerminalNode SIGNED() { return getToken(FunctionParser.SIGNED, 0); }
		public Template_argsContext template_args(int i) {
			return getRuleContext(Template_argsContext.class,i);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode UNSIGNED() { return getToken(FunctionParser.UNSIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_type_name);
		int _la;
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(699); match(CV_QUALIFIER);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				switch (_input.LA(1)) {
				case 15:
				case 32:
				case 37:
				case 44:
					{
					setState(705); class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(706); match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(707); match(SIGNED);
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
				setState(710); base_type();
				setState(712);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(711); template_args();
					}
				}

				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==6) {
					{
					{
					setState(714); match(6);
					setState(715); base_type();
					setState(717);
					_la = _input.LA(1);
					if (_la==23) {
						{
						setState(716); template_args();
						}
					}

					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(725);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(724); match(CV_QUALIFIER);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727); match(UNSIGNED);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728); match(SIGNED);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public TerminalNode ELLIPSIS(int i) {
			return getToken(FunctionParser.ELLIPSIS, i);
		}
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> LONG() { return getTokens(FunctionParser.LONG); }
		public List<TerminalNode> ELLIPSIS() { return getTokens(FunctionParser.ELLIPSIS); }
		public List<TerminalNode> AUTO() { return getTokens(FunctionParser.AUTO); }
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode LONG(int i) {
			return getToken(FunctionParser.LONG, i);
		}
		public TerminalNode AUTO(int i) {
			return getToken(FunctionParser.AUTO, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(735); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(731);
					_la = _input.LA(1);
					if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(733);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(732); match(ELLIPSIS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(737); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		public TerminalNode GCC_ATTRIBUTE() { return getToken(FunctionParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(GCC_ATTRIBUTE);
			setState(740); match(16);
			setState(741); match(16);
			setState(742); identifier();
			setState(743); match(61);
			setState(744); match(61);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); assign_expr();
			setState(749);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(747); match(18);
				setState(748); expr();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); conditional_expression();
			setState(755);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 39))) != 0)) {
				{
				setState(752); assignment_operator();
				setState(753); assign_expr();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNormOr(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_conditional_expression);
		try {
			setState(764);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(757); or_expression();
				}
				break;

			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(758); or_expression();
				{
				setState(759); match(43);
				setState(760); expr();
				setState(761); match(52);
				setState(762); conditional_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); and_expression();
			setState(769);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(767); match(38);
				setState(768); or_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); inclusive_or_expression();
			setState(774);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(772); match(7);
				setState(773); and_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); exclusive_or_expression();
			setState(779);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(777); match(56);
				setState(778); inclusive_or_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781); bit_and_expression();
			setState(784);
			_la = _input.LA(1);
			if (_la==12) {
				{
				setState(782); match(12);
				setState(783); exclusive_or_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786); equality_expression();
			setState(789);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(787); match(46);
				setState(788); bit_and_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); relational_expression();
			setState(795);
			_la = _input.LA(1);
			if (_la==4 || _la==55) {
				{
				setState(792); equality_operator();
				setState(793); equality_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); shift_expression();
			setState(801);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 23) | (1L << 45) | (1L << 58))) != 0)) {
				{
				setState(798); relational_operator();
				setState(799); relational_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); additive_expression();
			setState(806);
			_la = _input.LA(1);
			if (_la==8 || _la==42) {
				{
				setState(804);
				_la = _input.LA(1);
				if ( !(_la==8 || _la==42) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(805); shift_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); multiplicative_expression();
			setState(811);
			_la = _input.LA(1);
			if (_la==31 || _la==63) {
				{
				setState(809);
				_la = _input.LA(1);
				if ( !(_la==31 || _la==63) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(810); additive_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813); cast_expression();
			setState(816);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) {
				{
				setState(814);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(815); multiplicative_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCpp_cast_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCpp_cast_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCpp_cast_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_cast_identifierContext cpp_cast_identifier() throws RecognitionException {
		Cpp_cast_identifierContext _localctx = new Cpp_cast_identifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cpp_cast_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cast_expression);
		try {
			setState(834);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(820); match(16);
				setState(821); cast_target();
				setState(822); match(61);
				setState(823); cast_expression();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825); cpp_cast_identifier();
				setState(826); match(23);
				setState(827); cast_target();
				setState(828); match(58);
				setState(829); match(16);
				setState(830); cast_expression();
				setState(831); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833); unary_expression();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); type_name();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(837); ptr_operator();
				}
				}
				setState(842);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unary_expression);
		try {
			setState(851);
			switch (_input.LA(1)) {
			case 22:
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(843); inc_dec();
				setState(844); cast_expression();
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
				setState(846); unary_op_and_cast_expr();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 3);
				{
				setState(847); sizeof_expression();
				}
				break;
			case 6:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(848); new_expression();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(849); delete_expression();
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
				setState(850); postfix_expression(0);
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
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_new_expression);
		int _la;
		try {
			setState(875);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(853); match(6);
					}
				}

				setState(856); match(NEW);
				setState(857); type_name();
				setState(858); match(53);
				setState(860);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(859); conditional_expression();
					}
				}

				setState(862); match(24);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				_la = _input.LA(1);
				if (_la==6) {
					{
					setState(864); match(6);
					}
				}

				setState(867); match(NEW);
				setState(868); type_name();
				setState(869); match(16);
				setState(871);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(870); expr();
					}
				}

				setState(873); match(61);
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
		public TerminalNode DELETE() { return getToken(FunctionParser.DELETE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Delete_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDelete_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDelete_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDelete_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_expressionContext delete_expression() throws RecognitionException {
		Delete_expressionContext _localctx = new Delete_expressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_delete_expression);
		try {
			setState(883);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877); match(DELETE);
				setState(878); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879); match(DELETE);
				setState(880); match(53);
				setState(881); match(24);
				setState(882); identifier();
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); unary_operator();
			setState(886); cast_expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sizeof_expression);
		try {
			setState(901);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888); sizeof();
				setState(889); sizeof_operand2();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891); sizeof();
				setState(892); match(16);
				setState(893); sizeof_operand2();
				setState(894); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896); sizeof();
				setState(897); match(16);
				setState(898); sizeof_operand();
				setState(899); match(61);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); match(30);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); type_name();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(906); ptr_operator();
				}
				}
				setState(911);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912); unary_expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitMemberAccess(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIncDecOp(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPrimaryOnly(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFuncCall(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(917); primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(945);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(943);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(919);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(920); match(53);
						setState(921); expr();
						setState(922); match(24);
						}
						break;

					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(924);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(925); match(16);
						setState(926); function_argument_list();
						setState(927); match(61);
						}
						break;

					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(929);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(930); match(48);
						setState(932);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(931); match(TEMPLATE);
							}
						}

						{
						setState(934); identifier();
						}
						}
						break;

					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(935);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(936); match(50);
						setState(938);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(937); match(TEMPLATE);
							}
						}

						{
						setState(940); identifier();
						}
						}
						break;

					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(941);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(942); inc_dec();
						}
						break;
					}
					} 
				}
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(948); function_argument();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==18) {
					{
					{
					setState(949); match(18);
					setState(950); function_argument();
					}
					}
					setState(955);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); assign_expr();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_primary_expression);
		try {
			setState(966);
			switch (_input.LA(1)) {
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(960); identifier();
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
				setState(961); constant();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(962); match(16);
				setState(963); expr();
				setState(964); match(61);
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
		case 38: return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);

		case 44: return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);

		case 95: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u03cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00cf\n\2\f\2"+
		"\16\2\u00d2\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00dc\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ef"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0101\n\n\3\n\5\n\u0104\n\n\3\n\3\n\5\n\u0108\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0111\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u011e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u012a"+
		"\n\r\3\r\3\r\3\r\5\r\u012f\n\r\3\r\5\r\u0132\n\r\3\16\5\16\u0135\n\16"+
		"\3\16\3\16\3\16\5\16\u013a\n\16\3\16\3\16\3\17\5\17\u013f\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0149\n\20\3\21\3\21\3\21\5\21"+
		"\u014e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0157\n\21\3\22\5"+
		"\22\u015a\n\22\3\22\3\22\5\22\u015e\n\22\3\22\5\22\u0161\n\22\3\22\5\22"+
		"\u0164\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u016c\n\22\3\23\3\23\5"+
		"\23\u0170\n\23\3\23\3\23\5\23\u0174\n\23\3\24\5\24\u0177\n\24\3\24\3\24"+
		"\3\25\3\25\5\25\u017d\n\25\3\25\7\25\u0180\n\25\f\25\16\25\u0183\13\25"+
		"\3\25\3\25\3\25\5\25\u0188\n\25\3\26\3\26\3\26\7\26\u018d\n\26\f\26\16"+
		"\26\u0190\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u0199\n\27\3\30"+
		"\3\30\3\30\7\30\u019e\n\30\f\30\16\30\u01a1\13\30\3\31\5\31\u01a4\n\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01b1\n\33"+
		"\f\33\16\33\u01b4\13\33\5\33\u01b6\n\33\3\33\5\33\u01b9\n\33\3\34\3\34"+
		"\3\34\3\35\3\35\5\35\u01c0\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u01c7\n"+
		"\35\5\35\u01c9\n\35\3\35\5\35\u01cc\n\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3$\5$\u01dd\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u0207\n$\3%\3%\3&\3&\3\'\3\'\3\'\5\'\u0210\n\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u021a\n(\3(\3(\3(\7(\u021f\n(\f(\16(\u0222"+
		"\13(\3)\3)\3)\3)\5)\u0228\n)\6)\u022a\n)\r)\16)\u022b\3)\3)\3*\3*\5*\u0232"+
		"\n*\3*\5*\u0235\n*\3*\5*\u0238\n*\3*\5*\u023b\n*\3+\3+\3,\6,\u0240\n,"+
		"\r,\16,\u0241\3,\5,\u0245\n,\3-\3-\5-\u0249\n-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\7.\u0253\n.\f.\16.\u0256\13.\3/\5/\u0259\n/\3/\3/\5/\u025d\n/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3;\7;\u0278\n;\f;\16;\u027b\13;\3;\5;\u027e"+
		"\n;\3<\3<\3=\5=\u0283\n=\3=\3=\5=\u0287\n=\6=\u0289\n=\r=\16=\u028a\3"+
		">\3>\3?\3?\3@\3@\3A\7A\u0294\nA\fA\16A\u0297\13A\3A\3A\5A\u029b\nA\3A"+
		"\5A\u029e\nA\3A\5A\u02a1\nA\3A\5A\u02a4\nA\3A\3A\3A\3B\3B\3C\3C\3C\3C"+
		"\7C\u02af\nC\fC\16C\u02b2\13C\3D\5D\u02b5\nD\3D\5D\u02b8\nD\3D\3D\5D\u02bc"+
		"\nD\3E\7E\u02bf\nE\fE\16E\u02c2\13E\3E\3E\3E\5E\u02c7\nE\3E\3E\5E\u02cb"+
		"\nE\3E\3E\3E\5E\u02d0\nE\7E\u02d2\nE\fE\16E\u02d5\13E\3E\5E\u02d8\nE\3"+
		"E\3E\5E\u02dc\nE\3F\3F\5F\u02e0\nF\6F\u02e2\nF\rF\16F\u02e3\3G\3G\3G\3"+
		"G\3G\3G\3G\3H\3H\3H\5H\u02f0\nH\3I\3I\3I\3I\5I\u02f6\nI\3J\3J\3J\3J\3"+
		"J\3J\3J\5J\u02ff\nJ\3K\3K\3K\5K\u0304\nK\3L\3L\3L\5L\u0309\nL\3M\3M\3"+
		"M\5M\u030e\nM\3N\3N\3N\5N\u0313\nN\3O\3O\3O\5O\u0318\nO\3P\3P\3P\3P\5"+
		"P\u031e\nP\3Q\3Q\3Q\3Q\5Q\u0324\nQ\3R\3R\3R\5R\u0329\nR\3S\3S\3S\5S\u032e"+
		"\nS\3T\3T\3T\5T\u0333\nT\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\5V\u0345\nV\3W\3W\7W\u0349\nW\fW\16W\u034c\13W\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\5X\u0356\nX\3Y\5Y\u0359\nY\3Y\3Y\3Y\3Y\5Y\u035f\nY\3Y\3Y\3Y\5Y\u0364"+
		"\nY\3Y\3Y\3Y\3Y\5Y\u036a\nY\3Y\3Y\5Y\u036e\nY\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0376"+
		"\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0388"+
		"\n\\\3]\3]\3^\3^\7^\u038e\n^\f^\16^\u0391\13^\3_\3_\3`\3`\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u03a7\na\3a\3a\3a\3a\5a\u03ad"+
		"\na\3a\3a\3a\7a\u03b2\na\fa\16a\u03b5\13a\3b\3b\3b\7b\u03ba\nb\fb\16b"+
		"\u03bd\13b\5b\u03bf\nb\3c\3c\3d\3d\3d\3d\3d\3d\5d\u03c9\nd\3d\2\5NZ\u00c0"+
		"e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\2\36\3\2Z[\7\2\33\33!!\60\61==AA\6\2\27"+
		"\27\31\31//<<\3\2ho\6\2\35\36**\65\65TT\3\2\60\61\5\2\4\4\37\37;;\3\2"+
		"^_\13\2\3\3\5\5\13\r\20\20\23\23\25\25##%%))\4\2\6\699\4\2\26\26\'\'\4"+
		"\2\22\22??\7\2\22\22\32\32\67\67??bc\5\2\22\22++??\6\2\22\22\31\31<<?"+
		"?\3\2bc\4\2\32\32\67\67\5\2\32\32++\67\67\4\2\24\24++\t\2\22\22\24\24"+
		"\32\32++\67\67??bc\3\2hj\6\2\21\21\"\"\'\'..\6\2OORRZZaa\4\2\n\n,,\4\2"+
		"!!AA\5\2$$\61\61>>\6\2\34\34&&\63\63@@\4\2\30\3088\u041c\2\u00d0\3\2\2"+
		"\2\4\u00db\3\2\2\2\6\u00dd\3\2\2\2\b\u00df\3\2\2\2\n\u00e1\3\2\2\2\f\u00e3"+
		"\3\2\2\2\16\u00e5\3\2\2\2\20\u00e7\3\2\2\2\22\u0110\3\2\2\2\24\u0112\3"+
		"\2\2\2\26\u011d\3\2\2\2\30\u0131\3\2\2\2\32\u0134\3\2\2\2\34\u013e\3\2"+
		"\2\2\36\u0148\3\2\2\2 \u0156\3\2\2\2\"\u016b\3\2\2\2$\u0173\3\2\2\2&\u0176"+
		"\3\2\2\2(\u0187\3\2\2\2*\u0189\3\2\2\2,\u0198\3\2\2\2.\u019a\3\2\2\2\60"+
		"\u01a3\3\2\2\2\62\u01a7\3\2\2\2\64\u01b8\3\2\2\2\66\u01ba\3\2\2\28\u01bf"+
		"\3\2\2\2:\u01cd\3\2\2\2<\u01cf\3\2\2\2>\u01d1\3\2\2\2@\u01d3\3\2\2\2B"+
		"\u01d5\3\2\2\2D\u01d7\3\2\2\2F\u0206\3\2\2\2H\u0208\3\2\2\2J\u020a\3\2"+
		"\2\2L\u020c\3\2\2\2N\u0219\3\2\2\2P\u0223\3\2\2\2R\u0234\3\2\2\2T\u023c"+
		"\3\2\2\2V\u023f\3\2\2\2X\u0246\3\2\2\2Z\u024c\3\2\2\2\\\u0258\3\2\2\2"+
		"^\u025e\3\2\2\2`\u0260\3\2\2\2b\u0262\3\2\2\2d\u0264\3\2\2\2f\u0266\3"+
		"\2\2\2h\u0268\3\2\2\2j\u026a\3\2\2\2l\u026c\3\2\2\2n\u026e\3\2\2\2p\u0270"+
		"\3\2\2\2r\u0272\3\2\2\2t\u027d\3\2\2\2v\u027f\3\2\2\2x\u0288\3\2\2\2z"+
		"\u028c\3\2\2\2|\u028e\3\2\2\2~\u0290\3\2\2\2\u0080\u0295\3\2\2\2\u0082"+
		"\u02a8\3\2\2\2\u0084\u02aa\3\2\2\2\u0086\u02b4\3\2\2\2\u0088\u02db\3\2"+
		"\2\2\u008a\u02e1\3\2\2\2\u008c\u02e5\3\2\2\2\u008e\u02ec\3\2\2\2\u0090"+
		"\u02f1\3\2\2\2\u0092\u02fe\3\2\2\2\u0094\u0300\3\2\2\2\u0096\u0305\3\2"+
		"\2\2\u0098\u030a\3\2\2\2\u009a\u030f\3\2\2\2\u009c\u0314\3\2\2\2\u009e"+
		"\u0319\3\2\2\2\u00a0\u031f\3\2\2\2\u00a2\u0325\3\2\2\2\u00a4\u032a\3\2"+
		"\2\2\u00a6\u032f\3\2\2\2\u00a8\u0334\3\2\2\2\u00aa\u0344\3\2\2\2\u00ac"+
		"\u0346\3\2\2\2\u00ae\u0355\3\2\2\2\u00b0\u036d\3\2\2\2\u00b2\u0375\3\2"+
		"\2\2\u00b4\u0377\3\2\2\2\u00b6\u0387\3\2\2\2\u00b8\u0389\3\2\2\2\u00ba"+
		"\u038b\3\2\2\2\u00bc\u0392\3\2\2\2\u00be\u0394\3\2\2\2\u00c0\u0396\3\2"+
		"\2\2\u00c2\u03be\3\2\2\2\u00c4\u03c0\3\2\2\2\u00c6\u03c8\3\2\2\2\u00c8"+
		"\u00cf\5\6\4\2\u00c9\u00cf\5\n\6\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\b\2"+
		"\1\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5\4\3\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\3\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00dc\5\f\7\2\u00d4\u00dc\5\16\b\2\u00d5\u00dc\5\20\t\2"+
		"\u00d6\u00dc\5\30\r\2\u00d7\u00dc\5\32\16\2\u00d8\u00dc\5&\24\2\u00d9"+
		"\u00dc\5\34\17\2\u00da\u00dc\5r:\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\5\3\2\2\2"+
		"\u00dd\u00de\7d\2\2\u00de\7\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\t\3\2\2\2"+
		"\u00e1\u00e2\7f\2\2\u00e2\13\3\2\2\2\u00e3\u00e4\7b\2\2\u00e4\r\3\2\2"+
		"\2\u00e5\u00e6\7c\2\2\u00e6\17\3\2\2\2\u00e7\u00e8\5\22\n\2\u00e8\21\3"+
		"\2\2\2\u00e9\u0111\7U\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ee\7\22\2\2\u00ec"+
		"\u00ef\5\66\34\2\u00ed\u00ef\7s\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u0111\7?\2\2\u00f1\u00f2\7B\2\2\u00f2"+
		"\u00f3\7\22\2\2\u00f3\u00f4\5\36\20\2\u00f4\u00f5\7?\2\2\u00f5\u0111\3"+
		"\2\2\2\u00f6\u0111\7C\2\2\u00f7\u00f8\7I\2\2\u00f8\u00f9\7\22\2\2\u00f9"+
		"\u00fa\5\36\20\2\u00fa\u00fb\7?\2\2\u00fb\u0111\3\2\2\2\u00fc\u00fd\7"+
		"D\2\2\u00fd\u0100\7\22\2\2\u00fe\u0101\5\26\f\2\u00ff\u0101\7+\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5\36"+
		"\20\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\7+\2\2\u0106\u0108\5\u008eH\2\u0107\u0106\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u0111\7?\2\2\u010a\u0111\7J\2\2\u010b"+
		"\u010c\7E\2\2\u010c\u010d\7\22\2\2\u010d\u010e\5\36\20\2\u010e\u010f\7"+
		"?\2\2\u010f\u0111\3\2\2\2\u0110\u00e9\3\2\2\2\u0110\u00ea\3\2\2\2\u0110"+
		"\u00f1\3\2\2\2\u0110\u00f6\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00fc\3\2"+
		"\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0111\23\3\2\2\2\u0112\u0113"+
		"\7J\2\2\u0113\u0114\5\4\3\2\u0114\u0115\7E\2\2\u0115\u0116\7\22\2\2\u0116"+
		"\u0117\5\u008eH\2\u0117\u0118\7?\2\2\u0118\25\3\2\2\2\u0119\u011e\5&\24"+
		"\2\u011a\u011b\5\u008eH\2\u011b\u011c\7+\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011e\27\3\2\2\2\u011f\u0120\7F\2\2"+
		"\u0120\u0132\7+\2\2\u0121\u0122\7H\2\2\u0122\u0132\7+\2\2\u0123\u0124"+
		"\7K\2\2\u0124\u0125\5t;\2\u0125\u0126\7+\2\2\u0126\u0132\3\2\2\2\u0127"+
		"\u0129\7L\2\2\u0128\u012a\5\u008eH\2\u0129\u0128\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u0132\7+\2\2\u012c\u012e\7W\2\2\u012d"+
		"\u012f\5\u008eH\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0132\7+\2\2\u0131\u011f\3\2\2\2\u0131\u0121\3\2\2\2\u0131"+
		"\u0123\3\2\2\2\u0131\u0127\3\2\2\2\u0131\u012c\3\2\2\2\u0132\31\3\2\2"+
		"\2\u0133\u0135\7G\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0139"+
		"\3\2\2\2\u0136\u013a\5t;\2\u0137\u013a\5v<\2\u0138\u013a\7m\2\2\u0139"+
		"\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\7\66\2\2\u013c\33\3\2\2\2\u013d\u013f\5\u008eH\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7+"+
		"\2\2\u0141\35\3\2\2\2\u0142\u0149\5\u008eH\2\u0143\u0144\5\u0088E\2\u0144"+
		"\u0145\5\"\22\2\u0145\u0146\7\f\2\2\u0146\u0147\5\u0090I\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0149\37\3\2\2\2\u014a"+
		"\u014b\5\"\22\2\u014b\u014d\7\22\2\2\u014c\u014e\5\u008eH\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7?\2\2\u0150"+
		"\u0157\3\2\2\2\u0151\u0152\5\"\22\2\u0152\u0153\7\f\2\2\u0153\u0154\5"+
		",\27\2\u0154\u0157\3\2\2\2\u0155\u0157\5\"\22\2\u0156\u014a\3\2\2\2\u0156"+
		"\u0151\3\2\2\2\u0156\u0155\3\2\2\2\u0157!\3\2\2\2\u0158\u015a\5x=\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5t"+
		";\2\u015c\u015e\5X-\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0161\5$\23\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u016c\3\2\2\2\u0162\u0164\5x=\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0166\7\22\2\2\u0166\u0167\5z>\2\u0167\u0168"+
		"\5t;\2\u0168\u0169\7?\2\2\u0169\u016a\5$\23\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0159\3\2\2\2\u016b\u0163\3\2\2\2\u016c#\3\2\2\2\u016d\u016f\7\67\2\2"+
		"\u016e\u0170\5\u0092J\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0174\7\32\2\2\u0172\u0174\5\64\33\2\u0173\u016d"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174%\3\2\2\2\u0175\u0177\7M\2\2\u0176\u0175"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5(\25\2\u0179"+
		"\'\3\2\2\2\u017a\u017c\5\u0080A\2\u017b\u017d\5*\26\2\u017c\u017b\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u0188\3\2\2\2\u017e\u0180\5L\'\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\5\u0088E\2\u0185"+
		"\u0186\5*\26\2\u0186\u0188\3\2\2\2\u0187\u017a\3\2\2\2\u0187\u0181\3\2"+
		"\2\2\u0188)\3\2\2\2\u0189\u018e\5 \21\2\u018a\u018b\7\24\2\2\u018b\u018d"+
		"\5 \21\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7+"+
		"\2\2\u0192+\3\2\2\2\u0193\u0199\5\u0090I\2\u0194\u0195\7b\2\2\u0195\u0196"+
		"\5.\30\2\u0196\u0197\7c\2\2\u0197\u0199\3\2\2\2\u0198\u0193\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0199-\3\2\2\2\u019a\u019f\5,\27\2\u019b\u019c\7\24\2\2"+
		"\u019c\u019e\5,\27\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0/\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\t\2\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\5\u0088E\2\u01a6\61\3\2\2\2\u01a7\u01a8\5t;\2\u01a8\63"+
		"\3\2\2\2\u01a9\u01aa\7\22\2\2\u01aa\u01ab\7O\2\2\u01ab\u01b9\7?\2\2\u01ac"+
		"\u01b5\7\22\2\2\u01ad\u01b2\5\66\34\2\u01ae\u01af\7\24\2\2\u01af\u01b1"+
		"\5\66\34\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01ad"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\7?\2\2\u01b8"+
		"\u01a9\3\2\2\2\u01b8\u01ac\3\2\2\2\u01b9\65\3\2\2\2\u01ba\u01bb\5\60\31"+
		"\2\u01bb\u01bc\58\35\2\u01bc\67\3\2\2\2\u01bd\u01c0\5x=\2\u01be\u01c0"+
		"\5|?\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c8\3\2\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\58\35\2\u01c3\u01c4\7"+
		"?\2\2\u01c4\u01c9\3\2\2\2\u01c5\u01c7\5\62\32\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5$\23\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc9\3\2\2\2\u01cd\u01ce\t\3\2\2\u01ce;\3\2\2\2\u01cf"+
		"\u01d0\t\4\2\2\u01d0=\3\2\2\2\u01d1\u01d2\t\5\2\2\u01d2?\3\2\2\2\u01d3"+
		"\u01d4\t\6\2\2\u01d4A\3\2\2\2\u01d5\u01d6\t\7\2\2\u01d6C\3\2\2\2\u01d7"+
		"\u01d8\t\b\2\2\u01d8E\3\2\2\2\u01d9\u01dc\t\t\2\2\u01da\u01db\7\67\2\2"+
		"\u01db\u01dd\7\32\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u0207"+
		"\3\2\2\2\u01de\u0207\7!\2\2\u01df\u0207\7A\2\2\u01e0\u0207\7\61\2\2\u01e1"+
		"\u0207\7$\2\2\u01e2\u0207\7>\2\2\u01e3\u0207\7\16\2\2\u01e4\u0207\7\60"+
		"\2\2\u01e5\u0207\7:\2\2\u01e6\u0207\7\33\2\2\u01e7\u0207\7=\2\2\u01e8"+
		"\u0207\7\f\2\2\u01e9\u0207\7\31\2\2\u01ea\u0207\7<\2\2\u01eb\u0207\7\3"+
		"\2\2\u01ec\u0207\7\23\2\2\u01ed\u0207\7#\2\2\u01ee\u0207\7\25\2\2\u01ef"+
		"\u0207\7\5\2\2\u01f0\u0207\7\13\2\2\u01f1\u0207\7%\2\2\u01f2\u0207\7\20"+
		"\2\2\u01f3\u0207\7\n\2\2\u01f4\u0207\7,\2\2\u01f5\u0207\7)\2\2\u01f6\u0207"+
		"\7\r\2\2\u01f7\u0207\79\2\2\u01f8\u0207\7\6\2\2\u01f9\u0207\7/\2\2\u01fa"+
		"\u0207\7\27\2\2\u01fb\u0207\7\t\2\2\u01fc\u0207\7(\2\2\u01fd\u0207\7\30"+
		"\2\2\u01fe\u0207\78\2\2\u01ff\u0207\7\24\2\2\u0200\u0207\7\17\2\2\u0201"+
		"\u0207\7\64\2\2\u0202\u0203\7\22\2\2\u0203\u0207\7?\2\2\u0204\u0205\7"+
		"\67\2\2\u0205\u0207\7\32\2\2\u0206\u01d9\3\2\2\2\u0206\u01de\3\2\2\2\u0206"+
		"\u01df\3\2\2\2\u0206\u01e0\3\2\2\2\u0206\u01e1\3\2\2\2\u0206\u01e2\3\2"+
		"\2\2\u0206\u01e3\3\2\2\2\u0206\u01e4\3\2\2\2\u0206\u01e5\3\2\2\2\u0206"+
		"\u01e6\3\2\2\2\u0206\u01e7\3\2\2\2\u0206\u01e8\3\2\2\2\u0206\u01e9\3\2"+
		"\2\2\u0206\u01ea\3\2\2\2\u0206\u01eb\3\2\2\2\u0206\u01ec\3\2\2\2\u0206"+
		"\u01ed\3\2\2\2\u0206\u01ee\3\2\2\2\u0206\u01ef\3\2\2\2\u0206\u01f0\3\2"+
		"\2\2\u0206\u01f1\3\2\2\2\u0206\u01f2\3\2\2\2\u0206\u01f3\3\2\2\2\u0206"+
		"\u01f4\3\2\2\2\u0206\u01f5\3\2\2\2\u0206\u01f6\3\2\2\2\u0206\u01f7\3\2"+
		"\2\2\u0206\u01f8\3\2\2\2\u0206\u01f9\3\2\2\2\u0206\u01fa\3\2\2\2\u0206"+
		"\u01fb\3\2\2\2\u0206\u01fc\3\2\2\2\u0206\u01fd\3\2\2\2\u0206\u01fe\3\2"+
		"\2\2\u0206\u01ff\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0201\3\2\2\2\u0206"+
		"\u0202\3\2\2\2\u0206\u0204\3\2\2\2\u0207G\3\2\2\2\u0208\u0209\t\n\2\2"+
		"\u0209I\3\2\2\2\u020a\u020b\t\13\2\2\u020bK\3\2\2\2\u020c\u020d\7]\2\2"+
		"\u020d\u020f\7\31\2\2\u020e\u0210\5N(\2\u020f\u020e\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7<\2\2\u0212M\3\2\2\2\u0213\u0214"+
		"\b(\1\2\u0214\u0215\5P)\2\u0215\u0216\5T+\2\u0216\u0217\5V,\2\u0217\u021a"+
		"\3\2\2\2\u0218\u021a\5R*\2\u0219\u0213\3\2\2\2\u0219\u0218\3\2\2\2\u021a"+
		"\u0220\3\2\2\2\u021b\u021c\f\3\2\2\u021c\u021d\7\24\2\2\u021d\u021f\5"+
		"R*\2\u021e\u021b\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221O\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7]\2\2\u0224"+
		"\u0229\7\31\2\2\u0225\u0227\5T+\2\u0226\u0228\7\24\2\2\u0227\u0226\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0225\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u022e\7<\2\2\u022eQ\3\2\2\2\u022f\u0235\5T+\2\u0230\u0232\7"+
		"S\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0235\5t;\2\u0234\u022f\3\2\2\2\u0234\u0231\3\2\2\2\u0235\u0237\3\2\2"+
		"\2\u0236\u0238\5V,\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a"+
		"\3\2\2\2\u0239\u023b\5B\"\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"S\3\2\2\2\u023c\u023d\t\f\2\2\u023dU\3\2\2\2\u023e\u0240\7a\2\2\u023f"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0244\3\2\2\2\u0243\u0245\7s\2\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245W\3\2\2\2\u0246\u0248\7\31\2\2\u0247\u0249\5Z.\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7<"+
		"\2\2\u024bY\3\2\2\2\u024c\u024d\b.\1\2\u024d\u024e\5\\/\2\u024e\u0254"+
		"\3\2\2\2\u024f\u0250\f\3\2\2\u0250\u0251\7\24\2\2\u0251\u0253\5\\/\2\u0252"+
		"\u024f\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255[\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0259\7S\2\2\u0258\u0257"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\5\u008aF"+
		"\2\u025b\u025d\5B\"\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d]\3"+
		"\2\2\2\u025e\u025f\n\r\2\2\u025f_\3\2\2\2\u0260\u0261\n\16\2\2\u0261a"+
		"\3\2\2\2\u0262\u0263\n\17\2\2\u0263c\3\2\2\2\u0264\u0265\n\20\2\2\u0265"+
		"e\3\2\2\2\u0266\u0267\n\21\2\2\u0267g\3\2\2\2\u0268\u0269\n\22\2\2\u0269"+
		"i\3\2\2\2\u026a\u026b\n\23\2\2\u026bk\3\2\2\2\u026c\u026d\n\24\2\2\u026d"+
		"m\3\2\2\2\u026e\u026f\n\25\2\2\u026fo\3\2\2\2\u0270\u0271\n\16\2\2\u0271"+
		"q\3\2\2\2\u0272\u0273\13\2\2\2\u0273s\3\2\2\2\u0274\u0279\7a\2\2\u0275"+
		"\u0276\7\b\2\2\u0276\u0278\7a\2\2\u0277\u0275\3\2\2\2\u0278\u027b\3\2"+
		"\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027e\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027e\5D#\2\u027d\u0274\3\2\2\2\u027d\u027c\3\2\2"+
		"\2\u027eu\3\2\2\2\u027f\u0280\t\26\2\2\u0280w\3\2\2\2\u0281\u0283\7S\2"+
		"\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286"+
		"\5B\"\2\u0285\u0287\7\7\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0289\3\2\2\2\u0288\u0282\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028by\3\2\2\2\u028c\u028d\5x=\2\u028d{\3\2\2"+
		"\2\u028e\u028f\7\t\2\2\u028f}\3\2\2\2\u0290\u0291\t\27\2\2\u0291\177\3"+
		"\2\2\2\u0292\u0294\5L\'\2\u0293\u0292\3\2\2\2\u0294\u0297\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2"+
		"\2\2\u0298\u029a\5~@\2\u0299\u029b\5\u008cG\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029e\5\u0082B\2\u029d\u029c"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u02a1\5X-\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a4\5\u0084"+
		"C\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\7b\2\2\u02a6\u02a7\bA\1\2\u02a7\u0081\3\2\2\2\u02a8\u02a9\5t;\2"+
		"\u02a9\u0083\3\2\2\2\u02aa\u02ab\7\66\2\2\u02ab\u02b0\5\u0086D\2\u02ac"+
		"\u02ad\7\24\2\2\u02ad\u02af\5\u0086D\2\u02ae\u02ac\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u0085\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b5\7T\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b8\5D#\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\5t;\2\u02ba\u02bc\5X-\2\u02bb"+
		"\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u0087\3\2\2\2\u02bd\u02bf\7S"+
		"\2\2\u02be\u02bd\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c7\5~"+
		"@\2\u02c4\u02c7\7P\2\2\u02c5\u02c7\7Q\2\2\u02c6\u02c3\3\2\2\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02ca\5\u008aF\2\u02c9\u02cb\5X-\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3"+
		"\2\2\2\u02cb\u02d3\3\2\2\2\u02cc\u02cd\7\b\2\2\u02cd\u02cf\5\u008aF\2"+
		"\u02ce\u02d0\5X-\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\7S"+
		"\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dc\3\2\2\2\u02d9"+
		"\u02dc\7P\2\2\u02da\u02dc\7Q\2\2\u02db\u02c0\3\2\2\2\u02db\u02d9\3\2\2"+
		"\2\u02db\u02da\3\2\2\2\u02dc\u0089\3\2\2\2\u02dd\u02df\t\30\2\2\u02de"+
		"\u02e0\7s\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2"+
		"\2\2\u02e1\u02dd\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u008b\3\2\2\2\u02e5\u02e6\7`\2\2\u02e6\u02e7\7\22"+
		"\2\2\u02e7\u02e8\7\22\2\2\u02e8\u02e9\5t;\2\u02e9\u02ea\7?\2\2\u02ea\u02eb"+
		"\7?\2\2\u02eb\u008d\3\2\2\2\u02ec\u02ef\5\u0090I\2\u02ed\u02ee\7\24\2"+
		"\2\u02ee\u02f0\5\u008eH\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u008f\3\2\2\2\u02f1\u02f5\5\u0092J\2\u02f2\u02f3\5H%\2\u02f3\u02f4\5"+
		"\u0090I\2\u02f4\u02f6\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f5\u02f6\3\2\2\2"+
		"\u02f6\u0091\3\2\2\2\u02f7\u02ff\5\u0094K\2\u02f8\u02f9\5\u0094K\2\u02f9"+
		"\u02fa\7-\2\2\u02fa\u02fb\5\u008eH\2\u02fb\u02fc\7\66\2\2\u02fc\u02fd"+
		"\5\u0092J\2\u02fd\u02ff\3\2\2\2\u02fe\u02f7\3\2\2\2\u02fe\u02f8\3\2\2"+
		"\2\u02ff\u0093\3\2\2\2\u0300\u0303\5\u0096L\2\u0301\u0302\7(\2\2\u0302"+
		"\u0304\5\u0094K\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0095"+
		"\3\2\2\2\u0305\u0308\5\u0098M\2\u0306\u0307\7\t\2\2\u0307\u0309\5\u0096"+
		"L\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0097\3\2\2\2\u030a"+
		"\u030d\5\u009aN\2\u030b\u030c\7:\2\2\u030c\u030e\5\u0098M\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0099\3\2\2\2\u030f\u0312\5\u009cO"+
		"\2\u0310\u0311\7\16\2\2\u0311\u0313\5\u009aN\2\u0312\u0310\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u009b\3\2\2\2\u0314\u0317\5\u009eP\2\u0315\u0316"+
		"\7\60\2\2\u0316\u0318\5\u009cO\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2"+
		"\2\u0318\u009d\3\2\2\2\u0319\u031d\5\u00a0Q\2\u031a\u031b\5J&\2\u031b"+
		"\u031c\5\u009eP\2\u031c\u031e\3\2\2\2\u031d\u031a\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u009f\3\2\2\2\u031f\u0323\5\u00a2R\2\u0320\u0321\5<\37"+
		"\2\u0321\u0322\5\u00a0Q\2\u0322\u0324\3\2\2\2\u0323\u0320\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u00a1\3\2\2\2\u0325\u0328\5\u00a4S\2\u0326\u0327"+
		"\t\31\2\2\u0327\u0329\5\u00a2R\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2"+
		"\2\u0329\u00a3\3\2\2\2\u032a\u032d\5\u00a6T\2\u032b\u032c\t\32\2\2\u032c"+
		"\u032e\5\u00a4S\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u00a5"+
		"\3\2\2\2\u032f\u0332\5\u00aaV\2\u0330\u0331\t\33\2\2\u0331\u0333\5\u00a6"+
		"T\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u00a7\3\2\2\2\u0334"+
		"\u0335\t\34\2\2\u0335\u00a9\3\2\2\2\u0336\u0337\7\22\2\2\u0337\u0338\5"+
		"\u00acW\2\u0338\u0339\7?\2\2\u0339\u033a\5\u00aaV\2\u033a\u0345\3\2\2"+
		"\2\u033b\u033c\5\u00a8U\2\u033c\u033d\7\31\2\2\u033d\u033e\5\u00acW\2"+
		"\u033e\u033f\7<\2\2\u033f\u0340\7\22\2\2\u0340\u0341\5\u00aaV\2\u0341"+
		"\u0342\7?\2\2\u0342\u0345\3\2\2\2\u0343\u0345\5\u00aeX\2\u0344\u0336\3"+
		"\2\2\2\u0344\u033b\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u00ab\3\2\2\2\u0346"+
		"\u034a\5\u0088E\2\u0347\u0349\5B\"\2\u0348\u0347\3\2\2\2\u0349\u034c\3"+
		"\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u00ad\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034d\u034e\5\u00be`\2\u034e\u034f\5\u00aaV\2\u034f\u0356"+
		"\3\2\2\2\u0350\u0356\5\u00b4[\2\u0351\u0356\5\u00b6\\\2\u0352\u0356\5"+
		"\u00b0Y\2\u0353\u0356\5\u00b2Z\2\u0354\u0356\5\u00c0a\2\u0355\u034d\3"+
		"\2\2\2\u0355\u0350\3\2\2\2\u0355\u0351\3\2\2\2\u0355\u0352\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u00af\3\2\2\2\u0357\u0359\7\b"+
		"\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\7^\2\2\u035b\u035c\5\u0088E\2\u035c\u035e\7\67\2\2\u035d\u035f"+
		"\5\u0092J\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2"+
		"\2\u0360\u0361\7\32\2\2\u0361\u036e\3\2\2\2\u0362\u0364\7\b\2\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\7^"+
		"\2\2\u0366\u0367\5\u0088E\2\u0367\u0369\7\22\2\2\u0368\u036a\5\u008eH"+
		"\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c"+
		"\7?\2\2\u036c\u036e\3\2\2\2\u036d\u0358\3\2\2\2\u036d\u0363\3\2\2\2\u036e"+
		"\u00b1\3\2\2\2\u036f\u0370\7_\2\2\u0370\u0376\5t;\2\u0371\u0372\7_\2\2"+
		"\u0372\u0373\7\67\2\2\u0373\u0374\7\32\2\2\u0374\u0376\5t;\2\u0375\u036f"+
		"\3\2\2\2\u0375\u0371\3\2\2\2\u0376\u00b3\3\2\2\2\u0377\u0378\5:\36\2\u0378"+
		"\u0379\5\u00aaV\2\u0379\u00b5\3\2\2\2\u037a\u037b\5\u00b8]\2\u037b\u037c"+
		"\5\u00bc_\2\u037c\u0388\3\2\2\2\u037d\u037e\5\u00b8]\2\u037e\u037f\7\22"+
		"\2\2\u037f\u0380\5\u00bc_\2\u0380\u0381\7?\2\2\u0381\u0388\3\2\2\2\u0382"+
		"\u0383\5\u00b8]\2\u0383\u0384\7\22\2\2\u0384\u0385\5\u00ba^\2\u0385\u0386"+
		"\7?\2\2\u0386\u0388\3\2\2\2\u0387\u037a\3\2\2\2\u0387\u037d\3\2\2\2\u0387"+
		"\u0382\3\2\2\2\u0388\u00b7\3\2\2\2\u0389\u038a\7 \2\2\u038a\u00b9\3\2"+
		"\2\2\u038b\u038f\5\u0088E\2\u038c\u038e\5B\"\2\u038d\u038c\3\2\2\2\u038e"+
		"\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u00bb\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0392\u0393\5\u00aeX\2\u0393\u00bd\3\2\2\2\u0394"+
		"\u0395\t\35\2\2\u0395\u00bf\3\2\2\2\u0396\u0397\ba\1\2\u0397\u0398\5\u00c6"+
		"d\2\u0398\u03b3\3\2\2\2\u0399\u039a\f\b\2\2\u039a\u039b\7\67\2\2\u039b"+
		"\u039c\5\u008eH\2\u039c\u039d\7\32\2\2\u039d\u03b2\3\2\2\2\u039e\u039f"+
		"\f\7\2\2\u039f\u03a0\7\22\2\2\u03a0\u03a1\5\u00c2b\2\u03a1\u03a2\7?\2"+
		"\2\u03a2\u03b2\3\2\2\2\u03a3\u03a4\f\6\2\2\u03a4\u03a6\7\62\2\2\u03a5"+
		"\u03a7\7]\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2"+
		"\2\2\u03a8\u03b2\5t;\2\u03a9\u03aa\f\5\2\2\u03aa\u03ac\7\64\2\2\u03ab"+
		"\u03ad\7]\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2"+
		"\2\2\u03ae\u03b2\5t;\2\u03af\u03b0\f\4\2\2\u03b0\u03b2\5\u00be`\2\u03b1"+
		"\u0399\3\2\2\2\u03b1\u039e\3\2\2\2\u03b1\u03a3\3\2\2\2\u03b1\u03a9\3\2"+
		"\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u00c1\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03bb\5\u00c4"+
		"c\2\u03b7\u03b8\7\24\2\2\u03b8\u03ba\5\u00c4c\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bf\3\2"+
		"\2\2\u03bd\u03bb\3\2\2\2\u03be\u03b6\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u00c3\3\2\2\2\u03c0\u03c1\5\u0090I\2\u03c1\u00c5\3\2\2\2\u03c2\u03c9"+
		"\5t;\2\u03c3\u03c9\5> \2\u03c4\u03c5\7\22\2\2\u03c5\u03c6\5\u008eH\2\u03c6"+
		"\u03c7\7?\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8\u03c3\3\2"+
		"\2\2\u03c8\u03c4\3\2\2\2\u03c9\u00c7\3\2\2\2q\u00ce\u00d0\u00db\u00ee"+
		"\u0100\u0103\u0107\u0110\u011d\u0129\u012e\u0131\u0134\u0139\u013e\u0148"+
		"\u014d\u0156\u0159\u015d\u0160\u0163\u016b\u016f\u0173\u0176\u017c\u0181"+
		"\u0187\u018e\u0198\u019f\u01a3\u01b2\u01b5\u01b8\u01bf\u01c6\u01c8\u01cb"+
		"\u01dc\u0206\u020f\u0219\u0220\u0227\u022b\u0231\u0234\u0237\u023a\u0241"+
		"\u0244\u0248\u0254\u0258\u025c\u0279\u027d\u0282\u0286\u028a\u0295\u029a"+
		"\u029d\u02a0\u02a3\u02b0\u02b4\u02b7\u02bb\u02c0\u02c6\u02ca\u02cf\u02d3"+
		"\u02d7\u02db\u02df\u02e3\u02ef\u02f5\u02fe\u0303\u0308\u030d\u0312\u0317"+
		"\u031d\u0323\u0328\u032d\u0332\u0344\u034a\u0355\u0358\u035e\u0363\u0369"+
		"\u036d\u0375\u0387\u038f\u03a6\u03ac\u03b1\u03b3\u03bb\u03be\u03c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}