package class_assignment;
import java.util.Scanner;
public class area_of_square {
	
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter length of square: ");
	        double side = input.nextDouble();

	        double area = side * side;
	        double perimeter = 4 * side;

	        System.out.println("The area of square : " + area);
	        System.out.println("The perimeter of square : " + perimeter);
	    }

}
