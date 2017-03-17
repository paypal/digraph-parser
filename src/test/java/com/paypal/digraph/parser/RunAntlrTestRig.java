package com.paypal.digraph.parser;

import org.antlr.v4.runtime.misc.TestRig;

public class RunAntlrTestRig
{
	public static void main(String[] args) throws Exception {
		String grammarName = "com.paypal.digraph.parser.antlr.DOT";
		String startRuleName = "graph";
		
		String[] testArgs1 = {grammarName, startRuleName, "-tree", "src/test/resources/test3.dg"};
		TestRig.main(testArgs1);
		
		String[] testArgs2 = {grammarName, startRuleName, "-gui", "src/test/resources/test3.dg"};
		TestRig.main(testArgs2);
	}
}
