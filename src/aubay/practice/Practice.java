package aubay.practice;

import java.util.Arrays;

public class Practice {
	
	       
	public static boolean exists(int[] ints, int k) {
		
		boolean b = false;
		
		/*
		 * 1º tentativa, ver resultado em resultato pratica
		 * 
		for (int i = 0; i < ints.length; i++) {
			if( ints[i] == k ) {
				b = true;
				break;				
			}
		}
		*/
		
		int index = Arrays.binarySearch(ints, k);
		if( index > 0 )
			b = true;
		
		return b;
	}
  
}
