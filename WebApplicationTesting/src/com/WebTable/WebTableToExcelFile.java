package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableToExcelFile extends BaseTest {
	
	public void webTableToExcelFile() throws IOException {
		
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExcelFiles/EmptyTestData.xlsx");
		
		//identify the workbook in the the file
		
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// identify the sheet in the workbook 
		
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		//creating table heading
		
		testDataSheet.createRow(0).createCell(0).setCellValue("Current Local Times  Around the World");
		
		//<h3 class="tb-header">Current Local Times  Around the World </h3>
		
		// identifying the webTable on the webPage 
//		

///html/body/div[5]/section[1]/div/section/div[1]/div/table - property of webTable

By webTableElementProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table");

WebElement webTableElement = driver.findElement(webTableElementProperty);

//identify the elements in webTable by a similar property

//in the web Table finding the elements of type row		

By webTableRowElementProperty = By.tagName("tr");

List <WebElement> webTableRows = webTableElement.findElements(webTableRowElementProperty);

//getting the number of rows in the webTable

int webTableRowCount = webTableRows.size();

System.out.println(webTableRowCount);

//now we will go to every row

for(int webTableRowIndex=1;webTableRowIndex<webTableRowCount;webTableRowIndex++) {
	
	XSSFRow newRow = testDataSheet.createRow(webTableRowIndex);
	
//going to a particular row and finding the cells
	
By rowOfCellOfWebTableProperty = By.tagName("td");

List <WebElement> webTableRowOfCells = webTableRows.get(webTableRowIndex).findElements(rowOfCellOfWebTableProperty);

//finding the number of cells in the row

int webTablerowOfCellCount = webTableRowOfCells.size();



for(int webTableRowOfCellIndex=0;webTableRowOfCellIndex<webTablerowOfCellCount;webTableRowOfCellIndex++) {
	
	XSSFCell newRowOfNewCell = newRow.createCell(webTableRowOfCellIndex);
//get the data from the webTable from row of all cells
			
String webTableData = webTableRowOfCells.get(webTableRowOfCellIndex).getText();

      newRowOfNewCell.setCellValue(webTableData);
      
      FileOutputStream webTableDetails = new FileOutputStream("./src/com/ExcelFiles/WebTableTestData.xlsx");
		
		workBook.write(webTableDetails);

System.out.print(webTableData+"  ");
	
}

System.out.println();

}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		WebTableToExcelFile readWebTable = new WebTableToExcelFile();
		
		readWebTable.applicationLaunch();
		readWebTable.webTableToExcelFile();
		readWebTable.applicationClose();	
	}
	
}
