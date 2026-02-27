package JavaSessions;

import java.util.ArrayList;

public class TestTeamDevices {

	public static void main(String[] args) {
		
		//t1.getDeviceList GIVE ARRAY LIST OF STRINg so we will store in arraylist<String>
		//ArrayList<String> JavaSessions.Team.getDeviceList(String TeamName) 
		//function can return multiple value at a form of array
		
		Team t1 = new Team();
		ArrayList<String> QADevices = t1.getDeviceList("QA");
		
		System.out.println(QADevices);
		
		//write some test cases
		if(QADevices.size()== 3) {
			System.out.println("Pass for QA Team device count");
		}
		if(QADevices.contains("Iphone 11")) { // contains() is the function
			                                  // of arraylist which is used to check whether a specific value exists inside a object.
			                                
			System.out.println("Iphone 11 is present");
		}
		
		t1.getDeviceList("employee");
		
		t1.launchBrowser("Chrome");
		t1.launchBrowser("ie");
		
	}

}
