package JavaSessions;

// WAP A person is eligible to vote if his/her age is greater than or equal to 18.
//define a method to find out if he/she is eligible for vote - return true/false

public class Vote {
	
	public boolean iseligible(int age) {
		boolean eligible = (age >= 18);
		return eligible;
	}

	public static void main(String[] args) {
	
		Vote obj = new Vote();
		
		boolean b1 = obj.iseligible(20);
		System.out.println("Eligible for Voting :" + b1);
		
		boolean b2= obj.iseligible(15);
		System.out.println("Not eligible for Voting : " + b2);

	}

}
