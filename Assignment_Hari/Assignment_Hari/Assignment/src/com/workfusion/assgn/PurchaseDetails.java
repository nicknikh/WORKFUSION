package com.workfusion.assgn;

import java.util.Scanner;

public class PurchaseDetails implements Tax	{
	Scanner sc=new Scanner(System.in);
	private String pu_id;
	private String card;
	private double taxPercentage;
	PurchaseDetails(String pu_id, String card, double taxPercentage) {
		// TODO Auto-generated constructor stub
		this.pu_id=pu_id;
		this.card=card;
		this.taxPercentage=taxPercentage;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public String getPu_id() {
		return pu_id;
	}
	public void setPu_id(String pu_id) {
		this.pu_id = pu_id;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	@Override
	public void calTax(double t) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		double total= amount +(t/100)*amount;
		System.out.println("Product_id is:"+pu_id);
		System.out.println("Total amount is:"+total);
		System.out.println("Tax Percentage is:"+taxPercentage);
	}
}