package javaPrograms.MissingNoInArray;

public class MissingNoInArray {

	public static void main(String[] args) 
	{
		int a[] = {1,2,4,5};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		int sum1 = 0;
		for(int j=1;j<=5;j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println("Missing No in Given Array is " +(sum1-sum));
	}
	
//	public static void missingNoInArray(int firstElementInArray, int lastElementInArray)
//	{
//		int a[] = {1,2,4,5};
//		int sum = 0;
//		for(int i=0;i<a.length;i++)
//		{
//			sum = sum + a[i];
//		}
//		int sum1 = 0;
//		for(int j=1;j<=5;j++)
//		{
//			sum1 = sum1 + j;
//		}
//		System.out.println("Missing No in Given Array is " +(sum1-sum));
//	}
}
