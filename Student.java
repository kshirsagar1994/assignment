//tab 2 : for Aggregation_HAS_A_ex
package interitance_HAS_A;

public class Student {
	int std_id;
	String std_name;
	
	Address add;//Aggregation
	
	Student(int std_id, String std_name, Address add) {
		this.std_id=std_id;
		this.std_name=std_name;
		this.add=add;
	}
	void show() {
		System.out.println(std_id+""+std_name);
		System.out.println(add.city+" "+add.state+" "+add.country);
	}
}
