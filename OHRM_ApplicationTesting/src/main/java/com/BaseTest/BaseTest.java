package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log1;

public class BaseTest {

	String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {

		// Automating chrome browser

		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");

		driver = new ChromeDriver();
		// System.out.println("************** Chrome Browser Launched
		// Successfully*************** ");

		Log1.info("************** Chrome Browser Launched Successfully*************** ");

		driver.get(applicationUrlAddress);
		// System.out.println(" Successfully Navigated to OrangeHRM Application LogIN
		// WebPage ");
		Log1.info(" Successfully Navigated to OrangeHRM Application LogIN WebPage ");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
		// System.out.println("************** OrangeHRM Application Closed Successfully
		// **************** ");
		Log1.info("************** OrangeHRM Application Closed Successfully **************** ");
	}

}
