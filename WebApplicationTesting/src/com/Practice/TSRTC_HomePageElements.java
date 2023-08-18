package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePageElements {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
		
		//finding text field
		
		//id="fromPlaceName"
		
		By sourceElement = By.id("fromPlaceName");
		
		WebElement source = driver.findElement(sourceElement);
		
		//finding text field 
		
		//id="toPlaceName"
		
		By destinationElement = By.id("toPlaceName");
		
		WebElement destination = driver.findElement(destinationElement);
		
		String sourceName = "HYDERABAD";
		String destinyName = "NAGPUR";
		
		source.sendKeys(sourceName);
		
		destination.sendKeys(destinyName);
		
	}
	
	
}
