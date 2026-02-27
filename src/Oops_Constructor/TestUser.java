package Oops_Constructor;

public class TestUser {

	public static void main(String[] args) {
	
		User u1 = new User("Tom", 10); // so now the error is gone immediately found java respective constructor .
		
		// the moment i create the object the respective constructor will be called , so i just press ctrl and click on User
		// so it will go the line number 9 in user class so what is this name , name is tom and age is 10 , same name tom will we given to class variable
		// so this name is equal to Tom and it will give to line 5 and age equal to 20 and it will give to line 6.
		// How will i access them ? we can access directly u1. . but there are private variable so what should do now , due private in nature i can 
		//not access anything in the class properties , so do i need to create a getter and setter or only getter ?
		// so answer is only getter . so can we say line 9 to 14 in user class behaving setter for me .
		
		/**
		 * so through the constructor (User) line 7 TOM will be given to line 9 name and same local variable will be given to class variable and 
		 * when we call this TOM immediately i will return the same class variable name that is TOM , so TOM will be given to you.
		 * Execution flow:
		 * 1. JVM sees U1.getName()
		 * 2. Control goes to User class
		 * 3. getName Method runs
		 * 4. it returns the values of class variable name
		 * 5. That the value is "TOM"
		 * 6. syso prints it on the console
		 */
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		
		u1.setName("Nitin Shukla");
		System.out.println(u1.getName());
		/**
		 * so through the constructor (User) line 7 (age 10) will be given to line 9 age and same local variable will be given to class variable and
		 * when we call this age (10) immediately i will return the same class variable age that is 10, so 10 will given as a output.
		 */
		
		User u2 = new User("SONU");
		
		System.out.println(u1.getName());
		
		User u3 = new User("SONU", 10, "REWA");
		System.out.println(u3.getAge());
		System.out.println(u3.getName());
		System.out.println(u3.getCity());
		
		/**
		 * so through the constructor (User) line 39 City will be given to line 27 city and same local variable will be given to class variable and
		 * when we call this city Rewa immediately i will return the same class variable city that is REWA, so Rewa will given as a output.
		 */
	}

}
