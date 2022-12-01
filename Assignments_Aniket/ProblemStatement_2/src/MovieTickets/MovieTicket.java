package MovieTickets;

public class MovieTicket {

	private int movieId;
	private int noOfSeats;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfSśeats() {
		return noOfSeats;
	}
	public void setNoOfSśeats(int noOfSśeats) {
		this.noOfSeats = noOfSśeats;
	}
	
	MovieTicket(int movieId, int noOfSeats)
	{
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	
	public double calculateTotalAmount() 
	{
		double price = 150.0*noOfSeats;
		price+=price*2/100;
		return price;
	}
}
