package com.OrangeHRMApplicationPages;

import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplicationHomePage extends BaseTest {

	// This is an object repository class - elements identification and operation
	// done on the elements
	// on the webpage is developed

	public OrangeHRMApplicationHomePage() // It is a constructor
	{
		PageFactory.initElements(driver, this);
	}

}
