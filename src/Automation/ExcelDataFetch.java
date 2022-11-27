package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetch {

	
	public static String getData (String SheetName, int Row, int Cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("C:\\Selenium Drivers\\Test Cases.xlsx");
		String value= WorkbookFactory.create(file).getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();
		return value;
		


	}

}
