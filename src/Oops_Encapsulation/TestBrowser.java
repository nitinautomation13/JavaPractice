package Oops_Encapsulation;

public class TestBrowser {

	public static void main(String[] args) {
		
		LaunchBrowser obj = new LaunchBrowser();
		obj.launchBrowser(); // the moment i write obj. it come all the 4 method i can access and
		//and it's not user friendly  and user is totally confuse which method i can access
		//if call the launchBroser method so lauchBroweser method will be call and it will launch below three method
		//checkRAM(); checkOSCompatible(); checkStorage();
		// the problem of this code - how will i prevent the exposer of internal method outside of the class or
		// to the end user. bcz everything we created public in nature so for this we need to make it private .
		
		
		
		
		
	}

}
