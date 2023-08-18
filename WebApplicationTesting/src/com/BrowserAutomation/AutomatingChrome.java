package com.BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		String applicationUrlAddress = "http://google.com";
		
		chromeDriver.get(applicationUrlAddress);
	}

}
