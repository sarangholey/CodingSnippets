package SeleniumSessions.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileReusable 
{
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ReadExcelFileReusable(String excelFilePath) 
	{
		File src = new File(excelFilePath);
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getData(int sheetNumber, int row, int column)
	{
		sh = wb.getSheetAt(sheetNumber);
		String data = sh.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
}
