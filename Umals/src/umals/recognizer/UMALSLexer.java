// Generated from C:\Users\Declan Easton\Documents\Development\UMALS\Umals\src\u005Cumals\recognizer\UMALS.g4 by ANTLR 4.4
package umals.recognizer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UMALSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, NAME=50, SERVICENAME=51, NORMALSTRING=52, 
		CHARSTRING=53, LONGSTRING=54, INT=55, HEX=56, FLOAT=57, HEX_FLOAT=58, 
		COMMENT=59, LINE_COMMENT=60, WS=61, SHEBANG=62;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'"
	};
	public static final String[] ruleNames = {
		"T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", 
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"NAME", "SERVICENAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "NESTED_STR", 
		"INT", "HEX", "FLOAT", "HEX_FLOAT", "ExponentPart", "HexExponentPart", 
		"EscapeSequence", "DecimalEscape", "HexEscape", "Digit", "HexDigit", "COMMENT", 
		"LINE_COMMENT", "WS", "SHEBANG"
	};


	public UMALSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UMALS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2@\u023b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u0140\n\63\f\63\16\63\u0143"+
		"\13\63\3\64\3\64\7\64\u0147\n\64\f\64\16\64\u014a\13\64\3\65\3\65\3\65"+
		"\7\65\u014f\n\65\f\65\16\65\u0152\13\65\3\65\3\65\3\66\3\66\3\66\7\66"+
		"\u0159\n\66\f\66\16\66\u015c\13\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\78\u016a\n8\f8\168\u016d\138\38\58\u0170\n8\39\69\u0173"+
		"\n9\r9\169\u0174\3:\3:\3:\6:\u017a\n:\r:\16:\u017b\3;\6;\u017f\n;\r;\16"+
		";\u0180\3;\3;\7;\u0185\n;\f;\16;\u0188\13;\3;\5;\u018b\n;\3;\3;\6;\u018f"+
		"\n;\r;\16;\u0190\3;\5;\u0194\n;\3;\6;\u0197\n;\r;\16;\u0198\3;\3;\5;\u019d"+
		"\n;\3<\3<\3<\6<\u01a2\n<\r<\16<\u01a3\3<\3<\7<\u01a8\n<\f<\16<\u01ab\13"+
		"<\3<\5<\u01ae\n<\3<\3<\3<\3<\6<\u01b4\n<\r<\16<\u01b5\3<\5<\u01b9\n<\3"+
		"<\3<\3<\6<\u01be\n<\r<\16<\u01bf\3<\3<\5<\u01c4\n<\3=\3=\5=\u01c8\n=\3"+
		"=\6=\u01cb\n=\r=\16=\u01cc\3>\3>\5>\u01d1\n>\3>\6>\u01d4\n>\r>\16>\u01d5"+
		"\3?\3?\3?\3?\5?\u01dc\n?\3?\3?\3?\5?\u01e1\n?\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\5@\u01ee\n@\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\3E\3E\7E\u0208\nE\fE\16E\u020b\13E\3E\3E\7E\u020f\n"+
		"E\fE\16E\u0212\13E\3E\3E\7E\u0216\nE\fE\16E\u0219\13E\3E\3E\7E\u021d\n"+
		"E\fE\16E\u0220\13E\5E\u0222\nE\3E\3E\3E\5E\u0227\nE\3E\3E\3F\6F\u022c"+
		"\nF\rF\16F\u022d\3F\3F\3G\3G\3G\7G\u0235\nG\fG\16G\u0238\13G\3G\3G\3\u016b"+
		"\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o\2q9s:u;w<y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087=\u0089>\u008b"+
		"?\u008d@\3\2\24\3\2c|\6\2\62;C\\aac|\4\2C\\aa\4\2$$^^\4\2))^^\4\2ZZzz"+
		"\4\2GGgg\4\2--//\4\2RRrr\f\2$$))^^cdhhppttvvxx||\3\2\62\64\3\2\62;\5\2"+
		"\62;CHch\6\2\f\f\17\17??]]\4\2\f\f\17\17\5\2\f\f\17\17]]\4\3\f\f\17\17"+
		"\5\2\13\f\16\17\"\"\u0260\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f"+
		"\3\2\2\2\5\u0091\3\2\2\2\7\u0097\3\2\2\2\t\u009a\3\2\2\2\13\u009d\3\2"+
		"\2\2\r\u009f\3\2\2\2\17\u00a1\3\2\2\2\21\u00a5\3\2\2\2\23\u00a7\3\2\2"+
		"\2\25\u00aa\3\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3\2\2\2\33\u00b9\3\2\2\2"+
		"\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2%\u00cb"+
		"\3\2\2\2\'\u00cd\3\2\2\2)\u00d2\3\2\2\2+\u00d4\3\2\2\2-\u00db\3\2\2\2"+
		"/\u00e0\3\2\2\2\61\u00e7\3\2\2\2\63\u00e9\3\2\2\2\65\u00eb\3\2\2\2\67"+
		"\u00f0\3\2\2\29\u00f3\3\2\2\2;\u00f6\3\2\2\2=\u00fc\3\2\2\2?\u0102\3\2"+
		"\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e"+
		"\3\2\2\2K\u0111\3\2\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u0119\3\2\2\2S"+
		"\u011f\3\2\2\2U\u0121\3\2\2\2W\u0124\3\2\2\2Y\u0129\3\2\2\2[\u012d\3\2"+
		"\2\2]\u012f\3\2\2\2_\u0133\3\2\2\2a\u0137\3\2\2\2c\u013b\3\2\2\2e\u013d"+
		"\3\2\2\2g\u0144\3\2\2\2i\u014b\3\2\2\2k\u0155\3\2\2\2m\u015f\3\2\2\2o"+
		"\u016f\3\2\2\2q\u0172\3\2\2\2s\u0176\3\2\2\2u\u019c\3\2\2\2w\u01c3\3\2"+
		"\2\2y\u01c5\3\2\2\2{\u01ce\3\2\2\2}\u01e0\3\2\2\2\177\u01ed\3\2\2\2\u0081"+
		"\u01ef\3\2\2\2\u0083\u01f4\3\2\2\2\u0085\u01f6\3\2\2\2\u0087\u01f8\3\2"+
		"\2\2\u0089\u0201\3\2\2\2\u008b\u022b\3\2\2\2\u008d\u0231\3\2\2\2\u008f"+
		"\u0090\7}\2\2\u0090\4\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\6\3\2\2\2\u0097"+
		"\u0098\7\60\2\2\u0098\u0099\7\60\2\2\u0099\b\3\2\2\2\u009a\u009b\7<\2"+
		"\2\u009b\u009c\7<\2\2\u009c\n\3\2\2\2\u009d\u009e\7?\2\2\u009e\f\3\2\2"+
		"\2\u009f\u00a0\7`\2\2\u00a0\16\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\7q\2\2\u00a3\u00a4\7t\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\22"+
		"\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7q\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7.\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7r\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\30\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\32\3\2\2\2\u00b9\u00ba"+
		"\7@\2\2\u00ba\u00bb\7?\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\36"+
		"\3\2\2\2\u00be\u00bf\7_\2\2\u00bf \3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\""+
		"\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7q\2\2"+
		"\u00c9\u00ca\7p\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc&\3\2\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1(\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7h\2\2\u00da,\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7g\2\2\u00df.\3\2\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\u00e6\7p\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7=\2\2\u00e8"+
		"\62\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7i\2\2"+
		"\u00ec\u00ed\7q\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7q\2\2\u00ef\66\3\2"+
		"\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7h\2\2\u00f28\3\2\2\2\u00f3\u00f4"+
		"\7>\2\2\u00f4\u00f5\7?\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7m\2\2\u00fb"+
		"<\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7e\2\2\u00ff"+
		"\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101>\3\2\2\2\u0102\u0103\7,\2\2\u0103"+
		"@\3\2\2\2\u0104\u0105\7\60\2\2\u0105B\3\2\2\2\u0106\u0107\7\60\2\2\u0107"+
		"\u0108\7\60\2\2\u0108\u0109\7\60\2\2\u0109D\3\2\2\2\u010a\u010b\7<\2\2"+
		"\u010bF\3\2\2\2\u010c\u010d\7]\2\2\u010dH\3\2\2\2\u010e\u010f\7?\2\2\u010f"+
		"\u0110\7?\2\2\u0110J\3\2\2\2\u0111\u0112\7\u0080\2\2\u0112\u0113\7?\2"+
		"\2\u0113L\3\2\2\2\u0114\u0115\7@\2\2\u0115N\3\2\2\2\u0116\u0117\7q\2\2"+
		"\u0117\u0118\7t\2\2\u0118P\3\2\2\2\u0119\u011a\7w\2\2\u011a\u011b\7p\2"+
		"\2\u011b\u011c\7v\2\2\u011c\u011d\7k\2\2\u011d\u011e\7n\2\2\u011eR\3\2"+
		"\2\2\u011f\u0120\7\'\2\2\u0120T\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123"+
		"\7p\2\2\u0123V\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7g\2\2\u0128X\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7p\2\2\u012b\u012c\7f\2\2\u012cZ\3\2\2\2\u012d\u012e\7+\2\2\u012e\\\3"+
		"\2\2\2\u012f\u0130\7c\2\2\u0130\u0131\7p\2\2\u0131\u0132\7f\2\2\u0132"+
		"^\3\2\2\2\u0133\u0134\7p\2\2\u0134\u0135\7k\2\2\u0135\u0136\7n\2\2\u0136"+
		"`\3\2\2\2\u0137\u0138\7p\2\2\u0138\u0139\7q\2\2\u0139\u013a\7v\2\2\u013a"+
		"b\3\2\2\2\u013b\u013c\7/\2\2\u013cd\3\2\2\2\u013d\u0141\t\2\2\2\u013e"+
		"\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142f\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148"+
		"\t\4\2\2\u0145\u0147\t\3\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149h\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014b\u0150\7$\2\2\u014c\u014f\5}?\2\u014d\u014f\n\5\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$"+
		"\2\2\u0154j\3\2\2\2\u0155\u015a\7)\2\2\u0156\u0159\5}?\2\u0157\u0159\n"+
		"\6\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u015e\7)\2\2\u015el\3\2\2\2\u015f\u0160\7]\2\2\u0160\u0161"+
		"\5o8\2\u0161\u0162\7_\2\2\u0162n\3\2\2\2\u0163\u0164\7?\2\2\u0164\u0165"+
		"\5o8\2\u0165\u0166\7?\2\2\u0166\u0170\3\2\2\2\u0167\u016b\7]\2\2\u0168"+
		"\u016a\13\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\7_\2\2\u016f\u0163\3\2\2\2\u016f\u0167\3\2\2\2\u0170p\3\2\2\2\u0171"+
		"\u0173\5\u0083B\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175r\3\2\2\2\u0176\u0177\7\62\2\2\u0177"+
		"\u0179\t\7\2\2\u0178\u017a\5\u0085C\2\u0179\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017ct\3\2\2\2\u017d"+
		"\u017f\5\u0083B\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186\7\60\2\2"+
		"\u0183\u0185\5\u0083B\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u018b\5y=\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u019d"+
		"\3\2\2\2\u018c\u018e\7\60\2\2\u018d\u018f\5\u0083B\2\u018e\u018d\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193"+
		"\3\2\2\2\u0192\u0194\5y=\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u019d\3\2\2\2\u0195\u0197\5\u0083B\2\u0196\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\5y=\2\u019b\u019d\3\2\2\2\u019c\u017e\3\2\2\2\u019c\u018c\3\2\2"+
		"\2\u019c\u0196\3\2\2\2\u019dv\3\2\2\2\u019e\u019f\7\62\2\2\u019f\u01a1"+
		"\t\7\2\2\u01a0\u01a2\5\u0085C\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a9"+
		"\7\60\2\2\u01a6\u01a8\5\u0085C\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2"+
		"\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ae\5{>\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01c4\3\2\2\2\u01af\u01b0\7\62\2\2\u01b0\u01b1\t\7\2\2\u01b1\u01b3\7"+
		"\60\2\2\u01b2\u01b4\5\u0085C\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9"+
		"\5{>\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c4\3\2\2\2\u01ba"+
		"\u01bb\7\62\2\2\u01bb\u01bd\t\7\2\2\u01bc\u01be\5\u0085C\2\u01bd\u01bc"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\5{>\2\u01c2\u01c4\3\2\2\2\u01c3\u019e\3\2\2"+
		"\2\u01c3\u01af\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c4x\3\2\2\2\u01c5\u01c7"+
		"\t\b\2\2\u01c6\u01c8\t\t\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01cb\5\u0083B\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdz\3\2\2\2\u01ce"+
		"\u01d0\t\n\2\2\u01cf\u01d1\t\t\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\5\u0083B\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6|\3\2\2\2"+
		"\u01d7\u01d8\7^\2\2\u01d8\u01e1\t\13\2\2\u01d9\u01db\7^\2\2\u01da\u01dc"+
		"\7\17\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dd\u01e1\7\f\2\2\u01de\u01e1\5\177@\2\u01df\u01e1\5\u0081A\2\u01e0"+
		"\u01d7\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e1~\3\2\2\2\u01e2\u01e3\7^\2\2\u01e3\u01ee\5\u0083B\2\u01e4\u01e5"+
		"\7^\2\2\u01e5\u01e6\5\u0083B\2\u01e6\u01e7\5\u0083B\2\u01e7\u01ee\3\2"+
		"\2\2\u01e8\u01e9\7^\2\2\u01e9\u01ea\t\f\2\2\u01ea\u01eb\5\u0083B\2\u01eb"+
		"\u01ec\5\u0083B\2\u01ec\u01ee\3\2\2\2\u01ed\u01e2\3\2\2\2\u01ed\u01e4"+
		"\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u0080\3\2\2\2\u01ef\u01f0\7^\2\2\u01f0"+
		"\u01f1\7z\2\2\u01f1\u01f2\5\u0085C\2\u01f2\u01f3\5\u0085C\2\u01f3\u0082"+
		"\3\2\2\2\u01f4\u01f5\t\r\2\2\u01f5\u0084\3\2\2\2\u01f6\u01f7\t\16\2\2"+
		"\u01f7\u0086\3\2\2\2\u01f8\u01f9\7/\2\2\u01f9\u01fa\7/\2\2\u01fa\u01fb"+
		"\7]\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\5o8\2\u01fd\u01fe\7_\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\bD\2\2\u0200\u0088\3\2\2\2\u0201\u0202\7/\2"+
		"\2\u0202\u0203\7/\2\2\u0203\u0221\3\2\2\2\u0204\u0222\3\2\2\2\u0205\u0209"+
		"\7]\2\2\u0206\u0208\7?\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0222\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u0210\7]\2\2\u020d\u020f\7?\2\2\u020e\u020d\3\2\2\2\u020f\u0212"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0217\n\17\2\2\u0214\u0216\n\20\2\2\u0215\u0214\3"+
		"\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0222\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021e\n\21\2\2\u021b\u021d\n"+
		"\20\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0204\3\2"+
		"\2\2\u0221\u0205\3\2\2\2\u0221\u020c\3\2\2\2\u0221\u021a\3\2\2\2\u0222"+
		"\u0226\3\2\2\2\u0223\u0224\7\17\2\2\u0224\u0227\7\f\2\2\u0225\u0227\t"+
		"\22\2\2\u0226\u0223\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\bE\2\2\u0229\u008a\3\2\2\2\u022a\u022c\t\23\2\2\u022b\u022a\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\bF\3\2\u0230\u008c\3\2\2\2\u0231\u0232\7%\2"+
		"\2\u0232\u0236\7#\2\2\u0233\u0235\n\20\2\2\u0234\u0233\3\2\2\2\u0235\u0238"+
		"\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023a\bG\2\2\u023a\u008e\3\2\2\2*\2\u0141\u0148\u014e"+
		"\u0150\u0158\u015a\u016b\u016f\u0174\u017b\u0180\u0186\u018a\u0190\u0193"+
		"\u0198\u019c\u01a3\u01a9\u01ad\u01b5\u01b8\u01bf\u01c3\u01c7\u01cc\u01d0"+
		"\u01d5\u01db\u01e0\u01ed\u0209\u0210\u0217\u021e\u0221\u0226\u022d\u0236"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}