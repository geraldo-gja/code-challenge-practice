package hackerRank.kit_03_months_preparation.week_02.q07;

public class Pangrams {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String pangrams(String s) {
    	
    	String r = "not pangram";
    	String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    	s = s.toUpperCase();
    	
    	for (int i = 0; i < alphabet.length; i++) 
    		if( !s.contains( alphabet[i] ) )
    			return r;
    	
    	r = "pangram";
    	
    	return r;
    }
    
}
