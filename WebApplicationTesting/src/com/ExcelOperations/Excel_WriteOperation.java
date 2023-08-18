package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		
		//identify the file(excel file) in the sysytem
		
				FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
				
				//identify the workbook in the the file
				
				XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
				
				// identify the sheet in the workbook 
				
				XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
				
				//create a row in the sheet
				
			  	XSSFRow sheetOfNewRow = testDataSheet.createRow(4);
			  	
			  	//create a row of cell
			  	
			 XSSFCell newRowOfNewCell = sheetOfNewRow.createCell(3);
			 
			 //set new value into the new row of a cell created
			 
			 newRowOfNewCell.setCellValue("WebDriver");
			 
			 // save the file and work book along with test data
			 
			 FileOutputStream outputFile = new FileOutputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
				
				workBook.write(outputFile);
	}
	
}
