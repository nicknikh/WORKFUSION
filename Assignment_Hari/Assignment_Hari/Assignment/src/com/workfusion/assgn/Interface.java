package com.workfusion.assgn;
import java.util.*;
public class Interface {
	
	public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
	int i;
	System.out.println("1-Seller" + " " + " " +"2-Purchaser");
	i = sc.nextInt();
	if(i==1) {
		System.out.println("1-MiddleEast" + " " + " " +"2-Europe "+"3-Canada" + " " + " " +"4-Japan");
		int j=sc.nextInt();
		switch(j) {
		case 1: new Seller("MiddleEast",15.0).calTax(15);
			break;
		case 2: new Seller("Europe",25.0).calTax(25);
			break;
		case 3: new Seller("Canda",22.0).calTax(22);
			break;
		case 4: new Seller("Japan",12.0).calTax(12);
			break;
		default: System.out.println("Invalid");
		}
	}
	else if(i==2){
		System.out.println("1-Credit" + " " +"2-Debit " +" "+"3-Other");
		int k=sc.nextInt();
		switch(k) {
		case 1: new PurchaseDetails("1001","Credit",3.0).calTax(3);
			break;
		case 2: new PurchaseDetails("1002","Debit",2.0).calTax(2);
			break;
		case 3: new PurchaseDetails("1003","Other",4.0).calTax(4);
			break;
		default: System.out.println("Invalid");
		
		}
	}
	else {
		System.out.println("Invalid Option");
	}
}	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}

