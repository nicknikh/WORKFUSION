package com.workfusion.assgn;

import java.util.Scanner;

public class Seller implements Tax {
	Scanner sc=new Scanner(System.in);
	private String location;
	private double taxPercentage;
		Seller(String location, double taxPercentage){
			this.location=location;
			this.taxPercentage=taxPercentage;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public double getTaxPercentage() {
			return taxPercentage;
		}
		public void setTaxPercentage(double taxPercentage) {
			this.taxPercentage = taxPercentage;
		}
		@Override
		public void calTax(double var) {
			// TODO Auto-generated method stub
			System.out.println("Enter the amount");
			double amount = sc.nextDouble();
			double total= amount +(var/100)*amount;
			System.out.println("Total amount is:"+total);
			System.out.println("Tax Percentage is:"+taxPercentage);
		}
}
