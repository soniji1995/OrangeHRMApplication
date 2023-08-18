package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_Print_LinkNames {
	
	public static void main(String[] args) {
		
String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		//<a href="#" onclick="populateSearch('1386430615487', 'Bangalore', '5231', 'Hyderabad');">	
		//Bangalore - Hyderabad</a>
		//<a href="/oprs-web/home/aboutus.do" title="About Us">About Us</a>
		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn"
		//value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		//whenever we work on a group of similar elements find the common property among the elements property
		//property of the element -common property anchor element
		
		By linksLocator = By.tagName("a");
		
		//since we are working on many elements the method is find elements
		//when we want to store multiple elements into a variable then we should go for arrayList(stored
		//with many WebElements) - List<WebElement>
		
		List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksLocator);
		
		int tsrtc_HomePageLinksCount = tsrtc_HomePageLinks.size();
		
		System.out.println("The number of elements which are type of link element on TSRTC application home page are : "+tsrtc_HomePageLinksCount);
		
		for(int index=0;index<tsrtc_HomePageLinksCount;index++) {
			
			String tsrtc_HomePageLinkName= tsrtc_HomePageLinks.get(index).getText();
			
			System.out.println(index+1+" "+tsrtc_HomePageLinkName);
		}
		
		driver.quit();
		
	}

}
