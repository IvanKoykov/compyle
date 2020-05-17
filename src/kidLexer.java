// Generated from D:/����/compyle/src\kid.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kidLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WRITE=19, WHILE=20, DO=21, IF=22, THEN=23, ODD=24, BEGIN=25, 
		END=26, CALL=27, CONST=28, VAR=29, PROCEDURE=30, STRING=31, NUMBER=32, 
		WS=33, BlockComment=34, LineComment=35;
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
			"T__17", "WRITE", "WHILE", "DO", "IF", "THEN", "ODD", "BEGIN", "END", 
			"CALL", "CONST", "VAR", "PROCEDURE", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "STRING", "NUMBER", "WS", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'='", "','", "';'", "':='", "'?'", "'!'", "'#'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WRITE", "WHILE", "DO", "IF", 
			"THEN", "ODD", "BEGIN", "END", "CALL", "CONST", "VAR", "PROCEDURE", "STRING", 
			"NUMBER", "WS", "BlockComment", "LineComment"
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


	public kidLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "kid.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\7:\u0119\n:\f"+
		":\16:\u011c\13:\3;\6;\u011f\n;\r;\16;\u0120\3<\3<\3<\3<\3=\3=\3=\3=\7"+
		"=\u012b\n=\f=\16=\u012e\13=\3=\3=\3=\3=\3=\3>\3>\3>\3>\7>\u0139\n>\f>"+
		"\16>\u013c\13>\3>\3>\3\u012c\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2"+
		"W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s!u\"w#y${%\3\2 \4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0128\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3"+
		"\2\2\2\7\u0081\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0088\3\2\2"+
		"\2\17\u008a\3\2\2\2\21\u008c\3\2\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2"+
		"\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3\2\2\2\37"+
		"\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3"+
		"\2\2\2)\u00aa\3\2\2\2+\u00b0\3\2\2\2-\u00b3\3\2\2\2/\u00b6\3\2\2\2\61"+
		"\u00bb\3\2\2\2\63\u00bf\3\2\2\2\65\u00c5\3\2\2\2\67\u00c9\3\2\2\29\u00ce"+
		"\3\2\2\2;\u00d4\3\2\2\2=\u00d8\3\2\2\2?\u00e2\3\2\2\2A\u00e4\3\2\2\2C"+
		"\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00ea\3\2\2\2I\u00ec\3\2\2\2K\u00ee\3\2"+
		"\2\2M\u00f0\3\2\2\2O\u00f2\3\2\2\2Q\u00f4\3\2\2\2S\u00f6\3\2\2\2U\u00f8"+
		"\3\2\2\2W\u00fa\3\2\2\2Y\u00fc\3\2\2\2[\u00fe\3\2\2\2]\u0100\3\2\2\2_"+
		"\u0102\3\2\2\2a\u0104\3\2\2\2c\u0106\3\2\2\2e\u0108\3\2\2\2g\u010a\3\2"+
		"\2\2i\u010c\3\2\2\2k\u010e\3\2\2\2m\u0110\3\2\2\2o\u0112\3\2\2\2q\u0114"+
		"\3\2\2\2s\u0116\3\2\2\2u\u011e\3\2\2\2w\u0122\3\2\2\2y\u0126\3\2\2\2{"+
		"\u0134\3\2\2\2}~\7\60\2\2~\4\3\2\2\2\177\u0080\7?\2\2\u0080\6\3\2\2\2"+
		"\u0081\u0082\7.\2\2\u0082\b\3\2\2\2\u0083\u0084\7=\2\2\u0084\n\3\2\2\2"+
		"\u0085\u0086\7<\2\2\u0086\u0087\7?\2\2\u0087\f\3\2\2\2\u0088\u0089\7A"+
		"\2\2\u0089\16\3\2\2\2\u008a\u008b\7#\2\2\u008b\20\3\2\2\2\u008c\u008d"+
		"\7%\2\2\u008d\22\3\2\2\2\u008e\u008f\7>\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7>\2\2\u0091\u0092\7?\2\2\u0092\26\3\2\2\2\u0093\u0094\7@\2\2\u0094\30"+
		"\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097\32\3\2\2\2\u0098"+
		"\u0099\7-\2\2\u0099\34\3\2\2\2\u009a\u009b\7/\2\2\u009b\36\3\2\2\2\u009c"+
		"\u009d\7,\2\2\u009d \3\2\2\2\u009e\u009f\7\61\2\2\u009f\"\3\2\2\2\u00a0"+
		"\u00a1\7*\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3&\3\2\2\2\u00a4\u00a5"+
		"\5k\66\2\u00a5\u00a6\5a\61\2\u00a6\u00a7\5O(\2\u00a7\u00a8\5e\63\2\u00a8"+
		"\u00a9\5G$\2\u00a9(\3\2\2\2\u00aa\u00ab\5k\66\2\u00ab\u00ac\5M\'\2\u00ac"+
		"\u00ad\5O(\2\u00ad\u00ae\5U+\2\u00ae\u00af\5G$\2\u00af*\3\2\2\2\u00b0"+
		"\u00b1\5E#\2\u00b1\u00b2\5[.\2\u00b2,\3\2\2\2\u00b3\u00b4\5O(\2\u00b4"+
		"\u00b5\5I%\2\u00b5.\3\2\2\2\u00b6\u00b7\5e\63\2\u00b7\u00b8\5M\'\2\u00b8"+
		"\u00b9\5G$\2\u00b9\u00ba\5Y-\2\u00ba\60\3\2\2\2\u00bb\u00bc\5[.\2\u00bc"+
		"\u00bd\5E#\2\u00bd\u00be\5E#\2\u00be\62\3\2\2\2\u00bf\u00c0\5A!\2\u00c0"+
		"\u00c1\5G$\2\u00c1\u00c2\5K&\2\u00c2\u00c3\5O(\2\u00c3\u00c4\5Y-\2\u00c4"+
		"\64\3\2\2\2\u00c5\u00c6\5G$\2\u00c6\u00c7\5Y-\2\u00c7\u00c8\5E#\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\5C\"\2\u00ca\u00cb\5? \2\u00cb\u00cc\5U+\2\u00cc"+
		"\u00cd\5U+\2\u00cd8\3\2\2\2\u00ce\u00cf\5C\"\2\u00cf\u00d0\5[.\2\u00d0"+
		"\u00d1\5Y-\2\u00d1\u00d2\5c\62\2\u00d2\u00d3\5e\63\2\u00d3:\3\2\2\2\u00d4"+
		"\u00d5\5i\65\2\u00d5\u00d6\5? \2\u00d6\u00d7\5a\61\2\u00d7<\3\2\2\2\u00d8"+
		"\u00d9\5]/\2\u00d9\u00da\5a\61\2\u00da\u00db\5[.\2\u00db\u00dc\5C\"\2"+
		"\u00dc\u00dd\5G$\2\u00dd\u00de\5E#\2\u00de\u00df\5g\64\2\u00df\u00e0\5"+
		"a\61\2\u00e0\u00e1\5G$\2\u00e1>\3\2\2\2\u00e2\u00e3\t\2\2\2\u00e3@\3\2"+
		"\2\2\u00e4\u00e5\t\3\2\2\u00e5B\3\2\2\2\u00e6\u00e7\t\4\2\2\u00e7D\3\2"+
		"\2\2\u00e8\u00e9\t\5\2\2\u00e9F\3\2\2\2\u00ea\u00eb\t\6\2\2\u00ebH\3\2"+
		"\2\2\u00ec\u00ed\t\7\2\2\u00edJ\3\2\2\2\u00ee\u00ef\t\b\2\2\u00efL\3\2"+
		"\2\2\u00f0\u00f1\t\t\2\2\u00f1N\3\2\2\2\u00f2\u00f3\t\n\2\2\u00f3P\3\2"+
		"\2\2\u00f4\u00f5\t\13\2\2\u00f5R\3\2\2\2\u00f6\u00f7\t\f\2\2\u00f7T\3"+
		"\2\2\2\u00f8\u00f9\t\r\2\2\u00f9V\3\2\2\2\u00fa\u00fb\t\16\2\2\u00fbX"+
		"\3\2\2\2\u00fc\u00fd\t\17\2\2\u00fdZ\3\2\2\2\u00fe\u00ff\t\20\2\2\u00ff"+
		"\\\3\2\2\2\u0100\u0101\t\21\2\2\u0101^\3\2\2\2\u0102\u0103\t\22\2\2\u0103"+
		"`\3\2\2\2\u0104\u0105\t\23\2\2\u0105b\3\2\2\2\u0106\u0107\t\24\2\2\u0107"+
		"d\3\2\2\2\u0108\u0109\t\25\2\2\u0109f\3\2\2\2\u010a\u010b\t\26\2\2\u010b"+
		"h\3\2\2\2\u010c\u010d\t\27\2\2\u010dj\3\2\2\2\u010e\u010f\t\30\2\2\u010f"+
		"l\3\2\2\2\u0110\u0111\t\31\2\2\u0111n\3\2\2\2\u0112\u0113\t\32\2\2\u0113"+
		"p\3\2\2\2\u0114\u0115\t\33\2\2\u0115r\3\2\2\2\u0116\u011a\t\34\2\2\u0117"+
		"\u0119\t\34\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011bt\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f"+
		"\t\35\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121v\3\2\2\2\u0122\u0123\t\36\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u0125\b<\2\2\u0125x\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128"+
		"\7,\2\2\u0128\u012c\3\2\2\2\u0129\u012b\13\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7,\2\2\u0130\u0131\7\61\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\b=\2\2\u0133z\3\2\2\2\u0134\u0135\7\61\2\2"+
		"\u0135\u0136\7\61\2\2\u0136\u013a\3\2\2\2\u0137\u0139\n\37\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\b>\2\2\u013e|\3\2\2\2\7"+
		"\2\u011a\u0120\u012c\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}