package ecommerce;

public class PurchaseDetails {
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public PurchaseDetails(String purchaseId, String paymentType){
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
	
	public double calculateTax(double price) {
		if (paymentType.equalsIgnoreCase("Debit Card")) {
			setTaxPercentage(2);
			price += price*getTaxPercentage()/100;
			
		}
		else if (paymentType.equalsIgnoreCase("Credit Card")) {
			setTaxPercentage(3);
			price += price*getTaxPercentage()/100;
		}
			
		else {
			setTaxPercentage(4);
			price += price*getTaxPercentage()/100;
		}
		return price;
	}
}
