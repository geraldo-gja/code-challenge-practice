package hackerRank.kit_03_months_preparation.week_01.q06;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Exe06 {

	/*
	 * INPUT 1         
	 * 6 3
	 * 1 3 2 6 1 2
	 *  
	 * OUTPUT 1 
	 * 5 
	 * 
	 * OBS 4:20 para leitura e entendimento
	 *     11:10 para resolver a logica
	 *     Sem erros
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        DivisibleSumPairs.divisibleSumPairs(n, k, ar);
        //int result = DivisibleSumPairs.divisibleSumPairs(n, k, ar);

        bufferedReader.close();
        
        /*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        */
    }
}
