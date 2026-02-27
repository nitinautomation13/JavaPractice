package JavaSessions;

public class Prodcut {
	
	public double getDouble(double a , double b) {
		System.out.println("getDouble :");
		double c1 = a*b;
		return c1;
		
	}

	public static void main(String[] args) {
		
            Prodcut obj = new Prodcut();
            double result = obj.getDouble(5.5, 10.6);
            System.out.println("Product: " + result);
            
            
	}

}
