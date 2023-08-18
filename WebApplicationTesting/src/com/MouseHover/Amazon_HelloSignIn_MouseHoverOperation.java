package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOperation {
	
	public static void main(String[] args) {
		
		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "http://www.amazon.in";
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
		// id - nav-link-accountList // Hello SignIn Element Property
		
		By helloSignInLocator = By.id("nav-link-accountList");
		
		WebElement helloSignIn = driver.findElement(helloSignInLocator);
		
		//Action class is used to perform both mouse and keyboard related key operations
		Actions action = new Actions(driver);
		
		action.moveToElement(helloSignIn).build().perform();
		
		
		//if build().perform() is not used in Actions class object then - neither an operation on the element will be observed nor
		//nor an exception will be displayed on the console
		
		//your orders - type of element is link (hidden element)
		
		By yourOrdersLocator = By.linkText("Your Orders");
		
		WebElement yourOrders = driver.findElement(yourOrdersLocator);
		
		yourOrders.click();
		
	}

}
