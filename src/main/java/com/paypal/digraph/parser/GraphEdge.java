package com.paypal.digraph.parser;

public class GraphEdge extends GraphElement
{
	public GraphEdge(String id, GraphNode node1, GraphNode node2) {
		super(id);
		mNode1 = node1;
		mNode2 = node2;
	}

	public GraphNode getNode1() {
		return mNode1;
	}

	public GraphNode getNode2() {
		return mNode2;
	}

	protected GraphNode mNode1;
	protected GraphNode mNode2;
}
