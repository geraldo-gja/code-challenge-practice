package hackerRank.kit_03_months_preparation.week_03.q02;

import java.util.List;

public class SubarrayDivision2 {
	
    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */
    public static int birthday(List<Integer> s, int d, int m) {

        int sum = 0;
        int count = 0;
        
        for(int j = 0; j <= s.size() - m; j++){
            sum =0;
	        for(int i = j; i < j + m; i++){
	            sum += s.get(i);
	        }
	        if(sum == d){
	            count++;
	        }
        }   
        
        System.out.println(count);
        return count;
    }

}
