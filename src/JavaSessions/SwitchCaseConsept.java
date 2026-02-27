package JavaSessions;

public class SwitchCaseConsept {

	public static void main(String[] args) {
		// Logic launch the browser - ch, ff, ie
		
    String browser = "sarari";
    
    switch (browser) {
	case "chrome":
		System.out.println("launch chrome");
		
		break;
		
	case "ff":
		System.out.println("launch ff");
		
		break;
		
	case "ie":
		System.out.println("launch ie");
		
		break;

	default:
		System.out.println("please pass the right browser name....:  " + browser);
		break;
	}
    
    //diff env - QA , DEV , STAGE , PROD
    String env= "stage";
    
    switch (env.toUpperCase()) {
	case "QA":
		System.out.println("url : " + "http://www.qa.abc.com");
		System.out.println("qa:qa");
		break;
	case "DEV":
		System.out.println("url : " + "http://www.dev.abc.com");
		System.out.println("dev:dev");
		break;
	case "STAGE":
		System.out.println("url : " + "http://www.stage.abc.com");
		System.out.println("stg:stg");
		break;
	case "PROD":
		System.out.println("url : " + "http://www.prod.abc.com");
		System.out.println("admin:admin");
		break;

	default:
		System.out.println("please pass the correct env name :"  +  env);
		break;
	}
    
    /*An e-commerce site has categories: Electronics, Clothing, Grocery, Books,
    Furniture. Use switch to print the discount percentage for each category.*/
    
    String categories = "Grocery";
    
    switch (categories.toUpperCase()) {
	case "BOOKS":
		System.out.println("Books Discount : 10%");
		break;
	case "Electronics":
		System.out.println("Discount : 20%");
		break;
	case "GROCERY":
		System.out.println("Discount : 30%");
		break;
	case "Clothing":
		System.out.println("Discount : 40%");
		break;

	default:
		
		System.out.println("please pass the correct categories name :" + categories);
		break;
	}
    
    /*Implement Role-Based Access Control using switch for roles: Admin, Customer,
      Partner, Seller, Vendor, Distributor.*/
    
    String roles = "admin";
    
    switch (roles.toLowerCase()) {
	case "admin":
		System.out.println("Access : full access of the system");
		break;
	case "vendor":
		System.out.println("Access : Vendor role access of the system");
		break;
	case "Customer":
		System.out.println("Access : customer role access of the system");
		break;
	case "Seller":
		System.out.println("Access : Seller access of the system");
		break;
	case "Partner":
		System.out.println("Access : Partner access of the system");
		break;

	default:
		System.out.println("Access : Invalid role: " + roles );
		break;
	}
    
    //. Write a program to check whether a number is even or odd using if-else.
    
    int number = 11;
    
    if(number %2==0) {
    	System.out.println(number + " is Even");
    }
    else {
    	System.out.println(number + " is Odd");
    }
    
    //Write a program to check vowel or consonant using if .
    
    char ch ='a';
    if((ch >= 'a' && ch <= 'z')) {
    	
    	if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'  ) {
    		
    		System.out.println(ch + " is c vowel ");
    		}
    	else {
    		System.out.println(ch + "is a consonent");
    	}
    	
    }
    
    //Write a program to check vowel or consonant using switch .
    
    char ch1 = 'e';
    switch (ch1) {
	case 'e':
	case 'a':	
	case 'i':
	case 'o':
	case 'u':
		System.out.println("vowel " +  ch1);
		break;
	default:
		System.out.println("is a consonent" +  ch1);
		
	}
    
    //Write a program to check vowel or consonant using switch in one go .
    
    int vowel = 1;
    
    switch (vowel) {
	case 1:
		System.out.println('a');
		
	case 2:	
		System.out.println('e');
		
		System.out.println('i');
	case 3:
		System.out.println('o');
	case 4:
		System.out.println('u');
		
		break;
	default:
		System.out.println("Invalid");
		break;
	}
    
    //vowels : a, e, i, o, u,
    System.out.println("............................");
    
    char ch05 = 'E';
    
    // now need to convert char to string if we take capital and will be using
    //string.value() method to convert char to string
    
    String alpha = String.valueOf(ch05);// 'a'----->"A"
    
    
    switch (alpha.toLowerCase()) {
	case "a":
		System.out.println(ch05 +" is a vowl ");
		break;
	case "e":
		System.out.println(ch05 +" is a vowl ");
		break;
	case "i":
		System.out.println(ch05 +" is a vowl ");
		break;
	case "o":
		System.out.println(ch05 +" is a vowl ");
		break;
	case "u":
		System.out.println(ch05 +" is a vowl ");
		break;
	default:
		
		System.out.println(ch05 +"   is a consonant ");
		break;
	}
    
    System.out.println("............................");
    
    int b =97;
    switch (b) {
	case 'a':
		System.out.println("Ascii +is a vowel");
		
		break;

	default:
		System.out.println("BYE");
		break;
	}
    
    
    
    
    
    
    
    
    
	}

}
