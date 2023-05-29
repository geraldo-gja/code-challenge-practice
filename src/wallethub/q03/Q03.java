package wallethub.q03;

import java.util.LinkedList;
import java.util.List;

public class Q03 {

	public static String stringScramble(String str1, String str2) {

		String strScramble = "true"; 
				
		if( str2.length() <= str1.length() ) {
			
			List<Character> listStr1 = new LinkedList<Character>();
			for (int i = 0; i < str1.length(); i++) {
				char c = str1.charAt(i);
				listStr1.add(c);
			}
			
			for (int i = 0; i < str2.length(); i++) {
				char c = str2.charAt(i);
			
				if( listStr1.contains(c) ) {
					for (int j = 0; j < listStr1.size(); j++) {
						
						if( listStr1.get(j) == c ) {
							listStr1.remove(j);
							break;	
						}
					}
				}else {
					return "false"; 
				}	
			}
		}
		return strScramble;
	}
	
}
