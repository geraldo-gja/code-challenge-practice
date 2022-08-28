package hackerRank.kit_03_months_preparation.week_01.q01;



import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    //	PlusMinus pm = new PlusMinus();
    	PlusMinus.plusMinus(arr);
    }

}


/*
 * EXEMPLO 1
 * Input 1: 5             
 * Input 2: 1 1 0 -1 -1    
 * Output:
 * 
 * EXEMPLO 2
 * Input 1:  6              
 * Input 2: -4 3 -9 0 4 1   
 * Output:
 * 		0.500000
 * 		0.333333
 * 		0.166667
 * 
 * EXEMPLO 3
 * Input 1: 8                      
 * Input 2: 1 2 3 -1 -2 -3 0 0
 * Output:
 * 		0.375000
 * 		0.375000
 * 		0.250000
 * 
 * OBS: 01:13:00 para ler, entender e resolver. 
 *      Problema: no meu console imprime os valores com ','  Mas na resolução imprie com '.' mesmo
 *                mas se eu não tivesse ficado preso no problema do '.' teria sido muito mais rápido     
 */
public class Exe01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
