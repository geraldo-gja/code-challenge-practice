package hackerRank.kit_03_months_preparation.week_01.q08_mockTest.mockTest;

import java.util.Collections;
import java.util.List;

public class FindMedian {

	/*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int findMedian(List<Integer> arr) {
    // Write your code here
    	
    	int middle = arr.size() / 2;

    	Collections.sort( arr );
    	
    	System.out.println(middle);
    	System.out.println(arr.get(middle));
    	
    	return arr.get(middle);
    }
}
