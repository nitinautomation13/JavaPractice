package JavaSessions;

// define two methods to print he max and min number repectively among three number

public class MaxMin {

	public int maxnumber(int a , int b , int c) {
		int max = a;
		
	if(b > max) {
		max = b;
	}
	if (c> max) {
		max = c;
	}
		return max;
	}
	
	public int minnumber(int a , int b , int c) {
		int min = a;
	if(b < min) {
		min = b;
	}
	if (c< min) {
		min = c;
	}
		return min;
	}
	public static void main(String[] args) {
		
		MaxMin obj = new MaxMin();
		
		int seq = obj.maxnumber(10, 40, 20);
		System.out.println("maxnumber in order : " +  seq);
		
		int min = obj.minnumber(20, 5, 1);
		System.out.println("Minimum Number : " + min);

	}

}
