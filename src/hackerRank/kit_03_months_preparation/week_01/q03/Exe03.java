package hackerRank.kit_03_months_preparation.week_01.q03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	
    	return TimeConversion.timeConversion(s);
    }

}

/*
 * EXEMPLO 1
 * Input: 12:01:00PM
 * Output: 12:01:00
 * 
 * EXEMPLO 2
 * Input: 12:01:00AM
 * Output: 00:01:00
 * 
 * EXEMPLO 3
 * Input: 07:05:45PM
 * Output: 19:05:45
 *  
 * EXEMPLO 4     obs: deu erro no teste, tive que desbloquear para ver
 * Input: 12:40:22AM       
 * Output: 00:40:22
 * 
 * OBS: 03:45 para leitura e entendimento
 *      13:00 para resolver
 *      Erro: tive que trocar 
 */
public class Exe03 {
    public static void main(String[] args) throws IOException {
       
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        Result.timeConversion(s);

        bufferedReader.close();
    }
}
