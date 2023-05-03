package hackerRank.kit_03_months_preparation.week_03.q03;

import java.io.IOException;
import java.util.Scanner;

public class Exe03 {

	/*
	 * INPUT 1          OUTPUT 1
	 * 10101			10000
	 * 00101						
	 * 
   	 * OBS 3:40 para leitura e entendimento
     *     34:00 para resolver a logica     
     *     24:00 após pesquisa. 
     *     Erros, a lógica funciona, retorna o valor correto, mas continua dando problema.
     *            o problema é no compilador do site, só funciona no Java 7, e mesmo assim dava problema as vezes
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner sn = new Scanner(System.in);

		String s = sn.nextLine();
		String t = sn.nextLine();
	    	
		System.out.println( XORStrings3.findXOR( s, t) );

	    sn.close();    	   
    }

}
