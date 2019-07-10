package SeleniumSessions.ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport {

	
		 private static ExtentReports extent;

		    public static void main(String[] args) {
		        extent = new ExtentReports("./JanSeleniumTraining/src/main/java/SeleniumSessions/ExtentReport/Reoprt/htmlRepo.html", true);

		        // creates a toggle for the given test, adds all log events under it    
		        ExtentTest test = extent.startTest("My First Test", "Sample description");

		        // log(LogStatus, details)
		        test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");

		        // report with snapshot
		        String img = test.addScreenCapture("./JanSeleniumTraining/src/main/java/SeleniumSessions/ExtentReport/E66A5F05-AD2B-4D8C-8022-B0C48084FAFE.JPG");
		        test.log(LogStatus.INFO, "Image", "Image example: " + img);
		        
		        // end test
		        extent.endTest(test);
		        
		        // calling flush writes everything to the log file
		        extent.flush();
		    }
	}


