package outros;

public class Teste_Vaivoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Teste_Vaivoa teste = new Teste_Vaivoa();
		
	//	teste.questao_01();
	//	teste.questao_02();
	//	teste.questao_03();
		teste.questao_04();
	}
	
	//Obs - resolvi em 38 minutos no dia 25/07/21
	public void questao_01(){	
		/*
		int[] possivelFazerTriangulo(int[] arr) {
		}
		*/		
	//	int[] t1 = new int[]{ 1, 2, 2, 4 };
	//	int[] t2 = new int[]{ 2, 10, 2, 10, 2 };
		int[] t3 = new int[]{ 1000000000, 1000000000, 1000000000, 1000000000};
		
		int []retorno = possivelFazerTriangulo( t3 );
		for (int i = 0; i < retorno.length; i++) {
			System.out.print( retorno[i] + ", ");
		}
	}
	
	int[] possivelFazerTriangulo(int[] arr) {
				
		int retorno[] = new int[arr.length - 2];
		
		for (int i = 0; i < arr.length - 2; i++) {
			
			int a = arr[i];
			int b = arr[i + 1];
			int c = arr[i + 2];
			
			//ordenar, colocar menores primeiro
			int aux = 0;
			if( a > b || a > c ){
				aux = a;
				if( b > c ){     //a é maior que a e b
					a = c;					
					c = aux;
				}else{	         //a é maior que b mais é menor que c
					a = b;
			    	b = aux;
				}	
			}else if( b > c ){   //ordena somente b e c
				aux = b;
				b = c;
				c = aux;
			}
			
			//if( a + b > c || a + c > b || b + c > a )
			if( a + b > c  )	
				retorno[i] = 1;
			else
				retorno[i] = 0;
		}
		
		return retorno;
	}
	
	//Obs - resolvi em 50 minutos no dia 26/07/21
	public void questao_02(){	
		/*
		boolean separacaoCamelCase(String[] palavras, String nomeVariavel) {
		}
		*/		
		
		String[] palavras   = new String[]{ "is", "valid", "right" };
		String nomeV01 = "isValid";
		String nomeV02 = "IsValid"; 
		String nomeV03 = "isValId";
		
		System.out.println( separacaoCamelCase( palavras, nomeV01 ) );
		System.out.println( separacaoCamelCase( palavras, nomeV02 ) );
		System.out.println( separacaoCamelCase( palavras, nomeV03 ) );
	}
	
	boolean separacaoCamelCase(String[] palavras, String nomeVariavel){
		
		boolean retorno = true;
		
		int cont = 0;
		String[] palavrasSeparadas = new String[1000];  //10³ - ATENÇAO no tempo de execuçao
		String palavraAux = "";
		
		//separando as palavras e colocando dentro de um vetor
		for (int i = 0; i < nomeVariavel.length() ; i++) {
			
			char letra = nomeVariavel.charAt(i);
			
			if( i == 0 )
				palavraAux = palavraAux + letra;		
			else if( Character.isUpperCase(letra) ) {						
				palavrasSeparadas[cont] = palavraAux;   //coloca a palavra dentro do vetor
				cont++;                                 //incrementando contador para por no próximo vetor
				palavraAux = "" + letra;
			}else
				palavraAux = palavraAux + letra;
			
			if( i == nomeVariavel.length() - 1)
				palavrasSeparadas[cont] = palavraAux;   //coloca a ULTIMA palavra dentro do vetor
		}
		
		boolean validar = false;
		//vefiricando se as palavras separadas contem no vetor de palavras
		for (int i = 0; i < palavrasSeparadas.length; i++) {			
			
			validar = false;
						
			if( palavrasSeparadas[i] == null )   //quando o vetor vir nulo, sai do for
				break;
			
			palavrasSeparadas[i] = palavrasSeparadas[i].toLowerCase();  //fazendo a palavra ficar com todas as letras minusculas
			for (int j = 0; j < palavras.length; j++) 				
				if( palavrasSeparadas[i].equals( palavras[j] ) ) 
					validar = true;
						
			if( validar == false )
			{
				retorno = false;
				break;
			}
		}
		
		return retorno;
	}
	
	//Obs - resolvi em 25 minutos no dia 26/07/21
	public void questao_03(){		
	//	String lendoVerticalmente(String[] arr) {
	//	}				
		String[] s1 = new String[]{ "Daisy", "Rose", "Hyacinth", "Poppy" };
		String[] s2 = new String[]{ "E", "M", "I", "L", "Y" };
		
		System.out.println( lendoVerticalmente(s1) );
		System.out.println( lendoVerticalmente(s2) );		
	}
	
	String lendoVerticalmente(String[] arr) {
		
		String retorno = "";
		int maiorPalavra = 0;
		
		for (int i = 0; i < 100; i++) {					
			
			for (int j = 0; j < arr.length; j++) {
				String aux = arr[j];
				if( aux.length() > i )  //o tamanho da palavra é menor que o i
					retorno = retorno + aux.charAt(i);
				
				if( aux.length() > maiorPalavra )    //obtem o tamanho da maior palavra
					maiorPalavra = aux.length();
			}
			
			if( i > maiorPalavra )  //o numero i já é maior que todas as palavras, a partir desse ponto iria executar atoa
				break;
		}
		
		return retorno;
	}
	
	//Obs - resolvi em 1:24 minutos no dia 26/07/21
	public void questao_04(){		
		//String[] centralizarTextoJornal(String[][] paragrafos, int largura) {
		//}

		String[][] paragrafos = new String[][] { {"hello","world"} , {"How", "areYou", "doing"} , { "Please look", "and align", "to center"} };
		
		String[] r1 = centralizarTextoJornal(paragrafos, 16);
		
		for (int i = 0; i < r1.length; i++) 			
			System.out.println( r1[i] );	
	}	
	
	String[] centralizarTextoJornal( String[][] paragrafos, int largura ) {
		
		String[] retorno = new String[50];
		
		//add * no iníicio e final do array
		String linhaAsterisco = "";
		for (int i = 0; i < largura + 2; i++) {
			linhaAsterisco = linhaAsterisco + "*";
		}
		
		retorno[0] = linhaAsterisco;     //primeira linha de *
		int cont = 1;
		
		//colocando distribuindo palavras das frases de acordo com a largura
		for (int i = 0; i < 50 ; i++) {
			
			if( paragrafos.length < i + 1 )   //quando nao tiver mais paragrafor, sai do for
				break;
			
			String fraseAux = "";
			
			for (int j = 0; j < 10 ; j++) {
				if( paragrafos[i].length < j + 1 ) {  //quando nao tiver mais frases no paragrafor, sai do for
					retorno[cont] = fraseAux;     //coloca a ultima palavra do vetor de frase no vetor de retorno, entao sai do for
					cont++;
					break;
				}
				
				if( ( fraseAux.length() + paragrafos[i][j].length() ) < largura )  { //se a frase com a próxima palavra sao menores que a lasgura
					if( fraseAux.equals("") )
						fraseAux = paragrafos[i][j];
					else
						fraseAux =fraseAux + " " + paragrafos[i][j];	
				}else{
					retorno[cont] = fraseAux;
					cont++;					
					fraseAux = paragrafos[i][j]; //atualizando a nova frase
				}	
			}
		}
		
		//colocando espaços em branco
		//for (int i = 1; i < retorno.length -1; i++) {
		for (int i = 1; i < cont; i++) {			
				
			int qtdEspacos = largura - retorno[i].length();
			if( qtdEspacos > 0  ){
				
				int qtd = qtdEspacos / 2;
				for (int j = 0; j < qtd; j++) {	
					
					retorno[i] = " " + retorno[i] + " ";
					
					if( j == qtd-1 && qtdEspacos % 2 != 0 )   //é impar e já está na contagem do último espaço em branco
						retorno[i] = retorno[i] + " ";						
				}					
			}
			
			retorno[i] = "*" + retorno[i] + "*";
		}
		retorno[cont] = linhaAsterisco;
		
		String[] r = new String[cont + 1];
		for (int i = 0; i < r.length; i++) {   //copiando para um novo vetor sem espaços nulos
			r[i] = retorno[i];
		}
		
		return r;
	}

	
}	