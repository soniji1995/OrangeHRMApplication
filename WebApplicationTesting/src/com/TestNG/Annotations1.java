package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test(priority=1)
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
	
	@Test(priority=6)
    public void applicationClose() {
		
		System.out.println("Gmail Application closed successfully");
	}
	

}
