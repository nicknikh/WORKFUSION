package com.workfusion.spring.orderJDBC;
import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		while(true)
		{
			Customer c=new Customer();
			Address a=new Address();
		
		System.out.println("Enter 1.new user 2.returning user 3.Exit");
		int flag=0;
		CustomerServiceImplementation csi=new CustomerServiceImplementation();
		OrderServiceImplementation osi=new OrderServiceImplementation();
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option==3)
		{
			break;
		}
		switch(option)
		{
		case 1:
			
			csi.addNewCustomer(c,a);
			System.out.println("mallesh roshni yaha nahi aaye dekh");
			flag=1;
			break;
		case 2:
			
			int x=csi.login(c,a);
			if(x==1)
			{
				flag=1;
			}

			break;
		case 3: break;
		}
		
		if(flag==1)
		{
			while(true)
			{
			System.out.println("Enter what you want to do\n1.Edit Customer Details\n2.PlaceOrder\n3.Display previous orders\n4.Delete order\n5. exit");
			int option1=sc.nextInt();
			if(option1==5)
			{
				break;
			}
			switch(option1)
			{
			case 1:csi.editCustomerDetails(c,a);
					break;
			case 2:osi.createOrder(c);
					break;
			case 3:osi.displayPreviousOrders(c);
					break;
			case 4:osi.deleteOrder(c);
					break;				
			}
			}			
		}
		
	   }
	}

}
