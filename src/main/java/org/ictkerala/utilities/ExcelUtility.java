package org.ictkerala.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtility{
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelSheet;
	 
	
	public static String getData(int rowNum,int colNum) throws IOException {
	
	FileInputStream inp=new FileInputStream("C:\\Users\\ksakh\\git\\IctTechBlog\\src\\main\\resources\\TestData.xlsx");
		excelWbook=new XSSFWorkbook(inp);
		excelSheet=excelWbook.getSheetAt(0);
		
		return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	} 
	
/*	public static double getData1(int rowNum,int colNum) throws IOException {
		
		FileInputStream inp=new FileInputStream("C:\\Users\\sahal\\Desktop\\Proect Aug Maven\\IctTechBlog\\src\\main\\resources\\TestData.xlsx");
		excelWbook=new XSSFWorkbook(inp);
		excelSheet=excelWbook.getSheetAt(0);
		
		return excelSheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	}*/
	
}