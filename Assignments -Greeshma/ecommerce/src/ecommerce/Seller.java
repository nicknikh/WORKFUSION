package ecommerce;



public class Seller {
	private String location;
	private double taxPercentage;
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	Seller(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public void calculateTax(double price) {
		switch (getLocation()) {
		case "Middle east": setTaxPercentage(15); price = price + (price * (getTaxPercentage()/100));
				break;
		case "Europe": setTaxPercentage(25); price = price + (price * (getTaxPercentage()/100));break;
		case "Canada" : setTaxPercentage(22); price = price + (price * (22.0/100));break;
		case "Japan": setTaxPercentage(12); price = price + (price * (getTaxPercentage()/100));break;
		}
		System.out.println("Total purchase amount: " + price);
		System.out.println("Tax percentage: " + taxPercentage);
	}
	
}
