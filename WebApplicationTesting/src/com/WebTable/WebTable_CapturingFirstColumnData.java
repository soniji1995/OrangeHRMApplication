package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstColumnData extends BaseTest {
	
	public static void main(String[] args) {
		
		WebTable_CapturingFirstColumnData firstColumn = new WebTable_CapturingFirstColumnData();
		
		firstColumn.applicationLaunch();
		firstColumn.capturingFirstColumnData();
		firstColumn.applicationClose();
		
	}
	
	public void capturingFirstColumnData() {
		
// finding the common properties of similar elements present in first coloumn
		
		//Expresssion-based on html tags from the start of the webpage to inspected elements
		
		//finding common property among similar elements 
				//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
				//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
				//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
				//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		
		
		//to access these elements we should create a for loop
		
		for(int index=1;index<=36;index++) {
			
			By cityNameElementProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
			
			WebElement cityNameElement = driver.findElement(cityNameElementProperty);
			
			 String cityNameText = cityNameElement.getText();
			 
			 System.out.println(cityNameText);
			
		}
		
		
	}
	

}
