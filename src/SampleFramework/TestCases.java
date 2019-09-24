package SampleFramework;

import webDriverBasics.ActionClassEx1;

public class TestCases extends ActionClassEx1 {

	public static void TC01_ApplyLeave(){
	//	Step1: Launch Application
		launchApp();
		// Step2: Login as a team member
		launchHRM();
		//Step3:Navigate to My Leave Page
		navMyLeavePage();
		//Step4:Logout
		navMyLeavePage();
	}
	
public static void TC02_CancelLeave(){
//	Step1: Launch Application
		launchApp();
		// Step2: Login as a team member
		launchHRM();
		//Step3:Navigate to My Leave Page
		navMyLeavePage();
		//Step4:Logout
		navMyLeavePage();}

	
}
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	