package hackerRank.kit_03_months_preparation.week_01.q04;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */
    public static List<Integer> breakingRecords(List<Integer> scores) {
    
    	int countMin = 0;
    	int countMax = 0;
    	long minValue = scores.get(0);
    	long maxValue = scores.get(0);
    	
    	for (int i = 1; i < scores.size(); i++) {
			
    		if( scores.get(i) < minValue ) {
    			minValue = scores.get(i);
    			countMin++;
    		}else if( scores.get(i) > maxValue ) {
    			maxValue = scores.get(i);
    			countMax++;
    		}
		}
    	
    	List<Integer> listRecord = new ArrayList<Integer>();
    	listRecord.add(countMax);
    	listRecord.add(countMin);
    	
    	System.out.println( listRecord.get(0) + " " + listRecord.get(1) );
    	
    	return listRecord;
    }
}
