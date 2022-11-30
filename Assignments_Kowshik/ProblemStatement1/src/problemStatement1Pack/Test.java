package problemStatement1Pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		List<Order> foodOrders = new ArrayList<Order>();
		foodOrders.add(new Order(101,"Spinach",32,"Ordered"));
		double val = foodOrders.get(0).calculateTotalPrice((int)foodOrders.get(0).getTotalPrice());
		System.out.println("Order details");
		System.out.println("Order ID: "+foodOrders.get(0).getOrderId());
		System.out.println("Ordered Food: "+foodOrders.get(0).getOrderedFoods());
		System.out.println("Order Status: "+foodOrders.get(0).getStatus());
		System.out.println("Total Price: "+val);
		
		
	}

}
