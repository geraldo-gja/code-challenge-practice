package amazon.codingDemo.q01;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogs {
	
	public static void main(String[] args) {

		TransactionLogs teste = new TransactionLogs();
		teste.teste00();
		teste.teste01();
		teste.teste02();
	}
	
	private void teste00() {
		
		List<String> logs1 = new ArrayList<String>();
		logs1.add("88 99 200");
		logs1.add("88 99 300");
		logs1.add("99 32 100");
		logs1.add("12 12 15");
		
		int limite1 = 2;
		
		List<String> resultado = TransactionLogs.processLogs( logs1, limite1);
		
		System.out.println( resultado );
	}
	
	private void teste01() {
		
		List<String> logs1 = new ArrayList<String>();
		logs1.add("1 2 50");
		logs1.add("1 7 50");
		logs1.add("1 3 20");
		logs1.add(" 2 2 17");
		
		int limite1 = 2;
		
		List<String> resultado = TransactionLogs.processLogs( logs1, limite1);
		
		System.out.println( resultado );
	}
	
	private void teste02() {
		
		List<String> logs1 = new ArrayList<String>();
		logs1.add("9 7 50");
		logs1.add("22 7 20");
		logs1.add("33 7 50");
		logs1.add("22 7 30");
		
		int limite1 = 3;
		
		List<String> resultado = TransactionLogs.processLogs( logs1, limite1);
		
		System.out.println( resultado );
	}
	
	
	
	public static List<String> processLogs(List<String> logs, int threshold) {
   
		int[][] usersV = new int[10][2];

		for (int i = 0; i < logs.size(); i++) {
			
			String transacao = logs.get(i);

			//método auxiliar
			String[] numeros = numerosConcatenados( transacao );
			
			usersV = userList( usersV, Integer.parseInt(numeros[0]) );
			if( !numeros[0].equals(numeros[1]) )
				usersV = userList( usersV, Integer.parseInt(numeros[1]) );
			
			//matriz de usuarios e contador de quantidade de transacoes	
		}
		
		//método auxiliar
		List<String> listaOrdenada = orderLogList( usersV, threshold );
		
		return listaOrdenada;
    }
	
	public static int[][] userList( int[][] usersV, int num) {
			
		for (int j = 0; j < usersV.length; j++) {			
			if( usersV[j][0] == 0 ) {
				usersV[j][0] = num;  
				usersV[j][1] = 1;         //incrementando contador de transação
				break;
			}
			else if( usersV[j][0] == num ) {
				usersV[j][1] = usersV[j][1] + 1;         //incrementando contador de transação 
				break;
			}
		}
		return usersV;
	}	
	
	public static String[] numerosConcatenados( String transacao) {
		
		String[] numeros = new String[2];		
		String num1 = "";
		String num2 = "";
		boolean n1 = false;  //ativar a inicio da concatenação do primeiro e do segundo número.
		boolean n2 = false;
		
		for (int j = 0; j < transacao.length() ; j++) {
			
			char n = transacao.charAt(j);
			
			if( n1 == false && !String.valueOf(n).equals(" ") ) {    //iniciar concatenação do 1º numero
				n1 = true;
				num1 = num1 + n;
			}
			else if( n1 == true && n2 == false ) {            //concatenando 1º numero
				if( !String.valueOf(n).equals(" ") ) 
					num1 = num1 + n;
				else 
					n2 = true;	
			}
			else if( n2 == true ) {            //concatenando 2º numero
				if( !String.valueOf(n).equals(" ") ) 
					num2 = num2 + n;
				else {
					n2 = false;
					break;               //sai do FOR após concatenar o 2º número
				}
			}
		}		
		numeros[0] = num1;
		numeros[1] = num2;
		
		return numeros;
	}
	
	//retorna lista de log ordenada pelo threshold
	public static List<String> orderLogList( int[][] lista, int threshold ){
		
		List<String> listaOrdenada = new ArrayList<String>() ; 
		
		for (int i = 0; i < lista.length; i++) {

			if( lista[i][1] >= threshold )
				listaOrdenada.add( String.valueOf( lista[i][0] ) );
		}
		return listaOrdenada;
	}

}
