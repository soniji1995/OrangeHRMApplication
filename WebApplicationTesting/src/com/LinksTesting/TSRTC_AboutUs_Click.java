package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_AboutUs_Click {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" 
		//target="_top" title="About Us">About Us</a>
		
		//driver.findElement(By.linkText("About Us")).click();
		
		//or
		
		//identify the element
		
		          //WebElement aboutUsElement = driver.findElement(By.linkText("About Us"));
		          
		          //whenever we are identifying the element on the webpage with the property and then
		          //assign and store it into a variable then the variable declaration should be type of
		          //WebElement
		          
		          //Performing the operation on WebElement
		          
		          //String aboutUsElementText=aboutUsElement.getText();
		          
		          //using the variable assigned and stored with the identified WebElement
		          //performing the operation on WebElement
		          
		          //System.out.println("The text of the WebElement About Us is :- "+aboutUsElementText);
		          
		          //aboutUsElement.click();
		          
		          //using the same variable and performing another operation
		          
		          //using the variable assigned with identified WebElement
		          //or
		          //Identify the property of an element and assign it to a variable
		          
		
		          By aboutUsElementProperty = By.linkText("About Us");
		          
		          // identifying the WebElement on the webpage
		          
		         WebElement aboutUsElement = driver.findElement(aboutUsElementProperty);
		         
		              String aboutUsElementText = aboutUsElement.getText();
		              
		              System.out.println(aboutUsElementText);
		                  
	}

}
