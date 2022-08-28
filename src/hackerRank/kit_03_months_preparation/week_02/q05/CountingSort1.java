package hackerRank.kit_03_months_preparation.week_02.q05;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> countingSort(List<Integer> arr) {

    	//ATENTION - array length 100
    	int[] array = new int[ 100 ];
    	List<Integer> countList = new ArrayList<>();

    	for (int i = 0; i <  arr.size(); i++) 
    		array[ arr.get(i) ] = array[ arr.get(i) ] + 1;

    	for (int i = 0; i < array.length; i++) 
    		countList.add( (int) array[i] );		
    	
        return countList;
    }

}
