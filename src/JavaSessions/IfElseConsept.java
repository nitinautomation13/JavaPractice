package JavaSessions;

public class IfElseConsept {

	public static void main(String[] args) {
		
		int num = 85;
		if(num >= 90) {
			System.out.println("Greade A");
			if(num>=95) {
				System.out.println("Elgible for scholarship");
				if(num==100) {
					System.out.println("Grade A+");
				}
			}
		}
		else {
			System.out.println("You are not eligible for scholarship");
			if(num<=80) {
				System.out.println("grade b");
				if(num<=60) {
					System.out.println("grade c");
					if(num<=30) {
						System.out.println("FAIL!!");
					}
				}
			}
			else {
				System.out.println("you are eligible for 50% scholarship");
			}
		}
	}

}
