package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_SignIn_GetText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "./BrowserDriverFiles/msedgedriver.exe");

		String applicationUrlAddress = "http:/google.com";
		
		//Webdriver driver = new ChromeDriver();
		
		       //or
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		//driver = new EdgeDriver();
		
		driver.get(applicationUrlAddress);
		
		String signInElement = driver.findElement(By.linkText("Sign in")).getText();
		
		System.out.println("The Text of the Sign In element of the google home page is :-"+signInElement);
		
		driver.findElement(By.partialLinkText("in")).click();
		
		driver.close();
		
	}

}
