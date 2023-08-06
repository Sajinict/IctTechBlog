package org.ictkerala.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility2 {
	public static XSSFWorkbook excelWbook1;
	public static XSSFSheet excelSheet1;
	public static String getData1(int rowNum,int colNum) throws IOException  {
		
		FileInputStream inpp=new FileInputStream("C:\\Users\\sahal\\Desktop\\Proect Aug Maven\\IctTechBlog\\src\\main\\resources\\TestData2.xlsx");
		excelWbook1=new XSSFWorkbook(inpp);
		excelSheet1=excelWbook1.getSheetAt(0);
		return excelSheet1.getRow(rowNum).getCell(colNum).getStringCellValue();
	}
}
