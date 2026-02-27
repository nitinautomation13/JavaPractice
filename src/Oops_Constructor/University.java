package Oops_Constructor;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	 private String name;
	 private String hq;
	 private ArrayList<String>CourseList;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public ArrayList<String> getCourseList() {
		return CourseList;
	}

	public void setCourseList(ArrayList<String> courseList) {
		CourseList = courseList;
	}

	public University(String name, String hq, ArrayList<String> courseList) {
	
		this.name = name;
		this.hq = hq;
		CourseList = courseList;
	}
	 
	 
	 

}
