package hackerRank.kit_03_months_preparation.week_02.q09_mockTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class ExeMockTest {
/*
1          
2
112 42 83 119
56 125 56 49
15 78 101 43
62 98 114 108
	*/
	
	/*
	 * INPUT 1           
	 * 1          
	 * 2
	 * 112 42 83 119
	 * 56 125 56 49
	 * 15 78 101 43
	 * 62 98 114 108
	 * 
	 * OUTPUT 1
	 * 414
	 * 
   	 * OBS 8:40 para leitura e entendimento
     *     01:08:00 para resolver, o código funciona, mas minha lógica encontra um resultado diferente
     *     
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));        

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt).collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                FlippingTheMatix.flippingMatrix(matrix);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

}
