package luxoft.interview01;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarketTest {

	@Test
	void topTest() {
		
		List<Integer> top;
		
		PriceUpdates prices = new Market(3);
		prices.push(1);
		prices.push(2);
		top = (List<Integer>) prices.top();
		prices.push(3);
		prices.push(4);
		prices.push(5);
		top = (List<Integer>) prices.top();
		prices.push(3);
		prices.push(1);
		prices.push(6);
		prices.push(5);
		prices.push(0);
		prices.push(-10);
		top = (List<Integer>) prices.top();
		
		Assertions.assertEquals(4, top.get(0) );
		Assertions.assertEquals(5, top.get(1) );
		Assertions.assertEquals(6, top.get(2) );
	}

}
