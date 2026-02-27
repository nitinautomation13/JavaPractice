package Oops_Constructor;

public class Employee {

	public Employee() { // 0 parameter - default constructor 
		System.out.println("default constructor..........");

	}

	public Employee(int a ) { // 1 Parameter
		System.out.println("1 Parameter.......... " + a);
	}

	public Employee(int a, String b) { // 2 Parameter 
		
		System.out.println("2 Parameter .......... " + (a+b));

	}
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee (10, "Tom"); // if object has no parameter then default construct will be called
		
		// if i am passing 10 over there immediately it will check do you have any constructor where int variable is there or int parameter is there.
		//
		
		Employee e2 = new Employee (10);
	}
}
