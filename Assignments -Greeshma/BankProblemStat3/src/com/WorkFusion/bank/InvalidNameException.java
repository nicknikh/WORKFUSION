package com.WorkFusion.bank;

@SuppressWarnings("serial")
public class InvalidNameException extends Exception{
	public String message;

	public String getMessage() {
		return message;
	}
	public InvalidNameException(String message) {
		this.message =message;
	}
}
