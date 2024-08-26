package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author shrad
 * This class is a generic method used to read data from property file and 
 */
public class Filelibrary {

	/**
	 * This method is a generic method used to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException 
	    {
		FileInputStream fis = new FileInputStream("./TestData/commondata3.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;	
		}
	
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String readDataFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./TestData/Customer1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}	
}
