package hackerRank.kit_03_months_preparation.week_02.q09_mockTest;

import java.util.*;


public class FlippingTheMatix {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */
    public static int flippingMatrix(List<List<Integer>> matrix) {
    	
    	
    	for (int i = 0; i < matrix.size(); i++) {
			
    		int sumCol1 = 0;
    		int sumCol2 = 0;
    		
    		for (int j = 0; j < 2; j++) {

				sumCol1 = sumCol1 + matrix.get(j).get(i);
				List<Integer> lastLine = matrix.get( matrix.size() - (j+1) ) ;
				sumCol2 = sumCol2 + lastLine.get(i);
				
    		}
    		if( sumCol2 > sumCol1 ) {  //invert  row
    			List<Integer> invertcolum = new ArrayList<Integer>();			
    			for (int k = matrix.size() - 1; k >= 0; k--) {
    				invertcolum.add( matrix.get(k).get(i) );
    			}
    			for (int k = 0; k < matrix.size(); k++) {
    				matrix.get(k).set(i, invertcolum.get(k));   //invert line
    			}
    		}	
		}
    	
    	for (int i = 0; i < 2; i++) {
    		
    		List<Integer> line = matrix.get(i);
    		int sum1 = 0;
    		int sum2 = 0;
    		
    		for (int j = 0; j < 2; j++) {
    			
    			sum1 = sum1 + line.get( j );
    			sum2 = sum2 + line.get( line.size() - (j+1) );
    		}
    		
    		if( sum2 > sum1 ) {  //invert  line
    			List<Integer> invertLine = new ArrayList<Integer>();			
    			for (int j = line.size() - 1; j >= 0; j--) {
    				invertLine.add(line.get(j));
    			}
    			matrix.set(i, invertLine);   //invert line
    		}
    	}

    	
    	int sumFlippingMatrix = 0;
    	for (int i = 0; i < 2; i++) {
    		for (int j = 0; j < 2; j++) {
    			sumFlippingMatrix = sumFlippingMatrix + matrix.get(i).get(j);
			}
		}
    	
    	System.out.println(sumFlippingMatrix);
        return sumFlippingMatrix;
    }
    
}
