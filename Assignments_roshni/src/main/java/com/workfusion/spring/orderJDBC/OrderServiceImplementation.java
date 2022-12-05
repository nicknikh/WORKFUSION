package com.workfusion.spring.orderJDBC;
import java.util.*;

public class OrderServiceImplementation {
	
	Scanner sc=new Scanner(System.in);
	SqlQuery sq=new SqlQuery();
	
	void createOrder(Customer c) throws Exception
	{
		sq.showProducts();
		System.out.println("Enter productId you want to order");
		int productid=sc.nextInt();
		int cid=c.getCustomerId();
		sq.addProduct(c,productid);
		while(true)
		{
		System.out.println("Do you want to order more products. Enter 1 for yes and 2 for no");
		int choice =sc.nextInt();
		if(choice==2)
		{
			break;
		}
		switch(choice)
		{
		case 1:createOrder(c);
				break;
		case 2:break;
		default:System.out.println("enter correct option");
				break;
		}
		}
		
		
	}
	
	void displayPreviousOrders(Customer c) throws Exception
	{
		sq.displayOrders(c);
	}
	
	void deleteOrder(Customer c) throws Exception
	{
		sq.displayOrders(c);
		System.out.println("Enter orderId you want to delete");
		int orderid=sc.nextInt();
		sq.deleteOrder(orderid);
		
	}

}
