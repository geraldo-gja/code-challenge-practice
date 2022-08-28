package hackerRank.kit_03_months_preparation.week_02.q01;

import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
	
    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static int lonelyinteger(List<Integer> a) {
    	
    	return solucao2For(a);
//    	return solucaoHashMap(a);
    }
    
    public static int solucao2For( List<Integer> a ) {
    	
    	int lonely = -1;
    	
    	for (int i = 0; i < a.size(); i++) {	
    		int count = 0;
    		lonely = a.get(i);
    		
    		for (int j = 0; j <  a.size(); j++) 
				if( lonely == a.get(j) )
					count++;
			
    		if( count == 1 )
    			break;
		}
    	
    	System.out.println(lonely);
    	return lonely;
    }
    
    public static int solucaoHashMap( List<Integer> a ) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>(); 
    	int lonely = -1;
    	
    	for (int i = 0; i < a.size(); i++) {
    		int num = a.get(i);
    		if( map.containsKey( num ) )
    			map.replace( num, map.get( num ) + 1 );
    		else
    			map.put( num, 1);
		}	
    	for (Integer key : map.keySet() ) { 
			if( map.get(key) == 1 ) 
				lonely = key;	
		}  	
    	System.out.println(lonely);
    	return lonely;
    }

}

