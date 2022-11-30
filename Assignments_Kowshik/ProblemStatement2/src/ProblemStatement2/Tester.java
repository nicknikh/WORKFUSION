package ProblemStatement2;

class MovieTicket {
	int costPerTicket;
	int quantity;
	MovieTicket(int costPerTicket , int quantity)
	{
		this.costPerTicket=costPerTicket;
		this.quantity=quantity;
	}

	public int calculateTotalAmount()
	{
		int temp = ((this.costPerTicket * this.quantity) * 2 ) / 100;
		return temp + this.costPerTicket * this.quantity;
	}
}
class Tester {
	public static void main(String[] args) {
		MovieTicket movieTicket = new MovieTicket(112, 3);
		double amount = movieTicket.calculateTotalAmount();
		if (amount==0)
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		else
			System.out.println("Total amount for booking : $" + amount);
	}
}