package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons_Group1_Click {
	
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void applicationLaunch()
	{
	// Chrome Browser Automation
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");

	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void applicationClose()
	{
	driver.quit();
	}

	@Test
	public void radioButtons_Group1_Testing() throws InterruptedException
	{

	/*
	<input type="radio" name="group1" value="Milk">
	<input type="radio" name="group1" value="Butter" checked="">
	<input type="radio" name="group1" value="Cheese">
	*/

	// Identifying the common property to get all the elements of similar type
	// name="group1"
	By group1RadioButtonsProperty=By.name("group1");
	
	
	//finding the table in which group1 elements exist
	
	///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table
	
	By tableElementProperty = By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table");
	
	WebElement tableElement = driver.findElement(tableElementProperty);
	
	// getting all the similar elements ( radio Buttons - group1 only )
	List<WebElement>group1RadioButtons=tableElement.findElements(group1RadioButtonsProperty);

	// finding the size of the arrayList(group1RadioButtons)
	int group1RadioButtonsCount=group1RadioButtons.size();
	System.out.println(" The number of group1 radio Buttons are :- "+group1RadioButtonsCount);

	// Going to every group1 radio Buttons
	for(int index=0;index<group1RadioButtonsCount;index++)
	{
	// Performing click on each radio button
	group1RadioButtons.get(index).click();

	// Thread.sleep(10000);

	for(int radioButtonsStatus=0;radioButtonsStatus<group1RadioButtonsCount;radioButtonsStatus++)
	{

	// getting/finding the status of the group1 radio buttons
	String group1RadioButtonsStatus=group1RadioButtons.get(radioButtonsStatus).getAttribute("checked");
	
	String group1RadioButtonsName=group1RadioButtons.get(radioButtonsStatus).getAttribute("value");
	
	System.out.println(group1RadioButtonsName+" "+group1RadioButtonsStatus);
	}
	System.out.println();
	}

	}
}