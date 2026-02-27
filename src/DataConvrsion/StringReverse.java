package DataConvrsion;

public class StringReverse {
	
	//For this better to create function/method we will not write business logic inside main method
	
	public static String reverse(String str) { // this reverse method says give me the string, any string whatever given me to me then i will reverse it
		//and return it .this method also will give me a string so later on initiated of void we write string .
		//then line 7 reverse method we will call it in the main method with the different date , that should be our approach.
		//String str = "selenium" (sample string we are taking )
		//so if we writing selenium then we have to convert into the reverse order
		//string is the collection of multiple characters
		//index of s is 0, e is 1 . so the length of the string is 8.
		//so here we are passing string so this str (line 7) could be anything like nitin, naveen, java , playwright can be any string
		// so i will calculate it's length, so i am calculating length variable
		
		int len = str.length();//8
		
		// so for this we need to write a for loop bcz i need to iterate this string, so we need to write a for loop for 0 to 7 or 7 to 0 bcz we need to pring
		//reverse order so obviously we need to print not 0 to 7 , we need to print 7 to 0.
		
		String rev = "";
		
		for(int i = len -1; i>=0; i --) {
			
			rev = rev + str.charAt(i);//""+m+u+i+n+e+l+e+s
		}
		return rev;
			
		// so if we writing len = 8 so it means it will start 8 and there is no 8, so it might give array index out of bond exception or siob.
		//so we have to always write len-1 .
		//so first calculate length and then lenght -1, so length -1 we have to start 7 .
		//so for loop says you have to put condition so here i am writing a condition i>=0, why = to 0 so first time 7 so 7 is greater than = to 0
		//why = also bcz 0 is available s.so we have to include 0 as well. after 7 we have to decrease the value like 6 then 5 and so on
		//once the condition satisfied it will reach to line 23 .then we used str.charat method
		//charAt method tell that character available specific index.
		//so the value of i first time i = 7, so here i am saying whatever value is available in the 7th number please give me so 7th position is m.
		//so before just above the for loop we are creating an one extra variable lets see reverser variable, in the beaning rev variable is nothing.
		/* The value of i at this moment 7 then 7 is >= 0 yes the condition is satisfied, the moment condition is satisfied immediately go to the line
		 * 26. line 26 says rev is = to rev (current value rev is nothing) + the value i is 7 so it means (charAt is available at 7th position)
		 * "" + m = m, so the value of rev now m.
		 * so decrease the value of i (i--) initially i was 7 but now it's 6 and 6 is => 0 yes condition is again satisfied so current value of rev
		 * m now so it says character at 6th position u (m + u)
		 * so after 0 again (i--) so again the value of i is -1 so -1 is >= 0 the condition is false and immeditely come to the for loop and it will go
		 * to the line number line 28. immediately we say that work is done we return the rev variable. the latest value of rev is whatever  we create at
		 * line 26
		 */
		
		
		
	}
	
	
	public static void main(String[] args) {
          
		String s1 = reverse("selenium");// so we are passing selenium to str
		System.out.println(s1);
		//the value of s1 whatever giveing back to me line 28 , will be store in s1 (line 56) and then s1 wil be reverse string
		
		s1 = reverse("testing");
		System.out.println(s1);
		
		s1 = reverse("T");
		System.out.println(s1);
	}

}
