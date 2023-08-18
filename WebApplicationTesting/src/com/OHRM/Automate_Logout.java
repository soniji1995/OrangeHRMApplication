package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automate_Logout {
	
	public static void main(String[] args) throws InterruptedException {
		
    String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
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
		
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		
				By welcomeAdminElementProperty = By.id("welcome");
				
				WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);
				
				welcomeAdminElement.click();
				
				//Getting No such element exception in finding element logout 
				
				//<a href="/OrangeHrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
				
				By logoutElementLocator = By.linkText("Logout");
				
				WebElement logoutElement = driver.findElement(logoutElementLocator);
				
				logoutElement.click();
				
				driver.quit();
				
								
	        	
	}

}
