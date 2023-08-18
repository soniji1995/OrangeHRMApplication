package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeMethod
	public void gmailApplicationLaunch() {
		
		System.out.println("gmail application launched successfully");
	}
	
	@Test(priority=2)
    public void InBoxTest() {
		
		System.out.println("InBox functionality Test successfull");
	}
	
	@Test(enabled=false)
    public void DraftMailTest() {
		
		System.out.println("DraftMail functionality Test successfull");
	}
	
	@Test(priority=3)
    public void composeMailTest() {
		
		System.out.println("ComposeMail functionality Test successfull");
	}
	
	@Test(priority=5)
    public void SentMailTest() {
		
		System.out.println("SentMail functionality Test successfull");
	}
	
	@AfterMethod
    public void applicationClose() {
		
		System.out.println("Gmail Application closed successfully");
	}


}
