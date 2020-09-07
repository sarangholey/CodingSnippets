package stringManupulations;

public class String_4_ReverseAString
{

	public static void main(String[] args)
	{
		// 1.
		String s = "Interview";
		char arr[] = s.toCharArray();
		int size = arr.length;
		char newArr[] = new char[size];
		
		int i = 0;
		while(i != size)
		{
			newArr[size-1-i] = arr[i];
			i++;
		}
		System.out.print("Given String is "+s+" And reverse is ");
		System.out.println(newArr);
		
		// 2.
		StringBuffer s3 = reverseAString(s);
		System.out.println("Given String is "+s+" And reverse is "+s3);
	}
	
	/**
	 * @author Sarang
	 * @param String
	 * @return StringBuffer
	 */
	public static StringBuffer reverseAString(String String)
	{
		StringBuffer s1 = new StringBuffer(String);
		StringBuffer s2 = s1.reverse();
		return s2;
	}

}
