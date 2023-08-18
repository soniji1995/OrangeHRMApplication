package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_AboutUs_GetAttribute {
	
	public static void main(String[] args) {
		
String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" 
				//target="_top" title="About Us">About Us</a>
		/*
		 Attribute - href 
		 value - /oprs-web/home/aboutus.do
		 
		 */
		By aboutUsElementProperty = By.linkText("About Us");
		
	    WebElement aboutUsElement = driver.findElement(aboutUsElementProperty);
	    
	     String aboutUsHrefAttributeValue = aboutUsElement.getAttribute("href");
	     
	     System.out.println("The value of href attribute is :- "+aboutUsHrefAttributeValue);
	     
	     // getting the text of about us element
	     
	         String aboutUsElementText = aboutUsElement.getText();
	         
	         System.out.println("The text of the element About Us is :- "+aboutUsElementText);
	         
	         //performing click operation on About Us element 
	         
	             aboutUsElement.click();
	             
	             driver.quit();
		
	}

}
