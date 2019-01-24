package com.grokonez.spring.websocket.model;

public class Response {
	private String greeting;

	public Response() {
	}

	public Response(String greeting) {
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return this.greeting;
	}
}
