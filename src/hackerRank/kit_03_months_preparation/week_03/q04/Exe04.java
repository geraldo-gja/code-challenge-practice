package hackerRank.kit_03_months_preparation.week_03.q04;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Exe04 {

	/*
	 * INPUT 1          
	 * 9
	 * 10 20 20 10 10 30 50 10 20						
	 * 
	 * OUTPUT 1
	 * 3
	 * 
	 * INPUT 2
	 * 10
	 * 1 1 3 1 2 1 3 3 3 3
	 * 
	 * OUTPUT 2
	 * 4
	 * 
   	 * OBS 2:00 para leitura e entendimento
     *     09:00 para resolver a logica        
     *     Sem erros
	 */
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        SalesByMatch.sockMerchant(n, ar);

        bufferedReader.close();
	}

}
