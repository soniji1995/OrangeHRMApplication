package stepDefinition;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)

@io.cucumber.junit.CucumberOptions(features = "OrangeHRMApplication",

		glue = "stepDefination",

		// the glue will connect the feature file with the // Selenium WebDriver
		// Automation Test Script

		monochrome = true // this removes the junk data in console

)

public class TestRunner {

}