package Oops_Encapsulation;

public class Company {
	
	private String name; // IBM
	private int empCount;
	private String hq;
	
	// we should not create main method inside the template class, this is just calling method .
	//we have to create separate user class so that somebody will use this Company class object and 
	// they will be start calling these features or variable

//	public static void main(String[] args) {
//		
//		Company obj = new Company();
//		obj.name = "IBM";
//		obj.empCount = 1000;
//		obj.hq = "Rewa";
//		
//		System.out.println(obj.name);
//		
//
//	}
	
	//setter and getter methods --> public
	// how will we create above method
	
	// below i want to give this String name to line 5 name , utlimately our targate is that by using public layer (28) we have to set line 5 name .
	// so i will calling setNmae function and give some name lets IBM and the same IBM given to 
	// this.name line 36 and i want to give line 5. so how will we get this .
	// this keyword is representing the current class object .
	//so this keyword is says i am representing the company class object , so with this current class object we can access all the properties
	//all the class name .
	
	public void setName (String name) { // Initially Void in nature , this public void setName saying give me some name so string name we will give.
		this.name = name; // so this statement said this.class variable = local variable .
	}
	
	public String getName () { // getName method will not take any parameter and getName method said we will return the name which name (line 5)
		 return name ; //getName method return name and name we have already set it will return IBM
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}
	
	//around this name (line 5) private method i have created a two public wrapper or method 
	// so set means set the value but you can not set directly and you have to set it via method .
	//get the value it means you can not get it directly and you have to get it via get name . 
	
	public String getCompanyInfo() { // getCompanyinfo behaving like getter for me (all the company information)
		String info = name + empCount + hq;
		return info;
				
	}
	
	
	
	
	

}
