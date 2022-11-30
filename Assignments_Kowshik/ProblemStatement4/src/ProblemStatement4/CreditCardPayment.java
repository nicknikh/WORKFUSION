package ProblemStatement4;

public class CreditCardPayment extends Payment {
	static int counter;
	static
	{
		counter = 1000;
	}
	CreditCardPayment(int customerId)
	{
		super(customerId);
		CreditCardPayment.counter+=1;
		 setCounter(CreditCardPayment.counter);
		StringBuffer sb = new StringBuffer("C");
		sb.append(String.valueOf(CreditCardPayment.counter));
		this.setPaymentId(sb.toString());
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	public double payBill(double amount)
	{
		 double serviceTax = this.getServiceTaxPercantage();
		 amount+=((amount * serviceTax) / 100);
		 return amount;
	}
	
	
}
