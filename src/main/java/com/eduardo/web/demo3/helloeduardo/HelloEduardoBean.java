package com.eduardo.web.demo3.helloeduardo;

public class HelloEduardoBean {
	
	private String message;

	public HelloEduardoBean(String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloEduardoBean [message=" + message + "]";
	}
	
	

}
