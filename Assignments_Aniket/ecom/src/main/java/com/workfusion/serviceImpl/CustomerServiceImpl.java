package com.workfusion.serviceImpl;

import java.util.Scanner;

import com.workfusion.beans.Address;
import com.workfusion.beans.Customer;
import com.workfusion.repository.CustomerRepository;
import com.workfusion.services.CustomerService;

public class CustomerServiceImpl implements CustomerService 
{

	//In this class the input values are being taken from the user.
	Scanner scanner = new Scanner(System.in);
	Customer c = new Customer();
	Address a = new Address();
	CustomerRepository cr = new CustomerRepository(); //CustomerRepository deals the logic part.
	int opt=0;

	public void addNewCustomer() {
		// TODO Auto-generated method stub
		//Customer details
		System.out.println("Enter your Name");
		c.setCustomerName(scanner.next());
		System.out.println("Enter your Mobile Number");
		c.setCustomerPhone(scanner.nextLong());
		//Customer-login details
		System.out.println("Enter your username");
		c.setCustomerUsername(scanner.next());
		System.out.println("Enter your password");
		c.setCustomerPassword(scanner.next());
		// Address details
		System.out.println("Enter street name:");
		a.setStreet(scanner.next());
		System.out.println("Enter city name:");
		a.setCity(scanner.next());
		System.out.println("Enter  Pin-code:");
		a.setPinCode(scanner.nextLong());
		c.setAddress(a);
		try {
			cr.addNewCustomer(c); // SQL Query and the logic for Adding the new customer is written in this method.
			customerLogin();
		}
		catch (Exception e) 
		{
			e.getMessage();
		}
	}

	public void updateCustomerDetails() 
	{
		// TODO Auto-generated method stub
		try
		{
			//Flag is used to run and exit the loop.
			boolean flag = true;
			while(flag)
			{
				System.out.println("Choose option to edit your details.");
				System.out.println("1.Name\n2.Phone no.\n3.Street\n4.City\n5.Pincode\n6.Exit\nEnter your Choice:");
				int option = scanner.nextInt();
				cr.setOpt(option); //Used to reuse the option in CustomerRepository.
				switch(option)
				{
				case 1: System.out.println("Enter the Name:");
				c.setCustomerName(scanner.next());
				break;
				case 2:System.out.println("Enter the Phone no.:");
				c.setCustomerPhone(scanner.nextLong());
				break;
				case 3: System.out.println("Enter the Street:");
				a.setStreet(scanner.next());
				break;
				case 4:System.out.println("Enter the City:");
				a.setCity(scanner.next());
				break;
				case 5:System.out.println("Enter the Pin-code:");
				a.setPinCode(scanner.nextLong());
				break;
				case 6:
					flag =false;
					break;//Exits while loop.
				default:
					System.out.println("Invalid option.");
					break;
				}
				c.setAddress(a);
				cr.updateCustomer(c); //SQL Query and the logic for customerUpdate is written in the method of CustomerRepository class.
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

	public boolean customerLogin() 
	{
		// TODO Auto-generated method stub
		// Boolean helps in login verification.
		boolean isLogin = false;
		try {
			System.out.println("Enter your username");
			c.setCustomerUsername(scanner.next());
			System.out.println("Enter your password");
			c.setCustomerPassword(scanner.next());
			isLogin = cr.customerLogin(c); // isLogin value will be changed if the userName and password are in the database.
		} 
		catch (Exception e) 
		{
			e.getMessage();
		}
		return isLogin;
	}
	
}
