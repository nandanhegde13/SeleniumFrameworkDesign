package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtil {

	public void getLoginData() throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\NandanSH\\eclipse-workspace\\Framework.v1\\src\\test\\resources\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			XSSFSheet sheet = workbook.getSheetAt(i);
			if(sheet.getSheetName().equalsIgnoreCase("sheet1"))
			{
				
			}
			
		}
		
	}
}
