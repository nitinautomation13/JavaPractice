package StaticVars_FunctionsInJava_MethodOverloading;

public class Ecomm {
	
	// method overloading - always happen with in the same class when we have different method
	// within the same class when we have same method name 
	//1. with the same 
	//2. with different parameter
	//3. with different types of parameter and number of parameter
	//4. the sequence of parameter also should be different
	//5. you have to overload a features just like below login where different condition (customer can login default , different un and password and so on)
	// method overloading also called polymorphism
	// compile poly+morphism --> compile time polymorphism means compiler is deciding at compile time only it is not deciding at run time which method will
	// be called . so complier will say you're calling obj.login with two string parameter fine so we are going to call this method (line number 49 method)
	//it will not decided at run it already decided that this method will call line number 49 (ex)
	// Polymorphism means method overloading and method overriding there is no keyword like polymorphism in java
	// Method overloading also call static polymorphism 
	// Practical exmple of method overloading on Ecomm application - which features you will over laod as java developer - Search
	// default search , prodcut name ,String name,  int price , seller name
	// Anther example - Uber app various ways booking method (defualt booking , car type, then from and to destination )
	// payment method - you can make the payment credit card , upi , with bank transfer , with some account number.
	//Method overloading - A method can be overloaded with same method name and different types of parameter and number of different types of
	//parameter you can pass so that mean method is overloaded and duplicate method not allowed in java.
	
//	public void login() { //0
//		System.out.println("login");
//		
//	}
//
//    public void login(int a) { //1
//    	
//    	System.out.println("login" + a );
//		}
//    
//  public void login(int a, int b) { //2
//    	
//    	System.out.println("login" + a + b );
//		}
//  
//  public void login(int a, String b) { //2
//  	
//  	System.out.println("login" + a + b );
//		}
//  
//  public String login(String a, int b) { //2
//	  	
//	  	System.out.println("login" + a + b );
//	  	
//	  	return a+b;
//			}
	
	// Practical example 
	
	public void login() {
		System.out.println("Default login");
	}
 
	public void login(String un, String pw) { // whenever you creating function this user name and password these are called parameter
		System.out.println("Login with = "  +  un  +  pw);
	}
	
	public void login(String un, String pw, String role) {
		System.out.println("Login with " + un + pw + role);
	}
	
	public void login(String un, String pw, String role, int otp) {
		System.out.println("Login with " + un + pw + role + otp);
	}
	
	public void login(long ph, int otp) {
		System.out.println("Login with " + ph + otp);
	}

	
	
	public static void main(String[] args) {
		
		Ecomm obj = new Ecomm();
		obj.login("admin", "admin123"); // when you call them with actual value these are called argument
		obj.login("Nitin", "Hays@1234", "admin");
		obj.booking("BMW" , "REWA", "Satna");
		
	}

	public void booking() {
		
		System.out.println("default booking");
		
	}
	
    public void booking(String carType, String from, String to) {
    	System.out.println("Car Type :" + carType);
    	System.out.println("From : " + from);
    	System.out.println("to : " + to);
		
	}
	
    public void booking(String carType, String from, String to, int users) {
		
   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
