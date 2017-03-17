package com.paypal.digraph.parser;

import java.util.HashMap;
import java.util.Map;

public class GraphElement
{
	public GraphElement(String id) {
		mId = id;
	}

	public void setAttribute(String key, Object value) {
		mAttrs.put(key, value);
	}

	public void setAttributes(Map<String,Object> attrs) {
		mAttrs.putAll(attrs);
	}

	public String getId() {
		return mId;
	}

	public Object getAttribute(String key) {
		return mAttrs.get(key);
	}

	public Map<String,Object> getAttributes() {
		return mAttrs;
	}

	public String toString() {
		return getClass().getSimpleName() + "-" + mId + mAttrs;
	}

	protected String mId;
	protected Map<String,Object> mAttrs = new HashMap<String,Object>();
}
