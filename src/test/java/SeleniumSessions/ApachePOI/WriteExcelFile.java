package SeleniumSessions.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException 
	{
		File src = new File("../JanSeleniumTraining/src/main/java/SeleniumSessions/ApachePOI/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		sh.getRow(0).createCell(2).setCellValue("YES");
		sh.getRow(1).createCell(2).setCellValue("No");
		sh.getRow(2).createCell(2).setCellValue("14.22");
		FileOutputStream fout = new FileOutputStream("../JanSeleniumTraining/src/main/java/SeleniumSessions/ApachePOI/TestData.xlsx");
		
		wb.write(fout);
		
		wb.close();
		
	}

}
