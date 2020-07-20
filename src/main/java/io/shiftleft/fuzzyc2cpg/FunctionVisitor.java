// Generated from /home/machiry/projects/antl4c/src/main/antlr/Function.g4 by ANTLR 4.2.2
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionParser#Else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(@NotNull FunctionParser.Else_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op_and_cast_expr(@NotNull FunctionParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_args_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param(@NotNull FunctionParser.Template_args_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull FunctionParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_keyword(@NotNull FunctionParser.Template_decl_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_list(@NotNull FunctionParser.Param_type_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull FunctionParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#arrayIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(@NotNull FunctionParser.ArrayIndexingContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull FunctionParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull FunctionParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_curlies_or_squares(@NotNull FunctionParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#initDeclWithAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclWithAssign(@NotNull FunctionParser.InitDeclWithAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#declByClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByClass(@NotNull FunctionParser.DeclByClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_specifiers(@NotNull FunctionParser.Param_decl_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(@NotNull FunctionParser.GotoStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#declByType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByType(@NotNull FunctionParser.DeclByTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull FunctionParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_opener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_opener(@NotNull FunctionParser.Pre_openerContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#initDeclSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclSimple(@NotNull FunctionParser.InitDeclSimpleContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl_specifiers(@NotNull FunctionParser.Function_decl_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(@NotNull FunctionParser.Sizeof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosing_curly(@NotNull FunctionParser.Closing_curlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_class(@NotNull FunctionParser.Base_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_operator(@NotNull FunctionParser.Ptr_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull FunctionParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#While_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull FunctionParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_comma_or_semicolon(@NotNull FunctionParser.No_comma_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#ptrMemberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrMemberAccess(@NotNull FunctionParser.PtrMemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull FunctionParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#If_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull FunctionParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(@NotNull FunctionParser.Base_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_template(@NotNull FunctionParser.Template_templateContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull FunctionParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand2(@NotNull FunctionParser.Sizeof_operand2Context ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull FunctionParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_curlies(@NotNull FunctionParser.No_curliesContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_closer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_closer(@NotNull FunctionParser.Pre_closerContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_starter(@NotNull FunctionParser.Block_starterContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#incDecOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOp(@NotNull FunctionParser.IncDecOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull FunctionParser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_or_semicolon(@NotNull FunctionParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(@NotNull FunctionParser.Class_keyContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(@NotNull FunctionParser.Cast_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_args_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param_list(@NotNull FunctionParser.Template_args_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull FunctionParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_list(@NotNull FunctionParser.Function_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_decl(@NotNull FunctionParser.Simple_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrs(@NotNull FunctionParser.PtrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl(@NotNull FunctionParser.Template_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_name(@NotNull FunctionParser.Template_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#Switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull FunctionParser.Switch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull FunctionParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull FunctionParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#gcc_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcc_attribute(@NotNull FunctionParser.Gcc_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(@NotNull FunctionParser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull FunctionParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull FunctionParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#rvalue_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue_ref(@NotNull FunctionParser.Rvalue_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand(@NotNull FunctionParser.Sizeof_operandContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#primaryOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOnly(@NotNull FunctionParser.PrimaryOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#Do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(@NotNull FunctionParser.Do_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(@NotNull FunctionParser.Equality_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull FunctionParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull FunctionParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#cndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndExpr(@NotNull FunctionParser.CndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull FunctionParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#do_statement1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement1(@NotNull FunctionParser.Do_statement1Context ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#pre_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_else(@NotNull FunctionParser.Pre_elseContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull FunctionParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_suffix(@NotNull FunctionParser.Type_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#func_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptrs(@NotNull FunctionParser.Func_ptrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull FunctionParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(@NotNull FunctionParser.MemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#Catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(@NotNull FunctionParser.Catch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull FunctionParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof(@NotNull FunctionParser.SizeofContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_angle_brackets_or_brackets(@NotNull FunctionParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_id(@NotNull FunctionParser.Param_type_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpening_curly(@NotNull FunctionParser.Opening_curlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water_l2(@NotNull FunctionParser.Assign_water_l2Context ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(@NotNull FunctionParser.Relational_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(@NotNull FunctionParser.WaterContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type(@NotNull FunctionParser.Param_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#base_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_classes(@NotNull FunctionParser.Base_classesContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull FunctionParser.Or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull FunctionParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_decl_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param(@NotNull FunctionParser.Template_decl_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#normOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormOr(@NotNull FunctionParser.NormOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(@NotNull FunctionParser.Function_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args(@NotNull FunctionParser.Template_argsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water(@NotNull FunctionParser.Assign_waterContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull FunctionParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#cpp_cast_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_cast_identifier(@NotNull FunctionParser.Cpp_cast_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(@NotNull FunctionParser.Initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(@NotNull FunctionParser.Assign_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull FunctionParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(@NotNull FunctionParser.Init_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(@NotNull FunctionParser.Class_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares(@NotNull FunctionParser.No_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init_statement(@NotNull FunctionParser.For_init_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_statement(@NotNull FunctionParser.Expr_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull FunctionParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull FunctionParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#initDeclWithCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclWithCall(@NotNull FunctionParser.InitDeclWithCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#Try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(@NotNull FunctionParser.Try_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(@NotNull FunctionParser.Inc_decContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull FunctionParser.BreakStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param_list(@NotNull FunctionParser.Template_decl_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares_or_semicolon(@NotNull FunctionParser.No_squares_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull FunctionParser.LabelContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(@NotNull FunctionParser.Parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#delete_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_expression(@NotNull FunctionParser.Delete_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(@NotNull FunctionParser.Bit_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull FunctionParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets(@NotNull FunctionParser.No_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#For_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull FunctionParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull FunctionParser.ContinueStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(@NotNull FunctionParser.New_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_specifier(@NotNull FunctionParser.Access_specifierContext ctx);
}