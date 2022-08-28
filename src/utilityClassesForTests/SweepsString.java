package utilityClassesForTests;

import java.util.ArrayList;
import java.util.List;

public class SweepsString {

	/**
	 * TODO - principais métodos
	 * 
	 * Character.toLowerCase(c)
	 * Character.toUpperCase(c)
	 * 
	 * Character.isUpperCase(c)
	 * Character.isLowerCase(c)
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SweepsString ss = new SweepsString();
		ss.test();	
	}
	
	private void test(){

		System.out.println( listWords( " ", "Ge.raldo Zu   Jozi.Jorge  Taw#an") );
		System.out.println( advancedListWords( " ", new String[]{ ",", ".", "#"}, "Ge.raldo Zu   Jozi.Jorge  Taw#an") );
		
		System.out.println( listWords( " ", "150,78   55.60  10") );
		System.out.println( advancedListWords( " ", new String[]{ ",", ".", "#"}, "150,78   55.60  10") );

		System.out.println( listWords( ".", "039.909.023-18") );
		System.out.println( advancedListWords( ".", new String[]{ ",", ".", "-"}, "039.909.023-18") );
	}
	
	/**
	 * Scans a String separating words from a defined breakpoint. 
	 * It also has an option to ignore characters.
	 * Returns a list of the obtained words.
     *
	 * @param breakpoint - from that point concatenates a new word
	 * @param ignoreList - list of characters to be ignored
	 * @param str - string that will be scanned in the loop
	 * 
	 * @return list - word list after concatenating/splitting from the original string
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List advancedListWords( String breakpoint, String[] ignoreList, String str ) {
		
		List list = new ArrayList();
		String word = "";
		
		for (int i = 0; i < str.length() ; i++) {
			
			char c = str.charAt(i);
			
			if( String.valueOf(c).equals(breakpoint) ) {     //start 1st word concatenation
				if( word.length() > 0 )
					list.add(word);
				word = "";
			}else {
				boolean concatenate = true;
				for (int j = 0; j < ignoreList.length ; j++) {		
					if( String.valueOf(c).equals( ignoreList[j] ) ) {
						concatenate = false;
						break;
					}
				}
				if( concatenate )
					word = word + c ;		
			}
		}	
		if( word.length() > 0 )
			list.add(word);
		
		return list;
	}
	
	/**
	 * Scans a String separating words from a defined breakpoint. 
	 * Returns a list of the obtained words.
     *
	 * @param breakpoint - from that point concatenates a new word
	 * @param str - string that will be scanned in the loop
	 * 
	 * @return list - word list after concatenating/splitting from the original string
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List listWords( String breakpoint, String str ) {
		
		List list = new ArrayList();
		String word = "";
		
		for (int i = 0; i < str.length() ; i++) {
			
			char c = str.charAt(i);
			
			if( String.valueOf(c).equals(breakpoint) ) {     //start 1st word concatenation
				if( word.length() > 0 )
					list.add(word);
				word = "";
			}else
				word = word + c ;		
		}	
		if( word.length() > 0 )
			list.add(word);
		
		return list;
	}
	
}
