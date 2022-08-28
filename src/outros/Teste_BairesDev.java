package outros;

public class Teste_BairesDev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Teste_BairesDev teste = new Teste_BairesDev();

		teste.questao_01();
		
	}
	
	public void questao_01(){	
		/*
		int addTwoDigits(int n) {		    
		}
		*/		
		System.out.println( addTwoDigits(29) );
	}
	
	public void task_01(){	
		/*
		boolean validBracketSequence(String sequence) {	
		}
		*/		
	//	System.out.println( validBracketSequence(29) );
	}

	int addTwoDigits(int n) {
		
		int soma = 0;
		
		String sN = Integer.toString(n);
  
	    int n1 = Integer.parseInt( sN.substring(0, 1) );
	    int n2 = Integer.parseInt( sN.substring(1, 2) );
	    
	    soma = n1 + n2;		
		
		return soma;
	}
	
	boolean validBracketSequence(String sequence) {
		
		boolean retorno = false;
		
		return retorno;
	}


}
