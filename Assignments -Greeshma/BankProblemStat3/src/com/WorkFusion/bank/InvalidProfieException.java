package com.WorkFusion.bank;

@SuppressWarnings("serial")
class InvalidProfieException extends Exception {
	String message;
	
	public String getMessage() {
		return message;
	}

	 public InvalidProfieException(String message) {
		this.message = message;
	}

	
	
}
