package hackerRank.kit_03_months_preparation.week_02.q08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe08 {

	/*
	 * INPUT 1          OUTPUT 1 
	 * SOSSPSSQSSOR		3		
	 * 
	 * INPUT 2          OUTPUT 2 
	 * SOSSOT			1			
	 * 
	 * INPUT 3          OUTPUT 3
	 * SOSSOSSOS        0
	 * 
   	 * OBS 3:20 para leitura e entendimento
     *     11:00 para resolver a logica
     *     Sem erros
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        MarsExploration.marsExploration(s);

        bufferedReader.close();
	}

}
