package luxoft.interview01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Market implements PriceUpdates{

	private List<Integer> topPrices;
	private int n;
	
	Market(int n) {
		this.n = n; 
		topPrices = new ArrayList<Integer>(n);
	}
	
	public void push(int val) {
		
		if( ! topPrices.contains(val) ) {
			
			if( topPrices.size() < n )
				topPrices.add(val);
			else {
				Collections.sort( topPrices );		
				if( val > topPrices.get(0) )
					topPrices.set(0, val);				
			}
				
		}
			
	}

	public Collection<Integer> top() {
		System.out.println(topPrices);
		return topPrices;
	}

}
