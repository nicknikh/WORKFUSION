package Food_Order;

public class Tester {

	public static void main(String[] args)
	{
		Order ord = new Order(101,"Spinach Alfredo Pasta","Ordered");
		System.out.println("Order Details");
		System.out.println("Order Id: "+ord.getOrderId());
		System.out.println("Ordered Food: "+ord.getOrderedFood());
		System.out.println("Order Status: "+ord.getStatus());
		System.out.println("Order Price: "+ord.calculateTotalPrice(40));
	}
}
