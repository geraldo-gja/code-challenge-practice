package hackerRank.kit_03_months_preparation.week_02.q02;

import java.util.ArrayList;
import java.util.List;

public class GrasingStudents {
	
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
    	
    	List<Integer> roundGrades = new ArrayList<>();
    	int num;
    	int round = -1;
    	
    	for (int i = 0; i < grades.size(); i++) {
    		
    		num  = grades.get(i);
    		
    		if( num >= 38 ) {   			
    			round = num;
    			while( round % 5 != 0 ) 
    				round++;	
    		}
    		
    		if( round != -1 && round - num < 3)
    			roundGrades.add(round);
    		else
    			roundGrades.add(num);
		}
    	System.out.println(roundGrades);
    	return roundGrades;
    }

}
