package problem2;

public class MovieTicket {
	int movieId;
	int noOfSeats;
	int costPerTicket = 250;
	public MovieTicket(int movieId, int noOfSeats) {
		super();
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	double calculateTotalAmount(){
		return (((costPerTicket * noOfSeats) * 0.02) + (costPerTicket * noOfSeats));
	}
}
