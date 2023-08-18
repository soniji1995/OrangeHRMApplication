package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversity_DropDown_SelectionOfOptionalValue {
	
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
		
		//id = "gtranslate_selector" - property of Drop Down element
		
		By selectLanguageDropDownProperty = By.id("gtranslate_selector");
		
		WebElement selectLanguageDropDown = driver.findElement(selectLanguageDropDownProperty);
		
		// coomon property in drop down is option tag
		
		By dropDownListProperty = By.tagName("option");
		
		//we will have to find this common property tagname in selectLanguageDropDown WebElement
		
		List <WebElement> languagesDropDown = selectLanguageDropDown.findElements(dropDownListProperty);
		
		int languagesDropDownCount = languagesDropDown.size();
		
		System.out.println("Number of elements in the select languages drop down are : - "+languagesDropDownCount);
		
		for(int index=0;index<languagesDropDownCount;index++)
		{
			
			String language = languagesDropDown.get(index).getText();
			System.out.println(index+" "+language);
			
		}
		
		Select languageSelection  = new Select(selectLanguageDropDown);
		
		//selecting by index
		//languageSelection.selectByIndex(7);
		//selecting by value
		//Thread.sleep(2000);
		//languageSelection.selectByValue("en|hi");
		//Thread.sleep(2000);
		//selecting by visible text
		languageSelection.selectByVisibleText("Malayalam");
		Thread.sleep(5000);
		languageSelection.selectByVisibleText("Hindi");
		
		//Deselecting the selected optional values from the dropdown if the page is same after selection of 
		//an optional value then only deselection can be done
		
		//languageSelection.deselectByIndex(6);
		//languageSelection.deselectByValue("en|hi");
		//languageSelection.deselectByVisibleText("Malayalam");
		
		//Deselecting all the selected values at once
		
		//languageSelection.deselectAll();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		OsmaniaUniversity_DropDown_SelectionOfOptionalValue dropDownValueSelection  = new OsmaniaUniversity_DropDown_SelectionOfOptionalValue();
		
		dropDownValueSelection.applicationLaunch();
		dropDownValueSelection.dropDownSelection();
		//dropDownValueSelection.applicationClose();
		
	}
	
	public void applicationClose()
	{
		driver.quit();
	}

}
