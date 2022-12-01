//lex_auth_01292154183292518461
//do not modify the above line

package interfaceexercise1;


public class PurchaseDetails implements Tax {
    //Implement your code here
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	

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
	
	public PurchaseDetails(String id, String Type)
	{
	
		purchaseId = id;
		paymentType = Type;
		if(paymentType.equals("Debit Card"))
			taxPercentage = 2;
		else if(paymentType.equals("Credit Card"))
			taxPercentage = 3;
		else
			taxPercentage = 4;
	}
	public double calculateTax(double Price)
	{
		Price = Price+Price*(taxPercentage/100);
		return Price;
	}
	
}