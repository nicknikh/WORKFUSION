package ecommerce;

public class Tax {
	public double price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PurchaseDetails buyer = new PurchaseDetails("P1001", "cod");
		
		System.out.println("Purchase Details");
		System.out.println("*********************");
		System.out.println("Total purchase amount: " + buyer.calculateTax(100));
		System.out.println("Tax percentage: " + buyer.getTaxPercentage());
		System.out.println();
		
		System.out.println("Seller Details");
		System.out.println("*********************");
		Seller cell = new Seller("Europe");
		cell.calculateTax(100);
		
	}

}
