package com.OBS.genericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public String readDatafromExcelFile(String sheetName, int row, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	public int getDatafromExcelFile(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
	}

	public void writeDataIntoExcel(String sheetName, int row, int cell, String value) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).createRow(row).createCell(cell).setCellValue(value);

		FileOutputStream fos = new FileOutputStream(IpathConstants.ExcelPath);
		wb.write(fos);
		wb.close();
	}

	public HashMap<String, String> readMultipleData(String sheetName, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();

		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= rowCount; i++) {
			String key = sh.getRow(i).getCell(cell).getStringCellValue();
			String value = sh.getRow(i).getCell(cell + 1).getStringCellValue();

			map.put(key, value);
		}
		return map;
	}
	
	public Object[][] genericDataProvider(String SheetName) throws Throwable{
		FileInputStream fis  = new FileInputStream(IpathConstants.ExcelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(SheetName);
		int lRow = sh.getLastRowNum()+1;
		int lCell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lRow][lCell];
		
		for (int i = 0; i < lRow; i++) {
			for (int j = 0; j < lCell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}
