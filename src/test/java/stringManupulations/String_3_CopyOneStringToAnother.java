package stringManupulations;

public class String_3_CopyOneStringToAnother
{

	
	public static void main(String[] args)
	{
		String s = "Independence";
		char arr[] = s.toCharArray();
		char newArr[] = new char[arr.length];
		
		int i = 0;
		
		while(i != arr.length)
		{
			newArr[i] = arr[i];
			i++;
		}
		System.out.println(newArr);
	}

}
