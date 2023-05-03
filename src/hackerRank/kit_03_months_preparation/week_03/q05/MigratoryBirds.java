package hackerRank.kit_03_months_preparation.week_03.q05;

import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
	
    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int migratoryBirds(List<Integer> arr) {
    	
    	
    	HashMap<Integer, Integer> socks = new HashMap<>(); 
    			
    	for (int i = 0; i < arr.size(); i++) {
    		
    		int num = arr.get(i);
    		
    		if( socks.containsKey(num) )
    			socks.put(num, socks.get(num) + 1);
    		else
    			socks.put(num, 1);	
		}
    	
    	int sightedBird = 0;
    	int maxSighted = 0;

		for (Integer key : socks.keySet()) { 	
			
			int value = socks.get(key);
			
			if( value > maxSighted ) {
				maxSighted = value;
				sightedBird = key;
			}
			else if( value == maxSighted && key < sightedBird )	
				sightedBird = key;
			
		}
    	
		System.out.println(sightedBird);	
        return sightedBird;
    }

}
