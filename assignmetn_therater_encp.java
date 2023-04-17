package Encapsulation;
import java.util.Scanner;

class Movie {
    private String movieName;
    private String movieStartTime;
    private String movieEndTime;
    private double movieTicketPrice;
    
    public void setMovie(String name, String startTime, String endTime, double price) {
        this.movieName = name;
        this.movieStartTime = startTime;
        this.movieEndTime = endTime;
        this.movieTicketPrice = price;
    }
    
    public String getMovie() {
        return "Movie Name: " + this.movieName + "\n" +
               "Start Time: " + this.movieStartTime + "\n" +
               "End Time: " + this.movieEndTime + "\n" +
               "Ticket Price: " + this.movieTicketPrice + "\n";
    }
}

public class assignmetn_therater_encp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();
        
        System.out.print("Enter movie start time: ");
        String movieStartTime = scanner.nextLine();
        
        System.out.print("Enter movie end time: ");
        String movieEndTime = scanner.nextLine();
        
        System.out.print("Enter movie ticket price: ");
        double movieTicketPrice = scanner.nextDouble();
        
        Movie movie = new Movie();
        movie.setMovie(movieName, movieStartTime, movieEndTime, movieTicketPrice);
        
        System.out.println("\n" + movie.getMovie());
    }
}

