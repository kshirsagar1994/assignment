package interitance_HAS_A;

//Employee class
class Employee {
 long employeeId;
 String employeeName;
 String employeeAddress;
 Long employeePhone;
 double basicSalary;
 double specialAllowance = 250.80;
 double hra = 1000.50;

 // Overloaded constructor
 public Employee(long id, String name, String address, Long phone) {
     this.employeeId = id;
     this.employeeName = name;
     this.employeeAddress = address;
     this.employeePhone = phone;
 }

 // Method to calculate salary
 public void calculateSalary() {
     double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
     System.out.println("Salary: " + salary);
 }
}

//Manager class
class Manager extends Employee {
 public Manager(long id, String name, String address, Long phone, double salary) {
     super(id, name, address, phone);
     this.basicSalary = salary;
 }
}

//Trainee class
class Trainee extends Employee {
 public Trainee(long id, String name, String address, Long phone, double salary) {
     super(id, name, address, phone);
     this.basicSalary = salary;
 }
}

//InheritanceActivity class
public class InheritanceActivity_Employee {
 public static void main(String[] args) {
     // Test case #1
     Manager manager = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
     manager.calculateSalary();
 }
}

