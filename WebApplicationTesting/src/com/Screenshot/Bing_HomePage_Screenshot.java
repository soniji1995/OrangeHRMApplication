package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_HomePage_Screenshot {
	
	WebDriver driver;
	
    String applicationUrlAddress = "https://bing.com/";
    
    public void applicationLaunch() {
    	
    	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
    	
    }
    
    public void capturingScreenShot() throws IOException, InterruptedException
    {
 
//      TakesScreenShot - it's an inteface of selenium WebDriver
//    	TypeCasting - an interface when it is binded with an object of a class
//    	OutputType - It's an interface of Selenium WebDriver
//    	FileUtils - is a class from apache poi - commons.io jar
//    	copyFile - is a method in FileUtils class
    	
    	Thread.sleep(2000);
    	File bingScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(bingScreenshot, new File("./Screenshots/bingHomePageScreenshot.png"));
    	
    }
	
    public void applicationClose()
	{
		driver.quit();
	}
    
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Bing_HomePage_Screenshot screenShot = new Bing_HomePage_Screenshot();
		
		screenShot.applicationLaunch();
		screenShot.capturingScreenShot();
		screenShot.applicationClose();
		
	}

}
