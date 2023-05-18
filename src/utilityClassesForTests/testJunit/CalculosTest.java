package utilityClassesForTests.testJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utilityClassesForTests.Calculos;

class CalculosTest {

	@Test
	void isEvenPairTest() {
		
		boolean b = Calculos.isEvenNumber(2);
		Assertions.assertTrue(b);
	}
	
	@Test
	void isOddNumberTest() {
		
		boolean b = Calculos.isOddNumber(1);
		Assertions.assertTrue(b);
	}
	
	@Test
	void isDivisibleByNumberTest() {
		
		boolean b = Calculos.isDivisibleByNumber(10,2);
		Assertions.assertTrue(b);
	}
	
	@Test
	void isPrimeNumberTest() {
		
		boolean b = Calculos.isPrimeNumber(1);
		Assertions.assertTrue(b);
	}
	
	@Test
	void absoluteValueTest() {
		
		int n = Calculos.absoluteValue(-1);
		Assertions.assertEquals(n,1);
	}
	
	@Test
	void convertLotToByteTest() {
		
		long n = Calculos.convertLotToByte(1);
		Assertions.assertEquals(n, 1);
	}

}
