package DataConvrsion;

public class Employee {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20);//10020
		//but we need 120 how to do this 
		//So String to int conversion we used parseInt method 
		//how to covert string to int so we user int to parseint method
	
		
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);//120
		
		String y = "200A";
		int j = Integer.parseInt(y.replace("A", ""));
		System.out.println(j);
		
		String z = "200$";
		int a  = Integer.parseInt(z.replace("$", ""));
		System.out.println(a);
		
		// String to double 
		String price = "12.33";
		System.out.println(price + 20);
		
		// but i want o/p 32.33 for this we need to convert string into double
		
		double pr = Double.parseDouble(price);
		System.out.println(pr +20 );// 32.33
		
		//int to String:
		
		int finalAmout = 1000;
		String amt = String.valueOf(finalAmout);
		System.out.println(amt + 20);
		int a1 = Integer.parseInt(amt);
		System.out.println(a1 + 20);
		
		//String to boolean
		
		String remote = "true";
		//Boolean is class that is why B capital
		
		if(Boolean.parseBoolean(remote)) {
			System.out.println("run my test cases");
			}
		
		else {
			System.out.println("ignore test cases");
		}
		
		//boolean to String
		
		boolean flag = false; // boolean is a keyword
		
		// false --> "false"
		
		//whenever we covert anything to string we always used string.valueof method.
		String fg = String.valueOf(flag);
		System.out.println(fg.length());
		
		//primitive date type = byte, short,int , long , double , float , boolean, char
		//Interger, Boolean, Byte, Short, Double --> wrapper classes
		
		
		
		
		
		
		
		
		

	}

}
