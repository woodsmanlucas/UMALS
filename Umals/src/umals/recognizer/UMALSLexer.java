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
		T__3=46, T__2=47, T__1=48, T__0=49, NAME=50, SERVICENAME=51, PLAINBLOCK=52, 
		NORMALSTRING=53, CHARSTRING=54, LONGSTRING=55, INT=56, HEX=57, FLOAT=58, 
		HEX_FLOAT=59, COMMENT=60, LINE_COMMENT=61, WS=62, SHEBANG=63;
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
		"'<'", "'='", "'>'", "'?'"
	};
	public static final String[] ruleNames = {
		"T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", 
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"NAME", "SERVICENAME", "PLAINBLOCK", "NORMALSTRING", "CHARSTRING", "LONGSTRING", 
		"NESTED_STR", "INT", "HEX", "FLOAT", "HEX_FLOAT", "ExponentPart", "HexExponentPart", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u0264\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\7\63\u0142\n\63\f\63\16"+
		"\63\u0145\13\63\3\64\3\64\7\64\u0149\n\64\f\64\16\64\u014c\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u0154\n\65\f\65\16\65\u0157\13\65\3\65"+
		"\3\65\7\65\u015b\n\65\f\65\16\65\u015e\13\65\3\65\3\65\7\65\u0162\n\65"+
		"\f\65\16\65\u0165\13\65\3\65\3\65\7\65\u0169\n\65\f\65\16\65\u016c\13"+
		"\65\5\65\u016e\n\65\3\65\3\65\3\65\5\65\u0173\n\65\3\66\3\66\3\66\7\66"+
		"\u0178\n\66\f\66\16\66\u017b\13\66\3\66\3\66\3\67\3\67\3\67\7\67\u0182"+
		"\n\67\f\67\16\67\u0185\13\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\7"+
		"9\u0193\n9\f9\169\u0196\139\39\59\u0199\n9\3:\6:\u019c\n:\r:\16:\u019d"+
		"\3;\3;\3;\6;\u01a3\n;\r;\16;\u01a4\3<\6<\u01a8\n<\r<\16<\u01a9\3<\3<\7"+
		"<\u01ae\n<\f<\16<\u01b1\13<\3<\5<\u01b4\n<\3<\3<\6<\u01b8\n<\r<\16<\u01b9"+
		"\3<\5<\u01bd\n<\3<\6<\u01c0\n<\r<\16<\u01c1\3<\3<\5<\u01c6\n<\3=\3=\3"+
		"=\6=\u01cb\n=\r=\16=\u01cc\3=\3=\7=\u01d1\n=\f=\16=\u01d4\13=\3=\5=\u01d7"+
		"\n=\3=\3=\3=\3=\6=\u01dd\n=\r=\16=\u01de\3=\5=\u01e2\n=\3=\3=\3=\6=\u01e7"+
		"\n=\r=\16=\u01e8\3=\3=\5=\u01ed\n=\3>\3>\5>\u01f1\n>\3>\6>\u01f4\n>\r"+
		">\16>\u01f5\3?\3?\5?\u01fa\n?\3?\6?\u01fd\n?\r?\16?\u01fe\3@\3@\3@\3@"+
		"\5@\u0205\n@\3@\3@\3@\5@\u020a\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A"+
		"\u0217\nA\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F"+
		"\3F\3F\3F\3F\7F\u0231\nF\fF\16F\u0234\13F\3F\3F\7F\u0238\nF\fF\16F\u023b"+
		"\13F\3F\3F\7F\u023f\nF\fF\16F\u0242\13F\3F\3F\7F\u0246\nF\fF\16F\u0249"+
		"\13F\5F\u024b\nF\3F\3F\3F\5F\u0250\nF\3F\3F\3G\6G\u0255\nG\rG\16G\u0256"+
		"\3G\3G\3H\3H\3H\7H\u025e\nH\fH\16H\u0261\13H\3H\3H\3\u0194\2I\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q\2s:u;"+
		"w<y={\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089>\u008b?\u008d@"+
		"\u008fA\3\2\26\3\2c|\6\2\62;C\\aac|\4\2C\\aa\6\2\f\f\17\17??}}\4\2\f\f"+
		"\17\17\5\2\f\f\17\17}}\4\3\f\f\17\17\4\2$$^^\4\2))^^\4\2ZZzz\4\2GGgg\4"+
		"\2--//\4\2RRrr\f\2$$))^^cdhhppttvvxx||\3\2\62\64\3\2\62;\5\2\62;CHch\6"+
		"\2\f\f\17\17??]]\5\2\f\f\17\17]]\5\2\13\f\16\17\"\"\u0291\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2"+
		"\7\u0099\3\2\2\2\t\u009c\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a3"+
		"\3\2\2\2\21\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ac\3\2\2\2\27\u00ae\3"+
		"\2\2\2\31\u00b5\3\2\2\2\33\u00bb\3\2\2\2\35\u00be\3\2\2\2\37\u00c0\3\2"+
		"\2\2!\u00c2\3\2\2\2#\u00c4\3\2\2\2%\u00cd\3\2\2\2\'\u00cf\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00dd\3\2\2\2/\u00e2\3\2\2\2\61\u00e9\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00f2\3\2\2\29\u00f5\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fe\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0113\3\2\2\2M\u0116\3\2"+
		"\2\2O\u0118\3\2\2\2Q\u011b\3\2\2\2S\u0121\3\2\2\2U\u0123\3\2\2\2W\u0126"+
		"\3\2\2\2Y\u012b\3\2\2\2[\u012f\3\2\2\2]\u0131\3\2\2\2_\u0135\3\2\2\2a"+
		"\u0139\3\2\2\2c\u013d\3\2\2\2e\u013f\3\2\2\2g\u0146\3\2\2\2i\u014d\3\2"+
		"\2\2k\u0174\3\2\2\2m\u017e\3\2\2\2o\u0188\3\2\2\2q\u0198\3\2\2\2s\u019b"+
		"\3\2\2\2u\u019f\3\2\2\2w\u01c5\3\2\2\2y\u01ec\3\2\2\2{\u01ee\3\2\2\2}"+
		"\u01f7\3\2\2\2\177\u0209\3\2\2\2\u0081\u0216\3\2\2\2\u0083\u0218\3\2\2"+
		"\2\u0085\u021d\3\2\2\2\u0087\u021f\3\2\2\2\u0089\u0221\3\2\2\2\u008b\u022a"+
		"\3\2\2\2\u008d\u0254\3\2\2\2\u008f\u025a\3\2\2\2\u0091\u0092\7}\2\2\u0092"+
		"\4\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7j\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\6\3\2\2\2\u0099\u009a\7\60\2\2"+
		"\u009a\u009b\7\60\2\2\u009b\b\3\2\2\2\u009c\u009d\7<\2\2\u009d\u009e\7"+
		"<\2\2\u009e\n\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7"+
		"`\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\22\3\2\2\2\u00a9\u00aa"+
		"\7f\2\2\u00aa\u00ab\7q\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7.\2\2\u00ad\26"+
		"\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\30\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd\7"+
		"?\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\36\3\2\2\2\u00c0\u00c1"+
		"\7_\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7%\2\2\u00c3\"\3\2\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc$\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7j\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3(\3\2\2\2\u00d4"+
		"\u00d5\7\61\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7n\2\2\u00d8"+
		"\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2"+
		"\u00dc,\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2"+
		"\2\u00e0\u00e1\7g\2\2\u00e1.\3\2\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7"+
		"g\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7=\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7\177\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"\u00f0\7v\2\2\u00f0\u00f1\7q\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7h\2\2\u00f48\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7m\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7n\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7e\2\2\u0101\u0102\7c\2\2\u0102\u0103\7n\2\2"+
		"\u0103>\3\2\2\2\u0104\u0105\7,\2\2\u0105@\3\2\2\2\u0106\u0107\7\60\2\2"+
		"\u0107B\3\2\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\60\2\2\u010a\u010b"+
		"\7\60\2\2\u010bD\3\2\2\2\u010c\u010d\7<\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7]\2\2\u010fH\3\2\2\2\u0110\u0111\7?\2\2\u0111\u0112\7?\2\2\u0112J\3"+
		"\2\2\2\u0113\u0114\7\u0080\2\2\u0114\u0115\7?\2\2\u0115L\3\2\2\2\u0116"+
		"\u0117\7@\2\2\u0117N\3\2\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2\u011a"+
		"P\3\2\2\2\u011b\u011c\7w\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7n\2\2\u0120R\3\2\2\2\u0121\u0122\7\'\2\2\u0122"+
		"T\3\2\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125V\3\2\2\2\u0126\u0127"+
		"\7g\2\2\u0127\u0128\7n\2\2\u0128\u0129\7u\2\2\u0129\u012a\7g\2\2\u012a"+
		"X\3\2\2\2\u012b\u012c\7g\2\2\u012c\u012d\7p\2\2\u012d\u012e\7f\2\2\u012e"+
		"Z\3\2\2\2\u012f\u0130\7+\2\2\u0130\\\3\2\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7f\2\2\u0134^\3\2\2\2\u0135\u0136\7p\2\2\u0136"+
		"\u0137\7k\2\2\u0137\u0138\7n\2\2\u0138`\3\2\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7v\2\2\u013cb\3\2\2\2\u013d\u013e\7/\2\2\u013e"+
		"d\3\2\2\2\u013f\u0143\t\2\2\2\u0140\u0142\t\3\2\2\u0141\u0140\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144f\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0146\u014a\t\4\2\2\u0147\u0149\t\3\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014bh\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7>\2\2\u014e\u014f"+
		"\7/\2\2\u014f\u016d\3\2\2\2\u0150\u016e\3\2\2\2\u0151\u0155\7}\2\2\u0152"+
		"\u0154\7?\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u016e\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015c\7}\2\2\u0159\u015b\7?\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2"+
		"\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0163\n\5\2\2\u0160\u0162\n\6\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u016e\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u016a\n\7\2\2\u0167\u0169\n\6\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0150\3\2\2\2\u016d"+
		"\u0151\3\2\2\2\u016d\u0158\3\2\2\2\u016d\u0166\3\2\2\2\u016e\u0172\3\2"+
		"\2\2\u016f\u0170\7\17\2\2\u0170\u0173\7\f\2\2\u0171\u0173\t\b\2\2\u0172"+
		"\u016f\3\2\2\2\u0172\u0171\3\2\2\2\u0173j\3\2\2\2\u0174\u0179\7$\2\2\u0175"+
		"\u0178\5\177@\2\u0176\u0178\n\t\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3"+
		"\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7$\2\2\u017dl\3\2\2\2\u017e"+
		"\u0183\7)\2\2\u017f\u0182\5\177@\2\u0180\u0182\n\n\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7)"+
		"\2\2\u0187n\3\2\2\2\u0188\u0189\7]\2\2\u0189\u018a\5q9\2\u018a\u018b\7"+
		"_\2\2\u018bp\3\2\2\2\u018c\u018d\7?\2\2\u018d\u018e\5q9\2\u018e\u018f"+
		"\7?\2\2\u018f\u0199\3\2\2\2\u0190\u0194\7]\2\2\u0191\u0193\13\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7_\2\2\u0198"+
		"\u018c\3\2\2\2\u0198\u0190\3\2\2\2\u0199r\3\2\2\2\u019a\u019c\5\u0085"+
		"C\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019et\3\2\2\2\u019f\u01a0\7\62\2\2\u01a0\u01a2\t\13\2"+
		"\2\u01a1\u01a3\5\u0087D\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5v\3\2\2\2\u01a6\u01a8\5\u0085"+
		"C\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01af\7\60\2\2\u01ac\u01ae\5"+
		"\u0085C\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2"+
		"\u01af\u01b0\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4"+
		"\5{>\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01c6\3\2\2\2\u01b5"+
		"\u01b7\7\60\2\2\u01b6\u01b8\5\u0085C\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01bd\5{>\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c6\3\2\2"+
		"\2\u01be\u01c0\5\u0085C\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\5{"+
		">\2\u01c4\u01c6\3\2\2\2\u01c5\u01a7\3\2\2\2\u01c5\u01b5\3\2\2\2\u01c5"+
		"\u01bf\3\2\2\2\u01c6x\3\2\2\2\u01c7\u01c8\7\62\2\2\u01c8\u01ca\t\13\2"+
		"\2\u01c9\u01cb\5\u0087D\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d2\7\60"+
		"\2\2\u01cf\u01d1\5\u0087D\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d5\u01d7\5}?\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01ed"+
		"\3\2\2\2\u01d8\u01d9\7\62\2\2\u01d9\u01da\t\13\2\2\u01da\u01dc\7\60\2"+
		"\2\u01db\u01dd\5\u0087D\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\5}"+
		"?\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01ed\3\2\2\2\u01e3"+
		"\u01e4\7\62\2\2\u01e4\u01e6\t\13\2\2\u01e5\u01e7\5\u0087D\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\5}?\2\u01eb\u01ed\3\2\2\2\u01ec\u01c7\3\2\2"+
		"\2\u01ec\u01d8\3\2\2\2\u01ec\u01e3\3\2\2\2\u01edz\3\2\2\2\u01ee\u01f0"+
		"\t\f\2\2\u01ef\u01f1\t\r\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01f4\5\u0085C\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6|\3\2\2\2\u01f7"+
		"\u01f9\t\16\2\2\u01f8\u01fa\t\r\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3"+
		"\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5\u0085C\2\u01fc\u01fb\3\2\2\2"+
		"\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff~\3"+
		"\2\2\2\u0200\u0201\7^\2\2\u0201\u020a\t\17\2\2\u0202\u0204\7^\2\2\u0203"+
		"\u0205\7\17\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3"+
		"\2\2\2\u0206\u020a\7\f\2\2\u0207\u020a\5\u0081A\2\u0208\u020a\5\u0083"+
		"B\2\u0209\u0200\3\2\2\2\u0209\u0202\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u0208\3\2\2\2\u020a\u0080\3\2\2\2\u020b\u020c\7^\2\2\u020c\u0217\5\u0085"+
		"C\2\u020d\u020e\7^\2\2\u020e\u020f\5\u0085C\2\u020f\u0210\5\u0085C\2\u0210"+
		"\u0217\3\2\2\2\u0211\u0212\7^\2\2\u0212\u0213\t\20\2\2\u0213\u0214\5\u0085"+
		"C\2\u0214\u0215\5\u0085C\2\u0215\u0217\3\2\2\2\u0216\u020b\3\2\2\2\u0216"+
		"\u020d\3\2\2\2\u0216\u0211\3\2\2\2\u0217\u0082\3\2\2\2\u0218\u0219\7^"+
		"\2\2\u0219\u021a\7z\2\2\u021a\u021b\5\u0087D\2\u021b\u021c\5\u0087D\2"+
		"\u021c\u0084\3\2\2\2\u021d\u021e\t\21\2\2\u021e\u0086\3\2\2\2\u021f\u0220"+
		"\t\22\2\2\u0220\u0088\3\2\2\2\u0221\u0222\7/\2\2\u0222\u0223\7/\2\2\u0223"+
		"\u0224\7]\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5q9\2\u0226\u0227\7_\2\2"+
		"\u0227\u0228\3\2\2\2\u0228\u0229\bE\2\2\u0229\u008a\3\2\2\2\u022a\u022b"+
		"\7/\2\2\u022b\u022c\7/\2\2\u022c\u024a\3\2\2\2\u022d\u024b\3\2\2\2\u022e"+
		"\u0232\7]\2\2\u022f\u0231\7?\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2"+
		"\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u024b\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0235\u0239\7]\2\2\u0236\u0238\7?\2\2\u0237\u0236\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u0240\n\23\2\2\u023d\u023f\n\6\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u024b\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0247\n\24\2\2\u0244"+
		"\u0246\n\6\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u022d\3\2\2\2\u024a\u022e\3\2\2\2\u024a\u0235\3\2\2\2\u024a\u0243\3\2"+
		"\2\2\u024b\u024f\3\2\2\2\u024c\u024d\7\17\2\2\u024d\u0250\7\f\2\2\u024e"+
		"\u0250\t\b\2\2\u024f\u024c\3\2\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\bF\2\2\u0252\u008c\3\2\2\2\u0253\u0255\t\25\2\2\u0254"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u0259\bG\3\2\u0259\u008e\3\2\2\2\u025a"+
		"\u025b\7%\2\2\u025b\u025f\7#\2\2\u025c\u025e\n\6\2\2\u025d\u025c\3\2\2"+
		"\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\bH\2\2\u0263\u0090\3\2\2\2\60"+
		"\2\u0143\u014a\u0155\u015c\u0163\u016a\u016d\u0172\u0177\u0179\u0181\u0183"+
		"\u0194\u0198\u019d\u01a4\u01a9\u01af\u01b3\u01b9\u01bc\u01c1\u01c5\u01cc"+
		"\u01d2\u01d6\u01de\u01e1\u01e8\u01ec\u01f0\u01f5\u01f9\u01fe\u0204\u0209"+
		"\u0216\u0232\u0239\u0240\u0247\u024a\u024f\u0256\u025f\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}