package Collection;

import java.util.Arrays;

public class StringConcept {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(9));
		
		System.out.println(str.charAt(15));
		
		// System.out.println(str.charAt(41)); //StringIndexOutOfBoundsException - out of the range
		
		System.out.println(str.indexOf('h'));
		
		System.out.println(str.indexOf('i', 2)); // This is the hard coded what if any changes in the character then we should not use
		                                        //hard coded value
		
		
		
		//If we need to find our 2nd occurrence of I then we need to follow below message 
		
	   System.out.println(str.indexOf('i', str.indexOf('i')+1));
	   
	   //str.indexOf('i')+1) = 2 -> Start the counting the 2nd position - 
	   
	   
	   // if i want to print 3rd i then we see below code
	   
	   // if the specific word or charater not present then it will give -1
	   
	   System.out.println(str.indexOf('i', 6)); // this is hard coded
	   
	   System.out.println(str.indexOf('i', (str.indexOf('i', str.indexOf('i')+1)+1)));
	   
	   System.out.println(str.indexOf("java"));
	   
	   String msg = "Welcome admin";
	   if(msg.indexOf("admin")== 8) {
		   System.out.println("PASS");
	   }
	   else {
		   System.out.println("FAIL");
	   }
	   
	   //Return type of contain is boolean
	   //Return type of contains will given integer
	   
	   String mg = "I love java programming";
	   if(mg.contains("java")) {
		   System.out.println("True");
	   }
	   else {
		   System.out.println("False");
	   }
	   
	   // trim - this method says remove the spaces from conrner
	   
	   String test = "      hello test    ";
		System.out.println(test.trim());
		
		//replace -> any space that is coming in middle of the sprint we use and also whenever any space it remove that one as well.
		
		System.out.println(test.replace(" ", ""));
		
		String dob = "28-03-1990"; // need to replace with this 28/03/1990
		
		System.out.println(dob.replace("-", "/"));
		
		String mg1 = "I love java programming";
		
		System.out.println(mg1.replace("java", "java script"));
		
		//lowercase and uppercase
		String mg2 = "I love java programming";
		System.out.println(mg2.toUpperCase());
		
		//startwith and endwith these are also two method
		//best way to comparing the string .equals method
		
		//split - always return array {split method always return string array}
		
		System.out.println("*************************");
		
		String lang = "Java_Python_JavaScript_Ruby";
		
		String lg[] = lang.split("_");
		
		System.out.println(lg[0]);
		
		System.out.println(Arrays.toString(lg));
		
		System.out.println("*************************");
		
		String top = "Nitin;Shukla;Rewa;CTS;SET;QA";
		
		String d[] = top.split(";");
		
		for(String e : d) {
			System.out.println(e);
			}
		
		System.out.println("*************************");
		
		String domain = "Aditri.Shukla.Rewa.Google.SDET.DS";
		String dom[] = domain.split("\\.");// when we write 2 backslash then this . is consider as normal .(dot)
		
		// when we write \\ that means escape the character - don't take actual meaning of the .(dot)
		
		// System.out.println(Arrays.toString(dom));
		
		System.out.println(dom[0]);
		
		System.out.println("*************************");
		
		//String xpath = "//input[@id="automation"]"; 
		// we can not put string with double quote bcz complier is assuming your string is started / here and ended = 
		
		
		String xpath = "//input[@id=\"automation\"]";
		
		System.out.println(xpath);
		
		System.out.println("*************************");
		
		String message = "I Love Java Programming";
		
		//o/p - I Love "Java" Programming 
		
		String message1 = "I Love \"Java\" Programming";
		
		System.out.println(message1);
		
		//subString - Capture the small portion of the string in large string
		
		String trMesg = "Your order id is 12345";
		
		System.out.println(trMesg.substring(3));// start from 3 up to the end of the string
		System.out.println(trMesg.substring(17));
		
		System.out.println(trMesg.substring(0, 6));// here 0 means include zero and exclude 6
		
		System.out.println(trMesg.substring(trMesg.indexOf("is"), trMesg.length()));
		
		System.out.println(trMesg.substring(trMesg.indexOf("is")+3, trMesg.length()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
