// Generated from C:\Users\Declan Easton\Documents\Development\UMALS\Umals\src\u005Cumals\recognizer\UMALS.g4 by ANTLR 4.4
package umals.recognizer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UMALSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UMALSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(@NotNull UMALSParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(@NotNull UMALSParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(@NotNull UMALSParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(@NotNull UMALSParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull UMALSParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(@NotNull UMALSParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(@NotNull UMALSParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(@NotNull UMALSParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(@NotNull UMALSParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(@NotNull UMALSParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(@NotNull UMALSParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull UMALSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(@NotNull UMALSParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(@NotNull UMALSParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(@NotNull UMALSParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(@NotNull UMALSParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull UMALSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(@NotNull UMALSParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(@NotNull UMALSParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull UMALSParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(@NotNull UMALSParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull UMALSParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(@NotNull UMALSParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(@NotNull UMALSParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull UMALSParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(@NotNull UMALSParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(@NotNull UMALSParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(@NotNull UMALSParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(@NotNull UMALSParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(@NotNull UMALSParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull UMALSParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(@NotNull UMALSParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull UMALSParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(@NotNull UMALSParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link UMALSParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(@NotNull UMALSParser.TableconstructorContext ctx);
}