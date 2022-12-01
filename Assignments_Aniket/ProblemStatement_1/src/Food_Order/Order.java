package Food_Order;

public class Order {

	private int orderId;
	private String orderedFood;
	private double totalPrice;
	private String status;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderedFood() {
		return orderedFood;
	}
	public void setOrderedFood(String orderedFood) {
		this.orderedFood = orderedFood;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(int unitPrice)
	{
		totalPrice = unitPrice+unitPrice*5/100;
		return totalPrice;
	}
	
	public Order(int orderId,String orderedFood,String status)
	{
		this.orderId = orderId;
		this.orderedFood = orderedFood;
		this.status = status;
	}
	
}
