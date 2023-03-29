package assingment_new;
import java.util.Scanner;

//problem stmt 1
	public class Circle {
	private float radius; //declaring instant variable radius 
	static float pi=3.5f;
	
	//default constructor 1
	Circle(){
		radius=1.5f;
	}
	//cons 2
	Circle(float radius){
		this.radius=radius;
	}
	
	//cons 3
	Circle(float radius,float pi){
		//cons chaining using cons2
		this.radius=radius;
	}
	
	//method 1
	static float CalculateCircleArea(float radius) {
		return pi*radius*radius;
	}
	
	//method 2
	static float calculateCircumferance(float radius) {
		return 2*pi*radius;
	}
	
	public static void main(String[] args) {
		
		Circle obj=new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius=sc.nextFloat();
		
		System.out.println("The area is :"+CalculateCircleArea(radius));
		System.out.println("The Circumferance is:"+calculateCircumferance(radius));
	}
	
}
