package SeleniumSessions;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 /**
  * 
  * @author Sarang
  * Created on 16/04/2019
  *
  */

public class PdfReaderTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// This "pdfbox" depenency will only fetch data from PDF which is
		//  only available in Text not the image PDF and URL having ".pdf" should be available.
		// Readme - First add following dependency into Pom.xml
		
		//<dependency>
		//<groupId>org.apache.pdfbox</groupId>
		//<artifactId>pdfbox</artifactId>
		//<version>2.0.12</version>
		//</dependency>
		
		// WebDriver Configuration
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rusenergyweek.com/upload/iblock/1b9/1b9cb0045fcda0e07be921ec922f5191.pdf");
		String urlText = driver.getCurrentUrl();
		URL url = new URL(urlText);

		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		if(pdfContent.contains("Adobe Acrobat XI Quick start guide"))
		{
			System.out.println("-----------*****-------------");
			System.out.println("PDF is Successfully Validated");
			System.out.println("-----------*****-------------");
		}
		else
		{
			System.out.println("PDF has some Error");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
