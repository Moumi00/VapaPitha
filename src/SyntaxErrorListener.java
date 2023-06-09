import org.antlr.v4.runtime.*;

public class SyntaxErrorListener extends BaseErrorListener {
    private boolean hasSyntaxErrors = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("Syntax error at line " + line + ", column " + charPositionInLine + ": " + msg);
        hasSyntaxErrors = true;
    }

    public boolean hasSyntaxErrors() {
        return hasSyntaxErrors;
    }
}