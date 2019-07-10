package javaPrograms.SmallestNLargetNoIntegerArray;

import java.util.Arrays;

public class SmalleastAndLargetNumber
{

	public static void main(String[] args)
	{
		int numbers[] = {-10,24,-50,-88,987656,987657,0};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
		}
		
		System.out.println("The given array" + Arrays.toString(numbers));
		System.out.println("The Largest No is " + largest);
		System.out.println("The Smallest No is " + smallest);
	}

}
