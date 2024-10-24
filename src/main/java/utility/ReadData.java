package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.io.FileHandler;

public class ReadData {
	
	public static String readpropertyfile(String value) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\oskar\\eclipse-workspace\\July4th_framework\\src\\main\\java\\config\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
		 
	}
	public static String readExcel(int rownum,int colnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\oskar\\eclipse-workspace\\July4th_framework\\TestData\\Book1.xlsx");
		Sheet es = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = es.getRow(rownum).getCell(colnum).getStringCellValue();
		return value;
	
	
	}
	
	
	

}
