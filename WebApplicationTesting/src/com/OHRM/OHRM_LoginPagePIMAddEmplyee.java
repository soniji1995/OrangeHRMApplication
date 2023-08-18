package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHRM_LoginPagePIMAddEmplyee {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Automating chrome browser
		
				System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
				
				WebDriver driver;
				
				driver = new ChromeDriver();
				
				String applicationUrlAddress = "http://127.0.01/OrangeHrm-4.2.0.1/symfony/web/index.php/dashboard";
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get(applicationUrlAddress);
				
				//<input name="txtUsername" id="txtUsername" type="text">
				
				//locator/attribute - id
				//selector/value - txtUsername
				
		        By userNameElementProperty = By.id("txtUsername");
				
				WebElement userNameElement = driver.findElement(userNameElementProperty);
				
				userNameElement.sendKeys("rahulsoni");
				
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				
				//locator/attribute - name
				//selector/value - txtPassword
				
		        By passwordElementProperty = By.name("txtPassword");
				
				WebElement passwordElement = driver.findElement(passwordElementProperty);
				
				passwordElement.sendKeys("Rahul@1995");

				
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				
				//locator/attribute - className
				//selector/value - button
				
		        By buttonElementProperty = By.className("button");
				
				WebElement buttonElement = driver.findElement(buttonElementProperty);
				
				buttonElement.click();
				
				// <b>PIM</b>
				
				By pimElementProperty = By.linkText("PIM");
				
				WebElement pimElement = driver.findElement(pimElementProperty);
				
				pimElement.click();
				
				
				//<a href="/OrangeHrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
				
				By addEmployeeElementproperty = By.linkText("Add Employee");
				
				WebElement addEmployeeElement = driver.findElement(addEmployeeElementproperty);
				
				addEmployeeElement.click();
				
				
				//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
				//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
				//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
				
				By firstNameElementProperty = By.id("firstName");
				By middleNameElementProperty = By.id("middleName");
				By lastNameElementProperty = By.id("lastName");
			    
			    WebElement firstNameElement = driver.findElement(firstNameElementProperty);	
			    WebElement middleNameElement = driver.findElement(middleNameElementProperty);
			    WebElement lastNameElement = driver.findElement(lastNameElementProperty);
			    
			    String fName = "Rahul";
			    String lName = "Soni";
			    
			    firstNameElement.sendKeys(fName);
			    lastNameElement.sendKeys(lName);
				
			   // <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId">
			    
			    By employeeIdElementProperty = By.id("employeeId");
			    WebElement autoGeneratedIdElement = driver.findElement(employeeIdElementProperty);
			    String autoGeneratedId = autoGeneratedIdElement.getAttribute("value");
			    
			    System.out.println("The value of auto generated id is : "+autoGeneratedId);
			    
			    //<input type="button" class="" id="btnSave" value="Save">
			    
			    By btnElementProperty = By.id("btnSave");
			    
			    WebElement btnElement = driver.findElement(btnElementProperty);
			    
			    btnElement.click();
			    
			    //<input value="Rahul" type="text" name="personal[txtEmpFirstName]"
			    //class="block default editable" maxlength="30" title="First Name" 
			    //id="personal_txtEmpFirstName" disabled="disabled">
			    
			    String firstName = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
			    
			    //<input value="Soni" type="text" name="personal[txtEmpLastName]" 
			    //class="block default editable" maxlength="30" title="Last Name" 
			    //id="personal_txtEmpLastName" disabled="disabled">
			    
			    String lastName = driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
			    
			    System.out.println("The value in First Name is : "+firstName);
			    System.out.println("The value in Last Name is : "+lastName);
			    
                By welcomeAdminElementProperty = By.id("welcome");
				
				WebElement welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);
				
				welcomeAdminElement.click();
				
				//Getting No such element exception in finding element logout 
				
				//<a href="/OrangeHrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
				
				WebDriverWait wait = new WebDriverWait(driver, 10);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
				
				By logoutElementLocator = By.linkText("Logout");
				
				WebElement logoutElement = driver.findElement(logoutElementLocator);
				
				logoutElement.click();
				
				driver.quit();
			    
	}

}
