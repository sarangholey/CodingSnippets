package SeleniumSessions;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeReadViaZXing {

	public static void main(String[] args) throws IOException, NotFoundException {

		// Dependency Needed
//		<!-- https://mvnrepository.com/artifact/com.google.zxing/javase -->
//			<dependency>
//		<groupId>com.google.zxing</groupId>
//		<artifactId>javase</artifactId>
//		<version>3.3.3</version>
//		</dependency>
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vision\\drivers\\chromedriver.exe");
		// Setting up browser driver path
		
		WebDriver driver = new ChromeDriver();
		// Upcasting and creating the ChromeDriver class
		
		//driver.get("https://barcode.tec-it.com/en");
		driver.get("https://barcode.tec-it.com/en/Code128?data=Hi%20all%20Selenium%20Focks");
		//launching the URL
		
//		WebElement dataInputBox = driver.findElement(By.id("Data_Data"));
//		dataInputBox.clear();
//		dataInputBox.sendKeys("Text_To_Convert_Barcode");
//		WebElement clickToGenerateBarcode = driver.findElement(By.xpath("//label[@title='If selected, the generated barcodes are downloaded as zip archive']"));
//		clickToGenerateBarcode.click();
		
		
		String barcodeURL = driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println("Current Barcode URL is " + barcodeURL);

		URL url = new URL(barcodeURL);
		
		BufferedImage bufferedimage = ImageIO.read(url);
		
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		// Result Class is from ZXing API
		Result result = new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
	}

}
