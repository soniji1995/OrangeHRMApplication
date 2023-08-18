package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingHomePage {
	
	public static void main(String[] args) {
		
		
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		driver.get(applicationUrlAddress);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		//locator/attribute - id
		//selector/value - txtUsername
		
        By userNameElementProperty = By.id("txtUsername");
		
		WebElement userNameElement = driver.findElement(userNameElementProperty);
		
		userNameElement.sendKeys("rahulsoni");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		//locator/attribute - name
		//selector/value - txtPassword
		
        By passwordElementProperty = By.name("txtPassword");
		
		WebElement passwordElement = driver.findElement(passwordElementProperty);
		
		passwordElement.sendKeys("Rahul@1995");

		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		//locator/attribute - className
		//selector/value - button
		
        By buttonElementProperty = By.className("button");
		
		WebElement buttonElement = driver.findElement(buttonElementProperty);
		
		buttonElement.click();
		
		String expected_OrangeHRMHomePageTitle = "OrangeHRM";
		System.out.println("The expected title of OrangeHrm Home Page is :- "+expected_OrangeHRMHomePageTitle);
		
		String actual_OrangeHRMHomePageTitle = driver.getTitle();
		System.out.println("The actual title of OrangeHrm Home Page is :- "+actual_OrangeHRMHomePageTitle);
		
		if(actual_OrangeHRMHomePageTitle.equals(expected_OrangeHRMHomePageTitle)) {
			
			System.out.println("The expected title of OrangeHrm Home Page is matched :- PASS");
		}
		else {
			
			System.out.println("The expected title of OrangeHrm Home Page is NOT matched :- FAIL");
		}
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
		By welcomeAdminElementProperty = By.id("welcome");
		
		WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);
		
		String expected_WelcomeText = "Welcome";
		System.out.println("The expected welcome text is :- "+expected_WelcomeText);
		
		String actual_WelcomeText = welcomeAdminElement.getText();
		System.out.println("The actual welcome text is :- "+actual_WelcomeText);
		
		if(actual_WelcomeText.contains(expected_WelcomeText)) {
			
			System.out.println("The expected welcome text exists");
		}
		
		else {
			System.out.println("The expected welcome text does not exist");
		}
		
	}

}
