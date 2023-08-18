package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversity_DropDown_SelectionOfMultipleOptionalValues {
	
	
            WebDriver driver;
	
	        String applicationUrlAddress = "https://www.osmania.ac.in/";
	
	public void applicationLaunch()
	{
		 System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
			
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get(applicationUrlAddress);
	}
	
	public void dropDownSelection() throws InterruptedException
	{
//finding drop down Element property
		
		//id = "gtranslate_selector"
		
		By dropDownElementProperty = By.id("gtranslate_selector");
		
	    WebElement dropDownElement = driver.findElement(dropDownElementProperty);
		
	    
// finding the common properties of elements that are present in drop down Element 
	    
	    By dropDownListProperty = By.tagName("option");
	    
	    List <WebElement> listOfLanguages = dropDownElement.findElements(dropDownListProperty);
	    
	    int languagesCount = listOfLanguages.size();
	    
	    Select languageSelection = new Select(dropDownElement);
	    
	    for(int index=0;index<languagesCount;index++) {
	    	
	    	languageSelection.selectByIndex(index);
	    }
	    
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		OsmaniaUniversity_DropDown_SelectionOfMultipleOptionalValues dropDownValueSelection = 
				new OsmaniaUniversity_DropDown_SelectionOfMultipleOptionalValues();
		
		dropDownValueSelection.applicationLaunch();
		dropDownValueSelection.dropDownSelection();
		dropDownValueSelection.applicationClose();
		
	}
	
	public void applicationClose()
	{
		driver.quit();
	}

}
