package capgemini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Q01Test {

	@Test
	void test() {
		String s = Q01.question("aaaa aannnqddtttwebbb");
		
		System.out.println(s);
		Assertions.assertEquals("a3 a1n2qd1t2web2", s);
	}

}
