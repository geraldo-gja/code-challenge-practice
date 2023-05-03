package hackerRank.kit_03_months_preparation.week_03.q08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exe08 {
	
	/*
21235
17
	 */
	/*
	 * INPUT 1				OUTPUT 1          
	 * 6					1
	 * 2					
	 * 						
	 * INPUT 2				OUTPUT 2          
	 * 5					0
	 * 4					
	 * 
	 * INPUT 3				OUTPUT 3          
	 * 7					1
	 * 4		
	 * 
	 * INPUT 4				OUTPUT 4         
	 * 6					1
	 * 5	
	 * 
   	 * OBS 4:50 para leitura e entendimento
     *     36:00 para resolver a logica, e tentar resolver uns bugs, tive que parar pq tava tarde.        
     *     27:00 só para resolver os bugs. mais de 1h no total
     *     Bug, precisei desbloquear o vários teste que deram errado
	 */
	public static void main(String[] args) throws IOException {
        
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        DrawingBook.pageCount(n, p);   
   }
   


}
