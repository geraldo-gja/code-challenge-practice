package hackerRank.kit_03_months_preparation.week_03.q05;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Exe05 {

	/*
	 * INPUT 1          
	 * 6
	 * 1 4 4 4 5 3					
	 * 
	 * OUTPUT 1
	 * 4
	 * 
	 * INPUT 2
	 * 11
	 * 1 2 3 4 5 4 3 2 1 3 4
	 * 
	 * OUTPUT 2
	 * 3
	 * 
   	 * OBS 2:20 para leitura e entendimento
     *     09:40 para resolver a logica        
     *     apenas alguns pequenos erros por falta de atenção, resolvi no debug
	 */
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt).collect(toList());

        MigratoryBirds.migratoryBirds(arr);

        bufferedReader.close();
	}
}
