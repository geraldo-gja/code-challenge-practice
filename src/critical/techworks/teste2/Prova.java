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
		onlyOddNumbers();
		duplicateNumbers();
		duplicateDrivers();
		testeReferencia();
	}
	
	public static void onlyOddNumbers(){
	    
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
		List<Integer> output = new LinkedList<Integer>();
	    
	    output = numbers.stream()
	    		.filter( p ->  p % 2 != 0 )
	    		.collect(Collectors.toList());
	       
	    System.out.println(output);    
	}
	
	public static void duplicateNumbers(){
	    final List<Integer> numbers = Arrays.asList(1, 9,2, 3, 4, 6, 5, 6, 7, 8, 9, 1);  
	    final Set<Integer> output = new HashSet<Integer>(numbers); 
	    System.out.println(output);    
	}
	
	public static void duplicateDrivers(){
		List<Driver> drivers = Arrays.asList(
	            new Driver("João"),
	            new Driver("João"),
	            new Driver("Maria"),
	            new Driver("Maria"),
	            new Driver("Vanda"),
	            new Driver("Camilo"),
	            new Driver("Camilo"),
	            new Driver("Luis")
	    ); 		
	    Map<String, List<Driver>> driverByName = new HashMap<>();
	    
	    for (int i = 0; i < drivers.size(); i++) {
		
	    	Driver d = drivers.get(i);
	    	if( driverByName.containsKey(d.getName()) ) {
	    		List<Driver> list = driverByName.get(d.getName());
	    		list.add(d);
	    	}else {
	    		List<Driver> list = new LinkedList<>();
	    		list.add(d);
	    		driverByName.put( d.getName(), list );    		
	    	}
		}
	    System.out.println(driverByName);    
	}
	
	public static void testeReferencia() {
		String a1 = "Java";
		String a2 = new String("Java");
		String a3 = a1;
		String a4 = "Java";
		
		//"What is the output?
		System.out.println(a1 == a2);      //  -> false		
		System.out.println(a1 == a3);      //  -> true
		System.out.println(a1.equals(a2)); //  -> true
		System.out.println(a1 == a4);      //  -> true
	}
	
}
