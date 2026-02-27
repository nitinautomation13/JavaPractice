package ArraysConcept;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		//arrays : collection/data structure -: which can hold similar data type of values
		
		//Declaration : 
		//1. Using new keyword :
		
		//limitation of arrays:
		//size is fixed
		//it can store similar type of family data
		
		int i[] = new int[5];//the moment we write 5 here then there is 5 segment in the memory 0 to 4.
		//in java we don't have negative indexing like i[-1]
		
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println("length = " + i.length);
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (i.length-1));
		
		System.out.println("-----------------------");
		
		System.out.println(i[0]);
		System.out.println(i[4]);
		//System.out.println(i[5]);// out of range it will give ArrayIndexOutOfBoundsException error.
		
		//to pint all the values of array : for loop
		
		for(int k=0; k<=i.length-1; k++) {
			// first time what will be happen k = 0, 0 less than equal to 4 condition is immediately satisfy and it will
			//come inside the for loop and i[0] bcz k =0, and i [0] so 10 will be printed in the console after that
			//increase the value by one bcz k++ so i[1], and the value of i[1] = 20.
			System.out.println(i[k]);
		}
		
		System.out.println("-----------------------");
		
		// for each loop
		
		for(int e : i) {// it means e you have to go i then we start for loop, we are e you will go to the i , so e will go
			//to the ith position immediately and whatever value present that it will fetch that and presented that..
			
			System.out.println(e);
			
		}
		
		System.out.println("-----------------------");
		
		System.out.println(Arrays.toString(i));
		
		System.out.println("-----------------------");
			
		int p[] = new int[50];
		
		p[0] = 100;
		p[3] = 200;
		
		System.out.println(p[0]);
		System.out.println(p[1]);// default value of int is zero (0)
		System.out.println(p[2]);// default value of int is zero (0)
		System.out.println(p[3]);
		
		// for loop we used when the number of iterations are fixed
		
		byte b[] = new byte[2];
		b[0] = 10;
		b[1] = 20;
		System.out.println(Arrays.toString(b));
		
		System.out.println("-----------------------");
		
		//double array
		
		double d[] = new double[3];// whenever we create a array with new keyword we have supply array with length like 3 here
		// three segment will be created zero to two
		System.out.println(Arrays.toString(d));// default value of double 0.0
		
		d[0] = 23.44;
		d[1] = 25.55;
		d[2] = 55.40;
		
		System.out.println(Arrays.toString(d));
		
		for(double q : d) {
			System.out.println(q);
		}
		
		System.out.println("-----------------------");
		
		float t[] = new float[2];
		t[0] = 10.99f;
		t[1] = 120; // its treated as 120.00
		
		System.out.println(Arrays.toString(t));
		System.out.println(t[0] + t[1]);
		
		System.out.println("-----------------------");
		
		//Default value of char is space
		
		
		char ch[] = new char[4];
		ch[0] = 'a'; // Character should be written in single code and only one character allowed
		ch[1] = 'B'; // default value of character is space
		ch[2] = '0';
	    ch[3] = '$';
	    
	    System.out.println(Arrays.toString(ch));
	    
	    for(char e:ch) {
	    	System.out.println(e);
	    }
	    System.out.println("-----------------------");
	    
	    String browser[] = new String[4];
	    
	    browser[0] = "chrome";
	    browser[1] = "firefox";
	   // browser[2] = "opera";
	    browser[3] = "safari";
	    
	    System.out.println(Arrays.toString(browser));
	    System.out.println(browser.length);
	    
	    System.out.println(browser[1]);
	    System.out.println(browser[2]);
	    
	    System.out.println("-----------------------");
	    //String comparison we always use .equals method
	    // for index loop
	    
	    for (int k=0; k<=browser.length-1; k++){
	    	System.out.println(browser[k]);
	    }
	    
	    System.out.println("-----------------------");
	    
	    for (String e : browser) {
	    	System.out.println(e);
	    	if(e.equals("firefox")) {
	    		System.out.println("launch firefox");
	    		break;
	    	}
	    }
	    
	    System.out.println("-----------------------");
	    //Object is a super class of all the classes in java by default.
	    //Object array:
	    //object is non primitive and for non primitive default value is null
	    //object can store different types of heterogeneous data 
	    Object empData[] = new Object[5];
	    System.out.println(Arrays.toString(empData));
	    
	    empData[0] = "Sweta";
	    empData[1] = 30;
	    empData[2] = 45.55;
	    empData[3]	='f';
	    empData[4] = true;
	    
	    System.out.println(Arrays.toString(empData));
	    
	   for (Object e : empData) {
		   System.out.println(e);
	   }
	}

}
