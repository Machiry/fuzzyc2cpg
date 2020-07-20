// Generated from /home/machiry/projects/antl4c/src/main/antlr/Module.g4 by ANTLR 4.2.2
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModuleParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(@NotNull ModuleParser.Compound_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#parameter_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decl(@NotNull ModuleParser.Parameter_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ctor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtor_expr(@NotNull ModuleParser.Ctor_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op_and_cast_expr(@NotNull ModuleParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_args_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param(@NotNull ModuleParser.Template_args_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull ModuleParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_keyword(@NotNull ModuleParser.Template_decl_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#param_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_list(@NotNull ModuleParser.Param_type_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull ModuleParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#arrayIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(@NotNull ModuleParser.ArrayIndexingContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull ModuleParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#parameter_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_id(@NotNull ModuleParser.Parameter_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ModuleParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_curlies_or_squares(@NotNull ModuleParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#declByClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByClass(@NotNull ModuleParser.DeclByClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#param_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_specifiers(@NotNull ModuleParser.Param_decl_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#declByType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclByType(@NotNull ModuleParser.DeclByTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull ModuleParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl_specifiers(@NotNull ModuleParser.Function_decl_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(@NotNull ModuleParser.Sizeof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#default_parameter_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameter_value(@NotNull ModuleParser.Default_parameter_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#constant_expr_w_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expr_w_(@NotNull ModuleParser.Constant_expr_w_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#exception_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_specification(@NotNull ModuleParser.Exception_specificationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#base_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_class(@NotNull ModuleParser.Base_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ptr_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_operator(@NotNull ModuleParser.Ptr_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_comma_or_semicolon(@NotNull ModuleParser.No_comma_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ptrMemberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrMemberAccess(@NotNull ModuleParser.PtrMemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull ModuleParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(@NotNull ModuleParser.Base_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_template(@NotNull ModuleParser.Template_templateContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull ModuleParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand2(@NotNull ModuleParser.Sizeof_operand2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull ModuleParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_curlies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_curlies(@NotNull ModuleParser.No_curliesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#incDecOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOp(@NotNull ModuleParser.IncDecOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_or_semicolon(@NotNull ModuleParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(@NotNull ModuleParser.Class_keyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(@NotNull ModuleParser.Cast_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_args_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param_list(@NotNull ModuleParser.Template_args_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(@NotNull ModuleParser.InitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_list(@NotNull ModuleParser.Function_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(@NotNull ModuleParser.Function_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#simple_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_decl(@NotNull ModuleParser.Simple_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrs(@NotNull ModuleParser.PtrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl(@NotNull ModuleParser.Template_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_name(@NotNull ModuleParser.Template_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(@NotNull ModuleParser.Storage_class_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull ModuleParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull ModuleParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(@NotNull ModuleParser.Return_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#gcc_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcc_attribute(@NotNull ModuleParser.Gcc_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(@NotNull ModuleParser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull ModuleParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ModuleParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(@NotNull ModuleParser.Init_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#rvalue_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue_ref(@NotNull ModuleParser.Rvalue_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#sizeof_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand(@NotNull ModuleParser.Sizeof_operandContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#primaryOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOnly(@NotNull ModuleParser.PrimaryOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param_list(@NotNull ModuleParser.Function_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(@NotNull ModuleParser.Equality_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull ModuleParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull ModuleParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#cndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndExpr(@NotNull ModuleParser.CndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#parameter_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_ptrs(@NotNull ModuleParser.Parameter_ptrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull ModuleParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull ModuleParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#type_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_suffix(@NotNull ModuleParser.Type_suffixContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#func_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptrs(@NotNull ModuleParser.Func_ptrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull ModuleParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ctor_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtor_list(@NotNull ModuleParser.Ctor_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(@NotNull ModuleParser.MemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull ModuleParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof(@NotNull ModuleParser.SizeofContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_angle_brackets_or_brackets(@NotNull ModuleParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#initializer_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_id(@NotNull ModuleParser.Initializer_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#param_type_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type_id(@NotNull ModuleParser.Param_type_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assign_water_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water_l2(@NotNull ModuleParser.Assign_water_l2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(@NotNull ModuleParser.Relational_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(@NotNull ModuleParser.WaterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type(@NotNull ModuleParser.Param_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#base_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_classes(@NotNull ModuleParser.Base_classesContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull ModuleParser.Or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_decl_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param(@NotNull ModuleParser.Template_decl_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#using_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directive(@NotNull ModuleParser.Using_directiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#parameter_decl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_decl_clause(@NotNull ModuleParser.Parameter_decl_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#normOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormOr(@NotNull ModuleParser.NormOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(@NotNull ModuleParser.Function_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args(@NotNull ModuleParser.Template_argsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assign_water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water(@NotNull ModuleParser.Assign_waterContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull ModuleParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(@NotNull ModuleParser.CodeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#cpp_cast_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_cast_identifier(@NotNull ModuleParser.Cpp_cast_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_list(@NotNull ModuleParser.Initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(@NotNull ModuleParser.Assign_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(@NotNull ModuleParser.Init_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(@NotNull ModuleParser.Class_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(@NotNull ModuleParser.Function_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares(@NotNull ModuleParser.No_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ModuleParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(@NotNull ModuleParser.Inc_decContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#ctor_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtor_initializer(@NotNull ModuleParser.Ctor_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assign_expr_w__l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr_w__l2(@NotNull ModuleParser.Assign_expr_w__l2Context ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param_list(@NotNull ModuleParser.Template_decl_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares_or_semicolon(@NotNull ModuleParser.No_squares_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(@NotNull ModuleParser.Parameter_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#delete_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_expression(@NotNull ModuleParser.Delete_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(@NotNull ModuleParser.Bit_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(@NotNull ModuleParser.DeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#no_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets(@NotNull ModuleParser.No_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#type_id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id_list(@NotNull ModuleParser.Type_id_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull ModuleParser.Function_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#assign_expr_w_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr_w_(@NotNull ModuleParser.Assign_expr_w_Context ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(@NotNull ModuleParser.New_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ModuleParser#access_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_specifier(@NotNull ModuleParser.Access_specifierContext ctx);
}