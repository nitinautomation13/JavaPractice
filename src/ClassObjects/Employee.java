package ClassObjects;

public class Employee {
	
	// default values are only applicable class level
	// class is a blueprint of the all objects of the same category , from the single class we can create n number of objects
	//but class is not collection of all the object
	// class is a concept (we can not say laptop is a physical entity i can say for ex mackbook pro is physical entity which is physicaly available)
	//from this Employee class we can create a n number of epmployee and template will be common for all the object
	// class variable (ex name ) will be common for all the object, but their values will be different
	//  class is template, java will call the main method or jvm or user will
	// call the main method and responsible for creating the object .
	// class variable also called class properties and here four properties we have define
	//class variable - define class variable after the class
	//why they are calling class variable bcz they are immediately creating after the class
	//whenever we are declare any variable inside the class these are called class variable or global variable
	
	
	String name;
	int age;
	double salary;
	boolean isactive;
	
	public static void main(String[] args) {
		
		String name ="peter"; // this is local variable (we can not write default variable without it's value)
		// local variable never part of object whenever you want to print them print directly
		//local variable just to created local purpose or logic purpose
		
		System.out.println(name);
		
		
		// create a object -> using new keyword
		//why are we creating employee class object inside the main method - bcz class is not responsible for creating the object
		//who is calling this main (line 22) method java will call the main method or jvm or user will call this main method
		Employee e1 = new Employee();// the moment we write this immediately inside the memory one object will be created.
		
		e1.name ="Nitin";
		e1.age =35;
		e1.salary = 25.55;
		e1.isactive = true;
		//default values are only applicable from class variables
		System.out.println(e1.name);//default of the string is always null
		System.out.println(e1.age);//integer default value is zero
		System.out.println(e1.salary);
		System.out.println(e1.isactive);
		
		Employee e2 = new Employee();
		
		e2.name = "Amrita";
		e2.age = 32;
		
		System.out.println(e2.name + " " + e2.age + " " + e2.isactive + " " + e2.salary );
		
		e2.salary = 28;
		
		System.out.println(e2.name + " " + e2.age + " " + e2.isactive + " " + e2.salary );
		
		// null reference object always get null pointer exception
		
		
		
		
		
		
	}

}
