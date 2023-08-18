package com.OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OHRMLogin_With_MultipleTestData extends BaseTest {

	// no need because we are extending BaseTest class
	// WebDriver driver;
	// String applicationUrlAddress =
	// "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";

	// declaring the variables globally

	Logger log = Logger.getLogger("OHRMLogin_With_MultpleTestData");

	FileInputStream loginTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	XSSFRow row;
	FileOutputStream outputFile;

	FileInputStream propertiesFile;
	Properties properties;

	XSSFRow resultRow;
	XSSFCell resultRowOfCell;

	@Test(priority = 1, description = "Validate OrangeHRM Login Page")
	public void validateLoginPageTest() throws IOException

	{
		// configuring the Log4j properties file
		PropertyConfigurator.configure("Log4j.properties");

		propertiesFile = new FileInputStream("./src/com/PropertiesFiles/OHRMPropertyFile.properties");

		// creating an object for properties class

		properties = new Properties();

		// loading the properties of file - using properties class object(properties)

		properties.load(propertiesFile);

		// storing client's expected orangeHRM application title
		String expected_OrangeHrmLoginPageTitle = "OrangeHRM";
		// System.out.println("The expected title of OrangeHrm Login Page is :-
		// "+expected_OrangeHrmLoginPageTitle);
		log.info("The expected title of OrangeHrm Login Page is :- " + expected_OrangeHrmLoginPageTitle);

		// getting actual orangeHRM application title and storing in a variable
		String actual_OrangeHrmLoginPageTitle = driver.getTitle();
		// System.out.println("The actual title of OrangeHrm Login Page is :-
		// "+actual_OrangeHrmLoginPageTitle);
		log.info("The actual title of OrangeHrm Login Page is :- " + actual_OrangeHrmLoginPageTitle);

		// comparison of actual and expected title
		if (actual_OrangeHrmLoginPageTitle.equals(expected_OrangeHrmLoginPageTitle)) {

			// if the actual title matches expected one this message gets printed
			// System.out.println("The expected title of OrangeHrm Login Page is matched :-
			// PASS");
			log.info("The expected title of OrangeHrm Login Page is matched :- PASS");

		} else {

			// if the actual title doesn't match expected one this message gets printed
			// System.out.println("The expected title of OrangeHrm Login Page is NOT matched
			// :- FAIL");
			log.info("The expected title of OrangeHrm Login Page is NOT matched :- FAIL");
		}

		// storing client's expected orangeHRM application URL Address and storing into
		// a variable

		String expected_OrangeHrmLoginPageUrlAddress = "Orange";

		// System.out.println("The expected Url Address of OrangeHrm Login Page is :-
		// "+expected_OrangeHrmLoginPageUrlAddress);
		log.info("The expected Url Address of OrangeHrm Login Page is :- " + expected_OrangeHrmLoginPageUrlAddress);

		// getting actual orangeHRM application URL Address and storing into a variable
		String actual_OrangeHrmLoginPageUrlAddress = driver.getCurrentUrl();

		// System.out.println("The actual Url Address of OrangeHrm Login Page is :-
		// "+actual_OrangeHrmLoginPageUrlAddress);
		log.info("The  actual Url Address of OrangeHrm Login Page is :- " + actual_OrangeHrmLoginPageUrlAddress);

		// comparison of actual and expected URL Address
		if (actual_OrangeHrmLoginPageUrlAddress.contains(expected_OrangeHrmLoginPageUrlAddress)) {

			// System.out.println("The expected Url Address exists :- PASS");
			log.info("The expected Url Address exists :- PASS");
		} else {

			// System.out.println("The expected Url Address does not exist :- FAIL");
			log.info("The expected Url Address does not exist :- FAIL");
		}

		// <div id="logInPanelHeading">LOGIN Panel</div>

		// identifying login Panel element by id
		By loginPanelHeadingProperty = By.id(properties.getProperty("loginWebPageLoginPanelElementProperty"));

		// finding login panel element using id
		WebElement loginPanelHeadingElement = driver.findElement(loginPanelHeadingProperty);

		// storing client's expected orangeHRM application Login Panel Heading Text in a
		// variable
		String expected_LoginPanelHeadingText = "LOGIN Panel";
		log.info("The expected Login Panel Heading Text is :- " + expected_LoginPanelHeadingText);

		// System.out.println("The expected Login Panel Heading Text is :-
		// "+expected_LoginPanelHeadingText);

		// getting actual orangeHRM application Home Page Login Panel Heading Text and
		// storing into a variable
		String actual_LoginPanelHeadingText = loginPanelHeadingElement.getText();

		// System.out.println("The actual Login Panel Heading Text is :-
		// "+actual_LoginPanelHeadingText);
		log.info("The actual Login Panel Heading Text is :- " + actual_LoginPanelHeadingText);

		// comparison of actual and expected Login Panel Heading Text
		if (actual_LoginPanelHeadingText.equals(expected_LoginPanelHeadingText)) {

			// System.out.println("The expected Login panel Heading Text matches - PASS");
			log.info("The expected Login panel Heading Text matches - PASS");
		}

		else {

			// System.out.println("The expected Login panel Heading Text does not match -
			// FAIL");
			log.info("The expected Login panel Heading Text does not match - FAIL");
		}

	}

	@Test(priority = 2, description = "Login with multiple test data in orangeHRM Application")
	public void loginWithMultipleTestData() throws IOException {

		// identify the file(excel file) in the sysytem

		loginTestDataFile = new FileInputStream("./src/com/OHRMLoginTestDataFile/OHRMLoginTestData.xlsx");

		// identify the workbook in the the file

		workBook = new XSSFWorkbook(loginTestDataFile);

		// identify the sheet in the workbook

		testDataSheet = workBook.getSheet("Sheet1");

		// in the sheet identify number of active rows

		int rowCount = testDataSheet.getLastRowNum();
		log.info("The total number of rows present in excel sheet are :- " + rowCount);
		// to go to all active rows

		for (int rowIndex = 1; rowIndex <= rowCount; rowIndex++) {

			// going to an active row

			row = testDataSheet.getRow(rowIndex);

			// in an active row finding the number of active cells

			int rowOfCellCount = row.getLastCellNum();
			log.info("The total number of row of cells present in excel sheet are :- " + rowOfCellCount);

			// storing the user name and password in the variables
			String inputData1 = row.getCell(0).getStringCellValue();
			log.info("user name to be entered is  :- " + inputData1);

			String inputData2 = row.getCell(1).getStringCellValue();
			log.info("password to be entered is  :- " + inputData2);

			// identifying user Name Element

			By userNameElementProperty = By.id(properties.getProperty("loginWebPageUserNameProperty"));

			// finding user Name Element

			WebElement userNameElement = driver.findElement(userNameElementProperty);

			// identifying password Element
			By passwordElementProperty = By.name(properties.getProperty("loginWebPagePasswordProperty"));

			// finding password Element
			WebElement passwordElement = driver.findElement(passwordElementProperty);

			// identifying Button Element
			By buttonElementProperty = By.className(properties.getProperty("loginWebPageLoginButtonProperty"));

			// finding button Element
			WebElement buttonElement = driver.findElement(buttonElementProperty);

			// will provide access to login if username and password matches

			String actual_userName = properties.getProperty("UserName");
			log.info("The actual user name is :- " + actual_userName);

			String actual_password = properties.getProperty("Password");
			log.info("The actual password is :- " + actual_password);

			if (inputData1.equals(actual_userName) && inputData2.equals(actual_password)) {

				// sending the keys to username and password element

				userNameElement.sendKeys(inputData1);
				log.info("Sending the user name to user name text box " + inputData1);

				passwordElement.sendKeys(inputData2);
				log.info("Sending the password to password text box " + inputData2);

				// performing click operation on button element
				buttonElement.click();
				log.info("***** Suceessfully performed click operation on login button ******");

				// identifying welcome admin Element

				By welcomeAdminElementProperty = By
						.linkText(properties.getProperty("loginWebPageWelcomeAdminElementProperty"));

				// finding welcome admin Element

				WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);

				// storing customer's expected requirement

				String expected_WelcomeText = "Admin";
				// System.out.println("The expected welcome text is :- "+expected_WelcomeText);
				log.info("The expected welcome text is :- " + expected_WelcomeText);

				// getting the actual result
				String actual_WelcomeText = welcomeAdminElement.getText();
				// System.out.println("The actual welcome text is :- " + actual_WelcomeText);
				log.info("The actual welcome text is :- " + actual_WelcomeText);

				// comparing both actual and expected welcome text
				if (actual_WelcomeText.contains(expected_WelcomeText)) {

					// System.out.println("Successfully navigated to orangeHRM Home Page");
					log.info("Successfully navigated to orangeHRM Home Page");
				}

				else {
					// System.out.println("Failed to navigate to orangeHRM Home Page");
					log.info("Failed to navigate to orangeHRM Home Page");
				}

				welcomeAdminElement.click();
				log.info("*****Successfully performed click operation on Welcome Admin Link*****");
				// synchronization

				// no such element comes when driver is unable meanwhile the
				// application gets loaded on a webpage to locate an element

				// synchronization

				// Thread.sleep---java wait should not be used in real time

				// but for driver to wait 10 seconds we have already used implicit of
				// 10 seconds wait at the top of the script

				// Let us request the webdriver to wait for another 10 seconds timeout as backup

				WebDriverWait wait = new WebDriverWait(driver, 10);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

				// identifying logout element
				By logoutElementLocator = By.linkText(properties.getProperty("loginWebPageLogoutElementProperty"));

				// finding logout element
				WebElement logoutElement = driver.findElement(logoutElementLocator);

				// performing click operation on logout element
				logoutElement.click();
				log.info("*******Successfully performed click operation on Logout Link*******");

				// getting active row
				resultRow = testDataSheet.getRow(rowIndex);

				// creating cell in an active row
				resultRowOfCell = resultRow.createCell(rowOfCellCount);

				// exporting the result of login to excel file
				resultRowOfCell.setCellValue("PASS");

				// saving the file
				outputFile = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");

				workBook.write(outputFile);
			}

			else {
				// sending user name to username element text box
				userNameElement.sendKeys(inputData1);
				log.info("Sending the user name to user name text box " + inputData1);

				// sending password to password element text box
				passwordElement.sendKeys(inputData2);
				log.info("Sending the password to password text box " + inputData2);

				// performing click operation on button element

				buttonElement.click();
				log.info("Successfully performed click operation on login button");

				// exporting the result of login to excel file

				// getting active row
				resultRow = testDataSheet.getRow(rowIndex);

				// creating cell in an active row
				resultRowOfCell = resultRow.createCell(rowOfCellCount);

				// exporting the result of login to excel file
				resultRowOfCell.setCellValue("FAIL");

				// saving the file
				outputFile = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");

				workBook.write(outputFile);

				// taking a screenshot
				File loginPageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				// saving a screenshot
				FileUtils.copyFile(loginPageScreenshot,
						new File("./OHRMLoginFailedScreenshots/" + inputData1 + inputData2 + ".png"));
			}
		}
	}
}