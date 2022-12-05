package com.workfusion.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.workfusion.repository.OrderRepository;
import com.workfusion.services.OrderService;

public class OrderServiceImpl implements OrderService
{

	OrderRepository or = new OrderRepository();
	
	Scanner scanner = new Scanner(System.in);
	
	public void displayProducts() 
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom?characterEncoding=utf8","root","2508@Var");
			System.out.println("*****************************************************************************************");
			System.out.println("Products available are:");
			PreparedStatement ps=con.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			System.out.println("*****************************************************************************************");
			con.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public void orderProducts() 
	{
		// TODO Auto-generated method stub
		displayProducts();
		boolean flag = true;
		int op;
		ArrayList<String> cart = new ArrayList<String>();
		while(flag)
		{
			System.out.println("Choose your option:");
			System.out.println("1.Add a product to your Cart");
			System.out.println("2.Delete a product from your Cart");
			System.out.println("3.Check-out");
			System.out.println("4.Exit");
			System.out.println("Option:");
			op = scanner.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("Enter the Product Name:");
				cart.add(scanner.next());
				System.out.println("Item added!!");
				break;
			case 2:
				System.out.println("Products in cart are:");
				if(cart.size()>0)
				{
					for(int i = 0;i < cart.size();i++)
					{
						System.out.println(i+"."+cart.get(i));
					}
					System.out.println("Enter the index to remove the product from the cart:");
					cart.remove(scanner.nextInt());
					System.out.println("Item removed");
				}
				else
					System.out.println("Cart is empty!!");
				break;
			case 3:
				System.out.println("Items in  Cart are: "+cart.size());
				System.out.println("Are you sure you want to check-out (Y/N):");
				char sure = scanner.next().charAt(0);
				if(sure == 'Y')
				{
					System.out.println("Checked-out!!");
					flag=false;
					break;
				}
				else
					break;
			case 4:
				System.out.println("Exited!!");
				flag = false;
				break;
			default:
				System.out.println("Invalid Input....");
			}
		}
		or.orderProduct(cart);
	}
}	
