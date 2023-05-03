package hackerRank.kit_03_months_preparation.week_02.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe06 {

	/*
	 * INPUT 1          OUTPUT 1
	 * 8				1			
	 * UDDDUDUU
	 * 
	 * INPUT 2          OUTPUT 2
	 * 12				2			
	 * DDUUDDUDUUUD
	 * 
   	 * OBS 6:40 para leitura e entendimento
     *     5:00 para resolver a logica
     *     Sem erros
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        CountingValleys.countingValleys(steps, path);

        bufferedReader.close();
    }

}
