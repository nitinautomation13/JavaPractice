package Collection;

import java.util.ArrayList;

public class DyanamicArray {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		
		// insertion
		
		list1.add(15);
		list1.add(25);
		list1.add(35.5);
		list1.add(false);
		list1.add("selenium");
		list1.add('c');
		
		System.out.println(list1.size());
		System.out.println(list1);
		
		System.out.println(list1.get(4));
		
		list1.remove(1);
		
		System.out.println(list1);
		
		
		list1.add(2, "Aditri");
		System.out.println(list1);
		
		System.out.println(list1.contains("selenium"));
		
		System.out.println(list1.contains("Selenium"));
		
		System.out.println(list1.isEmpty());
		
		
	}
	

}
