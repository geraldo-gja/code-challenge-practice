package hackerRank.kit_03_months_preparation.week_02.q06;

public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    public static int countingValleys(int steps, String path) {
    	
    	int seaLevel = 0;
    	int countValley = 0;
    	
    	for (int i = 0; i < path.length(); i++) {
			Character c = path.charAt(i);
			
			if( c == 'D' ) {
				if( seaLevel == 0 )
					countValley++;
				
				seaLevel--;
			}else
				seaLevel++;
		}
    	
    	System.out.println(countValley);
    	return countValley;    	
    }
    
}
