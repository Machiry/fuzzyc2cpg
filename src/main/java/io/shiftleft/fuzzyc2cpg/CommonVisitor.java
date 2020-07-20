// Generated from /home/machiry/projects/antl4c/src/main/antlr/Common.g4 by ANTLR 4.2.2
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CommonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CommonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CommonParser#gcc_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcc_attribute(@NotNull CommonParser.Gcc_attributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(@NotNull CommonParser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull CommonParser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull CommonParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#rvalue_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue_ref(@NotNull CommonParser.Rvalue_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand(@NotNull CommonParser.Sizeof_operandContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#primaryOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOnly(@NotNull CommonParser.PrimaryOnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op_and_cast_expr(@NotNull CommonParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_operator(@NotNull CommonParser.Equality_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param(@NotNull CommonParser.Template_args_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull CommonParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull CommonParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#cndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCndExpr(@NotNull CommonParser.CndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull CommonParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_keyword(@NotNull CommonParser.Template_decl_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull CommonParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(@NotNull CommonParser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ptrs(@NotNull CommonParser.Func_ptrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(@NotNull CommonParser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(@NotNull CommonParser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#arrayIndexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexing(@NotNull CommonParser.ArrayIndexingContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull CommonParser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull CommonParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(@NotNull CommonParser.MemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull CommonParser.Unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_curlies_or_squares(@NotNull CommonParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof(@NotNull CommonParser.SizeofContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_angle_brackets_or_brackets(@NotNull CommonParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water_l2(@NotNull CommonParser.Assign_water_l2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(@NotNull CommonParser.Relational_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWater(@NotNull CommonParser.WaterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_classes(@NotNull CommonParser.Base_classesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull CommonParser.Or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(@NotNull CommonParser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param(@NotNull CommonParser.Template_decl_paramContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#normOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormOr(@NotNull CommonParser.NormOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(@NotNull CommonParser.Function_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl_specifiers(@NotNull CommonParser.Function_decl_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(@NotNull CommonParser.Sizeof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args(@NotNull CommonParser.Template_argsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_water(@NotNull CommonParser.Assign_waterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(@NotNull CommonParser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_class(@NotNull CommonParser.Base_classContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#cpp_cast_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpp_cast_identifier(@NotNull CommonParser.Cpp_cast_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(@NotNull CommonParser.Assign_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtr_operator(@NotNull CommonParser.Ptr_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_comma_or_semicolon(@NotNull CommonParser.No_comma_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#ptrMemberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrMemberAccess(@NotNull CommonParser.PtrMemberAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(@NotNull CommonParser.Class_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(@NotNull CommonParser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares(@NotNull CommonParser.No_squaresContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(@NotNull CommonParser.Base_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_template(@NotNull CommonParser.Template_templateContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull CommonParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(@NotNull CommonParser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_operand2(@NotNull CommonParser.Sizeof_operand2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(@NotNull CommonParser.Class_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_curlies(@NotNull CommonParser.No_curliesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_dec(@NotNull CommonParser.Inc_decContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#incDecOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOp(@NotNull CommonParser.IncDecOpContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets_or_semicolon(@NotNull CommonParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#class_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_key(@NotNull CommonParser.Class_keyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_target(@NotNull CommonParser.Cast_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl_param_list(@NotNull CommonParser.Template_decl_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_squares_or_semicolon(@NotNull CommonParser.No_squares_or_semicolonContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#delete_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_expression(@NotNull CommonParser.Delete_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_args_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_args_param_list(@NotNull CommonParser.Template_args_param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_and_expression(@NotNull CommonParser.Bit_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_brackets(@NotNull CommonParser.No_bracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_list(@NotNull CommonParser.Function_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrs(@NotNull CommonParser.PtrsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_decl(@NotNull CommonParser.Template_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#template_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_name(@NotNull CommonParser.Template_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull CommonParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(@NotNull CommonParser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_expression(@NotNull CommonParser.New_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_specifier(@NotNull CommonParser.Access_specifierContext ctx);
}