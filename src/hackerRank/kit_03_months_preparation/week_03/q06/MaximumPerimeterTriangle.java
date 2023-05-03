package hackerRank.kit_03_months_preparation.week_03.q06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
	
    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

    	Collections.sort(sticks);
    	List< List<Integer> > triangles = new ArrayList<>();
    	
    	//getting triangles
    	for (int i = 0; i < sticks.size() - 2; i++) {
    		
    		List<Integer> t = new ArrayList<>();
    		
    		int s1 = sticks.get(i);
    		int s2 = sticks.get(i+1);
    		int s3 = sticks.get(i+2);
    		
    		//triangle rule
    		if( (s3 > Math.abs( s2 - s1 )) && s3 < (s2 + s1) ) {
    			t.add( s1 );
    			t.add( s2 );
    			t.add( s3 );
    			triangles.add(t);
    		}  
    		
    		if( sticks.size() == 3 )
    			break;
		}
    	
    	int maxPerimeter = 0;
		int index = 0;
    	
    	if( triangles.size() == 0 ) {
    		
    		List<Integer> t = new ArrayList<>();
    		t.add(-1);
    		triangles.add(t);
    		
    	}else {
    		
    		
    		
    		for (int i = 0; i < triangles.size(); i++) {
    			
    			int sum = 0;
    			for (int j = 0; j < 3; j++) {
    				sum += triangles.get(i).get(j);				
    			}
    			
    			if( sum > maxPerimeter ) {
    				maxPerimeter = sum;
    				index = i;
    			}
    			else if( sum == maxPerimeter) {
    				
    				int maxSideCurrent  = Collections.max( triangles.get(i) );
    				int maxSidePrevious =  Collections.max( triangles.get(index) );
    				
    				if( maxSideCurrent > maxSidePrevious ) {        //1. Choose the one with the longest maximum side.
    					index = i;
    				}else if(  maxSideCurrent == maxSidePrevious ) { 
    					
    					int minSideCurrent  = Collections.min( triangles.get(i) );
    					int minSidePrevious =  Collections.min( triangles.get(index) );
    					
    					if( minSideCurrent > minSidePrevious ) {    //2. If more than one has that maximum, choose from them the one with the longest minimum side.
    						index = i;
    					}
    				}
    			} 			
    		}														
    	}
    	
    	
    	
    		
    	
    	System.out.println( triangles.get(index) );
    	return triangles.get(index);
    }

}
