package hackerRank.kit_03_months_preparation.week_03.q08;

public class DrawingBook {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */
    public static int pageCount(int n, int p) {

    	int begin = p;
    	int end = n - p;
    	int turnCoun = 0;
    	
    	if( p == 1 || p == n )
    		return 0;
    	
    	if( begin <= end ) {  
    		turnCoun++; 		
    		for (int i = 2; i < n; i++) {
    			if( i == p ||  (i + 1 == p) ) {
    				break;
    			}
    			turnCoun++;
    			i++;
    		}
    	}
    	else {
    		int num = 0;
    		if( n % 2 != 0 ) 
    			num = n ;
    		else {
    			num = n - 1;
    			turnCoun = 1;
    		}
    		
    		for (int i = num ; i >= end; i--) {
    			if( i == p ||  (i - 1 == p) ) {	
    				break;
    			}
    			i--;
    			turnCoun++;
    		}
    	}
    		
    	System.out.println(turnCoun);
    	return turnCoun;
    }

}
