package hackerRank.kit_03_months_preparation.week_02.q07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe07 {

	/*
	 * INPUT 1         
	 * We promptly judged antique ivory buckles for the next prize						
	 * 
	 * OUTPUT 1
	 * pangram
	 * 
	 * INPUT 2
	 * We promptly judged antique ivory buckles for the prize
	 * 
	 * OUTPUT 2
	 * not pangram
	 * 
   	 * OBS 2:10 para leitura e entendimento
     *     13:30 para resolver a logica
     *     Sem erros
	 */
	public static void main(String[] args) throws IOException {
        
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        Pangrams.pangrams(s);

        bufferedReader.close();

	}

}
