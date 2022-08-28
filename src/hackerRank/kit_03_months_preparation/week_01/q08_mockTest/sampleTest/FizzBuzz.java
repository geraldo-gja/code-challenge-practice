package hackerRank.kit_03_months_preparation.week_01.q08_mockTest.sampleTest;

public class FizzBuzz {
	
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void fizzBuzz(int n) {
    	
    	//0 < n < 2 x 10'5
    	if( n > (2 * (10 * 10 * 10 * 10 * 10) ) )
    		System.out.println("NONE");
    	else{
    		
    		for (int i = 1; i <= n; i++) {
    			
    			String str = "";
    			if( i % 3 == 0 )
    				str = "Fizz";
				if( i % 5 == 0 )
					str = str + "Buzz";
				
				if( str.equals("") )
					System.out.println(i);
				else
					System.out.println(str);
			}
    	}	
    }

}
