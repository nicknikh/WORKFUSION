package problem4;

public class CreditCardPayment extends Payment {
	private int counter;

	public CreditCardPayment(int customerId) {
		super(customerId);
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	public double payBill(double amount) {
		
		return 3;
	}
}