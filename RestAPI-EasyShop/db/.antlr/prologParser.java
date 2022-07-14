// Generated from c:\Users\Anton\Desktop\Proyecto Tercer Año\REST-API-PROYECTO\db\prolog.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prologParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, LETTER_DIGIT=23, VARIABLE=24, 
		DECIMAL=25, BINARY=26, OCTAL=27, HEX=28, FLOAT=29, QUOTED=30, DOUBLE_QUOTED_LIST=31, 
		WS=32, COMMENT=33, MULTILINE_COMMENT=34;
	public static final int
		RULE_p_text = 0, RULE_directive = 1, RULE_clause = 2, RULE_termlist = 3, 
		RULE_term = 4, RULE_operator_ = 5, RULE_atom = 6, RULE_integer = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"p_text", "directive", "clause", "termlist", "term", "operator_", "atom", 
			"integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':-'", "'.'", "','", "'('", "')'", "'-'", "'?-'", "';'", "'->'", 
			"'='", "'=='", "'is'", "'=:='", "'<'", "'=<'", "'>'", "'>='", "':'", 
			"'+'", "'*'", "'/'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "LETTER_DIGIT", 
			"VARIABLE", "DECIMAL", "BINARY", "OCTAL", "HEX", "FLOAT", "QUOTED", "DOUBLE_QUOTED_LIST", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "prolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public prologParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class P_textContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(prologParser.EOF, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public P_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_text; }
	}

	public final P_textContext p_text() throws RecognitionException {
		P_textContext _localctx = new P_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << LETTER_DIGIT) | (1L << VARIABLE) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << FLOAT) | (1L << QUOTED) | (1L << DOUBLE_QUOTED_LIST))) != 0)) {
				{
				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16);
					directive();
					}
					break;
				case 2:
					{
					setState(17);
					clause();
					}
					break;
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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

	public static class DirectiveContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			term(0);
			setState(27);
			match(T__1);
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

	public static class ClauseContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			term(0);
			setState(30);
			match(T__1);
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

	public static class TermlistContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termlist; }
	}

	public final TermlistContext termlist() throws RecognitionException {
		TermlistContext _localctx = new TermlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			term(0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(33);
				match(T__2);
				setState(34);
				term(0);
				}
				}
				setState(39);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atom_termContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class Binary_operatorContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public Binary_operatorContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class Unary_operatorContext extends TermContext {
		public Operator_Context operator_() {
			return getRuleContext(Operator_Context.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Unary_operatorContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class Braced_termContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Braced_termContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class VariableContext extends TermContext {
		public TerminalNode VARIABLE() { return getToken(prologParser.VARIABLE, 0); }
		public VariableContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class FloatContext extends TermContext {
		public TerminalNode FLOAT() { return getToken(prologParser.FLOAT, 0); }
		public FloatContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class Compound_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public Compound_termContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class Integer_termContext extends TermContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Integer_termContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new Braced_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__3);
				setState(43);
				term(0);
				setState(44);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new Integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(46);
					match(T__5);
					}
				}

				setState(49);
				integer();
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(50);
					match(T__5);
					}
				}

				setState(53);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new Compound_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				atom();
				setState(55);
				match(T__3);
				setState(56);
				termlist();
				setState(57);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new Unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				operator_();
				setState(60);
				term(2);
				}
				break;
			case 7:
				{
				_localctx = new Atom_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_operatorContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(65);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(66);
					operator_();
					setState(67);
					term(3);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CutContext extends AtomContext {
		public CutContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class Dq_stringContext extends AtomContext {
		public TerminalNode DOUBLE_QUOTED_LIST() { return getToken(prologParser.DOUBLE_QUOTED_LIST, 0); }
		public Dq_stringContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NameContext extends AtomContext {
		public TerminalNode LETTER_DIGIT() { return getToken(prologParser.LETTER_DIGIT, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class Quoted_stringContext extends AtomContext {
		public TerminalNode QUOTED() { return getToken(prologParser.QUOTED, 0); }
		public Quoted_stringContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class SemicolonContext extends AtomContext {
		public SemicolonContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_DIGIT:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(LETTER_DIGIT);
				}
				break;
			case QUOTED:
				_localctx = new Quoted_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(QUOTED);
				}
				break;
			case DOUBLE_QUOTED_LIST:
				_localctx = new Dq_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(DOUBLE_QUOTED_LIST);
				}
				break;
			case T__7:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__7);
				}
				break;
			case T__21:
				_localctx = new CutContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(T__21);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(prologParser.DECIMAL, 0); }
		public TerminalNode BINARY() { return getToken(prologParser.BINARY, 0); }
		public TerminalNode OCTAL() { return getToken(prologParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(prologParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$X\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5&\n"+
		"\5\f\5\16\5)\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\5\6\66"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\3\6\3\6\3\6"+
		"\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\t\3\t"+
		"\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\4\5\2\3\3\5\5\b\27\3\2\33\36\2_\2\26"+
		"\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b\"\3\2\2\2\nA\3\2\2\2\fL\3\2\2\2\16"+
		"S\3\2\2\2\20U\3\2\2\2\22\25\5\4\3\2\23\25\5\6\4\2\24\22\3\2\2\2\24\23"+
		"\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26"+
		"\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7\3\2\2\34\35\5\n\6\2\35\36"+
		"\7\4\2\2\36\5\3\2\2\2\37 \5\n\6\2 !\7\4\2\2!\7\3\2\2\2\"\'\5\n\6\2#$\7"+
		"\5\2\2$&\5\n\6\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2"+
		")\'\3\2\2\2*+\b\6\1\2+B\7\32\2\2,-\7\6\2\2-.\5\n\6\2./\7\7\2\2/B\3\2\2"+
		"\2\60\62\7\b\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63B\5\20\t"+
		"\2\64\66\7\b\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67B\7\37\2"+
		"\289\5\16\b\29:\7\6\2\2:;\5\b\5\2;<\7\7\2\2<B\3\2\2\2=>\5\f\7\2>?\5\n"+
		"\6\4?B\3\2\2\2@B\5\16\b\2A*\3\2\2\2A,\3\2\2\2A\61\3\2\2\2A\65\3\2\2\2"+
		"A8\3\2\2\2A=\3\2\2\2A@\3\2\2\2BI\3\2\2\2CD\f\5\2\2DE\5\f\7\2EF\5\n\6\5"+
		"FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2"+
		"\2LM\t\2\2\2M\r\3\2\2\2NT\7\31\2\2OT\7 \2\2PT\7!\2\2QT\7\n\2\2RT\7\30"+
		"\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\17\3\2\2\2UV\t"+
		"\3\2\2V\21\3\2\2\2\n\24\26\'\61\65AIS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}