package com.OHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginAndHomePageTesting {
	
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
	
	 public void loginWithMultipleTestData() throws IOException {
		
		//identify the file(excel file) in the sysytem
		
		FileInputStream loginTestDataFile = new FileInputStream("./src/com/OHRMLoginTestDataFile/OHRMLoginTestData.xlsx");
		
		//identify the workbook in the the file
		
		XSSFWorkbook workBook = new XSSFWorkbook(loginTestDataFile);
		
		// identify the sheet in the workbook 
		
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		 //creating a new row 
		 
		XSSFRow sheetOfNewRow = testDataSheet.createRow(1);
	 
	 XSSFCell newRowOfNewCell = sheetOfNewRow.createCell(0);
		
		//set new value into the new row of a cell created
		 
	 newRowOfNewCell.setCellValue("rahulsoni");
	 
	
	 newRowOfNewCell = sheetOfNewRow.createCell(1);
		 
	 newRowOfNewCell.setCellValue("Rahul@1995");
	 
	 //creating a new row
	 
     sheetOfNewRow = testDataSheet.createRow(2);
     
	 newRowOfNewCell = sheetOfNewRow.createCell(0);
		
		//set new value into the new row of a cell created
		 
	 newRowOfNewCell.setCellValue("rahulsoni");
	 	 
	 newRowOfNewCell = sheetOfNewRow.createCell(1);
		 
	 newRowOfNewCell.setCellValue("rah!@#123");
	 
	 
     sheetOfNewRow = testDataSheet.createRow(3);
	 
	 newRowOfNewCell = sheetOfNewRow.createCell(0);
		
		//set new value into the new row of a cell created
		 
	 newRowOfNewCell.setCellValue("12345");
		 
	 newRowOfNewCell = sheetOfNewRow.createCell(1);
		 
	 newRowOfNewCell.setCellValue("Rahul@1995");
	 
	 
     sheetOfNewRow = testDataSheet.createRow(4);
	 
	 newRowOfNewCell = sheetOfNewRow.createCell(0);
		
		//set new value into the new row of a cell created
		 
	 newRowOfNewCell.setCellValue("12345");
		 
	 newRowOfNewCell = sheetOfNewRow.createCell(1);
		 
	 newRowOfNewCell.setCellValue("67890");
	 
	// save the file and work book along with test data
	 
     sheetOfNewRow = testDataSheet.createRow(5);
	 
	 newRowOfNewCell = sheetOfNewRow.createCell(0);
		
		//set new value into the new row of a cell created
		 
	 newRowOfNewCell.setCellValue("rahulsoni");
		 
	 newRowOfNewCell = sheetOfNewRow.createCell(1);
		 
	 newRowOfNewCell.setCellValue("Rahul@1995");
	 

FileOutputStream outputFile = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");
		
	 workBook.write(outputFile);
		 
//		in the sheet identify number of active rows
		
		int rowCount = testDataSheet.getLastRowNum();
		
	// to go to all active rows
		
		for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
		{
	
	// going to an active row 
			
		 XSSFRow row = testDataSheet.getRow(rowIndex);
			
	// in an active row finding the number of active cells
		 
		int rowOfCellCount = row.getLastCellNum();
	
	// go to every active row of all active cells	
		 
		for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellCount;rowOfCellIndex++)
		{
			
	// going to an active row
			
		XSSFRow	newRow = testDataSheet.getRow(rowIndex);
			
	// in active row go to an active cell
		
		XSSFCell newRowOfNewCell1 = newRow.getCell(rowOfCellIndex);
		
	//get the data from the active row of it's respective active cell	
		
		String inputData1 = newRowOfNewCell1.getStringCellValue();
		
		rowOfCellIndex++;
		
		String inputData2 = testDataSheet.getRow(rowIndex).getCell(rowOfCellIndex).getStringCellValue();
		
		rowOfCellIndex += 2;
		
		String actual_UserName = "rahulsoni";
		String actual_Password = "Rahul@1995";
		
		By userNameElementProperty = By.id("txtUsername");
		
		WebElement userNameElement = driver.findElement(userNameElementProperty);
		
		By passwordElementProperty = By.name("txtPassword");
		
		WebElement passwordElement = driver.findElement(passwordElementProperty);
		   
		By buttonElementProperty = By.className("button");
			
		WebElement buttonElement = driver.findElement(buttonElementProperty);
		   
		    if(inputData1.equals(actual_UserName) && inputData2.equals(actual_Password)) {
				
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
				
				newRow = testDataSheet.getRow(rowIndex);
				
				// in active row go to an active cell
					
				newRowOfNewCell1 = newRow.createCell(rowOfCellCount);
				
				newRowOfNewCell1.setCellValue("PASS");
				
				FileOutputStream outputFile2 = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");
				
				workBook.write(outputFile2);
		}
		    
		    else {
		    	
		    	userNameElement.sendKeys(inputData1);
		    	
		    	passwordElement.sendKeys(inputData2);
		    	
		    	buttonElement.click();
				
				newRow = testDataSheet.getRow(rowIndex);
				
				newRowOfNewCell1 = newRow.createCell(rowOfCellCount);
				
				newRowOfNewCell1.setCellValue("FAIL");
				
				FileOutputStream outputFile3 = new FileOutputStream("./src/com/OHRMLoginTestResultFile/OHRMLoginTestResult.xlsx");
				
				workBook.write(outputFile3);
				
				File loginPageScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
			 FileUtils.copyFile(loginPageScreenshot, new File("./Screenshots/"+inputData1+inputData2+".png"));		
              }	   	
		    }    
		 }
     }
	 
	public static void main(String[] args) throws IOException, InterruptedException {
		
		OHRM_LoginAndHomePageTesting work1 = new OHRM_LoginAndHomePageTesting();
		
		work1.applicationLaunch();
		work1.validateLoginPage();
		work1.loginWithMultipleTestData();
		work1.applicationClose();	
   }
}