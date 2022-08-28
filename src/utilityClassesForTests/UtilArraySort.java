package utilityClassesForTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilArraySort {

	/**
	 * TODO - principais métodos
	 * 
	 * Collections.sort( list ); //ascending order. Exemple List<Integer> list
	 * 
	 * Arrays.sort( vector );    //ascending order. Exemple int[] vector
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UtilArraySort u = new UtilArraySort();
		u.test();
	}
	
	private void test(){
		
		testSortArray(); 
		testSortVector();
	}
	
	private void testSortArray() {
		
		System.out.println( "TEST - sortArray" );
		
		List<String> listString = new ArrayList<String>();
		listString.add("Zu");
		listString.add("Bruna");
		listString.add("Geraldo");
		listString.add("Ana");
		
		System.out.println( sortArray( 1, listString ) );
		System.out.println( sortArray( 2, listString ) );
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add( 33 );
		listInt.add( 150 );
		listInt.add( 10 );
		listInt.add( 75 );
		
		System.out.println( sortArray( 1, listInt ) );
		System.out.println( sortArray( 2, listInt ) );
		System.out.println( "" );
	}
	
	private void testSortVector(){
		
		System.out.println( "TEST - sortArray" );
		
		String[] v2 = new String[]{ "Zu", "Bruna", "Geraldo", "Ana"};
		printStringVector( sortStringVector( 1, v2 ) );
		System.out.println( " " );
		printStringVector( sortStringVector( 2, v2 ) );
		
		System.out.println( " " );
		int[] v1 = new int[]{ 33, 150, 10, 75};
		printIntegerVector( sortIntegerVector( 1, v1 ) );
		System.out.println( " " );
		printIntegerVector( sortIntegerVector( 2, v1 ) );
	}
	
	private void printStringVector( String[] vector){	
		
		System.out.print( "[ " );
		for (int i = 0; i < vector.length; i++) {
			if( i == vector.length - 1 )
				System.out.print( vector[i] + " " );
			else
				System.out.print( vector[i] + ", " );
		}
		System.out.print( "] " );
	}
	
	private void printIntegerVector( int[] vector){	
		
		System.out.print( "[ " );
		for (int i = 0; i < vector.length; i++) {
			if( i == vector.length - 1 )
				System.out.print( vector[i] + " " );
			else
				System.out.print( vector[i] + ", " );
		}
		System.out.print( "] " );
	}
	
	/**
	 * Receives a generic list (integer, String, etc) unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param list - disordered list
	 * 
	 * @return list - ordered list.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private List sortArray( int orderType, List list ) {
		
		Collections.sort( list ); //ascending order 
		
		if( orderType == 2 ) {	  //descending order
			List descendingList = new ArrayList();
			for (int i = list.size() - 1; i >= 0; i--) {
				descendingList.add( list.get(i) );
			}
			list = descendingList;
		}		
		return list;
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
	private int[] sortIntegerVector( int orderType, int[] vector ) {
		
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
	
	/**
	 * Receives a String vector unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param vector - disordered vector
	 * 
	 * @return vector - ordered vector.
	 */
	private String[] sortStringVector( int orderType, String[] vector ) {
		
		Arrays.sort( vector );  //sort in ascending order
		
		if( orderType == 2 ) {	  //descending order
			String[] descendingVector = new String[ vector.length ];
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
