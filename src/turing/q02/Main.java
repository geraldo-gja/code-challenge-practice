package turing.q02;

import java.util.*;


/*
 * Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K. If no such i, j exist satisfying this
 * equation, return -1.
 * 
 * Example 1:
 *  Input: A = [34,23,1,24,75,33,54,8], K = 60
 *  Output: 58
 *  
 * Explanation:
 * We can use 34 and 24 to sum 58 which is less than 60 and there's no pair with sum of 59. Therefone, the maximum sum is 58
 * 
 * Example 2:
 *  Input: A = [10,20,30], K = 15
 *  Output: -1
 *  
 * Explanation: 
 * In this case it's not possible to get a pair sum less than 15.
 * 
 * Constraints:
 *  0. 1 <= A.length <= 100
 *  0. 1 <= A[i] < 1000
 *  0. 1 <= K <= 20005
 */

// 1, 8, 23, 24
// 34 23 1 24 75 33 54 8
// 10 20 30


/**
 * 
 * RESOLVI EM 30 MINUTOS, 18/05/22
 *
 */
class Solution {
	
	/**
	 * @param int[] A - List of integers
	 * @param int K - upper boud for sum of two numbers in A
	 * 
	 * @return int - Higest sum less than K
	 */
	public static int twoSumLessTank(int[] A, int K) {
		
		int result = -1;
		
		if ( constraints(A, K) == false )
			return result;
		
		int[] sumResult = new int[A.length * A.length];
		int count = 0;
		
		A = sortIntegerVector( 2, A);  //descending order
		
		for (int i = 0; i < A.length; i++) {
			
			if( A[i] < K ) {
				for (int j = i + 1; j < A.length; j++) {
					int sum = A[i] + A[j];
					
					if( sum < K ) {
						sumResult[count] = sum;
						count++;
					}	
				}			
			}
		}
		
		if( sumResult[0] > 0 ) {     
			sumResult = sortIntegerVector( 2, sumResult);  //descending order
			result = sumResult[0];			
		}
		
		return result;
	}
	
	/**
	 * Constraints:
	 * 1 <= A.length <= 100
	 * 1 <= A[i] < 1000
	 * 1 <= K <= 20005
	 *  
	 * @param int[] A - List of integers
	 * @param int K - upper boud for sum of two numbers in A
	 * 
	 * @return if satisfying TRUE, if not FALSE 
	 */
	private static boolean constraints(int[] A, int K) {
		
		boolean result = true;
		
		//1 <= A.length <= 100
		if( 1 > A.length ||  A.length > 100 )
			result = false;
		
		//1 <= A[i] < 1000
		for (int i = 0; i < A.length; i++) {		
			if( 1 > A[i] ||  A[i] > 1000 ) {
				result = false;
				break;
			}
		}
		//1 <= K <= 20005
		if( 1 > K ||  A.length > 20005 )
			result = false;	
		
		return result;	
	}
	
	
	/**
	 * Receives a integer vector unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param vector - disordered vector
	 * 
	 * @return vector - ordered vector.
	 */
	private static int[] sortIntegerVector( int orderType, int[] vector ) {
		
		Arrays.sort( vector );  //sort in ascending order
		
		if( orderType == 2 ) {	  //descending order
			int[] descendingVector = new int[ vector.length ];
			int counter = 0;
			for (int i = vector.length - 1; i >= 0; i--) {
				descendingVector[counter] = vector[i];
				counter++;
			}
			vector = descendingVector;
		}	
		return vector;
	}
	
}

public class Main
{
	
	@SuppressWarnings("resource")
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		String[] components = sc.nextLine().split(" ");
		
		int [] A = Arrays.stream(components).mapToInt(Integer::parseInt).toArray();
		int K = Integer.parseInt(sc.nextLine());
		
		System.out.print(Solution.twoSumLessTank(A, K));
	}
}














