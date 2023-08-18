package com.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseTest.BaseTest;

public class OHRMLoginLogout extends BaseTest {

	WebElement welcomeAdminElement;

	public OHRMLoginLogout() {
		// it's a constructor

	}

	public void loginTest() {

		By userNameElementProperty = By.id("txtUsername");

		WebElement userNameElement = driver.findElement(userNameElementProperty);

		String user = "rahulsoni";

		userNameElement.sendKeys(user);

		// <input name="txtPassword" id="txtPassword" autocomplete="off"
		// type="password">

		// locator/attribute - name
		// selector/value - txtPassword

		By passwordElementProperty = By.name("txtPassword");

		WebElement passwordElement = driver.findElement(passwordElementProperty);

		String passWord = "Rahul@1995";

		passwordElement.sendKeys(passWord);

		// <input type="submit" name="Submit" class="button" id="btnLogin"
		// value="LOGIN">

		// locator/attribute - className
		// selector/value - button

		By buttonElementProperty = By.className("button");

		WebElement buttonElement = driver.findElement(buttonElementProperty);

		buttonElement.click();

		By welcomeAdminElementProperty = By.id("welcome");

		welcomeAdminElement = driver.findElement(welcomeAdminElementProperty);

		String expected_WelcomeText = "Welcome";
		System.out.println("The expected welcome text is :- " + expected_WelcomeText);

		String actual_WelcomeText = welcomeAdminElement.getText();
		System.out.println("The actual welcome text is :- " + actual_WelcomeText);

		if (actual_WelcomeText.contains(expected_WelcomeText)) {

			System.out.println("The expected welcome text exists");
		}

		else {
			System.out.println("The expected welcome text does not exist");
		}
	}

	public void logoutTest() {

		welcomeAdminElement.click();

		// Getting No such element exception in finding element logout

		// <a href="/OrangeHrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

		By logoutElementLocator = By.linkText("Logout");

		WebElement logoutElement = driver.findElement(logoutElementLocator);

		logoutElement.click();
	}

}