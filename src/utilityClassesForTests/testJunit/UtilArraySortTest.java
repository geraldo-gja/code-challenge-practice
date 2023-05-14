package utilityClassesForTests.testJunit;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilityClassesForTests.UtilArraySort;

class UtilArraySortTest {

	
	private static UtilArraySort as;
	private List<String> listString;
	private List<Integer> listInt;
	private String[] arrayString;
	private Integer[] arrayInteger;
	
	@Test
	void sortListAscendingOrderTest() {
				
		as.sortList( 1, listString );
		Assertions.assertEquals("Ana", listString.get(0));
		
		as.sortList( 1, listInt );
		Assertions.assertEquals(10, listInt.get(0));
		
		printList( "TEST sortList - Ascending Order" );
	}
	
	@Test
	void sortListDescendingOrderTest() {
				
		as.sortList( 2, listString  );
		Assertions.assertEquals("Zu", listString.get(0));
		
		as.sortList( 2, listInt );
		Assertions.assertEquals(150, listInt.get(0));
		
		printList( "TEST sortList - Descending Order" );
	}
	
	@Test
	void SortArrayAscendingOrderTest(){
		
		as.sortArray( 1, arrayString );
		Assertions.assertEquals("Ana", arrayString[0] );
		
		as.sortArray( 1, arrayInteger );
		Assertions.assertEquals(10, arrayInteger[0] );
		
		printArray( "TEST sortArray - Ascending Order" );
	}
	
	@Test
	void SortArrayDescendingOrderTest(){
		
		as.sortArray( 2, arrayString );
		Assertions.assertEquals("Zu", arrayString[0] );
		
		as.sortArray( 2, arrayInteger );
		Assertions.assertEquals(150, arrayInteger[0] );
		
		printArray( "TEST sortArray - Descending Order" );
	}
	
	@BeforeAll
	private static void init() {
		as = new UtilArraySort();
	}
	
	@BeforeEach
	private void createList() {
		
		listString = new ArrayList<String>();
		listString.add("Zu");
		listString.add("Bruna");
		listString.add("Geraldo");
		listString.add("Ana");
		
		listInt = new ArrayList<Integer>();
		listInt.add( 33 );
		listInt.add( 150 );
		listInt.add( 10 );
		listInt.add( 75 );
		
		arrayString = new String[]{ "Zu", "Bruna", "Geraldo", "Ana"};
		
		arrayInteger = new Integer[]{ 33, 150, 10, 75};
	}
		
	private void printList( String msg ) {
		System.out.println( msg );
		System.out.println( listString );
		System.out.println( listInt );
		System.out.println( "" );
	}
	
	private void printArray( String msg ){	
			
		System.out.println( msg );
		
		System.out.print( "[ " );
		Object[] array = arrayString;
		for (int i = 0; i < array.length; i++) {
			if( i == array.length - 1 )
				System.out.print( array[i] + " " );
			else
				System.out.print( array[i] + ", " );
		}
		System.out.print( "] " );
		System.out.println( "" );
		
		System.out.print( "[ " );
		array = arrayInteger;
		for (int i = 0; i < array.length; i++) {
			if( i == array.length - 1 )
				System.out.print( array[i] + " " );
			else
				System.out.print( array[i] + ", " );
		}
		System.out.print( "] " );
		System.out.println( "" );
		System.out.println( "" );
	}

}
