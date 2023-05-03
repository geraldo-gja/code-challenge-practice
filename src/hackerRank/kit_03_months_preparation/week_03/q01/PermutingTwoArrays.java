package hackerRank.kit_03_months_preparation.week_03.q01;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        	
    	String response = "YES";
    	
    	System.out.println(A);
    	//Collections.sort(A);
    	Collections.sort(B);
    	Collections.reverse(A);
    	System.out.println(A);
    	
    	for (int i = 0; i < A.size(); i++) {
			
    		if( A.get(i) + B.get(i) < k ) {
    			response = "NO";
    			break;
    		}
		}
    	
    	System.out.println(response);
    	return response;
    }
}
