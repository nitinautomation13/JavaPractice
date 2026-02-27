package ArraysConcept;

import java.util.Arrays;

public class ArrayLiterals_ObjectArrayLiterals {

	public static void main(String[] args) {
		//Array literals : static array
		//but number of element are already known
		//if we already know about how many number of elements are available in this particular array then it will
		//become array literals
		
		int num[] = {10, 20, 30, 40, 50};//0-4
		//length = 5
		//Hi index = 4
		
		System.out.println(num[0]);
		System.out.println(num[4]);
		//System.out.println(num[5]);
		
		//Array literals vs creating the array using new keyword
		//creating the array using new keyword - when we are not sure about how many values we want
		
		int i[] = new int[10];
		i[0] = 10; 
		i[1] = 20;
		i[2] = 30;
		System.out.println(Arrays.toString(i));
		
		//rest of the thing it will give 0 so by default zero is coming if not assign any value
		
		i[3] = 40;
		i[4] = 50;
		System.out.println(Arrays.toString(i));
		//maximum we can store it up to 10 values in this array , we can not go beyond that 
		
		//rest of the seven value from index 4 to 9 we will decide later may when needed we start filling
		//or when we not sure about all the element in the array then we will go with the new keyword
		//Array literals - when we sure about how many element or arrays i am having it or known about it then in that
		//case we will go with the array literals but both are static array.
		
		System.out.println("...........................");
		
		double salary[] = {10.22, 12.45, 14.55};
		System.out.println(salary.length);
		
		System.out.println("...........................");
		
		String browser[] = {"chrome", "firefox", "edge", "safari"};
		System.out.println(Arrays.toString(browser));
		System.out.println(browser.length);
		browser[0] = "chromium";
		System.out.println(Arrays.toString(browser));
		
		for(String e :browser) {
			System.out.println(e);
		}
				
		Object empData[] = {"Tom", 30, 12.33, 'm', false};//0-4
		
			System.out.println(Arrays.toString(empData));
			System.out.println(empData.length);
			
			empData[0] = "Nitin";
			empData[4] = true;
			System.out.println(Arrays.toString(empData));
			
			for(Object e : empData) {
				System.out.println(e);
			}
			
			for(int p=0; p<empData.length; p++) {
				System.out.println(empData[p]);
			}
		
		int number[] = {10, 20, 30, 40, 50};//0-4
		//print this in reverse order
		for(int k=number.length-1; k>0; k--) {
			System.out.println(number[k]);
			
		}
		
		
		
		
		
		
	}

}
