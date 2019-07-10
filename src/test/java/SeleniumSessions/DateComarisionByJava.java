package SeleniumSessions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComarisionByJava {

	public static void main(String[] args) throws ParseException {
		
		String requiredDate = "07/05/2019";
		String startDate = "01/01/2019";
		String endDate = "12/01/2019";
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		
		Date sDate = sdf.parse(startDate);
		Date eDate = sdf.parse(endDate);
		Date date = sdf.parse(requiredDate);
		
		if(date.compareTo(sDate)>=0 && date.compareTo(eDate)<=0)
		{
			System.out.println("Required Date is within the limit");
		}
		else 
		{
			System.out.println("Required Date is out of range");
		}
	}

}
