package hackerRank.kit_03_months_preparation.week_02.q01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Exe01 {
	
	/*
	 * INPUT 1          OUTPUT 1
	 * 1                1
	 * 1
	 * 
	 * INPUT 2          OUTPUT 2
	 * 3                2
	 * 1 1 2
	 * 
     * INPUT 3          OUTPUT 3
	 * 5                2
	 * 0 0 1 2 1
	 * 
	 * INPUT 4          OUTPUT 4
	 * 7                5
	 * 1 2 5 1 2 6 6
	 * 
	 * OBS 1:40 para leitura e entendimento
	 *     20:00 para resolver a logica COM HashMap
	 *     14:20 para resolver a logica COM 2 for
	 *     Problema passei 54:00 tentando resolver sem o HashMap e não consegui, apenas no dia seguinte que tentei com 2 for e deu certo	 *    
	 */
    public static void main(String[] args) throws IOException {
        
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        LonelyInteger.lonelyinteger(a);

        bufferedReader.close();
    }
}

