import java.util.Scanner;

class PrimeNum{

public static void main(String args[]) {

	int num, count=0;

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	num=s.nextInt();

	for (int i=2; i<num; i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}

	 if(count==0)
		System.out.println("\n The number is prime");
		
	 else
		System.out.println("\n The number is not prime"); 


}
}
