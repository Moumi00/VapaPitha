// Generated from VapaPitha.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VapaPithaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Break=2, Char=3, Const=4, Continue=5, Else=6, Float=7, For=8, 
		If=9, Int=10, Return=11, Void=12, Bool=13, LeftParen=14, RightParen=15, 
		LeftBrace=16, RightBrace=17, Less=18, LessEqual=19, Greater=20, GreaterEqual=21, 
		Plus=22, Minus=23, Star=24, Div=25, Mod=26, AndAnd=27, OrOr=28, Not=29, 
		Semi=30, Comma=31, Assign=32, StarAssign=33, DivAssign=34, ModAssign=35, 
		PlusAssign=36, MinusAssign=37, Equal=38, NotEqual=39, Identifier=40, Constant=41, 
		DigitSequence=42, StringLiteral=43, Whitespace=44, Newline=45, BlockComment=46, 
		LineComment=47;
	public static final int
		RULE_primaryExpression = 0, RULE_postfixExpression = 1, RULE_argumentExpressionList = 2, 
		RULE_unaryExpression = 3, RULE_unaryOperator = 4, RULE_castExpression = 5, 
		RULE_multiplicativeExpression = 6, RULE_additiveExpression = 7, RULE_relationalExpression = 8, 
		RULE_equalityExpression = 9, RULE_logicalAndExpression = 10, RULE_logicalOrExpression = 11, 
		RULE_conditionalExpression = 12, RULE_assignmentExpression = 13, RULE_assignmentOperator = 14, 
		RULE_expression = 15, RULE_constantExpression = 16, RULE_declaration = 17, 
		RULE_declarationSpecifiers = 18, RULE_declarationSpecifiers2 = 19, RULE_declarationSpecifier = 20, 
		RULE_initDeclaratorList = 21, RULE_initDeclarator = 22, RULE_typeSpecifier = 23, 
		RULE_specifierQualifierList = 24, RULE_typeQualifier = 25, RULE_declarator = 26, 
		RULE_directDeclarator = 27, RULE_nestedParenthesesBlock = 28, RULE_typeQualifierList = 29, 
		RULE_parameterTypeList = 30, RULE_parameterList = 31, RULE_parameterDeclaration = 32, 
		RULE_identifierList = 33, RULE_typeName = 34, RULE_initializer = 35, RULE_statement = 36, 
		RULE_compoundStatement = 37, RULE_blockItemList = 38, RULE_blockItem = 39, 
		RULE_expressionStatement = 40, RULE_selectionStatement = 41, RULE_iterationStatement = 42, 
		RULE_forCondition = 43, RULE_forDeclaration = 44, RULE_forExpression = 45, 
		RULE_jumpStatement = 46, RULE_compilationUnit = 47, RULE_translationUnit = 48, 
		RULE_externalDeclaration = 49, RULE_functionDefinition = 50, RULE_declarationList = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "postfixExpression", "argumentExpressionList", "unaryExpression", 
			"unaryOperator", "castExpression", "multiplicativeExpression", "additiveExpression", 
			"relationalExpression", "equalityExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "typeSpecifier", "specifierQualifierList", 
			"typeQualifier", "declarator", "directDeclarator", "nestedParenthesesBlock", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "initializer", "statement", "compoundStatement", 
			"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
			"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
			"functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'\\u00E0\\u00A6\\u00A5\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00AE\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u00B0\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00A3'", 
			"'\\u00E0\\u00A6\\u00A7\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00B0\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u2022'", 
			"'\\u00E0\\u00A6\\u0161\\u00E0\\u00A6\\u00B2\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\u2021'", 
			"'\\u00E0\\u00A6\\u00A8\\u00E0\\u00A7\\u0178\\u00E0\\u00A6\\u00A4\\u00E0\\u00A7\\u2039'", 
			"'\\u00E0\\u00A6\\u00AA\\u00E0\\u00A7\\u201A\\u00E0\\u00A6\\u00B0\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00A3\\u00E0\\u00A6\\u00B8\\u00E0\\u00A6\\u201A\\u00E0\\u00A6\\u2013\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u2022\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00B7\\u00E0\\u00A6\\u00A3'", 
			"'\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00A6\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B8\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00A4\\u00E0\\u00A6\\u00AC\\u00E0\\u00A6\\u00B8\\u00E0\\u00A6\\u201A\\u00E0\\u00A6\\u2013\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00AF\\u00E0\\u00A6\\u00BE'", 
			"'\\u00E0\\u00A6\\u00AB\\u00E0\\u00A7\\u2021\\u00E0\\u00A6\\u00B0\\u00E0\\u00A6\\u00A4'", 
			"'\\u00E0\\u00A6\\u2013\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00B2\\u00E0\\u00A6\\u00BF'", 
			"'\\u00E0\\u00A6\\u00AC\\u00E0\\u00A7\\uFFFD\\u00E0\\u00A6\\u00B2\\u00E0\\u00A6\\u00BF\\u00E0\\u00A7\\u0178\\u00E0\\u00A6\\u00BE\\u00E0\\u00A6\\u00A8'", 
			"'('", "')'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "';'", "','", "'='", "'*='", 
			"'/='", "'%='", "'+='", "'-='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Break", "Char", "Const", "Continue", "Else", "Float", "For", 
			"If", "Int", "Return", "Void", "Bool", "LeftParen", "RightParen", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Plus", 
			"Minus", "Star", "Div", "Mod", "AndAnd", "OrOr", "Not", "Semi", "Comma", 
			"Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"Equal", "NotEqual", "Identifier", "Constant", "DigitSequence", "StringLiteral", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VapaPitha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VapaPithaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VapaPithaParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(VapaPithaParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(VapaPithaParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(VapaPithaParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(VapaPithaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(VapaPithaParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) {
				try {
					((VapaPithaListener)listener).enterPrimaryExpression(this);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					match(StringLiteral);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(LeftParen);
				setState(112);
				expression();
				setState(113);
				match(RightParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(VapaPithaParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(VapaPithaParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(VapaPithaParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(VapaPithaParser.RightParen, i);
		}
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(117);
			primaryExpression();
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(118);
				match(LeftParen);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
					{
					setState(119);
					argumentExpressionList();
					}
				}

				setState(122);
				match(RightParen);
				}
				}
				setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			assignmentExpression();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(129);
				match(Comma);
				setState(130);
				assignmentExpression();
				}
				}
				setState(135);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(136);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case Not:
				{
				setState(137);
				unaryOperator();
				setState(138);
				castExpression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(VapaPithaParser.Star, 0); }
		public TerminalNode Plus() { return getToken(VapaPithaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(VapaPithaParser.Minus, 0); }
		public TerminalNode Not() { return getToken(VapaPithaParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 566231040L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(VapaPithaParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(VapaPithaParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(VapaPithaParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_castExpression);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(LeftParen);
				setState(145);
				typeName();
				setState(146);
				match(RightParen);
				setState(147);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(DigitSequence);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(VapaPithaParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(VapaPithaParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(VapaPithaParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(VapaPithaParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(VapaPithaParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(VapaPithaParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			castExpression();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				castExpression();
				}
				}
				setState(160);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(VapaPithaParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(VapaPithaParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(VapaPithaParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(VapaPithaParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			multiplicativeExpression();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				multiplicativeExpression();
				}
				}
				setState(168);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(VapaPithaParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(VapaPithaParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(VapaPithaParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(VapaPithaParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(VapaPithaParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(VapaPithaParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(VapaPithaParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(VapaPithaParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			additiveExpression();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				additiveExpression();
				}
				}
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(VapaPithaParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(VapaPithaParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(VapaPithaParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(VapaPithaParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			relationalExpression();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				relationalExpression();
				}
				}
				setState(184);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(VapaPithaParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(VapaPithaParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitLogicalAndExpression(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			equalityExpression();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(186);
				match(AndAnd);
				setState(187);
				equalityExpression();
				}
				}
				setState(192);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(VapaPithaParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(VapaPithaParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitLogicalOrExpression(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			logicalAndExpression();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(194);
				match(OrOr);
				setState(195);
				logicalAndExpression();
				}
				}
				setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(VapaPithaParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) {
				try {
					((VapaPithaListener)listener).enterAssignmentExpression(this);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentExpression);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				unaryExpression();
				setState(205);
				assignmentOperator();
				setState(206);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(DigitSequence);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(VapaPithaParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(VapaPithaParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(VapaPithaParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(VapaPithaParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(VapaPithaParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(VapaPithaParser.MinusAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			assignmentExpression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(214);
				match(Comma);
				setState(215);
				assignmentExpression();
				}
				}
				setState(220);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(VapaPithaParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) {
				try {
					((VapaPithaListener)listener).enterDeclaration(this);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			declarationSpecifiers();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==Identifier) {
				{
				setState(224);
				initDeclaratorList();
				}
			}

			setState(227);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationSpecifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				declarationSpecifier();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclarationSpecifiers2(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				declarationSpecifier();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclarationSpecifier(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarationSpecifier);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Float:
			case Int:
			case Void:
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				typeSpecifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				typeQualifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			initDeclarator();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(244);
				match(Comma);
				setState(245);
				initDeclarator();
				}
				}
				setState(250);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(VapaPithaParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			declarator();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(252);
				match(Assign);
				setState(253);
				initializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(VapaPithaParser.Void, 0); }
		public TerminalNode Char() { return getToken(VapaPithaParser.Char, 0); }
		public TerminalNode Int() { return getToken(VapaPithaParser.Int, 0); }
		public TerminalNode Float() { return getToken(VapaPithaParser.Float, 0); }
		public TerminalNode Bool() { return getToken(VapaPithaParser.Bool, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Float:
			case Int:
			case Void:
			case Bool:
				{
				setState(258);
				typeSpecifier();
				}
				break;
			case T__0:
				{
				setState(259);
				typeQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0)) {
				{
				setState(262);
				specifierQualifierList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			directDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VapaPithaParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(VapaPithaParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(VapaPithaParser.RightParen, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(270);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(271);
				match(LeftParen);
				setState(272);
				declarator();
				setState(273);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(277);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(278);
						match(LeftParen);
						setState(279);
						parameterTypeList();
						setState(280);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(282);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(283);
						match(LeftParen);
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(284);
							identifierList();
							}
						}

						setState(287);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(VapaPithaParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(VapaPithaParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(VapaPithaParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(VapaPithaParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitNestedParenthesesBlock(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976677886L) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case Break:
				case Char:
				case Const:
				case Continue:
				case Else:
				case Float:
				case For:
				case If:
				case Int:
				case Return:
				case Void:
				case Bool:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case Plus:
				case Minus:
				case Star:
				case Div:
				case Mod:
				case AndAnd:
				case OrOr:
				case Not:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case Equal:
				case NotEqual:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(293);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(294);
					match(LeftParen);
					setState(295);
					nestedParenthesesBlock();
					setState(296);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(302);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitTypeQualifierList(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
				typeQualifier();
				}
				}
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(VapaPithaParser.Comma, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitParameterTypeList(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			parameterList();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(309);
				match(Comma);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			parameterDeclaration();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(313);
					match(Comma);
					setState(314);
					parameterDeclaration();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameterDeclaration);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				declarationSpecifiers();
				setState(321);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				declarationSpecifiers2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(VapaPithaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VapaPithaParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(Identifier);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(327);
				match(Comma);
				setState(328);
				match(Identifier);
				}
				}
				setState(333);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			specifierQualifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				compoundStatement();
				}
				break;
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Semi:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				expressionStatement();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				selectionStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				iterationStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				jumpStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(VapaPithaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(VapaPithaParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LeftBrace);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16494314487726L) != 0)) {
				{
				setState(346);
				blockItemList();
				}
			}

			setState(349);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitBlockItemList(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				blockItem();
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16494314487726L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitBlockItem(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockItem);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Continue:
			case For:
			case If:
			case Return:
			case LeftParen:
			case LeftBrace:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Semi:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				statement();
				}
				break;
			case T__0:
			case Char:
			case Float:
			case Int:
			case Void:
			case Bool:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(VapaPithaParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
				{
				setState(360);
				expression();
				}
			}

			setState(363);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(VapaPithaParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(VapaPithaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(VapaPithaParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(VapaPithaParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(If);
			setState(366);
			match(LeftParen);
			setState(367);
			expression();
			setState(368);
			match(RightParen);
			setState(369);
			statement();
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(370);
				match(Else);
				setState(371);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(VapaPithaParser.For, 0); }
		public TerminalNode LeftParen() { return getToken(VapaPithaParser.LeftParen, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(VapaPithaParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_iterationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(For);
			setState(375);
			match(LeftParen);
			setState(376);
			forCondition();
			setState(377);
			match(RightParen);
			setState(378);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(VapaPithaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(VapaPithaParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitForCondition(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Char:
			case Float:
			case Int:
			case Void:
			case Bool:
				{
				setState(380);
				forDeclaration();
				}
				break;
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case Not:
			case Semi:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
					{
					setState(381);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(386);
			match(Semi);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
				{
				setState(387);
				forExpression();
				}
			}

			setState(390);
			match(Semi);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
				{
				setState(391);
				forExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitForDeclaration(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			declarationSpecifiers();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==Identifier) {
				{
				setState(395);
				initDeclaratorList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(VapaPithaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VapaPithaParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			assignmentExpression();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(399);
				match(Comma);
				setState(400);
				assignmentExpression();
				}
				}
				setState(405);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(VapaPithaParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(VapaPithaParser.Continue, 0); }
		public TerminalNode Break() { return getToken(VapaPithaParser.Break, 0); }
		public TerminalNode Return() { return getToken(VapaPithaParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				{
				setState(406);
				match(Continue);
				}
				break;
			case Break:
				{
				setState(407);
				match(Break);
				}
				break;
			case Return:
				{
				setState(408);
				match(Return);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16493240664064L) != 0)) {
					{
					setState(409);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VapaPithaParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1100585399434L) != 0)) {
				{
				setState(416);
				translationUnit();
				}
			}

			setState(419);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421);
				externalDeclaration();
				}
				}
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1100585399434L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(VapaPithaParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_externalDeclaration);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(Semi);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) {
				try {
					((VapaPithaListener)listener).enterFunctionDefinition(this);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0)) {
				{
				setState(431);
				declarationSpecifiers();
				}
			}

			setState(434);
			declarator();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0)) {
				{
				setState(435);
				declarationList();
				}
			}

			setState(438);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VapaPithaListener ) ((VapaPithaListener)listener).exitDeclarationList(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				declaration();
				}
				}
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 13450L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		case 27:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u01be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"l\b\u0000\u000b\u0000\f\u0000m\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000t\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001y\b\u0001\u0001\u0001\u0005\u0001|\b\u0001\n\u0001\f\u0001\u007f"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0084\b\u0002"+
		"\n\u0002\f\u0002\u0087\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008d\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0098\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d"+
		"\b\u0006\n\u0006\f\u0006\u00a0\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00a5\b\u0007\n\u0007\f\u0007\u00a8\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00ad\b\b\n\b\f\b\u00b0\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u00b5\b\t\n\t\f\t\u00b8\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u00bd"+
		"\b\n\n\n\f\n\u00c0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00c5\b\u000b\n\u000b\f\u000b\u00c8\t\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d2\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d9\b\u000f\n"+
		"\u000f\f\u000f\u00dc\t\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00e2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004"+
		"\u0012\u00e7\b\u0012\u000b\u0012\f\u0012\u00e8\u0001\u0013\u0004\u0013"+
		"\u00ec\b\u0013\u000b\u0013\f\u0013\u00ed\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00f2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f7"+
		"\b\u0015\n\u0015\f\u0015\u00fa\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00ff\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0105\b\u0018\u0001\u0018\u0003\u0018\u0108\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0114\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u011e\b\u001b\u0001\u001b\u0005\u001b\u0121"+
		"\b\u001b\n\u001b\f\u001b\u0124\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u012b\b\u001c\n\u001c\f\u001c\u012e"+
		"\t\u001c\u0001\u001d\u0004\u001d\u0131\b\u001d\u000b\u001d\f\u001d\u0132"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0137\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u013c\b\u001f\n\u001f\f\u001f\u013f\t\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0145\b \u0001!\u0001!\u0001!\u0005!\u014a"+
		"\b!\n!\f!\u014d\t!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0003$\u0158\b$\u0001%\u0001%\u0003%\u015c\b%\u0001%\u0001"+
		"%\u0001&\u0004&\u0161\b&\u000b&\f&\u0162\u0001\'\u0001\'\u0003\'\u0167"+
		"\b\'\u0001(\u0003(\u016a\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0003)\u0175\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0003+\u017f\b+\u0003+\u0181\b+\u0001+\u0001+\u0003"+
		"+\u0185\b+\u0001+\u0001+\u0003+\u0189\b+\u0001,\u0001,\u0003,\u018d\b"+
		",\u0001-\u0001-\u0001-\u0005-\u0192\b-\n-\f-\u0195\t-\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u019b\b.\u0003.\u019d\b.\u0001.\u0001.\u0001/\u0003/\u01a2"+
		"\b/\u0001/\u0001/\u00010\u00040\u01a7\b0\u000b0\f0\u01a8\u00011\u0001"+
		"1\u00011\u00031\u01ae\b1\u00012\u00032\u01b1\b2\u00012\u00012\u00032\u01b5"+
		"\b2\u00012\u00012\u00013\u00043\u01ba\b3\u000b3\f3\u01bb\u00013\u0000"+
		"\u000164\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\b\u0002"+
		"\u0000\u0016\u0018\u001d\u001d\u0001\u0000\u0018\u001a\u0001\u0000\u0016"+
		"\u0017\u0001\u0000\u0012\u0015\u0001\u0000&\'\u0001\u0000 %\u0004\u0000"+
		"\u0003\u0003\u0007\u0007\n\n\f\r\u0001\u0000\u000e\u000f\u01c8\u0000s"+
		"\u0001\u0000\u0000\u0000\u0002u\u0001\u0000\u0000\u0000\u0004\u0080\u0001"+
		"\u0000\u0000\u0000\u0006\u008c\u0001\u0000\u0000\u0000\b\u008e\u0001\u0000"+
		"\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000"+
		"\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000"+
		"\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b9\u0001\u0000\u0000"+
		"\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000"+
		"\u0000\u001a\u00d1\u0001\u0000\u0000\u0000\u001c\u00d3\u0001\u0000\u0000"+
		"\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000"+
		"\"\u00df\u0001\u0000\u0000\u0000$\u00e6\u0001\u0000\u0000\u0000&\u00eb"+
		"\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000\u0000*\u00f3\u0001\u0000"+
		"\u0000\u0000,\u00fb\u0001\u0000\u0000\u0000.\u0100\u0001\u0000\u0000\u0000"+
		"0\u0104\u0001\u0000\u0000\u00002\u0109\u0001\u0000\u0000\u00004\u010b"+
		"\u0001\u0000\u0000\u00006\u0113\u0001\u0000\u0000\u00008\u012c\u0001\u0000"+
		"\u0000\u0000:\u0130\u0001\u0000\u0000\u0000<\u0134\u0001\u0000\u0000\u0000"+
		">\u0138\u0001\u0000\u0000\u0000@\u0144\u0001\u0000\u0000\u0000B\u0146"+
		"\u0001\u0000\u0000\u0000D\u014e\u0001\u0000\u0000\u0000F\u0150\u0001\u0000"+
		"\u0000\u0000H\u0157\u0001\u0000\u0000\u0000J\u0159\u0001\u0000\u0000\u0000"+
		"L\u0160\u0001\u0000\u0000\u0000N\u0166\u0001\u0000\u0000\u0000P\u0169"+
		"\u0001\u0000\u0000\u0000R\u016d\u0001\u0000\u0000\u0000T\u0176\u0001\u0000"+
		"\u0000\u0000V\u0180\u0001\u0000\u0000\u0000X\u018a\u0001\u0000\u0000\u0000"+
		"Z\u018e\u0001\u0000\u0000\u0000\\\u019c\u0001\u0000\u0000\u0000^\u01a1"+
		"\u0001\u0000\u0000\u0000`\u01a6\u0001\u0000\u0000\u0000b\u01ad\u0001\u0000"+
		"\u0000\u0000d\u01b0\u0001\u0000\u0000\u0000f\u01b9\u0001\u0000\u0000\u0000"+
		"ht\u0005(\u0000\u0000it\u0005)\u0000\u0000jl\u0005+\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nt\u0001\u0000\u0000\u0000op\u0005\u000e\u0000"+
		"\u0000pq\u0003\u001e\u000f\u0000qr\u0005\u000f\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000sh\u0001\u0000\u0000\u0000si\u0001\u0000\u0000\u0000sk\u0001"+
		"\u0000\u0000\u0000so\u0001\u0000\u0000\u0000t\u0001\u0001\u0000\u0000"+
		"\u0000u}\u0003\u0000\u0000\u0000vx\u0005\u000e\u0000\u0000wy\u0003\u0004"+
		"\u0002\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0005\u000f\u0000\u0000{v\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0003\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0085\u0003\u001a\r\u0000\u0081\u0082\u0005\u001f\u0000\u0000\u0082"+
		"\u0084\u0003\u001a\r\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0005\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u008d\u0003\u0002\u0001\u0000\u0089\u008a"+
		"\u0003\b\u0004\u0000\u008a\u008b\u0003\n\u0005\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008d\u0007\u0001\u0000\u0000\u0000\u008e\u008f\u0007"+
		"\u0000\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u000e"+
		"\u0000\u0000\u0091\u0092\u0003D\"\u0000\u0092\u0093\u0005\u000f\u0000"+
		"\u0000\u0093\u0094\u0003\n\u0005\u0000\u0094\u0098\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0003\u0006\u0003\u0000\u0096\u0098\u0005*\u0000\u0000\u0097"+
		"\u0090\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u000b\u0001\u0000\u0000\u0000\u0099"+
		"\u009e\u0003\n\u0005\u0000\u009a\u009b\u0007\u0001\u0000\u0000\u009b\u009d"+
		"\u0003\n\u0005\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a6\u0003\f\u0006\u0000\u00a2\u00a3\u0007\u0002\u0000"+
		"\u0000\u00a3\u00a5\u0003\f\u0006\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u000f\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003\u000e\u0007\u0000"+
		"\u00aa\u00ab\u0007\u0003\u0000\u0000\u00ab\u00ad\u0003\u000e\u0007\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u0011\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b6\u0003\u0010\b\u0000\u00b2\u00b3\u0007\u0004\u0000\u0000\u00b3"+
		"\u00b5\u0003\u0010\b\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u0013\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00be\u0003\u0012\t\u0000\u00ba\u00bb\u0005"+
		"\u001b\u0000\u0000\u00bb\u00bd\u0003\u0012\t\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u0015\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003\u0014"+
		"\n\u0000\u00c2\u00c3\u0005\u001c\u0000\u0000\u00c3\u00c5\u0003\u0014\n"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u0017\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0003\u0016\u000b\u0000\u00ca\u0019\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d2\u0003\u0018\f\u0000\u00cc\u00cd\u0003\u0006\u0003\u0000"+
		"\u00cd\u00ce\u0003\u001c\u000e\u0000\u00ce\u00cf\u0003\u001a\r\u0000\u00cf"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005*\u0000\u0000\u00d1\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u001b\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0007\u0005\u0000\u0000\u00d4\u001d\u0001\u0000\u0000\u0000\u00d5\u00da"+
		"\u0003\u001a\r\u0000\u00d6\u00d7\u0005\u001f\u0000\u0000\u00d7\u00d9\u0003"+
		"\u001a\r\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u001f\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000\u00de!\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0003$\u0012\u0000\u00e0\u00e2\u0003*\u0015\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u001e\u0000\u0000\u00e4"+
		"#\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003(\u0014\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9%\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ec\u0003(\u0014\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\'\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0003.\u0017\u0000\u00f0\u00f2\u00032\u0019\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2)\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f8\u0003,\u0016\u0000\u00f4\u00f5\u0005\u001f"+
		"\u0000\u0000\u00f5\u00f7\u0003,\u0016\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9+\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u00034\u001a\u0000\u00fc"+
		"\u00fd\u0005 \u0000\u0000\u00fd\u00ff\u0003F#\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff-\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0007\u0006\u0000\u0000\u0101/\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0003.\u0017\u0000\u0103\u0105\u00032\u0019\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0107\u0001\u0000\u0000\u0000\u0106\u0108\u00030\u0018\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u01081\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0001\u0000\u0000\u010a3\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u00036\u001b\u0000\u010c5\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0006\u001b\uffff\uffff\u0000\u010e\u0114\u0005(\u0000\u0000"+
		"\u010f\u0110\u0005\u000e\u0000\u0000\u0110\u0111\u00034\u001a\u0000\u0111"+
		"\u0112\u0005\u000f\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u010d\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0114"+
		"\u0122\u0001\u0000\u0000\u0000\u0115\u0116\n\u0002\u0000\u0000\u0116\u0117"+
		"\u0005\u000e\u0000\u0000\u0117\u0118\u0003<\u001e\u0000\u0118\u0119\u0005"+
		"\u000f\u0000\u0000\u0119\u0121\u0001\u0000\u0000\u0000\u011a\u011b\n\u0001"+
		"\u0000\u0000\u011b\u011d\u0005\u000e\u0000\u0000\u011c\u011e\u0003B!\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0005\u000f\u0000\u0000"+
		"\u0120\u0115\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u01237\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0125\u012b\b\u0007\u0000\u0000\u0126\u0127"+
		"\u0005\u000e\u0000\u0000\u0127\u0128\u00038\u001c\u0000\u0128\u0129\u0005"+
		"\u000f\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0125\u0001"+
		"\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d9\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u00032\u0019\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133;\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u0003>\u001f\u0000\u0135\u0137\u0005\u001f\u0000\u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"=\u0001\u0000\u0000\u0000\u0138\u013d\u0003@ \u0000\u0139\u013a\u0005"+
		"\u001f\u0000\u0000\u013a\u013c\u0003@ \u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e?\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0003$\u0012\u0000\u0141"+
		"\u0142\u00034\u001a\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0145"+
		"\u0003&\u0013\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0145A\u0001\u0000\u0000\u0000\u0146\u014b\u0005(\u0000"+
		"\u0000\u0147\u0148\u0005\u001f\u0000\u0000\u0148\u014a\u0005(\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014cC\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u00030\u0018\u0000\u014fE\u0001\u0000\u0000\u0000\u0150\u0151\u0003"+
		"\u001a\r\u0000\u0151G\u0001\u0000\u0000\u0000\u0152\u0158\u0003J%\u0000"+
		"\u0153\u0158\u0003P(\u0000\u0154\u0158\u0003R)\u0000\u0155\u0158\u0003"+
		"T*\u0000\u0156\u0158\u0003\\.\u0000\u0157\u0152\u0001\u0000\u0000\u0000"+
		"\u0157\u0153\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158I\u0001\u0000\u0000\u0000\u0159\u015b\u0005\u0010\u0000\u0000\u015a"+
		"\u015c\u0003L&\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\u0011\u0000\u0000\u015eK\u0001\u0000\u0000\u0000\u015f\u0161\u0003N\'"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163M\u0001\u0000\u0000\u0000\u0164\u0167\u0003H$\u0000\u0165"+
		"\u0167\u0003\"\u0011\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0167O\u0001\u0000\u0000\u0000\u0168\u016a\u0003"+
		"\u001e\u000f\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"\u001e\u0000\u0000\u016cQ\u0001\u0000\u0000\u0000\u016d\u016e\u0005\t"+
		"\u0000\u0000\u016e\u016f\u0005\u000e\u0000\u0000\u016f\u0170\u0003\u001e"+
		"\u000f\u0000\u0170\u0171\u0005\u000f\u0000\u0000\u0171\u0174\u0003H$\u0000"+
		"\u0172\u0173\u0005\u0006\u0000\u0000\u0173\u0175\u0003H$\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175S\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\b\u0000\u0000\u0177\u0178\u0005\u000e"+
		"\u0000\u0000\u0178\u0179\u0003V+\u0000\u0179\u017a\u0005\u000f\u0000\u0000"+
		"\u017a\u017b\u0003H$\u0000\u017bU\u0001\u0000\u0000\u0000\u017c\u0181"+
		"\u0003X,\u0000\u017d\u017f\u0003\u001e\u000f\u0000\u017e\u017d\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000"+
		"\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0005\u001e"+
		"\u0000\u0000\u0183\u0185\u0003Z-\u0000\u0184\u0183\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0188\u0005\u001e\u0000\u0000\u0187\u0189\u0003Z-\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189W\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0003$\u0012\u0000\u018b\u018d\u0003*\u0015"+
		"\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018dY\u0001\u0000\u0000\u0000\u018e\u0193\u0003\u001a\r\u0000"+
		"\u018f\u0190\u0005\u001f\u0000\u0000\u0190\u0192\u0003\u001a\r\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"[\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u019d"+
		"\u0005\u0005\u0000\u0000\u0197\u019d\u0005\u0002\u0000\u0000\u0198\u019a"+
		"\u0005\u000b\u0000\u0000\u0199\u019b\u0003\u001e\u000f\u0000\u019a\u0199"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d"+
		"\u0001\u0000\u0000\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c\u0197"+
		"\u0001\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u001e\u0000\u0000\u019f]\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0003`0\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0005\u0000\u0000\u0001\u01a4_\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0003b1\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9a\u0001\u0000\u0000\u0000\u01aa\u01ae\u0003"+
		"d2\u0000\u01ab\u01ae\u0003\"\u0011\u0000\u01ac\u01ae\u0005\u001e\u0000"+
		"\u0000\u01ad\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01aec\u0001\u0000\u0000\u0000"+
		"\u01af\u01b1\u0003$\u0012\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b4\u00034\u001a\u0000\u01b3\u01b5\u0003f3\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0003J%\u0000\u01b7e\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ba\u0003\"\u0011\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcg\u0001\u0000\u0000\u00006m"+
		"sx}\u0085\u008c\u0097\u009e\u00a6\u00ae\u00b6\u00be\u00c6\u00d1\u00da"+
		"\u00e1\u00e8\u00ed\u00f1\u00f8\u00fe\u0104\u0107\u0113\u011d\u0120\u0122"+
		"\u012a\u012c\u0132\u0136\u013d\u0144\u014b\u0157\u015b\u0162\u0166\u0169"+
		"\u0174\u017e\u0180\u0184\u0188\u018c\u0193\u019a\u019c\u01a1\u01a8\u01ad"+
		"\u01b0\u01b4\u01bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}