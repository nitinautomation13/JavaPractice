package StaticVars_FunctionsInJava_MethodOverloading;

public class TestCustomer {

	public static void main(String[] args) {
		
		int salary = 100;
		final int days = 7;
		// final keyword we have to use when the data is always constant
		//if the value declare with final keyword no one can change.
		//Final can be apply class static variable also and final can we apply local variable also
		// ex- County drop-down , state in India, title of the page; header of the page; logo of the page
		
		
	    int totalAmount = days * salary;
	    System.out.println(totalAmount);
		
		Customer c1 = new Customer();
		
		c1.name = "TOM";
		c1.emailid = "tom@gmail.com";
		c1.phone = 982745632;
		c1.isprime = true;
		
		System.out.println(c1.name);
        System.out.println(Customer.category);
        
        //Customer.category = "Sports";
        
        System.out.println(Customer.category);
        
        
        
	}

}
