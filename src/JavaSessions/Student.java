package JavaSessions;

public class Student {
	
	String name;
	int age;
	
   public static void main(String[] args) {
	   
	 int totalstudents = 0;
	 
	 
	 //create two objects
	 
	 Student s1 = new Student();
	 s1.name  = "Neelesh";
	 s1.age = 35;
	 totalstudents++;
	 
	 
	 Student s2 = new Student();
	 s2.name  = "Neeta";
	 s2.age = 34;
	 totalstudents++;
	 
	 // prints the details 
	 
	 System.out.println(s1.name + "- " + s1.age);
	 System.out.println(s2.name + "- " + s2.age);
	 System.out.println("Total Students : " + totalstudents);
	 
	 // modified age of one student
	 s1.age = 38;
	 System.out.println("Updated : " + s1.name + " - " + s1.age);
	 
	 // create anther student
	 Student s3 = new Student();
	 s3.name  = "Nitin";
	 s3.age = 35;
	 totalstudents++;
	 
	 // print the new student details and updated count
	 System.out.println(s3.name + " - " + s3.age);
	 System.out.println("Updated Total Students: " + totalstudents );
	 
		

	}

}
