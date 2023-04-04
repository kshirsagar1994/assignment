//tab 1:Aggregation_HAS_A_ex
package interitance_HAS_A;

public class Aggregation_HAS_A_ex {
	public static void main(String[] args) {
		Address a=new Address("solapur","maharashtra","india");
		Student s=new Student(01,"Ajay", a);//'a' is for address
		
		s.show();
	}

}

/*
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

//tab 3: for  Aggregation_HAS_A_ex
package interitance_HAS_A;

public class Address {
	String city,state,country;
	
	
	Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;		
	}
}
*/