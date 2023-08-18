package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLoginPage {

	public static void main(String[] args) {
		
     String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		String expected_OrangeHrmLoginPageTitle = "OrangeHRM";
		System.out.println("The expected title of OrangeHrm Login Page is :- "+expected_OrangeHrmLoginPageTitle);
		
		String actual_OrangeHrmLoginPageTitle = driver.getTitle();
		System.out.println("The actual title of OrangeHrm Login Page is :- "+actual_OrangeHrmLoginPageTitle);
		
		if(actual_OrangeHrmLoginPageTitle.equals(expected_OrangeHrmLoginPageTitle)) {
			
			System.out.println("The expected title of OrangeHrm Login Page is matched :- PASS");
		}
		else {
			
			System.out.println("The expected title of OrangeHrm Login Page is NOT matched :- FAIL");
		}
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		//There is some problem in getting text on  Login Button
		
		//<input type="button" value="Login" name="openIdLogin" id="openIdLogin" disabled="disabled"> 
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
	     By loginPanelHeadingProperty = By.id("logInPanelHeading");
	
	   WebElement  loginPanelHeadingElement = driver.findElement(loginPanelHeadingProperty);
	   
	   String expected_LoginPanelHeadingText = "LOGIN";
	   
	   System.out.println("The expected Login Panel Heading Text is :- "+expected_LoginPanelHeadingText);
	   
	   String actual_LoginPanelHeadingText = loginPanelHeadingElement.getText();
	   
	   System.out.println("The actual Login Panel Heading Text is :- "+actual_LoginPanelHeadingText);
	   
	   if(actual_LoginPanelHeadingText.contains(expected_LoginPanelHeadingText)) {
		   
		   System.out.println("The expected Login panel Heading Text exists - PASS");
	   }
	   
	   else {
		   
		   System.out.println("The expected Login panel Heading Text does not exist - FAIL");
	   }
	
	}
	
}
