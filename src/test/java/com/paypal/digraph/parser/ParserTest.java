package com.paypal.digraph.parser;

import java.io.FileInputStream;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;

import com.paypal.digraph.parser.antlr.DOTBaseListener;
import com.paypal.digraph.parser.antlr.DOTLexer;
import com.paypal.digraph.parser.antlr.DOTParser;

public class ParserTest
{
	@Test
	public void testGraphParserUsage() {
		log("--- testGraphParserUsage ---");
		
		try {
			GraphParser parser = new GraphParser(new FileInputStream("src/test/resources/test1.dg"));
			Map<String, GraphNode> nodes = parser.getNodes();
			Map<String, GraphEdge> edges = parser.getEdges();	
			
			log("--- nodes:");
			for (GraphNode node : nodes.values()) {
				log(node.getId() + " " + node.getAttributes());
			}
			
			log("--- edges:");
			for (GraphEdge edge : edges.values()) {
				log(edge.getNode1().getId() + "->" + edge.getNode2().getId() + " " + edge.getAttributes());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
	}

	@Test
	public void testGraphParser() {
		log("--- testGraphParser ---");
		
		try {
			String fname = "src/test/resources/test1.dg";
			log("--- " + fname);
			
			GraphParser parser = new GraphParser(new FileInputStream(fname));
			log(parser.getNodes());
			log(parser.getEdges());
			
			String nodeStr = "{a=GraphNode-a{}, b=GraphNode-b{}, bar=GraphNode-bar{kk=vv, kkk=vvv}, baz=GraphNode-baz{}, foo=GraphNode-foo{}, n1=GraphNode-n1{label=Node 1}, n2=GraphNode-n2{label=Node 2}, n3=GraphNode-n3{}, n4=GraphNode-n4{}, n5=GraphNode-n5{}, xxx=GraphNode-xxx{k=v}, yyy=GraphNode-yyy{k1=v1, k2=v2}}";
			String edgeStr = "{a-b=GraphEdge-a-b{}, foo-bar=GraphEdge-foo-bar{fbk=fbv, ek=ev}, foo-baz=GraphEdge-foo-baz{ek=ev}, n1-n2=GraphEdge-n1-n2{style=dotted, label=A dotted edge}, n1-n4=GraphEdge-n1-n4{}, n2-n3=GraphEdge-n2-n3{}, n3-n5=GraphEdge-n3-n5{}, n4-n5=GraphEdge-n4-n5{}}";
			
			Assert.assertEquals("testgraph", parser.getGraphId());
			Assert.assertEquals(nodeStr, parser.getNodes().toString());
			Assert.assertEquals(edgeStr, parser.getEdges().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
		
		try {
			String fname = "src/test/resources/test2.dg";
			log("--- " + fname);
			
			GraphParser parser = new GraphParser(new FileInputStream(fname));
			log(parser.getNodes());
			log(parser.getEdges());
			
			String nodeStr = "{01=GraphNode-01{}, 02=GraphNode-02{}, 03=GraphNode-03{}, 04=GraphNode-04{}, 05=GraphNode-05{}, 06=GraphNode-06{}, 07=GraphNode-07{}, 1=GraphNode-1{}, 11=GraphNode-11{}, 12=GraphNode-12{}, 13=GraphNode-13{}, 14=GraphNode-14{}, 15=GraphNode-15{}, 16=GraphNode-16{}, 17=GraphNode-17{}, 2=GraphNode-2{}, 21=GraphNode-21{}, 22=GraphNode-22{}, 23=GraphNode-23{}, 24=GraphNode-24{}, 25=GraphNode-25{}, 26=GraphNode-26{}, 27=GraphNode-27{}, 3=GraphNode-3{}, 4=GraphNode-4{}, a=GraphNode-a{}, a1=GraphNode-a1{}, a2=GraphNode-a2{}, aa=GraphNode-aa{}, b=GraphNode-b{}, b1=GraphNode-b1{}, b2=GraphNode-b2{}, bb=GraphNode-bb{}, c=GraphNode-c{}, c1=GraphNode-c1{}, c2=GraphNode-c2{}, cc=GraphNode-cc{}, d=GraphNode-d{}, d1=GraphNode-d1{}, d2=GraphNode-d2{}, dd=GraphNode-dd{}, e=GraphNode-e{}, ee=GraphNode-ee{}, f=GraphNode-f{}, ff=GraphNode-ff{}, m1=GraphNode-m1{}, m2=GraphNode-m2{}, n1=GraphNode-n1{}, n2=GraphNode-n2{}}";			
			String edgeStr = "{01-02=GraphEdge-01-02{}, 02-03=GraphEdge-02-03{}, 03-04=GraphEdge-03-04{}, 03-05=GraphEdge-03-05{}, 04-06=GraphEdge-04-06{}, 05-06=GraphEdge-05-06{}, 06-07=GraphEdge-06-07{}, 1-2=GraphEdge-1-2{}, 1-3=GraphEdge-1-3{}, 1-4=GraphEdge-1-4{}, 11-12=GraphEdge-11-12{}, 12-13=GraphEdge-12-13{}, 13-14=GraphEdge-13-14{}, 13-15=GraphEdge-13-15{}, 14-15=GraphEdge-14-15{}, 14-16=GraphEdge-14-16{}, 15-16=GraphEdge-15-16{}, 16-17=GraphEdge-16-17{}, 2-3=GraphEdge-2-3{}, 2-4=GraphEdge-2-4{}, 21-22=GraphEdge-21-22{label=test}, 22-23=GraphEdge-22-23{label=test}, 23-24=GraphEdge-23-24{label=test}, 23-25=GraphEdge-23-25{label=test}, 24-25=GraphEdge-24-25{label=xxx}, 24-26=GraphEdge-24-26{label=test}, 25-26=GraphEdge-25-26{label=test}, 26-27=GraphEdge-26-27{label=test}, 3-4=GraphEdge-3-4{}, a-c=GraphEdge-a-c{}, a-d=GraphEdge-a-d{}, a1-b1=GraphEdge-a1-b1{}, a1-c1=GraphEdge-a1-c1{}, a1-m1=GraphEdge-a1-m1{}, a1-n1=GraphEdge-a1-n1{}, a2-b2=GraphEdge-a2-b2{}, a2-c2=GraphEdge-a2-c2{}, a2-m2=GraphEdge-a2-m2{}, a2-n2=GraphEdge-a2-n2{}, aa-cc=GraphEdge-aa-cc{}, aa-dd=GraphEdge-aa-dd{}, aa-ee=GraphEdge-aa-ee{}, aa-ff=GraphEdge-aa-ff{}, b-c=GraphEdge-b-c{}, b-d=GraphEdge-b-d{}, b1-c1=GraphEdge-b1-c1{}, b1-d1=GraphEdge-b1-d1{}, b2-c2=GraphEdge-b2-c2{}, b2-d2=GraphEdge-b2-d2{}, bb-cc=GraphEdge-bb-cc{}, bb-dd=GraphEdge-bb-dd{}, bb-ee=GraphEdge-bb-ee{}, bb-ff=GraphEdge-bb-ff{}, c-e=GraphEdge-c-e{}, c-f=GraphEdge-c-f{}, c1-d1=GraphEdge-c1-d1{}, c1-m1=GraphEdge-c1-m1{}, c1-n1=GraphEdge-c1-n1{}, c2-d2=GraphEdge-c2-d2{}, c2-m2=GraphEdge-c2-m2{}, c2-n2=GraphEdge-c2-n2{}, cc-ee=GraphEdge-cc-ee{}, cc-ff=GraphEdge-cc-ff{}, d-e=GraphEdge-d-e{}, d-f=GraphEdge-d-f{}, dd-ee=GraphEdge-dd-ee{}, dd-ff=GraphEdge-dd-ff{}, m1-d1=GraphEdge-m1-d1{}, m2-d2=GraphEdge-m2-d2{}, m2-n2=GraphEdge-m2-n2{}, n1-d1=GraphEdge-n1-d1{}, n2-d2=GraphEdge-n2-d2{}}";
			
			Assert.assertEquals(nodeStr, parser.getNodes().toString());
			Assert.assertEquals(edgeStr, parser.getEdges().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
		
		try {
			String fname = "src/test/resources/test3.dg";
			log("--- " + fname);
			
			GraphParser parser = new GraphParser(new FileInputStream(fname));
			log(parser.getNodes());
			log(parser.getEdges());
			
			String nodeStr = "{01=GraphNode-01{}, 02=GraphNode-02{}, 03=GraphNode-03{}, 04=GraphNode-04{}, 05=GraphNode-05{}, 06=GraphNode-06{}, 07=GraphNode-07{}, 08=GraphNode-08{}, 11=GraphNode-11{}, 12=GraphNode-12{}, 13=GraphNode-13{}, 15=GraphNode-15{}, 16=GraphNode-16{}, 17=GraphNode-17{}, 18=GraphNode-18{}, 21=GraphNode-21{}, 22=GraphNode-22{}, 23=GraphNode-23{}, 24=GraphNode-24{}, 25=GraphNode-25{}, 26=GraphNode-26{}, 27=GraphNode-27{}}";			
			String edgeStr = "{01-02=GraphEdge-01-02{}, 01-03=GraphEdge-01-03{}, 01-04=GraphEdge-01-04{}, 01-05=GraphEdge-01-05{}, 01-06=GraphEdge-01-06{}, 01-07=GraphEdge-01-07{}, 02-03=GraphEdge-02-03{}, 02-04=GraphEdge-02-04{}, 02-05=GraphEdge-02-05{}, 02-06=GraphEdge-02-06{}, 02-07=GraphEdge-02-07{}, 03-08=GraphEdge-03-08{}, 04-05=GraphEdge-04-05{}, 04-06=GraphEdge-04-06{}, 04-08=GraphEdge-04-08{}, 05-08=GraphEdge-05-08{}, 06-08=GraphEdge-06-08{}, 07-08=GraphEdge-07-08{}, 11-12=GraphEdge-11-12{}, 11-15=GraphEdge-11-15{}, 11-16=GraphEdge-11-16{}, 11-17=GraphEdge-11-17{}, 11-18=GraphEdge-11-18{}, 12-13=GraphEdge-12-13{}, 12-15=GraphEdge-12-15{}, 12-16=GraphEdge-12-16{}, 12-17=GraphEdge-12-17{}, 12-18=GraphEdge-12-18{}, 13-15=GraphEdge-13-15{}, 13-16=GraphEdge-13-16{}, 13-17=GraphEdge-13-17{}, 13-18=GraphEdge-13-18{}, 15-16=GraphEdge-15-16{}, 21-22=GraphEdge-21-22{}, 21-25=GraphEdge-21-25{}, 21-26=GraphEdge-21-26{}, 21-27=GraphEdge-21-27{}, 22-23=GraphEdge-22-23{}, 22-25=GraphEdge-22-25{}, 22-26=GraphEdge-22-26{}, 22-27=GraphEdge-22-27{}, 23-24=GraphEdge-23-24{}, 23-25=GraphEdge-23-25{}, 23-26=GraphEdge-23-26{}, 23-27=GraphEdge-23-27{}, 24-25=GraphEdge-24-25{}, 24-26=GraphEdge-24-26{}, 24-27=GraphEdge-24-27{}, 25-26=GraphEdge-25-26{}, 26-27=GraphEdge-26-27{}}";

			Assert.assertEquals(nodeStr, parser.getNodes().toString());
			Assert.assertEquals(edgeStr, parser.getEdges().toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
	}

	@Test
	public void testAntlrParser() throws Exception {
		log("--- testAntlrParser ---");
		
		try {
			String fname = "src/test/resources/test1.dg";
			log("--- " + fname);
			
			DOTLexer lexer = new DOTLexer(new ANTLRFileStream(fname));
			DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
			parser.setErrorHandler(new BailErrorStrategy());
			ParseTree tree = parser.graph();
			log(tree.toStringTree(parser));
			ParseTreeWalker.DEFAULT.walk(new DOTBaseListener(), tree);
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
		
		try {
			String fname = "src/test/resources/test2.dg";
			log("--- " + fname);
			
			DOTLexer lexer = new DOTLexer(new ANTLRFileStream(fname));
			DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
			parser.setErrorHandler(new BailErrorStrategy());
			ParseTree tree = parser.graph();
			log(tree.toStringTree(parser));
			ParseTreeWalker.DEFAULT.walk(new DOTBaseListener(), tree);
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}
		
		try {
			String fname = "src/test/resources/test3.dg";
			log("--- " + fname);
			
			DOTLexer lexer = new DOTLexer(new ANTLRFileStream(fname));
			DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
			parser.setErrorHandler(new BailErrorStrategy());
			ParseTree tree = parser.graph();
			log(tree.toStringTree(parser));
			ParseTreeWalker.DEFAULT.walk(new DOTBaseListener(), tree);
		}
		catch (Exception e) {
			e.printStackTrace();
			log(e);
		}		
	}

	public static void log(Object o) {
		System.out.println(o);
	}
}
