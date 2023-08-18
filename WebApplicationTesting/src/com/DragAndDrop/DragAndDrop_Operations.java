package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Operations {
	
    WebDriver driver;
	
    String applicationUrlAddress = "https://jqueryui.com/droppable/";
    
    public void applicationLaunch() {
    	
    	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrlAddress);
    }
    
    public void dragNDrop() throws InterruptedException
    {
    	
    	//identifying the frame on the webpage
    	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

    	    	By webPageFrameProperty = By.className("demo-frame");
    	    	
    	    	WebElement webPageFrame = driver.findElement(webPageFrameProperty);
    	    	
    	// we have to switch the driver focus on the frame 
    	    	
    	    	driver.switchTo().frame(webPageFrame);
    	    	
    	    	// draganddrop element property id = "draggable"
    	    	
    	    	By dragMeToMyTargetProperty = By.id("draggable");
    	    	
    	    	//identifying the dragMeToMyTarget Element
    	    	
    	    	WebElement dragMeToMyTarget = driver.findElement(dragMeToMyTargetProperty);
    	    	
    	    	//<div id="droppable" class="ui-widget-header ui-droppable">
    	    	//<p>Drop here</p></div>
    	    	
    	    	
    	    	//finding the element droppable to drag and drop the dragMeToMyTarget Element
    	    	
    	    	By dropElementProperty = By.id("droppable");
    	    	
    	    	// identifying the element
    	    	
    	    
    	    	
    	    	WebElement dropHere = driver.findElement(dropElementProperty);
    	    	
    	    	
    	    	
    	    	//performing an operation on dragMeToMyTarget and dropElement both
    	    	
    	    	Actions action = new Actions(driver);
    	    	
    	    	action.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
    	    	
//since the driver focus is on the frame of the webpage switching back to the actual page content
//to perform operation to the another elements of the page    	    	
    	    	
    	    	driver.switchTo().defaultContent();
    	    	
    	    	//Automating Resize element 
    	    	//<a href="https://jqueryui.com/resizable/">Resizable</a>
    	    	
    	    	By resizableProperty = By.linkText("Resizable");
    	    	
    	    	WebElement resizable = driver.findElement(resizableProperty);
    	    	
//operation on the Resizable element
    	    	
    	    	resizable.click();
    	    	
    	    	String resizableWebPageTitle = driver.getTitle();
    	    	
    	    	System.out.println("The Title of the Resizable WebPage is : - "+resizableWebPageTitle);
    	    	
    }
    
    public static void main(String[] args) throws InterruptedException {
		
    	DragAndDrop_Operations dragDrop = new DragAndDrop_Operations();
    	
    	dragDrop.applicationLaunch();
    	dragDrop.dragNDrop();
    	
    	
	}
    
    
    public void applicationClose()
   	{
   		driver.quit();
   	}

}
