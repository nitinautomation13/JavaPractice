package JavaSessions;

public class B {

	public static void main(String[] args) {
		System.out.println("A----main");
		
		A.main(args);
		
		// Stack is not only used for to storing the references and it will always maintain the calling stack
		// java stack memory is design based on the stack data structure
       // there is not gc for stack as we know .
		//stachoverflowerror example A and B 
		// why this error come bcz memory is totally occupied and we don't have any memory space left to create new stack so java ill
		// Throw this error 
	}

}
