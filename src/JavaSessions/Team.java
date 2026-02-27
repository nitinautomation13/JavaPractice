package JavaSessions;

import java.util.ArrayList;

public class Team {
	
	//WAF Pass the team name and Return the devices list 
	// list of devices means arraylist 
	//device name is string so we need to pass ArrayList<String>
	
	public ArrayList<String> getDeviceList(String TeamName) {
		System.out.println("team name is :" + TeamName);
		
		ArrayList<String> deviceList = new ArrayList<String>();
 		
		if(TeamName.equals("QA")) {
			deviceList.add("IPhone X");
			deviceList.add("Iphone 11");
			deviceList.add("Iphone 07");
		}
		else if (TeamName.equals("DEV")) {
			deviceList.add("IPhone XX");
			deviceList.add("Iphone 12");
			deviceList.add("Iphone 08");
			
		}
		else if (TeamName.equals("DEVOPS")) {
			deviceList.add("IPhone XXX");
			deviceList.add("Iphone 120");
			deviceList.add("Iphone 09");
			
		}
		else{
			System.out.println("Team is not found :"  + TeamName);
		}
		return deviceList;
	}
      
	//WAF : Launch the browser
	//input parameter : broweserName (String)
	//return : Void
	
	public void launchBrowser(String broweserName) {
		
		switch (broweserName.toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome");
			
			break;
			
		case "FF":
			System.out.println("Launch FF");
			
			break;
			
		case "safari":
			System.out.println("Launch safari");
			
			break;
			
		default:
			System.out.println("Please pass the right broweser name :" + broweserName);
			break;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
