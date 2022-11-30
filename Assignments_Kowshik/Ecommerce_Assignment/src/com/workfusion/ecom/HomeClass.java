package com.workfusion.ecom;
import java.util.*;

interface Tax
{
	double calculateTax(double price);
}
class notValidOption extends Exception
{
	notValidOption(String msg)
	{
		super(msg);
	}
}
public class HomeClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Tax purchaseObj = new PurchaseDetails();
		Tax sellerObj = new Seller();
		
//		System.out.println("Enter the purchase ID");
//		int purchaseId = sc.nextInt();
//		System.out.println("Enter the purchase type");
//		String purchaseType = sc.next();
		
		List<Seller> sellersList = new ArrayList<Seller>();
		sellersList.add(new Seller("Middle east"));
		sellersList.add(new Seller("Europe"));
		sellersList.add(new Seller("Canada"));
		sellersList.add(new Seller("Japan"));
		for(Seller i : sellersList)
		{
			if(i.getLocation().equalsIgnoreCase("Middle east"))
			{
				i.setTaxPercentile(15);
			}
			else if(i.getLocation().equalsIgnoreCase("Europe"))
			{
				i.setTaxPercentile(25);
			}
			else if(i.getLocation().equalsIgnoreCase("Canada"))
			{
				i.setTaxPercentile(22);
			}
			else if(i.getLocation().equalsIgnoreCase("Japan"))
			{
				i.setTaxPercentile(12);
			}
		}
		List<PurchaseDetails> listOfPurchases = new ArrayList<PurchaseDetails>();
		listOfPurchases.add(new PurchaseDetails("1","credit"));
		listOfPurchases.add(new PurchaseDetails("2","debit"));
		listOfPurchases.add(new PurchaseDetails("3","debit"));
		listOfPurchases.add(new PurchaseDetails("4","debit"));
		listOfPurchases.add(new PurchaseDetails("5","UPI"));
		for(PurchaseDetails i : listOfPurchases)
		{
			if(i.getPaymentType().equalsIgnoreCase("credit"))
			{
				i.setTaxPercentage(3);
			}
			else if(i.getPaymentType().equalsIgnoreCase("debit"))
			{
				i.setTaxPercentage(2);
			}
			else
			{
				i.setTaxPercentage(4);
			}
		}
		for(Seller i : sellersList)
		{
			System.out.println(i.getTaxPercentile());
		}
		System.out.println("1. Enter 1 if you are a purchaser and 2 if you are a seller");
		int option = sc.nextInt();		
		try
		{
			if(option !=1 && option!=2)
			{
				throw new notValidOption("You didnt enter correct option");
			}
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			if(option == 1)
			{
				System.out.println("Enter your purchase id ");
				String fetchPurchaseId = sc.next();
				for(PurchaseDetails i : listOfPurchases)
				{
					if(i.getPurchaseId().equals(fetchPurchaseId))
					{
						double tempTax = (price * i.getTaxPercentage()) / 100 ;
						System.out.println(purchaseObj.calculateTax(tempTax+price));
						System.out.println(i.getTaxPercentage());
					}
				}
			}
			else if (option == 2)
			{
				System.out.println("Enter your region");
				String fetchRegion = sc.next();
				for(Seller i : sellersList)
				{
					if(i.getLocation().equalsIgnoreCase(fetchRegion))
					{
						double tempTax = (price * i.getTaxPercentile()) / 100 ;
						System.out.println(sellerObj.calculateTax(tempTax+price));
						System.out.println(i.getTaxPercentile());
					}
					else if(i.getLocation().equalsIgnoreCase(fetchRegion))
					{
						double tempTax = (price * i.getTaxPercentile()) / 100 ;
						System.out.println(sellerObj.calculateTax(tempTax+price));
						System.out.println(i.getTaxPercentile());
					
					}
					else if(i.getLocation().equalsIgnoreCase(fetchRegion))
					{
						double tempTax = (price * i.getTaxPercentile()) / 100 ;
						System.out.println(sellerObj.calculateTax(tempTax+price));
						System.out.println(i.getTaxPercentile());
					
					}
					else if(i.getLocation().equalsIgnoreCase(fetchRegion))
					{
						double tempTax = (price * i.getTaxPercentile()) / 100 ;
						System.out.println(sellerObj.calculateTax(tempTax+price));
						System.out.println(i.getTaxPercentile());
					}
				}
			}
		}
		catch(notValidOption ex)
		{
			System.out.println("Ok bye! "+ex.getMessage());
		}
	}
}

