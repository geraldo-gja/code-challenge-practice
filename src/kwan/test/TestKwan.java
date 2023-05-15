package kwan.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import kwan.Q20;
import kwan.Q21;
import kwan.Q22;



class TestKwan {

	
	@Test
	void findSumPairTest() {
		
		int[] ints = { 1, 5, 8, 1, 2 };
		
		int array[]  = Q20.findSumPair(ints, 13);

		Assertions.assertEquals(1, array[0]);
		Assertions.assertEquals(2, array[1]);
	}
	
	@Test
	void filterDuplicatesTest() {
		
		int[] ints = { 7, 6, 4, 3, 3, 4, 9 };
		
		int array[]  = Q21.filterDuplicates(ints);

		Assertions.assertEquals(5, array.length);
	}
	
	@Test
	void getTopStocksTest() {
		
		String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY", "ULTA"};
		
		float[][] prices = { {12.81f, 11.09f, 12.11f, 10.93f, 9.83f, 8.14f},
							 {13.81f, 10.09f, 11.11f, 12.93f, 12.83f, 7.14f},
							 {14.81f, 9.09f, 10.11f, 20.93f, 18.83f, 6.14f} };  

		String array[]  = Q22.getTopStocks(stocks, prices);
		for (String string : array) {
			System.out.println(string);
		}
		//Assertions.assertEquals(5, array.length);
	}

	
	
}
