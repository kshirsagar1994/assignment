
import java.util.Scanner;

public class PositiveNagativeNo {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in); 
		 System.out.print("Enter the number:");        
		 int num = s.nextInt();
		

		if(num>0) 
		{
		System.out.println("The number is positive");
		}
			
		else if(num<0) 
		{
		System.out.println("The number is negative");
		}
		
		else  
		{
		System.out.println("The number is Zero");
		}

	}

}
