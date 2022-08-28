package hackerRank.kit_03_months_preparation.week_01.q02;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	
    	MiniMaxSum.miniMaxSum(arr);
    }

}

/*
 * EXEMPLO 1
 * Input:  1 3 5 7 9
 * Output: 16 24
 * 
 * EXEMPLO 2
 * Input:  1 2 3 4 5
 * Output: 10 14
 * 
 * EXEMPLO 3
 * Input:  7 69 2 221 8974
 * Output: 299 9271
 * 
 * EXEMPLO 4   obs: deu erro no teste, tive que desbloquear para ver
 * Input:  256741038 623958417 467905213 714532089 938071625
 * Output: 2063136757 2744467344
 * 
 * OBS: 04:30 para leitura e entendimento
 *      13:00 para resolver 
 *      Erro: precisei trocar o 'int' pelo 'long'
 */
public class Exe02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
