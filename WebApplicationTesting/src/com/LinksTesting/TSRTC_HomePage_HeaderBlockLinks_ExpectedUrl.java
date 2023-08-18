package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_HeaderBlockLinks_ExpectedUrl {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
		
By headerBlockLocator = By.className("menu-wrap");
		
		WebElement headerBlock = driver.findElement(headerBlockLocator);
		
		
		
       By headerBlockLinksLocator = By.tagName("a");
       
       
		//with the header block finding the elemements of it
               
       
		List <WebElement> headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);
		
		//finding the size of the elements identified in header block
		
		
		int headerBlockLinksCount=headerBlockLinks.size();
		
		System.out.println("The number of  links in header block of TSRTC Home Page are : "+headerBlockLinksCount);
		System.out.println();
		
		for(int index=0;index<headerBlockLinksCount;index++) {
			
			String headerBlockLinkName = headerBlockLinks.get(index).getText();
			System.out.println(headerBlockLinkName);
			System.out.println();
			
			String expected_UrlAddress = headerBlockLinks.get(index).getAttribute("href");
			
			headerBlockLinks.get(index).click();
			
			String actual_UrlAddress = driver.getCurrentUrl();
			
			if(actual_UrlAddress.equals(expected_UrlAddress)) {
				System.out.println("The expected Url Address matches");
				System.out.println();
			}
			
			else {
				System.out.println("The expected Url Address does not match");
			}
			
			driver.navigate().back();
			
			headerBlock = driver.findElement(headerBlockLocator);
			
			headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);
			
		}
		
		driver.quit();
				
	}

}
