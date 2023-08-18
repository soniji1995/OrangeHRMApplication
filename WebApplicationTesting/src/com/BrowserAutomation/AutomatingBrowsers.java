package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingBrowsers {
	
	public static void main(String[] args) {
		
		//web driver is an interface
		  //Automating Chrome Browser
		
		System.setProperty("webdriver.chrome.driver",
				"./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		// Automating Edge Browser
		
		System.setProperty("webdriver.edge.driver",
				"./BrowserDriverFiles/msedgedriver.exe");
		
		EdgeDriver edgeDriver = new EdgeDriver();
		
		// Automating FireFox Browser
		
		System.setProperty("webdriver.gecko.driver",
				"./BrowserDriverFiles/geckodriver.exe");
		
		FirefoxDriver firefox = new FirefoxDriver();
	}

}
