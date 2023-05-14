package aubay.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aubay.Q01;
import aubay.practice.Practice;

class TestAubay {


	@Test
	void closestToZeroTest() {
		
		int[] ints = { -9, 14, 37, 102};
		
		int num  = Q01.closestToZero(ints);

		Assertions.assertEquals(-9, num);
	}

	@Test
	void infNetworkEndpointTest() {
		
		int startNodeId = 2;
		int[] fromIds = { 1, 7, 3, 4, 2, 6, 9 };
		int[] toIds =   { 3, 3, 4, 6, 6, 9, 5 };
		
		int num  = Q01.infNetworkEndpoint(startNodeId, fromIds, toIds);
		
		Assertions.assertEquals(5, num);
	}
	
	@Test
	void practiceExistsTest() {
		
		int[] ints = { -9, 14, 3, 102};
		int k1 = 102;
		int k2 = 36;
		boolean test1 = Practice.exists(ints, k1);
		boolean test2 = Practice.exists(ints, k2);
		
		Assertions.assertTrue(test1);
		Assertions.assertFalse(test2);
	}
	
}
