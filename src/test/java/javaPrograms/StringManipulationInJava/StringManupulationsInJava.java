package javaPrograms.StringManipulationInJava;

public class StringManupulationsInJava {

	public static void main(String[] args) 
	{
		String str = "The rains have started hare selenium";
		String str1 = "The rains have started hare selenium";
		
		System.out.println("The lenght of String is " + str.length());
		
		System.out.println("Charatacter at Specified index a "+ str.charAt(5));
		
		System.out.println("Index of alphabet s is " + str.indexOf('s'));
		
		System.out.println("Second Index ourrance of char s is " + str.indexOf('s', str.indexOf('s')+1));
		
		System.out.println("The third occurance os char s is " + str.indexOf('s',str.indexOf('s', str.indexOf('s')+1)+1));
		
		System.out.println("Index of \"have\" word " + str.indexOf("have"));
		
		System.out.println("The index of character \"z\" which is not available actually in string is " + str.indexOf("z"));
		
		System.out.println("The index of word \"Happy\" which is not available actually in string is " + str.indexOf("Happy"));
		
		// String Comparision (return : boolean) - remember it is case sensetive
		System.out.println(str.equals(str1));
		// String Comparision (return : boolean) - following method is not case-sensetive
		System.out.println(str.equalsIgnoreCase(str1));
		
		// substring (return the specified subString as mentioned in Index) - small string form bigger string 
		System.out.println(str.substring(0, 9));
		
		// Trim - removes Before Space and After Space but not between space
		String s = "   hello world   ";
		System.out.println("Before Trim string is " + s);
		System.out.println("After Trim string is " + s.trim());
		
		// replace - removes space or any character from string
		String s1 = "01/02/2017";
		System.out.println("String Before Replace method is " + s1);
		System.out.println("String After Replace method is " + s1.replace("/", ":"));
		
		// split (Return Array)- split a string on basis of char present in String
		String s2 = "Hello_World_Test_Selenium";
		String[] values = s2.split("_");
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
		}
		
		// concatinate - stickes or adds another string at the ending of given string
		String q = "Test";
		System.out.println(q.concat("One"));
		
		// String Concatination
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
	}

}
