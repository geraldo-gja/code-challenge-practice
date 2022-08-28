package hackerRank.kit_03_months_preparation.week_01.q05;

public class CamelCase4 {
	 
	public static void camelCase( String s ) {
		
		char Op1 = s.charAt(0);
		char Op2 = s.charAt(2);
		String str = s.substring(4, s.length() );
		String finalString = "";
		
		for (int i = 0; i < str.length(); i++) {   //Iteration 
			
			char c = str.charAt(i);
			
			if( Op1 == 'S' ) { //Separate
				
				if( Op2 == 'M' && c == '(' )    //Method
					break;
				
				if( Op2 == 'C' && i == 0 )   //Class
					c = Character.toLowerCase(c);
				
				if( Character.isUpperCase(c) ) 
					finalString = finalString + " " + Character.toLowerCase(c);
				else 
					finalString = finalString + c;
				
			}
			else if( Op1 == 'C' ) { //Combine
				
				if( c == ' ' ) {
					i++;
					c = str.charAt(i);
					c = Character.toUpperCase(c);
				}
				
				if( Op2 == 'M' )    //Method
					if( i == str.length() - 1 ) {
						finalString = finalString + c + "()";
						break;
					}
				
				if( Op2 == 'C' && i == 0 )   //Class
					c = Character.toUpperCase(c);
				
				finalString = finalString + c;
			}
		}
		
		System.out.println( finalString );
//		System.out.println(Op1 + " " + Op2 + " " + str + "  ----->  " + finalString);
//		System.out.println( );
	}

}
