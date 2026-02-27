package JavaSessions;

public class Calculator {
	
	public int add(int a , int b) {
		System.out.println("addition: ");
		int sum = a+b;
		return sum;
	}
	
	public int subtraction(int a , int b) {
		System.out.println("subtraction: ");
		int minus = a-b;
		return minus;
	}
	
	public int divison(int a , int b) {
		System.out.println("divison: ");
		int div = a/b;
		return div;
	}
	
	public int multiplication(int a , int b) {
		System.out.println("multiplication: ");
		int div = a*b;
		return div;
	}
	

	public static void main(String[] args) {
		
		// Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method.
		Calculator c1 = new Calculator();
		
		int c2 = c1.add(10, 20);
		System.out.println(c2);
		
		int c3 = c1.subtraction(20, 10);
		System.out.println(c3);
		
		

	}

}
