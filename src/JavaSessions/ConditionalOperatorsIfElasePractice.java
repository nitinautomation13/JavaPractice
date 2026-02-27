package JavaSessions;

public class ConditionalOperatorsIfElasePractice {

	public static void main(String[] args) {
		// Find out the greatest number out of three different given numbers:
		
		int a = 25;
		int b = 78;
		int c = 87;
		
		if(a>=b && a>=c) {
			
			System.out.println("The greated number is : " + a);
				
			}
		else if (b>=a && b>=c){
			System.out.println("The greatest numer is :"  + b);
				
			}
		else {
			System.out.println("The greated number is :" + c);
		}
		
		//Find out the greatest number out of four different given numbers:
		
		int a1 = 25;
		int b1 = 78;
		int c1 = 100;
		int d1 = 97;
		
		if(a1>=b1 && a1>=c1 && a1>=d1) {
			System.out.println("The greate number is :"  + a1);
		} 
		else if (b1>=c1 && b1>=d1 && b1>=a1) {
			System.out.println("The greatest number is :"  + b1);
		}
		else if (c1>=a1 && c1>=b1 && c1>=d1) {
			System.out.println("The greatest number is c1: "  + c1);
		}
		else {
			System.out.println("the greatest number is : " + d1);
		}
		
		// Write a Java program to test a number is positive or negative.
		
		int a2 = 35;
		int b2 = -11;
		
		if(a2 >0) {
			System.out.println("The number is positive : " + a2);
		}
		else if (a2<0) {
			System.out.println("The number is negative : " + a2);
		}
		else {
			System.out.println("The number is zero " + a2);
		}
		
		// check 2nd number
		
		if (b2>0) {
			System.out.println("The number is positive :" + b2);
		}
		else if (b2<0) {
			System.out.println("The number is negative: " + b2);
		}
		
		//WAP to check number is odd or even using If - Else
		
		int number = 15;
		if(number %2==0) {
			System.out.println("Even number :"  + number);
		}
		else {
			System.out.println("Odd number : " + number);
		}
		
		// write a java program to test the number is positive or negative
		// check 1st positive number
		
		int num = 34;
		if(num >=0) {
			System.out.println("The number is positive :" + num);
		}
		else if (num <=0) {
			System.out.println("The number is negative :" + num);
		}
		else {
			System.out.println("The number is zero");
		}
		
		//Check the given char is vowel or consonant.
		
		char z = 'i';
		if(z=='i' || z=='a'||z=='e'||z=='o'||z=='u') {
			System.out.println("The given charcter is vowel .....:" + z);
		}
		else {
			System.out.println("The given character is consonenet........" + z);
		}
		
		//Check the given char is vowel or consonent using switch case .
		
		char z1 ='e';
		char h = 'i';
		switch (z1) {
		case 'e':
			System.out.println("the character is vowel...." + z1);
			

		case 'h':
			System.out.println("the character is vowel...." + h);
			break;

		default:
			System.out.println("The character is consonenet...." + z1);
			break;
		}
		
		
		
		
		}

	}


