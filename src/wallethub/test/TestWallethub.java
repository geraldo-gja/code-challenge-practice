package wallethub.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import wallethub.prova2.Exam;
import wallethub.prova1.q01.Q01;
import wallethub.prova1.q02.Q02;
import wallethub.prova1.q03.Q03;
import wallethub.prova1.q04.Q04;
import wallethub.prova1.q05.Q05;

class TestWallethub {

	@Test
	void SimpleModeTest() {
		
		Assertions.assertEquals(5, Exam.SimpleMode(new int[] {5,5,2,2,1}) );
		Assertions.assertEquals(-1, Exam.SimpleMode(new int[] {3,4,1,6,10}) );
		
		Assertions.assertEquals(1, Exam.SimpleMode(new int[] {3,1,5,5,2,2,1}) );
		Assertions.assertEquals(2, Exam.SimpleMode(new int[] {3,2,2,5,5,1}) );
	}
	
	
	@Test
	void q01LongestWordTest() {

		Assertions.assertEquals("time", Q01.LongestWord("fun&!! time") );
		Assertions.assertEquals("love", Q01.LongestWord("I love dogs") );
	}
	
	@Test
	void q02PalindromeTest() {

		Assertions.assertEquals("true", Q02.palindrome("never odd or even") );
		Assertions.assertEquals("true", Q02.palindrome("eye") );
		Assertions.assertEquals("false", Q02.palindrome("eu") );
	}
	
	@Test
	void q03StringScrambleTest() {

		Assertions.assertEquals("true", Q03.stringScramble("rkqodlw", "world") );
		Assertions.assertEquals("true", Q03.stringScramble("cdore", "coder") );
		Assertions.assertEquals("false", Q03.stringScramble("h3llko", "hello") );
	}
	
	@Test
	void q04CoinDeterminerTest() {

		Assertions.assertEquals(3, Q04.coinDeterminer(25) );
		Assertions.assertEquals(2, Q04.coinDeterminer(6) );
		Assertions.assertEquals(2, Q04.coinDeterminer(16) );
		Assertions.assertEquals(1, Q04.coinDeterminer(1) );
	}
	
	@Test
	void q05GasStationTest() {
		
		String[] s1 = new String[] {"4","3:1","2:2","1:2","0:1"};
		String[] s2 = new String[] {"4","1:1","2:2","1:2","0:1"};
		String[] s3 = new String[] {"4","0:1","2:2","1:2","3:1"};
		
		Assertions.assertEquals("1", Q05.gasStation(s1) );
		Assertions.assertEquals("impossible", Q05.gasStation(s2) );
		Assertions.assertEquals("4", Q05.gasStation(s3) );
	}


}
