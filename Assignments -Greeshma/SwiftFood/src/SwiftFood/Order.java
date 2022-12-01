package SwiftFood;

public class Order {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;
	
	Order(int orderId, String orderedFoods, String status){
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = status;
	}
	public double calculateTotalPrice(int unitPrice) {
		totalPrice = unitPrice + (5/100);
		return totalPrice;
	}
	public void printSlip() {
		System.out.println("Order Details");
		System.out.println("Order Id: " + orderId);
		System.out.println("OrderedFood: " + orderedFoods);
		System.out.println("Ordered Status: " + status);
		System.out.println("Total Price: " + totalPrice);
	}
}
