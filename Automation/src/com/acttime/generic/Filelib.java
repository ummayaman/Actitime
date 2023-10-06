package com.acttime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib 
{
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Commondata.Property");
		Properties p=new Properties();
		p.load(fis);
		String Data = p.getProperty(key);
		return Data;
	}
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	
	{
	FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
	
	}

}
