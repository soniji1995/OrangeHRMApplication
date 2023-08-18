package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ApplicationLaunch_Facebook {
	
	public static void main(String[] args) {
		
		//Automating chrome
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		//navigating to facebook login page on chrome using get() method
		
		chromeDriver.get("http://facebook.com");
		
	    //Automating edge browser
		
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");
		
		EdgeDriver edgeDriver = new EdgeDriver();
		
		//navigating to bing Application on edge
		
		edgeDriver.get("http://bing.com");
		
		//navigating to another application onto the same tab of the browser
		
		chromeDriver.get("http://livetech.in");
		
		chromeDriver.get("http://google.com");
		
		//closes a browser if a browser has single tab 
		
		chromeDriver.close();
		
		//navigating to flipkart application on chrome using navigate().to() method
		
		edgeDriver.navigate().to("http://flipkart.com");
		
		//closes the browser along with multiple tab opened.
		
		edgeDriver.quit();
	}

}
