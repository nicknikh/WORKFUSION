package problem1;

public class Test {
	public static void main(String args[]) {
		double d;
		Order o = new Order(101,"Chips","Ordered");
		d = o.calculateTotalPrice(600);
		System.out.println("Ordered Details:");
		System.out.println("Order Id :"+o.orderId);
		System.out.println("Ordered Food:"+o.orderedFoods);
		System.out.println("Order Status:"+o.Status);
		System.out.println("The total value is :"+d);
	}
}
