package utilityClassesForTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 * 
 * Iterando por um HashMap em Java
 * https://www.alura.com.br/artigos/iterando-por-um-hashmap-em-java?gclid=Cj0KCQjw1ZeUBhDyARIsAOzAqQJfcTtEx5DUJGsw_4CZbsFHTjpXAvBUjbxStahzMmAd3O0CRlQgYKQaAvKVEALw_wcB
 */
public class HashMapExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	HashMap<String, String> mapEstados = getMapString(); 
	//	HashMap<Integer, Integer> mapInteiros = getMapInteger(); 
		sortHasMap();
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

	
	public static void sortHasMap() { 
		
		HashMap<String, Integer> map = new HashMap<>(); 
		
		map.put("B", 20); 
		map.put("D", 40); 
		map.put("A", 10);
		map.put("C", 30); 
		map.put("E", 50); 
	
		//Ascendenting order and comparind by value
		System.out.println("Ascendenting order");
		
		map.entrySet().stream()
		.sorted( Map.Entry.<String, Integer>comparingByValue() )
		.forEach(System.out::println);
		
		
		//Descendeting order and comparind by key
		System.out.println("");
		System.out.println("Descendeting order");
		
		map.entrySet().stream()
		.sorted( Map.Entry.<String, Integer>comparingByKey().reversed() )   
		.forEach(System.out::println);

		
		
		//recuperando o valor
		System.out.println("");
		System.out.println("Imprimindo lista");
		
		List<Integer> list = new ArrayList<Integer>();
		map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
		.forEach( item -> {
			list.add(item.getValue());
			System.out.println(item.getValue());
		} );
		
		
	}
	

	
}

