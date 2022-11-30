package com.workfusion.problemstatement3;

public class Tester {

	public static void main(String[] args) {
		Applicant aObj = new Applicant();
		aObj.setAge(22);
		aObj.setJobProfile("associate");
		aObj.setName("Kowshik");
		Validator vObj = new Validator();
		vObj.valdiateApplicant(aObj);
	

	}

}
