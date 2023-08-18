package com.ValidatingUrlAddressAndTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAddress_ValidatingTitle_GoogleHomePage {

	public static void main(String[] args) {
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		// navigating to google.com
		
		String applicationUrlAddress = "http://google.com";
		
		chromeDriver.get(applicationUrlAddress);
		
		String expected_GoogleHomePageTitle = "Google";
		
		System.out.println("The expected Google Home Page Title is : -"+expected_GoogleHomePageTitle);
		
		String actual_GoogleHomePageTitle = chromeDriver.getTitle();	
		
		System.out.println("The actual title of Google Home Page is:- "+actual_GoogleHomePageTitle);
		
		//if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle)) // for case sensitive char by char comparison
		if(actual_GoogleHomePageTitle.equalsIgnoreCase(expected_GoogleHomePageTitle)) // for ignoring case char by char comparison
			{
			
			System.out.println("Google Home Page Title matched :- PASS");
		}
		else {
			
			System.out.println("Google Home Page Title not matched :- FAIL");
		}
		
		String expected_GoogleHomePageUrlAddress = "google.com";
		System.out.println("The Expected Google Home Page Url Address is : - "+expected_GoogleHomePageUrlAddress);
		
		String actual_GoogleHomePageUrlAddress = chromeDriver.getCurrentUrl();
		System.out.println("The actual Google Home Page Url Address is : - "+actual_GoogleHomePageUrlAddress);
		
		
		if(actual_GoogleHomePageUrlAddress.contains(expected_GoogleHomePageUrlAddress))
		{
			
			System.out.println("The Expected Url Address exists :- PASS");
		}
		else {
			System.out.println("The Expected Url Address doesn't exist :- FAIL");
		}
		
		chromeDriver.close();
		
	}
	
}
