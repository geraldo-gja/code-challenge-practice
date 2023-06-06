package capgemini;

public class Q01 {
	
	/*
	 * A method that would you shorten the following string:     "aaaa aannnqddtttwebbb" 
	 * and Returns a string. Remember that you need to be able to recreate the string as original.
	 * 
	 * 
	 * obs: Esse teste foi aplicado na data 06/06/23
	 */
	public static String question(String str) {
		
		char previous = 0;
		int countChar = 0;
		String newStr = "";
		
		//a3 a1n2qd1t2web2
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if( c != previous ) {
				previous = c;
				if(countChar > 0) {
					newStr += countChar;
					countChar = 0;
				}
				newStr += c;
			}else if( i == str.length() -1 ) {
				countChar++;
				newStr += countChar;
			} else {
				countChar++;
			}			
		}
		return newStr;
	}

}
