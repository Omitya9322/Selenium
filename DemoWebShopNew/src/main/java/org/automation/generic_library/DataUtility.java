package org.automation.generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility implements FrameworkConstant{

	
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(properties_path);
		Properties prop=new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
		
	}
	
	public String getDataFromExcelFile(String sheetName, int rowName, int cellName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook book=WorkbookFactory.create(fis);
		 String value = book.getSheet(sheetName).getRow(rowName).getCell(cellName).toString();
		 return value;
	}
	
	public static Object[][] getMultipleDataFromExcelFile(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		int lastRowName = sh.getPhysicalNumberOfRows();
		int lastCellName = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr =new Object[lastRowName -1][lastCellName];
		
		for(int i=1;i<lastRowName;i++)
		{
			for(int j=0;j<lastCellName;j++)
			{
				arr[i-1][j]=sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}
}
