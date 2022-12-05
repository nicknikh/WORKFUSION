package com.workfusion.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderRepository 
{
	static final String DB_URL = "jdbc:mysql://localhost:3306/ecom?characterEncoding=utf8";
	static final String USER = "root";
	static final String PASS = "2508@Var";
	
	private int orderId; // To retrieve OrderId
	
	public int getOrderId() 
	{
		return orderId;
	}

	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}


	CustomerRepository customer = new CustomerRepository();
	
	
	public void orderProduct(ArrayList<String> cart)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(DB_URL,USER, PASS);
			PreparedStatement ps = connection.prepareStatement("insert into orders(customerId,orderDate) values(?,current_timestamp)");
			ps.setInt(1, customer.getId());
			// current_timeStamp is default  value that auto-generates the current time stamp if the value is not provided.
			int j = ps.executeUpdate();
			Statement stmt = connection.createStatement();
			ResultSet rs = ps.executeQuery("select max(orderId) from orders");
			while(rs.next())
			{
				setOrderId((Integer.parseInt(rs.getString(1))));
			}
			//System.out.println(getOrderId());
			for(int n=0;n<cart.size();n++)
			{
				ps = connection.prepareStatement("insert into orderDetails(orderId,productId,productName,productPrice) values(?,(select productId from product where productName = ?),?,(select productPrice from product where productName = ?))");
				ps.setInt(1, getOrderId());
				ps.setString(2, cart.get(n));
				ps.setString(3, cart.get(n));
				ps.setString(4, cart.get(n));
				j = ps.executeUpdate();
			}
			
			ps = connection.prepareStatement("update orders set totalPrice =(select sum(productPrice) from orderDetails where orderId = ?)where orderId =?");
			ps.setInt(1, getOrderId());
			ps.setInt(2, getOrderId());
			ps.executeUpdate();
			rs = stmt.executeQuery("select customerName,phoneNumber from customer where customerId = " + customer.getId());
			while(rs.next())
			{
				System.out.println("Customer Name: "+rs.getString(1)+"\nPhone Number: "+rs.getLong(2));
			}
			
			rs = stmt.executeQuery("select totalPrice from orders where orderId = "+ getOrderId());
			while(rs.next())
			{
				System.out.println("Total Price"+rs.getFloat(1));
			}
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
