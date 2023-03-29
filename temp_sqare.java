// find out the area and parameter of square using method and variable (static and not static both)
package class_assignment;

public class temp_sqare {
	
	int length;
	
    public temp_sqare(int length) {
        this.length = length;
    }

    public int getArea() {
        int area = length * length;
        return area;
    }

    public int getParameter() {
        int parameter = 4 * length;
        return parameter;
    }

    public static void main(String[] args) {
    	temp_sqare square = new temp_sqare(7);
        int area = square.getArea();
        int perimeter = square.getParameter();
        System.out.println("Area of the square is: " + area);
        System.out.println("Parameter of the square is: " + perimeter);
    }
}
