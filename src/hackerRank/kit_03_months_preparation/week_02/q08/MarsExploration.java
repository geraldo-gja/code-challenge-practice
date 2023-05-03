package hackerRank.kit_03_months_preparation.week_02.q08;

public class MarsExploration {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int marsExploration(String s) {
    	
    	int coutChar = 0;
    	int countLettersChanged = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			
			coutChar++;
			
			if( coutChar == 1  && c != 'S' )       //1º telha do Sos
				countLettersChanged++;
			else if( coutChar == 2  && c != 'O' )  //2º telha do sOs
				countLettersChanged++;
			else if( coutChar == 3 ) {
				coutChar = 0;   //ao final do SOS, reseta o contador para zero
				if( c != 'S' )                     //2º telha do soS
					countLettersChanged++;
			}
		}
    	System.out.println(countLettersChanged);
    	return countLettersChanged;
    }
}
