package wallethub.q02;

public class Q02 {
	
	public static String palindrome(String str) {

		String backwards = "";
		String palindrome = "false";
		str = str.replaceAll(" ", "");
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			backwards += c;
		}
		if( backwards.equals(str) )
			palindrome = "true";
		
		return palindrome;
	}

}
