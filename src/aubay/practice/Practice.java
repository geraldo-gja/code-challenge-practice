package aubay.practice;

import java.util.Arrays;

public class Practice {
	
	       
	public static boolean exists(int[] ints, int k) {
		
		boolean b = false;
		
		Arrays.sort( ints );
		int index = Arrays.binarySearch(ints, k);
		if( index > -1 )
			b = true;
		
		return b;
	}
  
}