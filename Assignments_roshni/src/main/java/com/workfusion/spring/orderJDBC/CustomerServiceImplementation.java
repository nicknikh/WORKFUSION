package com.workfusion.spring.orderJDBC;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;



public class CustomerServiceImplementation implements CustomerService {
	
	SqlQuery sq=new SqlQuery();
	Scanner sc=new Scanner(System.in);


	public void editCustomerDetails(Customer c,Address a) throws Exception {
		
		

		sq.editDetails(c,a);
		
	}

	public void addNewCustomer(Customer c,Address a) throws InvalidNameException,InvalidPhoneException,InvalidAddressException,Exception  {
		
		
		System.out.println("Enter your name");
		String name=sc.next();
		if(name==null || name.length()==0)
		{
			System.out.println("1");
			try {
				
				throw new InvalidNameException("Invalid name. It cannot be null");
				
			} catch ( Exception e) {
				System.out.println(e.getMessage());
				addNewCustomer(c,a);
				return;
			}
		}
		c.setCustomerName(name);
		
		
		System.out.println("Enter your phonenumber");
		int pn=sc.nextInt();
		
		int lengthOfInt = String.valueOf(pn).length();
		if(lengthOfInt!=9)
		{
			System.out.println("2");
			try {
				
				throw new InvalidPhoneException("Invalid Phone number");
				
			} catch ( Exception e) {

				System.out.println(e.getMessage());
				addNewCustomer(c,a);
				return;
			}
		}
		c.setPhoneNumber(pn);
		
		
		System.out.println("Enter your username");
		String un=sc.next();
		c.setCustomerUserName(un);
		System.out.println("Enter your password");
		String pass=sc.next();
		c.setCustomerPassword(pass);
		System.out.println("Enter your street");
		String street=sc.next();
		a.setStreet(street);
		System.out.println("Enter your city");
		String city=sc.next();
		a.setCity(city);
		System.out.println("Enter your pincode");
		String pinCode=sc.next();
		
		int lengthOfPincode = String.valueOf(pinCode).length();
		if(lengthOfPincode!=6)
		{

			System.out.println("3");
			try {
				
				throw new InvalidAddressException("Invalid  Address");
				
			} catch ( Exception e) {
				
				System.out.println(e.getMessage());
				addNewCustomer(c,a);
				return;

			}
		}
		a.setPinCode(pinCode);
		
		sq.register(c,a);
	}

	public int login(Customer c,Address a) throws Exception {
		System.out.println("Enter UserName");
		String un=sc.next();
		c.setCustomerUserName(un);
		System.out.println("Enter Password");
		String pass=sc.next();
		c.setCustomerPassword(pass);	
		SqlQuery sq=new SqlQuery();
		int re=sq.login(c,a);
		return re;
		
		
	}
	
	

}
