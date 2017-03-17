package com.paypal.digraph.parser.antlr;

// Generated from DOT.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DOTParser}.
 */
public interface DOTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(@NotNull DOTParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(@NotNull DOTParser.PortContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeop(@NotNull DOTParser.EdgeopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeop(@NotNull DOTParser.EdgeopContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull DOTParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull DOTParser.Stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull DOTParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull DOTParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(@NotNull DOTParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(@NotNull DOTParser.Node_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DOTParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DOTParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void enterSubgraph(@NotNull DOTParser.SubgraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void exitSubgraph(@NotNull DOTParser.SubgraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull DOTParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull DOTParser.GraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void enterA_list(@NotNull DOTParser.A_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void exitA_list(@NotNull DOTParser.A_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(@NotNull DOTParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(@NotNull DOTParser.Attr_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);
}