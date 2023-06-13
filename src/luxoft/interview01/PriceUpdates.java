package luxoft.interview01;

import java.util.Collection;

public interface PriceUpdates {

	public void push(int val);
	
	public Collection<Integer> top();
}
