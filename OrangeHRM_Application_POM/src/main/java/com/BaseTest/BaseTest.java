package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utility.Log;

public class BaseTest {

	String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		// Automating chrome browser

		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");

		driver = new ChromeDriver();
		// System.out.println("************** Chrome Browser Launched
		// Successfully*************** ");

		Log.info("************** Chrome Browser Launched Successfully*************** ");

		driver.get(applicationUrlAddress);
		// System.out.println(" Successfully Navigated to OrangeHRM Application LogIN
		// WebPage ");
		Log.info(" Successfully Navigated to OrangeHRM Application LogIN WebPage ");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
		// System.out.println("************** OrangeHRM Application Closed Successfully
		// **************** ");
		Log.info("************** OrangeHRM Application Closed Successfully **************** ");
	}

}
