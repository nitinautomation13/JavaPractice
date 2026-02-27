package StaticVars_FunctionsInJava_MethodOverloading;

public class StaticMethods {

	// Static method not goes to the heap memory it goes to cma just like a static variable
	
	public static void sendMail() {
		System.out.println("Send Mail");
	}
	
	public void getMail() {
		System.out.println("Get Mail");
	}
	
	public static void main(String[] args) {
		StaticMethods obj = new StaticMethods();
		//non static method by using obj refrence name
		
		obj.getMail();
		
		// Static method can we access in 3ways
		//1. By using class name that is recommended 
		
		StaticMethods.sendMail();
		
		//2.call directly
		sendMail();
		
		//3. by using refrece variable name and this is not recommended
		// below yellow line warning will come - 
		//The static method sendMail() from the type StaticMethods should be accessed in a static way
		
		
		obj.sendMail();
		
	
		

	}

}
