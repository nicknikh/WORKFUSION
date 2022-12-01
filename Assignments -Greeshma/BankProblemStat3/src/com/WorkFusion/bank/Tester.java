package com.WorkFusion.bank;

public class Tester {

	public static void main(String[] args) {
		Applicant a = new Applicant();
		a.setAge(25);
		a.setJobProfile("Clerk");
		a.setName(null);
		
		Validator v = new Validator();
		v.validate(a);
		
	}

}
