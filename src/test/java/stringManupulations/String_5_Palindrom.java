package stringManupulations;

public class String_5_Palindrom
{

	public static void main(String[] args) 
	{
		String str = "lir il lir il ";
		str = str.toLowerCase().trim().replace(" ", "");
		
		char arr[] = str.toCharArray();
		int size = arr.length;
		char newArr[] = new char[size];
		
		int i = 0;
		 while(i != size)
		 {
			 newArr[size-i-1] = arr[i];
			 i++;
		 }
		
		 int a = 0;
		 while(a != size)
		 {
			 if(newArr[a] != arr[a])
			 {
				 System.out.println("Not a palindrome");
				 System.exit(0);
			 }
			 else
			 {
				 a++;
				 
			 }
		 }
		 System.out.println("Given String " + str+" is Palindrome");
	}

}
