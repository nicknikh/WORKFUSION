package com.workfusion.ecom;

public class Seller implements Tax 
{
	String location;
	double taxPercentile;
	Seller()
	{
		
	}
	Seller(String location)
	{
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentile() {
		return taxPercentile;
	}
	public void setTaxPercentile(double taxPercentile) {
		this.taxPercentile = taxPercentile;
	}
	@Override
	public double calculateTax(double price)
	{
		return price;
	}
	
}
