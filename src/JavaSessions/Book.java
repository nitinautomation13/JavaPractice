package JavaSessions;

public class Book {
	
	String title;
	String author;
	int pagecount;
	

	public static void main(String[] args) {
		
		int totalbooks = 0;
		
		Book b1 = new Book();
		b1.title = "Arihant";
		b1.author = "Nitin";
		b1.pagecount =5;
		totalbooks++;
		
		Book b2 = new Book();
		b2.title = "RS";
		b2.author = "Pooja";
		b2.pagecount =8;
		totalbooks++;
		
		Book b3 = new Book();
		b3.title = "NAL";
		b3.author = "Navin";
		b3.pagecount =10;
		totalbooks++;
		
		System.out.println(b1.title + " " + b1.author + " " + b1.pagecount );
		System.out.println(b2.title + " " + b2.author + " " + b2.pagecount );
		System.out.println(b3.title + " " + b3.author + " " + b3.pagecount );
		
		System.out.println("Total Books : " + totalbooks);
		
		//Modify the Pagecount
		
		b3.pagecount = 300;
		
		System.out.println(b3.title + " " + b3.author + " " + b3.pagecount );
		
		// create another book object
		
		Book b4 = new Book();
		
		b4.title = "PUNIT";
		b4.author = "PUNIT SHUKLA";
		b4.pagecount =500;
		totalbooks++;
		
		
       System.out.println(b4.title + " " + b4.author + " " + b4.pagecount );
		
		System.out.println("Updated Books : " + totalbooks);
		
		
		
		
		
		
	}

}
