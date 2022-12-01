package com.WorkFusion.bank;
@SuppressWarnings("serial")

public class InvalidAgeException extends Exception{
	public String message;
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
}
