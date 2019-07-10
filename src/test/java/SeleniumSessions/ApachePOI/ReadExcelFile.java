package SeleniumSessions.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile 
{
	
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet1;
	
	public static void main(String[] args) throws IOException 
	{
		File excelFile = new File("../JanSeleniumTraining/src/main/java/SeleniumSessions/ApachePOI/TestData.xlsx");
		try 
		{
			fis = new FileInputStream(excelFile);
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) 
		{
			System.out.println("Excel file loding problem");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
//		String data0 =  wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
//		String data1 =  wb.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data0);
//		System.out.println(data1);
		
		// Print total no of rows
		System.out.println("All the Rows available in Excel sheet are " + (sheet1.getLastRowNum()+1));
		for(int i=0;i<(sheet1.getLastRowNum()+1);i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			String data2 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data + "\t" + data2);
			
		}
		
		wb.close();
		// Read data of excel via resuable method
		ReadExcelFileReusable excel = new ReadExcelFileReusable("../JanSeleniumTraining/src/main/java/SeleniumSessions/ApachePOI/TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
	}

}
