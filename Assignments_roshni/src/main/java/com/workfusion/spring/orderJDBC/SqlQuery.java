package com.workfusion.spring.orderJDBC;

import java.sql.*;
import java.util.*;

public class SqlQuery{
	Scanner sc=new Scanner(System.in);
	
	
	
	
	void register(Customer c,Address a) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		
		//inserting into customerdetails
		PreparedStatement stmt=con.prepareStatement("insert into customerDetails(customerName,phoneNumber) values(?,?)");  
		stmt.setString(1, c.getCustomerName());
		stmt.setInt(2, c.getPhoneNumber());
		int i=stmt.executeUpdate();
		
		//inserting into address
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select customerId from customerdetails where customerName='"+c.getCustomerName()+"' and phoneNumber="+c.getPhoneNumber());
		
		if(rs.next());
		int cid;
		cid=rs.getInt("customerId");
		c.setCustomerId(cid);
				
		PreparedStatement stmt1=con.prepareStatement("insert into address(customerId,street,city,pincode) values(?,?,?,?)");  
		stmt1.setInt(1, cid);
		stmt1.setString(2, a.getStreet());
		stmt1.setString(3, a.getCity());
		stmt1.setString(4, a.getPinCode());
		
		int i1=stmt1.executeUpdate();
		
		
		//inserting into customer login
		
		PreparedStatement stmt2=con.prepareStatement("insert into customerlogin(customerId,customerUserName,customerPassword) values(?,?,?)");  
		System.out.println(cid);
		stmt2.setInt(1,cid);
		stmt2.setString(2,c.getCustomerUserName());
		stmt2.setString(3,c.getCustomerPassword());

		int i2=stmt2.executeUpdate();
		if(i2>0)
		{
			System.out.println("  insertion succesful");
		}
		
		con.close();
	}
	
	
	int login(Customer c,Address a) throws Exception
	{
		int flag=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select customerUserName,customerPassword from customerlogin");
		while(rs.next())
		{
			
			String username=rs.getString("customerUserName");
			String password=rs.getString("customerPassword");
			
			if(username.equals(c.getCustomerUserName()) && password.equals(c.getCustomerPassword()))
			{
				
				flag=1;
				System.out.println("succesful login");
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("unsuccesful login");		

		}
		
		if(flag==1)
		{
		
		ResultSet rs1=st.executeQuery("select customerId from customerlogin where customerUserName='"+c.getCustomerUserName()+"' and customerPassword='"+c.getCustomerPassword()+"'");
		if(rs1.next());
		int cid = rs1.getInt("customerId");
		c.setCustomerId(cid);
		
		
		ResultSet rs2=st.executeQuery("select customerName,phoneNumber from customerdetails where customerId="+c.getCustomerId());
		if(rs2.next());

		c.setCustomerName(rs2.getString("customerName"));
		c.setPhoneNumber(rs2.getInt("phoneNumber"));

		
		ResultSet rs3=st.executeQuery("select street,city,pincode from address where customerId="+c.getCustomerId());
		if(rs3.next());
		a.setStreet(rs3.getString("street"));
		a.setCity(rs3.getString("city"));
		a.setPinCode(rs3.getString("pincode"));
		
		
		
		}
		con.close();
		if(flag==1)
		{
			return 1;
		}
		return 0;
	}
	
	
	void editDetails(Customer c,Address a) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		
	    Statement st=con.createStatement();
		System.out.println("select customerId from customerlogin where customerUserName='"+c.getCustomerUserName()+"' and customerPassword='"+c.getCustomerPassword()+"'");
		ResultSet rs=st.executeQuery("select customerId from customerlogin where customerUserName='"+c.getCustomerUserName()+"' and customerPassword='"+c.getCustomerPassword()+"'");
		if(rs.next());
		int cid = rs.getInt("customerId");
		c.setCustomerId(cid);
		
		
		System.out.println("Enter what you want to edit\n 1. Name 2.phonenumber 3.username 4.password 5.street 6.pincode 7.city");
		int edit=sc.nextInt();
		switch(edit)
		{
		case 1: System.out.println("Enter new name");
		sc.nextLine();
				String name=sc.nextLine();
				c.setCustomerName(name);
				int i=st.executeUpdate("update customerdetails set customerName='"+c.getCustomerName()+"' where customerId="+c.getCustomerId());
				System.out.println("update customerdetails set customerName='"+c.getCustomerName()+"' where customerId="+c.getCustomerId());
				System.out.println("Sucesfully changed1");
				if(i>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
		
		case 2: System.out.println("Enter new phonenumber");
				int phonenumber=sc.nextInt();
				c.setPhoneNumber(phonenumber);
				System.out.println("Sucesfully changed");

				int i1=st.executeUpdate("update customerdetails set phoneNumber='"+c.getPhoneNumber()+"' where customerId="+c.getCustomerId());
				if(i1>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
				
		case 3: System.out.println("Enter new username");
				String username=sc.next();
				c.setCustomerUserName(username);
				System.out.println("Sucesfully changed");
				int i2=st.executeUpdate("update customerlogin set customerUserName='"+c.getCustomerUserName()+"' where customerId="+c.getCustomerId());
				if(i2>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
				
		case 4: System.out.println("Enter new password");
				String pass=sc.next();
				c.setCustomerPassword(pass);
				System.out.println("Sucesfully changed");
				int i3=st.executeUpdate("update customerlogin set customerUserName='"+c.getCustomerPassword()+"' where customerId="+c.getCustomerId());
				if(i3>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
				
		case 5: System.out.println("Enter new street");
				String street=sc.nextLine();
				sc.nextLine();
				a.setStreet(street);
				System.out.println("Sucesfully changed");
				int i4=st.executeUpdate("update address set street='"+a.getStreet()+"' where customerId="+c.getCustomerId());
				if(i4>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
				
		case 6: System.out.println("Enter new pincode");
				String pincode=sc.next();
				a.setPinCode(pincode);
				System.out.println("Sucesfully changed");
				int i5=st.executeUpdate("update address set pincode='"+a.getPinCode()+"' where customerId="+c.getCustomerId());
				if(i5>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;
		case 7: System.out.println("Enter new city");
				String city=sc.next();
				a.setCity(city);
				System.out.println("Sucesfully changed");
				int i6=st.executeUpdate("update address set city='"+a.getCity()+"' where customerId="+c.getCustomerId());
				if(i6>0)
				{
					System.out.println("Sucesfully changed database");

				}
				break;

		default:
			System.out.println("Enter correct choice");
			con.close();
				
		}
	}
	
	
	void showProducts() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next())
		{
			System.out.print(rs.getInt("productId"));
			System.out.print(" "+rs.getString("productName"));
			System.out.print(" "+rs.getString("productPrice"));
			System.out.print(" "+rs.getString("productType"));
			System.out.println();


		}
		con.close();
		
	}
	
	void addProduct(Customer c,int productid) throws InvalidProductException,Exception
	{
		OrderServiceImplementation osi1=new OrderServiceImplementation();
		int cid=c.getCustomerId();
		int c1=0;
		int flag=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		Statement st=con.createStatement();
		
		ResultSet rs1=st.executeQuery("select * from product where productId="+productid);
		while(rs1.next())
		{
			c1+=1;
			flag=1;
		}
		if(c1!=1)
		{
			try {
				throw new InvalidProductException("No productid");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				//addProduct(cid,productid);
				osi1.createOrder(c);
			}
		}
		
		
		if(flag==1)
		{
		ResultSet rs=st.executeQuery("select productPrice from product where productId="+productid);
		if(rs.next());
		int productprice=rs.getInt("productPrice");
		
		PreparedStatement stmt1=con.prepareStatement("insert into orders(customerId,productId,amount,orderDate) values(?,?,?,CURRENT_TIMESTAMP)");  
		stmt1.setInt(1, cid);
		stmt1.setInt(2, productid);
		stmt1.setInt(3, productprice);
		
		int i2=stmt1.executeUpdate();
		if(i2>0)
		{
			System.out.println(" order insertion succesful");
		}
		}
		con.close();
	}
	
	void displayOrders(Customer c) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select o.orderId,p.productName,p.producttype,o.amount from orders o inner join product p where p.productId=o.productId and o.customerId="+c.getCustomerId());

		//ResultSet rs=st.executeQuery("select orderId,customerId,productId,amount from orders where customerId="+c.getCustomerId());
		//select o.orderId,p.productname,p.producttype from orders o inner join product p where p.customerid=o.customerid;
		System.out.println("OrderId   productName   producttype      Amount");
		/*while(rs.next())
		{
			System.out.print(rs.getInt("orderId"));
			System.out.print("          "+rs.getInt("customerId"));
			System.out.print("          "+rs.getInt("productId"));
			System.out.print("        "+rs.getInt("amount"));
			System.out.println();
		}*/
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("          "+rs.getString(2));
			System.out.print("          "+rs.getString(3));
			System.out.print("        "+rs.getInt(4));
			System.out.println();
		}
		
		con.close();
	}
	
	void deleteOrder(int i) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","root");
		Statement st=con.createStatement();
		int q=st.executeUpdate("delete from orders where orderId="+i);
		if(q>=1)
		{
			System.out.println("Deleted Succesfully");
		}
		con.close();
	}
	
	

}
