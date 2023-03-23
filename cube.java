
import java.util.Scanner;

public class cube {
	public static void main(String args[]) {
		//int n, cube;
		
		 Scanner s = new Scanner(System.in); 
		 System.out.print("Enter the number:");        
		 int n = s.nextInt();
		 
		 int cube = n*n*n;
		 System.out.println("The cube of given number is :"+cube);
	}

}