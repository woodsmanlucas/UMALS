// Generated from C:\Users\Declan Easton\Documents\Development\UMALS\Umals\src\u005Cumals\recognizer\UMALS.g4 by ANTLR 4.4
package umals.recognizer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UMALSParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'while'", "'..'", "'::'", "'='", "'^'", "'for'", 
		"'('", "'do'", "','", "'repeat'", "'false'", "'>='", "'<'", "']'", "'#'", 
		"'function'", "'+'", "'then'", "'/'", "'elseif'", "'true'", "'return'", 
		"';'", "'}'", "'goto'", "'if'", "'<='", "'break'", "'local'", "'*'", "'.'", 
		"'...'", "':'", "'['", "'=='", "'~='", "'>'", "'or'", "'until'", "'%'", 
		"'in'", "'else'", "'end'", "')'", "'and'", "'nil'", "'not'", "'-'", "NAME", 
		"SERVICENAME", "PLAINBLOCK", "NORMALSTRING", "CHARSTRING", "LONGSTRING", 
		"INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
	};
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_varlist = 5, RULE_namelist = 6, RULE_explist = 7, RULE_exp = 8, RULE_name = 9, 
		RULE_var = 10, RULE_prefixexp = 11, RULE_functioncall = 12, RULE_varOrExp = 13, 
		RULE_nameAndArgs = 14, RULE_varSuffix = 15, RULE_args = 16, RULE_functiondef = 17, 
		RULE_funcbody = 18, RULE_parlist = 19, RULE_tableconstructor = 20, RULE_fieldlist = 21, 
		RULE_field = 22, RULE_fieldsep = 23, RULE_directblock = 24, RULE_plainblock = 25, 
		RULE_operatorOr = 26, RULE_operatorAnd = 27, RULE_operatorComparison = 28, 
		RULE_operatorStrcat = 29, RULE_operatorAddSub = 30, RULE_operatorMulDivMod = 31, 
		RULE_operatorUnary = 32, RULE_operatorPower = 33, RULE_number = 34, RULE_string = 35;
	public static final String[] ruleNames = {
		"chunk", "block", "stat", "retstat", "label", "varlist", "namelist", "explist", 
		"exp", "name", "var", "prefixexp", "functioncall", "varOrExp", "nameAndArgs", 
		"varSuffix", "args", "functiondef", "funcbody", "parlist", "tableconstructor", 
		"fieldlist", "field", "fieldsep", "directblock", "plainblock", "operatorOr", 
		"operatorAnd", "operatorComparison", "operatorStrcat", "operatorAddSub", 
		"operatorMulDivMod", "operatorUnary", "operatorPower", "number", "string"
	};

	@Override
	public String getGrammarFileName() { return "UMALS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UMALSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChunkContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UMALSParser.EOF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); block();
			setState(73); match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75); stat();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(81); retstat();
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

	public static class StatContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); varlist();
				setState(86); match(T__44);
				setState(87); explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91); match(T__20);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92); match(T__23);
				setState(93); name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94); match(T__40);
				setState(95); block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96); match(T__47);
				setState(97); exp(0);
				setState(98); match(T__40);
				setState(99); block();
				setState(100); match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(102); match(T__38);
				setState(103); block();
				setState(104); match(T__9);
				setState(105); exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(107); match(T__22);
				setState(108); exp(0);
				setState(109); match(T__30);
				setState(110); block();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__28) {
					{
					{
					setState(111); match(T__28);
					setState(112); exp(0);
					setState(113); match(T__30);
					setState(114); block();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(121); match(T__6);
					setState(122); block();
					}
				}

				setState(125); match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127); match(T__42);
				setState(128); name();
				setState(129); match(T__44);
				setState(130); exp(0);
				setState(131); match(T__39);
				setState(132); exp(0);
				setState(135);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(133); match(T__39);
					setState(134); exp(0);
					}
				}

				setState(137); match(T__40);
				setState(138); block();
				setState(139); match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(141); match(T__42);
				setState(142); namelist();
				setState(143); match(T__7);
				setState(144); explist();
				setState(145); match(T__40);
				setState(146); block();
				setState(147); match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(149); functiondef();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(150); match(T__19);
				setState(151); namelist();
				setState(154);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(152); match(T__44);
					setState(153); explist();
					}
				}

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

	public static class RetstatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterRetstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitRetstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__26);
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(159); explist();
				}
				break;
			}
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(162); match(T__25);
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

	public static class LabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__45);
			setState(166); name();
			setState(167); match(T__45);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); var();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(170); match(T__39);
				setState(171); var();
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

	public static class NamelistContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitNamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); name();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178); match(T__39);
					setState(179); name();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); exp(0);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(186); match(T__39);
				setState(187); exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			switch (_input.LA(1)) {
			case T__33:
			case T__1:
			case T__0:
				{
				setState(194); operatorUnary();
				setState(195); exp(7);
				}
				break;
			case T__2:
				{
				setState(197); match(T__2);
				}
				break;
			case T__37:
				{
				setState(198); match(T__37);
				}
				break;
			case T__27:
				{
				setState(199); match(T__27);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				setState(200); number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				setState(201); string();
				}
				break;
			case T__16:
				{
				setState(202); match(T__16);
				}
				break;
			case T__32:
				{
				setState(203); functiondef();
				}
				break;
			case T__41:
			case NAME:
			case SERVICENAME:
				{
				setState(204); prefixexp();
				}
				break;
			case T__48:
				{
				setState(205); tableconstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(209); operatorPower();
						setState(210); exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(213); operatorMulDivMod();
						setState(214); exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(216);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(217); operatorAddSub();
						setState(218); exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(220);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(221); operatorStrcat();
						setState(222); exp(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225); operatorComparison();
						setState(226); exp(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229); operatorAnd();
						setState(230); exp(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(232);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(233); operatorOr();
						setState(234); exp(2);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode SERVICENAME() { return getToken(UMALSParser.SERVICENAME, 0); }
		public TerminalNode NAME() { return getToken(UMALSParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if (_la==SERVICENAME) {
				{
				setState(241); match(SERVICENAME);
				}
			}

			setState(244); match(NAME);
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

	public static class VarContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			switch (_input.LA(1)) {
			case NAME:
			case SERVICENAME:
				{
				setState(246); name();
				}
				break;
			case T__41:
				{
				setState(247); match(T__41);
				setState(248); exp(0);
				setState(249); match(T__4);
				setState(250); varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254); varSuffix();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitPrefixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); varOrExp();
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261); nameAndArgs();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); varOrExp();
			setState(269); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(268); nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarOrExpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitVarOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varOrExp);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(T__41);
				setState(275); exp(0);
				setState(276); match(T__4);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterNameAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitNameAndArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(280); match(T__15);
				setState(281); name();
				}
			}

			setState(284); args();
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__41) | (1L << T__15) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) {
				{
				{
				setState(286); nameAndArgs();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(292); match(T__14);
				setState(293); exp(0);
				setState(294); match(T__34);
				}
				break;
			case T__17:
				{
				setState(296); match(T__17);
				setState(297); name();
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

	public static class ArgsContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(307);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); match(T__41);
				setState(302);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__41) | (1L << T__37) | (1L << T__33) | (1L << T__32) | (1L << T__27) | (1L << T__16) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NAME) | (1L << SERVICENAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
					{
					setState(301); explist();
					}
				}

				setState(304); match(T__4);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); string();
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

	public static class FunctiondefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitFunctiondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(T__32);
			setState(310); name();
			setState(311); funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(T__41);
			setState(315);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << NAME) | (1L << SERVICENAME))) != 0)) {
				{
				setState(314); parlist();
				}
			}

			setState(317); match(T__4);
			setState(318); block();
			setState(319); match(T__5);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitParlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parlist);
		int _la;
		try {
			setState(327);
			switch (_input.LA(1)) {
			case NAME:
			case SERVICENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(321); namelist();
				setState(324);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(322); match(T__39);
					setState(323); match(T__16);
					}
				}

				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); match(T__16);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitTableconstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(T__48);
			setState(331);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__41) | (1L << T__37) | (1L << T__33) | (1L << T__32) | (1L << T__27) | (1L << T__16) | (1L << T__14) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NAME) | (1L << SERVICENAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
				{
				setState(330); fieldlist();
				}
			}

			setState(333); match(T__24);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitFieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335); field();
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(336); fieldsep();
					setState(337); field();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(345);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__25) {
				{
				setState(344); fieldsep();
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field);
		try {
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); match(T__14);
				setState(348); exp(0);
				setState(349); match(T__34);
				setState(350); match(T__44);
				setState(351); exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); name();
				setState(354); match(T__44);
				setState(355); exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); exp(0);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitFieldsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class DirectblockContext extends ParserRuleContext {
		public TerminalNode SERVICENAME() { return getToken(UMALSParser.SERVICENAME, 0); }
		public TerminalNode PLAINBLOCK() { return getToken(UMALSParser.PLAINBLOCK, 0); }
		public DirectblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterDirectblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitDirectblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitDirectblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectblockContext directblock() throws RecognitionException {
		DirectblockContext _localctx = new DirectblockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_directblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); match(SERVICENAME);
			setState(363); match(PLAINBLOCK);
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

	public static class PlainblockContext extends ParserRuleContext {
		public TerminalNode PLAINBLOCK() { return getToken(UMALSParser.PLAINBLOCK, 0); }
		public PlainblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterPlainblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitPlainblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitPlainblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainblockContext plainblock() throws RecognitionException {
		PlainblockContext _localctx = new PlainblockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_plainblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(PLAINBLOCK);
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

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(T__10);
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

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(T__3);
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

	public static class OperatorComparisonContext extends ParserRuleContext {
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__21) | (1L << T__13) | (1L << T__12) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperatorStrcatContext extends ParserRuleContext {
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorStrcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorStrcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(T__46);
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

	public static class OperatorAddSubContext extends ParserRuleContext {
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperatorMulDivModContext extends ParserRuleContext {
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__18) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperatorUnaryContext extends ParserRuleContext {
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperatorPowerContext extends ParserRuleContext {
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterOperatorPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitOperatorPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(T__43);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(UMALSParser.HEX, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(UMALSParser.HEX_FLOAT, 0); }
		public TerminalNode INT() { return getToken(UMALSParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(UMALSParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode LONGSTRING() { return getToken(UMALSParser.LONGSTRING, 0); }
		public TerminalNode NORMALSTRING() { return getToken(UMALSParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(UMALSParser.CHARSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UMALSListener ) ((UMALSListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UMALSVisitor ) return ((UMALSVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 8: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0186\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\7\3O\n\3\f\3\16\3R\13\3"+
		"\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4w\n\4\f\4\16\4z\13\4\3\4\3\4\5\4~\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u008a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009d\n\4\5\4\u009f\n\4\3\5\3\5\5\5\u00a3"+
		"\n\5\3\5\5\5\u00a6\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16"+
		"\7\u00b2\13\7\3\b\3\b\3\b\7\b\u00b7\n\b\f\b\16\b\u00ba\13\b\3\t\3\t\3"+
		"\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00d1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00ef\n\n\f\n\16\n\u00f2\13\n\3\13\5\13\u00f5\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ff\n\f\3\f\7\f\u0102\n\f\f\f\16\f\u0105"+
		"\13\f\3\r\3\r\7\r\u0109\n\r\f\r\16\r\u010c\13\r\3\16\3\16\6\16\u0110\n"+
		"\16\r\16\16\16\u0111\3\17\3\17\3\17\3\17\3\17\5\17\u0119\n\17\3\20\3\20"+
		"\5\20\u011d\n\20\3\20\3\20\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012d\n\21\3\22\3\22\5\22\u0131\n"+
		"\22\3\22\3\22\3\22\5\22\u0136\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u013e\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0147\n\25\3\25\5"+
		"\25\u014a\n\25\3\26\3\26\5\26\u014e\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u0156\n\27\f\27\16\27\u0159\13\27\3\27\5\27\u015c\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0169\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\2\3\22&\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t\4\2\f\f\32\32\5\2\17\20"+
		"\36\36&(\4\2\24\24\63\63\5\2\26\26!!++\4\2\22\22\62\63\3\2:=\3\2\679\u019d"+
		"\2J\3\2\2\2\4P\3\2\2\2\6\u009e\3\2\2\2\b\u00a0\3\2\2\2\n\u00a7\3\2\2\2"+
		"\f\u00ab\3\2\2\2\16\u00b3\3\2\2\2\20\u00bb\3\2\2\2\22\u00d0\3\2\2\2\24"+
		"\u00f4\3\2\2\2\26\u00fe\3\2\2\2\30\u0106\3\2\2\2\32\u010d\3\2\2\2\34\u0118"+
		"\3\2\2\2\36\u011c\3\2\2\2 \u0123\3\2\2\2\"\u0135\3\2\2\2$\u0137\3\2\2"+
		"\2&\u013b\3\2\2\2(\u0149\3\2\2\2*\u014b\3\2\2\2,\u0151\3\2\2\2.\u0168"+
		"\3\2\2\2\60\u016a\3\2\2\2\62\u016c\3\2\2\2\64\u016f\3\2\2\2\66\u0171\3"+
		"\2\2\28\u0173\3\2\2\2:\u0175\3\2\2\2<\u0177\3\2\2\2>\u0179\3\2\2\2@\u017b"+
		"\3\2\2\2B\u017d\3\2\2\2D\u017f\3\2\2\2F\u0181\3\2\2\2H\u0183\3\2\2\2J"+
		"K\5\4\3\2KL\7\2\2\3L\3\3\2\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2"+
		"PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\5\b\5\2TS\3\2\2\2TU\3\2\2\2U\5\3\2\2"+
		"\2V\u009f\7\32\2\2WX\5\f\7\2XY\7\7\2\2YZ\5\20\t\2Z\u009f\3\2\2\2[\u009f"+
		"\5\32\16\2\\\u009f\5\n\6\2]\u009f\7\37\2\2^_\7\34\2\2_\u009f\5\24\13\2"+
		"`a\7\13\2\2a\u009f\5\4\3\2bc\7\4\2\2cd\5\22\n\2de\7\13\2\2ef\5\4\3\2f"+
		"g\7.\2\2g\u009f\3\2\2\2hi\7\r\2\2ij\5\4\3\2jk\7*\2\2kl\5\22\n\2l\u009f"+
		"\3\2\2\2mn\7\35\2\2no\5\22\n\2op\7\25\2\2px\5\4\3\2qr\7\27\2\2rs\5\22"+
		"\n\2st\7\25\2\2tu\5\4\3\2uw\3\2\2\2vq\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y}\3\2\2\2zx\3\2\2\2{|\7-\2\2|~\5\4\3\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7.\2\2\u0080\u009f\3\2\2\2\u0081\u0082\7\t\2\2\u0082"+
		"\u0083\5\24\13\2\u0083\u0084\7\7\2\2\u0084\u0085\5\22\n\2\u0085\u0086"+
		"\7\f\2\2\u0086\u0089\5\22\n\2\u0087\u0088\7\f\2\2\u0088\u008a\5\22\n\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7\13\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7.\2\2\u008e\u009f\3\2\2\2\u008f"+
		"\u0090\7\t\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7,\2\2\u0092\u0093\5\20"+
		"\t\2\u0093\u0094\7\13\2\2\u0094\u0095\5\4\3\2\u0095\u0096\7.\2\2\u0096"+
		"\u009f\3\2\2\2\u0097\u009f\5$\23\2\u0098\u0099\7 \2\2\u0099\u009c\5\16"+
		"\b\2\u009a\u009b\7\7\2\2\u009b\u009d\5\20\t\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009eV\3\2\2\2\u009eW\3\2\2\2\u009e"+
		"[\3\2\2\2\u009e\\\3\2\2\2\u009e]\3\2\2\2\u009e^\3\2\2\2\u009e`\3\2\2\2"+
		"\u009eb\3\2\2\2\u009eh\3\2\2\2\u009em\3\2\2\2\u009e\u0081\3\2\2\2\u009e"+
		"\u008f\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u0098\3\2\2\2\u009f\7\3\2\2\2"+
		"\u00a0\u00a2\7\31\2\2\u00a1\u00a3\5\20\t\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\7\32\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\t\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5"+
		"\24\13\2\u00a9\u00aa\7\6\2\2\u00aa\13\3\2\2\2\u00ab\u00b0\5\26\f\2\u00ac"+
		"\u00ad\7\f\2\2\u00ad\u00af\5\26\f\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b8\5\24\13\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5\24\13"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\17\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c0\5\22\n\2\u00bc"+
		"\u00bd\7\f\2\2\u00bd\u00bf\5\22\n\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\21\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00c5\5B\"\2\u00c5\u00c6\5\22"+
		"\n\t\u00c6\u00d1\3\2\2\2\u00c7\u00d1\7\61\2\2\u00c8\u00d1\7\16\2\2\u00c9"+
		"\u00d1\7\30\2\2\u00ca\u00d1\5F$\2\u00cb\u00d1\5H%\2\u00cc\u00d1\7#\2\2"+
		"\u00cd\u00d1\5$\23\2\u00ce\u00d1\5\30\r\2\u00cf\u00d1\5*\26\2\u00d0\u00c3"+
		"\3\2\2\2\u00d0\u00c7\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0"+
		"\u00ca\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00f0\3\2\2\2\u00d2"+
		"\u00d3\f\n\2\2\u00d3\u00d4\5D#\2\u00d4\u00d5\5\22\n\n\u00d5\u00ef\3\2"+
		"\2\2\u00d6\u00d7\f\b\2\2\u00d7\u00d8\5@!\2\u00d8\u00d9\5\22\n\t\u00d9"+
		"\u00ef\3\2\2\2\u00da\u00db\f\7\2\2\u00db\u00dc\5> \2\u00dc\u00dd\5\22"+
		"\n\b\u00dd\u00ef\3\2\2\2\u00de\u00df\f\6\2\2\u00df\u00e0\5<\37\2\u00e0"+
		"\u00e1\5\22\n\6\u00e1\u00ef\3\2\2\2\u00e2\u00e3\f\5\2\2\u00e3\u00e4\5"+
		":\36\2\u00e4\u00e5\5\22\n\6\u00e5\u00ef\3\2\2\2\u00e6\u00e7\f\4\2\2\u00e7"+
		"\u00e8\58\35\2\u00e8\u00e9\5\22\n\5\u00e9\u00ef\3\2\2\2\u00ea\u00eb\f"+
		"\3\2\2\u00eb\u00ec\5\66\34\2\u00ec\u00ed\5\22\n\4\u00ed\u00ef\3\2\2\2"+
		"\u00ee\u00d2\3\2\2\2\u00ee\u00d6\3\2\2\2\u00ee\u00da\3\2\2\2\u00ee\u00de"+
		"\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\23\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\7\65\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\64\2\2\u00f7\25\3\2\2"+
		"\2\u00f8\u00ff\5\24\13\2\u00f9\u00fa\7\n\2\2\u00fa\u00fb\5\22\n\2\u00fb"+
		"\u00fc\7/\2\2\u00fc\u00fd\5 \21\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\5 \21\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\27\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010a\5\34\17\2\u0107"+
		"\u0109\5\36\20\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\31\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\5\34\17\2\u010e\u0110\5\36\20\2\u010f\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\33\3\2\2\2\u0113"+
		"\u0119\5\26\f\2\u0114\u0115\7\n\2\2\u0115\u0116\5\22\n\2\u0116\u0117\7"+
		"/\2\2\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0119"+
		"\35\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011d\5\24\13\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5\"\22\2\u011f"+
		"\37\3\2\2\2\u0120\u0122\5\36\20\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012c\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\7%\2\2\u0127\u0128\5\22\n\2\u0128\u0129\7\21"+
		"\2\2\u0129\u012d\3\2\2\2\u012a\u012b\7\"\2\2\u012b\u012d\5\24\13\2\u012c"+
		"\u0126\3\2\2\2\u012c\u012a\3\2\2\2\u012d!\3\2\2\2\u012e\u0130\7\n\2\2"+
		"\u012f\u0131\5\20\t\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0136\7/\2\2\u0133\u0136\5*\26\2\u0134\u0136\5H%\2\u0135"+
		"\u012e\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136#\3\2\2\2"+
		"\u0137\u0138\7\23\2\2\u0138\u0139\5\24\13\2\u0139\u013a\5&\24\2\u013a"+
		"%\3\2\2\2\u013b\u013d\7\n\2\2\u013c\u013e\5(\25\2\u013d\u013c\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7/\2\2\u0140\u0141"+
		"\5\4\3\2\u0141\u0142\7.\2\2\u0142\'\3\2\2\2\u0143\u0146\5\16\b\2\u0144"+
		"\u0145\7\f\2\2\u0145\u0147\7#\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u014a\7#\2\2\u0149\u0143\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a)\3\2\2\2\u014b\u014d\7\3\2\2\u014c\u014e\5,\27\2"+
		"\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\7\33\2\2\u0150+\3\2\2\2\u0151\u0157\5.\30\2\u0152\u0153\5\60\31\2\u0153"+
		"\u0154\5.\30\2\u0154\u0156\3\2\2\2\u0155\u0152\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\5\60\31\2\u015b\u015a\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c-\3\2\2\2\u015d\u015e\7%\2\2\u015e\u015f\5\22\n\2\u015f\u0160"+
		"\7\21\2\2\u0160\u0161\7\7\2\2\u0161\u0162\5\22\n\2\u0162\u0169\3\2\2\2"+
		"\u0163\u0164\5\24\13\2\u0164\u0165\7\7\2\2\u0165\u0166\5\22\n\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0169\5\22\n\2\u0168\u015d\3\2\2\2\u0168\u0163\3"+
		"\2\2\2\u0168\u0167\3\2\2\2\u0169/\3\2\2\2\u016a\u016b\t\2\2\2\u016b\61"+
		"\3\2\2\2\u016c\u016d\7\65\2\2\u016d\u016e\7\66\2\2\u016e\63\3\2\2\2\u016f"+
		"\u0170\7\66\2\2\u0170\65\3\2\2\2\u0171\u0172\7)\2\2\u0172\67\3\2\2\2\u0173"+
		"\u0174\7\60\2\2\u01749\3\2\2\2\u0175\u0176\t\3\2\2\u0176;\3\2\2\2\u0177"+
		"\u0178\7\5\2\2\u0178=\3\2\2\2\u0179\u017a\t\4\2\2\u017a?\3\2\2\2\u017b"+
		"\u017c\t\5\2\2\u017cA\3\2\2\2\u017d\u017e\t\6\2\2\u017eC\3\2\2\2\u017f"+
		"\u0180\7\b\2\2\u0180E\3\2\2\2\u0181\u0182\t\7\2\2\u0182G\3\2\2\2\u0183"+
		"\u0184\t\b\2\2\u0184I\3\2\2\2#PTx}\u0089\u009c\u009e\u00a2\u00a5\u00b0"+
		"\u00b8\u00c0\u00d0\u00ee\u00f0\u00f4\u00fe\u0103\u010a\u0111\u0118\u011c"+
		"\u0123\u012c\u0130\u0135\u013d\u0146\u0149\u014d\u0157\u015b\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}