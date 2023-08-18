package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationMethods {

	WebDriver driver;
	String applicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@io.cucumber.java.en.Given("^User should Open Chrome Browser on the System$")
	public void user_should_Open_Chrome_Browser_on_the_System() {

		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@io.cucumber.java.en.When("^User enters valid Url Address of OrangeHRM Application$")
	public void user_enters_valid_Url_Address_of_OrangeHRM_Application() {

		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@io.cucumber.java.en.Then("^User should be navigated to OrangeHRM Application LogIn WebPage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage() {

		String expected_logInPageLogInPanelText = "LOGIN Panel";
		System.out.println(" The Expected logIn Page LogIn Panel Text is :- " + expected_logInPageLogInPanelText);

		By logInPanelProperty = By.id("logInPanelHeading");
		WebElement logInPageLogInPanel = driver.findElement(logInPanelProperty);

		String actual_logInPageLogInPanelText = logInPageLogInPanel.getText();
		System.out.println(" The actual logIn Page LogIn Panel Text is :- " + actual_logInPageLogInPanelText);

		if (actual_logInPageLogInPanelText.equals(expected_logInPageLogInPanelText)) {
			System.out.println(" Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
		} else {
			System.out.println("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
		}

	}

	@io.cucumber.java.en.Then("^User should close the Browser with the OrangeHRMApplication Opened$")
	public void user_should_close_the_Browser_with_the_OrangeHRMApplication_Opened() {

		driver.quit();
	}

}