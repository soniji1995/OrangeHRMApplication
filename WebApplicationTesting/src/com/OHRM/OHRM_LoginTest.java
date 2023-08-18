package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {
	
	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		chromeDriver.get(applicationUrlAddress);
		
		String expected_OrangeHrmLoginPageTitle = "OrangeHRM";
		System.out.println("The expected title of OrangeHrm Login Page is :- "+expected_OrangeHrmLoginPageTitle);
		
		String actual_OrangeHrmLoginPageTitle = chromeDriver.getTitle();
		System.out.println("The actual title of OrangeHrm Login Page is :- "+actual_OrangeHrmLoginPageTitle);
		
		if(actual_OrangeHrmLoginPageTitle.equals(expected_OrangeHrmLoginPageTitle)) {
			
			System.out.println("The expected title of OrangeHrm Login Page is matched :- PASS");
		}
		else {
			
			System.out.println("The expected title of OrangeHrm Login Page is NOT matched :- FAIL");
		}
		
		String expected_OrangeHrmLoginPageUrlAddress = "OrangeHrm-4.2.0.1";
		System.out.println("The expected Url Address of OrangeHrm Login Page is :- "+expected_OrangeHrmLoginPageUrlAddress);
		
		String actual_OrangeHrmLoginPageUrlAddress = chromeDriver.getCurrentUrl();
		System.out.println("The  actual Url Address of OrangeHrm Login Page is :- "+actual_OrangeHrmLoginPageUrlAddress);
		
		if(actual_OrangeHrmLoginPageUrlAddress.contains(expected_OrangeHrmLoginPageUrlAddress)) {
			
			System.out.println("The expected Url Address exists :- PASS");
		}
		else {
			
			System.out.println("The expected Url Address does not exist :- FAIL");
		}
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
		     By loginPanelHeadingProperty = By.id("logInPanelHeading");
		
		   WebElement  loginPanelHeadingElement = chromeDriver.findElement(loginPanelHeadingProperty);
		   
		   String expected_LoginPanelHeadingText = "LOGIN Panel";
		   
		   System.out.println("The expected Login Panel Heading Text is :- "+expected_LoginPanelHeadingText);
		   
		   String actual_LoginPanelHeadingText = loginPanelHeadingElement.getText();
		   
		   System.out.println("The actual Login Panel Heading Text is :- "+actual_LoginPanelHeadingText);
		   
		   if(actual_LoginPanelHeadingText.equals(expected_LoginPanelHeadingText)) {
			   
			   System.out.println("The expected Login panel Heading Text matches - PASS");
		   }
		   
		   else {
			   
			   System.out.println("The expected Login panel Heading Text does not match - FAIL");
		   }
		
	}

}
