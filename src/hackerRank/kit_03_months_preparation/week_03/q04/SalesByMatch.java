package hackerRank.kit_03_months_preparation.week_03.q04;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */
    public static int sockMerchant(int n, List<Integer> ar) {
    	
    	int countPairs = 0;
    	HashMap<Integer, Integer> socks = new HashMap<>(); 
    			
    	for (int i = 0; i < ar.size(); i++) {
    		
    		int num = ar.get(i);
    		
    		if( socks.containsKey(num) )
    			socks.put(num, socks.get(num) + 1);
    		else
    			socks.put(num, 1);	
		}
    	
		for (Integer key : socks.keySet()) { 		
			int r = 0;
			if( socks.get(key) >= 2 )
				r = socks.get(key) / 2;
			
			countPairs = countPairs + r;
		}
    	
		System.out.println(countPairs);	
        return countPairs;
    }
    
}
