package ProblemStatement4;

public class DebitCardPayment extends Payment{
	 static int counter;
	 double discountPercentage;
	 static
	 {
		 counter = 1000;
	 }
	 DebitCardPayment(int customerId)
	 {
		 super(customerId);
		 DebitCardPayment.counter+=1;
		 setCounter(DebitCardPayment.counter);
		StringBuffer sb = new StringBuffer("D");
		sb.append(String.valueOf(DebitCardPayment.counter));
		this.setPaymentId(sb.toString());
	 }
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		
		DebitCardPayment.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	 public double payBill(double amount)
	 {
		 double serviceTax = this.getServiceTaxPercantage();
		 double discountPercentage = this.getDiscountPercentage();
		 amount+=((amount * serviceTax) / 100);
		 amount-=((amount * discountPercentage)/ 100);
		 return amount;
	 }
}
