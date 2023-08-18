package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingDynamicWebTableData extends BaseTest {

	
	public void capturingDynamicWebTableData() {
		
// identifying the webTable on the webPage 
//      		
		
//      /html/body/div[5]/section[1]/div/section/div[1]/div/table - property of webTable
		
		By webTableElementProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table");
		
		WebElement webTableElement = driver.findElement(webTableElementProperty);
		
//		identify the elements in webTable by a similar property

//      in the web Table finding the elements of type row		
		
		By webTableRowElementProperty = By.tagName("tr");
		
		List <WebElement> webTableRows = webTableElement.findElements(webTableRowElementProperty);
		
//      getting the number of rows in the webTable
		
		int webTableRowCount = webTableRows.size();
		
		System.out.println(webTableRowCount);
		
//      now we will go to every row
		
		for(int webTableRowIndex=1;webTableRowIndex<webTableRowCount;webTableRowIndex++) {
			
//      going to a particular row and finding the cells
			
		By rowOfCellOfWebTableProperty = By.tagName("td");
		
		List <WebElement> webTableRowOfCells = webTableRows.get(webTableRowIndex).findElements(rowOfCellOfWebTableProperty);
		
//      finding the number of cells in the row
		
		int webTablerowOfCellCount = webTableRowOfCells.size();
		
		for(int webTableRowOfCellIndex=0;webTableRowOfCellIndex<webTablerowOfCellCount;webTableRowOfCellIndex++) {
			
//      get the data from the webTable from row of all cells
					
		String webTableData = webTableRowOfCells.get(webTableRowOfCellIndex).getText();
		
		System.out.print(webTableData+"  ");
			
		}
		
		System.out.println();
		
		}
		
	}
	public static void main(String[] args) {
		
		WebTable_CapturingDynamicWebTableData dynamicWebTable = new WebTable_CapturingDynamicWebTableData();
		
		dynamicWebTable.applicationLaunch();
		dynamicWebTable.capturingDynamicWebTableData();
		dynamicWebTable.applicationClose();		
	}
	
}