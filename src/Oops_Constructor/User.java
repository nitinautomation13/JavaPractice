package Oops_Constructor;

public class User { //1st we have a private variables then we have a constructors for the 1st time user creation then we have
	// a getter and setter also available if we want to fetch the value call the get method and if you wan to set the value call the set method.
	// when i create the object these are the 4 restriction we have given on creation of object.
	// Can we remove constructor and user getter and setter so its not a good practice otherwise will i restrict 
	//if don't create any constructor in the class default constructor already. it means we trying to create number object unnecessary
	//problem with when we give liberty to the user . user will create n number of object 
	
	private String name;
	private int age;
	private String city;
    
	// Construction is helping to set the class variable so it behaving like setter for me 
	
	public User(String name , int age) {// same name i want to given to line number 5 and the same age i want to given line 6, so
		                                // for this we this which keyword we need to user answer is this keyword .
	// this keyword can we used in method/function , and it can we used in the constructor also to initialize the call variable.
		
		this.name = name ;// so it means this . class variable is equal to local variable that we are passing it .
		this.age = age; // so it means this . age variable is equal to local variable that we are passing it .
		
		// so it will go the line number 9 in user class so what is this name , name is tom and age is 10 , same name tom will we given to class variable
		// so this name is equal to Tom and it will give to line 5 and age equal to 20 and it will give to line 6.
		
		
		}
		
	public User(String name) {
		
		this.name = name;
	}

	public User(String name, int age, String city) {// FULL PARAMATERIZED CONSTRUCTOR 
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public User(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public void setName(String name) { // whenever we want to update the user we need a setter.
		this.name = name ;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}
	// so above is my getter which is public in nature so which is internally accessing this name (by clicking line 23 name ctrl we can check )
	//private variable, so as a user i will be calling get name. so in test user we will get TOM by using u1 .getName.
	
	
	public int getAge() {
		return age;
	}
		
	public String getCity() {
		return city;
	}
		
	
}
