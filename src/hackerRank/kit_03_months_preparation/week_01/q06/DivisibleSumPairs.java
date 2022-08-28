package hackerRank.kit_03_months_preparation.week_01.q06;

import java.util.List;

public class DivisibleSumPairs {
	
	/*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

    	int countDivisible = 0;
    	
    	//Atention  j = i + 1
    	for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				
				int soma = ar.get(i) + ar.get(j);
				if( soma % k == 0 )
					countDivisible++;
			}
		}
    	
    	System.out.println("countDivisible: " + countDivisible );
    	
    	return countDivisible;
    }

}
