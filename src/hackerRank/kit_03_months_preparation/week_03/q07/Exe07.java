package hackerRank.kit_03_months_preparation.week_03.q07;

import java.util.Scanner;

public class Exe07 {

	/*
	 * INPUT 1				OUTPUT 1          
	 * 1					1 2 3 7 6 5 4
	 * 7					
	 * 1 2 3 4 5 6 7						
	 * 
	 * 
   	 * OBS 4:00 para leitura e entendimento
     *     16:00 para resolver a logica        
     *     Sem erros
	 */
    public static void main (String[] args) throws java.lang.Exception {
    	
        Scanner kb = new Scanner(System.in);        
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            ZigZagSequence.findZigZagSequence(a, n);
        }
        kb.close();
   }
   

}
