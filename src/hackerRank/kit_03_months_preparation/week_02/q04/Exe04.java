package hackerRank.kit_03_months_preparation.week_02.q04;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exe04 {

	/*
	 
3			
11 2 4				
4 5 6			
10 8 -12		 
	 
	 
	 */
	
	/*
	 * INPUT 1          OUTPUT 1
	 * 3				15
	 * 11 2 4				
	 * 4 5 6			
	 * 10 8 -12				
	 * 
	 * 
   	 * OBS 4:20 para leitura e entendimento
     *     17:45 para resolver a logica
     *     Sem erros
	 */
	public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        DiagonalDifference.diagonalDifference(arr);

        bufferedReader.close();
	}

}
