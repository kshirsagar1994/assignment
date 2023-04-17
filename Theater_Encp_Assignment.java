package Encapsulation;

class movie{ //encapsulated class
	//private data member 
	private String movieName;
    private float movieStartTime;
    private float movieEndTime;
    private double movieTicketPrice;
    
  //public getter and setter method 
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(float movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public float getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(float movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	public double getMovieTicketPrice() {
		return movieTicketPrice;
	}
	public void setMovieTicketPrice(double movieTicketPrice) {
		this.movieTicketPrice = movieTicketPrice;
	}   
}

public class Theater_Encp_Assignment { // class to test encapsulated class
	public static void main(String[] args) {
		movie m=new movie(); //creating object
		m.setMovieName("Fast X");
		m.setMovieStartTime(9.00f);
		m.setMovieEndTime(12.00f);
		m.setMovieTicketPrice(500);
		//getting the value through getter method
		System.out.println(m.getMovieName()+" "+m.getMovieStartTime()+" "+m.getMovieEndTime()+" "+m.getMovieTicketPrice());
	}

}
