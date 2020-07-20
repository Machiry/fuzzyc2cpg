// Generated from /home/machiry/projects/antl4c/src/main/antlr/Common.g4 by ANTLR 4.2.2
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParser}.
 */
public interface CommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParser#gcc_attribute}.
	 * @param ctx the parse tree
	 */
	void enterGcc_attribute(@NotNull CommonParser.Gcc_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#gcc_attribute}.
	 * @param ctx the parse tree
	 */
	void exitGcc_attribute(@NotNull CommonParser.Gcc_attributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull CommonParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull CommonParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull CommonParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull CommonParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CommonParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CommonParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#rvalue_ref}.
	 * @param ctx the parse tree
	 */
	void enterRvalue_ref(@NotNull CommonParser.Rvalue_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#rvalue_ref}.
	 * @param ctx the parse tree
	 */
	void exitRvalue_ref(@NotNull CommonParser.Rvalue_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand(@NotNull CommonParser.Sizeof_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand(@NotNull CommonParser.Sizeof_operandContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#primaryOnly}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOnly(@NotNull CommonParser.PrimaryOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#primaryOnly}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOnly(@NotNull CommonParser.PrimaryOnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_and_cast_expr(@NotNull CommonParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_and_cast_expr(@NotNull CommonParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(@NotNull CommonParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(@NotNull CommonParser.Equality_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_args_param}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_args_param(@NotNull CommonParser.Template_args_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_args_param}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_args_param(@NotNull CommonParser.Template_args_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull CommonParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull CommonParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull CommonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull CommonParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#cndExpr}.
	 * @param ctx the parse tree
	 */
	void enterCndExpr(@NotNull CommonParser.CndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cndExpr}.
	 * @param ctx the parse tree
	 */
	void exitCndExpr(@NotNull CommonParser.CndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull CommonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull CommonParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_keyword(@NotNull CommonParser.Template_decl_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl_keyword}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_keyword(@NotNull CommonParser.Template_decl_keywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull CommonParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull CommonParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull CommonParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull CommonParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ptrs(@NotNull CommonParser.Func_ptrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ptrs(@NotNull CommonParser.Func_ptrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull CommonParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull CommonParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull CommonParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull CommonParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#arrayIndexing}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(@NotNull CommonParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#arrayIndexing}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(@NotNull CommonParser.ArrayIndexingContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull CommonParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull CommonParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull CommonParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull CommonParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(@NotNull CommonParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(@NotNull CommonParser.MemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull CommonParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull CommonParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(@NotNull CommonParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(@NotNull CommonParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof(@NotNull CommonParser.SizeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof(@NotNull CommonParser.SizeofContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(@NotNull CommonParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(@NotNull CommonParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(@NotNull CommonParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(@NotNull CommonParser.Assign_water_l2Context ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull CommonParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull CommonParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(@NotNull CommonParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(@NotNull CommonParser.WaterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void enterBase_classes(@NotNull CommonParser.Base_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_classes}.
	 * @param ctx the parse tree
	 */
	void exitBase_classes(@NotNull CommonParser.Base_classesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull CommonParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull CommonParser.Or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull CommonParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull CommonParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl_param}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_param(@NotNull CommonParser.Template_decl_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl_param}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_param(@NotNull CommonParser.Template_decl_paramContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#normOr}.
	 * @param ctx the parse tree
	 */
	void enterNormOr(@NotNull CommonParser.NormOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#normOr}.
	 * @param ctx the parse tree
	 */
	void exitNormOr(@NotNull CommonParser.NormOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(@NotNull CommonParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(@NotNull CommonParser.Function_argumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(@NotNull CommonParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(@NotNull CommonParser.Function_decl_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(@NotNull CommonParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(@NotNull CommonParser.Sizeof_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_args}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_args(@NotNull CommonParser.Template_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_args}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_args(@NotNull CommonParser.Template_argsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(@NotNull CommonParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(@NotNull CommonParser.Assign_waterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull CommonParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull CommonParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 */
	void enterBase_class(@NotNull CommonParser.Base_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_class}.
	 * @param ctx the parse tree
	 */
	void exitBase_class(@NotNull CommonParser.Base_classContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#cpp_cast_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCpp_cast_identifier(@NotNull CommonParser.Cpp_cast_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cpp_cast_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCpp_cast_identifier(@NotNull CommonParser.Cpp_cast_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(@NotNull CommonParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(@NotNull CommonParser.Assign_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(@NotNull CommonParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(@NotNull CommonParser.Ptr_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(@NotNull CommonParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(@NotNull CommonParser.No_comma_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#ptrMemberAccess}.
	 * @param ctx the parse tree
	 */
	void enterPtrMemberAccess(@NotNull CommonParser.PtrMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptrMemberAccess}.
	 * @param ctx the parse tree
	 */
	void exitPtrMemberAccess(@NotNull CommonParser.PtrMemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(@NotNull CommonParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(@NotNull CommonParser.Class_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull CommonParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull CommonParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(@NotNull CommonParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(@NotNull CommonParser.No_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(@NotNull CommonParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(@NotNull CommonParser.Base_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_template(@NotNull CommonParser.Template_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_template(@NotNull CommonParser.Template_templateContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CommonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CommonParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull CommonParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull CommonParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand2(@NotNull CommonParser.Sizeof_operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand2(@NotNull CommonParser.Sizeof_operand2Context ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(@NotNull CommonParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(@NotNull CommonParser.Class_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(@NotNull CommonParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(@NotNull CommonParser.No_curliesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(@NotNull CommonParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(@NotNull CommonParser.Inc_decContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#incDecOp}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOp(@NotNull CommonParser.IncDecOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#incDecOp}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOp(@NotNull CommonParser.IncDecOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(@NotNull CommonParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(@NotNull CommonParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#class_key}.
	 * @param ctx the parse tree
	 */
	void enterClass_key(@NotNull CommonParser.Class_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#class_key}.
	 * @param ctx the parse tree
	 */
	void exitClass_key(@NotNull CommonParser.Class_keyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(@NotNull CommonParser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(@NotNull CommonParser.Cast_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl_param_list(@NotNull CommonParser.Template_decl_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl_param_list(@NotNull CommonParser.Template_decl_param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(@NotNull CommonParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(@NotNull CommonParser.No_squares_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelete_expression(@NotNull CommonParser.Delete_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#delete_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelete_expression(@NotNull CommonParser.Delete_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_args_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_args_param_list(@NotNull CommonParser.Template_args_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_args_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_args_param_list(@NotNull CommonParser.Template_args_param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(@NotNull CommonParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(@NotNull CommonParser.Bit_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(@NotNull CommonParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(@NotNull CommonParser.No_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_list(@NotNull CommonParser.Function_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#function_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_list(@NotNull CommonParser.Function_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void enterPtrs(@NotNull CommonParser.PtrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void exitPtrs(@NotNull CommonParser.PtrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_decl}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_decl(@NotNull CommonParser.Template_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_decl}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_decl(@NotNull CommonParser.Template_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#template_name}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_name(@NotNull CommonParser.Template_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#template_name}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_name(@NotNull CommonParser.Template_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull CommonParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull CommonParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull CommonParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull CommonParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_expression(@NotNull CommonParser.New_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#new_expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_expression(@NotNull CommonParser.New_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(@NotNull CommonParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(@NotNull CommonParser.Access_specifierContext ctx);
}