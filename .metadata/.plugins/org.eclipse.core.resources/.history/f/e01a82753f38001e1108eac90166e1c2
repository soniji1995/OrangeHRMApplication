package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestJava {
	
	public static void main(String[] args) throws IOException {
		
		//identify the file(excel file) in the sysytem
		
				FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
				
				//identify the workbook in the the file
				
				XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
				
				// identify the sheet in the workbook 
				
				XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
				
			//	in the sheet identify number of active rows
				
				int rowCount = testDataSheet.getLastRowNum();
				System.out.println(rowCount);
				
			// to go to all active rows
				
				for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
				{
			
			// going to an active row 
					
				 XSSFRow row = testDataSheet.getRow(rowIndex);
					
			// in an active row finding the number of active cells
				 
				int rowOfCellCount = row.getLastCellNum();
				System.out.println(rowOfCellCount);
			
			// go to every active row of all active cells	
				 
				for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellCount;rowOfCellIndex++)
				{
					
			// going to an active row
					
				XSSFRow	newRow = testDataSheet.getRow(rowIndex);
					
			// in active row go to an active cell
				
				XSSFCell newRowOfNewCell = newRow.getCell(rowOfCellIndex);
				
			//get the data from the active row of it's respective active cell	
				
				String testData = newRowOfNewCell.getStringCellValue();
				
				System.out.print(testData+" | ");
				
				}
					
		        System.out.println();
				
				}
		
	}

}
