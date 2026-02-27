package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

    int a = 10;
    int b = 20;
    
    System.out.println(a==b);
    
    if (a==b) { 	
    	System.out.println("both are equal");
    }
    else {
    	System.out.println("both are not equal");
    }
    
    //dead code
    
    if (false) {
    	System.out.println("both are equal");
    }
    else {
    	System.out.println("both are not equal");
    }
    
    boolean flag = true;
    if(flag) {
    	System.out.println("element is visible");
    }
    else {
    	System.out.println("element is not viible");
    }
    
    int total = 60;
    if(total <=100) {
    	System.out.println("total is less than or equal to 100");
    	if(total >=80) {
    		System.out.println("total is greater then or equ to 80");
    		if(total == 80) {
    			System.out.println("GRADE A");
    		}
    		else {
    			System.out.println("FAIL");
    		}
    	}
    	else {
    		System.out.println("NA");
    	}
    }
    else {
    	System.out.println("BYE");
    }
    
    //logic -----to launch the browser - ch , edge , ff
    
       //String browser = "Safari";
//    if(browser.equals("chrome"))
//    		{
//    	System.out.println("crhome launch");
//    		}
//    if(browser.equals("firefox")) {
//    	System.out.println("firefox launch");
//    }
//    if(browser.equals("safari")) {
//    	System.out.println("safari launch");
//    }
//    else {
//    	System.out.println("please pass the right browser name");
//    }
       String browser = "chrome";
       if(browser.equals("chrome")) {
    	   System.out.println("crhome launch");
       }
       else if (browser.equals("firefox")){
    	   System.out.println("safari launch");
    	   
       }
       else if (browser.equals("ie")) {
    	   System.out.println("ie launch");
       }
       else {
    	   System.out.println("please pass the right browser name");
       }
       
       //Check the given char is vowel or constant
       
       char c = 'i';
       if(c=='a'|| c=='i'|| c=='e'|| c=='o'|| a=='u') {
    	   System.out.println("Vowel");
       }
       else {
    	   System.out.println("Constant");
       }
    }
    
	}


