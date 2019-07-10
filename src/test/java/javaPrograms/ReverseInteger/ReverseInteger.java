package javaPrograms.ReverseInteger;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		long a = 1230;
		System.out.println(reverseIntegerByMathFormula(a));
		System.out.println(reverseIntegerByStringBuffer(a));

	}
	
	public static long reverseIntegerByMathFormula(long integerToBeReversed)
	{
		long integer = integerToBeReversed;
		long reverseInteger = 0;
		while(integer !=0)
		{
			reverseInteger = reverseInteger * 10 +  integer % 10;
			integer = integer/10;
		}
		return reverseInteger;
	}

	public static StringBuffer reverseIntegerByStringBuffer(long integerToBeReversed)
	{
		long integer = integerToBeReversed;
		StringBuffer reverseInteger = new StringBuffer(String.valueOf(integer)).reverse();
		return reverseInteger;
	}
}
