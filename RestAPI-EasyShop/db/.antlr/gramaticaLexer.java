// Generated from c:\Users\Anton\Desktop\Proyecto Tercer Año\REST-API-PROYECTO\db\prolog.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "LETTER_DIGIT", "VARIABLE", 
			"DECIMAL", "BINARY", "OCTAL", "HEX", "FLOAT", "NON_QUOTE_CHAR", "QUOTED", 
			"DOUBLE_QUOTED_LIST", "ALPHANUMERIC", "ALPHA", "SMALL_LETTER", "CAPITAL_LETTER", 
			"DIGIT", "HEX_DIGIT", "WS", "COMMENT", "MULTILINE_COMMENT"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "prolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u008d\n\30\f\30\16\30\u0090\13\30"+
		"\3\31\3\31\7\31\u0094\n\31\f\31\16\31\u0097\13\31\3\31\3\31\6\31\u009b"+
		"\n\31\r\31\16\31\u009c\3\31\5\31\u00a0\n\31\3\32\6\32\u00a3\n\32\r\32"+
		"\16\32\u00a4\3\33\3\33\3\33\3\33\6\33\u00ab\n\33\r\33\16\33\u00ac\3\34"+
		"\3\34\3\34\3\34\6\34\u00b3\n\34\r\34\16\34\u00b4\3\35\3\35\3\35\3\35\6"+
		"\35\u00bb\n\35\r\35\16\35\u00bc\3\36\3\36\3\36\6\36\u00c2\n\36\r\36\16"+
		"\36\u00c3\3\36\3\36\3\36\5\36\u00c9\n\36\3\37\3\37\5\37\u00cd\n\37\3 "+
		"\3 \7 \u00d1\n \f \16 \u00d4\13 \3 \3 \3!\3!\7!\u00da\n!\f!\16!\u00dd"+
		"\13!\3!\3!\3\"\3\"\5\"\u00e3\n\"\3#\3#\3#\5#\u00e8\n#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\6(\u00f3\n(\r(\16(\u00f4\3(\3(\3)\3)\7)\u00fb\n)\f)\16)\u00fe"+
		"\13)\3)\5)\u0101\n)\3)\3)\3*\3*\3*\3*\3*\7*\u010a\n*\f*\16*\u010d\13*"+
		"\3*\3*\3*\5*\u0112\n*\3*\3*\5\u00d2\u00db\u010b\2+\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2? A!C\2E\2G\2I\2"+
		"K\2M\2O\"Q#S$\3\2\r\3\2\62\63\3\2\629\3\2\62;\4\2GGgg\4\2--//\4\2aac|"+
		"\3\2C\\\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u0123"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2"+
		"\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2"+
		"\2\21e\3\2\2\2\23g\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31o\3\2\2\2\33r\3\2"+
		"\2\2\35v\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'\u0082"+
		"\3\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2-\u0088\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u009f\3\2\2\2\63\u00a2\3\2\2\2\65\u00a6\3\2\2\2\67\u00ae\3\2\2\29\u00b6"+
		"\3\2\2\2;\u00be\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00e2\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I\u00eb\3\2\2\2K\u00ed\3\2"+
		"\2\2M\u00ef\3\2\2\2O\u00f2\3\2\2\2Q\u00f8\3\2\2\2S\u0104\3\2\2\2UV\7<"+
		"\2\2VW\7/\2\2W\4\3\2\2\2XY\7\60\2\2Y\6\3\2\2\2Z[\7.\2\2[\b\3\2\2\2\\]"+
		"\7*\2\2]\n\3\2\2\2^_\7+\2\2_\f\3\2\2\2`a\7/\2\2a\16\3\2\2\2bc\7A\2\2c"+
		"d\7/\2\2d\20\3\2\2\2ef\7=\2\2f\22\3\2\2\2gh\7/\2\2hi\7@\2\2i\24\3\2\2"+
		"\2jk\7?\2\2k\26\3\2\2\2lm\7?\2\2mn\7?\2\2n\30\3\2\2\2op\7k\2\2pq\7u\2"+
		"\2q\32\3\2\2\2rs\7?\2\2st\7<\2\2tu\7?\2\2u\34\3\2\2\2vw\7>\2\2w\36\3\2"+
		"\2\2xy\7?\2\2yz\7>\2\2z \3\2\2\2{|\7@\2\2|\"\3\2\2\2}~\7@\2\2~\177\7?"+
		"\2\2\177$\3\2\2\2\u0080\u0081\7<\2\2\u0081&\3\2\2\2\u0082\u0083\7-\2\2"+
		"\u0083(\3\2\2\2\u0084\u0085\7,\2\2\u0085*\3\2\2\2\u0086\u0087\7\61\2\2"+
		"\u0087,\3\2\2\2\u0088\u0089\7#\2\2\u0089.\3\2\2\2\u008a\u008e\5G$\2\u008b"+
		"\u008d\5C\"\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\60\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095"+
		"\5I%\2\u0092\u0094\5C\"\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a0\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009a\7a\2\2\u0099\u009b\5C\"\2\u009a\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u00a0\7a\2\2\u009f\u0091\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\62\3\2\2\2\u00a1\u00a3\5K&\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\64\3\2\2\2\u00a6"+
		"\u00a7\7\62\2\2\u00a7\u00a8\7d\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\t\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7\62\2\2\u00af\u00b0\7q\2"+
		"\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b58\3\2\2\2\u00b6"+
		"\u00b7\7\62\2\2\u00b7\u00b8\7z\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5M"+
		"\'\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd:\3\2\2\2\u00be\u00bf\5\63\32\2\u00bf\u00c1\7\60\2"+
		"\2\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c6\t\5\2\2\u00c6"+
		"\u00c7\t\6\2\2\u00c7\u00c9\5\63\32\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9<\3\2\2\2\u00ca\u00cd\5C\"\2\u00cb\u00cd\7\"\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd>\3\2\2\2\u00ce\u00d2\7)\2\2\u00cf\u00d1"+
		"\5=\37\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7)"+
		"\2\2\u00d6@\3\2\2\2\u00d7\u00db\7$\2\2\u00d8\u00da\5=\37\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7$\2\2\u00dfB\3\2\2\2\u00e0"+
		"\u00e3\5E#\2\u00e1\u00e3\5K&\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3D\3\2\2\2\u00e4\u00e8\7a\2\2\u00e5\u00e8\5G$\2\u00e6\u00e8\5I%\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8F\3"+
		"\2\2\2\u00e9\u00ea\t\7\2\2\u00eaH\3\2\2\2\u00eb\u00ec\t\b\2\2\u00ecJ\3"+
		"\2\2\2\u00ed\u00ee\t\4\2\2\u00eeL\3\2\2\2\u00ef\u00f0\t\t\2\2\u00f0N\3"+
		"\2\2\2\u00f1\u00f3\t\n\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b("+
		"\2\2\u00f7P\3\2\2\2\u00f8\u00fc\7\'\2\2\u00f9\u00fb\n\13\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\t\f\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b)\3\2\u0103R\3\2\2\2\u0104\u0105"+
		"\7\61\2\2\u0105\u0106\7,\2\2\u0106\u010b\3\2\2\2\u0107\u010a\5S*\2\u0108"+
		"\u010a\13\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0111\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7,\2\2\u010f\u0112\7\61\2\2\u0110\u0112\7\2"+
		"\2\3\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\b*\3\2\u0114T\3\2\2\2\30\2\u008e\u0095\u009c\u009f\u00a4\u00ac"+
		"\u00b4\u00bc\u00c3\u00c8\u00cc\u00d2\u00db\u00e2\u00e7\u00f4\u00fc\u0100"+
		"\u0109\u010b\u0111\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}