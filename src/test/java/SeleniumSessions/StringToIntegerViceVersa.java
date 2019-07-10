package SeleniumSessions;

public class StringToIntegerViceVersa {

	public static void main(String[] args) {
		
		String s1 = "10";
		String s2 = "20";
		
		String temp = s1+s2;
		System.out.println(temp);
		 
		//Converting Sting to Integer
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int temp2 = i1+i2;
		System.out.println(temp2);
		
		// Converting Integer to String
		String s3 = String.valueOf(temp2);
		System.out.println(s1+s3);
		
	}

}
