package javaPrograms.RemoveSpecialCharacterInString;

/**
 * 
 * @author Sarang
 * date - 25/04/2019
 *
 */

public class RemoveSpacialCharacterInString {

	public static void main(String[] args) 
	{
		String s = "@#$% text *&^%";
		String s1 = " ఈ భాషల్లో అందుబాటులో ఉంది Google";
		System.out.println(removeCharactersFromString(s));
		System.out.println(removeCharactersFromString(s1));
	}
	
	public static String removeCharactersFromString(String stringValue)
	{
		// Regular Expression - [^a-zA-Z0-9]
		String removedCharacterString = stringValue.replaceAll("[^a-zA-Z0-9]","");;
		return removedCharacterString;
	}

}
