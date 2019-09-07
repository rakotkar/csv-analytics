package com.example.csvanalytics.model;

public class Greeting {

	
	int id;
	
	String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Greeting(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	
}
