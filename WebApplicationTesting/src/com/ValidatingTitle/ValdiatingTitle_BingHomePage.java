package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValdiatingTitle_BingHomePage {
	
	public static void main(String[] args) {
		
		//Automating chrome browser
		
				System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
				ChromeDriver chromeDriver = new ChromeDriver();
				
				// navigating to bing.com
				
				String applicationUrlAddress = "http://bing.com";
				
				chromeDriver.get(applicationUrlAddress);
				
				String expected_BingHomePageTitle = "bing";
				
				System.out.println("The expected Bing Home Page Title is : -"+expected_BingHomePageTitle);
				
				String actual_BingHomePageTitle = chromeDriver.getTitle();	
				
				System.out.println("The actual title of Bing Home Page is:- "+actual_BingHomePageTitle);
				
				//if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
				if(actual_BingHomePageTitle.equalsIgnoreCase(expected_BingHomePageTitle)) 
					{
					
					System.out.println("Bing Home Page Title matched :- PASS");
				}
				else {
					
					System.out.println("Bing Home Page Title not matched :- FAIL");
				}
				
				chromeDriver.close();
		
	}

}
