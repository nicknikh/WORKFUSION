package com.workfusion.ecom;

public class PurchaseDetails implements Tax{
	String purchaseId;
	String paymentType;
	double taxPercentage;
	PurchaseDetails()
	{
		
	}
	PurchaseDetails(String purchaseId, String paymentType)
	{
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	@Override
	public double calculateTax(double price)
	{
		return price;
	}
	
	
}
