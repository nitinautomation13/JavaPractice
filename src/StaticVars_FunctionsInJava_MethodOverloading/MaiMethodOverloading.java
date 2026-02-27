package StaticVars_FunctionsInJava_MethodOverloading;

/* Can we overloaded method ?
 * Yes main method can be overloaded and static method can we also overloaded.
 * static method can be overloaded but static method can not be overridden
 * main method by default static in nature
 * ex -: public static void main(String[] args)
 * public static void main(int a)
 *
 *Why main method void in nature ?
 *main method is not responsible for business logic this is not feature of the class , this is just only calling method . this should just call the
 *method and it should not return anything
 */

public class MaiMethodOverloading {

	public static void main(String[] args) {
		System.out.println("my main method");
	}
	public static void main(int a) {
		System.out.println("my main method : " +  a);
	}
	public static void main(int a, int b) {
		System.out.println("my main method : " +  a+b);
	}
	
	public static void main(int args[]) {
		System.out.println("my main method");
	}
	
	/* When i run above method which method will be called ? 1st or 2nd or 3rd.(this is not practical use case for interview only
	 * but programmatically we can do it)
	 * JVM will check that do you have main method
	 * whenever you have multiple main method it will not execute order or sequence basis it will always check
	 * main method with one array String parameter like line number 14 here. it will not call 17 and 18 method these two
	 * method normal method of the call now .
	 * java will always check where is my public static void main one array string parameter and then jvm will always
	 * call this (14) method .
	 */
	
	// i am creating one more method and this i will give you something lets say returning tom here .so what will
		// return type of this method.String in nature bcz it's string return
	/*As we can see that line 23 and 46 given error so here this is not overloading this is duplicate method i have created does'nt matter this 
	 * method returning tom or string . this method is having same method name and same parameter i have supplied here 
	 *  public static void main(int a, int b) {
		System.out.println("my main method : " +  a+b);
	}
	 * public static String main(int a, int b) { 
		System.out.println("my main method : " +  a+b);
		return tom;
	 */
	// lets see below i am not suppling anything so now below method is also overloading. this is also a main method this method also give tom here
	// with zero parameter.
	public static String main() { 
		
		return "tom";
	}
}
