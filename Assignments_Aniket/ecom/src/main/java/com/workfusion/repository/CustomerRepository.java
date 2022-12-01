package com.workfusion.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.workfusion.beans.Customer;

public class CustomerRepository {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/ecom?characterEncoding=utf8";
	   static final String USER = "root";
	   static final String PASS = "2508@Var";
	   private int id;
	   private int opt;

	public int getOpt() 
	{
		return opt;
	}

	public void setOpt(int opt) 
	{
		this.opt = opt;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public void addNewCustomer(Customer c) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL,USER, PASS);

			int value=0;
			PreparedStatement stmt = con.prepareStatement("insert into customer(customerName,phoneNumber) values(?,?)");
			stmt.setString(1, c.getCustomerName());
			stmt.setLong(2, c.getCustomerPhone());
			int i = stmt.executeUpdate();
			
			stmt = con.prepareStatement("select max(customerId) from customer"); //To pass the auto-incremented to the other tables.
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				value = (Integer.parseInt(rs.getString(1)));
			}
			stmt = con.prepareStatement("insert into address(customerId,street,city,pincode) values(?,?,?,?)"); //Pass address details.
			stmt.setInt(1, value);
			stmt.setString(2, c.getAddress().getStreet());
			stmt.setString(3, c.getAddress().getCity());
			stmt.setLong(4, c.getAddress().getPinCode());
			i=stmt.executeUpdate();
			
			stmt = con.prepareStatement("insert into CustomerLogin(customerId,customeruserName,customerPassword) values(?,?,?)");
			stmt.setInt(1, value);
			stmt.setString(2, c.getCustomerUsername());
			stmt.setString(3, c.getCustomerPassword());
			i=stmt.executeUpdate();
			System.out.println(" Registration Successfull!! please Login");
			con.close();
		}
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
	}

	public boolean customerLogin(Customer c) throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		boolean isLogin = false;
		try 
		{
		  Class.forName("com.mysql.cj.jdbc.Driver");  
		  Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);  
		  int count = 0;
		  Statement stmt = conn.createStatement();
		  ResultSet rs = stmt.executeQuery("select * from customerLogin");		      
		  while(rs.next())
		    {
		       if(rs.getString(2).equalsIgnoreCase(c.getCustomerUsername()) && rs.getString(3).equals(c.getCustomerPassword()))
		       {
		    	   isLogin = true;
		    	   count+=1;
		    	   setId(Integer.parseInt(rs.getString(1)));
		    	   System.out.println("Logged in....");
		       }
		     }
		    if(count==0)
		    {
		    	System.out.println("Invalid Credentials!!");
		    }
		      conn.close();
		}
		catch(Exception e) 
		{
			e.getMessage();
		}
		return isLogin;
	}
	
	public void updateCustomer(Customer c)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL,USER, PASS);
			
			PreparedStatement query = con.prepareStatement("Select * from cutomer");
			int i=0;
			switch(getOpt())
			{
			case 1:
				query = con.prepareStatement("Update customer set customerName = ? where customerId = ?");
				query.setString(1, c.getCustomerName());
				query.setInt(2, getId());
				i=query.executeUpdate();
				break;
			case 2:
				query = con.prepareStatement("Update customer set phoneNumber = ? where customerId = ?");
				query.setLong(1, c.getCustomerPhone());
				query.setInt(2, getId());
				i=query.executeUpdate();
				break;
			case 3:
				query = con.prepareStatement("Update address set street= ? where customerId = ?");
				query.setString(1, c.getAddress().getStreet());
				query.setInt(2, getId());
				i=query.executeUpdate();
				break;
			case 4:
				query = con.prepareStatement("Update address set city= ? where customerId = ?");
				query.setString(1, c.getAddress().getCity());
				query.setInt(2, getId());
				i=query.executeUpdate();
				break;
			case 5:
				query = con.prepareStatement("Update address set pincode= ? where customerId = ?");
				query.setLong(1, c.getAddress().getPinCode());
				query.setInt(2, getId());
				i=query.executeUpdate();
				break;
			default:
					System.out.println("Broke!!!");
					break;
			}
			System.out.println("Customer details updated!!");
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
