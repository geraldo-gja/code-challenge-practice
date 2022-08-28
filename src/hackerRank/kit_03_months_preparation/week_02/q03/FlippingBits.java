package hackerRank.kit_03_months_preparation.week_02.q03;

public class FlippingBits {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */
    public static long flippingBits(long n) {

    	String binary = Long.toBinaryString(n);
    	int countZero = 32 - binary.length() ;
    	
    	for (int i = 0; i < countZero; i++) 
    		binary = "0" + binary;
		
    	String flipBinary = "";
    	
    	for (int i = 0; i < binary.length(); i++) {
    		char c = binary.charAt(i);
			if( c == '1' )
				flipBinary = flipBinary + "0";
			else
				flipBinary = flipBinary + "1";
		}	

    	long newLong = Long.parseUnsignedLong(flipBinary, Character.MIN_RADIX);
    	System.out.println(binary);
    	System.out.println(newLong);
    	
    	return newLong;
    }
    
	
}
