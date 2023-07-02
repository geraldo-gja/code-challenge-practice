package critical.techworks.q01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Q01Test {

	@Test
	void biggestIntegerTest() {
		
		int n1  = Q01.biggestInteger(1);
		int n2  = Q01.biggestInteger(-21);
		int n3  = Q01.biggestInteger(1234567);
		int n4  = Q01.biggestInteger(1234);
		int n5  = Q01.biggestInteger(-1);
		int n6  = Q01.biggestInteger(1234567899);
		int n7  = Q01.biggestInteger(-1234567899);

		Assertions.assertEquals(9, n1);
		Assertions.assertEquals(99, n2);
		Assertions.assertEquals(9999999, n3);
		Assertions.assertEquals(9999, n4);
		Assertions.assertEquals(9, n5);
		Assertions.assertEquals(2147483647, n6);
		Assertions.assertEquals(2147483647, n7);
	}
}
