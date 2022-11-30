package ProblemStatement4;

public class Payment {
	int customerId;
	String paymentId;
	double serviceTaxPercantage;
	Payment()
	{
		
	}
	Payment(int customerId)
	{
		this.setCustomerId(customerId);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getServiceTaxPercantage() {
		return serviceTaxPercantage;
	}
	public void setServiceTaxPercantage(double serviceTaxPercantage) {
		this.serviceTaxPercantage = serviceTaxPercantage;
	}
	public double payBill(double amount)
	{
		return 1.0;	
	}
	
}
