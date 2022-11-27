package SeleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch 
{

	public static String data (String SheetName, int Row, int Cell ) throws EncryptedDocumentException,IOException{
	
	
	FileInputStream file = new FileInputStream ("C:\\Selenium Drivers\\Login Credentials.xlsx");
			
	String Value = WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();

	return Value;
	}

}