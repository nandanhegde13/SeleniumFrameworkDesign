package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataUtil {

	@DataProvider(name="Test", parallel=true)
	public static Object[][] getLoginData() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("src/test/resources/TestData/TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows-1][cols];
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			 Cell cell = sheet.getRow(i).getCell(j);
			 data[i-1][j] = cell.toString();
			}
		}
		
		workbook.close();
		file.close();
		
		return data;
		
	}
}
