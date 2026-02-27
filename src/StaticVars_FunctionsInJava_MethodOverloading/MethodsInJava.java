package StaticVars_FunctionsInJava_MethodOverloading;

public class MethodsInJava {
	
	//Method/Function - logic written in a block
	// you can call the block
	// Static/Non-static
	//can not create a method inside the main method
	//JVM will always go to the main method inside the main method (we have not written anything that's why blank is coming in the console). JVM will not
	// go to the test method.
	//to call the non static method - we have a create a object of class name inside the main method
	//duplicate methods are not allowed
	//but we can over load a methods
	//method should be parallel to each other// independent to each other
	

	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava ();
		obj.test();// calling a method
		
		// calling a method - Java will come inside the main method it will create a object immediately java will create photocopy of test and sum
		           // then will given to this obj
		          // the moment i create the object what will happen inside the memory (we don't have any template variables in this class) but object will be
		// created line number 18 - java will create the object inside the heap memory and which refereed by obj in static memory and then this method will be
		//Available inside the object so java will create photocopy of test method and sum method and will given to inside the object . how will call you this
		//test method
		//this method has to call obje.test and obj.sum
		
		int c = obj.sum();
		System.out.println(c);
		
		/* this time sum method is getting call and a , b , z printed and z equal to 30 and 30 will be given to obj.sum so return means i will give you
		 * something when you call sum function it will give you z over here all the time obje.sum is 30 and the same 30 will given to c and 
		 * then c will be printed over here 
		 * can i write string in place of int no i can not why bcz obj.sum when you call this function it will given me int. so whenever you holding some 
		 * parameter like c (holding parameter) .
		 * when you call the function and you are getting something so you have to get same variable type
		 * double can hold integer and integer together.
		 * so you have to store same type of data
		 * always call the function and store in the variable and then decide what do you want to do this variable like below s1 is variable
		 * */
		
		
		String d = obj.getTrainername();
		System.out.println(d  + " = from Naveen Automation Lab ");
		
		String s1 = obj.getTrainername();
		if(s1.equals("Naveen")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		int s2 = obj.add(10, 20);
		System.out.println(s2);
		
	}

	// 1. no input and no return
	// test is the method name and after that put these two () here it means you creating method or function here
	// this method does not return anything whenever method is written in declare void keyword it means this method can return anything.
	// return should be last statement in your method
	
	
	public void test() {
		System.out.println("test method");
		
	}
	 //2. no input but some return
	// Void - A function is declared with void it means it can not return anything
	// it means if function is declare with void you can not write return keyword here.
	// so in the below i have to remove void from here what should i need to write so i need to check what exactly this method is returning
	// this method is returning z and the data type of z is integer so we have to write int in place of void
	// what is the return type of this method - so answer is int
	// main method void in nature it means main method will not return anything and inside the main method you will never written return keyword
	// or any written statement .
	
	
	
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		// these are local variable (a & b) they have created inside the method only
		int z = a+b;
		return z;
		
		
	}
	
	public String getTrainername() {
		
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
		
	}
	
	//Function can not return multiple value at a time
	//only return one value at a time
	
	// 3. Some input and some return
	
	public int add(int a , int b) {
		
		System.out.println("add method");
		int sum = a+b; // whatever give i will add them and then store them in a sum variable and then return sum from here
		return sum;
		
	}
	
	
}
