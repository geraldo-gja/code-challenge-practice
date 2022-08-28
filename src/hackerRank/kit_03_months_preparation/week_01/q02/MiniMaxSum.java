package hackerRank.kit_03_months_preparation.week_01.q02;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	
	/*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     *      
     */
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

    	Collections.sort( arr );
    	long maxSum = 0;
    	long mimSum = 0;
    	
    	for (int i = 0; i < arr.size(); i++) {
			
    		if( i < (arr.size() - 1) )
    			mimSum = mimSum + arr.get(i);
    				
    		if( i > 0)
    			maxSum = maxSum + arr.get(i);
		}
    	
    	System.out.println( mimSum + " " + maxSum );
    }

}
