package ProblemStatement4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("Enter 1 for credit and 2 for debit and 0 to exit");
			int option = sc.nextInt();
			if(option == 1)
			{
				System.out.println("Enter the customer id ");
				int customerId = sc.nextInt();
				System.out.println("Enter the price");
				int price = sc.nextInt();
				CreditCardPayment cObj = new CreditCardPayment(customerId);
				if(price <= 500)
				{
					cObj.setServiceTaxPercantage(3);
				}
				else if(price > 500 && price <= 1000)
				{
				
					cObj.setServiceTaxPercantage(5);
				}
				else if(price > 1000)
				{
					
					cObj.setServiceTaxPercantage(6);
				}
				double ans = cObj.payBill(price);
				System.out.println("Customer Id: "+cObj.getCustomerId());
				System.out.println("Payment Id: "+cObj.getPaymentId());
				System.out.println("Service tax percentage: "+cObj.getServiceTaxPercantage());
				System.out.println("Total bill amount: "+ans);
			}
			else if(option == 2)
			{
				System.out.println("Enter the customer id ");
				int customerId = sc.nextInt();
				System.out.println("Enter the price");
				int price = sc.nextInt();
				DebitCardPayment dObj = new DebitCardPayment(customerId);
				if(price <= 500)
				{
					dObj.setDiscountPercentage(1.0);
					dObj.setServiceTaxPercantage(2.5);
				}
				else if(price > 500 && price <= 1000)
				{
					dObj.setDiscountPercentage(2.0);
					dObj.setServiceTaxPercantage(4.0);
				}
				else if(price > 1000)
				{
					dObj.setDiscountPercentage(3.0);
					dObj.setServiceTaxPercantage(5.0);
				}
				double ans = dObj.payBill(price);
				System.out.println("Customer Id: "+dObj.getCustomerId());
				System.out.println("Payment Id: "+dObj.getPaymentId());
				System.out.println("Service tax percentage: "+dObj.getServiceTaxPercantage());
				System.out.println("Discount percentage: "+dObj.getDiscountPercentage());
				System.out.println("Total bill amount: "+ans);
			}
			else
			{
				break;
			}
		}
		System.out.println("Thank you!");
			
	}
}
