package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Sign_Click {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		//ChromeDriver chromeDriver = new ChromeDriver();
      //WebDriver is an interface of selenium that contains all Driver classes
		
		String applicationUrlAddress = "http://google.com";
		
		//or
		//WebDriver chromeDriver = new ChromeDriver();
		
		//Automating chrome browser by creating an object for WebDriver interface
		//driver is generally used name for creating object for all browsers
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//<a class="gb_oa gb_ld gb_Nd gb_le" href="https://accounts.google.com/
		//ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;
		//ec=GAZAmgQ" target="_top"><span class="gb_Jd">Sign in</span></a>
		
		/*
		 <a> is an anchor element which as attribute href value is link
		 Type of element : - It's a link type element
		 
		 locator = linkText
		 selector = Sign in
		 
		 
		 
		 */
		driver.findElement(By.linkText("Sign in")).click();
		
		//or
		
		//driver.findElement(By.partialLinkText("in")).click();
		
	}

}
