package hackerRank.kit_03_months_preparation.week_03.q03;

public class XORStrings3 {

	public static String findXOR( String s, String t ) {
		
		String xor = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			Character c1 = s.charAt(i);
			Character c2 = t.charAt(i);
			
			if( c1 == '1' && c2 == '1' )
				xor = xor + "0";
			else if( c1 == '0' && c2 == '0' )
				xor = xor + "0";
			else if( (c1 == '1' && c2 == '0' ) || (c1 == '0' && c2 == '1') )
				xor = xor + "1";
		}
		
		System.out.println(xor);
		return xor;		
	}
}
