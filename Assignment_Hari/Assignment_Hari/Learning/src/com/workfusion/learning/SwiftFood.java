package com.workfusion.learning;

import java.util.Scanner;

public class SwiftFood {
	private int OrderId;
	private String OrederedFoods;
	double totalPrice;
	private String status;
	SwiftFood(){
		
		
	}
	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getOrederedFoods() {
		return OrederedFoods;
	}

	public void setOrederedFoods(String orederedFoods) {
		OrederedFoods = orederedFoods;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		return totalPrice = unitPrice+(unitPrice*(5.0/100));
	}
	public static void main(String args[]) {
		SwiftFood sf= new SwiftFood();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Ordered ID:");
			int i=sc.nextInt();
			sf.setOrderId(i);
			System.out.println("Enter Ordered Food:");
			String j=sc.next();
			sf.setOrederedFoods(j);
			System.out.println("Enter Status:");
			String k=sc.next();
			sf.setStatus(k);
			System.out.println("Enter Price:");
			int l=sc.nextInt();
			double t=sf.calculateTotalPrice(l);
			System.out.println("Order Details:");
			System.out.println("Ordered ID:" + sf.getOrderId());
			System.out.println("Ordered Food:" + sf.getOrederedFoods());
			System.out.println("Order Status:" +sf.getStatus());
			System.out.println("Total Price:" +t);
		}
	}
}

