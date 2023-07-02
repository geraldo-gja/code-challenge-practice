package critical.techworks.q01;

public class Q01 {

    /*
     * Complete the 'biggestInteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int biggestInteger(int n) {

    	n = Math.abs(n);
        String number = String.valueOf(n);
        if( number.length() >= 10)
            return Integer.MAX_VALUE;
        
        for (int i = 0; i < 9; i++) {
            String s = String.valueOf(i);
            char c = s.charAt(0);
            number = number.replace(c, '9');
        }       
        int biggestInteger = Integer.parseInt(number);
        
        return biggestInteger;
    }
}
