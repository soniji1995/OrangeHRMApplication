package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_HeaderLinks_GetTitleAndUrl {

	public static void main(String[] args) {
		

		
		//Automate chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		String applicationUrlAddress = "https://www.tsrtconline.in/oprs-web/";
		
		driver.get(applicationUrlAddress);
		
        By headerBlockLocator = By.className("menu-wrap");
		
		WebElement headerBlock = driver.findElement(headerBlockLocator);
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
				//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		//finding the common property of the elements of the Header Block
		
       By headerBlockLinksLocator = By.tagName("a");
       
       
		//with the header block finding the elemements of it
               
       
		List <WebElement> headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);
		
		//finding the size of the elements identified in header block
		
		
		int headerBlockLinksCount=headerBlockLinks.size();
		
		System.out.println("The number of  links in header block of TSRTC Home Page are : "+headerBlockLinksCount);
		
		//getting the names of the links in the header block
				
      for(int index=0;index<headerBlockLinksCount;index++) {
			
			 String headerBlockLinkName = headerBlockLinks.get(index).getText();
			 System.out.println(index+" "+headerBlockLinkName);
			 
			 headerBlockLinks.get(index).click();
			 
			 String webPageTitle = driver.getTitle();
			 System.out.println(webPageTitle);
			 
			 String webPageCurrentUrlAddress = driver.getCurrentUrl();
			 System.out.println(webPageCurrentUrlAddress);
			 System.out.println();
			 
			 // exception in thread main org.openqa.selenium.staleElementsreferenceException:stale element reference : 
			 // stale element not found
			 
			 //driver focus should be navigated back to actual webpage(previous page)
			 //In which elements are under test
			 
			 driver.navigate().back();
			 
			 //once the driver focus shifts from one page to another the data stored of previous page on the driver
			 //gets cleared
			 
			 //we should make the driver focus to be in the current page
			 //identifying the header Block again
			 
			 headerBlock = driver.findElement(headerBlockLocator);
			 
			 //Recreating the arrayList to store all the elements of the Header Block
			 
			 headerBlockLinks = headerBlock.findElements(headerBlockLinksLocator);
		}

		driver.quit();
		
		}
		
	}