package hackerRank.kit_03_months_preparation.week_01.q04;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    	return BreakingTheRecords.breakingRecords(scores);
    }

}

/*
 * EXEMPLO 1
 * Input 1: 4
 * Input 2: 12 24 10 24
 * Output:  1 1
 * 
 * EXEMPLO 2
 * Input 1: 9
 * Input 2: 10 5 20 20 4 5 2 25 1
 * Output:  2 4
 * 
 * EXEMPLO 3
 * Input 1: 10
 * Input 2: 3 4 21 36 10 28 35 5 24 42
 * Output:  4 0
 * 
 * OBS 6:30 para leitura e entendimento
 *     8:30 para resolver
 *     Sem erros
 */
public class Exe04 {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList());

        Result.breakingRecords(scores);

        bufferedReader.close();

    }
}
