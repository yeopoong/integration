package com.example.message;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 3447561188139907872L;

	private Header header;

	private Body body;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Message [header=" + header + ", body=" + body + "]";
	}
}
