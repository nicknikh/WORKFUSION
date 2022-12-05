package problem4;

public class DebitCardPayment extends Payment {
	private int counter;
	private double discountPercentage;

	public DebitCardPayment(int customerId) {
		super(customerId);
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double payBill(double amount) {

		return 0;
	}
}
