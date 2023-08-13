package critical.techworks.teste2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Prova {

	public static void main(String[] args) {
		//onlyOddNumbers();
		//duplicateNumbers();
		groupByName();
		//testeReferencia();
	}
	
	//Q01
	public static void onlyOddNumbers(){
	    
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		List<Integer> output = new LinkedList<Integer>();
	    
	    output = numbers.stream()
	    		.filter( p ->  p % 2 != 0 )
	    		.collect(Collectors.toList());
	       
	    System.out.println(output);    
	}
	
	//Q02
	public static void duplicateNumbers(){
	    final List<Integer> numbers = Arrays.asList(1, 9,2, 3, 4, 6, 5, 6, 7, 8, 9, 1);  
	    final Set<Integer> output = new HashSet<Integer>(numbers); 
	    System.out.println(output);
	}
	
	//Q03
	public static void groupByName(){
		List<Q03Driver> drivers = Arrays.asList(
	            new Q03Driver("João"),
	            new Q03Driver("João"),
	            new Q03Driver("Maria"),
	            new Q03Driver("Maria"),
	            new Q03Driver("Vanda"),
	            new Q03Driver("Camilo"),
	            new Q03Driver("Camilo"),
	            new Q03Driver("Luis")
	    ); 		
	    Map<String, List<Q03Driver>> driverByName = new HashMap<>(); 
	    for (Q03Driver d : drivers) {
	    	if( driverByName.containsKey(d.getName()) ) {
	    		List<Q03Driver> list = driverByName.get(d.getName());
	    		list.add(d);
	    	}else {
	    		List<Q03Driver> list = new LinkedList<>();
	    		list.add(d);
	    		driverByName.put( d.getName(), list );    		
	    	}
		}
	    for (List<Q03Driver> listDrivers : driverByName.values())
			System.out.println(listDrivers); 
	}
	
	//Q04
	public static void testeReferencia() {
		String a1 = "Java";
		String a2 = new String("Java");
		String a3 = a1;
		String a4 = "Java";
		
		//"What is the output?
		System.out.println(a1 == a2);      //  -> false. Pq compara referencia		
		System.out.println(a1 == a3);      //  -> true
		System.out.println(a1.equals(a2)); //  -> true. Pq compara conteúdo
		System.out.println(a1 == a4);      //  -> true. A Classe Wraper String identifica o mesmo nome
	}
	
}
