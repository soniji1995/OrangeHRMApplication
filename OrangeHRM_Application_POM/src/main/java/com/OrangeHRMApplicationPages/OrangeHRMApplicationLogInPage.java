package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplicationLogInPage extends BaseTest {

	// This is an object repository class - elements identification and operation
	// done on the elements
	// on the webpage is developed

	public OrangeHRMApplicationLogInPage() // It is a constructor
	{
		PageFactory.initElements(driver, this);
	}

	// id = "logInPanelHeading"

	// WebElement logInWebPageLogInPanel =
	// driver.findElement(By.id("logInPanelHeading"));

	// This class is written with Identification of Element on the WebPage
	@FindBy(id = "logInPanelHeading")
	WebElement logInWebPageLogInPanel;

	public void logInWebPageLogInPanelText() {
		String expected_LogInWebPageLogInPanelText = "LOGIN Panel";
		System.out.println(" The expected Text of the OrangeHRM Application LogIN WebPage is :- "
				+ expected_LogInWebPageLogInPanelText);

		String actual_LogInWebPageLogInPanelText = logInWebPageLogInPanel.getText();
		System.out.println(" The actual Text of the OrangeHRM Application LogIN WebPage is :- "
				+ actual_LogInWebPageLogInPanelText);

		if (actual_LogInWebPageLogInPanelText.equals(expected_LogInWebPageLogInPanelText)) {
			System.out.println(" Sucecssfully Navigated to OrangeHRM Application LogIn WebPage - PASS ");
		} else {
			System.out.println(" Failed to Navigated to OrangeHRM Application LogIn WebPage - FAIL ");
		}

	}

	// <input name="txtUsername" id="txtUsername" type="text">

	// locator/attribute - id
	// selector/value - txtUsername

	@FindBy(id = "txtUsername")
	WebElement userNameElement;

	// <input name="txtPassword" id="txtPassword" autocomplete="off"
	// type="password">

	// locator/attribute - name
	// selector/value - txtPassword

	@FindBy(id = "txtPassword")
	WebElement passwordElement;

	// <input type="submit" name="Submit" class="button" id="btnLogin"
	// value="LOGIN">

	// locator/attribute - className
	// selector/value - button

	@FindBy(id = "btnLogin")
	WebElement logInButtonElement;

	@FindBy(id = "welcome")
	WebElement homePageWelComeAdmin;

	/*
	 * String user = "rahulsoni"; String password = "Rahul@1995";
	 * 
	 * public void loginFunctionalityTest() {
	 * 
	 * 
	 * userNameElement.sendKeys(user);
	 * 
	 * passwordElement.sendKeys(password);
	 * 
	 * buttonElement.click();
	 * 
	 * }
	 */
	public void logInTest(String UserName, String Password) {

		userNameElement.sendKeys(UserName);
		Log.info("******* Successfully entered Username *********");

		passwordElement.sendKeys(Password);
		Log.info("******* Successfully entered Password *********");

		logInButtonElement.click();
		Log.info("Successfully performed click operation on login button");

		String expected_HomePageText = "Welcome";
		// System.out.println(" The Expected Text of OrangeHRM Application HomePage is
		// "+expected_HomePageText);
		Log.info(" The Expected Text of OrangeHRM Application HomePage is " + expected_HomePageText);

		String actual_HomePageText = homePageWelComeAdmin.getText();
		// System.out.println(" The actual text of OrangeHRM Application HomePage is :-
		// "+actual_HomePageText);
		Log.info(" The actual text of OrangeHRM Application HomePage is :- " + actual_HomePageText);

		if (actual_HomePageText.contains(expected_HomePageText)) {
			// System.out.println(" Successfully Navigated to OrangeHRM Application HomePage
			// - PASS ");
			Log.info(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
		} else {
			// System.out.println(" Failed to Navigate to OrangeHRM Application HomePage -
			// FAIL");
			Log.info(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");
		}

	}

	// OrangeHRM Application LogIn Webpage Logo Validation
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMLogInPageLogo;

	public void orangeHRMLogInPageLogo() {
		boolean flag = orangeHRMLogInPageLogo.isDisplayed();

		if (flag) {
			// System.out.println(" OrangeHRM Application LogIN WebPage contains LOGO -
			// PASS");
			Log.info(" OrangeHRM Application LogIN WebPage contains LOGO - PASS");
		} else {
			// System.out.println("OrangeHRM Application LogIN WebPage contains LOGO - FAIL
			// ");
			Log.info("OrangeHRM Application LogIN WebPage contains LOGO - FAIL ");
		}

	}

	// <select name="openIdProvider" id="openIdProvider">
	// <option value="" selected="selected">-- Select --</option>
	// </select>

	// OrangeHRM select dropdown validation

	@FindBy(id = "openIdProvider")
	WebElement selectDropDownElement;

	public void orangeHRMLogInPageDropDown() {

		boolean flag = selectDropDownElement.isDisplayed();

		if (flag) {
			// System.out.println(" OrangeHRM Application LogIN WebPage contains select drop
			// down -
			// PASS");
			Log.info(" OrangeHRM Application LogIN WebPage contains select drop down - PASS");
		} else {
			// System.out.println("OrangeHRM Application LogIN WebPage contains select drop
			// down - FAIL
			// ");
			Log.info("OrangeHRM Application LogIN WebPage does not contain select drop down - FAIL ");
		}

	}

	// <input type="button" value="Login"
	// name="openIdLogin" id="openIdLogin" disabled="disabled">

	// OrangeHRM another login button validation

	@FindBy(id = "openIdLogin")
	WebElement alternativeLoginButton;

	public void orangeHRMLogInPageAlternativeLoginButton() {

		boolean flag = alternativeLoginButton.isDisplayed();

		if (flag) {
			// System.out.println(" OrangeHRM Application LogIN WebPage contains alternative
			// login button -
			// PASS");
			Log.info(" OrangeHRM Application LogIN WebPage contains alternative login button - PASS");
		} else {
			// System.out.println("OrangeHRM Application LogIN WebPage does not contain
			// alternative login button - FAIL");
			Log.info("OrangeHRM Application LogIN WebPage does not contain alternative login button - FAIL ");
		}

	}

	// <a href="http://www.orangehrm.com" target="_blank">OrangeHRM, Inc</a>

	// orange hrm footer link validation

	@FindBy(linkText = "OrangeHRM, Inc")
	WebElement footerLinkElement;

	public void orangeHRMFooterLink() {

		boolean flag = footerLinkElement.isDisplayed();

		footerLinkElement.click();

		String footerLinkUrlAddress = driver.getCurrentUrl();
		Log.info("The URL Address of the Footer link is :- " + footerLinkUrlAddress);

		if (flag) {
			// System.out.println(" OrangeHRM Application LogIN WebPage footer contains a
			// link OrangeHRM, Inc which navigates to " +footerLinkUrlAddress+"
			// - PASS");
			Log.info(" OrangeHRM Application LogIN WebPage footer contains a link OrangeHRM, Inc which navigates to "
					+ footerLinkUrlAddress + " - PASS");
		} else {
			// System.out.println("OrangeHRM Application LogIN WebPage does not contain
			// a link OrangeHRM, Inc - FAIL");
			Log.info("OrangeHRM Application LogIN WebPage footer does not contain a link OrangeHRM, Inc - FAIL ");
		}
	}

	/*
	 * unable to identify the text using xpath ///
	 * html/body/div[1]/div/div[4]/div[1]/text()[1]
	 * 
	 * @FindBy(xpath = "/html/body/div[1]/div/div[4]/div[1]/text()[1]") WebElement
	 * footerTextElement;
	 * 
	 * 
	 * 
	 * public void orangeHRMLoginWebPageFooterText() {
	 * 
	 * boolean flag = footerTextElement.isDisplayed();
	 * 
	 * if (flag) { // System.out.println(" OrangeHRM Application LogIN WebPage
	 * contains footer text // "+footerElementText+" - // PASS");
	 * Log.info(" OrangeHRM Application LogIN WebPage contains footer text- PASS");
	 * } else { // System.out.println("OrangeHRM Application LogIN WebPage does not
	 * contain // alternative login button - FAIL"); Log.
	 * info("OrangeHRM Application LogIN WebPage does not contain footer text - FAIL "
	 * ); }
	 * 
	 * }
	 * 
	 */

	// xpath of image with link linkdln image
	// /html/body/div[1]/div/div[4]/div[2]/a[1]/img

	// xpath of image with link facebook
	// /html/body/div[1]/div/div[4]/div[2]/a[2]/img

	// xpath of image with link twitter /html/body/div[1]/div/div[4]/div[2]/a[3]/img

	// xpath of image with link youtube /html/body/div[1]/div/div[4]/div[2]/a[4]/img

	@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[2]/a[1]/img")
	WebElement linkImageLinkdln;

	@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[2]/a[2]/img")
	WebElement linkImageFacebook;

	@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[2]/a[3]/img")
	WebElement linkImageTwitter;

	@FindBy(xpath = "/html/body/div[1]/div/div[4]/div[2]/a[4]/img")
	WebElement linkImageYoutube;

	public void orangeHRMLoginPageFooterLinkImages() {

		boolean flag1 = linkImageLinkdln.isDisplayed();

		boolean flag2 = linkImageFacebook.isDisplayed();

		boolean flag3 = linkImageTwitter.isDisplayed();

		boolean flag4 = linkImageYoutube.isDisplayed();

		if (flag1 == flag2 == flag3 == flag4) {
			// System.out.println(" OrangeHRM Application LogIN WebPage footer contains
			// linkdln,facebook,twitter,youtube images with link
			// PASS");
			Log.info(
					" OrangeHRM Application LogIN WebPage footer contains linkdln,facebook,twitter,youtube images with link - PASS");
		} else {
			// System.out.println("OrangeHRM Application LogIN WebPage does not contain
			// alternative login button - FAIL");
			Log.info("OrangeHRM Application LogIN WebPage does not contain images with link - FAIL ");
		}

	}

}