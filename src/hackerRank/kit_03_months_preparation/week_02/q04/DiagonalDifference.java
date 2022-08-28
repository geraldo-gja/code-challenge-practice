package hackerRank.kit_03_months_preparation.week_02.q04;

import java.util.List;

public class DiagonalDifference {
	
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
    	
    	int rightToLeftSum = 0;
    	int lefttoRightSum = 0;
    	int difference = 0;
    	int j = arr.size() - 1;
    	
    	for (int i = 0; i < arr.size(); i++) {
    		
    		List<Integer> line = arr.get(i);
    		rightToLeftSum = rightToLeftSum + line.get(i);
    		
    		lefttoRightSum = lefttoRightSum + line.get(j);
			j--;
		}
    	
    	if( rightToLeftSum > lefttoRightSum )
    		difference = rightToLeftSum - lefttoRightSum;
    	else
    		difference = lefttoRightSum - rightToLeftSum;

    	//|x| is the absolute value of x
    	difference = Math.abs(difference);
    	
    	return difference;
    }

}
