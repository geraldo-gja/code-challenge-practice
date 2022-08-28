package hackerRank.kit_03_months_preparation.week_01.q01;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

	/*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * link que usei para pesquisa:
     * https://pt.tutorialcup.com/java/how-to-limit-decimal-places-in-java.htm#:~:text=round()%20m%C3%A9todo%20%C3%A9%20outro,1000.0%20e%20assim%20por%20diante.
     */
    public static void plusMinus(List<Integer> arr) {
    	
    	int n = arr.size();
    	int countPositive = 0;
    	int countNegative = 0;
    	int countZero = 0;
    	
    	for (int i = 0; i < n; i++) {
    		
    		int element = arr.get(i);
    		if( element > 0 )
    			countPositive++;
    		else if( element < 0 )
    			countNegative++;
    		else
    			countZero++;
		}
    	
    	Double positiveValues = (double) countPositive / n;
    	Double negativeValues = (double) countNegative / n;
    	Double zeroValues = (double) countZero / n;
    	
    	//opção 1
    	DecimalFormat df = new DecimalFormat("0.000000");
    	System.out.println( df.format(positiveValues) );
    	System.out.println( df.format(negativeValues) );
    	System.out.println( df.format(zeroValues) );

    	//Opção 2. o %n faz pular linha
    	//System.out.format("%.6f %n", positiveValues);
    	
    	//Opção 3
    	//System.out.format("%,6f", positiveValues);
    	//System.out.println();
    	
    	//Opção 4
    	//System.out.println( String.format("%.4f", positiveValues) );
    }


}
