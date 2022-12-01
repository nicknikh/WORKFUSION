package MovieTicket;

public class Tester {
	public static void main(String[] arg) {
		MovieTicket mv = new MovieTicket(112, 3);
		mv.calculateTotalAmount();
		if (mv.totalAmount == 0) {
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		}
		else {
			System.out.println("Total amount for booking: $ " + mv.totalAmount);
		}
	}
}
