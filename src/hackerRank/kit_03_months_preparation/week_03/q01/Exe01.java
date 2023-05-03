package hackerRank.kit_03_months_preparation.week_03.q01;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exe01 {

	/*
2
3 10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4

1
5 10
7 6 8 4 2
5 2 6 3 1
	*/
	
	/*
	 * INPUT 1          OUTPUT 1
	 * 2				YES
	 * 3 10				NO
	 * 2 1 3
	 * 7 8 9
	 * 4 5
	 * 1 2 2 1
	 * 3 3 3 4							
	 * 
	 * INPUT 2          OUTPUT 2
	 * 1				NO
	 * 5 10
	 * 7 6 8 4 2
	 * 5 2 6 3 1
	 * 
   	 * OBS 9:20 para leitura e entendimento
     *     9:45 para resolver a logica
     *     Sem erros
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

               // int n = Integer.parseInt(firstMultipleInput[0]);
                Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                PermutingTwoArrays.twoArrays(k, A, B);


            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        bufferedReader.close();
    }

}
