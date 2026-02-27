package Oops_Constructor;

import java.util.ArrayList;

public class TestUni {

	public static void main(String[] args) {
		
		// CourseList  the type of courselist is arraylist of the string , so we need to maintain one arraylist
		
		ArrayList<String> delhiUniCourseList = new ArrayList<String>();
		
		delhiUniCourseList.add("Physics");
		delhiUniCourseList.add("Chemistry");
		delhiUniCourseList.add("Bio");
		
		University u1 = new University("Delhi Uni", "New Delhi", delhiUniCourseList);
		
		System.out.println(u1.getName() + " " + u1.getHq());
		
		System.out.println(u1.getCourseList());
		
		
		delhiUniCourseList.add("IT");
		
		delhiUniCourseList.add(1, "Compute Science");
		System.out.println(u1.getCourseList());
		
		
		u1.setHq("REWA");
		System.out.println(u1.getName() + " " + u1.getHq());

	}

}
