package problemStatement1Pack;

public class Order {
int orderId;
String orderedFoods;
double totalPrice;
String status;

Order()
{
	
}
Order(int orderId,String orderedFoods, double totalPrice,String status)
{
	this.setOrderedFoods(orderedFoods);
	this.setOrderId(orderId);
	this.setStatus(status);
	this.setTotalPrice(totalPrice);
}
public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public String getOrderedFoods() {
	return orderedFoods;
}

public void setOrderedFoods(String orderedFoods) {
	this.orderedFoods = orderedFoods;
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
	int temp = (unitPrice * 5)/100;
	this.setTotalPrice(this.getTotalPrice()+temp);
	return this.getTotalPrice()+temp;
}

}
