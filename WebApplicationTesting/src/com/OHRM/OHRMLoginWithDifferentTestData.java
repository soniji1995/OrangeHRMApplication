package com.OHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLoginWithDifferentTestData {
	
	String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
	WebDriver driver;
	
	public void applicationLaunch() {
		
		//Automating chrome browser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void applicationClose() {
		
		driver.quit();
	}
	
public void validateLoginPage() {
		
		String expected_OrangeHrmLoginPageTitle = "OrangeHRM";
		System.out.println("The expected title of OrangeHrm Login Page is :- "+expected_OrangeHrmLoginPageTitle);
		
		String actual_OrangeHrmLoginPageTitle = driver.getTitle();
		System.out.println("The actual title of OrangeHrm Login Page is :- "+actual_OrangeHrmLoginPageTitle);
		
		if(actual_OrangeHrmLoginPageTitle.equals(expected_OrangeHrmLoginPageTitle)) {
			
			System.out.println("The expected title of OrangeHrm Login Page is matched :- PASS");
		}
		else {
			
			System.out.println("The expected title of OrangeHrm Login Page is NOT matched :- FAIL");
		}
		
		String expected_OrangeHrmLoginPageUrlAddress = "Orange";
		System.out.println("The expected Url Address of OrangeHrm Login Page is :- "+expected_OrangeHrmLoginPageUrlAddress);
		
		String actual_OrangeHrmLoginPageUrlAddress = driver.getCurrentUrl();
		System.out.println("The  actual Url Address of OrangeHrm Login Page is :- "+actual_OrangeHrmLoginPageUrlAddress);
		
		if(actual_OrangeHrmLoginPageUrlAddress.contains(expected_OrangeHrmLoginPageUrlAddress)) {
			
			System.out.println("The expected Url Address exists :- PASS");
		}
		else {
			
			System.out.println("The expected Url Address does not exist :- FAIL");
		}
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
		     By loginPanelHeadingProperty = By.id("logInPanelHeading");
		
		   WebElement  loginPanelHeadingElement = driver.findElement(loginPanelHeadingProperty);
		   
		   String expected_LoginPanelHeadingText = "LOGIN Panel";
		   
		   System.out.println("The expected Login Panel Heading Text is :- "+expected_LoginPanelHeadingText);
		   
		   String actual_LoginPanelHeadingText = loginPanelHeadingElement.getText();
		   
		   System.out.println("The actual Login Panel Heading Text is :- "+actual_LoginPanelHeadingText);
		   
		   if(actual_LoginPanelHeadingText.equals(expected_LoginPanelHeadingText)) {
			   
			   System.out.println("The expected Login panel Heading Text matches - PASS");
		   }
		   
		   else {
			   
			   System.out.println("The expected Login panel Heading Text does not match - FAIL");
		   }
		
	}
	
	
	
	public void loginWithDiiferentTestData() throws IOException {
		
		//identify the file(excel file) in the sysytem
		
				FileInputStream loginTestDataFile = new FileInputStream("./src/com/OHRMLoginTestDataFile/OHRMLoginTestData.xlsx");
				
				//identify the workbook in the the file
				
				XSSFWorkbook workBook = new XSSFWorkbook(loginTestDataFile);
				
				// identify the sheet in the workbook 
				
				XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

//				in the sheet identify number of active rows
				
				int rowCount = testDataSheet.getLastRowNum();
				
			// to go to all active rows
				
				for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
				{
			
			// going to an active row 
					
				 XSSFRow row = testDataSheet.getRow(rowIndex);
					
			// in an active row finding the number of active cells
				 
				int rowOfCellCount = row.getLastCellNum();
			
			// go to every active row of all active cells	
				 
					
			// going to an active row	
			// in active row go to an active cell
				
				
				
				String inputData1 =	testDataSheet.getRow(rowIndex).getCell(0).getStringCellValue();
				
			//get the data from the active row of it's respective active cell	
				
				
				
				String inputData2 = testDataSheet.getRow(rowIndex).getCell(1).getStringCellValue();
				
				By userNameElementProperty = By.id("txtUsername");
				
				WebElement userNameElement = driver.findElement(userNameElementProperty);
				
				By passwordElementProperty = By.name("txtPassword");
				
				WebElement passwordElement = driver.findElement(passwordElementProperty);
				   
				By buttonElementProperty = By.className("button");
					
				WebElement buttonElement = driver.findElement(buttonElementProperty);
				   
				
				    if(inputData1.equals("rahulsoni") && inputData2.equals("Rahul@1995"))
				    {
						
						userNameElement.sendKeys(inputData1);
						
						passwordElement.sendKeys(inputData2);
						 
						buttonElement.click();
						
						
						
						By welcomeAdminElementProperty = By.id("welcome");
						
						WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);
						
						String expected_WelcomeText = "Admin";
						System.out.println("The expected welcome text is :- "+expected_WelcomeText);
						
						String actual_WelcomeText = welcomeAdminElement.getText();
						System.out.println("The actual welcome text is :- "+actual_WelcomeText);
						
						if(actual_WelcomeText.contains(expected_WelcomeText)) {
							
							System.out.println("The expected welcome text exists");
						}
						
						else {
							System.out.println("The expected welcome text does not exist");
						}
						
						welcomeAdminElement.click();
						
						By logoutElementLocator = By.linkText("Logout");
						
						WebElement logoutElement = driver.findElement(logoutElementLocator);
						
						logoutElement.click();
						
						testDataSheet.getRow(rowIndex).createCell(rowOfCellCount).setCellValue("PASS");
						
						FileOutputStream outputFile2 = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");
						
						workBook.write(outputFile2);
				}
				    
				    else
				    {
				    	
				    	
				    	userNameElement.sendKeys(inputData1);
				    	
				    	passwordElement.sendKeys(inputData2);
				    	
				    	buttonElement.click();
						
						testDataSheet.getRow(rowIndex).createCell(rowOfCellCount).setCellValue("FAIL");
						
						FileOutputStream outputFile3 = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");
						
						workBook.write(outputFile3);
						
						File loginPageScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
					 FileUtils.copyFile(loginPageScreenshot, new File("./Screenshots/"+inputData1+inputData2+".png"));		
		              }	   	
				    }    
				 }
	
	public static void main(String[] args) throws IOException {
		
		OHRMLoginWithDifferentTestData operate = new OHRMLoginWithDifferentTestData();
		operate.applicationLaunch();
		operate.validateLoginPage();
		operate.loginWithDiiferentTestData();
		operate.applicationClose();
	}

}