// Generated from C:\Users\Declan Easton\Documents\Development\UMALS\Umals\src\u005Cumals\recognizer\UMALS.g4 by ANTLR 4.4
package umals.recognizer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UMALSParser}.
 */
public interface UMALSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void enterOperatorUnary(@NotNull UMALSParser.OperatorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorUnary}.
	 * @param ctx the parse tree
	 */
	void exitOperatorUnary(@NotNull UMALSParser.OperatorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAnd(@NotNull UMALSParser.OperatorAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorAnd}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAnd(@NotNull UMALSParser.OperatorAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(@NotNull UMALSParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(@NotNull UMALSParser.FieldsepContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull UMALSParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull UMALSParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(@NotNull UMALSParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(@NotNull UMALSParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(@NotNull UMALSParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(@NotNull UMALSParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(@NotNull UMALSParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(@NotNull UMALSParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(@NotNull UMALSParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(@NotNull UMALSParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#retstat}.
	 * @param ctx the parse tree
	 */
	void enterRetstat(@NotNull UMALSParser.RetstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#retstat}.
	 * @param ctx the parse tree
	 */
	void exitRetstat(@NotNull UMALSParser.RetstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(@NotNull UMALSParser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(@NotNull UMALSParser.VarOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#plainblock}.
	 * @param ctx the parse tree
	 */
	void enterPlainblock(@NotNull UMALSParser.PlainblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#plainblock}.
	 * @param ctx the parse tree
	 */
	void exitPlainblock(@NotNull UMALSParser.PlainblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull UMALSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull UMALSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(@NotNull UMALSParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(@NotNull UMALSParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void enterNameAndArgs(@NotNull UMALSParser.NameAndArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void exitNameAndArgs(@NotNull UMALSParser.NameAndArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(@NotNull UMALSParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(@NotNull UMALSParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(@NotNull UMALSParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(@NotNull UMALSParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull UMALSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull UMALSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void enterOperatorComparison(@NotNull UMALSParser.OperatorComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorComparison}.
	 * @param ctx the parse tree
	 */
	void exitOperatorComparison(@NotNull UMALSParser.OperatorComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(@NotNull UMALSParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(@NotNull UMALSParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull UMALSParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull UMALSParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#directblock}.
	 * @param ctx the parse tree
	 */
	void enterDirectblock(@NotNull UMALSParser.DirectblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#directblock}.
	 * @param ctx the parse tree
	 */
	void exitDirectblock(@NotNull UMALSParser.DirectblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(@NotNull UMALSParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(@NotNull UMALSParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull UMALSParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull UMALSParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void enterOperatorPower(@NotNull UMALSParser.OperatorPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorPower}.
	 * @param ctx the parse tree
	 */
	void exitOperatorPower(@NotNull UMALSParser.OperatorPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOr(@NotNull UMALSParser.OperatorOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorOr}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOr(@NotNull UMALSParser.OperatorOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull UMALSParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull UMALSParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAddSub(@NotNull UMALSParser.OperatorAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorAddSub}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAddSub(@NotNull UMALSParser.OperatorAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterOperatorMulDivMod(@NotNull UMALSParser.OperatorMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitOperatorMulDivMod(@NotNull UMALSParser.OperatorMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull UMALSParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull UMALSParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(@NotNull UMALSParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(@NotNull UMALSParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void enterOperatorStrcat(@NotNull UMALSParser.OperatorStrcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#operatorStrcat}.
	 * @param ctx the parse tree
	 */
	void exitOperatorStrcat(@NotNull UMALSParser.OperatorStrcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull UMALSParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull UMALSParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull UMALSParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull UMALSParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull UMALSParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull UMALSParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(@NotNull UMALSParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(@NotNull UMALSParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link UMALSParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(@NotNull UMALSParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UMALSParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(@NotNull UMALSParser.TableconstructorContext ctx);
}