package kwan.prova1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q22 {

	public static String[] getTopStocks(String[] stocks, float[][] prices) {
		
		HashMap<String, Float> map = new HashMap<>(); 
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = 0; j < stocks.length; j++) {			
				float soma = prices[i][j];
				if( map.containsKey(stocks[j]) ) 
					soma +=  map.get(stocks[j]);			
				map.put(stocks[j], soma );
			}	
		}
			
		List<String> orderedTops = new ArrayList<String>(); 
		
		map.entrySet().stream().sorted(Map.Entry.<String, Float>comparingByValue().reversed())
		//.forEach(System.out::println);
		//.forEach( item -> System.out.println(item.getValue()) );
		.forEach( item -> {
			orderedTops.add(item.getKey());
		} );
		
		String[] tops = new String[3];
		for ( int i = 0; i < 3; i++) {
			tops[i] = orderedTops.get(i);
		}
		
		return tops;
	}
	
}
