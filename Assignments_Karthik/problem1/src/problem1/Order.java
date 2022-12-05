package problem1;

public class Order {
	int orderId;
	String orderedFoods;
	double totalPrice;
	String Status;

	public Order(int orderId, String orderedFoods, String status) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		Status = status;
	}

	public Order() {
	}

	double calculateTotalPrice(int unitPrice) {
		totalPrice = (0.05 * unitPrice) + unitPrice;
		return totalPrice;
	}
}
