package DataConvrsion;

public class SingleStrRev {
	
	
	
	public static String reverse(String str) {
		int len = str.length();
		if(len == 1) {
			return str;
		}
		
	String rev = "";
		
		for(int i = len -1; i>=0; i --) {
			
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		String s1 = reverse("selenium");
		System.out.println(s1);
		
		
		s1 = reverse("testing");
		System.out.println(s1);
		
		s1 = reverse("T");
		//this particular T is given to str,it will check length equal to 1, 1 is ==1 condition is satisfied,
		//immedietely rtrun , same t will be given back to s1 (line 30). and also it will not go to the line number 15.
		// we optimized this code bcz we don't want to run my for loop unneccesary.
		//lets see if i am passing selenium once again to str , length will be 8, 8 is == 1 no so immedietly it will go to for loop.
		System.out.println(s1);

	}

}
