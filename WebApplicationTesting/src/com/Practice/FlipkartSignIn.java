package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignIn {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "http://www.flipkart.com";
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
		
		
		
		//<input autocomplete="off" type="text" class="_2IX_2- VJZDxU" value="">
		
		By LoginOtpElementProperty = By.className("_2IX_2- VJZDxU");
		
		WebElement LoginOtpElement = driver.findElement(LoginOtpElementProperty);
		
		String mobileNumber = "7509103923";
		
		// sending the keys 
		
		LoginOtpElement.sendKeys(mobileNumber);
		
		//finding request otp button
		
		//<button class="_2KpZ6l _2HKlqd _3AWRsL">Request OTP</button>
		
		By requestOtpButtonElementProperty = By.className("_2KpZ6l _2HKlqd _3AWRsL");
		
		WebElement requestOtpButtonElement = driver.findElement(requestOtpButtonElementProperty);
		
		requestOtpButtonElement.click();
		
		
	}

}
