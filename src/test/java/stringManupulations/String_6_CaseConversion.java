package stringManupulations;

public class String_6_CaseConversion
{

	public static void main(String[] args)
	{
		// 1. lowsercase to uppercase
		String x = "petriotic";
		char arr[] = x.toCharArray();
		int size = arr.length;
		
		int i = 0;
		while(i != size)
		{
			arr[i] = (char) (arr[i] - 32);
			
			i++;
		}
		System.out.println(arr);
		
		// 2. upercase to lowsercase
		String y = "SARCASTIC";
		char arr1[] = y.toCharArray();
		int size1 = arr1.length;
		
		int i1 = 0;
		while(i1 != size1)
		{
		arr1[i1] = (char) (arr1[i1] + 32);
		i1++;
		}
		System.out.println(arr1);
		
		// 3. Convert First Character of Word To UpperCase
		String z = "this is a test string";
		char array[] = z.toCharArray();
		int siz = array.length;
		int i2 = 0;
		
		while(i2 != siz)
		{
			if(array[i2] != ' ')
			{
				array[i2] = (char) (array[i2]-32);
				i2++;
			}
		}
		System.out.println(array);
	}

}
