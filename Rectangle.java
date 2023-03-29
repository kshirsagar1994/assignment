package com.cognizant.shapes;

public class Rectangle {
	
	 private int length, breadth;
	   
	    public Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public void calculateArea() {
	        int area = length * breadth;
	        System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
	    }

}
