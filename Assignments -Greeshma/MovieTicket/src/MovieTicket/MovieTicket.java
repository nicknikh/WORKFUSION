package MovieTicket;

public class MovieTicket {
	public int movieId;
	public int noOfSeats;
	public int totalAmount;
	MovieTicket(int movieId, int noOfSeats){
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	public int calculateTotalAmount() {
		System.out.println(movieId);
		System.out.println(noOfSeats);
		totalAmount = (int) Math.round((movieId  * noOfSeats)+ (movieId*noOfSeats) * (2.0/100));
	
		return totalAmount;
	}
}
