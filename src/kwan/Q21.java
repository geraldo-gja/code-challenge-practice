package kwan;

import java.util.LinkedList;
import java.util.List;

public class Q21 {

	public static int[] filterDuplicates(int[] data) {
		
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < data.length; i++) {
			if ( !list.contains( data[i] ) ) {
				list.add(data[i]);
			}
		}
		
		int[] orderedList = new int[list.size()];
		for (int i = 0; i < list.size(); i++) 
			orderedList[i] = (int) list.get(i);
		
		return orderedList;
	}
	
}
