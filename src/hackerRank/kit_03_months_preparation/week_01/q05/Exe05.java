package hackerRank.kit_03_months_preparation.week_01.q05;

import java.util.*;

public class Exe05 {

	/*
	 * The 1º operator: S (split) or C (combine)
	 * The 2º operator: M indicates method, C indicates class, and V indicates variable
	 * 
	 * SAMPLE INPUT                  SAMPLE OUTPUT
     * S;M;plasticCup() -----------> plastic cup
	 * S;C;LargeSoftwareBook ------> large software book
     * S;V;pictureFrame -----------> picture frame
     * C;V;mobile phone -----------> mobilePhone
     * C;C;coffee machine ---------> CoffeeMachine
     * C;M;white sheet of paper ---> whiteSheetOfPaper()
     * 
     * 
	 * OBS 6:30 para leitura e entendimento
	 *     49:30 para resolver a logica
	 *     20:00 resolver por completo, entrada e leitura de dados
	 *     Erro: tive que pesquisar em 'Discussions' para implementar a leitura de dados
	 */
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner sn = new Scanner(System.in);
	    while(sn.hasNextLine()){
	        CamelCase4.camelCase(sn.nextLine());
	       // System.out.println(sn.nextLine());
	    }
	    sn.close();    
	    
	    //new Exec05().testMock();
    }
	
	public void testMock() {	
   
		List<String> lista = new ArrayList<String>();
		lista.add( "S;M;plasticCup()" );
		lista.add( "S;C;LargeSoftwareBook" );
		lista.add( "S;V;pictureFrame" );
		lista.add( "C;V;mobile phone" );
		lista.add( "C;C;coffee machine" );
		lista.add( "C;M;white sheet of paper" );
		
		for (String s : lista) 
			CamelCase4.camelCase(s);	
	}

}
