package Assignment2.organization;

public class Organization {
public static void main(String[] args) {
	Manager manager = new Manager(121, 27000, 1000);
	Labour labour = new Labour(202, 15000, 2000);
	
	System.out.println("Salary of Manager: "+manager.calculateSalary());
	System.out.println("Salary of Labour: "+labour.calculateSalary());
}
}
