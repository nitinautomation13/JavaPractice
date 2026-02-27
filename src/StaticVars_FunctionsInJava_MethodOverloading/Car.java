package StaticVars_FunctionsInJava_MethodOverloading;

public class Car {
	
	String name;
	int prise;
	String colour;
	static int wheels = 4;

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.name = "BMW";
		c1.prise = 2000;
		c1.colour = "Green";
		
		Car c2 = new Car();
		
		c2.name = "MARUTI";
		c2.prise = 4000;
		c2.colour = "WHITE";
		
		Car c3 = new Car();
		
		c3.name = "AUDI";
		c3.prise = 5000;
		c3.colour = "Yellow";
		
		System.out.println(c1.name + " " + c1.prise + " " + c1.prise + " " + Car.wheels);
		//whenever we access any static properties then we need to access by class name like here car.wheels
		//not by the object name bcz they are not part of the object
		
		
	}

}
