package utilityClassesForTests.eenum;

import org.junit.jupiter.api.Test;

class EnumTest {

	@Test
	void test() {
		

		
		System.out.println(EnumExemple1.PARAM1.equals(EnumExemple1.PARAM1));
		
	//	System.out.println(EnumExemple1.PARAM1 == EnumExemple1.PARAM1);
		
		System.out.println(EnumExemple1.PARAM1 == EnumExemple1.PARAM2);
		
		System.out.println(EnumExemple1.PARAM1.equals(EnumExemple1.PARAM2));
	}

}
