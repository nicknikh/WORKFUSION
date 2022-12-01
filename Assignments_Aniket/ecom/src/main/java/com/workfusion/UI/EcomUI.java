package com.workfusion.UI;

import java.util.Scanner;

import com.workfusion.serviceImpl.CustomerServiceImpl;
import com.workfusion.services.CustomerService;

public class EcomUI 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		CustomerService cs = (CustomerService) new CustomerServiceImpl();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		
		while (flag) 
		{
			System.out.println("1. Register New Customer");
			System.out.println("2. Login Existing Customer");
			System.out.println("3. Update Existing Customer");
			System.out.println("4. Display Products");
			System.out.println("5. Exit");
			System.out.println("Enter your Choice:");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				cs.addNewCustomer();
				break;
			case 2:
				cs.customerLogin();
				break;
			case 3:
				if(cs.customerLogin())
				{
					cs.updateCustomerDetails();
				}
				break;
			case 4:
				if(cs.customerLogin())
				break;
			case 5:
				System.out.println("Logged-out!!!!");
				flag = false;
				break;
			default:
				System.out.println("Please provide correct option");
			}
		}

	}

}
