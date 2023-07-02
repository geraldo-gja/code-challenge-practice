package kwan;

public class Q20 {

	public static int[] findSumPair(int[] numbers, int k) {
		
		int[] array = new int[2];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {				
				if( (numbers[i] + numbers[j]) == k) {
					array[0] = i;
					array[1] = j;
					return array;
				}	
			}
		}
		
		return null;
	}

	
}
