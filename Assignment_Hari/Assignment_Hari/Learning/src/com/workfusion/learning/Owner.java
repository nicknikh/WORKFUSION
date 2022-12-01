package com.workfusion.learning;

// Protected values can be inherited where private variable can't be inherited from another class


public class Owner extends Employee {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
