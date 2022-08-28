package hackerRank.kit_03_months_preparation.week_01.q07;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
	
	/*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

    	List<Integer> matchList = new ArrayList<Integer>();
    	
    	for (int i = 0; i < queries.size(); i++) {
    		
    		int countMatch = 0;
    		
			for (int j = 0; j < strings.size(); j++) {
				if( queries.get(i).equals( strings.get(j) ) )
					countMatch++;
			}
			matchList.add(countMatch);
		}
    	System.out.println(matchList);
    	
    	return matchList;
    }

}
