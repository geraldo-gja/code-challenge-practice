package wallethub.q04;

public class Q04 {
	
	public static int coinDeterminer(int num) {
		
		int[] ints = { 1, 5, 7, 9, 11};
		int coins = 0;
		
		while( num > 0) {			
			for (int i = 0; i < ints.length; i++) {
				for (int j = 0; j < ints.length; j++) {
					int n = ints[i] + ints[j];
					if( n == num ) {
						coins += 2;
						return coins;
					}
				}
			}		
			if( num > 0 ) {
				for (int i = ints.length - 1; i >= 0 ; i--) {
					if( num - ints[i] >= 0 ) {
						num -= ints[i];
						coins++;
						break;
					}
				}
			}
		}
		
		return coins;
	}

}
