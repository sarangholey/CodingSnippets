package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EscapeCharacterInJava {

	public static void main(String[] args) {
		
		// - \n
		System.out.println("smart work");
		System.out.println("smart\nwork");
		
		System.out.println("************************************");
		// - \r
		System.out.println("good boy");
		System.out.println("smart\rwork");
		
		System.out.println("************************************");
		// - \t
		System.out.println("pretty cat");
		System.out.println("pretty\tcat");
		System.out.println("\tpretty cat");
		
		System.out.println("************************************");
		// - \" \"
		//System.out.println(""pretty cat""); - it wont print "pretty cat"
		System.out.println("\"pretty cat\"");
		System.out.println("\\n");
		
		System.out.println("************************************");
		// - print on console "\n" or "\t" or "\r"
		// System.out.println("\n"); - it wont print "\n on console"
		System.out.println("\\n");
		System.out.println("\\t");
		System.out.println("\\r");
		
		System.out.println("************************************");
		// - \b
		
		System.out.println("motor bike");
		System.out.println("motor\bbike"); // it will print - motorbike
		
		System.out.println("************************************");
		// - \r
		
		System.out.println("water bottle");
		System.out.println("water\rbottle"); 
		
		System.out.println("************************************");
		// - \' \'
		System.out.println("\'pretty cat\'"); 
		System.out.println("'pretty cat'");
		
		System.out.println("************************************");
		// - \\
		System.out.println("\\"); // it will wont print \\ on console it will print - \
		
		
	}

}
