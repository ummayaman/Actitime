package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
FileInputStream fis = new FileInputStream("./data/TestScript.Xlsx");
Workbook wb = WorkbookFactory.create(fis);
 String data = wb.getSheet("create Customer").getRow(1).getCell(2).getStringCellValue();
 System.out.println(data);

	}

}
