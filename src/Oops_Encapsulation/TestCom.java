package Oops_Encapsulation;

public class TestCom {

	public static void main(String[] args) {
		
		Company obj = new Company();
		
		// obj.name we can not access it's giving error 
		// we can call the set name bcz set name is publically availble 
		obj.setName("IBM"); // so what will happen setnName method will be call IBM will be given to line number 34 (String name ) and
		                    // the same IBM will be given to line number 5 .
		                    // after writing get name method then we will be getting IBM .
		                   // still we can not access obj.name bcz again that is private in nature so we will access via getter method .
		obj.setEmpCount(1000);
		obj.setHq("REWA");
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpCount());
		System.out.println(obj.getHq());
		
		String info = obj.getCompanyInfo();
		System.out.println(info);
		
		
		
		
		
	}

}
