package JavaSessions;


//WAP a program to find out whether number is even or odd - return true/ false

public class Number {
	
	public boolean iseven(int num) {
		boolean result = (num % 2 == 0);
		return result;
	}

	public static void main(String[] args) {
		
		Number obj = new Number();
		
		boolean b1 = obj.iseven(10);
		System.out.println("Number is even :" + b1);
		
		boolean b2 =obj.iseven(7);
		System.out.println("Number is odd : " + b2 );
		

	}

}
