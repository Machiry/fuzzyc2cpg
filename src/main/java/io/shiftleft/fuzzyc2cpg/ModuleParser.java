// Generated from /home/machiry/projects/antl4c/src/main/antlr/Module.g4 by ANTLR 4.2.2
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
public class ModuleParser extends Parser {
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
		"<INVALID>", "'+='", "'private'", "'%='", "'!='", "'restrict'", "'&&'", 
		"'>>'", "'^='", "'::'", "'='", "'<<='", "'^'", "'->*'", "'|='", "'union'", 
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
		RULE_code = 0, RULE_using_directive = 1, RULE_function_decl = 2, RULE_function_def = 3, 
		RULE_return_type = 4, RULE_function_param_list = 5, RULE_parameter_decl_clause = 6, 
		RULE_parameter_ptrs = 7, RULE_parameter_decl = 8, RULE_parameter_id = 9, 
		RULE_default_parameter_value = 10, RULE_compound_statement = 11, RULE_ctor_list = 12, 
		RULE_ctor_initializer = 13, RULE_initializer_id = 14, RULE_ctor_expr = 15, 
		RULE_function_name = 16, RULE_exception_specification = 17, RULE_type_id_list = 18, 
		RULE_init_declarator = 19, RULE_declarator = 20, RULE_type_suffix = 21, 
		RULE_assign_expr_w_ = 22, RULE_assign_expr_w__l2 = 23, RULE_constant_expr_w_ = 24, 
		RULE_simple_decl = 25, RULE_storage_class_specifier = 26, RULE_var_decl = 27, 
		RULE_init_declarator_list = 28, RULE_initializer = 29, RULE_initializer_list = 30, 
		RULE_param_decl_specifiers = 31, RULE_parameter_name = 32, RULE_param_type_list = 33, 
		RULE_param_type = 34, RULE_param_type_id = 35, RULE_unary_operator = 36, 
		RULE_relational_operator = 37, RULE_constant = 38, RULE_function_decl_specifiers = 39, 
		RULE_ptr_operator = 40, RULE_access_specifier = 41, RULE_operator = 42, 
		RULE_assignment_operator = 43, RULE_equality_operator = 44, RULE_template_decl = 45, 
		RULE_template_decl_param_list = 46, RULE_template_template = 47, RULE_template_decl_param = 48, 
		RULE_template_decl_keyword = 49, RULE_template_name = 50, RULE_template_args = 51, 
		RULE_template_args_param_list = 52, RULE_template_args_param = 53, RULE_no_brackets = 54, 
		RULE_no_brackets_curlies_or_squares = 55, RULE_no_brackets_or_semicolon = 56, 
		RULE_no_angle_brackets_or_brackets = 57, RULE_no_curlies = 58, RULE_no_squares = 59, 
		RULE_no_squares_or_semicolon = 60, RULE_no_comma_or_semicolon = 61, RULE_assign_water = 62, 
		RULE_assign_water_l2 = 63, RULE_water = 64, RULE_identifier = 65, RULE_number = 66, 
		RULE_ptrs = 67, RULE_func_ptrs = 68, RULE_rvalue_ref = 69, RULE_class_key = 70, 
		RULE_class_def = 71, RULE_class_name = 72, RULE_base_classes = 73, RULE_base_class = 74, 
		RULE_type_name = 75, RULE_base_type = 76, RULE_gcc_attribute = 77, RULE_expr = 78, 
		RULE_assign_expr = 79, RULE_conditional_expression = 80, RULE_or_expression = 81, 
		RULE_and_expression = 82, RULE_inclusive_or_expression = 83, RULE_exclusive_or_expression = 84, 
		RULE_bit_and_expression = 85, RULE_equality_expression = 86, RULE_relational_expression = 87, 
		RULE_shift_expression = 88, RULE_additive_expression = 89, RULE_multiplicative_expression = 90, 
		RULE_cpp_cast_identifier = 91, RULE_cast_expression = 92, RULE_cast_target = 93, 
		RULE_unary_expression = 94, RULE_new_expression = 95, RULE_delete_expression = 96, 
		RULE_unary_op_and_cast_expr = 97, RULE_sizeof_expression = 98, RULE_sizeof = 99, 
		RULE_sizeof_operand = 100, RULE_sizeof_operand2 = 101, RULE_inc_dec = 102, 
		RULE_postfix_expression = 103, RULE_function_argument_list = 104, RULE_function_argument = 105, 
		RULE_primary_expression = 106;
	public static final String[] ruleNames = {
		"code", "using_directive", "function_decl", "function_def", "return_type", 
		"function_param_list", "parameter_decl_clause", "parameter_ptrs", "parameter_decl", 
		"parameter_id", "default_parameter_value", "compound_statement", "ctor_list", 
		"ctor_initializer", "initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "init_declarator", "declarator", "type_suffix", "assign_expr_w_", 
		"assign_expr_w__l2", "constant_expr_w_", "simple_decl", "storage_class_specifier", 
		"var_decl", "init_declarator_list", "initializer", "initializer_list", 
		"param_decl_specifiers", "parameter_name", "param_type_list", "param_type", 
		"param_type_id", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl", "template_decl_param_list", 
		"template_template", "template_decl_param", "template_decl_keyword", "template_name", 
		"template_args", "template_args_param_list", "template_args_param", "no_brackets", 
		"no_brackets_curlies_or_squares", "no_brackets_or_semicolon", "no_angle_brackets_or_brackets", 
		"no_curlies", "no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", 
		"assign_water", "assign_water_l2", "water", "identifier", "number", "ptrs", 
		"func_ptrs", "rvalue_ref", "class_key", "class_def", "class_name", "base_classes", 
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
	public String getGrammarFileName() { return "Module.g4"; }

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


	public ModuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(219);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(214); function_decl();
					}
					break;

				case 2:
					{
					setState(215); function_def();
					}
					break;

				case 3:
					{
					setState(216); simple_decl();
					}
					break;

				case 4:
					{
					setState(217); using_directive();
					}
					break;

				case 5:
					{
					setState(218); water();
					}
					break;
				}
				}
				setState(223);
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

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(ModuleParser.NAMESPACE, 0); }
		public TerminalNode USING() { return getToken(ModuleParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUsing_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUsing_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(USING);
			setState(225); match(NAMESPACE);
			setState(226); identifier();
			setState(227); match(41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declContext extends ParserRuleContext {
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(230);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(229); match(EXTERN);
					}
				}

				}
				break;

			case 2:
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(232); template_decl();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(240); return_type();
				}
				break;
			}
			setState(243); function_name();
			setState(244); function_param_list();
			setState(246);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(245); ctor_list();
				}
			}

			setState(248); match(41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(250); template_decl();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(256); return_type();
				}
				break;
			}
			setState(259); function_name();
			setState(260); function_param_list();
			setState(262);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(261); ctor_list();
				}
			}

			setState(264); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (27 - 27)) | (1L << (28 - 27)) | (1L << (40 - 27)) | (1L << (51 - 27)) | (1L << (VIRTUAL - 27)))) != 0)) {
				{
				{
				setState(266); function_decl_specifiers();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272); type_name();
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(274); ptr_operator();
				}
				}
				setState(279);
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

	public static class Function_param_listContext extends ParserRuleContext {
		public Parameter_decl_clauseContext parameter_decl_clause() {
			return getRuleContext(Parameter_decl_clauseContext.class,0);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(16);
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 32) | (1L << 37) | (1L << 44))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
				{
				setState(281); parameter_decl_clause();
				}
			}

			setState(284); match(61);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(285); match(CV_QUALIFIER);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(291); exception_specification();
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

	public static class Parameter_decl_clauseContext extends ParserRuleContext {
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_decl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(294); parameter_decl();
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(295); match(18);
						setState(296); parameter_decl();
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				setState(304);
				_la = _input.LA(1);
				if (_la==18) {
					{
					setState(302); match(18);
					setState(303); match(ELLIPSIS);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(VOID);
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

	public static class Parameter_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Rvalue_refContext rvalue_ref() {
			return getRuleContext(Rvalue_refContext.class,0);
		}
		public Parameter_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_ptrsContext parameter_ptrs() throws RecognitionException {
		Parameter_ptrsContext _localctx = new Parameter_ptrsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_ptrs);
		try {
			setState(311);
			switch (_input.LA(1)) {
			case 46:
			case 47:
			case CV_QUALIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); ptrs();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); rvalue_ref();
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

	public static class Parameter_declContext extends ParserRuleContext {
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_ptrsContext parameter_ptrs() {
			return getRuleContext(Parameter_ptrsContext.class,0);
		}
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_decl);
		int _la;
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); param_decl_specifiers();
				setState(314); parameter_id();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); param_decl_specifiers();
				setState(318);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 46) | (1L << 47))) != 0) || _la==CV_QUALIFIER) {
					{
					setState(317); parameter_ptrs();
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

	public static class Parameter_idContext extends ParserRuleContext {
		public Default_parameter_valueContext default_parameter_value() {
			return getRuleContext(Default_parameter_valueContext.class,0);
		}
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_ptrsContext parameter_ptrs() {
			return getRuleContext(Parameter_ptrsContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Parameter_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 46) | (1L << 47))) != 0) || _la==CV_QUALIFIER) {
				{
				setState(322); parameter_ptrs();
				}
			}

			setState(330);
			switch (_input.LA(1)) {
			case 16:
				{
				setState(325); match(16);
				setState(326); parameter_id();
				setState(327); match(61);
				}
				break;
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				{
				setState(329); parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(333);
			_la = _input.LA(1);
			if (_la==16 || _la==53) {
				{
				setState(332); type_suffix();
				}
			}

			setState(336);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(335); default_parameter_value();
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

	public static class Default_parameter_valueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Default_parameter_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDefault_parameter_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDefault_parameter_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDefault_parameter_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parameter_valueContext default_parameter_value() throws RecognitionException {
		Default_parameter_valueContext _localctx = new Default_parameter_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_parameter_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(10);
			setState(339); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(OPENING_CURLY);
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

	public static class Ctor_listContext extends ParserRuleContext {
		public Ctor_initializerContext ctor_initializer(int i) {
			return getRuleContext(Ctor_initializerContext.class,i);
		}
		public List<Ctor_initializerContext> ctor_initializer() {
			return getRuleContexts(Ctor_initializerContext.class);
		}
		public Ctor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(52);
			setState(345); ctor_initializer();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(346); match(18);
				setState(347); ctor_initializer();
				}
				}
				setState(352);
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

	public static class Ctor_initializerContext extends ParserRuleContext {
		public Initializer_idContext initializer_id() {
			return getRuleContext(Initializer_idContext.class,0);
		}
		public Ctor_exprContext ctor_expr() {
			return getRuleContext(Ctor_exprContext.class,0);
		}
		public Ctor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); initializer_id();
			setState(354); ctor_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Initializer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(356); match(9);
				}
			}

			setState(359); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ctor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(16);
			setState(363);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(362); expr();
				}
			}

			setState(365); match(61);
			}
		}
		catch (RecognitionException re) {
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(ModuleParser.OPERATOR, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_name);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case 16:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); match(16);
				setState(368); function_name();
				setState(369); match(61);
				}
				break;
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(371); identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(372); match(OPERATOR);
				setState(373); operator();
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

	public static class Exception_specificationContext extends ParserRuleContext {
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public TerminalNode THROW() { return getToken(ModuleParser.THROW, 0); }
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitException_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitException_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(THROW);
			setState(377); match(16);
			setState(378); type_id_list();
			setState(379); match(61);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_id_listContext extends ParserRuleContext {
		public Type_id_listContext type_id_list(int i) {
			return getRuleContext(Type_id_listContext.class,i);
		}
		public No_bracketsContext no_brackets(int i) {
			return getRuleContext(No_bracketsContext.class,i);
		}
		public List<Type_id_listContext> type_id_list() {
			return getRuleContexts(Type_id_listContext.class);
		}
		public List<No_bracketsContext> no_brackets() {
			return getRuleContexts(No_bracketsContext.class);
		}
		public Type_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_id_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_id_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(381); no_brackets();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16) {
				{
				{
				setState(387); match(16);
				setState(388); type_id_list();
				setState(389); match(61);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(390); no_brackets();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(400);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_expr_w_Context assign_expr_w_() {
			return getRuleContext(Assign_expr_w_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); declarator();
			setState(409);
			switch (_input.LA(1)) {
			case 16:
				{
				{
				setState(402); match(16);
				setState(404);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(403); expr();
					}
				}

				setState(406); match(61);
				}
				}
				break;
			case 10:
				{
				{
				setState(407); match(10);
				setState(408); assign_expr_w_();
				}
				}
				break;
			case 18:
			case 41:
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarator);
		int _la;
		try {
			setState(430);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0)) {
					{
					setState(411); ptrs();
					}
				}

				setState(414); identifier();
				setState(416);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(415); template_args();
					}
				}

				setState(419);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(418); type_suffix();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0)) {
					{
					setState(421); ptrs();
					}
				}

				setState(424); match(16);
				setState(425); func_ptrs();
				setState(426); identifier();
				setState(427); match(61);
				setState(428); type_suffix();
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
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Constant_expr_w_Context constant_expr_w_() {
			return getRuleContext(Constant_expr_w_Context.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_suffix);
		try {
			setState(437);
			switch (_input.LA(1)) {
			case 53:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(432); match(53);
				setState(433); constant_expr_w_();
				setState(434); match(24);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(436); param_type_list();
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

	public static class Assign_expr_w_Context extends ParserRuleContext {
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_waterContext assign_water(int i) {
			return getRuleContext(Assign_waterContext.class,i);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public List<Assign_waterContext> assign_water() {
			return getRuleContexts(Assign_waterContext.class);
		}
		public Assign_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr_w_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expr_w_Context assign_expr_w_() throws RecognitionException {
		Assign_expr_w_Context _localctx = new Assign_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(439); assign_water();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16 || _la==53 || _la==OPENING_CURLY) {
				{
				{
				setState(457);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(445); match(OPENING_CURLY);
					setState(446); assign_expr_w__l2();
					setState(447); match(CLOSING_CURLY);
					}
					break;
				case 16:
					{
					setState(449); match(16);
					setState(450); assign_expr_w__l2();
					setState(451); match(61);
					}
					break;
				case 53:
					{
					setState(453); match(53);
					setState(454); assign_expr_w__l2();
					setState(455); match(24);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(459); assign_water();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(469);
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

	public static class Assign_expr_w__l2Context extends ParserRuleContext {
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public List<Assign_water_l2Context> assign_water_l2() {
			return getRuleContexts(Assign_water_l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_water_l2Context assign_water_l2(int i) {
			return getRuleContext(Assign_water_l2Context.class,i);
		}
		public Assign_expr_w__l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w__l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w__l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w__l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr_w__l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expr_w__l2Context assign_expr_w__l2() throws RecognitionException {
		Assign_expr_w__l2Context _localctx = new Assign_expr_w__l2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(470); assign_water_l2();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==16 || _la==53 || _la==OPENING_CURLY) {
				{
				{
				setState(488);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(476); match(OPENING_CURLY);
					setState(477); assign_expr_w__l2();
					setState(478); match(CLOSING_CURLY);
					}
					break;
				case 16:
					{
					setState(480); match(16);
					setState(481); assign_expr_w__l2();
					setState(482); match(61);
					}
					break;
				case 53:
					{
					setState(484); match(53);
					setState(485); assign_expr_w__l2();
					setState(486); match(24);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(490); assign_water_l2();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(500);
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

	public static class Constant_expr_w_Context extends ParserRuleContext {
		public List<No_squaresContext> no_squares() {
			return getRuleContexts(No_squaresContext.class);
		}
		public No_squaresContext no_squares(int i) {
			return getRuleContext(No_squaresContext.class,i);
		}
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
		}
		public Constant_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant_expr_w_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitConstant_expr_w_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expr_w_Context constant_expr_w_() throws RecognitionException {
		Constant_expr_w_Context _localctx = new Constant_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(501); no_squares();
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==53) {
				{
				{
				setState(507); match(53);
				setState(508); constant_expr_w_();
				setState(509); match(24);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 51) | (1L << 52) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 61) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (DELETE - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(510); no_squares();
					}
					}
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(520);
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

	public static class Simple_declContext extends ParserRuleContext {
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSimple_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSimple_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEDEF || _la==EXTERN) {
				{
				{
				setState(521); storage_class_specifier();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527); var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public TerminalNode EXTERN() { return getToken(ModuleParser.EXTERN, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitStorage_class_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitStorage_class_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(_la==TYPEDEF || _la==EXTERN) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclByClass(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclByType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var_decl);
		int _la;
		try {
			setState(544);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(531); class_def();
				setState(533);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(532); init_declarator_list();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(535); template_decl();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541); type_name();
				setState(542); init_declarator_list();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); init_declarator();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(547); match(18);
				setState(548); init_declarator();
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554); match(41);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initializer);
		try {
			setState(561);
			switch (_input.LA(1)) {
			case 2:
			case 9:
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
				setState(556); assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(557); match(OPENING_CURLY);
				setState(558); initializer_list();
				setState(559); match(CLOSING_CURLY);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); initializer();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(564); match(18);
				setState(565); initializer();
				}
				}
				setState(570);
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
		public TerminalNode AUTO() { return getToken(ModuleParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ModuleParser.REGISTER, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(571);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(574); type_name();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); identifier();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_param_type_list);
		int _la;
		try {
			setState(593);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578); match(16);
				setState(579); match(VOID);
				setState(580); match(61);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581); match(16);
				setState(590);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 32) | (1L << 37) | (1L << 44))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
					{
					setState(582); param_type();
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==18) {
						{
						{
						setState(583); match(18);
						setState(584); param_type();
						}
						}
						setState(589);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(592); match(61);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); param_decl_specifiers();
			setState(596); param_type_id();
			}
		}
		catch (RecognitionException re) {
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
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (46 - 46)) | (1L << (47 - 46)) | (1L << (CV_QUALIFIER - 46)))) != 0)) {
				{
				setState(598); ptrs();
				}
			}

			setState(608);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(601); match(16);
				setState(602); param_type_id();
				setState(603); match(61);
				}
				break;

			case 2:
				{
				setState(606);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(605); parameter_name();
					}
				}

				}
				break;
			}
			setState(611);
			_la = _input.LA(1);
			if (_la==16 || _la==53) {
				{
				setState(610); type_suffix();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
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
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(ModuleParser.MULTILINE_STRING, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ModuleParser.CHAR, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ModuleParser.BINARY_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ModuleParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operator);
		int _la;
		try {
			setState(670);
			switch (_input.LA(1)) {
			case NEW:
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==NEW || _la==DELETE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(628);
				_la = _input.LA(1);
				if (_la==53) {
					{
					setState(626); match(53);
					setState(627); match(24);
					}
				}

				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); match(31);
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 3);
				{
				setState(631); match(63);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 4);
				{
				setState(632); match(47);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 5);
				{
				setState(633); match(34);
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 6);
				{
				setState(634); match(60);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 7);
				{
				setState(635); match(12);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 8);
				{
				setState(636); match(46);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 9);
				{
				setState(637); match(56);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 10);
				{
				setState(638); match(25);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 11);
				{
				setState(639); match(59);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 12);
				{
				setState(640); match(10);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 13);
				{
				setState(641); match(23);
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 14);
				{
				setState(642); match(58);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 15);
				{
				setState(643); match(1);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 16);
				{
				setState(644); match(17);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 17);
				{
				setState(645); match(33);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 18);
				{
				setState(646); match(19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 19);
				{
				setState(647); match(3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 20);
				{
				setState(648); match(8);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 21);
				{
				setState(649); match(35);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 22);
				{
				setState(650); match(14);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 23);
				{
				setState(651); match(7);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 24);
				{
				setState(652); match(42);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 25);
				{
				setState(653); match(39);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 26);
				{
				setState(654); match(11);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 27);
				{
				setState(655); match(55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 28);
				{
				setState(656); match(4);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 29);
				{
				setState(657); match(45);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 30);
				{
				setState(658); match(21);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 31);
				{
				setState(659); match(6);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 32);
				{
				setState(660); match(38);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 33);
				{
				setState(661); match(22);
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 34);
				{
				setState(662); match(54);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 35);
				{
				setState(663); match(18);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 36);
				{
				setState(664); match(13);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 37);
				{
				setState(665); match(50);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 38);
				{
				setState(666); match(16);
				setState(667); match(61);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 39);
				{
				setState(668); match(53);
				setState(669); match(24);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 39))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676); match(TEMPLATE);
			setState(677); match(23);
			setState(679);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 20) | (1L << 29) | (1L << 37) | (1L << 57))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CV_QUALIFIER - 81)) | (1L << (TEMPLATE - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
				{
				setState(678); template_decl_param_list(0);
				}
			}

			setState(681); match(58);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(684); template_template();
				setState(685); template_decl_keyword();
				setState(686); template_name();
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
				setState(688); template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(692); match(18);
					setState(693); template_decl_param();
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_decl_keywordContext template_decl_keyword(int i) {
			return getRuleContext(Template_decl_keywordContext.class,i);
		}
		public Template_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699); match(TEMPLATE);
			setState(700); match(23);
			setState(705); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(701); template_decl_keyword();
				setState(703);
				_la = _input.LA(1);
				if (_la==18) {
					{
					setState(702); match(18);
					}
				}

				}
				}
				setState(707); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==20 || _la==37 );
			setState(709); match(58);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			switch (_input.LA(1)) {
			case 20:
			case 37:
				{
				setState(711); template_decl_keyword();
				}
				break;
			case 2:
			case 29:
			case 57:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(713);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(712); match(CV_QUALIFIER);
					}
				}

				setState(715); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(718); template_name();
				}
				break;
			}
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(721); ptr_operator();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ModuleParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(726); match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(732);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(731); match(ELLIPSIS);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(23);
			setState(736);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
				{
				setState(735); template_args_param_list(0);
				}
			}

			setState(738); match(58);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(741); template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(743);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(744); match(18);
					setState(745); template_args_param();
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(751); match(CV_QUALIFIER);
				}
			}

			setState(754); base_type();
			setState(756);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(755); ptr_operator();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifier);
		try {
			int _alt;
			setState(789);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(780); match(ALPHA_NUMERIC);
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(781); match(9);
						setState(782); match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				}
				break;
			case 2:
			case 29:
			case 57:
				enterOuterAlt(_localctx, 2);
				{
				setState(788); access_specifier();
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(794);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(793); match(CV_QUALIFIER);
					}
				}

				setState(796); ptr_operator();
				setState(798);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(797); match(5);
					}
				}

				}
				}
				setState(802); 
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); ptrs();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806); match(6);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Gcc_attributeContext gcc_attribute() {
			return getRuleContext(Gcc_attributeContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(810); template_decl();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816); class_key();
			setState(818);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(817); gcc_attribute();
				}
			}

			setState(821);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 29) | (1L << 57))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(820); class_name();
				}
			}

			setState(824);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(823); template_args();
				}
			}

			setState(827);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(826); base_classes();
				}
			}

			setState(829); match(OPENING_CURLY);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832); identifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834); match(52);
			setState(835); base_class();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(836); match(18);
				setState(837); base_class();
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

	public static class Base_classContext extends ParserRuleContext {
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(843); match(VIRTUAL);
				}
			}

			setState(847);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(846); access_specifier();
				}
				break;
			}
			setState(849); identifier();
			setState(851);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(850); template_args();
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
		public TerminalNode SIGNED() { return getToken(ModuleParser.SIGNED, 0); }
		public Template_argsContext template_args(int i) {
			return getRuleContext(Template_argsContext.class,i);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode UNSIGNED() { return getToken(ModuleParser.UNSIGNED, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type_name);
		int _la;
		try {
			setState(883);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(853); match(CV_QUALIFIER);
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(862);
				switch (_input.LA(1)) {
				case 15:
				case 32:
				case 37:
				case 44:
					{
					setState(859); class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(860); match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(861); match(SIGNED);
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
				setState(864); base_type();
				setState(866);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(865); template_args();
					}
				}

				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==9) {
					{
					{
					setState(868); match(9);
					setState(869); base_type();
					setState(871);
					_la = _input.LA(1);
					if (_la==23) {
						{
						setState(870); template_args();
						}
					}

					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(879);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(878); match(CV_QUALIFIER);
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881); match(UNSIGNED);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882); match(SIGNED);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public TerminalNode ELLIPSIS(int i) {
			return getToken(ModuleParser.ELLIPSIS, i);
		}
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> LONG() { return getTokens(ModuleParser.LONG); }
		public List<TerminalNode> ELLIPSIS() { return getTokens(ModuleParser.ELLIPSIS); }
		public List<TerminalNode> AUTO() { return getTokens(ModuleParser.AUTO); }
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode LONG(int i) {
			return getToken(ModuleParser.LONG, i);
		}
		public TerminalNode AUTO(int i) {
			return getToken(ModuleParser.AUTO, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(889); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					_la = _input.LA(1);
					if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(887);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(886); match(ELLIPSIS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(891); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		public TerminalNode GCC_ATTRIBUTE() { return getToken(ModuleParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893); match(GCC_ATTRIBUTE);
			setState(894); match(16);
			setState(895); match(16);
			setState(896); identifier();
			setState(897); match(61);
			setState(898); match(61);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); assign_expr();
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(901); match(18);
				setState(902); expr();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905); conditional_expression();
			setState(909);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 33) | (1L << 35) | (1L << 39))) != 0)) {
				{
				setState(906); assignment_operator();
				setState(907); assign_expr();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNormOr(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_conditional_expression);
		try {
			setState(918);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(911); or_expression();
				}
				break;

			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(912); or_expression();
				{
				setState(913); match(43);
				setState(914); expr();
				setState(915); match(52);
				setState(916); conditional_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920); and_expression();
			setState(923);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(921); match(38);
				setState(922); or_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925); inclusive_or_expression();
			setState(928);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(926); match(6);
				setState(927); and_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930); exclusive_or_expression();
			setState(933);
			_la = _input.LA(1);
			if (_la==56) {
				{
				setState(931); match(56);
				setState(932); inclusive_or_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); bit_and_expression();
			setState(938);
			_la = _input.LA(1);
			if (_la==12) {
				{
				setState(936); match(12);
				setState(937); exclusive_or_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); equality_expression();
			setState(943);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(941); match(46);
				setState(942); bit_and_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); relational_expression();
			setState(949);
			_la = _input.LA(1);
			if (_la==4 || _la==55) {
				{
				setState(946); equality_operator();
				setState(947); equality_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951); shift_expression();
			setState(955);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 23) | (1L << 45) | (1L << 58))) != 0)) {
				{
				setState(952); relational_operator();
				setState(953); relational_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957); additive_expression();
			setState(960);
			_la = _input.LA(1);
			if (_la==7 || _la==42) {
				{
				setState(958);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==42) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(959); shift_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962); multiplicative_expression();
			setState(965);
			_la = _input.LA(1);
			if (_la==31 || _la==63) {
				{
				setState(963);
				_la = _input.LA(1);
				if ( !(_la==31 || _la==63) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(964); additive_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967); cast_expression();
			setState(970);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) {
				{
				setState(968);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << 47) | (1L << 60))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(969); multiplicative_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCpp_cast_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCpp_cast_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCpp_cast_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cpp_cast_identifierContext cpp_cast_identifier() throws RecognitionException {
		Cpp_cast_identifierContext _localctx = new Cpp_cast_identifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cpp_cast_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cast_expression);
		try {
			setState(988);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(974); match(16);
				setState(975); cast_target();
				setState(976); match(61);
				setState(977); cast_expression();
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979); cpp_cast_identifier();
				setState(980); match(23);
				setState(981); cast_target();
				setState(982); match(58);
				setState(983); match(16);
				setState(984); cast_expression();
				setState(985); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(987); unary_expression();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); type_name();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(991); ptr_operator();
				}
				}
				setState(996);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_unary_expression);
		try {
			setState(1005);
			switch (_input.LA(1)) {
			case 22:
			case 54:
				enterOuterAlt(_localctx, 1);
				{
				setState(997); inc_dec();
				setState(998); cast_expression();
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
				setState(1000); unary_op_and_cast_expr();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 3);
				{
				setState(1001); sizeof_expression();
				}
				break;
			case 9:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(1002); new_expression();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1003); delete_expression();
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
				setState(1004); postfix_expression(0);
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
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_new_expression);
		int _la;
		try {
			setState(1029);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(1007); match(9);
					}
				}

				setState(1010); match(NEW);
				setState(1011); type_name();
				setState(1012); match(53);
				setState(1014);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(1013); conditional_expression();
					}
				}

				setState(1016); match(24);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(1018); match(9);
					}
				}

				setState(1021); match(NEW);
				setState(1022); type_name();
				setState(1023); match(16);
				setState(1025);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(1024); expr();
					}
				}

				setState(1027); match(61);
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
		public TerminalNode DELETE() { return getToken(ModuleParser.DELETE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Delete_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDelete_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDelete_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDelete_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_expressionContext delete_expression() throws RecognitionException {
		Delete_expressionContext _localctx = new Delete_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_delete_expression);
		try {
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); match(DELETE);
				setState(1032); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033); match(DELETE);
				setState(1034); match(53);
				setState(1035); match(24);
				setState(1036); identifier();
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039); unary_operator();
			setState(1040); cast_expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_sizeof_expression);
		try {
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042); sizeof();
				setState(1043); sizeof_operand2();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045); sizeof();
				setState(1046); match(16);
				setState(1047); sizeof_operand2();
				setState(1048); match(61);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1050); sizeof();
				setState(1051); match(16);
				setState(1052); sizeof_operand();
				setState(1053); match(61);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); match(30);
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); type_name();
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46 || _la==47) {
				{
				{
				setState(1060); ptr_operator();
				}
				}
				setState(1065);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 202, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); unary_expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitMemberAccess(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitIncDecOp(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPrimaryOnly(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFuncCall(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1071); primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1097);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1073);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1074); match(53);
						setState(1075); expr();
						setState(1076); match(24);
						}
						break;

					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1078);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1079); match(16);
						setState(1080); function_argument_list();
						setState(1081); match(61);
						}
						break;

					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1083);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1084); match(48);
						setState(1086);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1085); match(TEMPLATE);
							}
						}

						{
						setState(1088); identifier();
						}
						}
						break;

					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1089);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1090); match(50);
						setState(1092);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1091); match(TEMPLATE);
							}
						}

						{
						setState(1094); identifier();
						}
						}
						break;

					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1095);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1096); inc_dec();
						}
						break;
					}
					} 
				}
				setState(1101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 9) | (1L << 16) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 46) | (1L << 47) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 62) | (1L << 63))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (DELETE - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(1102); function_argument();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==18) {
					{
					{
					setState(1103); match(18);
					setState(1104); function_argument();
					}
					}
					setState(1109);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); assign_expr();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_primary_expression);
		try {
			setState(1120);
			switch (_input.LA(1)) {
			case 2:
			case 29:
			case 57:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114); identifier();
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
				setState(1115); constant();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1116); match(16);
				setState(1117); expr();
				setState(1118); match(61);
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
		case 46: return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);

		case 52: return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);

		case 103: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3t\u0465\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\3\2\3\2\3\2\3\2\7\2\u00de\n\2\f\2\16\2\u00e1\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\5\4\u00e9\n\4\3\4\7\4\u00ec\n\4\f\4\16\4\u00ef\13\4\5"+
		"\4\u00f1\n\4\3\4\5\4\u00f4\n\4\3\4\3\4\3\4\5\4\u00f9\n\4\3\4\3\4\3\5\7"+
		"\5\u00fe\n\5\f\5\16\5\u0101\13\5\3\5\5\5\u0104\n\5\3\5\3\5\3\5\5\5\u0109"+
		"\n\5\3\5\3\5\3\6\7\6\u010e\n\6\f\6\16\6\u0111\13\6\3\6\3\6\3\6\7\6\u0116"+
		"\n\6\f\6\16\6\u0119\13\6\3\7\3\7\5\7\u011d\n\7\3\7\3\7\7\7\u0121\n\7\f"+
		"\7\16\7\u0124\13\7\3\7\5\7\u0127\n\7\3\b\3\b\3\b\7\b\u012c\n\b\f\b\16"+
		"\b\u012f\13\b\3\b\3\b\5\b\u0133\n\b\3\b\5\b\u0136\n\b\3\t\3\t\5\t\u013a"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0141\n\n\5\n\u0143\n\n\3\13\5\13\u0146\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u014d\n\13\3\13\5\13\u0150\n\13\3\13"+
		"\5\13\u0153\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u015f"+
		"\n\16\f\16\16\16\u0162\13\16\3\17\3\17\3\17\3\20\5\20\u0168\n\20\3\20"+
		"\3\20\3\21\3\21\5\21\u016e\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0179\n\22\3\23\3\23\3\23\3\23\3\23\3\24\7\24\u0181\n\24\f"+
		"\24\16\24\u0184\13\24\3\24\3\24\3\24\3\24\7\24\u018a\n\24\f\24\16\24\u018d"+
		"\13\24\7\24\u018f\n\24\f\24\16\24\u0192\13\24\3\25\3\25\3\25\5\25\u0197"+
		"\n\25\3\25\3\25\3\25\5\25\u019c\n\25\3\26\5\26\u019f\n\26\3\26\3\26\5"+
		"\26\u01a3\n\26\3\26\5\26\u01a6\n\26\3\26\5\26\u01a9\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01b1\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u01b8\n"+
		"\27\3\30\7\30\u01bb\n\30\f\30\16\30\u01be\13\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01cc\n\30\3\30\7\30\u01cf"+
		"\n\30\f\30\16\30\u01d2\13\30\7\30\u01d4\n\30\f\30\16\30\u01d7\13\30\3"+
		"\31\7\31\u01da\n\31\f\31\16\31\u01dd\13\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01eb\n\31\3\31\7\31\u01ee\n\31"+
		"\f\31\16\31\u01f1\13\31\7\31\u01f3\n\31\f\31\16\31\u01f6\13\31\3\32\7"+
		"\32\u01f9\n\32\f\32\16\32\u01fc\13\32\3\32\3\32\3\32\3\32\7\32\u0202\n"+
		"\32\f\32\16\32\u0205\13\32\7\32\u0207\n\32\f\32\16\32\u020a\13\32\3\33"+
		"\7\33\u020d\n\33\f\33\16\33\u0210\13\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\5\35\u0218\n\35\3\35\7\35\u021b\n\35\f\35\16\35\u021e\13\35\3\35\3\35"+
		"\3\35\5\35\u0223\n\35\3\36\3\36\3\36\7\36\u0228\n\36\f\36\16\36\u022b"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0234\n\37\3 \3 \3 \7 "+
		"\u0239\n \f \16 \u023c\13 \3!\5!\u023f\n!\3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\7#\u024c\n#\f#\16#\u024f\13#\5#\u0251\n#\3#\5#\u0254\n#\3$\3$"+
		"\3$\3%\5%\u025a\n%\3%\3%\3%\3%\3%\5%\u0261\n%\5%\u0263\n%\3%\5%\u0266"+
		"\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\5,\u0277\n,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02a1\n,\3-\3-\3.\3.\3"+
		"/\3/\3/\5/\u02aa\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u02b4\n\60"+
		"\3\60\3\60\3\60\7\60\u02b9\n\60\f\60\16\60\u02bc\13\60\3\61\3\61\3\61"+
		"\3\61\5\61\u02c2\n\61\6\61\u02c4\n\61\r\61\16\61\u02c5\3\61\3\61\3\62"+
		"\3\62\5\62\u02cc\n\62\3\62\5\62\u02cf\n\62\3\62\5\62\u02d2\n\62\3\62\5"+
		"\62\u02d5\n\62\3\63\3\63\3\64\6\64\u02da\n\64\r\64\16\64\u02db\3\64\5"+
		"\64\u02df\n\64\3\65\3\65\5\65\u02e3\n\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\7\66\u02ed\n\66\f\66\16\66\u02f0\13\66\3\67\5\67\u02f3\n\67"+
		"\3\67\3\67\5\67\u02f7\n\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\7C\u0312\nC\fC\16C\u0315\13C\3C\5C\u0318"+
		"\nC\3D\3D\3E\5E\u031d\nE\3E\3E\5E\u0321\nE\6E\u0323\nE\rE\16E\u0324\3"+
		"F\3F\3G\3G\3H\3H\3I\7I\u032e\nI\fI\16I\u0331\13I\3I\3I\5I\u0335\nI\3I"+
		"\5I\u0338\nI\3I\5I\u033b\nI\3I\5I\u033e\nI\3I\3I\3I\3J\3J\3K\3K\3K\3K"+
		"\7K\u0349\nK\fK\16K\u034c\13K\3L\5L\u034f\nL\3L\5L\u0352\nL\3L\3L\5L\u0356"+
		"\nL\3M\7M\u0359\nM\fM\16M\u035c\13M\3M\3M\3M\5M\u0361\nM\3M\3M\5M\u0365"+
		"\nM\3M\3M\3M\5M\u036a\nM\7M\u036c\nM\fM\16M\u036f\13M\3M\5M\u0372\nM\3"+
		"M\3M\5M\u0376\nM\3N\3N\5N\u037a\nN\6N\u037c\nN\rN\16N\u037d\3O\3O\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\5P\u038a\nP\3Q\3Q\3Q\3Q\5Q\u0390\nQ\3R\3R\3R\3R\3"+
		"R\3R\3R\5R\u0399\nR\3S\3S\3S\5S\u039e\nS\3T\3T\3T\5T\u03a3\nT\3U\3U\3"+
		"U\5U\u03a8\nU\3V\3V\3V\5V\u03ad\nV\3W\3W\3W\5W\u03b2\nW\3X\3X\3X\3X\5"+
		"X\u03b8\nX\3Y\3Y\3Y\3Y\5Y\u03be\nY\3Z\3Z\3Z\5Z\u03c3\nZ\3[\3[\3[\5[\u03c8"+
		"\n[\3\\\3\\\3\\\5\\\u03cd\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\5^\u03df\n^\3_\3_\7_\u03e3\n_\f_\16_\u03e6\13_\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\5`\u03f0\n`\3a\5a\u03f3\na\3a\3a\3a\3a\5a\u03f9\na\3a\3a\3a"+
		"\5a\u03fe\na\3a\3a\3a\3a\5a\u0404\na\3a\3a\5a\u0408\na\3b\3b\3b\3b\3b"+
		"\3b\5b\u0410\nb\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0422"+
		"\nd\3e\3e\3f\3f\7f\u0428\nf\ff\16f\u042b\13f\3g\3g\3h\3h\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0441\ni\3i\3i\3i\3i\5i\u0447\n"+
		"i\3i\3i\3i\7i\u044c\ni\fi\16i\u044f\13i\3j\3j\3j\7j\u0454\nj\fj\16j\u0457"+
		"\13j\5j\u0459\nj\3k\3k\3l\3l\3l\3l\3l\3l\5l\u0463\nl\3l\2\5^j\u00d0m\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\2\37\3\2MN\3\2Z[\7\2\33\33!!\60\61==AA\6\2\27\27\31\31//<<\3\2ho\6\2"+
		"\35\36**\65\65TT\3\2\60\61\5\2\4\4\37\37;;\3\2^_\f\2\3\3\5\5\n\n\f\r\20"+
		"\20\23\23\25\25##%%))\4\2\6\699\4\2\26\26\'\'\4\2\22\22??\7\2\22\22\32"+
		"\32\67\67??bc\5\2\22\22++??\6\2\22\22\31\31<<??\3\2bc\4\2\32\32\67\67"+
		"\5\2\32\32++\67\67\4\2\24\24++\t\2\22\22\24\24\32\32++\67\67??bc\3\2h"+
		"j\6\2\21\21\"\"\'\'..\6\2OORRZZaa\4\2\t\t,,\4\2!!AA\5\2$$\61\61>>\6\2"+
		"\34\34&&\63\63@@\4\2\30\3088\u04bb\2\u00df\3\2\2\2\4\u00e2\3\2\2\2\6\u00f0"+
		"\3\2\2\2\b\u00ff\3\2\2\2\n\u010f\3\2\2\2\f\u011a\3\2\2\2\16\u0135\3\2"+
		"\2\2\20\u0139\3\2\2\2\22\u0142\3\2\2\2\24\u0145\3\2\2\2\26\u0154\3\2\2"+
		"\2\30\u0157\3\2\2\2\32\u015a\3\2\2\2\34\u0163\3\2\2\2\36\u0167\3\2\2\2"+
		" \u016b\3\2\2\2\"\u0178\3\2\2\2$\u017a\3\2\2\2&\u0182\3\2\2\2(\u0193\3"+
		"\2\2\2*\u01b0\3\2\2\2,\u01b7\3\2\2\2.\u01bc\3\2\2\2\60\u01db\3\2\2\2\62"+
		"\u01fa\3\2\2\2\64\u020e\3\2\2\2\66\u0213\3\2\2\28\u0222\3\2\2\2:\u0224"+
		"\3\2\2\2<\u0233\3\2\2\2>\u0235\3\2\2\2@\u023e\3\2\2\2B\u0242\3\2\2\2D"+
		"\u0253\3\2\2\2F\u0255\3\2\2\2H\u0259\3\2\2\2J\u0267\3\2\2\2L\u0269\3\2"+
		"\2\2N\u026b\3\2\2\2P\u026d\3\2\2\2R\u026f\3\2\2\2T\u0271\3\2\2\2V\u02a0"+
		"\3\2\2\2X\u02a2\3\2\2\2Z\u02a4\3\2\2\2\\\u02a6\3\2\2\2^\u02b3\3\2\2\2"+
		"`\u02bd\3\2\2\2b\u02ce\3\2\2\2d\u02d6\3\2\2\2f\u02d9\3\2\2\2h\u02e0\3"+
		"\2\2\2j\u02e6\3\2\2\2l\u02f2\3\2\2\2n\u02f8\3\2\2\2p\u02fa\3\2\2\2r\u02fc"+
		"\3\2\2\2t\u02fe\3\2\2\2v\u0300\3\2\2\2x\u0302\3\2\2\2z\u0304\3\2\2\2|"+
		"\u0306\3\2\2\2~\u0308\3\2\2\2\u0080\u030a\3\2\2\2\u0082\u030c\3\2\2\2"+
		"\u0084\u0317\3\2\2\2\u0086\u0319\3\2\2\2\u0088\u0322\3\2\2\2\u008a\u0326"+
		"\3\2\2\2\u008c\u0328\3\2\2\2\u008e\u032a\3\2\2\2\u0090\u032f\3\2\2\2\u0092"+
		"\u0342\3\2\2\2\u0094\u0344\3\2\2\2\u0096\u034e\3\2\2\2\u0098\u0375\3\2"+
		"\2\2\u009a\u037b\3\2\2\2\u009c\u037f\3\2\2\2\u009e\u0386\3\2\2\2\u00a0"+
		"\u038b\3\2\2\2\u00a2\u0398\3\2\2\2\u00a4\u039a\3\2\2\2\u00a6\u039f\3\2"+
		"\2\2\u00a8\u03a4\3\2\2\2\u00aa\u03a9\3\2\2\2\u00ac\u03ae\3\2\2\2\u00ae"+
		"\u03b3\3\2\2\2\u00b0\u03b9\3\2\2\2\u00b2\u03bf\3\2\2\2\u00b4\u03c4\3\2"+
		"\2\2\u00b6\u03c9\3\2\2\2\u00b8\u03ce\3\2\2\2\u00ba\u03de\3\2\2\2\u00bc"+
		"\u03e0\3\2\2\2\u00be\u03ef\3\2\2\2\u00c0\u0407\3\2\2\2\u00c2\u040f\3\2"+
		"\2\2\u00c4\u0411\3\2\2\2\u00c6\u0421\3\2\2\2\u00c8\u0423\3\2\2\2\u00ca"+
		"\u0425\3\2\2\2\u00cc\u042c\3\2\2\2\u00ce\u042e\3\2\2\2\u00d0\u0430\3\2"+
		"\2\2\u00d2\u0458\3\2\2\2\u00d4\u045a\3\2\2\2\u00d6\u0462\3\2\2\2\u00d8"+
		"\u00de\5\6\4\2\u00d9\u00de\5\b\5\2\u00da\u00de\5\64\33\2\u00db\u00de\5"+
		"\4\3\2\u00dc\u00de\5\u0082B\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2"+
		"\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7X\2\2\u00e3\u00e4\7Y\2\2\u00e4\u00e5\5\u0084"+
		"C\2\u00e5\u00e6\7+\2\2\u00e6\5\3\2\2\2\u00e7\u00e9\7N\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00ec\5\\/\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5\n\6\2\u00f3\u00f2\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5\"\22\2\u00f6"+
		"\u00f8\5\f\7\2\u00f7\u00f9\5\32\16\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7+\2\2\u00fb\7\3\2\2\2\u00fc\u00fe"+
		"\5\\/\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\5\n"+
		"\6\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\5\"\22\2\u0106\u0108\5\f\7\2\u0107\u0109\5\32\16\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\5\30\r\2"+
		"\u010b\t\3\2\2\2\u010c\u010e\5P)\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\5\u0098M\2\u0113\u0117\3\2\2\2\u0114\u0116"+
		"\5R*\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\13\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\7\22\2"+
		"\2\u011b\u011d\5\16\b\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0122\7?\2\2\u011f\u0121\7S\2\2\u0120\u011f\3\2\2"+
		"\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5$\23\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\r\3\2\2\2\u0128\u012d\5\22\n\2\u0129\u012a\7\24\2"+
		"\2\u012a\u012c\5\22\n\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0131\7\24\2\2\u0131\u0133\7s\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136\7O\2\2\u0135\u0128\3\2"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\17\3\2\2\2\u0137\u013a\5\u0088E\2\u0138"+
		"\u013a\5\u008cG\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\21\3\2"+
		"\2\2\u013b\u013c\5@!\2\u013c\u013d\5\24\13\2\u013d\u0143\3\2\2\2\u013e"+
		"\u0140\5@!\2\u013f\u0141\5\20\t\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u013e\3\2\2\2\u0143"+
		"\23\3\2\2\2\u0144\u0146\5\20\t\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2"+
		"\2\u0146\u014c\3\2\2\2\u0147\u0148\7\22\2\2\u0148\u0149\5\24\13\2\u0149"+
		"\u014a\7?\2\2\u014a\u014d\3\2\2\2\u014b\u014d\5B\"\2\u014c\u0147\3\2\2"+
		"\2\u014c\u014b\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\5,\27\2\u014f\u014e"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5\26\f\2"+
		"\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\25\3\2\2\2\u0154\u0155"+
		"\7\f\2\2\u0155\u0156\5\u009eP\2\u0156\27\3\2\2\2\u0157\u0158\7b\2\2\u0158"+
		"\u0159\b\r\1\2\u0159\31\3\2\2\2\u015a\u015b\7\66\2\2\u015b\u0160\5\34"+
		"\17\2\u015c\u015d\7\24\2\2\u015d\u015f\5\34\17\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\33\3\2\2"+
		"\2\u0162\u0160\3\2\2\2\u0163\u0164\5\36\20\2\u0164\u0165\5 \21\2\u0165"+
		"\35\3\2\2\2\u0166\u0168\7\13\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016a\5\u0084C\2\u016a\37\3\2\2\2\u016b\u016d"+
		"\7\22\2\2\u016c\u016e\5\u009eP\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\7?\2\2\u0170!\3\2\2\2\u0171\u0172\7"+
		"\22\2\2\u0172\u0173\5\"\22\2\u0173\u0174\7?\2\2\u0174\u0179\3\2\2\2\u0175"+
		"\u0179\5\u0084C\2\u0176\u0177\7\\\2\2\u0177\u0179\5V,\2\u0178\u0171\3"+
		"\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0179#\3\2\2\2\u017a\u017b"+
		"\7W\2\2\u017b\u017c\7\22\2\2\u017c\u017d\5&\24\2\u017d\u017e\7?\2\2\u017e"+
		"%\3\2\2\2\u017f\u0181\5n8\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0190\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\7\22\2\2\u0186\u0187\5&\24\2\u0187\u018b\7?\2\2\u0188"+
		"\u018a\5n8\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2"+
		"\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0185"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\'\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u019b\5*\26\2\u0194\u0196\7\22\2"+
		"\2\u0195\u0197\5\u009eP\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019c\7?\2\2\u0199\u019a\7\f\2\2\u019a\u019c\5.\30"+
		"\2\u019b\u0194\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c)"+
		"\3\2\2\2\u019d\u019f\5\u0088E\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\5\u0084C\2\u01a1\u01a3\5h\65\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a6\5,"+
		"\27\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b1\3\2\2\2\u01a7"+
		"\u01a9\5\u0088E\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ab\7\22\2\2\u01ab\u01ac\5\u008aF\2\u01ac\u01ad\5\u0084"+
		"C\2\u01ad\u01ae\7?\2\2\u01ae\u01af\5,\27\2\u01af\u01b1\3\2\2\2\u01b0\u019e"+
		"\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b1+\3\2\2\2\u01b2\u01b3\7\67\2\2\u01b3"+
		"\u01b4\5\62\32\2\u01b4\u01b5\7\32\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b8"+
		"\5D#\2\u01b7\u01b2\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8-\3\2\2\2\u01b9\u01bb"+
		"\5~@\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01d5\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7b"+
		"\2\2\u01c0\u01c1\5\60\31\2\u01c1\u01c2\7c\2\2\u01c2\u01cc\3\2\2\2\u01c3"+
		"\u01c4\7\22\2\2\u01c4\u01c5\5\60\31\2\u01c5\u01c6\7?\2\2\u01c6\u01cc\3"+
		"\2\2\2\u01c7\u01c8\7\67\2\2\u01c8\u01c9\5\60\31\2\u01c9\u01ca\7\32\2\2"+
		"\u01ca\u01cc\3\2\2\2\u01cb\u01bf\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01c7"+
		"\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\5~@\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6/\3\2\2\2\u01d7\u01d5\3\2\2\2"+
		"\u01d8\u01da\5\u0080A\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01f4\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01de\u01df\7b\2\2\u01df\u01e0\5\60\31\2\u01e0\u01e1\7c\2\2\u01e1"+
		"\u01eb\3\2\2\2\u01e2\u01e3\7\22\2\2\u01e3\u01e4\5\60\31\2\u01e4\u01e5"+
		"\7?\2\2\u01e5\u01eb\3\2\2\2\u01e6\u01e7\7\67\2\2\u01e7\u01e8\5\60\31\2"+
		"\u01e8\u01e9\7\32\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01de\3\2\2\2\u01ea\u01e2"+
		"\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ee\5\u0080A"+
		"\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f3"+
		"\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\61\3\2\2"+
		"\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5x=\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc"+
		"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0208\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\7\67\2\2\u01fe\u01ff\5\62\32\2\u01ff\u0203"+
		"\7\32\2\2\u0200\u0202\5x=\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u01fd\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\63\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\5\66\34"+
		"\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\58\35\2\u0212"+
		"\65\3\2\2\2\u0213\u0214\t\2\2\2\u0214\67\3\2\2\2\u0215\u0217\5\u0090I"+
		"\2\u0216\u0218\5:\36\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0223"+
		"\3\2\2\2\u0219\u021b\5\\/\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021f\u0220\5\u0098M\2\u0220\u0221\5:\36\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0215\3\2\2\2\u0222\u021c\3\2\2\2\u02239\3\2\2\2\u0224\u0229\5(\25\2"+
		"\u0225\u0226\7\24\2\2\u0226\u0228\5(\25\2\u0227\u0225\3\2\2\2\u0228\u022b"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\7+\2\2\u022d;\3\2\2\2\u022e\u0234\5\u00a0Q"+
		"\2\u022f\u0230\7b\2\2\u0230\u0231\5> \2\u0231\u0232\7c\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u022e\3\2\2\2\u0233\u022f\3\2\2\2\u0234=\3\2\2\2\u0235"+
		"\u023a\5<\37\2\u0236\u0237\7\24\2\2\u0237\u0239\5<\37\2\u0238\u0236\3"+
		"\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"?\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f\t\3\2\2\u023e\u023d\3\2\2\2"+
		"\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5\u0098M\2\u0241"+
		"A\3\2\2\2\u0242\u0243\5\u0084C\2\u0243C\3\2\2\2\u0244\u0245\7\22\2\2\u0245"+
		"\u0246\7O\2\2\u0246\u0254\7?\2\2\u0247\u0250\7\22\2\2\u0248\u024d\5F$"+
		"\2\u0249\u024a\7\24\2\2\u024a\u024c\5F$\2\u024b\u0249\3\2\2\2\u024c\u024f"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0248\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0254\7?\2\2\u0253\u0244\3\2\2\2\u0253\u0247\3\2\2\2\u0254"+
		"E\3\2\2\2\u0255\u0256\5@!\2\u0256\u0257\5H%\2\u0257G\3\2\2\2\u0258\u025a"+
		"\5\u0088E\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0262\3\2\2"+
		"\2\u025b\u025c\7\22\2\2\u025c\u025d\5H%\2\u025d\u025e\7?\2\2\u025e\u0263"+
		"\3\2\2\2\u025f\u0261\5B\"\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0263\3\2\2\2\u0262\u025b\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0265\3\2"+
		"\2\2\u0264\u0266\5,\27\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"I\3\2\2\2\u0267\u0268\t\4\2\2\u0268K\3\2\2\2\u0269\u026a\t\5\2\2\u026a"+
		"M\3\2\2\2\u026b\u026c\t\6\2\2\u026cO\3\2\2\2\u026d\u026e\t\7\2\2\u026e"+
		"Q\3\2\2\2\u026f\u0270\t\b\2\2\u0270S\3\2\2\2\u0271\u0272\t\t\2\2\u0272"+
		"U\3\2\2\2\u0273\u0276\t\n\2\2\u0274\u0275\7\67\2\2\u0275\u0277\7\32\2"+
		"\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u02a1\3\2\2\2\u0278\u02a1"+
		"\7!\2\2\u0279\u02a1\7A\2\2\u027a\u02a1\7\61\2\2\u027b\u02a1\7$\2\2\u027c"+
		"\u02a1\7>\2\2\u027d\u02a1\7\16\2\2\u027e\u02a1\7\60\2\2\u027f\u02a1\7"+
		":\2\2\u0280\u02a1\7\33\2\2\u0281\u02a1\7=\2\2\u0282\u02a1\7\f\2\2\u0283"+
		"\u02a1\7\31\2\2\u0284\u02a1\7<\2\2\u0285\u02a1\7\3\2\2\u0286\u02a1\7\23"+
		"\2\2\u0287\u02a1\7#\2\2\u0288\u02a1\7\25\2\2\u0289\u02a1\7\5\2\2\u028a"+
		"\u02a1\7\n\2\2\u028b\u02a1\7%\2\2\u028c\u02a1\7\20\2\2\u028d\u02a1\7\t"+
		"\2\2\u028e\u02a1\7,\2\2\u028f\u02a1\7)\2\2\u0290\u02a1\7\r\2\2\u0291\u02a1"+
		"\79\2\2\u0292\u02a1\7\6\2\2\u0293\u02a1\7/\2\2\u0294\u02a1\7\27\2\2\u0295"+
		"\u02a1\7\b\2\2\u0296\u02a1\7(\2\2\u0297\u02a1\7\30\2\2\u0298\u02a1\78"+
		"\2\2\u0299\u02a1\7\24\2\2\u029a\u02a1\7\17\2\2\u029b\u02a1\7\64\2\2\u029c"+
		"\u029d\7\22\2\2\u029d\u02a1\7?\2\2\u029e\u029f\7\67\2\2\u029f\u02a1\7"+
		"\32\2\2\u02a0\u0273\3\2\2\2\u02a0\u0278\3\2\2\2\u02a0\u0279\3\2\2\2\u02a0"+
		"\u027a\3\2\2\2\u02a0\u027b\3\2\2\2\u02a0\u027c\3\2\2\2\u02a0\u027d\3\2"+
		"\2\2\u02a0\u027e\3\2\2\2\u02a0\u027f\3\2\2\2\u02a0\u0280\3\2\2\2\u02a0"+
		"\u0281\3\2\2\2\u02a0\u0282\3\2\2\2\u02a0\u0283\3\2\2\2\u02a0\u0284\3\2"+
		"\2\2\u02a0\u0285\3\2\2\2\u02a0\u0286\3\2\2\2\u02a0\u0287\3\2\2\2\u02a0"+
		"\u0288\3\2\2\2\u02a0\u0289\3\2\2\2\u02a0\u028a\3\2\2\2\u02a0\u028b\3\2"+
		"\2\2\u02a0\u028c\3\2\2\2\u02a0\u028d\3\2\2\2\u02a0\u028e\3\2\2\2\u02a0"+
		"\u028f\3\2\2\2\u02a0\u0290\3\2\2\2\u02a0\u0291\3\2\2\2\u02a0\u0292\3\2"+
		"\2\2\u02a0\u0293\3\2\2\2\u02a0\u0294\3\2\2\2\u02a0\u0295\3\2\2\2\u02a0"+
		"\u0296\3\2\2\2\u02a0\u0297\3\2\2\2\u02a0\u0298\3\2\2\2\u02a0\u0299\3\2"+
		"\2\2\u02a0\u029a\3\2\2\2\u02a0\u029b\3\2\2\2\u02a0\u029c\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1W\3\2\2\2\u02a2\u02a3\t\13\2\2\u02a3Y\3\2\2\2\u02a4"+
		"\u02a5\t\f\2\2\u02a5[\3\2\2\2\u02a6\u02a7\7]\2\2\u02a7\u02a9\7\31\2\2"+
		"\u02a8\u02aa\5^\60\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab"+
		"\3\2\2\2\u02ab\u02ac\7<\2\2\u02ac]\3\2\2\2\u02ad\u02ae\b\60\1\2\u02ae"+
		"\u02af\5`\61\2\u02af\u02b0\5d\63\2\u02b0\u02b1\5f\64\2\u02b1\u02b4\3\2"+
		"\2\2\u02b2\u02b4\5b\62\2\u02b3\u02ad\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u02ba\3\2\2\2\u02b5\u02b6\f\3\2\2\u02b6\u02b7\7\24\2\2\u02b7\u02b9\5"+
		"b\62\2\u02b8\u02b5\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb_\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7]\2\2\u02be"+
		"\u02c3\7\31\2\2\u02bf\u02c1\5d\63\2\u02c0\u02c2\7\24\2\2\u02c1\u02c0\3"+
		"\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u02c8\7<\2\2\u02c8a\3\2\2\2\u02c9\u02cf\5d\63\2\u02ca\u02cc"+
		"\7S\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\5\u0084C\2\u02ce\u02c9\3\2\2\2\u02ce\u02cb\3\2\2\2\u02cf\u02d1"+
		"\3\2\2\2\u02d0\u02d2\5f\64\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02d5\5R*\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2"+
		"\2\u02d5c\3\2\2\2\u02d6\u02d7\t\r\2\2\u02d7e\3\2\2\2\u02d8\u02da\7a\2"+
		"\2\u02d9\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc"+
		"\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02df\7s\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02dfg\3\2\2\2\u02e0\u02e2\7\31\2\2\u02e1\u02e3\5j\66\2"+
		"\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\7<\2\2\u02e5i\3\2\2\2\u02e6\u02e7\b\66\1\2\u02e7\u02e8\5l\67\2\u02e8"+
		"\u02ee\3\2\2\2\u02e9\u02ea\f\3\2\2\u02ea\u02eb\7\24\2\2\u02eb\u02ed\5"+
		"l\67\2\u02ec\u02e9\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02efk\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f3\7S\2\2\u02f2"+
		"\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\5\u009a"+
		"N\2\u02f5\u02f7\5R*\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7m\3"+
		"\2\2\2\u02f8\u02f9\n\16\2\2\u02f9o\3\2\2\2\u02fa\u02fb\n\17\2\2\u02fb"+
		"q\3\2\2\2\u02fc\u02fd\n\20\2\2\u02fds\3\2\2\2\u02fe\u02ff\n\21\2\2\u02ff"+
		"u\3\2\2\2\u0300\u0301\n\22\2\2\u0301w\3\2\2\2\u0302\u0303\n\23\2\2\u0303"+
		"y\3\2\2\2\u0304\u0305\n\24\2\2\u0305{\3\2\2\2\u0306\u0307\n\25\2\2\u0307"+
		"}\3\2\2\2\u0308\u0309\n\26\2\2\u0309\177\3\2\2\2\u030a\u030b\n\17\2\2"+
		"\u030b\u0081\3\2\2\2\u030c\u030d\13\2\2\2\u030d\u0083\3\2\2\2\u030e\u0313"+
		"\7a\2\2\u030f\u0310\7\13\2\2\u0310\u0312\7a\2\2\u0311\u030f\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0318\3\2"+
		"\2\2\u0315\u0313\3\2\2\2\u0316\u0318\5T+\2\u0317\u030e\3\2\2\2\u0317\u0316"+
		"\3\2\2\2\u0318\u0085\3\2\2\2\u0319\u031a\t\27\2\2\u031a\u0087\3\2\2\2"+
		"\u031b\u031d\7S\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u0320\5R*\2\u031f\u0321\7\7\2\2\u0320\u031f\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322\u031c\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0089\3\2\2\2\u0326"+
		"\u0327\5\u0088E\2\u0327\u008b\3\2\2\2\u0328\u0329\7\b\2\2\u0329\u008d"+
		"\3\2\2\2\u032a\u032b\t\30\2\2\u032b\u008f\3\2\2\2\u032c\u032e\5\\/\2\u032d"+
		"\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2"+
		"\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0334\5\u008eH\2\u0333"+
		"\u0335\5\u009cO\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337"+
		"\3\2\2\2\u0336\u0338\5\u0092J\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2"+
		"\2\u0338\u033a\3\2\2\2\u0339\u033b\5h\65\2\u033a\u0339\3\2\2\2\u033a\u033b"+
		"\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033e\5\u0094K\2\u033d\u033c\3\2\2"+
		"\2\u033d\u033e\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\7b\2\2\u0340\u0341"+
		"\bI\1\2\u0341\u0091\3\2\2\2\u0342\u0343\5\u0084C\2\u0343\u0093\3\2\2\2"+
		"\u0344\u0345\7\66\2\2\u0345\u034a\5\u0096L\2\u0346\u0347\7\24\2\2\u0347"+
		"\u0349\5\u0096L\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348"+
		"\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0095\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034f\7T\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2"+
		"\2\2\u0350\u0352\5T+\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0355\5\u0084C\2\u0354\u0356\5h\65\2\u0355\u0354\3\2\2"+
		"\2\u0355\u0356\3\2\2\2\u0356\u0097\3\2\2\2\u0357\u0359\7S\2\2\u0358\u0357"+
		"\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u0360\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u0361\5\u008eH\2\u035e\u0361"+
		"\7P\2\2\u035f\u0361\7Q\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\5\u009a"+
		"N\2\u0363\u0365\5h\65\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u036d\3\2\2\2\u0366\u0367\7\13\2\2\u0367\u0369\5\u009aN\2\u0368\u036a"+
		"\5h\65\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b"+
		"\u0366\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0372\7S\2\2\u0371"+
		"\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0376\3\2\2\2\u0373\u0376\7P"+
		"\2\2\u0374\u0376\7Q\2\2\u0375\u035a\3\2\2\2\u0375\u0373\3\2\2\2\u0375"+
		"\u0374\3\2\2\2\u0376\u0099\3\2\2\2\u0377\u0379\t\31\2\2\u0378\u037a\7"+
		"s\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b"+
		"\u0377\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2"+
		"\2\2\u037e\u009b\3\2\2\2\u037f\u0380\7`\2\2\u0380\u0381\7\22\2\2\u0381"+
		"\u0382\7\22\2\2\u0382\u0383\5\u0084C\2\u0383\u0384\7?\2\2\u0384\u0385"+
		"\7?\2\2\u0385\u009d\3\2\2\2\u0386\u0389\5\u00a0Q\2\u0387\u0388\7\24\2"+
		"\2\u0388\u038a\5\u009eP\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u009f\3\2\2\2\u038b\u038f\5\u00a2R\2\u038c\u038d\5X-\2\u038d\u038e\5"+
		"\u00a0Q\2\u038e\u0390\3\2\2\2\u038f\u038c\3\2\2\2\u038f\u0390\3\2\2\2"+
		"\u0390\u00a1\3\2\2\2\u0391\u0399\5\u00a4S\2\u0392\u0393\5\u00a4S\2\u0393"+
		"\u0394\7-\2\2\u0394\u0395\5\u009eP\2\u0395\u0396\7\66\2\2\u0396\u0397"+
		"\5\u00a2R\2\u0397\u0399\3\2\2\2\u0398\u0391\3\2\2\2\u0398\u0392\3\2\2"+
		"\2\u0399\u00a3\3\2\2\2\u039a\u039d\5\u00a6T\2\u039b\u039c\7(\2\2\u039c"+
		"\u039e\5\u00a4S\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u00a5"+
		"\3\2\2\2\u039f\u03a2\5\u00a8U\2\u03a0\u03a1\7\b\2\2\u03a1\u03a3\5\u00a6"+
		"T\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u00a7\3\2\2\2\u03a4"+
		"\u03a7\5\u00aaV\2\u03a5\u03a6\7:\2\2\u03a6\u03a8\5\u00a8U\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u00a9\3\2\2\2\u03a9\u03ac\5\u00acW"+
		"\2\u03aa\u03ab\7\16\2\2\u03ab\u03ad\5\u00aaV\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u00ab\3\2\2\2\u03ae\u03b1\5\u00aeX\2\u03af\u03b0"+
		"\7\60\2\2\u03b0\u03b2\5\u00acW\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2"+
		"\2\u03b2\u00ad\3\2\2\2\u03b3\u03b7\5\u00b0Y\2\u03b4\u03b5\5Z.\2\u03b5"+
		"\u03b6\5\u00aeX\2\u03b6\u03b8\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u00af\3\2\2\2\u03b9\u03bd\5\u00b2Z\2\u03ba\u03bb\5L\'\2"+
		"\u03bb\u03bc\5\u00b0Y\2\u03bc\u03be\3\2\2\2\u03bd\u03ba\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03be\u00b1\3\2\2\2\u03bf\u03c2\5\u00b4[\2\u03c0\u03c1"+
		"\t\32\2\2\u03c1\u03c3\5\u00b2Z\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2"+
		"\2\u03c3\u00b3\3\2\2\2\u03c4\u03c7\5\u00b6\\\2\u03c5\u03c6\t\33\2\2\u03c6"+
		"\u03c8\5\u00b4[\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u00b5"+
		"\3\2\2\2\u03c9\u03cc\5\u00ba^\2\u03ca\u03cb\t\34\2\2\u03cb\u03cd\5\u00b6"+
		"\\\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u00b7\3\2\2\2\u03ce"+
		"\u03cf\t\35\2\2\u03cf\u00b9\3\2\2\2\u03d0\u03d1\7\22\2\2\u03d1\u03d2\5"+
		"\u00bc_\2\u03d2\u03d3\7?\2\2\u03d3\u03d4\5\u00ba^\2\u03d4\u03df\3\2\2"+
		"\2\u03d5\u03d6\5\u00b8]\2\u03d6\u03d7\7\31\2\2\u03d7\u03d8\5\u00bc_\2"+
		"\u03d8\u03d9\7<\2\2\u03d9\u03da\7\22\2\2\u03da\u03db\5\u00ba^\2\u03db"+
		"\u03dc\7?\2\2\u03dc\u03df\3\2\2\2\u03dd\u03df\5\u00be`\2\u03de\u03d0\3"+
		"\2\2\2\u03de\u03d5\3\2\2\2\u03de\u03dd\3\2\2\2\u03df\u00bb\3\2\2\2\u03e0"+
		"\u03e4\5\u0098M\2\u03e1\u03e3\5R*\2\u03e2\u03e1\3\2\2\2\u03e3\u03e6\3"+
		"\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u00bd\3\2\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e7\u03e8\5\u00ceh\2\u03e8\u03e9\5\u00ba^\2\u03e9\u03f0"+
		"\3\2\2\2\u03ea\u03f0\5\u00c4c\2\u03eb\u03f0\5\u00c6d\2\u03ec\u03f0\5\u00c0"+
		"a\2\u03ed\u03f0\5\u00c2b\2\u03ee\u03f0\5\u00d0i\2\u03ef\u03e7\3\2\2\2"+
		"\u03ef\u03ea\3\2\2\2\u03ef\u03eb\3\2\2\2\u03ef\u03ec\3\2\2\2\u03ef\u03ed"+
		"\3\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u00bf\3\2\2\2\u03f1\u03f3\7\13\2\2"+
		"\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5"+
		"\7^\2\2\u03f5\u03f6\5\u0098M\2\u03f6\u03f8\7\67\2\2\u03f7\u03f9\5\u00a2"+
		"R\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa"+
		"\u03fb\7\32\2\2\u03fb\u0408\3\2\2\2\u03fc\u03fe\7\13\2\2\u03fd\u03fc\3"+
		"\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7^\2\2\u0400"+
		"\u0401\5\u0098M\2\u0401\u0403\7\22\2\2\u0402\u0404\5\u009eP\2\u0403\u0402"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7?\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u03f2\3\2\2\2\u0407\u03fd\3\2\2\2\u0408\u00c1\3\2"+
		"\2\2\u0409\u040a\7_\2\2\u040a\u0410\5\u0084C\2\u040b\u040c\7_\2\2\u040c"+
		"\u040d\7\67\2\2\u040d\u040e\7\32\2\2\u040e\u0410\5\u0084C\2\u040f\u0409"+
		"\3\2\2\2\u040f\u040b\3\2\2\2\u0410\u00c3\3\2\2\2\u0411\u0412\5J&\2\u0412"+
		"\u0413\5\u00ba^\2\u0413\u00c5\3\2\2\2\u0414\u0415\5\u00c8e\2\u0415\u0416"+
		"\5\u00ccg\2\u0416\u0422\3\2\2\2\u0417\u0418\5\u00c8e\2\u0418\u0419\7\22"+
		"\2\2\u0419\u041a\5\u00ccg\2\u041a\u041b\7?\2\2\u041b\u0422\3\2\2\2\u041c"+
		"\u041d\5\u00c8e\2\u041d\u041e\7\22\2\2\u041e\u041f\5\u00caf\2\u041f\u0420"+
		"\7?\2\2\u0420\u0422\3\2\2\2\u0421\u0414\3\2\2\2\u0421\u0417\3\2\2\2\u0421"+
		"\u041c\3\2\2\2\u0422\u00c7\3\2\2\2\u0423\u0424\7 \2\2\u0424\u00c9\3\2"+
		"\2\2\u0425\u0429\5\u0098M\2\u0426\u0428\5R*\2\u0427\u0426\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u00cb\3\2"+
		"\2\2\u042b\u0429\3\2\2\2\u042c\u042d\5\u00be`\2\u042d\u00cd\3\2\2\2\u042e"+
		"\u042f\t\36\2\2\u042f\u00cf\3\2\2\2\u0430\u0431\bi\1\2\u0431\u0432\5\u00d6"+
		"l\2\u0432\u044d\3\2\2\2\u0433\u0434\f\b\2\2\u0434\u0435\7\67\2\2\u0435"+
		"\u0436\5\u009eP\2\u0436\u0437\7\32\2\2\u0437\u044c\3\2\2\2\u0438\u0439"+
		"\f\7\2\2\u0439\u043a\7\22\2\2\u043a\u043b\5\u00d2j\2\u043b\u043c\7?\2"+
		"\2\u043c\u044c\3\2\2\2\u043d\u043e\f\6\2\2\u043e\u0440\7\62\2\2\u043f"+
		"\u0441\7]\2\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2"+
		"\2\2\u0442\u044c\5\u0084C\2\u0443\u0444\f\5\2\2\u0444\u0446\7\64\2\2\u0445"+
		"\u0447\7]\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2"+
		"\2\2\u0448\u044c\5\u0084C\2\u0449\u044a\f\4\2\2\u044a\u044c\5\u00ceh\2"+
		"\u044b\u0433\3\2\2\2\u044b\u0438\3\2\2\2\u044b\u043d\3\2\2\2\u044b\u0443"+
		"\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u00d1\3\2\2\2\u044f\u044d\3\2\2\2\u0450\u0455\5\u00d4"+
		"k\2\u0451\u0452\7\24\2\2\u0452\u0454\5\u00d4k\2\u0453\u0451\3\2\2\2\u0454"+
		"\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0459\3\2"+
		"\2\2\u0457\u0455\3\2\2\2\u0458\u0450\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u00d3\3\2\2\2\u045a\u045b\5\u00a0Q\2\u045b\u00d5\3\2\2\2\u045c\u0463"+
		"\5\u0084C\2\u045d\u0463\5N(\2\u045e\u045f\7\22\2\2\u045f\u0460\5\u009e"+
		"P\2\u0460\u0461\7?\2\2\u0461\u0463\3\2\2\2\u0462\u045c\3\2\2\2\u0462\u045d"+
		"\3\2\2\2\u0462\u045e\3\2\2\2\u0463\u00d7\3\2\2\2\u008b\u00dd\u00df\u00e8"+
		"\u00ed\u00f0\u00f3\u00f8\u00ff\u0103\u0108\u010f\u0117\u011c\u0122\u0126"+
		"\u012d\u0132\u0135\u0139\u0140\u0142\u0145\u014c\u014f\u0152\u0160\u0167"+
		"\u016d\u0178\u0182\u018b\u0190\u0196\u019b\u019e\u01a2\u01a5\u01a8\u01b0"+
		"\u01b7\u01bc\u01cb\u01d0\u01d5\u01db\u01ea\u01ef\u01f4\u01fa\u0203\u0208"+
		"\u020e\u0217\u021c\u0222\u0229\u0233\u023a\u023e\u024d\u0250\u0253\u0259"+
		"\u0260\u0262\u0265\u0276\u02a0\u02a9\u02b3\u02ba\u02c1\u02c5\u02cb\u02ce"+
		"\u02d1\u02d4\u02db\u02de\u02e2\u02ee\u02f2\u02f6\u0313\u0317\u031c\u0320"+
		"\u0324\u032f\u0334\u0337\u033a\u033d\u034a\u034e\u0351\u0355\u035a\u0360"+
		"\u0364\u0369\u036d\u0371\u0375\u0379\u037d\u0389\u038f\u0398\u039d\u03a2"+
		"\u03a7\u03ac\u03b1\u03b7\u03bd\u03c2\u03c7\u03cc\u03de\u03e4\u03ef\u03f2"+
		"\u03f8\u03fd\u0403\u0407\u040f\u0421\u0429\u0440\u0446\u044b\u044d\u0455"+
		"\u0458\u0462";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}