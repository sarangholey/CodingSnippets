package stringManupulations;

public class String_2_ComputeLengthOfString {

	public static void main(String[] args) 
	{
	
	// computing the length of the string without .length() method
	// of a string
	
	// 1.
	String s = "Hello";
	String s1 = s.concat("\0");
	
	char arr[] = s1.toCharArray();
	int count = 0;
	int i = 0;
	
	while(arr[i] != '\0')
	{
		count ++;
		i++;
	}
	System.out.println("The Length of the String is "+ count);
	
	// 2.
	int length = computeLengthOfString(s);
	System.out.println("The Length of a string is "+ length);
	
	//3.
	System.out.println("The length of the String is "+ s.length());
	}
	
	
	/**
	 * @author Sarang
	 * @param s
	 * @return
	 */
	public static int computeLengthOfString(String s)
	{
		String s0 = s;
		String s1 = s0.concat("\0");
		char arr[] = s1.toCharArray();	
		int count = 0;
		int i = 0;
		
		while(arr[i] != '\0')
		{
			count ++;
			i ++;
		}
		return count;
	}

}
