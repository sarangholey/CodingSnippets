package stringManupulations;

public class String_1_AccessCharacterInString {

	public static void main(String[] args) {
		
		String s = "Tyche Technologies";
		System.out.println(s.charAt(1));
		
		char ch = characterInString("Independence", 10);
		System.out.println(ch);

	}
	
	/**
	 * @author Sarang
	 * @param string
	 * @param number
	 * @return
	 */
	public static char characterInString(String string,int number)
	{
		return string.charAt(number);
	}

}
