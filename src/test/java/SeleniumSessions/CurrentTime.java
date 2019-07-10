package SeleniumSessions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args)
	{
		
		Calendar cal = Calendar. getInstance();
		Date date=cal. getTime();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String formattedDate=dateFormat. format(date);
		System.out.println(formattedDate +" " + System.currentTimeMillis());

		System.out.println("********************************");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		System.out.println("********************************");

		System.out.println(java.time.LocalDateTime.now()); 

		System.out.println("********************************");

		System.out.println(java.time.Clock.systemUTC().instant()); 
		
		System.out.println("********************************");
		
		java.util.Date date1=new java.util.Date();  
		System.out.println(date1);
		
		System.out.println("********************************");
		
		long millis=System.currentTimeMillis();  
		java.util.Date date2=new java.util.Date(millis);  
		System.out.println(date2);  
		
		System.out.println("********************************");
		
		Date date3=java.util.Calendar.getInstance().getTime();  
		System.out.println(date3); 
		
		

	}

}
