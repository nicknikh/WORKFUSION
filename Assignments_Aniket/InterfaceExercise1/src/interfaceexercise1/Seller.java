//lex_auth_01292154183292518461
//do not modify the above line

package interfaceexercise1;

public class Seller implements Tax {
    //Implement your code here
	private String location;
	private double taxPercentage;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public Seller(String loc)
	{
		if(loc.equals("Middle East"))
			taxPercentage = 15;
		else if(loc.equals("Europe"))
			taxPercentage = 25;
		else if(loc.equals("Canada"))
			taxPercentage = 22;
		else if(loc.equals("Japan"))
			taxPercentage = 12;
		else
			System.out.println("Invalid input");
	}
	
	public double calculateTax(double Price)
	{
		Price = Price+Price*(taxPercentage/100);
		return Price;
	}
	
}