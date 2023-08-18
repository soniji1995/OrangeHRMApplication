package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SignIn {
	
	public static void main(String[] args) {
		//Automate chrome browser
		
				System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
				
				WebDriver driver;
				
				driver = new ChromeDriver();
				
				String applicationUrlAddress = "http://www.amazon.in";
				
				driver.manage().window().maximize();
				
				driver.get(applicationUrlAddress);
				
			//	id="nav-main"
				
				By headerblockLocator = By.id("nav-main");
				
				WebElement headerBlock = driver.findElement(headerblockLocator);
				
				By headerBlockLinkElements = By.tagName("a");
				
				List<WebElement> headerBlockLinks = headerBlock.findElements(headerBlockLinkElements);
				
				// to get size of the list
				
				int headerBlockLinksCount = headerBlockLinks.size();
		
				System.out.println(headerBlockLinksCount);
				
				for(int index=0;index<headerBlockLinksCount;index++) {
					
					String headerBlockLinkName = headerBlockLinks.get(index).getText();
					System.out.println(index+1+" "+headerBlockLinkName);
					
					
				}
	}

}
