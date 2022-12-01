package SwiftFood;

public class Tester {
	public static void main(String[] arg) {
		Order orderPlaced = new Order(101, "Spinach Alfredo Pasta", "Ordered");
		orderPlaced.calculateTotalPrice(35);
		orderPlaced.printSlip();
		//way 1:
		//double ans = orderPlaced.calculateTotalPrice(35);
		//System.out.println(ans);
		//way 2 :
		//System.out.println(orderPlaced.calculateTotalPrice(35));
	}
}
