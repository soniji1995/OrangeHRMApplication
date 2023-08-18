package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OHRMLoginTest extends BaseTest {

	Logger log = Logger.getLogger("OHRMLoginTest");

	FileInputStream propertiesFile;
	Properties properties;

	@BeforeTest
	public void loginFunctionalityTest() throws IOException {

		// configuring the Log4j properties file
		PropertyConfigurator.configure("Log4j.properties");

		// identify the properties file

		propertiesFile = new FileInputStream("./src/com/PropertiesFiles/OHRMPropertyFile.properties");

		// creating an object for properties class

		properties = new Properties();

		// loading the properties of file - using properties class object(properties)

		properties.load(propertiesFile);

		// identifying userName element
		By userNameElementProperty = By.id(properties.getProperty("loginWebPageUserNameProperty"));

		// finding userName element
		WebElement userNameElement = driver.findElement(userNameElementProperty);

		// sending the keys to user name element
		// storing the user name into a variable

		String userid = properties.getProperty("UserName");

		userNameElement.sendKeys(userid);
		log.info("******* Successfully entered Username *********");

		// <input name="txtPassword" id="txtPassword" autocomplete="off"
		// type="password">

		// locator/attribute - name
		// selector/value - txtPassword

		// identifying password element
		By passwordElementProperty = By.name(properties.getProperty("loginWebPagePasswordProperty"));

		// finding password element
		WebElement passwordElement = driver.findElement(passwordElementProperty);

		// sending the keys to password element
		// storing the password into a variable

		String passWord = properties.getProperty("Password");
		// sending the keys through a variable to password element text box

		passwordElement.sendKeys(passWord);
		log.info("**********Successfully entered password************");

		// <input type="submit" name="Submit" class="button" id="btnLogin"
		// value="LOGIN">

		// locator/attribute - className
		// selector/value - button

		// identifying button element
		By buttonElementProperty = By.className(properties.getProperty("loginWebPageLoginButtonProperty"));

		// finding button element
		WebElement buttonElement = driver.findElement(buttonElementProperty);

		// performing click operation on button element
		buttonElement.click();
		log.info("Successfully performed click operation on login button");

	}

	@AfterTest
	public void logOut() {

		// identifying the welcome admin element by linkText
		By welcomeAdminElementProperty = By.linkText(properties.getProperty("loginWebPageWelcomeAdminElementProperty"));

		// finding the welcome admin element by id
		WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);

		// performing click operation on welcome admin element
		welcomeAdminElement.click();
		log.info("******* Successfully performed click operation on Welcome Admin Link********");

		// Getting No such element exception in finding element logout

		// <a href="/OrangeHrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

		// identifying the link element logout by link text
		By logoutElementLocator = By.linkText(properties.getProperty("loginWebPageLogoutElementProperty"));

		// finding the link element logout by link text
		WebElement logoutElement = driver.findElement(logoutElementLocator);

		// performing click operation on the link element logout
		logoutElement.click();
		log.info("******* Successfully performed click operation on Logout Link ********");

	}
}