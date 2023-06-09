// Generated from VapaPitha.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VapaPithaParser}.
 */
public interface VapaPithaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(VapaPithaParser.PrimaryExpressionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(VapaPithaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(VapaPithaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(VapaPithaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(VapaPithaParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(VapaPithaParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(VapaPithaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(VapaPithaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(VapaPithaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(VapaPithaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(VapaPithaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(VapaPithaParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(VapaPithaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(VapaPithaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(VapaPithaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(VapaPithaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(VapaPithaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(VapaPithaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(VapaPithaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(VapaPithaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(VapaPithaParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(VapaPithaParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(VapaPithaParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(VapaPithaParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(VapaPithaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(VapaPithaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(VapaPithaParser.AssignmentExpressionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(VapaPithaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(VapaPithaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(VapaPithaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VapaPithaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VapaPithaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(VapaPithaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(VapaPithaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(VapaPithaParser.DeclarationContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(VapaPithaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(VapaPithaParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(VapaPithaParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(VapaPithaParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(VapaPithaParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(VapaPithaParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(VapaPithaParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(VapaPithaParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(VapaPithaParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(VapaPithaParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(VapaPithaParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(VapaPithaParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(VapaPithaParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(VapaPithaParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(VapaPithaParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(VapaPithaParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(VapaPithaParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(VapaPithaParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(VapaPithaParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(VapaPithaParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(VapaPithaParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(VapaPithaParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(VapaPithaParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(VapaPithaParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(VapaPithaParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(VapaPithaParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(VapaPithaParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(VapaPithaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(VapaPithaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(VapaPithaParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(VapaPithaParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(VapaPithaParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(VapaPithaParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(VapaPithaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(VapaPithaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(VapaPithaParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(VapaPithaParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VapaPithaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VapaPithaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(VapaPithaParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(VapaPithaParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(VapaPithaParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(VapaPithaParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(VapaPithaParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(VapaPithaParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(VapaPithaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(VapaPithaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(VapaPithaParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(VapaPithaParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(VapaPithaParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(VapaPithaParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(VapaPithaParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(VapaPithaParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(VapaPithaParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(VapaPithaParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(VapaPithaParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(VapaPithaParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(VapaPithaParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(VapaPithaParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(VapaPithaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(VapaPithaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(VapaPithaParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(VapaPithaParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(VapaPithaParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(VapaPithaParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(VapaPithaParser.FunctionDefinitionContext ctx) throws Exception;
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(VapaPithaParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VapaPithaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(VapaPithaParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VapaPithaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(VapaPithaParser.DeclarationListContext ctx);
}