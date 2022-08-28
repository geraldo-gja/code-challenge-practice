package utilityClassesForTests;

import java.util.HashMap;

public class HashMapExample {

	/**
	 * TODO
	 * 
	 * Iterando por um HashMap em Java
	 * https://www.alura.com.br/artigos/iterando-por-um-hashmap-em-java?gclid=Cj0KCQjw1ZeUBhDyARIsAOzAqQJfcTtEx5DUJGsw_4CZbsFHTjpXAvBUjbxStahzMmAd3O0CRlQgYKQaAvKVEALw_wcB
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	HashMap<String, String> mapEstados = getMapString(); 
	//	HashMap<Integer, Integer> mapInteiros = getMapInteger(); 
	}

	
	public static HashMap<String, String> getMapString() { 
		
		HashMap<String, String> map = new HashMap<>(); 
		
		map.put("AC", "Acre"); map.put("AL", "Alagoas");
		map.put("AP", "Amapá"); map.put("AM", "Amazonas");
		map.put("BA", "Bahia"); map.put("CE", "Ceará"); 
		map.put("DF", "Distrito Federal"); map.put("ES", "Espírito Santo"); 
		map.put("GO", "Goiás"); 
		
		//ITERANDO valores e chaves
		map.forEach( (key,value)->{
			System.out.println(key+" = "+value);
		});
		
		
		//###########  IMPORTANTE
		map.replace("CE", "Fortaleza");   
		map.remove("AP");
		
		//ITERANDO as chaves
		System.out.println(" "); 
		for (String sigla : map.keySet()) { 
			System.out.print(sigla + " "); 
		}
		
		//ITERANDO os valores
		System.out.println(" "); 
		for (String sigla : map.values()) { 
			System.out.print(sigla + " "); 
		}
		

		return map; 
	}
	
	
	
	public static HashMap<Integer, Integer> getMapInteger() { 
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		map.put(10, 1); 
		map.put(22, 1); 
		map.put(33, 1); 

		int[] vetor = {5,10,50,66,10};
		
		//ITERANDO valores e chaves
		map.forEach( (key,value)->{
			
			int count = 0;
			for (int i = 0; i < vetor.length; i++) 	
				if( key == vetor[i]) 
					count++;
					
			map.replace(key, value + count);
		});
		
		//ITERANDO valores e chaves
		map.forEach( (key,value)->{
			System.out.println(key+" = "+value);
		});
		
		
		return map; 
	}

}

