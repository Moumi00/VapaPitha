import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class SymbolTableCreator extends VapaPithaBaseListener {

    public Boolean hasErrorFlag = false;

    private static class Variable {
        private String name;
        private String type;

        public Variable(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String toString() {
            return this.name + " " + this.type + "\n";
        }
    }

    private Map<String, SymbolTable> symbolTables;
    private Stack<String> scopeStack;
    private ArrayList<String> variableNames;

    public void createSymbolTable(String sourceCode) {
        VapaPithaLexer lexer = new VapaPithaLexer(CharStreams.fromString(sourceCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VapaPithaParser parser = new VapaPithaParser(tokens);
        SyntaxErrorListener syntaxError = new SyntaxErrorListener();
        parser.addErrorListener(syntaxError);
        ParseTree tree = parser.compilationUnit();
        if(!syntaxError.hasSyntaxErrors()) {

            symbolTables = new HashMap<>();
            scopeStack = new Stack<>();

            SymbolTable globalSymbolTable = new SymbolTable();
            symbolTables.put("global", globalSymbolTable);

            scopeStack.push("global");

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(this, tree);

        } else {
            System.exit(1);
        }

    }

    @Override
    public void enterFunctionDefinition(VapaPithaParser.FunctionDefinitionContext ctx) throws Exception {
        String functionName = ctx.declarator().directDeclarator().directDeclarator().Identifier().getText();
        SymbolTable functionSymbolTable = new SymbolTable();
        functionSymbolTable.setParentScope(scopeStack.peek());

        if(symbolTables.containsKey(functionName)) {
            hasErrorFlag = true;
            throw new Exception("Function is redefined in line " + ctx.start.getLine());
        }

        symbolTables.put(functionName, functionSymbolTable);

        String currentScope = scopeStack.peek();
        SymbolTable currentSymbolTable = symbolTables.get(currentScope);
        currentSymbolTable.addVariable(new Variable(functionName, "ফাংশন"));
        scopeStack.push(functionName);

        // Add function parameters to the function scope
        VapaPithaParser.ParameterTypeListContext paramListContext = ctx.declarator().directDeclarator().parameterTypeList();
        if (paramListContext != null) {
            for (VapaPithaParser.ParameterDeclarationContext paramContext : paramListContext.parameterList().parameterDeclaration()) {
                String paramType = paramContext.declarationSpecifiers().getText();
                String paramName = paramContext.declarator().getText();
                Variable parameter = new Variable(paramName, paramType);
                functionSymbolTable.addVariable(parameter);
            }
        }
    }

    @Override
    public void exitFunctionDefinition(VapaPithaParser.FunctionDefinitionContext ctx) {
        String functionName = ctx.declarator().directDeclarator().directDeclarator().Identifier().getText();
        scopeStack.pop();
    }

    @Override
    public void enterCompoundStatement(VapaPithaParser.CompoundStatementContext ctx) {

        if(!ctx.getParent().getClass().getSimpleName().equals("FunctionDefinitionContext")) {
            String scopeName = "Block " + ctx.start.getLine();
            SymbolTable functionSymbolTable = new SymbolTable();
            functionSymbolTable.setParentScope(scopeStack.peek());
            symbolTables.put(scopeName, functionSymbolTable);
            scopeStack.push(scopeName);
        }
    }

    @Override
    public void exitCompoundStatement(VapaPithaParser.CompoundStatementContext ctx) {
        if(!ctx.getParent().getClass().getSimpleName().equals("FunctionDefinitionContext"))
            scopeStack.pop();
    }

    @Override
    public void enterPrimaryExpression(VapaPithaParser.PrimaryExpressionContext ctx) throws Exception {
        if (ctx.Identifier() != null) {
            String variableName = ctx.Identifier().getText();
            String currentScope = scopeStack.peek();
            SymbolTable currentSymbolTable = symbolTables.get(currentScope);

            while(currentSymbolTable.getVariable(variableName) == null && currentSymbolTable.getParentScope() != null) {
                currentSymbolTable = symbolTables.get(currentSymbolTable.getParentScope());
                //System.out.println(currentSymbolTable.getVariable(variableName).getName() + "Yaaaay");

            }

            if (currentSymbolTable.getVariable(variableName) == null) {
                hasErrorFlag = true;
                throw new Exception("Variable name is not declared in this scope in line " + ctx.start.getLine());
            }

        }
    }

    @Override
    public void enterDeclaration(VapaPithaParser.DeclarationContext ctx) throws Exception {
        String type = ctx.declarationSpecifiers().getText();
        String currentScope = scopeStack.peek();

        for (VapaPithaParser.InitDeclaratorContext initDeclaratorContext : ctx.initDeclaratorList().initDeclarator()) {
            String variableName = initDeclaratorContext.declarator().directDeclarator().Identifier().getText();
            Variable variable = new Variable(variableName, type);
            SymbolTable currentSymbolTable = symbolTables.get(currentScope);
            if (currentSymbolTable.getVariable(variableName) != null){
                hasErrorFlag = true;
                if (currentSymbolTable.getVariable(variableName).getType().equals(type))
                    throw new Exception("Redeclaration of variable '" + variableName + "' in line " + ctx.start.getLine());
                else
                    throw new Exception("Conflicting declaration of variable '" + variableName + "' in line " + ctx.start.getLine());
            }
            currentSymbolTable.addVariable(variable);
        }
    }

    @Override
    public void enterAssignmentExpression(VapaPithaParser.AssignmentExpressionContext ctx) throws Exception {
        VapaPithaParser.UnaryExpressionContext unaryExprCtx = ctx.unaryExpression();
        if (unaryExprCtx != null && unaryExprCtx.postfixExpression() != null) {
            String LHS = unaryExprCtx.postfixExpression().primaryExpression().getText();
            if (isConstant(LHS)) {
                int lvalueToken = unaryExprCtx.postfixExpression().primaryExpression().start.getLine();
                hasErrorFlag = true;
                throw new Exception("lvalue required as left operand in line " + lvalueToken);
            }
        }
    }

    private boolean isConstant(String expression) {
        // Implement logic to determine if the expression is a constant
        // For example, you can check if it's an integer literal
        try {
            Integer.parseInt(expression);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static class SymbolTable {
        private ArrayList<Variable> variables;
        private String parentScope ;

        public SymbolTable() {
            variables = new ArrayList<>();
        }

        public int getsize() {
            return variables.size();
        }

        public void addVariable(Variable variable) {
            variables.add(variable);
        }

        public void setParentScope(String parentScope) {
            this.parentScope = parentScope;
        }
        public String getParentScope() {
            return this.parentScope;
        }
        public Variable getVariable(String name) {

            for(int i = 0; i < variables.size(); i++) {
                if(name.equals(variables.get(i).getName())) {
                    return variables.get(i);
                }
            }
            return null;
        }

        public Iterable<Variable> getVariables() {
            return variables;
        }
    }

    public static void main(String[] args) {
        String sourceCode =
                        "বাস্তবসংখ্যা ত = ১;" +
                        "বাস্তবসংখ্যা বিয়োগ(বাস্তবসংখ্যা ক, বাস্তবসংখ্যা খ) {\n" +
                                "ক = ক - খ;\n" +
                        "        ফেরত ক;\n" +
                        "}\n" +
                        "বাস্তবসংখ্যা শুরু () {\n" +
                        "       পূর্ণসংখ্যা ক = ০, খ = -১, গ;\n" +
                        "       বাস্তবসংখ্যা বিয়োগফল =  বিয়োগ(ক, খ);\n" +
                        "}   ";
        SymbolTableCreator symbolTableCreator = new SymbolTableCreator();
        symbolTableCreator.createSymbolTable(sourceCode);

        Map<String, SymbolTable> symbolTables = symbolTableCreator.symbolTables;
        if(!symbolTableCreator.hasErrorFlag) {
            for (Map.Entry<String, SymbolTable> entry : symbolTables.entrySet()) {
                String currentScope = entry.getKey();
                SymbolTable symbolTable = entry.getValue();

                if (symbolTable.getsize() == 0)
                    continue;
                System.out.println("Scope: " + currentScope);
                System.out.println("Parent Scope: " + symbolTable.getParentScope());
                System.out.println("Variables:");
                for (Variable variable : symbolTable.getVariables()) {
                    System.out.println(variable.getName() + " - Type: " + variable.getType());
                }
                System.out.println();
            }
        }
    }
}
