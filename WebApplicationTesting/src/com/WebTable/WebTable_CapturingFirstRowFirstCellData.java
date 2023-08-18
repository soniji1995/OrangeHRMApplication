package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstRowFirstCellData extends BaseTest {

	public void capturingFirstRowFirstCellData() {
		
//property of accra city element
//Expresssion-based on html tags from the start of the webpage to inspected elements
		
//finding common property among similar elements 
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
		//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		By cityNameElementProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		
		WebElement cityNameElement = driver.findElement(cityNameElementProperty);
		
		 String cityNameText = cityNameElement.getText();
		 
		 System.out.println("The name of the city in the first row of first cell is :- "+cityNameText);
		
	}
	
	public static void main(String[] args) {
		
		WebTable_CapturingFirstRowFirstCellData cityName = new WebTable_CapturingFirstRowFirstCellData();
		
		cityName.applicationLaunch();
		cityName.capturingFirstRowFirstCellData();
		cityName.applicationClose();
		
		
	}
	
	
}
