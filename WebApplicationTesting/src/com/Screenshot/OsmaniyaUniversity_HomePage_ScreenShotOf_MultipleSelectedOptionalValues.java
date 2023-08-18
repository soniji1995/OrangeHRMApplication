package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmaniyaUniversity_HomePage_ScreenShotOf_MultipleSelectedOptionalValues {
	
    WebDriver driver;
	
    String applicationUrlAddress = "https://www.osmania.ac.in/";
    
    public void applicationLaunch() {
    	
    	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);	
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    public void capturingScreenShot() throws IOException, InterruptedException
    {
    	//finding drop down Element property
		
    			//id = "gtranslate_selector"
    			
    			By dropDownElementProperty = By.id("gtranslate_selector");
    			
    		    WebElement dropDownElement = driver.findElement(dropDownElementProperty);
    			
    		    
    	// finding the common properties of elements that are present in drop down Element 
    		    
    		    By dropDownListProperty = By.tagName("option");
    		    
    	// storing the elements present in the dropDownElement in list
    		    
    		    List <WebElement> listOfLanguages = dropDownElement.findElements(dropDownListProperty);
    		    
    		    int languagesCount = listOfLanguages.size();
    		    
    		    Select languageSelection = new Select(dropDownElement);
    		    
    		    for(int index=0;index<languagesCount;index++) {
    		    	
    		    	languageSelection.selectByIndex(index);
    		    	
    		    	String nameOfLanguage = listOfLanguages.get(index).getText();
    		    	
    		    	Thread.sleep(3000);
    		    	
    		    	//Taking a screenshot
    		    	
    		    	File osmaniaUniversityHomePageScreenshotChangable = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		    	
    		    	//saving the screenshot taken
    		    	
    		    	FileUtils.copyFile(osmaniaUniversityHomePageScreenshotChangable, new File("./Screenshots/Screenshot Of "+index+" "+nameOfLanguage+".png"));
    		    	
    		    }
    	
    }
	
    public void applicationClose()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		OsmaniyaUniversity_HomePage_ScreenShotOf_MultipleSelectedOptionalValues screenShots = 
				new OsmaniyaUniversity_HomePage_ScreenShotOf_MultipleSelectedOptionalValues();
		
		screenShots.applicationLaunch();
		screenShots.capturingScreenShot();
		screenShots.applicationClose();
	}

}
//*********Comment*****************

//issue with google transalator bar 
//look at OsmaniaHomePageScreenshot12.png,OsmaniaHomePageScreenshot13.png
//and OsmaniaHomePageScreenshot25.png , OsmaniaHomePageScreenshot26.png

//The google translator bar is showing on the page in 11th element of dropDown box the language is arabic
//when our driver selects next element 12th one the language of the page is changed and dropdown box also 
//shows chinese(simplified) selected but in the google bar it shows arabic only

//The google translator bar is showing on the page in 25th element of dropDown box the language is hungarian
//when our driver selects next element 26th one the language of the page is changed and dropdown box also 
//shows indonesian selected but in the google bar it shows hungarian only
