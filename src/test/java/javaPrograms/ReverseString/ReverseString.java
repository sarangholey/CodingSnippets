package javaPrograms.ReverseString;

/**
 * 
 * @author Sarang
 * date - 25/04/2019
 *
 */

public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println(reverseStringByForLoop("sarang"));
		System.out.println(reverseStringByStringBuffer("abc"));
	}

	public static String reverseStringByForLoop(String stringValue)
	{
		String stringValuetoBeReversed = stringValue;
		int lengthString = stringValuetoBeReversed.length();
		String reverse = "";
		for(int i=lengthString-1;i>=0;i--)
		{
			reverse = reverse + stringValuetoBeReversed.charAt(i);
		}
		return reverse;
	}

	public static StringBuffer reverseStringByStringBuffer(String stringValue)
	{
		StringBuffer stringValuetoBeReversed = new StringBuffer(stringValue);
		StringBuffer reverse = stringValuetoBeReversed.reverse();
		return reverse;
	}
}
