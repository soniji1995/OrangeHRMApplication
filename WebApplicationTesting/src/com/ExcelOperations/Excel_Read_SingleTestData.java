package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	
	public static void main(String[] args) throws IOException {
		
		//identify the file(excel file) in the sysytem
		
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		
		//identify the workbook in the the file
		
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		
		// identify the sheet in the workbook 
		
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
		// identify the row of Sheet
		
		XSSFRow sheetOfRow = testDataSheet.getRow(0);
		
		//identify the Row of a cell in  a particular row 
		
		XSSFCell rowOfCell = sheetOfRow.getCell(0);
		
		//Getting the data from row of a cell
		
		String testData = rowOfCell.getStringCellValue();
		
		System.out.println(testData);
		
	}

}
