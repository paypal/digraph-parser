package com.paypal.digraph.parser;

public class GraphParserException extends RuntimeException
{
	public GraphParserException(String msg) {
		super(msg);
	}

	public GraphParserException(Throwable t) {
		super(t);
	}

	public GraphParserException(String msg, Throwable t) {
		super(msg, t);
	}
}
