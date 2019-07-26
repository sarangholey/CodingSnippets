package Testimonials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

import org.testng.Reporter;
 

public class DuplicateOccuranceCharacter
 {

	public static void main(String[] args)
	{
		findDuplicateWord("I am am learning java java");
		FindDuplicateCharacter("javaj2ee");
	}   
	
	// Java documentation
	
	/**<h1>hgfhfhjfjjfjfgh</h1>
	 * fhffhgfhgfjfj
	 *<p> hfjhtjhfjfjfgfg</p>
	 * @since 25-07-2019
	 * @author Sarang
	 * @param This method will take a string as an parameter
	 * @return this will return null and prints the duplicate occurrence words in a string
	 * @see package Testimonials;
	 */
	public static void findDuplicateWord(String str)
	{
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		Reporter.log("Hashmap created");
		String s[] = str.split(" ");
		Reporter.log("split method is implimented");
		for(String tempString : s)
		if(hm.get(tempString) != null)
		{
			hm.put(tempString, 1+1); 
		}
		else
		{
			hm.put(tempString, 1); 
		}
		System.out.println(hm);
		 Iterator<String> tempString = hm.keySet().iterator();
		 
		 while(tempString.hasNext())
		 {
			 String temp = tempString.next();
			 if(hm.get(temp) > 1)
			 {
				 System.out.println("The Word " +temp+ "appeared " +hm.get(temp) + " No of times");
			 }
		 }
	}
	
	public static void FindDuplicateCharacter(String str)
	{
		
	}
	

}
