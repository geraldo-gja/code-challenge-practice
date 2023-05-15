package aubay.demo;

import java.util.Arrays;

public class Demo {
	
	       
	public static boolean exists(int[] ints, int k) {
		
		boolean b = false;
		
		Arrays.sort( ints );
		int index = Arrays.binarySearch(ints, k);
		if( index > -1 )
			b = true;
		
		return b;
	}
  
}
