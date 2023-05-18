package utilityClassesForTests;

public class Calculos {
	
	//número par
	public static boolean isEvenNumber( int n ) {
		
		boolean r = false;
		if( n % 2 == 0 )
			r = true;
		
		return r;
	}
	
	//número ímpar
	public static boolean isOddNumber( int n  ) {
		
		boolean r = false;
		if( n % 2 != 0 )
			r = true;
		
		return r;
	}
	
	//é divisível por número
	public static boolean isDivisibleByNumber( int n1, int n2  ) {
		
		boolean r = false;
		if( n1 % n2 == 0 )
			r = true;
		
		return r;
	}
	
	//número primo
	//Atention i = 2
	public static boolean isPrimeNumber( int n ) {
		
		boolean r = true;
		for (int i = 2; i < n; i++) {
			if( n % i == 0)
				r = false;
		}
		return r;
	}
	
	//devolve sempre um número inteiro positivo.
	public static int absoluteValue( int n ) {
		
		n = Math.abs(n);
		
		return n;
	}
	
	/*
	 * Método apenas para relembrar funcionalidades
	 */
	public static long convertLotToByte( long n) {
		
		//converte do long para bit
		String binary = Long.toBinaryString(n);
		
		//converte de volta, do bit para long
    	long n2 = Long.parseUnsignedLong(binary, Character.MIN_RADIX);  	
    	System.out.println(n2);
    	
    	long nBit = Long.parseLong(binary);
    	
    	return nBit;
	}
	
}
