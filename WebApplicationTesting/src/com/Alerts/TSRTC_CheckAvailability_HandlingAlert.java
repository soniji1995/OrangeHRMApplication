package com.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TSRTC_CheckAvailability_HandlingAlert {
	
	WebDriver driver;
	
	public void applicationLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
        String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(applicationUrlAddress);
		
	}
	
	public void handlingAlert() throws InterruptedException {
		
		//Automating check availability Button to get the alert window
		
		// id = "searchBtn"
		
		By checkAvailabilityButtonProperty = By.id("searchBtn");
		
		WebElement checkAvailabilityButton = driver.findElement(checkAvailabilityButtonProperty);
		
		checkAvailabilityButton.click();
		
		//Thread.sleep(5000);
		
		// switching from current browser to alert window
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();//will perform an operation on ok Button
		//alert.dismiss();//will perform an operation on click button
		//alert.sendKeys("Testing");// to send test data into the alert
		
		//Thread.sleep(5000);
		
	}
	
	public void applicationClose() {
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TSRTC_CheckAvailability_HandlingAlert handlingAlert = new TSRTC_CheckAvailability_HandlingAlert();
		
		handlingAlert.applicationLaunch(); //1  //if we perform  follow the  1-3-2 close the browser before the handling alert 
		handlingAlert.handlingAlert();     //2  //we will get NoSuchSession : Session Id : null exception 
		handlingAlert.applicationClose();  //3  // because when we use a secured web application a dynamic session id is created for browser
		 //if we close the browser  or application the id is deleted if we again launch the web application new 
		//session id will be created for our browser
		
	}

}
