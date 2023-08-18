package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_BingHomePage {
	
	public static void main(String[] args) {
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		// navigating to bing.com
		
		String applicationUrlAddress = "http://bing.com";
		
		chromeDriver.get(applicationUrlAddress);
		
		String actual_BingHomePageTitle = chromeDriver.getTitle();
		
		System.out.println("The actual title of Bing Home Page is:- "+actual_BingHomePageTitle);
		
		chromeDriver.close();
	}

}
